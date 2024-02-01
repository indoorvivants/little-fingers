import raylib.*
import scalanative.unsafe.*
import scalanative.unsigned.*
import scala.concurrent.duration.*
import scala.collection.immutable.Queue

@main def hello =
  val FPS = 60

  var screenWidth = 1280
  var screenHeight = 720

  val flags = ConfigFlags.FLAG_WINDOW_RESIZABLE | ConfigFlags.FLAG_VSYNC_HINT

  SetConfigFlags(flags.value)

  InitWindow(screenWidth, screenHeight, c"Little Fingers")

  MaximizeWindow()

  SetTargetFPS(FPS)

  zone:
    val colors = Colors()

    var state = Game(colors = colors, window = Window.Raylib)

    def update(f: Game => Game) =
      state = f(state)
      state

    import colors.*

    val renderTexture = RenderTexture()

    LoadRenderTexture(screenWidth, screenHeight)(renderTexture)

    update(
      _.copy(log =
        Option(
          TimeProcess(1.second, "log state")(
            Animations.ticker(scribe.info(state.toString))
          ).concurrently(
            TimeProcess(1.second, "log screen size")(
              Animations.ticker(
                scribe.info(
                  s"Screen: ${GetScreenWidth()}, ${GetScreenHeight()}"
                )
              )
            )
          )
        )
      )
    )

    val checked = checkeredBackgroundTexture(
      screenWidth = screenWidth,
      screenHeight = screenHeight,
      colors = colors
    )

    BeginTextureMode(renderTexture)
    ClearBackground(WHITE)
    DrawTexture(
      checked,
      0,
      0,
      Fade(WHITE, 0.5f)
    )
    EndTextureMode()

    inline def ptr[T: Tag](inline value: T): Ptr[T] =
      val p = stackalloc[T](1)
      !p = value
      p

    while !WindowShouldClose() do

      BeginDrawing()
      DrawFPS(screenWidth - 50, screenHeight - 50)
      DrawTexturePro(
        ptr(checked),
        Rectangle(
          0,
          0,
          (!renderTexture).texture.width.toFloat,
          (!renderTexture).texture.height.toFloat
        ),
        Rectangle(0, 0, GetScreenWidth(), GetScreenHeight()),
        Vector2(0, 0),
        0,
        WHITE
      )
      update(
        _.tick(GetFrameTime())
      )
      EndDrawing()

    end while

    UnloadRenderTexture(renderTexture)
    UnloadTexture(checked)

    CloseWindow()
end hello
