package raylib

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[raylib] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
    inline def int: CInt = eq.apply(t).toInt
    inline def uint: CUnsignedInt = eq.apply(t)
    inline def value: CUnsignedInt = eq.apply(t)

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type BlendMode = CUnsignedInt
object BlendMode extends CEnumU[BlendMode]:
  given _tag: Tag[BlendMode] = Tag.UInt
  inline def define(inline a: Long): BlendMode = a.toUInt
  val BLEND_ALPHA = define(0)
  val BLEND_ADDITIVE = define(1)
  val BLEND_MULTIPLIED = define(2)
  val BLEND_ADD_COLORS = define(3)
  val BLEND_SUBTRACT_COLORS = define(4)
  val BLEND_ALPHA_PREMULTIPLY = define(5)
  val BLEND_CUSTOM = define(6)
  val BLEND_CUSTOM_SEPARATE = define(7)
  inline def getName(inline value: BlendMode): Option[String] =
    inline value match
      case BLEND_ALPHA             => Some("BLEND_ALPHA")
      case BLEND_ADDITIVE          => Some("BLEND_ADDITIVE")
      case BLEND_MULTIPLIED        => Some("BLEND_MULTIPLIED")
      case BLEND_ADD_COLORS        => Some("BLEND_ADD_COLORS")
      case BLEND_SUBTRACT_COLORS   => Some("BLEND_SUBTRACT_COLORS")
      case BLEND_ALPHA_PREMULTIPLY => Some("BLEND_ALPHA_PREMULTIPLY")
      case BLEND_CUSTOM            => Some("BLEND_CUSTOM")
      case BLEND_CUSTOM_SEPARATE   => Some("BLEND_CUSTOM_SEPARATE")
      case _                       => None
  extension (a: BlendMode)
    inline def &(b: BlendMode): BlendMode = a & b
    inline def |(b: BlendMode): BlendMode = a | b
    inline def is(b: BlendMode): Boolean = (a & b) == b
end BlendMode

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type CameraMode = CUnsignedInt
object CameraMode extends CEnumU[CameraMode]:
  given _tag: Tag[CameraMode] = Tag.UInt
  inline def define(inline a: Long): CameraMode = a.toUInt
  val CAMERA_CUSTOM = define(0)
  val CAMERA_FREE = define(1)
  val CAMERA_ORBITAL = define(2)
  val CAMERA_FIRST_PERSON = define(3)
  val CAMERA_THIRD_PERSON = define(4)
  inline def getName(inline value: CameraMode): Option[String] =
    inline value match
      case CAMERA_CUSTOM       => Some("CAMERA_CUSTOM")
      case CAMERA_FREE         => Some("CAMERA_FREE")
      case CAMERA_ORBITAL      => Some("CAMERA_ORBITAL")
      case CAMERA_FIRST_PERSON => Some("CAMERA_FIRST_PERSON")
      case CAMERA_THIRD_PERSON => Some("CAMERA_THIRD_PERSON")
      case _                   => None
  extension (a: CameraMode)
    inline def &(b: CameraMode): CameraMode = a & b
    inline def |(b: CameraMode): CameraMode = a | b
    inline def is(b: CameraMode): Boolean = (a & b) == b
end CameraMode

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type CameraProjection = CUnsignedInt
object CameraProjection extends CEnumU[CameraProjection]:
  given _tag: Tag[CameraProjection] = Tag.UInt
  inline def define(inline a: Long): CameraProjection = a.toUInt
  val CAMERA_PERSPECTIVE = define(0)
  val CAMERA_ORTHOGRAPHIC = define(1)
  inline def getName(inline value: CameraProjection): Option[String] =
    inline value match
      case CAMERA_PERSPECTIVE  => Some("CAMERA_PERSPECTIVE")
      case CAMERA_ORTHOGRAPHIC => Some("CAMERA_ORTHOGRAPHIC")
      case _                   => None
  extension (a: CameraProjection)
    inline def &(b: CameraProjection): CameraProjection = a & b
    inline def |(b: CameraProjection): CameraProjection = a | b
    inline def is(b: CameraProjection): Boolean = (a & b) == b
end CameraProjection

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type ConfigFlags = CUnsignedInt
object ConfigFlags extends CEnumU[ConfigFlags]:
  given _tag: Tag[ConfigFlags] = Tag.UInt
  inline def define(inline a: Long): ConfigFlags = a.toUInt
  val FLAG_VSYNC_HINT = define(64)
  val FLAG_FULLSCREEN_MODE = define(2)
  val FLAG_WINDOW_RESIZABLE = define(4)
  val FLAG_WINDOW_UNDECORATED = define(8)
  val FLAG_WINDOW_HIDDEN = define(128)
  val FLAG_WINDOW_MINIMIZED = define(512)
  val FLAG_WINDOW_MAXIMIZED = define(1024)
  val FLAG_WINDOW_UNFOCUSED = define(2048)
  val FLAG_WINDOW_TOPMOST = define(4096)
  val FLAG_WINDOW_ALWAYS_RUN = define(256)
  val FLAG_WINDOW_TRANSPARENT = define(16)
  val FLAG_WINDOW_HIGHDPI = define(8192)
  val FLAG_WINDOW_MOUSE_PASSTHROUGH = define(16384)
  val FLAG_BORDERLESS_WINDOWED_MODE = define(32768)
  val FLAG_MSAA_4X_HINT = define(32)
  val FLAG_INTERLACED_HINT = define(65536)
  inline def getName(inline value: ConfigFlags): Option[String] =
    inline value match
      case FLAG_VSYNC_HINT         => Some("FLAG_VSYNC_HINT")
      case FLAG_FULLSCREEN_MODE    => Some("FLAG_FULLSCREEN_MODE")
      case FLAG_WINDOW_RESIZABLE   => Some("FLAG_WINDOW_RESIZABLE")
      case FLAG_WINDOW_UNDECORATED => Some("FLAG_WINDOW_UNDECORATED")
      case FLAG_WINDOW_HIDDEN      => Some("FLAG_WINDOW_HIDDEN")
      case FLAG_WINDOW_MINIMIZED   => Some("FLAG_WINDOW_MINIMIZED")
      case FLAG_WINDOW_MAXIMIZED   => Some("FLAG_WINDOW_MAXIMIZED")
      case FLAG_WINDOW_UNFOCUSED   => Some("FLAG_WINDOW_UNFOCUSED")
      case FLAG_WINDOW_TOPMOST     => Some("FLAG_WINDOW_TOPMOST")
      case FLAG_WINDOW_ALWAYS_RUN  => Some("FLAG_WINDOW_ALWAYS_RUN")
      case FLAG_WINDOW_TRANSPARENT => Some("FLAG_WINDOW_TRANSPARENT")
      case FLAG_WINDOW_HIGHDPI     => Some("FLAG_WINDOW_HIGHDPI")
      case FLAG_WINDOW_MOUSE_PASSTHROUGH =>
        Some("FLAG_WINDOW_MOUSE_PASSTHROUGH")
      case FLAG_BORDERLESS_WINDOWED_MODE =>
        Some("FLAG_BORDERLESS_WINDOWED_MODE")
      case FLAG_MSAA_4X_HINT    => Some("FLAG_MSAA_4X_HINT")
      case FLAG_INTERLACED_HINT => Some("FLAG_INTERLACED_HINT")
      case _                    => None
  extension (a: ConfigFlags)
    inline def &(b: ConfigFlags): ConfigFlags = a & b
    inline def |(b: ConfigFlags): ConfigFlags = a | b
    inline def is(b: ConfigFlags): Boolean = (a & b) == b
