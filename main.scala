import raylib.all.*
import scalanative.unsafe.*
import scalanative.unsigned.*
import scala.concurrent.duration.*
import scala.collection.immutable.Queue

@main def hello =
  val FPS = 60

  val screenWidth = 1280
  val screenHeight = 720

  InitWindow(screenWidth, screenHeight, c"Little Fingers")

  SetTargetFPS(FPS)

  MaximizeWindow()

  ToggleFullscreen()

  zone:
    val colors = Colors()
    val screenWidth = GetScreenWidth()
    val screenHeight = GetScreenHeight()

    var state = Game(colors = colors, window = Window.Raylib)

    def update(f: Game => Game) =
      state = f(state)
      state

    import colors.*

    update(
      _.copy(log =
        Option(
          Animation(1.second)(
            Animations.ticker(scribe.info(state.toString))
          )
        )
      )
    )

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

    while !WindowShouldClose() do
      BeginDrawing()

      ClearBackground(colors.WHITE)

      DrawTexture(
        checked,
        GetScreenWidth() / 2 - checked.width / 2,
        GetScreenHeight() / 2 - checked.height / 2,
        Fade(WHITE, 0.5f)
      )

      DrawFPS(screenWidth - 50, screenHeight - 50)

      update(
        _.handleKeys(() => GetKeyPressed())
          .pickNextLetterFromQueue()
          .draw(GetFrameTime())
      )

      EndDrawing()
    end while

  CloseWindow()
end hello
