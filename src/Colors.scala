import scalanative.unsafe.*
import raylib.*

class Colors(using Zone):
  inline def make(r: Int, g: Int, b: Int, alpha: Int = 255) =
    UnsignedMadness(Color(r.toByte, g.toByte, b.toByte, alpha.toByte))

  val LIGHTGRAY = make(100, 100, 100)
  val GRAY = make(130, 130, 130, 255) // Gray
  val DARKGRAY = make(80, 80, 80, 255) // Dark Gray
  val YELLOW = make(253, 249, 0, 255) // Yellow
  val GOLD = make(255, 203, 0, 255) // Gold
  val ORANGE = make(255, 161, 0, 255) // Orange
  val PINK = make(255, 109, 194, 255) // Pink
  val RED = make(230, 41, 55, 255) // Red
  val MAROON = make(190, 33, 55, 255) // Maroon
  val GREEN = make(0, 228, 48, 255) // Green
  val LIME = make(0, 158, 47, 255) // Lime
  val DARKGREEN = make(0, 117, 44, 255) // Dark Green
  val SKYBLUE = make(102, 191, 255, 255) // Sky Blue
  val BLUE = make(0, 121, 241, 255) // Blue
  val DARKBLUE = make(0, 82, 172, 255) // Dark Blue
  val PURPLE = make(200, 122, 255, 255) // Purple
  val VIOLET = make(135, 60, 190, 255) // Violet
  val DARKPURPLE = make(112, 31, 126, 255) // Dark Purple
  val BEIGE = make(211, 176, 131, 255) // Beige
  val BROWN = make(127, 106, 79, 255) // Brown
  val DARKBROWN = make(76, 63, 47, 255) // Dark Brown
  val WHITE = make(255, 255, 255, 255) // White
  val BLACK = make(0, 0, 0, 255) // Black
  val BLANK = make(0, 0, 0, 0) // Blank (Transparent)
  val MAGENTA = make(255, 0, 255, 255) // Magenta
  val RAYWHITE = make(245, 245, 245, 255) // My own White (raylib logo)
end Colors