end ConfigFlags

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type CubemapLayout = CUnsignedInt
object CubemapLayout extends CEnumU[CubemapLayout]:
  given _tag: Tag[CubemapLayout] = Tag.UInt
  inline def define(inline a: Long): CubemapLayout = a.toUInt
  val CUBEMAP_LAYOUT_AUTO_DETECT = define(0)
  val CUBEMAP_LAYOUT_LINE_VERTICAL = define(1)
  val CUBEMAP_LAYOUT_LINE_HORIZONTAL = define(2)
  val CUBEMAP_LAYOUT_CROSS_THREE_BY_FOUR = define(3)
  val CUBEMAP_LAYOUT_CROSS_FOUR_BY_THREE = define(4)
  val CUBEMAP_LAYOUT_PANORAMA = define(5)
  inline def getName(inline value: CubemapLayout): Option[String] =
    inline value match
      case CUBEMAP_LAYOUT_AUTO_DETECT   => Some("CUBEMAP_LAYOUT_AUTO_DETECT")
      case CUBEMAP_LAYOUT_LINE_VERTICAL => Some("CUBEMAP_LAYOUT_LINE_VERTICAL")
      case CUBEMAP_LAYOUT_LINE_HORIZONTAL =>
        Some("CUBEMAP_LAYOUT_LINE_HORIZONTAL")
      case CUBEMAP_LAYOUT_CROSS_THREE_BY_FOUR =>
        Some("CUBEMAP_LAYOUT_CROSS_THREE_BY_FOUR")
      case CUBEMAP_LAYOUT_CROSS_FOUR_BY_THREE =>
        Some("CUBEMAP_LAYOUT_CROSS_FOUR_BY_THREE")
      case CUBEMAP_LAYOUT_PANORAMA => Some("CUBEMAP_LAYOUT_PANORAMA")
      case _                       => None
  extension (a: CubemapLayout)
    inline def &(b: CubemapLayout): CubemapLayout = a & b
    inline def |(b: CubemapLayout): CubemapLayout = a | b
    inline def is(b: CubemapLayout): Boolean = (a & b) == b
end CubemapLayout

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type FontType = CUnsignedInt
object FontType extends CEnumU[FontType]:
  given _tag: Tag[FontType] = Tag.UInt
  inline def define(inline a: Long): FontType = a.toUInt
  val FONT_DEFAULT = define(0)
  val FONT_BITMAP = define(1)
  val FONT_SDF = define(2)
  inline def getName(inline value: FontType): Option[String] =
    inline value match
      case FONT_DEFAULT => Some("FONT_DEFAULT")
      case FONT_BITMAP  => Some("FONT_BITMAP")
      case FONT_SDF     => Some("FONT_SDF")
      case _            => None
  extension (a: FontType)
    inline def &(b: FontType): FontType = a & b
    inline def |(b: FontType): FontType = a | b
    inline def is(b: FontType): Boolean = (a & b) == b
end FontType

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type GamepadAxis = CUnsignedInt
object GamepadAxis extends CEnumU[GamepadAxis]:
  given _tag: Tag[GamepadAxis] = Tag.UInt
  inline def define(inline a: Long): GamepadAxis = a.toUInt
  val GAMEPAD_AXIS_LEFT_X = define(0)
  val GAMEPAD_AXIS_LEFT_Y = define(1)
  val GAMEPAD_AXIS_RIGHT_X = define(2)
  val GAMEPAD_AXIS_RIGHT_Y = define(3)
  val GAMEPAD_AXIS_LEFT_TRIGGER = define(4)
  val GAMEPAD_AXIS_RIGHT_TRIGGER = define(5)
  inline def getName(inline value: GamepadAxis): Option[String] =
    inline value match
      case GAMEPAD_AXIS_LEFT_X        => Some("GAMEPAD_AXIS_LEFT_X")
      case GAMEPAD_AXIS_LEFT_Y        => Some("GAMEPAD_AXIS_LEFT_Y")
      case GAMEPAD_AXIS_RIGHT_X       => Some("GAMEPAD_AXIS_RIGHT_X")
      case GAMEPAD_AXIS_RIGHT_Y       => Some("GAMEPAD_AXIS_RIGHT_Y")
      case GAMEPAD_AXIS_LEFT_TRIGGER  => Some("GAMEPAD_AXIS_LEFT_TRIGGER")
      case GAMEPAD_AXIS_RIGHT_TRIGGER => Some("GAMEPAD_AXIS_RIGHT_TRIGGER")
      case _                          => None
  extension (a: GamepadAxis)
    inline def &(b: GamepadAxis): GamepadAxis = a & b
    inline def |(b: GamepadAxis): GamepadAxis = a | b
    inline def is(b: GamepadAxis): Boolean = (a & b) == b
end GamepadAxis

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type GamepadButton = CUnsignedInt
object GamepadButton extends CEnumU[GamepadButton]:
  given _tag: Tag[GamepadButton] = Tag.UInt
  inline def define(inline a: Long): GamepadButton = a.toUInt
  val GAMEPAD_BUTTON_UNKNOWN = define(0)
  val GAMEPAD_BUTTON_LEFT_FACE_UP = define(1)
  val GAMEPAD_BUTTON_LEFT_FACE_RIGHT = define(2)
  val GAMEPAD_BUTTON_LEFT_FACE_DOWN = define(3)
  val GAMEPAD_BUTTON_LEFT_FACE_LEFT = define(4)
  val GAMEPAD_BUTTON_RIGHT_FACE_UP = define(5)
  val GAMEPAD_BUTTON_RIGHT_FACE_RIGHT = define(6)
  val GAMEPAD_BUTTON_RIGHT_FACE_DOWN = define(7)
  val GAMEPAD_BUTTON_RIGHT_FACE_LEFT = define(8)
  val GAMEPAD_BUTTON_LEFT_TRIGGER_1 = define(9)
  val GAMEPAD_BUTTON_LEFT_TRIGGER_2 = define(10)
  val GAMEPAD_BUTTON_RIGHT_TRIGGER_1 = define(11)
  val GAMEPAD_BUTTON_RIGHT_TRIGGER_2 = define(12)
  val GAMEPAD_BUTTON_MIDDLE_LEFT = define(13)
  val GAMEPAD_BUTTON_MIDDLE = define(14)
  val GAMEPAD_BUTTON_MIDDLE_RIGHT = define(15)
  val GAMEPAD_BUTTON_LEFT_THUMB = define(16)
  val GAMEPAD_BUTTON_RIGHT_THUMB = define(17)
  inline def getName(inline value: GamepadButton): Option[String] =
    inline value match
      case GAMEPAD_BUTTON_UNKNOWN      => Some("GAMEPAD_BUTTON_UNKNOWN")
      case GAMEPAD_BUTTON_LEFT_FACE_UP => Some("GAMEPAD_BUTTON_LEFT_FACE_UP")
      case GAMEPAD_BUTTON_LEFT_FACE_RIGHT =>
        Some("GAMEPAD_BUTTON_LEFT_FACE_RIGHT")
      case GAMEPAD_BUTTON_LEFT_FACE_DOWN =>
        Some("GAMEPAD_BUTTON_LEFT_FACE_DOWN")
      case GAMEPAD_BUTTON_LEFT_FACE_LEFT =>
        Some("GAMEPAD_BUTTON_LEFT_FACE_LEFT")
      case GAMEPAD_BUTTON_RIGHT_FACE_UP => Some("GAMEPAD_BUTTON_RIGHT_FACE_UP")
      case GAMEPAD_BUTTON_RIGHT_FACE_RIGHT =>
        Some("GAMEPAD_BUTTON_RIGHT_FACE_RIGHT")
      case GAMEPAD_BUTTON_RIGHT_FACE_DOWN =>
        Some("GAMEPAD_BUTTON_RIGHT_FACE_DOWN")
      case GAMEPAD_BUTTON_RIGHT_FACE_LEFT =>
        Some("GAMEPAD_BUTTON_RIGHT_FACE_LEFT")
      case GAMEPAD_BUTTON_LEFT_TRIGGER_1 =>
        Some("GAMEPAD_BUTTON_LEFT_TRIGGER_1")
      case GAMEPAD_BUTTON_LEFT_TRIGGER_2 =>
        Some("GAMEPAD_BUTTON_LEFT_TRIGGER_2")
      case GAMEPAD_BUTTON_RIGHT_TRIGGER_1 =>
        Some("GAMEPAD_BUTTON_RIGHT_TRIGGER_1")
      case GAMEPAD_BUTTON_RIGHT_TRIGGER_2 =>
        Some("GAMEPAD_BUTTON_RIGHT_TRIGGER_2")
      case GAMEPAD_BUTTON_MIDDLE_LEFT  => Some("GAMEPAD_BUTTON_MIDDLE_LEFT")
      case GAMEPAD_BUTTON_MIDDLE       => Some("GAMEPAD_BUTTON_MIDDLE")
      case GAMEPAD_BUTTON_MIDDLE_RIGHT => Some("GAMEPAD_BUTTON_MIDDLE_RIGHT")
      case GAMEPAD_BUTTON_LEFT_THUMB   => Some("GAMEPAD_BUTTON_LEFT_THUMB")
      case GAMEPAD_BUTTON_RIGHT_THUMB  => Some("GAMEPAD_BUTTON_RIGHT_THUMB")
      case _                           => None
  extension (a: GamepadButton)
    inline def &(b: GamepadButton): GamepadButton = a & b
    inline def |(b: GamepadButton): GamepadButton = a | b
    inline def is(b: GamepadButton): Boolean = (a & b) == b
