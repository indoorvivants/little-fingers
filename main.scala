import raylib.all.*
import scalanative.unsafe.*
import scalanative.unsigned.*
import scala.concurrent.duration.*
import scala.collection.immutable.Queue

@main def hello =
  val screenWidth = 800
  val screenHeight = 450
  val FPS = 60

  InitWindow(screenWidth, screenHeight, c"Little Fingers")

  SetTargetFPS(FPS)

  zone:
    val colors = Colors()

    var state = Game(colors = colors)

    update(
      _.copy(log =
        Option(
          Animation(1.second)(
            Animations.ticker(scribe.info(state.toString))
          )
        )
      )
    )

    def update(f: Game => Game) =
      state = f(state)
      state

    while !WindowShouldClose() do
      BeginDrawing()

      ClearBackground(colors.BEIGE)

      update(
        _.handleKeys(() => GetKeyPressed())
          .pickNextLetterFromQueue()
          .draw(GetFrameTime())
      )

      EndDrawing()
    end while

  CloseWindow()
end hello
