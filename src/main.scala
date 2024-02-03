import raylib.*
import scalanative.unsafe.*
import scalanative.unsigned.*
import scala.concurrent.duration.*

val FPS = 60
val ScreenWidth = 1280
val ScreenHeight = 720

@main def hello =
  val flags = ConfigFlags.FLAG_WINDOW_RESIZABLE | ConfigFlags.FLAG_VSYNC_HINT

  SetConfigFlags(flags.value)

  InitWindow(ScreenWidth, ScreenHeight, c"Little Fingers")

  MaximizeWindow()

  SetTargetFPS(FPS)

  SetExitKey(-1)

  zone:
    val colors = Colors()

    var state = Game(colors = colors, window = Window.Raylib)

    def update(f: Game => Game) =
      state = f(state)
      state

    import colors.*

    val renderTexture = RenderTexture()

    LoadRenderTexture(ScreenWidth, ScreenHeight)(renderTexture)

    val printState =
      TimeProcess(1.second, "log state")(
        Animations.ticker(scribe.info(state.toString))
      )

    val logScreenSize =
      TimeProcess(1.second, "log screen size")(
        Animations.ticker(
          scribe.info(
            s"Screen: ${GetScreenWidth()}, ${GetScreenHeight()}"
          )
        )
      )

    update(
      _.copy(log = Some(printState.concurrently(logScreenSize)))
    )

    val checkedBackground = checkeredBackgroundTexture(
      screenWidth = ScreenWidth,
      screenHeight = ScreenHeight,
      colors = colors
    )

    inline def ptr[T: Tag](inline value: T): Ptr[T] =
      val p = stackalloc[T](1)
      !p = value
      p

    while !WindowShouldClose() do

      BeginDrawing()
      DrawFPS(ScreenWidth - 50, ScreenHeight - 50)
      DrawTexturePro(
        ptr(checkedBackground),
        Rectangle(
          0,
          0,
          checkedBackground.width.toFloat,
          checkedBackground.height.toFloat
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

    UnloadTexture(checkedBackground)

    CloseWindow()
end hello