end GamepadButton

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type Gesture = CUnsignedInt
object Gesture extends CEnumU[Gesture]:
  given _tag: Tag[Gesture] = Tag.UInt
  inline def define(inline a: Long): Gesture = a.toUInt
  val GESTURE_NONE = define(0)
  val GESTURE_TAP = define(1)
  val GESTURE_DOUBLETAP = define(2)
  val GESTURE_HOLD = define(4)
  val GESTURE_DRAG = define(8)
  val GESTURE_SWIPE_RIGHT = define(16)
  val GESTURE_SWIPE_LEFT = define(32)
  val GESTURE_SWIPE_UP = define(64)
  val GESTURE_SWIPE_DOWN = define(128)
  val GESTURE_PINCH_IN = define(256)
  val GESTURE_PINCH_OUT = define(512)
  inline def getName(inline value: Gesture): Option[String] =
    inline value match
      case GESTURE_NONE        => Some("GESTURE_NONE")
      case GESTURE_TAP         => Some("GESTURE_TAP")
      case GESTURE_DOUBLETAP   => Some("GESTURE_DOUBLETAP")
      case GESTURE_HOLD        => Some("GESTURE_HOLD")
      case GESTURE_DRAG        => Some("GESTURE_DRAG")
      case GESTURE_SWIPE_RIGHT => Some("GESTURE_SWIPE_RIGHT")
      case GESTURE_SWIPE_LEFT  => Some("GESTURE_SWIPE_LEFT")
      case GESTURE_SWIPE_UP    => Some("GESTURE_SWIPE_UP")
      case GESTURE_SWIPE_DOWN  => Some("GESTURE_SWIPE_DOWN")
      case GESTURE_PINCH_IN    => Some("GESTURE_PINCH_IN")
      case GESTURE_PINCH_OUT   => Some("GESTURE_PINCH_OUT")
      case _                   => None
  extension (a: Gesture)
    inline def &(b: Gesture): Gesture = a & b
    inline def |(b: Gesture): Gesture = a | b
    inline def is(b: Gesture): Boolean = (a & b) == b
