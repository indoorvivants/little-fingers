import raylib.all.*
import scalanative.unsafe.*
import scalanative.unsigned.*
import scala.concurrent.duration.*
import scala.collection.immutable.Queue

case class GameState(
    anim: Option[Animation] = None,
    lettersQueue: Queue[Char] = Queue.empty,
    log: Option[Animation] = None
)(using Zone):
  def draw(frameTimeInSeconds: Float): GameState =
    val cstr = toCString(lettersQueue.mkString(", "))

    DrawText(
      cstr,
      50,
      20,
      20,
      LIGHTGRAY
    )
    copy(
      anim = anim.map(_.draw(frameTimeInSeconds)),
      log = log.map(_.draw(frameTimeInSeconds))
    )
  end draw

  def handleKeys(getKey: () => Int) =
    var lastKey = 0
    inline def get() =
      val tmp = getKey()
      if tmp != 0 then lastKey = tmp
      tmp

    val bld = List.newBuilder[Char]
    var hasAny = false

    while get() != 0 do
      if lastKey >= 'A' && lastKey <= 'Z' then
        bld += lastKey.toChar
        hasAny = true

    when(hasAny):
      copy(lettersQueue = lettersQueue.appendedAll(bld.result()))

  end handleKeys

  def pickNextLetterFromQueue() =
    when(lettersQueue.nonEmpty):
      when(anim.exists(_.finished()) || anim.isEmpty):
        val (nextChar, rest) = lettersQueue.dequeue

        copy(
          anim = Some(letterAnimation(nextChar)),
          lettersQueue = rest
        )

  private def when(cond: Boolean)(f: => GameState) =
    if cond then f else this

  private def letterAnimation(letter: Char) =
    val cstr = toCString(letter.toString())

    val ticker = Animations.limitedFrameTracker(10): frame =>
      DrawText(
        cstr,
        190,
        200,
        frame * 7 + 20,
        LIGHTGRAY
      )
      AnimationState.Continue

    Animation(0.3.seconds)(ticker)
  end letterAnimation

  val WHITE =
    UnsignedMadness(Color(255.toByte, 255.toByte, 255.toByte, 255.toByte))

  val LIGHTGRAY =
    UnsignedMadness(Color(100.toByte, 100.toByte, 100.toByte, 255.toByte))

end GameState

@main def hello =
  val screenWidth = 800
  val screenHeight = 450
  val FPS = 60

  InitWindow(screenWidth, screenHeight, c"Little Fingers")

  SetTargetFPS(FPS)

  zone:
    val WHITE =
      UnsignedMadness(Color(255.toByte, 255.toByte, 255.toByte, 255.toByte))

    val LIGHTGRAY =
      UnsignedMadness(Color(100.toByte, 100.toByte, 100.toByte, 255.toByte))

    var state = GameState()

    update(
      _.copy(log =
        Option(
          Animation(1.second)(
            Animations.ticker(scribe.info(state.toString))
          )
        )
      )
    )

    def update(f: GameState => GameState) =
      state = f(state)
      state

    while !WindowShouldClose() do
      BeginDrawing()

      ClearBackground(WHITE)

      update(
        _.handleKeys(() => GetKeyPressed())
          .pickNextLetterFromQueue()
          .draw(GetFrameTime())
      )

      EndDrawing()
    end while

  CloseWindow()
end hello

case class Animation private (
    tickRateInMillis: Float,
    start: Float,
    f: AnimationTick => AnimationState,
    state: AnimationState
):
  def draw(frameTimeInSeconds: Float): Animation =
    if finished() then this
    else
      val newStart = start + frameTimeInSeconds * 1000
      if newStart >= tickRateInMillis then
        // val newFraming = AnimationTick(startFrame, startFrame + 1) //startFrame + 1
        val state = f(AnimationTick.NextFrame)
        copy(start = 0.0f, state = state)
      else
        val state = f(AnimationTick.SameFrame)
        copy(start = newStart, state = state)

  def finished() = state == AnimationState.Stop
end Animation

enum AnimationTick:
  case SameFrame, NextFrame

enum AnimationState:
  case Stop, Continue

object Animations:

  def frameTracker(
      i: Int => AnimationState
  ): AnimationTick => AnimationState =
    var state = 0
    tick =>
      tick match
        case AnimationTick.SameFrame =>
          i(state)
        case AnimationTick.NextFrame =>
          state += 1
          i(state)
  end frameTracker

  def limitedFrameTracker(frames: Int)(
      i: Int => AnimationState
  ): AnimationTick => AnimationState =
    var frameCnt = 0
    tick =>
      if frameCnt >= frames then AnimationState.Stop
      else
        tick match
          case AnimationTick.SameFrame =>
            i(frameCnt)
          case AnimationTick.NextFrame =>
            frameCnt += 1
            i(frameCnt)
  end limitedFrameTracker

  def ticker(i: => Unit): AnimationTick => AnimationState =
    tick =>
      tick match
        case AnimationTick.NextFrame =>
          i
          AnimationState.Continue
        case _ => AnimationState.Continue
end Animations

object Animation:
  def apply(tickRate: FiniteDuration)(f: AnimationTick => AnimationState) =
    new Animation(
      tickRateInMillis = tickRate.toMillis / 1000f,
      start = 0.0f,
      f,
      AnimationState.Continue
    )

end Animation
