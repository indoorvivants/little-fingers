import raylib.all.*

trait Window:
  def getHeight(): Int
  def getWidth(): Int
  def getRawKey(): Int
  def sideEffect[A](f: => A): Unit

object Window:
  val Raylib = new Window:
    override def getHeight(): Int = GetScreenHeight()
    override def getWidth(): Int = GetScreenWidth()
    override def getRawKey(): Int = GetKeyPressed()
    override def sideEffect[A](f: => A): Unit = f
    override def toString(): String = "Window[Raylib APIs]"