end Gesture

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type KeyboardKey = CUnsignedInt
object KeyboardKey extends CEnumU[KeyboardKey]:
  given _tag: Tag[KeyboardKey] = Tag.UInt
  inline def define(inline a: Long): KeyboardKey = a.toUInt
  val KEY_NULL = define(0)
  val KEY_APOSTROPHE = define(39)
  val KEY_COMMA = define(44)
  val KEY_MINUS = define(45)
  val KEY_PERIOD = define(46)
  val KEY_SLASH = define(47)
  val KEY_ZERO = define(48)
  val KEY_ONE = define(49)
  val KEY_TWO = define(50)
  val KEY_THREE = define(51)
  val KEY_FOUR = define(52)
  val KEY_FIVE = define(53)
  val KEY_SIX = define(54)
  val KEY_SEVEN = define(55)
  val KEY_EIGHT = define(56)
  val KEY_NINE = define(57)
  val KEY_SEMICOLON = define(59)
  val KEY_EQUAL = define(61)
  val KEY_A = define(65)
  val KEY_B = define(66)
  val KEY_C = define(67)
  val KEY_D = define(68)
  val KEY_E = define(69)
  val KEY_F = define(70)
  val KEY_G = define(71)
  val KEY_H = define(72)
  val KEY_I = define(73)
  val KEY_J = define(74)
  val KEY_K = define(75)
  val KEY_L = define(76)
  val KEY_M = define(77)
  val KEY_N = define(78)
  val KEY_O = define(79)
  val KEY_P = define(80)
  val KEY_Q = define(81)
  val KEY_R = define(82)
  val KEY_S = define(83)
  val KEY_T = define(84)
  val KEY_U = define(85)
  val KEY_V = define(86)
  val KEY_W = define(87)
  val KEY_X = define(88)
  val KEY_Y = define(89)
  val KEY_Z = define(90)
  val KEY_LEFT_BRACKET = define(91)
  val KEY_BACKSLASH = define(92)
  val KEY_RIGHT_BRACKET = define(93)
  val KEY_GRAVE = define(96)
  val KEY_SPACE = define(32)
  val KEY_ESCAPE = define(256)
  val KEY_ENTER = define(257)
  val KEY_TAB = define(258)
  val KEY_BACKSPACE = define(259)
  val KEY_INSERT = define(260)
  val KEY_DELETE = define(261)
  val KEY_RIGHT = define(262)
  val KEY_LEFT = define(263)
  val KEY_DOWN = define(264)
  val KEY_UP = define(265)
  val KEY_PAGE_UP = define(266)
  val KEY_PAGE_DOWN = define(267)
  val KEY_HOME = define(268)
  val KEY_END = define(269)
  val KEY_CAPS_LOCK = define(280)
  val KEY_SCROLL_LOCK = define(281)
  val KEY_NUM_LOCK = define(282)
  val KEY_PRINT_SCREEN = define(283)
  val KEY_PAUSE = define(284)
  val KEY_F1 = define(290)
  val KEY_F2 = define(291)
  val KEY_F3 = define(292)
  val KEY_F4 = define(293)
  val KEY_F5 = define(294)
  val KEY_F6 = define(295)
  val KEY_F7 = define(296)
  val KEY_F8 = define(297)
  val KEY_F9 = define(298)
  val KEY_F10 = define(299)
  val KEY_F11 = define(300)
  val KEY_F12 = define(301)
  val KEY_LEFT_SHIFT = define(340)
  val KEY_LEFT_CONTROL = define(341)
  val KEY_LEFT_ALT = define(342)
  val KEY_LEFT_SUPER = define(343)
  val KEY_RIGHT_SHIFT = define(344)
  val KEY_RIGHT_CONTROL = define(345)
  val KEY_RIGHT_ALT = define(346)
  val KEY_RIGHT_SUPER = define(347)
  val KEY_KB_MENU = define(348)
  val KEY_KP_0 = define(320)
  val KEY_KP_1 = define(321)
  val KEY_KP_2 = define(322)
  val KEY_KP_3 = define(323)
  val KEY_KP_4 = define(324)
  val KEY_KP_5 = define(325)
  val KEY_KP_6 = define(326)
  val KEY_KP_7 = define(327)
  val KEY_KP_8 = define(328)
  val KEY_KP_9 = define(329)
  val KEY_KP_DECIMAL = define(330)
  val KEY_KP_DIVIDE = define(331)
  val KEY_KP_MULTIPLY = define(332)
  val KEY_KP_SUBTRACT = define(333)
  val KEY_KP_ADD = define(334)
  val KEY_KP_ENTER = define(335)
  val KEY_KP_EQUAL = define(336)
  val KEY_BACK = define(4)
  val KEY_MENU = define(82)
  val KEY_VOLUME_UP = define(24)
  val KEY_VOLUME_DOWN = define(25)
  inline def getName(inline value: KeyboardKey): Option[String] =
    inline value match
      case KEY_NULL          => Some("KEY_NULL")
      case KEY_APOSTROPHE    => Some("KEY_APOSTROPHE")
      case KEY_COMMA         => Some("KEY_COMMA")
      case KEY_MINUS         => Some("KEY_MINUS")
      case KEY_PERIOD        => Some("KEY_PERIOD")
      case KEY_SLASH         => Some("KEY_SLASH")
      case KEY_ZERO          => Some("KEY_ZERO")
      case KEY_ONE           => Some("KEY_ONE")
      case KEY_TWO           => Some("KEY_TWO")
      case KEY_THREE         => Some("KEY_THREE")
      case KEY_FOUR          => Some("KEY_FOUR")
      case KEY_FIVE          => Some("KEY_FIVE")
      case KEY_SIX           => Some("KEY_SIX")
      case KEY_SEVEN         => Some("KEY_SEVEN")
      case KEY_EIGHT         => Some("KEY_EIGHT")
      case KEY_NINE          => Some("KEY_NINE")
      case KEY_SEMICOLON     => Some("KEY_SEMICOLON")
      case KEY_EQUAL         => Some("KEY_EQUAL")
      case KEY_A             => Some("KEY_A")
      case KEY_B             => Some("KEY_B")
      case KEY_C             => Some("KEY_C")
      case KEY_D             => Some("KEY_D")
      case KEY_E             => Some("KEY_E")
      case KEY_F             => Some("KEY_F")
      case KEY_G             => Some("KEY_G")
      case KEY_H             => Some("KEY_H")
      case KEY_I             => Some("KEY_I")
      case KEY_J             => Some("KEY_J")
      case KEY_K             => Some("KEY_K")
      case KEY_L             => Some("KEY_L")
      case KEY_M             => Some("KEY_M")
      case KEY_N             => Some("KEY_N")
      case KEY_O             => Some("KEY_O")
      case KEY_P             => Some("KEY_P")
      case KEY_Q             => Some("KEY_Q")
      case KEY_R             => Some("KEY_R")
      case KEY_S             => Some("KEY_S")
      case KEY_T             => Some("KEY_T")
      case KEY_U             => Some("KEY_U")
      case KEY_V             => Some("KEY_V")
      case KEY_W             => Some("KEY_W")
      case KEY_X             => Some("KEY_X")
      case KEY_Y             => Some("KEY_Y")
      case KEY_Z             => Some("KEY_Z")
      case KEY_LEFT_BRACKET  => Some("KEY_LEFT_BRACKET")
      case KEY_BACKSLASH     => Some("KEY_BACKSLASH")
      case KEY_RIGHT_BRACKET => Some("KEY_RIGHT_BRACKET")
      case KEY_GRAVE         => Some("KEY_GRAVE")
      case KEY_SPACE         => Some("KEY_SPACE")
      case KEY_ESCAPE        => Some("KEY_ESCAPE")
      case KEY_ENTER         => Some("KEY_ENTER")
      case KEY_TAB           => Some("KEY_TAB")
      case KEY_BACKSPACE     => Some("KEY_BACKSPACE")
      case KEY_INSERT        => Some("KEY_INSERT")
      case KEY_DELETE        => Some("KEY_DELETE")
      case KEY_RIGHT         => Some("KEY_RIGHT")
      case KEY_LEFT          => Some("KEY_LEFT")
      case KEY_DOWN          => Some("KEY_DOWN")
      case KEY_UP            => Some("KEY_UP")
      case KEY_PAGE_UP       => Some("KEY_PAGE_UP")
      case KEY_PAGE_DOWN     => Some("KEY_PAGE_DOWN")
      case KEY_HOME          => Some("KEY_HOME")
      case KEY_END           => Some("KEY_END")
      case KEY_CAPS_LOCK     => Some("KEY_CAPS_LOCK")
      case KEY_SCROLL_LOCK   => Some("KEY_SCROLL_LOCK")
      case KEY_NUM_LOCK      => Some("KEY_NUM_LOCK")
      case KEY_PRINT_SCREEN  => Some("KEY_PRINT_SCREEN")
      case KEY_PAUSE         => Some("KEY_PAUSE")
      case KEY_F1            => Some("KEY_F1")
      case KEY_F2            => Some("KEY_F2")
      case KEY_F3            => Some("KEY_F3")
      case KEY_F4            => Some("KEY_F4")
      case KEY_F5            => Some("KEY_F5")
      case KEY_F6            => Some("KEY_F6")
      case KEY_F7            => Some("KEY_F7")
      case KEY_F8            => Some("KEY_F8")
      case KEY_F9            => Some("KEY_F9")
      case KEY_F10           => Some("KEY_F10")
      case KEY_F11           => Some("KEY_F11")
      case KEY_F12           => Some("KEY_F12")
      case KEY_LEFT_SHIFT    => Some("KEY_LEFT_SHIFT")
      case KEY_LEFT_CONTROL  => Some("KEY_LEFT_CONTROL")
      case KEY_LEFT_ALT      => Some("KEY_LEFT_ALT")
      case KEY_LEFT_SUPER    => Some("KEY_LEFT_SUPER")
      case KEY_RIGHT_SHIFT   => Some("KEY_RIGHT_SHIFT")
      case KEY_RIGHT_CONTROL => Some("KEY_RIGHT_CONTROL")
      case KEY_RIGHT_ALT     => Some("KEY_RIGHT_ALT")
      case KEY_RIGHT_SUPER   => Some("KEY_RIGHT_SUPER")
      case KEY_KB_MENU       => Some("KEY_KB_MENU")
      case KEY_KP_0          => Some("KEY_KP_0")
      case KEY_KP_1          => Some("KEY_KP_1")
      case KEY_KP_2          => Some("KEY_KP_2")
      case KEY_KP_3          => Some("KEY_KP_3")
      case KEY_KP_4          => Some("KEY_KP_4")
      case KEY_KP_5          => Some("KEY_KP_5")
      case KEY_KP_6          => Some("KEY_KP_6")
      case KEY_KP_7          => Some("KEY_KP_7")
      case KEY_KP_8          => Some("KEY_KP_8")
      case KEY_KP_9          => Some("KEY_KP_9")
      case KEY_KP_DECIMAL    => Some("KEY_KP_DECIMAL")
      case KEY_KP_DIVIDE     => Some("KEY_KP_DIVIDE")
      case KEY_KP_MULTIPLY   => Some("KEY_KP_MULTIPLY")
      case KEY_KP_SUBTRACT   => Some("KEY_KP_SUBTRACT")
      case KEY_KP_ADD        => Some("KEY_KP_ADD")
      case KEY_KP_ENTER      => Some("KEY_KP_ENTER")
      case KEY_KP_EQUAL      => Some("KEY_KP_EQUAL")
      case KEY_BACK          => Some("KEY_BACK")
      case KEY_MENU          => Some("KEY_MENU")
      case KEY_VOLUME_UP     => Some("KEY_VOLUME_UP")
      case KEY_VOLUME_DOWN   => Some("KEY_VOLUME_DOWN")
      case _                 => None
  extension (a: KeyboardKey)
    inline def &(b: KeyboardKey): KeyboardKey = a & b
    inline def |(b: KeyboardKey): KeyboardKey = a | b
    inline def is(b: KeyboardKey): Boolean = (a & b) == b
