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

  Zone:
    val colors = Colors()

    val window = Window.Raylib
    var gameState = Game(colors = colors, window = window)

    inline def updateGame(f: Game => Game) =
      gameState = f(gameState)
      gameState

    import colors.*

    val printState =
      TimeProcess(1.second, "log state")(
        Animations.ticker(scribe.info(gameState.toString))
      )

    val logScreenSize =
      TimeProcess(1.second, "log screen size")(
        Animations.ticker(
          scribe.info(
            s"Screen: ${window.getWidth()}, ${window.getHeight()}"
          )
        )
      )

    updateGame(
      _.copy(log = Some(printState.concurrently(logScreenSize)))
    )

    val checkedBackground: Texture = checkeredBackgroundTexture(
      screenWidth = ScreenWidth,
      screenHeight = ScreenHeight,
      colors = colors
    )

    while !WindowShouldClose() do

      BeginDrawing()
      DrawFPS(ScreenWidth - 50, ScreenHeight - 50)
      DrawTexturePro(
        checkedBackground,
        !Rectangle(
          0,
          0,
          checkedBackground.width.toFloat,
          checkedBackground.height.toFloat
        ),
        !Rectangle(0, 0, GetScreenWidth(), GetScreenHeight()),
        !Vector2(0, 0),
        0,
        !WHITE
      )

      updateGame(
        _.tick(GetFrameTime())
      )

      EndDrawing()

    end while

    UnloadTexture(checkedBackground)

    CloseWindow()
end hello
