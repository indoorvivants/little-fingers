import raylib.all.*
import scalanative.unsafe.*
import scalanative.unsigned.*
import scala.concurrent.duration.*
import scala.collection.immutable.Queue

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
        val state = f(AnimationTick.NextFrame)
        copy(start = 0.0f, state = state)
      else
        val state = f(AnimationTick.SameFrame)
        copy(start = newStart, state = state)

  def finished() = state == AnimationState.Stop
end Animation

object Animation:
  def apply(tickRate: FiniteDuration)(f: AnimationTick => AnimationState) =
    new Animation(
      tickRateInMillis = tickRate.toMillis,
      start = 0.0f,
      f,
      AnimationState.Continue
    )
end Animation