end KeyboardKey

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type MaterialMapIndex = CUnsignedInt
object MaterialMapIndex extends CEnumU[MaterialMapIndex]:
  given _tag: Tag[MaterialMapIndex] = Tag.UInt
  inline def define(inline a: Long): MaterialMapIndex = a.toUInt
  val MATERIAL_MAP_ALBEDO = define(0)
  val MATERIAL_MAP_METALNESS = define(1)
  val MATERIAL_MAP_NORMAL = define(2)
  val MATERIAL_MAP_ROUGHNESS = define(3)
  val MATERIAL_MAP_OCCLUSION = define(4)
  val MATERIAL_MAP_EMISSION = define(5)
  val MATERIAL_MAP_HEIGHT = define(6)
  val MATERIAL_MAP_CUBEMAP = define(7)
  val MATERIAL_MAP_IRRADIANCE = define(8)
  val MATERIAL_MAP_PREFILTER = define(9)
  val MATERIAL_MAP_BRDF = define(10)
  inline def getName(inline value: MaterialMapIndex): Option[String] =
    inline value match
      case MATERIAL_MAP_ALBEDO     => Some("MATERIAL_MAP_ALBEDO")
      case MATERIAL_MAP_METALNESS  => Some("MATERIAL_MAP_METALNESS")
      case MATERIAL_MAP_NORMAL     => Some("MATERIAL_MAP_NORMAL")
      case MATERIAL_MAP_ROUGHNESS  => Some("MATERIAL_MAP_ROUGHNESS")
      case MATERIAL_MAP_OCCLUSION  => Some("MATERIAL_MAP_OCCLUSION")
      case MATERIAL_MAP_EMISSION   => Some("MATERIAL_MAP_EMISSION")
      case MATERIAL_MAP_HEIGHT     => Some("MATERIAL_MAP_HEIGHT")
      case MATERIAL_MAP_CUBEMAP    => Some("MATERIAL_MAP_CUBEMAP")
      case MATERIAL_MAP_IRRADIANCE => Some("MATERIAL_MAP_IRRADIANCE")
      case MATERIAL_MAP_PREFILTER  => Some("MATERIAL_MAP_PREFILTER")
      case MATERIAL_MAP_BRDF       => Some("MATERIAL_MAP_BRDF")
      case _                       => None
  extension (a: MaterialMapIndex)
    inline def &(b: MaterialMapIndex): MaterialMapIndex = a & b
    inline def |(b: MaterialMapIndex): MaterialMapIndex = a | b
    inline def is(b: MaterialMapIndex): Boolean = (a & b) == b
end MaterialMapIndex

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type MouseButton = CUnsignedInt
object MouseButton extends CEnumU[MouseButton]:
  given _tag: Tag[MouseButton] = Tag.UInt
  inline def define(inline a: Long): MouseButton = a.toUInt
  val MOUSE_BUTTON_LEFT = define(0)
  val MOUSE_BUTTON_RIGHT = define(1)
  val MOUSE_BUTTON_MIDDLE = define(2)
  val MOUSE_BUTTON_SIDE = define(3)
  val MOUSE_BUTTON_EXTRA = define(4)
  val MOUSE_BUTTON_FORWARD = define(5)
  val MOUSE_BUTTON_BACK = define(6)
  inline def getName(inline value: MouseButton): Option[String] =
    inline value match
      case MOUSE_BUTTON_LEFT    => Some("MOUSE_BUTTON_LEFT")
      case MOUSE_BUTTON_RIGHT   => Some("MOUSE_BUTTON_RIGHT")
      case MOUSE_BUTTON_MIDDLE  => Some("MOUSE_BUTTON_MIDDLE")
      case MOUSE_BUTTON_SIDE    => Some("MOUSE_BUTTON_SIDE")
      case MOUSE_BUTTON_EXTRA   => Some("MOUSE_BUTTON_EXTRA")
      case MOUSE_BUTTON_FORWARD => Some("MOUSE_BUTTON_FORWARD")
      case MOUSE_BUTTON_BACK    => Some("MOUSE_BUTTON_BACK")
      case _                    => None
  extension (a: MouseButton)
    inline def &(b: MouseButton): MouseButton = a & b
    inline def |(b: MouseButton): MouseButton = a | b
    inline def is(b: MouseButton): Boolean = (a & b) == b
end MouseButton

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type MouseCursor = CUnsignedInt
object MouseCursor extends CEnumU[MouseCursor]:
  given _tag: Tag[MouseCursor] = Tag.UInt
  inline def define(inline a: Long): MouseCursor = a.toUInt
  val MOUSE_CURSOR_DEFAULT = define(0)
  val MOUSE_CURSOR_ARROW = define(1)
  val MOUSE_CURSOR_IBEAM = define(2)
  val MOUSE_CURSOR_CROSSHAIR = define(3)
  val MOUSE_CURSOR_POINTING_HAND = define(4)
  val MOUSE_CURSOR_RESIZE_EW = define(5)
  val MOUSE_CURSOR_RESIZE_NS = define(6)
  val MOUSE_CURSOR_RESIZE_NWSE = define(7)
  val MOUSE_CURSOR_RESIZE_NESW = define(8)
  val MOUSE_CURSOR_RESIZE_ALL = define(9)
  val MOUSE_CURSOR_NOT_ALLOWED = define(10)
  inline def getName(inline value: MouseCursor): Option[String] =
    inline value match
      case MOUSE_CURSOR_DEFAULT       => Some("MOUSE_CURSOR_DEFAULT")
      case MOUSE_CURSOR_ARROW         => Some("MOUSE_CURSOR_ARROW")
      case MOUSE_CURSOR_IBEAM         => Some("MOUSE_CURSOR_IBEAM")
      case MOUSE_CURSOR_CROSSHAIR     => Some("MOUSE_CURSOR_CROSSHAIR")
      case MOUSE_CURSOR_POINTING_HAND => Some("MOUSE_CURSOR_POINTING_HAND")
      case MOUSE_CURSOR_RESIZE_EW     => Some("MOUSE_CURSOR_RESIZE_EW")
      case MOUSE_CURSOR_RESIZE_NS     => Some("MOUSE_CURSOR_RESIZE_NS")
      case MOUSE_CURSOR_RESIZE_NWSE   => Some("MOUSE_CURSOR_RESIZE_NWSE")
      case MOUSE_CURSOR_RESIZE_NESW   => Some("MOUSE_CURSOR_RESIZE_NESW")
      case MOUSE_CURSOR_RESIZE_ALL    => Some("MOUSE_CURSOR_RESIZE_ALL")
      case MOUSE_CURSOR_NOT_ALLOWED   => Some("MOUSE_CURSOR_NOT_ALLOWED")
      case _                          => None
  extension (a: MouseCursor)
    inline def &(b: MouseCursor): MouseCursor = a & b
    inline def |(b: MouseCursor): MouseCursor = a | b
    inline def is(b: MouseCursor): Boolean = (a & b) == b
