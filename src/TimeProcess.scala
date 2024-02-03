import scala.concurrent.duration.*
import TimeProcess.*

sealed trait TimeProcess:
  def tick(frameTimeInSeconds: Float): TimeProcess

  def finished(): Boolean

  def andThen(other: TimeProcess): TimeProcess =
    SequenceTimeProcesses(List(this, other))

  def concurrently(other: TimeProcess): TimeProcess =
    ConcurrentTimeProcesses(
      List(this, other)
    )

  def simplify(): Option[TimeProcess] =
    if this.finished() then None
    else
      this match
        case ConcurrentTimeProcesses(anims) =>
          val unfinished = anims.filterNot(_.finished())
          Option.when(unfinished.nonEmpty):
            val simplified = unfinished.flatMap(_.simplify())
            if simplified.length == 1 then simplified.head
            else ConcurrentTimeProcesses(simplified)
        case s: SimpleTimeProcess     => Some(s)
        case s: SequenceTimeProcesses => Some(s)

end TimeProcess

object TimeProcess:
  enum State:
    case Stop, Continue

  enum Tick:
    case SameFrame, NextFrame

  def apply(
      tickRate: FiniteDuration,
      name: String | Null = null
  )(f: Tick => State): TimeProcess =
    SimpleTimeProcess(
      tickRateInMillis = tickRate.toMillis,
      start = 0.0f,
      transition = f,
      state = State.Continue,
      name = Option(name)
    )

  private case class SequenceTimeProcesses(anims: List[TimeProcess])
      extends TimeProcess:
    override def tick(frameTimeInSeconds: Float): TimeProcess =
      anims match
        case head :: next =>
          if head.finished() then copy(anims = next).tick(frameTimeInSeconds)
          else copy(anims = head.tick(frameTimeInSeconds) :: next)

        case Nil => this

    override def finished(): Boolean =
      anims.isEmpty ||
        anims.forall: anim =>
          anim.finished()
  end SequenceTimeProcesses

  private case class ConcurrentTimeProcesses(anims: List[TimeProcess])
      extends TimeProcess:
    override def tick(frameTimeInSeconds: Float): TimeProcess =
      copy(anims = anims.map(_.tick(frameTimeInSeconds)))

    override def finished(): Boolean =
      anims.forall: anim =>
        anim.finished()

  private case class SimpleTimeProcess(
      tickRateInMillis: Float,
      start: Float,
      transition: Tick => State,
      state: State,
      name: Option[String]
  ) extends TimeProcess:
    def tick(frameTimeInSeconds: Float): TimeProcess =
      if finished() then this
      else
        val newStart = start + frameTimeInSeconds * 1000
        if newStart >= tickRateInMillis then
          val state = transition(Tick.NextFrame)
          copy(start = 0.0f, state = state)
        else
          val state = transition(Tick.SameFrame)
          copy(start = newStart, state = state)

    def finished() = state == State.Stop

    override def toString(): String =
      val label = name.getOrElse("<unnamed>")
      val text = if finished() then "stopped" else "running"
      s"Simple[$label: $text]"
  end SimpleTimeProcess

end TimeProcess
