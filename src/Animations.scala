object Animations:
  import TimeProcess.{State, Tick}

  def frameTracker(
      i: Int => TimeProcess.State
  ): Tick => TimeProcess.State =
    var state = 0
    tick =>
      tick match
        case Tick.SameFrame =>
          i(state)
        case Tick.NextFrame =>
          state += 1
          i(state)
  end frameTracker

  def limitedFrameTracker(frames: Int)(
      i: Int => TimeProcess.State
  ): Tick => TimeProcess.State =
    var frameCnt = 0
    tick =>
      if frameCnt >= frames then TimeProcess.State.Stop
      else
        tick match
          case Tick.SameFrame =>
            i(frameCnt)
          case Tick.NextFrame =>
            frameCnt += 1
            i(frameCnt)
  end limitedFrameTracker

  def ticker(i: => Unit): Tick => TimeProcess.State =
    tick =>
      tick match
        case Tick.NextFrame =>
          i
          TimeProcess.State.Continue
        case _ => TimeProcess.State.Continue
end Animations