end MouseCursor

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type NPatchLayout = CUnsignedInt
object NPatchLayout extends CEnumU[NPatchLayout]:
  given _tag: Tag[NPatchLayout] = Tag.UInt
  inline def define(inline a: Long): NPatchLayout = a.toUInt
  val NPATCH_NINE_PATCH = define(0)
  val NPATCH_THREE_PATCH_VERTICAL = define(1)
  val NPATCH_THREE_PATCH_HORIZONTAL = define(2)
  inline def getName(inline value: NPatchLayout): Option[String] =
    inline value match
      case NPATCH_NINE_PATCH           => Some("NPATCH_NINE_PATCH")
      case NPATCH_THREE_PATCH_VERTICAL => Some("NPATCH_THREE_PATCH_VERTICAL")
      case NPATCH_THREE_PATCH_HORIZONTAL =>
        Some("NPATCH_THREE_PATCH_HORIZONTAL")
      case _ => None
  extension (a: NPatchLayout)
    inline def &(b: NPatchLayout): NPatchLayout = a & b
    inline def |(b: NPatchLayout): NPatchLayout = a | b
    inline def is(b: NPatchLayout): Boolean = (a & b) == b
end NPatchLayout

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type PixelFormat = CUnsignedInt
object PixelFormat extends CEnumU[PixelFormat]:
  given _tag: Tag[PixelFormat] = Tag.UInt
  inline def define(inline a: Long): PixelFormat = a.toUInt
  val PIXELFORMAT_UNCOMPRESSED_GRAYSCALE = define(1)
  val PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA = define(2)
  val PIXELFORMAT_UNCOMPRESSED_R5G6B5 = define(3)
  val PIXELFORMAT_UNCOMPRESSED_R8G8B8 = define(4)
  val PIXELFORMAT_UNCOMPRESSED_R5G5B5A1 = define(5)
  val PIXELFORMAT_UNCOMPRESSED_R4G4B4A4 = define(6)
  val PIXELFORMAT_UNCOMPRESSED_R8G8B8A8 = define(7)
  val PIXELFORMAT_UNCOMPRESSED_R32 = define(8)
  val PIXELFORMAT_UNCOMPRESSED_R32G32B32 = define(9)
  val PIXELFORMAT_UNCOMPRESSED_R32G32B32A32 = define(10)
  val PIXELFORMAT_UNCOMPRESSED_R16 = define(11)
  val PIXELFORMAT_UNCOMPRESSED_R16G16B16 = define(12)
  val PIXELFORMAT_UNCOMPRESSED_R16G16B16A16 = define(13)
  val PIXELFORMAT_COMPRESSED_DXT1_RGB = define(14)
  val PIXELFORMAT_COMPRESSED_DXT1_RGBA = define(15)
  val PIXELFORMAT_COMPRESSED_DXT3_RGBA = define(16)
  val PIXELFORMAT_COMPRESSED_DXT5_RGBA = define(17)
  val PIXELFORMAT_COMPRESSED_ETC1_RGB = define(18)
  val PIXELFORMAT_COMPRESSED_ETC2_RGB = define(19)
  val PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA = define(20)
  val PIXELFORMAT_COMPRESSED_PVRT_RGB = define(21)
  val PIXELFORMAT_COMPRESSED_PVRT_RGBA = define(22)
  val PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA = define(23)
  val PIXELFORMAT_COMPRESSED_ASTC_8x8_RGBA = define(24)
  inline def getName(inline value: PixelFormat): Option[String] =
    inline value match
      case PIXELFORMAT_UNCOMPRESSED_GRAYSCALE =>
        Some("PIXELFORMAT_UNCOMPRESSED_GRAYSCALE")
      case PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA =>
        Some("PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA")
      case PIXELFORMAT_UNCOMPRESSED_R5G6B5 =>
        Some("PIXELFORMAT_UNCOMPRESSED_R5G6B5")
      case PIXELFORMAT_UNCOMPRESSED_R8G8B8 =>
        Some("PIXELFORMAT_UNCOMPRESSED_R8G8B8")
      case PIXELFORMAT_UNCOMPRESSED_R5G5B5A1 =>
        Some("PIXELFORMAT_UNCOMPRESSED_R5G5B5A1")
      case PIXELFORMAT_UNCOMPRESSED_R4G4B4A4 =>
        Some("PIXELFORMAT_UNCOMPRESSED_R4G4B4A4")
      case PIXELFORMAT_UNCOMPRESSED_R8G8B8A8 =>
        Some("PIXELFORMAT_UNCOMPRESSED_R8G8B8A8")
      case PIXELFORMAT_UNCOMPRESSED_R32 => Some("PIXELFORMAT_UNCOMPRESSED_R32")
      case PIXELFORMAT_UNCOMPRESSED_R32G32B32 =>
        Some("PIXELFORMAT_UNCOMPRESSED_R32G32B32")
      case PIXELFORMAT_UNCOMPRESSED_R32G32B32A32 =>
        Some("PIXELFORMAT_UNCOMPRESSED_R32G32B32A32")
      case PIXELFORMAT_UNCOMPRESSED_R16 => Some("PIXELFORMAT_UNCOMPRESSED_R16")
      case PIXELFORMAT_UNCOMPRESSED_R16G16B16 =>
        Some("PIXELFORMAT_UNCOMPRESSED_R16G16B16")
      case PIXELFORMAT_UNCOMPRESSED_R16G16B16A16 =>
        Some("PIXELFORMAT_UNCOMPRESSED_R16G16B16A16")
      case PIXELFORMAT_COMPRESSED_DXT1_RGB =>
        Some("PIXELFORMAT_COMPRESSED_DXT1_RGB")
      case PIXELFORMAT_COMPRESSED_DXT1_RGBA =>
        Some("PIXELFORMAT_COMPRESSED_DXT1_RGBA")
      case PIXELFORMAT_COMPRESSED_DXT3_RGBA =>
        Some("PIXELFORMAT_COMPRESSED_DXT3_RGBA")
      case PIXELFORMAT_COMPRESSED_DXT5_RGBA =>
        Some("PIXELFORMAT_COMPRESSED_DXT5_RGBA")
      case PIXELFORMAT_COMPRESSED_ETC1_RGB =>
        Some("PIXELFORMAT_COMPRESSED_ETC1_RGB")
      case PIXELFORMAT_COMPRESSED_ETC2_RGB =>
        Some("PIXELFORMAT_COMPRESSED_ETC2_RGB")
      case PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA =>
        Some("PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA")
      case PIXELFORMAT_COMPRESSED_PVRT_RGB =>
        Some("PIXELFORMAT_COMPRESSED_PVRT_RGB")
      case PIXELFORMAT_COMPRESSED_PVRT_RGBA =>
        Some("PIXELFORMAT_COMPRESSED_PVRT_RGBA")
      case PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA =>
        Some("PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA")
      case PIXELFORMAT_COMPRESSED_ASTC_8x8_RGBA =>
        Some("PIXELFORMAT_COMPRESSED_ASTC_8x8_RGBA")
      case _ => None
  extension (a: PixelFormat)
    inline def &(b: PixelFormat): PixelFormat = a & b
    inline def |(b: PixelFormat): PixelFormat = a | b
    inline def is(b: PixelFormat): Boolean = (a & b) == b
