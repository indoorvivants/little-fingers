import raylib.*
import scalanative.unsafe.*
import scalanative.unsigned.*
import scala.concurrent.duration.*
import scala.collection.immutable.Queue

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
