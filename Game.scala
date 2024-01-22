import raylib.all.*
import scalanative.unsafe.*
import scalanative.unsigned.*
import scala.concurrent.duration.*
import scala.collection.immutable.Queue

case class Ticker private (
    period: FiniteDuration,
    f: Game => Game,
    start: Float
):
  def tick(frameTimeInSeconds: Float, game: Game) =
    copy(start = start + frameTimeInSeconds)

case class Game(
    centerLetterAnimation: Option[Animation] = None,
    lettersQueue: Queue[Char] = Queue.empty,
    log: Option[Animation] = None,
    backgroundAnimation: Option[Animation] = None,
    start: Float = 0.0f,
    colors: Colors,
    window: Window
)(using Zone):
  import colors.*
  private val CLEANUP_PERIOD = 1.second

  private def simplifyMaybe(o: Animation): Option[Animation] =
    if start > CLEANUP_PERIOD.toSeconds then o.simplify() else Some(o)

  def draw(frameTimeInSeconds: Float): Game =
    val cstr = toCString(lettersQueue.mkString(", "))

    val newStart = start + frameTimeInSeconds

    DrawText(
      cstr,
      50,
      20,
      20,
      RED
    )

    copy(
      centerLetterAnimation = centerLetterAnimation
        .map(_.draw(frameTimeInSeconds))
        .flatMap(simplifyMaybe),
      backgroundAnimation = backgroundAnimation
        .map(_.draw(frameTimeInSeconds))
        .flatMap(simplifyMaybe),
      log = log.map(_.draw(frameTimeInSeconds)),
      start = newStart
    )
  end draw

  def handleKeys(getRawKey: () => Int) =
    var lastKey = 0
    inline def get() =
      val tmp = getRawKey()
      if tmp != 0 then lastKey = tmp
      tmp

    val chars = List.newBuilder[Char]
    var hasAny = false

    while get() != 0 do
      if lastKey >= 'A' && lastKey <= 'Z' then
        chars += lastKey.toChar
        hasAny = true

    when(hasAny):
      copy(lettersQueue = lettersQueue.appendedAll(chars.result()))

  end handleKeys

  def pickNextLetterFromQueue() =
    when(lettersQueue.dequeueOption): (nextChar, rest) =>
      when(
        centerLetterAnimation.exists(
          _.finished()
        ) || centerLetterAnimation.isEmpty
      ):
        copy(
          centerLetterAnimation = Some(letterAnimation(nextChar)),
          backgroundAnimation = backgroundAnimation
            .map(_.concurrently(powAnimation))
            .orElse(
              Some(
                powAnimation
              )
            ),
          lettersQueue = rest
        )

  private def when(cond: Boolean)(f: => Game): Game =
    if cond then f else this

  private def when[T](cond: Option[T])(f: T => Game): Game =
    cond match
      case None => this
      case Some(value) =>
        f(value)

  private val font = GetFontDefault()

  private def letterAnimation(letter: Char): Animation =
    val cstr = toCString(letter.toString())

    val numFrames = 100f

    val ticker = Animations.limitedFrameTracker(20): frame =>
      val fontSize = frame * 5 + 30
      val rWidth = MeasureTextEx(font, cstr, fontSize, 0)
      DrawText(
        cstr,
        window.getWidth() / 2 - rWidth.x.toInt / 2,
        window.getHeight() / 2 - rWidth.y.toInt / 2,
        fontSize,
        LIGHTGRAY
      )
      AnimationState.Continue

    Animation(5.millis)(ticker)

  end letterAnimation

  private val powAnimation =
    val baseOpacity = 128
    val color = make(0x00, 0x66, 0x99, baseOpacity)
    val text = c"O"
    val numFrames = 100f

    val ticker = Animations.limitedFrameTracker(numFrames.toInt): frame =>
      val fontSize = frame * 5 + 100
      val rWidth = MeasureTextEx(font, text, fontSize, 0)
      val opacity = baseOpacity - baseOpacity * (frame / numFrames)
      UnsignedMadness:
        (!color).a = opacity.toByte

      DrawText(
        text,
        window.getWidth() / 2 - rWidth.x.toInt / 2,
        window.getHeight() / 2 - rWidth.y.toInt / 2,
        fontSize,
        color
      )
      AnimationState.Continue

    Animation(5.millis)(ticker)
  end powAnimation

end Game