end PixelFormat

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type ShaderAttributeDataType = CUnsignedInt
object ShaderAttributeDataType extends CEnumU[ShaderAttributeDataType]:
  given _tag: Tag[ShaderAttributeDataType] = Tag.UInt
  inline def define(inline a: Long): ShaderAttributeDataType = a.toUInt
  val SHADER_ATTRIB_FLOAT = define(0)
  val SHADER_ATTRIB_VEC2 = define(1)
  val SHADER_ATTRIB_VEC3 = define(2)
  val SHADER_ATTRIB_VEC4 = define(3)
  inline def getName(inline value: ShaderAttributeDataType): Option[String] =
    inline value match
      case SHADER_ATTRIB_FLOAT => Some("SHADER_ATTRIB_FLOAT")
      case SHADER_ATTRIB_VEC2  => Some("SHADER_ATTRIB_VEC2")
      case SHADER_ATTRIB_VEC3  => Some("SHADER_ATTRIB_VEC3")
      case SHADER_ATTRIB_VEC4  => Some("SHADER_ATTRIB_VEC4")
      case _                   => None
  extension (a: ShaderAttributeDataType)
    inline def &(b: ShaderAttributeDataType): ShaderAttributeDataType = a & b
    inline def |(b: ShaderAttributeDataType): ShaderAttributeDataType = a | b
    inline def is(b: ShaderAttributeDataType): Boolean = (a & b) == b
end ShaderAttributeDataType

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type ShaderLocationIndex = CUnsignedInt
object ShaderLocationIndex extends CEnumU[ShaderLocationIndex]:
  given _tag: Tag[ShaderLocationIndex] = Tag.UInt
  inline def define(inline a: Long): ShaderLocationIndex = a.toUInt
  val SHADER_LOC_VERTEX_POSITION = define(0)
  val SHADER_LOC_VERTEX_TEXCOORD01 = define(1)
  val SHADER_LOC_VERTEX_TEXCOORD02 = define(2)
  val SHADER_LOC_VERTEX_NORMAL = define(3)
  val SHADER_LOC_VERTEX_TANGENT = define(4)
  val SHADER_LOC_VERTEX_COLOR = define(5)
  val SHADER_LOC_MATRIX_MVP = define(6)
  val SHADER_LOC_MATRIX_VIEW = define(7)
  val SHADER_LOC_MATRIX_PROJECTION = define(8)
  val SHADER_LOC_MATRIX_MODEL = define(9)
  val SHADER_LOC_MATRIX_NORMAL = define(10)
  val SHADER_LOC_VECTOR_VIEW = define(11)
  val SHADER_LOC_COLOR_DIFFUSE = define(12)
  val SHADER_LOC_COLOR_SPECULAR = define(13)
  val SHADER_LOC_COLOR_AMBIENT = define(14)
  val SHADER_LOC_MAP_ALBEDO = define(15)
  val SHADER_LOC_MAP_METALNESS = define(16)
  val SHADER_LOC_MAP_NORMAL = define(17)
  val SHADER_LOC_MAP_ROUGHNESS = define(18)
  val SHADER_LOC_MAP_OCCLUSION = define(19)
  val SHADER_LOC_MAP_EMISSION = define(20)
  val SHADER_LOC_MAP_HEIGHT = define(21)
  val SHADER_LOC_MAP_CUBEMAP = define(22)
  val SHADER_LOC_MAP_IRRADIANCE = define(23)
  val SHADER_LOC_MAP_PREFILTER = define(24)
  val SHADER_LOC_MAP_BRDF = define(25)
  inline def getName(inline value: ShaderLocationIndex): Option[String] =
    inline value match
      case SHADER_LOC_VERTEX_POSITION   => Some("SHADER_LOC_VERTEX_POSITION")
      case SHADER_LOC_VERTEX_TEXCOORD01 => Some("SHADER_LOC_VERTEX_TEXCOORD01")
      case SHADER_LOC_VERTEX_TEXCOORD02 => Some("SHADER_LOC_VERTEX_TEXCOORD02")
      case SHADER_LOC_VERTEX_NORMAL     => Some("SHADER_LOC_VERTEX_NORMAL")
      case SHADER_LOC_VERTEX_TANGENT    => Some("SHADER_LOC_VERTEX_TANGENT")
      case SHADER_LOC_VERTEX_COLOR      => Some("SHADER_LOC_VERTEX_COLOR")
      case SHADER_LOC_MATRIX_MVP        => Some("SHADER_LOC_MATRIX_MVP")
      case SHADER_LOC_MATRIX_VIEW       => Some("SHADER_LOC_MATRIX_VIEW")
      case SHADER_LOC_MATRIX_PROJECTION => Some("SHADER_LOC_MATRIX_PROJECTION")
      case SHADER_LOC_MATRIX_MODEL      => Some("SHADER_LOC_MATRIX_MODEL")
      case SHADER_LOC_MATRIX_NORMAL     => Some("SHADER_LOC_MATRIX_NORMAL")
      case SHADER_LOC_VECTOR_VIEW       => Some("SHADER_LOC_VECTOR_VIEW")
      case SHADER_LOC_COLOR_DIFFUSE     => Some("SHADER_LOC_COLOR_DIFFUSE")
      case SHADER_LOC_COLOR_SPECULAR    => Some("SHADER_LOC_COLOR_SPECULAR")
      case SHADER_LOC_COLOR_AMBIENT     => Some("SHADER_LOC_COLOR_AMBIENT")
      case SHADER_LOC_MAP_ALBEDO        => Some("SHADER_LOC_MAP_ALBEDO")
      case SHADER_LOC_MAP_METALNESS     => Some("SHADER_LOC_MAP_METALNESS")
      case SHADER_LOC_MAP_NORMAL        => Some("SHADER_LOC_MAP_NORMAL")
      case SHADER_LOC_MAP_ROUGHNESS     => Some("SHADER_LOC_MAP_ROUGHNESS")
      case SHADER_LOC_MAP_OCCLUSION     => Some("SHADER_LOC_MAP_OCCLUSION")
      case SHADER_LOC_MAP_EMISSION      => Some("SHADER_LOC_MAP_EMISSION")
      case SHADER_LOC_MAP_HEIGHT        => Some("SHADER_LOC_MAP_HEIGHT")
      case SHADER_LOC_MAP_CUBEMAP       => Some("SHADER_LOC_MAP_CUBEMAP")
      case SHADER_LOC_MAP_IRRADIANCE    => Some("SHADER_LOC_MAP_IRRADIANCE")
      case SHADER_LOC_MAP_PREFILTER     => Some("SHADER_LOC_MAP_PREFILTER")
      case SHADER_LOC_MAP_BRDF          => Some("SHADER_LOC_MAP_BRDF")
      case _                            => None
  extension (a: ShaderLocationIndex)
    inline def &(b: ShaderLocationIndex): ShaderLocationIndex = a & b
    inline def |(b: ShaderLocationIndex): ShaderLocationIndex = a | b
    inline def is(b: ShaderLocationIndex): Boolean = (a & b) == b
