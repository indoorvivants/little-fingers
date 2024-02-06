object Animations:
  import TimeProcess.{State, Tick}

  def frameTracker(
      i: Int => State
  ): Tick => State =
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
      i: Int => State
  ): Tick => State =
    var frameCnt = 0
    tick =>
      if frameCnt >= frames then State.Stop
      else
        tick match
          case Tick.SameFrame =>
            i(frameCnt)
          case Tick.NextFrame =>
            frameCnt += 1
            i(frameCnt)
  end limitedFrameTracker

  def ticker(i: => Unit): Tick => State =
    tick =>
      tick match
        case Tick.NextFrame =>
          i
          State.Continue
        case _ => State.Continue
end Animations
