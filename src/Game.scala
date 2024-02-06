import raylib.*
import scalanative.unsafe.*
import scala.concurrent.duration.*
import scala.collection.immutable.Queue
import scala.util.Random

case class Game(
    letterAnimations: Option[TimeProcess] = None,
    lettersQueue: Queue[Char] = Queue.empty,
    log: Option[TimeProcess] = None,
    start: Float = 0.0f,
    colors: Colors,
    window: Window
)(using Zone):
  import colors.*
  private val CLEANUP_PERIOD = 1.second

  // once every `CLEANUP_PERIOD` we would like to simplify the animation
  // tree, to make sure there are no dangling non-running processes
  private def simplifyMaybe(o: TimeProcess): Option[TimeProcess] =
    if start > CLEANUP_PERIOD.toSeconds then o.simplify() else Some(o)

  /** This is the main method that advances all time processes in the game, and
    * modifies internal state w.r.t. human input
    *
    * @param frameTimeInSeconds
    *   time to advance by
    * @return
    */
  def tick(frameTimeInSeconds: Float): Game =
    tickAnimations(frameTimeInSeconds)
      .handleKeys()
      .pickNextLetterFromQueue()
      .tickAhead(frameTimeInSeconds)
      .simplifyAnimations()
  end tick

  /** Advances all running animations (if any) by the given frame time. Also
    * advances the logger time process
    *
    * @param frameTimeInSeconds
    * @return
    */
  def tickAnimations(frameTimeInSeconds: Float) =
    copy(
      letterAnimations = letterAnimations.map(_.tick(frameTimeInSeconds)),
      log = log.map(_.tick(frameTimeInSeconds))
    )
  end tickAnimations

  /** Advances internal clock of the game state, responsible for scheduling
    * periodic cleanup of dangling animations
    *
    * @param frameTimeInSeconds
    * @return
    */
  def tickAhead(frameTimeInSeconds: Float) =
    copy(
      start = start + frameTimeInSeconds
    )

  def simplifyAnimations() =
    copy(letterAnimations = letterAnimations.flatMap(simplifyMaybe))

  /** This method reads up the entire queue of keys backed up by Raylib ,
    * chooses only letters, and adds them to internal queue. The queue is
    * drained on every call (this is probably not necessary, but the method is
    * cheap
    *
    * @return
    */
  def handleKeys(): Game =
    var lastKey = 0
    inline def get() =
      val tmp = window.getRawKey()
      if tmp != 0 then lastKey = tmp
      tmp

    val chars = List.newBuilder[Char]
    var hasAny = false

    while get() != 0 do
      if (lastKey >= 'A' && lastKey <= 'Z') || (lastKey >= '0' && lastKey <= '9')
      then
        chars += lastKey.toChar
        hasAny = true

    when(hasAny):
      copy(lettersQueue = lettersQueue.appendedAll(chars.result()))

  end handleKeys

  /** This method picks the next letter from the queue and schedules the POW
    * animation and the letter animation
    *
    * @return
    */
  def pickNextLetterFromQueue(): Game =
    when(lettersQueue.dequeueOption): (nextChar, rest) =>
      val nextLetterAnimation = letterAnimation(nextChar)

      val animations =
        letterAnimations
          .map(_.concurrently(nextLetterAnimation))
          .orElse(Some(nextLetterAnimation))

      copy(
        letterAnimations = animations,
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

  /** Constructs a time process representing the animation of a letter appearing
    *
    * @param letter
    *   letter to appear
    * @return
    */
  private def letterAnimation(letter: Char): TimeProcess =
    val cstr = toCString(letter.toString())

    val numFrames = 100f

    // Initial coordinates where the letter should be placed
    val baseX = Random.nextInt(window.getWidth())
    val baseY = Random.nextInt(window.getHeight())

    val baseOpacity = 128

    inline def randByte = Random.nextInt(0xff)

    val color = make(randByte, randByte, randByte, baseOpacity)

    val ticker = Animations.limitedFrameTracker(100): frame =>
      val fontSize = frame * 5 + 30

      // We measure the size of the letter if it were to be rendered with the given font size,
      // and then use those dimensions to adjust the center point
      window.sideEffect:
        val textSize = MeasureTextEx(font, cstr, fontSize, 0)
        val halfWidth = textSize.x.toInt / 2
        val halfHeight = textSize.y.toInt / 2
        DrawText(
          cstr,
          (baseX - halfWidth).max(halfWidth).min(window.getWidth()),
          (baseY - halfHeight).max(halfHeight).min(window.getHeight()),
          fontSize,
          LIGHTGRAY
        )

        val radius = textSize.x max textSize.y

        val opacity = baseOpacity - baseOpacity * (frame / numFrames)

        UnsignedMadness:
          (!color).a = opacity.toByte

        DrawCircle(
          baseX,
          baseY,
          radius,
          color
        )

      TimeProcess.State.Continue

    TimeProcess(5.millis, s"letter $letter")(ticker)

  end letterAnimation

end Game