end ShaderLocationIndex

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type ShaderUniformDataType = CUnsignedInt
object ShaderUniformDataType extends CEnumU[ShaderUniformDataType]:
  given _tag: Tag[ShaderUniformDataType] = Tag.UInt
  inline def define(inline a: Long): ShaderUniformDataType = a.toUInt
  val SHADER_UNIFORM_FLOAT = define(0)
  val SHADER_UNIFORM_VEC2 = define(1)
  val SHADER_UNIFORM_VEC3 = define(2)
  val SHADER_UNIFORM_VEC4 = define(3)
  val SHADER_UNIFORM_INT = define(4)
  val SHADER_UNIFORM_IVEC2 = define(5)
  val SHADER_UNIFORM_IVEC3 = define(6)
  val SHADER_UNIFORM_IVEC4 = define(7)
  val SHADER_UNIFORM_SAMPLER2D = define(8)
  inline def getName(inline value: ShaderUniformDataType): Option[String] =
    inline value match
      case SHADER_UNIFORM_FLOAT     => Some("SHADER_UNIFORM_FLOAT")
      case SHADER_UNIFORM_VEC2      => Some("SHADER_UNIFORM_VEC2")
      case SHADER_UNIFORM_VEC3      => Some("SHADER_UNIFORM_VEC3")
      case SHADER_UNIFORM_VEC4      => Some("SHADER_UNIFORM_VEC4")
      case SHADER_UNIFORM_INT       => Some("SHADER_UNIFORM_INT")
      case SHADER_UNIFORM_IVEC2     => Some("SHADER_UNIFORM_IVEC2")
      case SHADER_UNIFORM_IVEC3     => Some("SHADER_UNIFORM_IVEC3")
      case SHADER_UNIFORM_IVEC4     => Some("SHADER_UNIFORM_IVEC4")
      case SHADER_UNIFORM_SAMPLER2D => Some("SHADER_UNIFORM_SAMPLER2D")
      case _                        => None
  extension (a: ShaderUniformDataType)
    inline def &(b: ShaderUniformDataType): ShaderUniformDataType = a & b
    inline def |(b: ShaderUniformDataType): ShaderUniformDataType = a | b
    inline def is(b: ShaderUniformDataType): Boolean = (a & b) == b
end ShaderUniformDataType

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type TextureFilter = CUnsignedInt
object TextureFilter extends CEnumU[TextureFilter]:
  given _tag: Tag[TextureFilter] = Tag.UInt
  inline def define(inline a: Long): TextureFilter = a.toUInt
  val TEXTURE_FILTER_POINT = define(0)
  val TEXTURE_FILTER_BILINEAR = define(1)
  val TEXTURE_FILTER_TRILINEAR = define(2)
  val TEXTURE_FILTER_ANISOTROPIC_4X = define(3)
  val TEXTURE_FILTER_ANISOTROPIC_8X = define(4)
  val TEXTURE_FILTER_ANISOTROPIC_16X = define(5)
  inline def getName(inline value: TextureFilter): Option[String] =
    inline value match
      case TEXTURE_FILTER_POINT     => Some("TEXTURE_FILTER_POINT")
      case TEXTURE_FILTER_BILINEAR  => Some("TEXTURE_FILTER_BILINEAR")
      case TEXTURE_FILTER_TRILINEAR => Some("TEXTURE_FILTER_TRILINEAR")
      case TEXTURE_FILTER_ANISOTROPIC_4X =>
        Some("TEXTURE_FILTER_ANISOTROPIC_4X")
      case TEXTURE_FILTER_ANISOTROPIC_8X =>
        Some("TEXTURE_FILTER_ANISOTROPIC_8X")
      case TEXTURE_FILTER_ANISOTROPIC_16X =>
        Some("TEXTURE_FILTER_ANISOTROPIC_16X")
      case _ => None
  extension (a: TextureFilter)
    inline def &(b: TextureFilter): TextureFilter = a & b
    inline def |(b: TextureFilter): TextureFilter = a | b
    inline def is(b: TextureFilter): Boolean = (a & b) == b
end TextureFilter

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type TextureWrap = CUnsignedInt
object TextureWrap extends CEnumU[TextureWrap]:
  given _tag: Tag[TextureWrap] = Tag.UInt
  inline def define(inline a: Long): TextureWrap = a.toUInt
  val TEXTURE_WRAP_REPEAT = define(0)
  val TEXTURE_WRAP_CLAMP = define(1)
  val TEXTURE_WRAP_MIRROR_REPEAT = define(2)
  val TEXTURE_WRAP_MIRROR_CLAMP = define(3)
  inline def getName(inline value: TextureWrap): Option[String] =
    inline value match
      case TEXTURE_WRAP_REPEAT        => Some("TEXTURE_WRAP_REPEAT")
      case TEXTURE_WRAP_CLAMP         => Some("TEXTURE_WRAP_CLAMP")
      case TEXTURE_WRAP_MIRROR_REPEAT => Some("TEXTURE_WRAP_MIRROR_REPEAT")
      case TEXTURE_WRAP_MIRROR_CLAMP  => Some("TEXTURE_WRAP_MIRROR_CLAMP")
      case _                          => None
  extension (a: TextureWrap)
    inline def &(b: TextureWrap): TextureWrap = a & b
    inline def |(b: TextureWrap): TextureWrap = a | b
    inline def is(b: TextureWrap): Boolean = (a & b) == b
end TextureWrap

/** [bindgen] header: ./raylib/src/raylib.h
  */
opaque type TraceLogLevel = CUnsignedInt
object TraceLogLevel extends CEnumU[TraceLogLevel]:
  given _tag: Tag[TraceLogLevel] = Tag.UInt
  inline def define(inline a: Long): TraceLogLevel = a.toUInt
  val LOG_ALL = define(0)
  val LOG_TRACE = define(1)
  val LOG_DEBUG = define(2)
  val LOG_INFO = define(3)
  val LOG_WARNING = define(4)
  val LOG_ERROR = define(5)
  val LOG_FATAL = define(6)
  val LOG_NONE = define(7)
  inline def getName(inline value: TraceLogLevel): Option[String] =
    inline value match
      case LOG_ALL     => Some("LOG_ALL")
      case LOG_TRACE   => Some("LOG_TRACE")
      case LOG_DEBUG   => Some("LOG_DEBUG")
      case LOG_INFO    => Some("LOG_INFO")
      case LOG_WARNING => Some("LOG_WARNING")
      case LOG_ERROR   => Some("LOG_ERROR")
      case LOG_FATAL   => Some("LOG_FATAL")
      case LOG_NONE    => Some("LOG_NONE")
      case _           => None
  extension (a: TraceLogLevel)
    inline def &(b: TraceLogLevel): TraceLogLevel = a & b
    inline def |(b: TraceLogLevel): TraceLogLevel = a | b
    inline def is(b: TraceLogLevel): Boolean = (a & b) == b
end TraceLogLevel
