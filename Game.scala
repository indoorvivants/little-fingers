import raylib.all.*
import scalanative.unsafe.*
import scalanative.unsigned.*
import scala.concurrent.duration.*
import scala.collection.immutable.Queue

case class Game(
    centerLetterAnimation: Option[Animation] = None,
    lettersQueue: Queue[Char] = Queue.empty,
    log: Option[Animation] = None,
    colors: Colors
)(using Zone):
  import colors.*
  def draw(frameTimeInSeconds: Float): Game =
    val cstr = toCString(lettersQueue.mkString(", "))

    DrawText(
      cstr,
      50,
      20,
      20,
      RED
    )
    copy(
      centerLetterAnimation = centerLetterAnimation.map(_.draw(frameTimeInSeconds)),
      log = log.map(_.draw(frameTimeInSeconds))
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
      when(centerLetterAnimation.exists(_.finished()) || centerLetterAnimation.isEmpty):
        copy(
          centerLetterAnimation = Some(letterAnimation(nextChar)),
          lettersQueue = rest
        )

  private def when(cond: Boolean)(f: => Game) =
    if cond then f else this

  private def when[T](cond: Option[T])(f: T => Game) =
    cond match
      case None => this
      case Some(value) =>
        f(value)

  private def letterAnimation(letter: Char) =
    val cstr = toCString(letter.toString())

    val ticker = Animations.limitedFrameTracker(50): frame =>
      DrawText(
        cstr,
        190,
        200,
        frame * 2 + 30,
        LIGHTGRAY
      )
      AnimationState.Continue

    Animation(20.millis)(ticker)
  end letterAnimation

end Game
