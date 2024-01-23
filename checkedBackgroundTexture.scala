import scalanative.unsafe.*
import raylib.all.*

def checkeredBackgroundTexture(
    screenWidth: Int,
    screenHeight: Int,
    colors: Colors
)(using
    Zone
) =
  import colors.*
  val pixels = alloc[Color](screenWidth * screenHeight)

  for
    y <- 0 until screenHeight
    x <- 0 until screenWidth
  do
    pixels(y * screenWidth + x) =
      if (x / 32 + y / 32) % 2 == 0 then !ORANGE
      else !GOLD

  val image =
    Image(
      pixels.asInstanceOf,
      screenWidth,
      screenHeight,
      1,
      PixelFormat.PIXELFORMAT_UNCOMPRESSED_R8G8B8A8.int
    )

  val checked = LoadTextureFromImage(image)
  UnloadImage(image)

  checked
end checkeredBackgroundTexture
