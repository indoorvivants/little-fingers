import raylib.all.*
import scalanative.unsafe.*
import scalanative.unsigned.*
import scala.concurrent.duration.*
import scala.collection.immutable.Queue
import Animation.*
import Animation.Attachment
import Animation.ConcurrentAnimations
import Animation.Simple

sealed trait Animation:
  def draw(frameTimeInSeconds: Float): Animation
  def finished(): Boolean
  def concurrently(other: Animation): Animation =
    ConcurrentAnimations(
      List(this, other)
    )

  def concurrentlyDetached(other: Animation): Animation =
    ConcurrentAnimations(
      List(this, other)
    )

  def simplify(): Option[Animation] =
    if this.finished() then None
    else
      this match
        case ConcurrentAnimations(anims) =>
          val unfinished = anims.filterNot(_.finished())
          Option.when(unfinished.nonEmpty):
            val simplified = unfinished.flatMap(_.simplify())
            if simplified.length == 1 then simplified.head
            else ConcurrentAnimations(simplified)
        case s: Simple => Some(s)

end Animation

object Animation:
  def apply(
      tickRate: FiniteDuration
  )(f: AnimationTick => AnimationState): Animation =
    Simple(
      tickRateInMillis = tickRate.toMillis,
      start = 0.0f,
      f,
      AnimationState.Continue
    )

  private enum Attachment:
    case Detached, Attached

  private case class ConcurrentAnimations(anims: List[Animation])
      extends Animation:
    override def draw(frameTimeInSeconds: Float): Animation =
      copy(anims = anims.map(_.draw(frameTimeInSeconds)))

    override def finished(): Boolean =
      anims.forall: anim =>
        anim.finished()

  private case class Simple(
      tickRateInMillis: Float,
      start: Float,
      f: AnimationTick => AnimationState,
      state: AnimationState
  ) extends Animation:
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
  end Simple

end Animation
