import raylib.all.*

trait Window:
  def getHeight(): Int
  def getWidth(): Int

object Window:
  val Raylib = new Window:
    override def getHeight(): Int = GetScreenHeight()
    override def getWidth(): Int = GetScreenWidth()
