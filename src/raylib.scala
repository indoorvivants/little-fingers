// package raylib

// import _root_.scala.scalanative.unsafe.*
// import _root_.scala.scalanative.unsigned.*
// import _root_.scala.scalanative.libc.*
// import _root_.scala.scalanative.*

// object predef:
//   private[raylib] trait CEnumU[T](using eq: T =:= UInt):
//     given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
//     extension (inline t: T)
//       inline def int: CInt = eq.apply(t).toInt
//       inline def uint: CUnsignedInt = eq.apply(t)
//       inline def value: CUnsignedInt = eq.apply(t)

// object enumerations:
//   import predef.*

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type BlendMode = CUnsignedInt
//   object BlendMode extends CEnumU[BlendMode]:
//     given _tag: Tag[BlendMode] = Tag.UInt
//     inline def define(inline a: Long): BlendMode = a.toUInt
//     val BLEND_ALPHA = define(0)
//     val BLEND_ADDITIVE = define(1)
//     val BLEND_MULTIPLIED = define(2)
//     val BLEND_ADD_COLORS = define(3)
//     val BLEND_SUBTRACT_COLORS = define(4)
//     val BLEND_ALPHA_PREMULTIPLY = define(5)
//     val BLEND_CUSTOM = define(6)
//     val BLEND_CUSTOM_SEPARATE = define(7)
//     inline def getName(inline value: BlendMode): Option[String] =
//       inline value match
//         case BLEND_ALPHA             => Some("BLEND_ALPHA")
//         case BLEND_ADDITIVE          => Some("BLEND_ADDITIVE")
//         case BLEND_MULTIPLIED        => Some("BLEND_MULTIPLIED")
//         case BLEND_ADD_COLORS        => Some("BLEND_ADD_COLORS")
//         case BLEND_SUBTRACT_COLORS   => Some("BLEND_SUBTRACT_COLORS")
//         case BLEND_ALPHA_PREMULTIPLY => Some("BLEND_ALPHA_PREMULTIPLY")
//         case BLEND_CUSTOM            => Some("BLEND_CUSTOM")
//         case BLEND_CUSTOM_SEPARATE   => Some("BLEND_CUSTOM_SEPARATE")
//         case _                       => None
//     extension (a: BlendMode)
//       inline def &(b: BlendMode): BlendMode = a & b
//       inline def |(b: BlendMode): BlendMode = a | b
//       inline def is(b: BlendMode): Boolean = (a & b) == b
//   end BlendMode

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type CameraMode = CUnsignedInt
//   object CameraMode extends CEnumU[CameraMode]:
//     given _tag: Tag[CameraMode] = Tag.UInt
//     inline def define(inline a: Long): CameraMode = a.toUInt
//     val CAMERA_CUSTOM = define(0)
//     val CAMERA_FREE = define(1)
//     val CAMERA_ORBITAL = define(2)
//     val CAMERA_FIRST_PERSON = define(3)
//     val CAMERA_THIRD_PERSON = define(4)
//     inline def getName(inline value: CameraMode): Option[String] =
//       inline value match
//         case CAMERA_CUSTOM       => Some("CAMERA_CUSTOM")
//         case CAMERA_FREE         => Some("CAMERA_FREE")
//         case CAMERA_ORBITAL      => Some("CAMERA_ORBITAL")
//         case CAMERA_FIRST_PERSON => Some("CAMERA_FIRST_PERSON")
//         case CAMERA_THIRD_PERSON => Some("CAMERA_THIRD_PERSON")
//         case _                   => None
//     extension (a: CameraMode)
//       inline def &(b: CameraMode): CameraMode = a & b
//       inline def |(b: CameraMode): CameraMode = a | b
//       inline def is(b: CameraMode): Boolean = (a & b) == b
//   end CameraMode

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type CameraProjection = CUnsignedInt
//   object CameraProjection extends CEnumU[CameraProjection]:
//     given _tag: Tag[CameraProjection] = Tag.UInt
//     inline def define(inline a: Long): CameraProjection = a.toUInt
//     val CAMERA_PERSPECTIVE = define(0)
//     val CAMERA_ORTHOGRAPHIC = define(1)
//     inline def getName(inline value: CameraProjection): Option[String] =
//       inline value match
//         case CAMERA_PERSPECTIVE  => Some("CAMERA_PERSPECTIVE")
//         case CAMERA_ORTHOGRAPHIC => Some("CAMERA_ORTHOGRAPHIC")
//         case _                   => None
//     extension (a: CameraProjection)
//       inline def &(b: CameraProjection): CameraProjection = a & b
//       inline def |(b: CameraProjection): CameraProjection = a | b
//       inline def is(b: CameraProjection): Boolean = (a & b) == b
//   end CameraProjection

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type ConfigFlags = CUnsignedInt
//   object ConfigFlags extends CEnumU[ConfigFlags]:
//     given _tag: Tag[ConfigFlags] = Tag.UInt
//     inline def define(inline a: Long): ConfigFlags = a.toUInt
//     val FLAG_VSYNC_HINT = define(64)
//     val FLAG_FULLSCREEN_MODE = define(2)
//     val FLAG_WINDOW_RESIZABLE = define(4)
//     val FLAG_WINDOW_UNDECORATED = define(8)
//     val FLAG_WINDOW_HIDDEN = define(128)
//     val FLAG_WINDOW_MINIMIZED = define(512)
//     val FLAG_WINDOW_MAXIMIZED = define(1024)
//     val FLAG_WINDOW_UNFOCUSED = define(2048)
//     val FLAG_WINDOW_TOPMOST = define(4096)
//     val FLAG_WINDOW_ALWAYS_RUN = define(256)
//     val FLAG_WINDOW_TRANSPARENT = define(16)
//     val FLAG_WINDOW_HIGHDPI = define(8192)
//     val FLAG_WINDOW_MOUSE_PASSTHROUGH = define(16384)
//     val FLAG_BORDERLESS_WINDOWED_MODE = define(32768)
//     val FLAG_MSAA_4X_HINT = define(32)
//     val FLAG_INTERLACED_HINT = define(65536)
//     inline def getName(inline value: ConfigFlags): Option[String] =
//       inline value match
//         case FLAG_VSYNC_HINT         => Some("FLAG_VSYNC_HINT")
//         case FLAG_FULLSCREEN_MODE    => Some("FLAG_FULLSCREEN_MODE")
//         case FLAG_WINDOW_RESIZABLE   => Some("FLAG_WINDOW_RESIZABLE")
//         case FLAG_WINDOW_UNDECORATED => Some("FLAG_WINDOW_UNDECORATED")
//         case FLAG_WINDOW_HIDDEN      => Some("FLAG_WINDOW_HIDDEN")
//         case FLAG_WINDOW_MINIMIZED   => Some("FLAG_WINDOW_MINIMIZED")
//         case FLAG_WINDOW_MAXIMIZED   => Some("FLAG_WINDOW_MAXIMIZED")
//         case FLAG_WINDOW_UNFOCUSED   => Some("FLAG_WINDOW_UNFOCUSED")
//         case FLAG_WINDOW_TOPMOST     => Some("FLAG_WINDOW_TOPMOST")
//         case FLAG_WINDOW_ALWAYS_RUN  => Some("FLAG_WINDOW_ALWAYS_RUN")
//         case FLAG_WINDOW_TRANSPARENT => Some("FLAG_WINDOW_TRANSPARENT")
//         case FLAG_WINDOW_HIGHDPI     => Some("FLAG_WINDOW_HIGHDPI")
//         case FLAG_WINDOW_MOUSE_PASSTHROUGH =>
//           Some("FLAG_WINDOW_MOUSE_PASSTHROUGH")
//         case FLAG_BORDERLESS_WINDOWED_MODE =>
//           Some("FLAG_BORDERLESS_WINDOWED_MODE")
//         case FLAG_MSAA_4X_HINT    => Some("FLAG_MSAA_4X_HINT")
//         case FLAG_INTERLACED_HINT => Some("FLAG_INTERLACED_HINT")
//         case _                    => None
//     extension (a: ConfigFlags)
//       inline def &(b: ConfigFlags): ConfigFlags = a & b
//       inline def |(b: ConfigFlags): ConfigFlags = a | b
//       inline def is(b: ConfigFlags): Boolean = (a & b) == b
//   end ConfigFlags

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type CubemapLayout = CUnsignedInt
//   object CubemapLayout extends CEnumU[CubemapLayout]:
//     given _tag: Tag[CubemapLayout] = Tag.UInt
//     inline def define(inline a: Long): CubemapLayout = a.toUInt
//     val CUBEMAP_LAYOUT_AUTO_DETECT = define(0)
//     val CUBEMAP_LAYOUT_LINE_VERTICAL = define(1)
//     val CUBEMAP_LAYOUT_LINE_HORIZONTAL = define(2)
//     val CUBEMAP_LAYOUT_CROSS_THREE_BY_FOUR = define(3)
//     val CUBEMAP_LAYOUT_CROSS_FOUR_BY_THREE = define(4)
//     val CUBEMAP_LAYOUT_PANORAMA = define(5)
//     inline def getName(inline value: CubemapLayout): Option[String] =
//       inline value match
//         case CUBEMAP_LAYOUT_AUTO_DETECT => Some("CUBEMAP_LAYOUT_AUTO_DETECT")
//         case CUBEMAP_LAYOUT_LINE_VERTICAL =>
//           Some("CUBEMAP_LAYOUT_LINE_VERTICAL")
//         case CUBEMAP_LAYOUT_LINE_HORIZONTAL =>
//           Some("CUBEMAP_LAYOUT_LINE_HORIZONTAL")
//         case CUBEMAP_LAYOUT_CROSS_THREE_BY_FOUR =>
//           Some("CUBEMAP_LAYOUT_CROSS_THREE_BY_FOUR")
//         case CUBEMAP_LAYOUT_CROSS_FOUR_BY_THREE =>
//           Some("CUBEMAP_LAYOUT_CROSS_FOUR_BY_THREE")
//         case CUBEMAP_LAYOUT_PANORAMA => Some("CUBEMAP_LAYOUT_PANORAMA")
//         case _                       => None
//     extension (a: CubemapLayout)
//       inline def &(b: CubemapLayout): CubemapLayout = a & b
//       inline def |(b: CubemapLayout): CubemapLayout = a | b
//       inline def is(b: CubemapLayout): Boolean = (a & b) == b
//   end CubemapLayout

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type FontType = CUnsignedInt
//   object FontType extends CEnumU[FontType]:
//     given _tag: Tag[FontType] = Tag.UInt
//     inline def define(inline a: Long): FontType = a.toUInt
//     val FONT_DEFAULT = define(0)
//     val FONT_BITMAP = define(1)
//     val FONT_SDF = define(2)
//     inline def getName(inline value: FontType): Option[String] =
//       inline value match
//         case FONT_DEFAULT => Some("FONT_DEFAULT")
//         case FONT_BITMAP  => Some("FONT_BITMAP")
//         case FONT_SDF     => Some("FONT_SDF")
//         case _            => None
//     extension (a: FontType)
//       inline def &(b: FontType): FontType = a & b
//       inline def |(b: FontType): FontType = a | b
//       inline def is(b: FontType): Boolean = (a & b) == b
//   end FontType

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type GamepadAxis = CUnsignedInt
//   object GamepadAxis extends CEnumU[GamepadAxis]:
//     given _tag: Tag[GamepadAxis] = Tag.UInt
//     inline def define(inline a: Long): GamepadAxis = a.toUInt
//     val GAMEPAD_AXIS_LEFT_X = define(0)
//     val GAMEPAD_AXIS_LEFT_Y = define(1)
//     val GAMEPAD_AXIS_RIGHT_X = define(2)
//     val GAMEPAD_AXIS_RIGHT_Y = define(3)
//     val GAMEPAD_AXIS_LEFT_TRIGGER = define(4)
//     val GAMEPAD_AXIS_RIGHT_TRIGGER = define(5)
//     inline def getName(inline value: GamepadAxis): Option[String] =
//       inline value match
//         case GAMEPAD_AXIS_LEFT_X        => Some("GAMEPAD_AXIS_LEFT_X")
//         case GAMEPAD_AXIS_LEFT_Y        => Some("GAMEPAD_AXIS_LEFT_Y")
//         case GAMEPAD_AXIS_RIGHT_X       => Some("GAMEPAD_AXIS_RIGHT_X")
//         case GAMEPAD_AXIS_RIGHT_Y       => Some("GAMEPAD_AXIS_RIGHT_Y")
//         case GAMEPAD_AXIS_LEFT_TRIGGER  => Some("GAMEPAD_AXIS_LEFT_TRIGGER")
//         case GAMEPAD_AXIS_RIGHT_TRIGGER => Some("GAMEPAD_AXIS_RIGHT_TRIGGER")
//         case _                          => None
//     extension (a: GamepadAxis)
//       inline def &(b: GamepadAxis): GamepadAxis = a & b
//       inline def |(b: GamepadAxis): GamepadAxis = a | b
//       inline def is(b: GamepadAxis): Boolean = (a & b) == b
//   end GamepadAxis

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type GamepadButton = CUnsignedInt
//   object GamepadButton extends CEnumU[GamepadButton]:
//     given _tag: Tag[GamepadButton] = Tag.UInt
//     inline def define(inline a: Long): GamepadButton = a.toUInt
//     val GAMEPAD_BUTTON_UNKNOWN = define(0)
//     val GAMEPAD_BUTTON_LEFT_FACE_UP = define(1)
//     val GAMEPAD_BUTTON_LEFT_FACE_RIGHT = define(2)
//     val GAMEPAD_BUTTON_LEFT_FACE_DOWN = define(3)
//     val GAMEPAD_BUTTON_LEFT_FACE_LEFT = define(4)
//     val GAMEPAD_BUTTON_RIGHT_FACE_UP = define(5)
//     val GAMEPAD_BUTTON_RIGHT_FACE_RIGHT = define(6)
//     val GAMEPAD_BUTTON_RIGHT_FACE_DOWN = define(7)
//     val GAMEPAD_BUTTON_RIGHT_FACE_LEFT = define(8)
//     val GAMEPAD_BUTTON_LEFT_TRIGGER_1 = define(9)
//     val GAMEPAD_BUTTON_LEFT_TRIGGER_2 = define(10)
//     val GAMEPAD_BUTTON_RIGHT_TRIGGER_1 = define(11)
//     val GAMEPAD_BUTTON_RIGHT_TRIGGER_2 = define(12)
//     val GAMEPAD_BUTTON_MIDDLE_LEFT = define(13)
//     val GAMEPAD_BUTTON_MIDDLE = define(14)
//     val GAMEPAD_BUTTON_MIDDLE_RIGHT = define(15)
//     val GAMEPAD_BUTTON_LEFT_THUMB = define(16)
//     val GAMEPAD_BUTTON_RIGHT_THUMB = define(17)
//     inline def getName(inline value: GamepadButton): Option[String] =
//       inline value match
//         case GAMEPAD_BUTTON_UNKNOWN      => Some("GAMEPAD_BUTTON_UNKNOWN")
//         case GAMEPAD_BUTTON_LEFT_FACE_UP => Some("GAMEPAD_BUTTON_LEFT_FACE_UP")
//         case GAMEPAD_BUTTON_LEFT_FACE_RIGHT =>
//           Some("GAMEPAD_BUTTON_LEFT_FACE_RIGHT")
//         case GAMEPAD_BUTTON_LEFT_FACE_DOWN =>
//           Some("GAMEPAD_BUTTON_LEFT_FACE_DOWN")
//         case GAMEPAD_BUTTON_LEFT_FACE_LEFT =>
//           Some("GAMEPAD_BUTTON_LEFT_FACE_LEFT")
//         case GAMEPAD_BUTTON_RIGHT_FACE_UP =>
//           Some("GAMEPAD_BUTTON_RIGHT_FACE_UP")
//         case GAMEPAD_BUTTON_RIGHT_FACE_RIGHT =>
//           Some("GAMEPAD_BUTTON_RIGHT_FACE_RIGHT")
//         case GAMEPAD_BUTTON_RIGHT_FACE_DOWN =>
//           Some("GAMEPAD_BUTTON_RIGHT_FACE_DOWN")
//         case GAMEPAD_BUTTON_RIGHT_FACE_LEFT =>
//           Some("GAMEPAD_BUTTON_RIGHT_FACE_LEFT")
//         case GAMEPAD_BUTTON_LEFT_TRIGGER_1 =>
//           Some("GAMEPAD_BUTTON_LEFT_TRIGGER_1")
//         case GAMEPAD_BUTTON_LEFT_TRIGGER_2 =>
//           Some("GAMEPAD_BUTTON_LEFT_TRIGGER_2")
//         case GAMEPAD_BUTTON_RIGHT_TRIGGER_1 =>
//           Some("GAMEPAD_BUTTON_RIGHT_TRIGGER_1")
//         case GAMEPAD_BUTTON_RIGHT_TRIGGER_2 =>
//           Some("GAMEPAD_BUTTON_RIGHT_TRIGGER_2")
//         case GAMEPAD_BUTTON_MIDDLE_LEFT  => Some("GAMEPAD_BUTTON_MIDDLE_LEFT")
//         case GAMEPAD_BUTTON_MIDDLE       => Some("GAMEPAD_BUTTON_MIDDLE")
//         case GAMEPAD_BUTTON_MIDDLE_RIGHT => Some("GAMEPAD_BUTTON_MIDDLE_RIGHT")
//         case GAMEPAD_BUTTON_LEFT_THUMB   => Some("GAMEPAD_BUTTON_LEFT_THUMB")
//         case GAMEPAD_BUTTON_RIGHT_THUMB  => Some("GAMEPAD_BUTTON_RIGHT_THUMB")
//         case _                           => None
//     extension (a: GamepadButton)
//       inline def &(b: GamepadButton): GamepadButton = a & b
//       inline def |(b: GamepadButton): GamepadButton = a | b
//       inline def is(b: GamepadButton): Boolean = (a & b) == b
//   end GamepadButton

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Gesture = CUnsignedInt
//   object Gesture extends CEnumU[Gesture]:
//     given _tag: Tag[Gesture] = Tag.UInt
//     inline def define(inline a: Long): Gesture = a.toUInt
//     val GESTURE_NONE = define(0)
//     val GESTURE_TAP = define(1)
//     val GESTURE_DOUBLETAP = define(2)
//     val GESTURE_HOLD = define(4)
//     val GESTURE_DRAG = define(8)
//     val GESTURE_SWIPE_RIGHT = define(16)
//     val GESTURE_SWIPE_LEFT = define(32)
//     val GESTURE_SWIPE_UP = define(64)
//     val GESTURE_SWIPE_DOWN = define(128)
//     val GESTURE_PINCH_IN = define(256)
//     val GESTURE_PINCH_OUT = define(512)
//     inline def getName(inline value: Gesture): Option[String] =
//       inline value match
//         case GESTURE_NONE        => Some("GESTURE_NONE")
//         case GESTURE_TAP         => Some("GESTURE_TAP")
//         case GESTURE_DOUBLETAP   => Some("GESTURE_DOUBLETAP")
//         case GESTURE_HOLD        => Some("GESTURE_HOLD")
//         case GESTURE_DRAG        => Some("GESTURE_DRAG")
//         case GESTURE_SWIPE_RIGHT => Some("GESTURE_SWIPE_RIGHT")
//         case GESTURE_SWIPE_LEFT  => Some("GESTURE_SWIPE_LEFT")
//         case GESTURE_SWIPE_UP    => Some("GESTURE_SWIPE_UP")
//         case GESTURE_SWIPE_DOWN  => Some("GESTURE_SWIPE_DOWN")
//         case GESTURE_PINCH_IN    => Some("GESTURE_PINCH_IN")
//         case GESTURE_PINCH_OUT   => Some("GESTURE_PINCH_OUT")
//         case _                   => None
//     extension (a: Gesture)
//       inline def &(b: Gesture): Gesture = a & b
//       inline def |(b: Gesture): Gesture = a | b
//       inline def is(b: Gesture): Boolean = (a & b) == b
//   end Gesture

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type KeyboardKey = CUnsignedInt
//   object KeyboardKey extends CEnumU[KeyboardKey]:
//     given _tag: Tag[KeyboardKey] = Tag.UInt
//     inline def define(inline a: Long): KeyboardKey = a.toUInt
//     val KEY_NULL = define(0)
//     val KEY_APOSTROPHE = define(39)
//     val KEY_COMMA = define(44)
//     val KEY_MINUS = define(45)
//     val KEY_PERIOD = define(46)
//     val KEY_SLASH = define(47)
//     val KEY_ZERO = define(48)
//     val KEY_ONE = define(49)
//     val KEY_TWO = define(50)
//     val KEY_THREE = define(51)
//     val KEY_FOUR = define(52)
//     val KEY_FIVE = define(53)
//     val KEY_SIX = define(54)
//     val KEY_SEVEN = define(55)
//     val KEY_EIGHT = define(56)
//     val KEY_NINE = define(57)
//     val KEY_SEMICOLON = define(59)
//     val KEY_EQUAL = define(61)
//     val KEY_A = define(65)
//     val KEY_B = define(66)
//     val KEY_C = define(67)
//     val KEY_D = define(68)
//     val KEY_E = define(69)
//     val KEY_F = define(70)
//     val KEY_G = define(71)
//     val KEY_H = define(72)
//     val KEY_I = define(73)
//     val KEY_J = define(74)
//     val KEY_K = define(75)
//     val KEY_L = define(76)
//     val KEY_M = define(77)
//     val KEY_N = define(78)
//     val KEY_O = define(79)
//     val KEY_P = define(80)
//     val KEY_Q = define(81)
//     val KEY_R = define(82)
//     val KEY_S = define(83)
//     val KEY_T = define(84)
//     val KEY_U = define(85)
//     val KEY_V = define(86)
//     val KEY_W = define(87)
//     val KEY_X = define(88)
//     val KEY_Y = define(89)
//     val KEY_Z = define(90)
//     val KEY_LEFT_BRACKET = define(91)
//     val KEY_BACKSLASH = define(92)
//     val KEY_RIGHT_BRACKET = define(93)
//     val KEY_GRAVE = define(96)
//     val KEY_SPACE = define(32)
//     val KEY_ESCAPE = define(256)
//     val KEY_ENTER = define(257)
//     val KEY_TAB = define(258)
//     val KEY_BACKSPACE = define(259)
//     val KEY_INSERT = define(260)
//     val KEY_DELETE = define(261)
//     val KEY_RIGHT = define(262)
//     val KEY_LEFT = define(263)
//     val KEY_DOWN = define(264)
//     val KEY_UP = define(265)
//     val KEY_PAGE_UP = define(266)
//     val KEY_PAGE_DOWN = define(267)
//     val KEY_HOME = define(268)
//     val KEY_END = define(269)
//     val KEY_CAPS_LOCK = define(280)
//     val KEY_SCROLL_LOCK = define(281)
//     val KEY_NUM_LOCK = define(282)
//     val KEY_PRINT_SCREEN = define(283)
//     val KEY_PAUSE = define(284)
//     val KEY_F1 = define(290)
//     val KEY_F2 = define(291)
//     val KEY_F3 = define(292)
//     val KEY_F4 = define(293)
//     val KEY_F5 = define(294)
//     val KEY_F6 = define(295)
//     val KEY_F7 = define(296)
//     val KEY_F8 = define(297)
//     val KEY_F9 = define(298)
//     val KEY_F10 = define(299)
//     val KEY_F11 = define(300)
//     val KEY_F12 = define(301)
//     val KEY_LEFT_SHIFT = define(340)
//     val KEY_LEFT_CONTROL = define(341)
//     val KEY_LEFT_ALT = define(342)
//     val KEY_LEFT_SUPER = define(343)
//     val KEY_RIGHT_SHIFT = define(344)
//     val KEY_RIGHT_CONTROL = define(345)
//     val KEY_RIGHT_ALT = define(346)
//     val KEY_RIGHT_SUPER = define(347)
//     val KEY_KB_MENU = define(348)
//     val KEY_KP_0 = define(320)
//     val KEY_KP_1 = define(321)
//     val KEY_KP_2 = define(322)
//     val KEY_KP_3 = define(323)
//     val KEY_KP_4 = define(324)
//     val KEY_KP_5 = define(325)
//     val KEY_KP_6 = define(326)
//     val KEY_KP_7 = define(327)
//     val KEY_KP_8 = define(328)
//     val KEY_KP_9 = define(329)
//     val KEY_KP_DECIMAL = define(330)
//     val KEY_KP_DIVIDE = define(331)
//     val KEY_KP_MULTIPLY = define(332)
//     val KEY_KP_SUBTRACT = define(333)
//     val KEY_KP_ADD = define(334)
//     val KEY_KP_ENTER = define(335)
//     val KEY_KP_EQUAL = define(336)
//     val KEY_BACK = define(4)
//     val KEY_MENU = define(82)
//     val KEY_VOLUME_UP = define(24)
//     val KEY_VOLUME_DOWN = define(25)
//     inline def getName(inline value: KeyboardKey): Option[String] =
//       inline value match
//         case KEY_NULL          => Some("KEY_NULL")
//         case KEY_APOSTROPHE    => Some("KEY_APOSTROPHE")
//         case KEY_COMMA         => Some("KEY_COMMA")
//         case KEY_MINUS         => Some("KEY_MINUS")
//         case KEY_PERIOD        => Some("KEY_PERIOD")
//         case KEY_SLASH         => Some("KEY_SLASH")
//         case KEY_ZERO          => Some("KEY_ZERO")
//         case KEY_ONE           => Some("KEY_ONE")
//         case KEY_TWO           => Some("KEY_TWO")
//         case KEY_THREE         => Some("KEY_THREE")
//         case KEY_FOUR          => Some("KEY_FOUR")
//         case KEY_FIVE          => Some("KEY_FIVE")
//         case KEY_SIX           => Some("KEY_SIX")
//         case KEY_SEVEN         => Some("KEY_SEVEN")
//         case KEY_EIGHT         => Some("KEY_EIGHT")
//         case KEY_NINE          => Some("KEY_NINE")
//         case KEY_SEMICOLON     => Some("KEY_SEMICOLON")
//         case KEY_EQUAL         => Some("KEY_EQUAL")
//         case KEY_A             => Some("KEY_A")
//         case KEY_B             => Some("KEY_B")
//         case KEY_C             => Some("KEY_C")
//         case KEY_D             => Some("KEY_D")
//         case KEY_E             => Some("KEY_E")
//         case KEY_F             => Some("KEY_F")
//         case KEY_G             => Some("KEY_G")
//         case KEY_H             => Some("KEY_H")
//         case KEY_I             => Some("KEY_I")
//         case KEY_J             => Some("KEY_J")
//         case KEY_K             => Some("KEY_K")
//         case KEY_L             => Some("KEY_L")
//         case KEY_M             => Some("KEY_M")
//         case KEY_N             => Some("KEY_N")
//         case KEY_O             => Some("KEY_O")
//         case KEY_P             => Some("KEY_P")
//         case KEY_Q             => Some("KEY_Q")
//         case KEY_R             => Some("KEY_R")
//         case KEY_S             => Some("KEY_S")
//         case KEY_T             => Some("KEY_T")
//         case KEY_U             => Some("KEY_U")
//         case KEY_V             => Some("KEY_V")
//         case KEY_W             => Some("KEY_W")
//         case KEY_X             => Some("KEY_X")
//         case KEY_Y             => Some("KEY_Y")
//         case KEY_Z             => Some("KEY_Z")
//         case KEY_LEFT_BRACKET  => Some("KEY_LEFT_BRACKET")
//         case KEY_BACKSLASH     => Some("KEY_BACKSLASH")
//         case KEY_RIGHT_BRACKET => Some("KEY_RIGHT_BRACKET")
//         case KEY_GRAVE         => Some("KEY_GRAVE")
//         case KEY_SPACE         => Some("KEY_SPACE")
//         case KEY_ESCAPE        => Some("KEY_ESCAPE")
//         case KEY_ENTER         => Some("KEY_ENTER")
//         case KEY_TAB           => Some("KEY_TAB")
//         case KEY_BACKSPACE     => Some("KEY_BACKSPACE")
//         case KEY_INSERT        => Some("KEY_INSERT")
//         case KEY_DELETE        => Some("KEY_DELETE")
//         case KEY_RIGHT         => Some("KEY_RIGHT")
//         case KEY_LEFT          => Some("KEY_LEFT")
//         case KEY_DOWN          => Some("KEY_DOWN")
//         case KEY_UP            => Some("KEY_UP")
//         case KEY_PAGE_UP       => Some("KEY_PAGE_UP")
//         case KEY_PAGE_DOWN     => Some("KEY_PAGE_DOWN")
//         case KEY_HOME          => Some("KEY_HOME")
//         case KEY_END           => Some("KEY_END")
//         case KEY_CAPS_LOCK     => Some("KEY_CAPS_LOCK")
//         case KEY_SCROLL_LOCK   => Some("KEY_SCROLL_LOCK")
//         case KEY_NUM_LOCK      => Some("KEY_NUM_LOCK")
//         case KEY_PRINT_SCREEN  => Some("KEY_PRINT_SCREEN")
//         case KEY_PAUSE         => Some("KEY_PAUSE")
//         case KEY_F1            => Some("KEY_F1")
//         case KEY_F2            => Some("KEY_F2")
//         case KEY_F3            => Some("KEY_F3")
//         case KEY_F4            => Some("KEY_F4")
//         case KEY_F5            => Some("KEY_F5")
//         case KEY_F6            => Some("KEY_F6")
//         case KEY_F7            => Some("KEY_F7")
//         case KEY_F8            => Some("KEY_F8")
//         case KEY_F9            => Some("KEY_F9")
//         case KEY_F10           => Some("KEY_F10")
//         case KEY_F11           => Some("KEY_F11")
//         case KEY_F12           => Some("KEY_F12")
//         case KEY_LEFT_SHIFT    => Some("KEY_LEFT_SHIFT")
//         case KEY_LEFT_CONTROL  => Some("KEY_LEFT_CONTROL")
//         case KEY_LEFT_ALT      => Some("KEY_LEFT_ALT")
//         case KEY_LEFT_SUPER    => Some("KEY_LEFT_SUPER")
//         case KEY_RIGHT_SHIFT   => Some("KEY_RIGHT_SHIFT")
//         case KEY_RIGHT_CONTROL => Some("KEY_RIGHT_CONTROL")
//         case KEY_RIGHT_ALT     => Some("KEY_RIGHT_ALT")
//         case KEY_RIGHT_SUPER   => Some("KEY_RIGHT_SUPER")
//         case KEY_KB_MENU       => Some("KEY_KB_MENU")
//         case KEY_KP_0          => Some("KEY_KP_0")
//         case KEY_KP_1          => Some("KEY_KP_1")
//         case KEY_KP_2          => Some("KEY_KP_2")
//         case KEY_KP_3          => Some("KEY_KP_3")
//         case KEY_KP_4          => Some("KEY_KP_4")
//         case KEY_KP_5          => Some("KEY_KP_5")
//         case KEY_KP_6          => Some("KEY_KP_6")
//         case KEY_KP_7          => Some("KEY_KP_7")
//         case KEY_KP_8          => Some("KEY_KP_8")
//         case KEY_KP_9          => Some("KEY_KP_9")
//         case KEY_KP_DECIMAL    => Some("KEY_KP_DECIMAL")
//         case KEY_KP_DIVIDE     => Some("KEY_KP_DIVIDE")
//         case KEY_KP_MULTIPLY   => Some("KEY_KP_MULTIPLY")
//         case KEY_KP_SUBTRACT   => Some("KEY_KP_SUBTRACT")
//         case KEY_KP_ADD        => Some("KEY_KP_ADD")
//         case KEY_KP_ENTER      => Some("KEY_KP_ENTER")
//         case KEY_KP_EQUAL      => Some("KEY_KP_EQUAL")
//         case KEY_BACK          => Some("KEY_BACK")
//         case KEY_MENU          => Some("KEY_MENU")
//         case KEY_VOLUME_UP     => Some("KEY_VOLUME_UP")
//         case KEY_VOLUME_DOWN   => Some("KEY_VOLUME_DOWN")
//         case _                 => None
//     extension (a: KeyboardKey)
//       inline def &(b: KeyboardKey): KeyboardKey = a & b
//       inline def |(b: KeyboardKey): KeyboardKey = a | b
//       inline def is(b: KeyboardKey): Boolean = (a & b) == b
//   end KeyboardKey

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type MaterialMapIndex = CUnsignedInt
//   object MaterialMapIndex extends CEnumU[MaterialMapIndex]:
//     given _tag: Tag[MaterialMapIndex] = Tag.UInt
//     inline def define(inline a: Long): MaterialMapIndex = a.toUInt
//     val MATERIAL_MAP_ALBEDO = define(0)
//     val MATERIAL_MAP_METALNESS = define(1)
//     val MATERIAL_MAP_NORMAL = define(2)
//     val MATERIAL_MAP_ROUGHNESS = define(3)
//     val MATERIAL_MAP_OCCLUSION = define(4)
//     val MATERIAL_MAP_EMISSION = define(5)
//     val MATERIAL_MAP_HEIGHT = define(6)
//     val MATERIAL_MAP_CUBEMAP = define(7)
//     val MATERIAL_MAP_IRRADIANCE = define(8)
//     val MATERIAL_MAP_PREFILTER = define(9)
//     val MATERIAL_MAP_BRDF = define(10)
//     inline def getName(inline value: MaterialMapIndex): Option[String] =
//       inline value match
//         case MATERIAL_MAP_ALBEDO     => Some("MATERIAL_MAP_ALBEDO")
//         case MATERIAL_MAP_METALNESS  => Some("MATERIAL_MAP_METALNESS")
//         case MATERIAL_MAP_NORMAL     => Some("MATERIAL_MAP_NORMAL")
//         case MATERIAL_MAP_ROUGHNESS  => Some("MATERIAL_MAP_ROUGHNESS")
//         case MATERIAL_MAP_OCCLUSION  => Some("MATERIAL_MAP_OCCLUSION")
//         case MATERIAL_MAP_EMISSION   => Some("MATERIAL_MAP_EMISSION")
//         case MATERIAL_MAP_HEIGHT     => Some("MATERIAL_MAP_HEIGHT")
//         case MATERIAL_MAP_CUBEMAP    => Some("MATERIAL_MAP_CUBEMAP")
//         case MATERIAL_MAP_IRRADIANCE => Some("MATERIAL_MAP_IRRADIANCE")
//         case MATERIAL_MAP_PREFILTER  => Some("MATERIAL_MAP_PREFILTER")
//         case MATERIAL_MAP_BRDF       => Some("MATERIAL_MAP_BRDF")
//         case _                       => None
//     extension (a: MaterialMapIndex)
//       inline def &(b: MaterialMapIndex): MaterialMapIndex = a & b
//       inline def |(b: MaterialMapIndex): MaterialMapIndex = a | b
//       inline def is(b: MaterialMapIndex): Boolean = (a & b) == b
//   end MaterialMapIndex

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type MouseButton = CUnsignedInt
//   object MouseButton extends CEnumU[MouseButton]:
//     given _tag: Tag[MouseButton] = Tag.UInt
//     inline def define(inline a: Long): MouseButton = a.toUInt
//     val MOUSE_BUTTON_LEFT = define(0)
//     val MOUSE_BUTTON_RIGHT = define(1)
//     val MOUSE_BUTTON_MIDDLE = define(2)
//     val MOUSE_BUTTON_SIDE = define(3)
//     val MOUSE_BUTTON_EXTRA = define(4)
//     val MOUSE_BUTTON_FORWARD = define(5)
//     val MOUSE_BUTTON_BACK = define(6)
//     inline def getName(inline value: MouseButton): Option[String] =
//       inline value match
//         case MOUSE_BUTTON_LEFT    => Some("MOUSE_BUTTON_LEFT")
//         case MOUSE_BUTTON_RIGHT   => Some("MOUSE_BUTTON_RIGHT")
//         case MOUSE_BUTTON_MIDDLE  => Some("MOUSE_BUTTON_MIDDLE")
//         case MOUSE_BUTTON_SIDE    => Some("MOUSE_BUTTON_SIDE")
//         case MOUSE_BUTTON_EXTRA   => Some("MOUSE_BUTTON_EXTRA")
//         case MOUSE_BUTTON_FORWARD => Some("MOUSE_BUTTON_FORWARD")
//         case MOUSE_BUTTON_BACK    => Some("MOUSE_BUTTON_BACK")
//         case _                    => None
//     extension (a: MouseButton)
//       inline def &(b: MouseButton): MouseButton = a & b
//       inline def |(b: MouseButton): MouseButton = a | b
//       inline def is(b: MouseButton): Boolean = (a & b) == b
//   end MouseButton

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type MouseCursor = CUnsignedInt
//   object MouseCursor extends CEnumU[MouseCursor]:
//     given _tag: Tag[MouseCursor] = Tag.UInt
//     inline def define(inline a: Long): MouseCursor = a.toUInt
//     val MOUSE_CURSOR_DEFAULT = define(0)
//     val MOUSE_CURSOR_ARROW = define(1)
//     val MOUSE_CURSOR_IBEAM = define(2)
//     val MOUSE_CURSOR_CROSSHAIR = define(3)
//     val MOUSE_CURSOR_POINTING_HAND = define(4)
//     val MOUSE_CURSOR_RESIZE_EW = define(5)
//     val MOUSE_CURSOR_RESIZE_NS = define(6)
//     val MOUSE_CURSOR_RESIZE_NWSE = define(7)
//     val MOUSE_CURSOR_RESIZE_NESW = define(8)
//     val MOUSE_CURSOR_RESIZE_ALL = define(9)
//     val MOUSE_CURSOR_NOT_ALLOWED = define(10)
//     inline def getName(inline value: MouseCursor): Option[String] =
//       inline value match
//         case MOUSE_CURSOR_DEFAULT       => Some("MOUSE_CURSOR_DEFAULT")
//         case MOUSE_CURSOR_ARROW         => Some("MOUSE_CURSOR_ARROW")
//         case MOUSE_CURSOR_IBEAM         => Some("MOUSE_CURSOR_IBEAM")
//         case MOUSE_CURSOR_CROSSHAIR     => Some("MOUSE_CURSOR_CROSSHAIR")
//         case MOUSE_CURSOR_POINTING_HAND => Some("MOUSE_CURSOR_POINTING_HAND")
//         case MOUSE_CURSOR_RESIZE_EW     => Some("MOUSE_CURSOR_RESIZE_EW")
//         case MOUSE_CURSOR_RESIZE_NS     => Some("MOUSE_CURSOR_RESIZE_NS")
//         case MOUSE_CURSOR_RESIZE_NWSE   => Some("MOUSE_CURSOR_RESIZE_NWSE")
//         case MOUSE_CURSOR_RESIZE_NESW   => Some("MOUSE_CURSOR_RESIZE_NESW")
//         case MOUSE_CURSOR_RESIZE_ALL    => Some("MOUSE_CURSOR_RESIZE_ALL")
//         case MOUSE_CURSOR_NOT_ALLOWED   => Some("MOUSE_CURSOR_NOT_ALLOWED")
//         case _                          => None
//     extension (a: MouseCursor)
//       inline def &(b: MouseCursor): MouseCursor = a & b
//       inline def |(b: MouseCursor): MouseCursor = a | b
//       inline def is(b: MouseCursor): Boolean = (a & b) == b
//   end MouseCursor

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type NPatchLayout = CUnsignedInt
//   object NPatchLayout extends CEnumU[NPatchLayout]:
//     given _tag: Tag[NPatchLayout] = Tag.UInt
//     inline def define(inline a: Long): NPatchLayout = a.toUInt
//     val NPATCH_NINE_PATCH = define(0)
//     val NPATCH_THREE_PATCH_VERTICAL = define(1)
//     val NPATCH_THREE_PATCH_HORIZONTAL = define(2)
//     inline def getName(inline value: NPatchLayout): Option[String] =
//       inline value match
//         case NPATCH_NINE_PATCH           => Some("NPATCH_NINE_PATCH")
//         case NPATCH_THREE_PATCH_VERTICAL => Some("NPATCH_THREE_PATCH_VERTICAL")
//         case NPATCH_THREE_PATCH_HORIZONTAL =>
//           Some("NPATCH_THREE_PATCH_HORIZONTAL")
//         case _ => None
//     extension (a: NPatchLayout)
//       inline def &(b: NPatchLayout): NPatchLayout = a & b
//       inline def |(b: NPatchLayout): NPatchLayout = a | b
//       inline def is(b: NPatchLayout): Boolean = (a & b) == b
//   end NPatchLayout

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type PixelFormat = CUnsignedInt
//   object PixelFormat extends CEnumU[PixelFormat]:
//     given _tag: Tag[PixelFormat] = Tag.UInt
//     inline def define(inline a: Long): PixelFormat = a.toUInt
//     val PIXELFORMAT_UNCOMPRESSED_GRAYSCALE = define(1)
//     val PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA = define(2)
//     val PIXELFORMAT_UNCOMPRESSED_R5G6B5 = define(3)
//     val PIXELFORMAT_UNCOMPRESSED_R8G8B8 = define(4)
//     val PIXELFORMAT_UNCOMPRESSED_R5G5B5A1 = define(5)
//     val PIXELFORMAT_UNCOMPRESSED_R4G4B4A4 = define(6)
//     val PIXELFORMAT_UNCOMPRESSED_R8G8B8A8 = define(7)
//     val PIXELFORMAT_UNCOMPRESSED_R32 = define(8)
//     val PIXELFORMAT_UNCOMPRESSED_R32G32B32 = define(9)
//     val PIXELFORMAT_UNCOMPRESSED_R32G32B32A32 = define(10)
//     val PIXELFORMAT_UNCOMPRESSED_R16 = define(11)
//     val PIXELFORMAT_UNCOMPRESSED_R16G16B16 = define(12)
//     val PIXELFORMAT_UNCOMPRESSED_R16G16B16A16 = define(13)
//     val PIXELFORMAT_COMPRESSED_DXT1_RGB = define(14)
//     val PIXELFORMAT_COMPRESSED_DXT1_RGBA = define(15)
//     val PIXELFORMAT_COMPRESSED_DXT3_RGBA = define(16)
//     val PIXELFORMAT_COMPRESSED_DXT5_RGBA = define(17)
//     val PIXELFORMAT_COMPRESSED_ETC1_RGB = define(18)
//     val PIXELFORMAT_COMPRESSED_ETC2_RGB = define(19)
//     val PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA = define(20)
//     val PIXELFORMAT_COMPRESSED_PVRT_RGB = define(21)
//     val PIXELFORMAT_COMPRESSED_PVRT_RGBA = define(22)
//     val PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA = define(23)
//     val PIXELFORMAT_COMPRESSED_ASTC_8x8_RGBA = define(24)
//     inline def getName(inline value: PixelFormat): Option[String] =
//       inline value match
//         case PIXELFORMAT_UNCOMPRESSED_GRAYSCALE =>
//           Some("PIXELFORMAT_UNCOMPRESSED_GRAYSCALE")
//         case PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA =>
//           Some("PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA")
//         case PIXELFORMAT_UNCOMPRESSED_R5G6B5 =>
//           Some("PIXELFORMAT_UNCOMPRESSED_R5G6B5")
//         case PIXELFORMAT_UNCOMPRESSED_R8G8B8 =>
//           Some("PIXELFORMAT_UNCOMPRESSED_R8G8B8")
//         case PIXELFORMAT_UNCOMPRESSED_R5G5B5A1 =>
//           Some("PIXELFORMAT_UNCOMPRESSED_R5G5B5A1")
//         case PIXELFORMAT_UNCOMPRESSED_R4G4B4A4 =>
//           Some("PIXELFORMAT_UNCOMPRESSED_R4G4B4A4")
//         case PIXELFORMAT_UNCOMPRESSED_R8G8B8A8 =>
//           Some("PIXELFORMAT_UNCOMPRESSED_R8G8B8A8")
//         case PIXELFORMAT_UNCOMPRESSED_R32 =>
//           Some("PIXELFORMAT_UNCOMPRESSED_R32")
//         case PIXELFORMAT_UNCOMPRESSED_R32G32B32 =>
//           Some("PIXELFORMAT_UNCOMPRESSED_R32G32B32")
//         case PIXELFORMAT_UNCOMPRESSED_R32G32B32A32 =>
//           Some("PIXELFORMAT_UNCOMPRESSED_R32G32B32A32")
//         case PIXELFORMAT_UNCOMPRESSED_R16 =>
//           Some("PIXELFORMAT_UNCOMPRESSED_R16")
//         case PIXELFORMAT_UNCOMPRESSED_R16G16B16 =>
//           Some("PIXELFORMAT_UNCOMPRESSED_R16G16B16")
//         case PIXELFORMAT_UNCOMPRESSED_R16G16B16A16 =>
//           Some("PIXELFORMAT_UNCOMPRESSED_R16G16B16A16")
//         case PIXELFORMAT_COMPRESSED_DXT1_RGB =>
//           Some("PIXELFORMAT_COMPRESSED_DXT1_RGB")
//         case PIXELFORMAT_COMPRESSED_DXT1_RGBA =>
//           Some("PIXELFORMAT_COMPRESSED_DXT1_RGBA")
//         case PIXELFORMAT_COMPRESSED_DXT3_RGBA =>
//           Some("PIXELFORMAT_COMPRESSED_DXT3_RGBA")
//         case PIXELFORMAT_COMPRESSED_DXT5_RGBA =>
//           Some("PIXELFORMAT_COMPRESSED_DXT5_RGBA")
//         case PIXELFORMAT_COMPRESSED_ETC1_RGB =>
//           Some("PIXELFORMAT_COMPRESSED_ETC1_RGB")
//         case PIXELFORMAT_COMPRESSED_ETC2_RGB =>
//           Some("PIXELFORMAT_COMPRESSED_ETC2_RGB")
//         case PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA =>
//           Some("PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA")
//         case PIXELFORMAT_COMPRESSED_PVRT_RGB =>
//           Some("PIXELFORMAT_COMPRESSED_PVRT_RGB")
//         case PIXELFORMAT_COMPRESSED_PVRT_RGBA =>
//           Some("PIXELFORMAT_COMPRESSED_PVRT_RGBA")
//         case PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA =>
//           Some("PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA")
//         case PIXELFORMAT_COMPRESSED_ASTC_8x8_RGBA =>
//           Some("PIXELFORMAT_COMPRESSED_ASTC_8x8_RGBA")
//         case _ => None
//     extension (a: PixelFormat)
//       inline def &(b: PixelFormat): PixelFormat = a & b
//       inline def |(b: PixelFormat): PixelFormat = a | b
//       inline def is(b: PixelFormat): Boolean = (a & b) == b
//   end PixelFormat

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type ShaderAttributeDataType = CUnsignedInt
//   object ShaderAttributeDataType extends CEnumU[ShaderAttributeDataType]:
//     given _tag: Tag[ShaderAttributeDataType] = Tag.UInt
//     inline def define(inline a: Long): ShaderAttributeDataType = a.toUInt
//     val SHADER_ATTRIB_FLOAT = define(0)
//     val SHADER_ATTRIB_VEC2 = define(1)
//     val SHADER_ATTRIB_VEC3 = define(2)
//     val SHADER_ATTRIB_VEC4 = define(3)
//     inline def getName(inline value: ShaderAttributeDataType): Option[String] =
//       inline value match
//         case SHADER_ATTRIB_FLOAT => Some("SHADER_ATTRIB_FLOAT")
//         case SHADER_ATTRIB_VEC2  => Some("SHADER_ATTRIB_VEC2")
//         case SHADER_ATTRIB_VEC3  => Some("SHADER_ATTRIB_VEC3")
//         case SHADER_ATTRIB_VEC4  => Some("SHADER_ATTRIB_VEC4")
//         case _                   => None
//     extension (a: ShaderAttributeDataType)
//       inline def &(b: ShaderAttributeDataType): ShaderAttributeDataType = a & b
//       inline def |(b: ShaderAttributeDataType): ShaderAttributeDataType = a | b
//       inline def is(b: ShaderAttributeDataType): Boolean = (a & b) == b
//   end ShaderAttributeDataType

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type ShaderLocationIndex = CUnsignedInt
//   object ShaderLocationIndex extends CEnumU[ShaderLocationIndex]:
//     given _tag: Tag[ShaderLocationIndex] = Tag.UInt
//     inline def define(inline a: Long): ShaderLocationIndex = a.toUInt
//     val SHADER_LOC_VERTEX_POSITION = define(0)
//     val SHADER_LOC_VERTEX_TEXCOORD01 = define(1)
//     val SHADER_LOC_VERTEX_TEXCOORD02 = define(2)
//     val SHADER_LOC_VERTEX_NORMAL = define(3)
//     val SHADER_LOC_VERTEX_TANGENT = define(4)
//     val SHADER_LOC_VERTEX_COLOR = define(5)
//     val SHADER_LOC_MATRIX_MVP = define(6)
//     val SHADER_LOC_MATRIX_VIEW = define(7)
//     val SHADER_LOC_MATRIX_PROJECTION = define(8)
//     val SHADER_LOC_MATRIX_MODEL = define(9)
//     val SHADER_LOC_MATRIX_NORMAL = define(10)
//     val SHADER_LOC_VECTOR_VIEW = define(11)
//     val SHADER_LOC_COLOR_DIFFUSE = define(12)
//     val SHADER_LOC_COLOR_SPECULAR = define(13)
//     val SHADER_LOC_COLOR_AMBIENT = define(14)
//     val SHADER_LOC_MAP_ALBEDO = define(15)
//     val SHADER_LOC_MAP_METALNESS = define(16)
//     val SHADER_LOC_MAP_NORMAL = define(17)
//     val SHADER_LOC_MAP_ROUGHNESS = define(18)
//     val SHADER_LOC_MAP_OCCLUSION = define(19)
//     val SHADER_LOC_MAP_EMISSION = define(20)
//     val SHADER_LOC_MAP_HEIGHT = define(21)
//     val SHADER_LOC_MAP_CUBEMAP = define(22)
//     val SHADER_LOC_MAP_IRRADIANCE = define(23)
//     val SHADER_LOC_MAP_PREFILTER = define(24)
//     val SHADER_LOC_MAP_BRDF = define(25)
//     inline def getName(inline value: ShaderLocationIndex): Option[String] =
//       inline value match
//         case SHADER_LOC_VERTEX_POSITION => Some("SHADER_LOC_VERTEX_POSITION")
//         case SHADER_LOC_VERTEX_TEXCOORD01 =>
//           Some("SHADER_LOC_VERTEX_TEXCOORD01")
//         case SHADER_LOC_VERTEX_TEXCOORD02 =>
//           Some("SHADER_LOC_VERTEX_TEXCOORD02")
//         case SHADER_LOC_VERTEX_NORMAL  => Some("SHADER_LOC_VERTEX_NORMAL")
//         case SHADER_LOC_VERTEX_TANGENT => Some("SHADER_LOC_VERTEX_TANGENT")
//         case SHADER_LOC_VERTEX_COLOR   => Some("SHADER_LOC_VERTEX_COLOR")
//         case SHADER_LOC_MATRIX_MVP     => Some("SHADER_LOC_MATRIX_MVP")
//         case SHADER_LOC_MATRIX_VIEW    => Some("SHADER_LOC_MATRIX_VIEW")
//         case SHADER_LOC_MATRIX_PROJECTION =>
//           Some("SHADER_LOC_MATRIX_PROJECTION")
//         case SHADER_LOC_MATRIX_MODEL   => Some("SHADER_LOC_MATRIX_MODEL")
//         case SHADER_LOC_MATRIX_NORMAL  => Some("SHADER_LOC_MATRIX_NORMAL")
//         case SHADER_LOC_VECTOR_VIEW    => Some("SHADER_LOC_VECTOR_VIEW")
//         case SHADER_LOC_COLOR_DIFFUSE  => Some("SHADER_LOC_COLOR_DIFFUSE")
//         case SHADER_LOC_COLOR_SPECULAR => Some("SHADER_LOC_COLOR_SPECULAR")
//         case SHADER_LOC_COLOR_AMBIENT  => Some("SHADER_LOC_COLOR_AMBIENT")
//         case SHADER_LOC_MAP_ALBEDO     => Some("SHADER_LOC_MAP_ALBEDO")
//         case SHADER_LOC_MAP_METALNESS  => Some("SHADER_LOC_MAP_METALNESS")
//         case SHADER_LOC_MAP_NORMAL     => Some("SHADER_LOC_MAP_NORMAL")
//         case SHADER_LOC_MAP_ROUGHNESS  => Some("SHADER_LOC_MAP_ROUGHNESS")
//         case SHADER_LOC_MAP_OCCLUSION  => Some("SHADER_LOC_MAP_OCCLUSION")
//         case SHADER_LOC_MAP_EMISSION   => Some("SHADER_LOC_MAP_EMISSION")
//         case SHADER_LOC_MAP_HEIGHT     => Some("SHADER_LOC_MAP_HEIGHT")
//         case SHADER_LOC_MAP_CUBEMAP    => Some("SHADER_LOC_MAP_CUBEMAP")
//         case SHADER_LOC_MAP_IRRADIANCE => Some("SHADER_LOC_MAP_IRRADIANCE")
//         case SHADER_LOC_MAP_PREFILTER  => Some("SHADER_LOC_MAP_PREFILTER")
//         case SHADER_LOC_MAP_BRDF       => Some("SHADER_LOC_MAP_BRDF")
//         case _                         => None
//     extension (a: ShaderLocationIndex)
//       inline def &(b: ShaderLocationIndex): ShaderLocationIndex = a & b
//       inline def |(b: ShaderLocationIndex): ShaderLocationIndex = a | b
//       inline def is(b: ShaderLocationIndex): Boolean = (a & b) == b
//   end ShaderLocationIndex

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type ShaderUniformDataType = CUnsignedInt
//   object ShaderUniformDataType extends CEnumU[ShaderUniformDataType]:
//     given _tag: Tag[ShaderUniformDataType] = Tag.UInt
//     inline def define(inline a: Long): ShaderUniformDataType = a.toUInt
//     val SHADER_UNIFORM_FLOAT = define(0)
//     val SHADER_UNIFORM_VEC2 = define(1)
//     val SHADER_UNIFORM_VEC3 = define(2)
//     val SHADER_UNIFORM_VEC4 = define(3)
//     val SHADER_UNIFORM_INT = define(4)
//     val SHADER_UNIFORM_IVEC2 = define(5)
//     val SHADER_UNIFORM_IVEC3 = define(6)
//     val SHADER_UNIFORM_IVEC4 = define(7)
//     val SHADER_UNIFORM_SAMPLER2D = define(8)
//     inline def getName(inline value: ShaderUniformDataType): Option[String] =
//       inline value match
//         case SHADER_UNIFORM_FLOAT     => Some("SHADER_UNIFORM_FLOAT")
//         case SHADER_UNIFORM_VEC2      => Some("SHADER_UNIFORM_VEC2")
//         case SHADER_UNIFORM_VEC3      => Some("SHADER_UNIFORM_VEC3")
//         case SHADER_UNIFORM_VEC4      => Some("SHADER_UNIFORM_VEC4")
//         case SHADER_UNIFORM_INT       => Some("SHADER_UNIFORM_INT")
//         case SHADER_UNIFORM_IVEC2     => Some("SHADER_UNIFORM_IVEC2")
//         case SHADER_UNIFORM_IVEC3     => Some("SHADER_UNIFORM_IVEC3")
//         case SHADER_UNIFORM_IVEC4     => Some("SHADER_UNIFORM_IVEC4")
//         case SHADER_UNIFORM_SAMPLER2D => Some("SHADER_UNIFORM_SAMPLER2D")
//         case _                        => None
//     extension (a: ShaderUniformDataType)
//       inline def &(b: ShaderUniformDataType): ShaderUniformDataType = a & b
//       inline def |(b: ShaderUniformDataType): ShaderUniformDataType = a | b
//       inline def is(b: ShaderUniformDataType): Boolean = (a & b) == b
//   end ShaderUniformDataType

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type TextureFilter = CUnsignedInt
//   object TextureFilter extends CEnumU[TextureFilter]:
//     given _tag: Tag[TextureFilter] = Tag.UInt
//     inline def define(inline a: Long): TextureFilter = a.toUInt
//     val TEXTURE_FILTER_POINT = define(0)
//     val TEXTURE_FILTER_BILINEAR = define(1)
//     val TEXTURE_FILTER_TRILINEAR = define(2)
//     val TEXTURE_FILTER_ANISOTROPIC_4X = define(3)
//     val TEXTURE_FILTER_ANISOTROPIC_8X = define(4)
//     val TEXTURE_FILTER_ANISOTROPIC_16X = define(5)
//     inline def getName(inline value: TextureFilter): Option[String] =
//       inline value match
//         case TEXTURE_FILTER_POINT     => Some("TEXTURE_FILTER_POINT")
//         case TEXTURE_FILTER_BILINEAR  => Some("TEXTURE_FILTER_BILINEAR")
//         case TEXTURE_FILTER_TRILINEAR => Some("TEXTURE_FILTER_TRILINEAR")
//         case TEXTURE_FILTER_ANISOTROPIC_4X =>
//           Some("TEXTURE_FILTER_ANISOTROPIC_4X")
//         case TEXTURE_FILTER_ANISOTROPIC_8X =>
//           Some("TEXTURE_FILTER_ANISOTROPIC_8X")
//         case TEXTURE_FILTER_ANISOTROPIC_16X =>
//           Some("TEXTURE_FILTER_ANISOTROPIC_16X")
//         case _ => None
//     extension (a: TextureFilter)
//       inline def &(b: TextureFilter): TextureFilter = a & b
//       inline def |(b: TextureFilter): TextureFilter = a | b
//       inline def is(b: TextureFilter): Boolean = (a & b) == b
//   end TextureFilter

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type TextureWrap = CUnsignedInt
//   object TextureWrap extends CEnumU[TextureWrap]:
//     given _tag: Tag[TextureWrap] = Tag.UInt
//     inline def define(inline a: Long): TextureWrap = a.toUInt
//     val TEXTURE_WRAP_REPEAT = define(0)
//     val TEXTURE_WRAP_CLAMP = define(1)
//     val TEXTURE_WRAP_MIRROR_REPEAT = define(2)
//     val TEXTURE_WRAP_MIRROR_CLAMP = define(3)
//     inline def getName(inline value: TextureWrap): Option[String] =
//       inline value match
//         case TEXTURE_WRAP_REPEAT        => Some("TEXTURE_WRAP_REPEAT")
//         case TEXTURE_WRAP_CLAMP         => Some("TEXTURE_WRAP_CLAMP")
//         case TEXTURE_WRAP_MIRROR_REPEAT => Some("TEXTURE_WRAP_MIRROR_REPEAT")
//         case TEXTURE_WRAP_MIRROR_CLAMP  => Some("TEXTURE_WRAP_MIRROR_CLAMP")
//         case _                          => None
//     extension (a: TextureWrap)
//       inline def &(b: TextureWrap): TextureWrap = a & b
//       inline def |(b: TextureWrap): TextureWrap = a | b
//       inline def is(b: TextureWrap): Boolean = (a & b) == b
//   end TextureWrap

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type TraceLogLevel = CUnsignedInt
//   object TraceLogLevel extends CEnumU[TraceLogLevel]:
//     given _tag: Tag[TraceLogLevel] = Tag.UInt
//     inline def define(inline a: Long): TraceLogLevel = a.toUInt
//     val LOG_ALL = define(0)
//     val LOG_TRACE = define(1)
//     val LOG_DEBUG = define(2)
//     val LOG_INFO = define(3)
//     val LOG_WARNING = define(4)
//     val LOG_ERROR = define(5)
//     val LOG_FATAL = define(6)
//     val LOG_NONE = define(7)
//     inline def getName(inline value: TraceLogLevel): Option[String] =
//       inline value match
//         case LOG_ALL     => Some("LOG_ALL")
//         case LOG_TRACE   => Some("LOG_TRACE")
//         case LOG_DEBUG   => Some("LOG_DEBUG")
//         case LOG_INFO    => Some("LOG_INFO")
//         case LOG_WARNING => Some("LOG_WARNING")
//         case LOG_ERROR   => Some("LOG_ERROR")
//         case LOG_FATAL   => Some("LOG_FATAL")
//         case LOG_NONE    => Some("LOG_NONE")
//         case _           => None
//     extension (a: TraceLogLevel)
//       inline def &(b: TraceLogLevel): TraceLogLevel = a & b
//       inline def |(b: TraceLogLevel): TraceLogLevel = a | b
//       inline def is(b: TraceLogLevel): Boolean = (a & b) == b
//   end TraceLogLevel
// end enumerations

// object aliases:
//   import _root_.raylib.enumerations.*
//   import _root_.raylib.predef.*
//   import _root_.raylib.aliases.*
//   import _root_.raylib.structs.*

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type AudioCallback = CFuncPtr2[Ptr[Byte], CUnsignedInt, Unit]
//   object AudioCallback:
//     given _tag: Tag[AudioCallback] =
//       Tag.materializeCFuncPtr2[Ptr[Byte], CUnsignedInt, Unit]
//     inline def fromPtr(ptr: Ptr[Byte]): AudioCallback = CFuncPtr.fromPtr(ptr)
//     inline def apply(
//         inline o: CFuncPtr2[Ptr[Byte], CUnsignedInt, Unit]
//     ): AudioCallback = o
//     extension (v: AudioCallback)
//       inline def value: CFuncPtr2[Ptr[Byte], CUnsignedInt, Unit] = v
//       inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
//   end AudioCallback

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   type Camera = Camera3D
//   object Camera:
//     given _tag: Tag[Camera] = Camera3D._tag
//     inline def apply(inline o: Camera3D): Camera = o
//     extension (v: Camera) inline def value: Camera3D = v

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type LoadFileDataCallback =
//     CFuncPtr2[CString, Ptr[CInt], Ptr[CUnsignedChar]]
//   object LoadFileDataCallback:
//     given _tag: Tag[LoadFileDataCallback] =
//       Tag.materializeCFuncPtr2[CString, Ptr[CInt], Ptr[CUnsignedChar]]
//     inline def fromPtr(ptr: Ptr[Byte]): LoadFileDataCallback =
//       CFuncPtr.fromPtr(ptr)
//     inline def apply(
//         inline o: CFuncPtr2[CString, Ptr[CInt], Ptr[CUnsignedChar]]
//     ): LoadFileDataCallback = o
//     extension (v: LoadFileDataCallback)
//       inline def value: CFuncPtr2[CString, Ptr[CInt], Ptr[CUnsignedChar]] = v
//       inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
//   end LoadFileDataCallback

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type LoadFileTextCallback = CFuncPtr1[CString, CString]
//   object LoadFileTextCallback:
//     given _tag: Tag[LoadFileTextCallback] =
//       Tag.materializeCFuncPtr1[CString, CString]
//     inline def fromPtr(ptr: Ptr[Byte]): LoadFileTextCallback =
//       CFuncPtr.fromPtr(ptr)
//     inline def apply(
//         inline o: CFuncPtr1[CString, CString]
//     ): LoadFileTextCallback = o
//     extension (v: LoadFileTextCallback)
//       inline def value: CFuncPtr1[CString, CString] = v
//       inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
//   end LoadFileTextCallback

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   type Quaternion = Vector4
//   object Quaternion:
//     given _tag: Tag[Quaternion] = Vector4._tag
//     inline def apply(inline o: Vector4): Quaternion = o
//     extension (v: Quaternion) inline def value: Vector4 = v

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   type RenderTexture2D = RenderTexture
//   object RenderTexture2D:
//     given _tag: Tag[RenderTexture2D] = RenderTexture._tag
//     inline def apply(inline o: RenderTexture): RenderTexture2D = o
//     extension (v: RenderTexture2D) inline def value: RenderTexture = v

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type SaveFileDataCallback =
//     CFuncPtr3[CString, Ptr[Byte], CInt, Boolean]
//   object SaveFileDataCallback:
//     given _tag: Tag[SaveFileDataCallback] =
//       Tag.materializeCFuncPtr3[CString, Ptr[Byte], CInt, Boolean]
//     inline def fromPtr(ptr: Ptr[Byte]): SaveFileDataCallback =
//       CFuncPtr.fromPtr(ptr)
//     inline def apply(
//         inline o: CFuncPtr3[CString, Ptr[Byte], CInt, Boolean]
//     ): SaveFileDataCallback = o
//     extension (v: SaveFileDataCallback)
//       inline def value: CFuncPtr3[CString, Ptr[Byte], CInt, Boolean] = v
//       inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
//   end SaveFileDataCallback

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type SaveFileTextCallback = CFuncPtr2[CString, CString, Boolean]
//   object SaveFileTextCallback:
//     given _tag: Tag[SaveFileTextCallback] =
//       Tag.materializeCFuncPtr2[CString, CString, Boolean]
//     inline def fromPtr(ptr: Ptr[Byte]): SaveFileTextCallback =
//       CFuncPtr.fromPtr(ptr)
//     inline def apply(
//         inline o: CFuncPtr2[CString, CString, Boolean]
//     ): SaveFileTextCallback = o
//     extension (v: SaveFileTextCallback)
//       inline def value: CFuncPtr2[CString, CString, Boolean] = v
//       inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
//   end SaveFileTextCallback

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   type Texture2D = Texture
//   object Texture2D:
//     given _tag: Tag[Texture2D] = Texture._tag
//     inline def apply(inline o: Texture): Texture2D = o
//     extension (v: Texture2D) inline def value: Texture = v

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   type TextureCubemap = Texture
//   object TextureCubemap:
//     given _tag: Tag[TextureCubemap] = Texture._tag
//     inline def apply(inline o: Texture): TextureCubemap = o
//     extension (v: TextureCubemap) inline def value: Texture = v

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type TraceLogCallback = CFuncPtr3[CInt, CString, va_list, Unit]
//   object TraceLogCallback:
//     given _tag: Tag[TraceLogCallback] =
//       Tag.materializeCFuncPtr3[CInt, CString, va_list, Unit]
//     inline def fromPtr(ptr: Ptr[Byte]): TraceLogCallback = CFuncPtr.fromPtr(ptr)
//     inline def apply(
//         inline o: CFuncPtr3[CInt, CString, va_list, Unit]
//     ): TraceLogCallback = o
//     extension (v: TraceLogCallback)
//       inline def value: CFuncPtr3[CInt, CString, va_list, Unit] = v
//       inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
//   end TraceLogCallback

//   type va_list = unsafe.CVarArgList
//   object va_list:
//     val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
//     inline def apply(inline o: unsafe.CVarArgList): va_list = o
//     extension (v: va_list) inline def value: unsafe.CVarArgList = v
// end aliases

// object structs:
//   import _root_.raylib.enumerations.*
//   import _root_.raylib.predef.*
//   import _root_.raylib.aliases.*
//   import _root_.raylib.structs.*

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type AudioStream = CStruct5[Ptr[rAudioBuffer], Ptr[
//     rAudioProcessor
//   ], CUnsignedInt, CUnsignedInt, CUnsignedInt]
//   object AudioStream:
//     given _tag: Tag[AudioStream] = Tag.materializeCStruct5Tag[Ptr[
//       rAudioBuffer
//     ], Ptr[rAudioProcessor], CUnsignedInt, CUnsignedInt, CUnsignedInt]
//     def apply()(using Zone): Ptr[AudioStream] =
//       scala.scalanative.unsafe.alloc[AudioStream](1)
//     def apply(
//         buffer: Ptr[rAudioBuffer],
//         processor: Ptr[rAudioProcessor],
//         sampleRate: CUnsignedInt,
//         sampleSize: CUnsignedInt,
//         channels: CUnsignedInt
//     )(using Zone): Ptr[AudioStream] =
//       val ____ptr = apply()
//       (!____ptr).buffer = buffer
//       (!____ptr).processor = processor
//       (!____ptr).sampleRate = sampleRate
//       (!____ptr).sampleSize = sampleSize
//       (!____ptr).channels = channels
//       ____ptr
//     end apply
//     extension (struct: AudioStream)
//       def buffer: Ptr[rAudioBuffer] = struct._1
//       def buffer_=(value: Ptr[rAudioBuffer]): Unit = !struct.at1 = value
//       def processor: Ptr[rAudioProcessor] = struct._2
//       def processor_=(value: Ptr[rAudioProcessor]): Unit = !struct.at2 = value
//       def sampleRate: CUnsignedInt = struct._3
//       def sampleRate_=(value: CUnsignedInt): Unit = !struct.at3 = value
//       def sampleSize: CUnsignedInt = struct._4
//       def sampleSize_=(value: CUnsignedInt): Unit = !struct.at4 = value
//       def channels: CUnsignedInt = struct._5
//       def channels_=(value: CUnsignedInt): Unit = !struct.at5 = value
//     end extension
//   end AudioStream

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type AutomationEvent =
//     CStruct3[CUnsignedInt, CUnsignedInt, CArray[CInt, Nat._4]]
//   object AutomationEvent:
//     given _tag: Tag[AutomationEvent] = Tag
//       .materializeCStruct3Tag[CUnsignedInt, CUnsignedInt, CArray[CInt, Nat._4]]
//     def apply()(using Zone): Ptr[AutomationEvent] =
//       scala.scalanative.unsafe.alloc[AutomationEvent](1)
//     def apply(
//         frame: CUnsignedInt,
//         `type`: CUnsignedInt,
//         params: CArray[CInt, Nat._4]
//     )(using Zone): Ptr[AutomationEvent] =
//       val ____ptr = apply()
//       (!____ptr).frame = frame
//       (!____ptr).`type` = `type`
//       (!____ptr).params = params
//       ____ptr
//     end apply
//     extension (struct: AutomationEvent)
//       def frame: CUnsignedInt = struct._1
//       def frame_=(value: CUnsignedInt): Unit = !struct.at1 = value
//       def `type`: CUnsignedInt = struct._2
//       def type_=(value: CUnsignedInt): Unit = !struct.at2 = value
//       def params: CArray[CInt, Nat._4] = struct._3
//       def params_=(value: CArray[CInt, Nat._4]): Unit = !struct.at3 = value
//   end AutomationEvent

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type AutomationEventList =
//     CStruct3[CUnsignedInt, CUnsignedInt, Ptr[AutomationEvent]]
//   object AutomationEventList:
//     given _tag: Tag[AutomationEventList] = Tag
//       .materializeCStruct3Tag[CUnsignedInt, CUnsignedInt, Ptr[AutomationEvent]]
//     def apply()(using Zone): Ptr[AutomationEventList] =
//       scala.scalanative.unsafe.alloc[AutomationEventList](1)
//     def apply(
//         capacity: CUnsignedInt,
//         count: CUnsignedInt,
//         events: Ptr[AutomationEvent]
//     )(using Zone): Ptr[AutomationEventList] =
//       val ____ptr = apply()
//       (!____ptr).capacity = capacity
//       (!____ptr).count = count
//       (!____ptr).events = events
//       ____ptr
//     end apply
//     extension (struct: AutomationEventList)
//       def capacity: CUnsignedInt = struct._1
//       def capacity_=(value: CUnsignedInt): Unit = !struct.at1 = value
//       def count: CUnsignedInt = struct._2
//       def count_=(value: CUnsignedInt): Unit = !struct.at2 = value
//       def events: Ptr[AutomationEvent] = struct._3
//       def events_=(value: Ptr[AutomationEvent]): Unit = !struct.at3 = value
//   end AutomationEventList

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type BoneInfo =
//     CStruct2[CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], CInt]
//   object BoneInfo:
//     given _tag: Tag[BoneInfo] = Tag
//       .materializeCStruct2Tag[CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], CInt]
//     def apply()(using Zone): Ptr[BoneInfo] =
//       scala.scalanative.unsafe.alloc[BoneInfo](1)
//     def apply(name: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], parent: CInt)(
//         using Zone
//     ): Ptr[BoneInfo] =
//       val ____ptr = apply()
//       (!____ptr).name = name
//       (!____ptr).parent = parent
//       ____ptr
//     extension (struct: BoneInfo)
//       def name: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]] = struct._1
//       def name_=(value: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]): Unit =
//         !struct.at1 = value
//       def parent: CInt = struct._2
//       def parent_=(value: CInt): Unit = !struct.at2 = value
//   end BoneInfo

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type BoundingBox = CStruct2[Vector3, Vector3]
//   object BoundingBox:
//     given _tag: Tag[BoundingBox] = Tag.materializeCStruct2Tag[Vector3, Vector3]
//     def apply()(using Zone): Ptr[BoundingBox] =
//       scala.scalanative.unsafe.alloc[BoundingBox](1)
//     def apply(min: Vector3, max: Vector3)(using Zone): Ptr[BoundingBox] =
//       val ____ptr = apply()
//       (!____ptr).min = min
//       (!____ptr).max = max
//       ____ptr
//     extension (struct: BoundingBox)
//       def min: Vector3 = struct._1
//       def min_=(value: Vector3): Unit = !struct.at1 = value
//       def max: Vector3 = struct._2
//       def max_=(value: Vector3): Unit = !struct.at2 = value
//   end BoundingBox

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Camera2D = CStruct4[Vector2, Vector2, Float, Float]
//   object Camera2D:
//     given _tag: Tag[Camera2D] =
//       Tag.materializeCStruct4Tag[Vector2, Vector2, Float, Float]
//     def apply()(using Zone): Ptr[Camera2D] =
//       scala.scalanative.unsafe.alloc[Camera2D](1)
//     def apply(offset: Vector2, target: Vector2, rotation: Float, zoom: Float)(
//         using Zone
//     ): Ptr[Camera2D] =
//       val ____ptr = apply()
//       (!____ptr).offset = offset
//       (!____ptr).target = target
//       (!____ptr).rotation = rotation
//       (!____ptr).zoom = zoom
//       ____ptr
//     extension (struct: Camera2D)
//       def offset: Vector2 = struct._1
//       def offset_=(value: Vector2): Unit = !struct.at1 = value
//       def target: Vector2 = struct._2
//       def target_=(value: Vector2): Unit = !struct.at2 = value
//       def rotation: Float = struct._3
//       def rotation_=(value: Float): Unit = !struct.at3 = value
//       def zoom: Float = struct._4
//       def zoom_=(value: Float): Unit = !struct.at4 = value
//   end Camera2D

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Camera3D = CStruct5[Vector3, Vector3, Vector3, Float, CInt]
//   object Camera3D:
//     given _tag: Tag[Camera3D] =
//       Tag.materializeCStruct5Tag[Vector3, Vector3, Vector3, Float, CInt]
//     def apply()(using Zone): Ptr[Camera3D] =
//       scala.scalanative.unsafe.alloc[Camera3D](1)
//     def apply(
//         position: Vector3,
//         target: Vector3,
//         up: Vector3,
//         fovy: Float,
//         projection: CInt
//     )(using Zone): Ptr[Camera3D] =
//       val ____ptr = apply()
//       (!____ptr).position = position
//       (!____ptr).target = target
//       (!____ptr).up = up
//       (!____ptr).fovy = fovy
//       (!____ptr).projection = projection
//       ____ptr
//     end apply
//     extension (struct: Camera3D)
//       def position: Vector3 = struct._1
//       def position_=(value: Vector3): Unit = !struct.at1 = value
//       def target: Vector3 = struct._2
//       def target_=(value: Vector3): Unit = !struct.at2 = value
//       def up: Vector3 = struct._3
//       def up_=(value: Vector3): Unit = !struct.at3 = value
//       def fovy: Float = struct._4
//       def fovy_=(value: Float): Unit = !struct.at4 = value
//       def projection: CInt = struct._5
//       def projection_=(value: CInt): Unit = !struct.at5 = value
//     end extension
//   end Camera3D

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Color =
//     CStruct4[CUnsignedChar, CUnsignedChar, CUnsignedChar, CUnsignedChar]
//   object Color:
//     given _tag: Tag[Color] = Tag.materializeCStruct4Tag[
//       CUnsignedChar,
//       CUnsignedChar,
//       CUnsignedChar,
//       CUnsignedChar
//     ]
//     def apply()(using Zone): Ptr[Color] =
//       scala.scalanative.unsafe.alloc[Color](1)
//     def apply(
//         r: CUnsignedChar,
//         g: CUnsignedChar,
//         b: CUnsignedChar,
//         a: CUnsignedChar
//     )(using Zone): Ptr[Color] =
//       val ____ptr = apply()
//       (!____ptr).r = r
//       (!____ptr).g = g
//       (!____ptr).b = b
//       (!____ptr).a = a
//       ____ptr
//     end apply
//     extension (struct: Color)
//       def r: CUnsignedChar = struct._1
//       def r_=(value: CUnsignedChar): Unit = !struct.at1 = value
//       def g: CUnsignedChar = struct._2
//       def g_=(value: CUnsignedChar): Unit = !struct.at2 = value
//       def b: CUnsignedChar = struct._3
//       def b_=(value: CUnsignedChar): Unit = !struct.at3 = value
//       def a: CUnsignedChar = struct._4
//       def a_=(value: CUnsignedChar): Unit = !struct.at4 = value
//   end Color

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type FilePathList = CStruct3[CUnsignedInt, CUnsignedInt, Ptr[CString]]
//   object FilePathList:
//     given _tag: Tag[FilePathList] =
//       Tag.materializeCStruct3Tag[CUnsignedInt, CUnsignedInt, Ptr[CString]]
//     def apply()(using Zone): Ptr[FilePathList] =
//       scala.scalanative.unsafe.alloc[FilePathList](1)
//     def apply(capacity: CUnsignedInt, count: CUnsignedInt, paths: Ptr[CString])(
//         using Zone
//     ): Ptr[FilePathList] =
//       val ____ptr = apply()
//       (!____ptr).capacity = capacity
//       (!____ptr).count = count
//       (!____ptr).paths = paths
//       ____ptr
//     extension (struct: FilePathList)
//       def capacity: CUnsignedInt = struct._1
//       def capacity_=(value: CUnsignedInt): Unit = !struct.at1 = value
//       def count: CUnsignedInt = struct._2
//       def count_=(value: CUnsignedInt): Unit = !struct.at2 = value
//       def paths: Ptr[CString] = struct._3
//       def paths_=(value: Ptr[CString]): Unit = !struct.at3 = value
//   end FilePathList

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Font =
//     CStruct6[CInt, CInt, CInt, Texture2D, Ptr[Rectangle], Ptr[GlyphInfo]]
//   object Font:
//     given _tag: Tag[Font] =
//       Tag.materializeCStruct6Tag[CInt, CInt, CInt, Texture2D, Ptr[
//         Rectangle
//       ], Ptr[GlyphInfo]]
//     def apply()(using Zone): Ptr[Font] = scala.scalanative.unsafe.alloc[Font](1)
//     def apply(
//         baseSize: CInt,
//         glyphCount: CInt,
//         glyphPadding: CInt,
//         texture: Texture2D,
//         recs: Ptr[Rectangle],
//         glyphs: Ptr[GlyphInfo]
//     )(using Zone): Ptr[Font] =
//       val ____ptr = apply()
//       (!____ptr).baseSize = baseSize
//       (!____ptr).glyphCount = glyphCount
//       (!____ptr).glyphPadding = glyphPadding
//       (!____ptr).texture = texture
//       (!____ptr).recs = recs
//       (!____ptr).glyphs = glyphs
//       ____ptr
//     end apply
//     extension (struct: Font)
//       def baseSize: CInt = struct._1
//       def baseSize_=(value: CInt): Unit = !struct.at1 = value
//       def glyphCount: CInt = struct._2
//       def glyphCount_=(value: CInt): Unit = !struct.at2 = value
//       def glyphPadding: CInt = struct._3
//       def glyphPadding_=(value: CInt): Unit = !struct.at3 = value
//       def texture: Texture2D = struct._4
//       def texture_=(value: Texture2D): Unit = !struct.at4 = value
//       def recs: Ptr[Rectangle] = struct._5
//       def recs_=(value: Ptr[Rectangle]): Unit = !struct.at5 = value
//       def glyphs: Ptr[GlyphInfo] = struct._6
//       def glyphs_=(value: Ptr[GlyphInfo]): Unit = !struct.at6 = value
//     end extension
//   end Font

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type GlyphInfo = CStruct5[CInt, CInt, CInt, CInt, Image]
//   object GlyphInfo:
//     given _tag: Tag[GlyphInfo] =
//       Tag.materializeCStruct5Tag[CInt, CInt, CInt, CInt, Image]
//     def apply()(using Zone): Ptr[GlyphInfo] =
//       scala.scalanative.unsafe.alloc[GlyphInfo](1)
//     def apply(
//         value: CInt,
//         offsetX: CInt,
//         offsetY: CInt,
//         advanceX: CInt,
//         image: Image
//     )(using Zone): Ptr[GlyphInfo] =
//       val ____ptr = apply()
//       (!____ptr).value = value
//       (!____ptr).offsetX = offsetX
//       (!____ptr).offsetY = offsetY
//       (!____ptr).advanceX = advanceX
//       (!____ptr).image = image
//       ____ptr
//     end apply
//     extension (struct: GlyphInfo)
//       def value: CInt = struct._1
//       def value_=(value: CInt): Unit = !struct.at1 = value
//       def offsetX: CInt = struct._2
//       def offsetX_=(value: CInt): Unit = !struct.at2 = value
//       def offsetY: CInt = struct._3
//       def offsetY_=(value: CInt): Unit = !struct.at3 = value
//       def advanceX: CInt = struct._4
//       def advanceX_=(value: CInt): Unit = !struct.at4 = value
//       def image: Image = struct._5
//       def image_=(value: Image): Unit = !struct.at5 = value
//     end extension
//   end GlyphInfo

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Image = CStruct5[Ptr[Byte], CInt, CInt, CInt, CInt]
//   object Image:
//     given _tag: Tag[Image] =
//       Tag.materializeCStruct5Tag[Ptr[Byte], CInt, CInt, CInt, CInt]
//     def apply()(using Zone): Ptr[Image] =
//       scala.scalanative.unsafe.alloc[Image](1)
//     def apply(
//         data: Ptr[Byte],
//         width: CInt,
//         height: CInt,
//         mipmaps: CInt,
//         format: CInt
//     )(using Zone): Ptr[Image] =
//       val ____ptr = apply()
//       (!____ptr).data = data
//       (!____ptr).width = width
//       (!____ptr).height = height
//       (!____ptr).mipmaps = mipmaps
//       (!____ptr).format = format
//       ____ptr
//     end apply
//     extension (struct: Image)
//       def data: Ptr[Byte] = struct._1
//       def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
//       def width: CInt = struct._2
//       def width_=(value: CInt): Unit = !struct.at2 = value
//       def height: CInt = struct._3
//       def height_=(value: CInt): Unit = !struct.at3 = value
//       def mipmaps: CInt = struct._4
//       def mipmaps_=(value: CInt): Unit = !struct.at4 = value
//       def format: CInt = struct._5
//       def format_=(value: CInt): Unit = !struct.at5 = value
//     end extension
//   end Image

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Material =
//     CStruct3[Shader, Ptr[MaterialMap], CArray[Float, Nat._4]]
//   object Material:
//     given _tag: Tag[Material] = Tag
//       .materializeCStruct3Tag[Shader, Ptr[MaterialMap], CArray[Float, Nat._4]]
//     def apply()(using Zone): Ptr[Material] =
//       scala.scalanative.unsafe.alloc[Material](1)
//     def apply(
//         shader: Shader,
//         maps: Ptr[MaterialMap],
//         params: CArray[Float, Nat._4]
//     )(using Zone): Ptr[Material] =
//       val ____ptr = apply()
//       (!____ptr).shader = shader
//       (!____ptr).maps = maps
//       (!____ptr).params = params
//       ____ptr
//     end apply
//     extension (struct: Material)
//       def shader: Shader = struct._1
//       def shader_=(value: Shader): Unit = !struct.at1 = value
//       def maps: Ptr[MaterialMap] = struct._2
//       def maps_=(value: Ptr[MaterialMap]): Unit = !struct.at2 = value
//       def params: CArray[Float, Nat._4] = struct._3
//       def params_=(value: CArray[Float, Nat._4]): Unit = !struct.at3 = value
//   end Material

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type MaterialMap = CStruct3[Texture2D, Color, Float]
//   object MaterialMap:
//     given _tag: Tag[MaterialMap] =
//       Tag.materializeCStruct3Tag[Texture2D, Color, Float]
//     def apply()(using Zone): Ptr[MaterialMap] =
//       scala.scalanative.unsafe.alloc[MaterialMap](1)
//     def apply(texture: Texture2D, color: Color, value: Float)(using
//         Zone
//     ): Ptr[MaterialMap] =
//       val ____ptr = apply()
//       (!____ptr).texture = texture
//       (!____ptr).color = color
//       (!____ptr).value = value
//       ____ptr
//     extension (struct: MaterialMap)
//       def texture: Texture2D = struct._1
//       def texture_=(value: Texture2D): Unit = !struct.at1 = value
//       def color: Color = struct._2
//       def color_=(value: Color): Unit = !struct.at2 = value
//       def value: Float = struct._3
//       def value_=(value: Float): Unit = !struct.at3 = value
//   end MaterialMap

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Matrix = CStruct16[
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float
//   ]
//   object Matrix:
//     given _tag: Tag[Matrix] = Tag.materializeCStruct16Tag[
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float
//     ]
//     def apply()(using Zone): Ptr[Matrix] =
//       scala.scalanative.unsafe.alloc[Matrix](1)
//     def apply(
//         m0: Float,
//         m4: Float,
//         m8: Float,
//         m12: Float,
//         m1: Float,
//         m5: Float,
//         m9: Float,
//         m13: Float,
//         m2: Float,
//         m6: Float,
//         m10: Float,
//         m14: Float,
//         m3: Float,
//         m7: Float,
//         m11: Float,
//         m15: Float
//     )(using Zone): Ptr[Matrix] =
//       val ____ptr = apply()
//       (!____ptr).m0 = m0
//       (!____ptr).m4 = m4
//       (!____ptr).m8 = m8
//       (!____ptr).m12 = m12
//       (!____ptr).m1 = m1
//       (!____ptr).m5 = m5
//       (!____ptr).m9 = m9
//       (!____ptr).m13 = m13
//       (!____ptr).m2 = m2
//       (!____ptr).m6 = m6
//       (!____ptr).m10 = m10
//       (!____ptr).m14 = m14
//       (!____ptr).m3 = m3
//       (!____ptr).m7 = m7
//       (!____ptr).m11 = m11
//       (!____ptr).m15 = m15
//       ____ptr
//     end apply
//     extension (struct: Matrix)
//       def m0: Float = struct._1
//       def m0_=(value: Float): Unit = !struct.at1 = value
//       def m4: Float = struct._2
//       def m4_=(value: Float): Unit = !struct.at2 = value
//       def m8: Float = struct._3
//       def m8_=(value: Float): Unit = !struct.at3 = value
//       def m12: Float = struct._4
//       def m12_=(value: Float): Unit = !struct.at4 = value
//       def m1: Float = struct._5
//       def m1_=(value: Float): Unit = !struct.at5 = value
//       def m5: Float = struct._6
//       def m5_=(value: Float): Unit = !struct.at6 = value
//       def m9: Float = struct._7
//       def m9_=(value: Float): Unit = !struct.at7 = value
//       def m13: Float = struct._8
//       def m13_=(value: Float): Unit = !struct.at8 = value
//       def m2: Float = struct._9
//       def m2_=(value: Float): Unit = !struct.at9 = value
//       def m6: Float = struct._10
//       def m6_=(value: Float): Unit = !struct.at10 = value
//       def m10: Float = struct._11
//       def m10_=(value: Float): Unit = !struct.at11 = value
//       def m14: Float = struct._12
//       def m14_=(value: Float): Unit = !struct.at12 = value
//       def m3: Float = struct._13
//       def m3_=(value: Float): Unit = !struct.at13 = value
//       def m7: Float = struct._14
//       def m7_=(value: Float): Unit = !struct.at14 = value
//       def m11: Float = struct._15
//       def m11_=(value: Float): Unit = !struct.at15 = value
//       def m15: Float = struct._16
//       def m15_=(value: Float): Unit = !struct.at16 = value
//     end extension
//   end Matrix

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Mesh = CStruct15[
//     CInt,
//     CInt,
//     Ptr[Float],
//     Ptr[Float],
//     Ptr[Float],
//     Ptr[Float],
//     Ptr[Float],
//     Ptr[CUnsignedChar],
//     Ptr[CUnsignedShort],
//     Ptr[Float],
//     Ptr[Float],
//     Ptr[CUnsignedChar],
//     Ptr[Float],
//     CUnsignedInt,
//     Ptr[CUnsignedInt]
//   ]
//   object Mesh:
//     given _tag: Tag[Mesh] = Tag.materializeCStruct15Tag[
//       CInt,
//       CInt,
//       Ptr[Float],
//       Ptr[Float],
//       Ptr[Float],
//       Ptr[Float],
//       Ptr[Float],
//       Ptr[CUnsignedChar],
//       Ptr[CUnsignedShort],
//       Ptr[Float],
//       Ptr[Float],
//       Ptr[CUnsignedChar],
//       Ptr[Float],
//       CUnsignedInt,
//       Ptr[CUnsignedInt]
//     ]
//     def apply()(using Zone): Ptr[Mesh] = scala.scalanative.unsafe.alloc[Mesh](1)
//     def apply(
//         vertexCount: CInt,
//         triangleCount: CInt,
//         vertices: Ptr[Float],
//         texcoords: Ptr[Float],
//         texcoords2: Ptr[Float],
//         normals: Ptr[Float],
//         tangents: Ptr[Float],
//         colors: Ptr[CUnsignedChar],
//         indices: Ptr[CUnsignedShort],
//         animVertices: Ptr[Float],
//         animNormals: Ptr[Float],
//         boneIds: Ptr[CUnsignedChar],
//         boneWeights: Ptr[Float],
//         vaoId: CUnsignedInt,
//         vboId: Ptr[CUnsignedInt]
//     )(using Zone): Ptr[Mesh] =
//       val ____ptr = apply()
//       (!____ptr).vertexCount = vertexCount
//       (!____ptr).triangleCount = triangleCount
//       (!____ptr).vertices = vertices
//       (!____ptr).texcoords = texcoords
//       (!____ptr).texcoords2 = texcoords2
//       (!____ptr).normals = normals
//       (!____ptr).tangents = tangents
//       (!____ptr).colors = colors
//       (!____ptr).indices = indices
//       (!____ptr).animVertices = animVertices
//       (!____ptr).animNormals = animNormals
//       (!____ptr).boneIds = boneIds
//       (!____ptr).boneWeights = boneWeights
//       (!____ptr).vaoId = vaoId
//       (!____ptr).vboId = vboId
//       ____ptr
//     end apply
//     extension (struct: Mesh)
//       def vertexCount: CInt = struct._1
//       def vertexCount_=(value: CInt): Unit = !struct.at1 = value
//       def triangleCount: CInt = struct._2
//       def triangleCount_=(value: CInt): Unit = !struct.at2 = value
//       def vertices: Ptr[Float] = struct._3
//       def vertices_=(value: Ptr[Float]): Unit = !struct.at3 = value
//       def texcoords: Ptr[Float] = struct._4
//       def texcoords_=(value: Ptr[Float]): Unit = !struct.at4 = value
//       def texcoords2: Ptr[Float] = struct._5
//       def texcoords2_=(value: Ptr[Float]): Unit = !struct.at5 = value
//       def normals: Ptr[Float] = struct._6
//       def normals_=(value: Ptr[Float]): Unit = !struct.at6 = value
//       def tangents: Ptr[Float] = struct._7
//       def tangents_=(value: Ptr[Float]): Unit = !struct.at7 = value
//       def colors: Ptr[CUnsignedChar] = struct._8
//       def colors_=(value: Ptr[CUnsignedChar]): Unit = !struct.at8 = value
//       def indices: Ptr[CUnsignedShort] = struct._9
//       def indices_=(value: Ptr[CUnsignedShort]): Unit = !struct.at9 = value
//       def animVertices: Ptr[Float] = struct._10
//       def animVertices_=(value: Ptr[Float]): Unit = !struct.at10 = value
//       def animNormals: Ptr[Float] = struct._11
//       def animNormals_=(value: Ptr[Float]): Unit = !struct.at11 = value
//       def boneIds: Ptr[CUnsignedChar] = struct._12
//       def boneIds_=(value: Ptr[CUnsignedChar]): Unit = !struct.at12 = value
//       def boneWeights: Ptr[Float] = struct._13
//       def boneWeights_=(value: Ptr[Float]): Unit = !struct.at13 = value
//       def vaoId: CUnsignedInt = struct._14
//       def vaoId_=(value: CUnsignedInt): Unit = !struct.at14 = value
//       def vboId: Ptr[CUnsignedInt] = struct._15
//       def vboId_=(value: Ptr[CUnsignedInt]): Unit = !struct.at15 = value
//     end extension
//   end Mesh

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Model = CStruct9[Matrix, CInt, CInt, Ptr[Mesh], Ptr[
//     Material
//   ], Ptr[CInt], CInt, Ptr[BoneInfo], Ptr[Transform]]
//   object Model:
//     given _tag: Tag[Model] = Tag.materializeCStruct9Tag[Matrix, CInt, CInt, Ptr[
//       Mesh
//     ], Ptr[Material], Ptr[CInt], CInt, Ptr[BoneInfo], Ptr[Transform]]
//     def apply()(using Zone): Ptr[Model] =
//       scala.scalanative.unsafe.alloc[Model](1)
//     def apply(
//         transform: Matrix,
//         meshCount: CInt,
//         materialCount: CInt,
//         meshes: Ptr[Mesh],
//         materials: Ptr[Material],
//         meshMaterial: Ptr[CInt],
//         boneCount: CInt,
//         bones: Ptr[BoneInfo],
//         bindPose: Ptr[Transform]
//     )(using Zone): Ptr[Model] =
//       val ____ptr = apply()
//       (!____ptr).transform = transform
//       (!____ptr).meshCount = meshCount
//       (!____ptr).materialCount = materialCount
//       (!____ptr).meshes = meshes
//       (!____ptr).materials = materials
//       (!____ptr).meshMaterial = meshMaterial
//       (!____ptr).boneCount = boneCount
//       (!____ptr).bones = bones
//       (!____ptr).bindPose = bindPose
//       ____ptr
//     end apply
//     extension (struct: Model)
//       def transform: Matrix = struct._1
//       def transform_=(value: Matrix): Unit = !struct.at1 = value
//       def meshCount: CInt = struct._2
//       def meshCount_=(value: CInt): Unit = !struct.at2 = value
//       def materialCount: CInt = struct._3
//       def materialCount_=(value: CInt): Unit = !struct.at3 = value
//       def meshes: Ptr[Mesh] = struct._4
//       def meshes_=(value: Ptr[Mesh]): Unit = !struct.at4 = value
//       def materials: Ptr[Material] = struct._5
//       def materials_=(value: Ptr[Material]): Unit = !struct.at5 = value
//       def meshMaterial: Ptr[CInt] = struct._6
//       def meshMaterial_=(value: Ptr[CInt]): Unit = !struct.at6 = value
//       def boneCount: CInt = struct._7
//       def boneCount_=(value: CInt): Unit = !struct.at7 = value
//       def bones: Ptr[BoneInfo] = struct._8
//       def bones_=(value: Ptr[BoneInfo]): Unit = !struct.at8 = value
//       def bindPose: Ptr[Transform] = struct._9
//       def bindPose_=(value: Ptr[Transform]): Unit = !struct.at9 = value
//     end extension
//   end Model

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type ModelAnimation = CStruct5[CInt, CInt, Ptr[BoneInfo], Ptr[
//     Ptr[Transform]
//   ], CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]]
//   object ModelAnimation:
//     given _tag: Tag[ModelAnimation] =
//       Tag.materializeCStruct5Tag[CInt, CInt, Ptr[BoneInfo], Ptr[
//         Ptr[Transform]
//       ], CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]]
//     def apply()(using Zone): Ptr[ModelAnimation] =
//       scala.scalanative.unsafe.alloc[ModelAnimation](1)
//     def apply(
//         boneCount: CInt,
//         frameCount: CInt,
//         bones: Ptr[BoneInfo],
//         framePoses: Ptr[Ptr[Transform]],
//         name: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
//     )(using Zone): Ptr[ModelAnimation] =
//       val ____ptr = apply()
//       (!____ptr).boneCount = boneCount
//       (!____ptr).frameCount = frameCount
//       (!____ptr).bones = bones
//       (!____ptr).framePoses = framePoses
//       (!____ptr).name = name
//       ____ptr
//     end apply
//     extension (struct: ModelAnimation)
//       def boneCount: CInt = struct._1
//       def boneCount_=(value: CInt): Unit = !struct.at1 = value
//       def frameCount: CInt = struct._2
//       def frameCount_=(value: CInt): Unit = !struct.at2 = value
//       def bones: Ptr[BoneInfo] = struct._3
//       def bones_=(value: Ptr[BoneInfo]): Unit = !struct.at3 = value
//       def framePoses: Ptr[Ptr[Transform]] = struct._4
//       def framePoses_=(value: Ptr[Ptr[Transform]]): Unit = !struct.at4 = value
//       def name: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]] = struct._5
//       def name_=(value: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]): Unit =
//         !struct.at5 = value
//     end extension
//   end ModelAnimation

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Music =
//     CStruct5[AudioStream, CUnsignedInt, Boolean, CInt, Ptr[Byte]]
//   object Music:
//     given _tag: Tag[Music] =
//       Tag.materializeCStruct5Tag[AudioStream, CUnsignedInt, Boolean, CInt, Ptr[
//         Byte
//       ]]
//     def apply()(using Zone): Ptr[Music] =
//       scala.scalanative.unsafe.alloc[Music](1)
//     def apply(
//         stream: AudioStream,
//         frameCount: CUnsignedInt,
//         looping: Boolean,
//         ctxType: CInt,
//         ctxData: Ptr[Byte]
//     )(using Zone): Ptr[Music] =
//       val ____ptr = apply()
//       (!____ptr).stream = stream
//       (!____ptr).frameCount = frameCount
//       (!____ptr).looping = looping
//       (!____ptr).ctxType = ctxType
//       (!____ptr).ctxData = ctxData
//       ____ptr
//     end apply
//     extension (struct: Music)
//       def stream: AudioStream = struct._1
//       def stream_=(value: AudioStream): Unit = !struct.at1 = value
//       def frameCount: CUnsignedInt = struct._2
//       def frameCount_=(value: CUnsignedInt): Unit = !struct.at2 = value
//       def looping: Boolean = struct._3
//       def looping_=(value: Boolean): Unit = !struct.at3 = value
//       def ctxType: CInt = struct._4
//       def ctxType_=(value: CInt): Unit = !struct.at4 = value
//       def ctxData: Ptr[Byte] = struct._5
//       def ctxData_=(value: Ptr[Byte]): Unit = !struct.at5 = value
//     end extension
//   end Music

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type NPatchInfo = CStruct6[Rectangle, CInt, CInt, CInt, CInt, CInt]
//   object NPatchInfo:
//     given _tag: Tag[NPatchInfo] =
//       Tag.materializeCStruct6Tag[Rectangle, CInt, CInt, CInt, CInt, CInt]
//     def apply()(using Zone): Ptr[NPatchInfo] =
//       scala.scalanative.unsafe.alloc[NPatchInfo](1)
//     def apply(
//         source: Rectangle,
//         left: CInt,
//         top: CInt,
//         right: CInt,
//         bottom: CInt,
//         layout: CInt
//     )(using Zone): Ptr[NPatchInfo] =
//       val ____ptr = apply()
//       (!____ptr).source = source
//       (!____ptr).left = left
//       (!____ptr).top = top
//       (!____ptr).right = right
//       (!____ptr).bottom = bottom
//       (!____ptr).layout = layout
//       ____ptr
//     end apply
//     extension (struct: NPatchInfo)
//       def source: Rectangle = struct._1
//       def source_=(value: Rectangle): Unit = !struct.at1 = value
//       def left: CInt = struct._2
//       def left_=(value: CInt): Unit = !struct.at2 = value
//       def top: CInt = struct._3
//       def top_=(value: CInt): Unit = !struct.at3 = value
//       def right: CInt = struct._4
//       def right_=(value: CInt): Unit = !struct.at4 = value
//       def bottom: CInt = struct._5
//       def bottom_=(value: CInt): Unit = !struct.at5 = value
//       def layout: CInt = struct._6
//       def layout_=(value: CInt): Unit = !struct.at6 = value
//     end extension
//   end NPatchInfo

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Ray = CStruct2[Vector3, Vector3]
//   object Ray:
//     given _tag: Tag[Ray] = Tag.materializeCStruct2Tag[Vector3, Vector3]
//     def apply()(using Zone): Ptr[Ray] = scala.scalanative.unsafe.alloc[Ray](1)
//     def apply(position: Vector3, direction: Vector3)(using Zone): Ptr[Ray] =
//       val ____ptr = apply()
//       (!____ptr).position = position
//       (!____ptr).direction = direction
//       ____ptr
//     extension (struct: Ray)
//       def position: Vector3 = struct._1
//       def position_=(value: Vector3): Unit = !struct.at1 = value
//       def direction: Vector3 = struct._2
//       def direction_=(value: Vector3): Unit = !struct.at2 = value
//   end Ray

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type RayCollision = CStruct4[Boolean, Float, Vector3, Vector3]
//   object RayCollision:
//     given _tag: Tag[RayCollision] =
//       Tag.materializeCStruct4Tag[Boolean, Float, Vector3, Vector3]
//     def apply()(using Zone): Ptr[RayCollision] =
//       scala.scalanative.unsafe.alloc[RayCollision](1)
//     def apply(hit: Boolean, distance: Float, point: Vector3, normal: Vector3)(
//         using Zone
//     ): Ptr[RayCollision] =
//       val ____ptr = apply()
//       (!____ptr).hit = hit
//       (!____ptr).distance = distance
//       (!____ptr).point = point
//       (!____ptr).normal = normal
//       ____ptr
//     extension (struct: RayCollision)
//       def hit: Boolean = struct._1
//       def hit_=(value: Boolean): Unit = !struct.at1 = value
//       def distance: Float = struct._2
//       def distance_=(value: Float): Unit = !struct.at2 = value
//       def point: Vector3 = struct._3
//       def point_=(value: Vector3): Unit = !struct.at3 = value
//       def normal: Vector3 = struct._4
//       def normal_=(value: Vector3): Unit = !struct.at4 = value
//   end RayCollision

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Rectangle = CStruct4[Float, Float, Float, Float]
//   object Rectangle:
//     given _tag: Tag[Rectangle] =
//       Tag.materializeCStruct4Tag[Float, Float, Float, Float]
//     def apply()(using Zone): Ptr[Rectangle] =
//       scala.scalanative.unsafe.alloc[Rectangle](1)
//     def apply(x: Float, y: Float, width: Float, height: Float)(using
//         Zone
//     ): Ptr[Rectangle] =
//       val ____ptr = apply()
//       (!____ptr).x = x
//       (!____ptr).y = y
//       (!____ptr).width = width
//       (!____ptr).height = height
//       ____ptr
//     extension (struct: Rectangle)
//       def x: Float = struct._1
//       def x_=(value: Float): Unit = !struct.at1 = value
//       def y: Float = struct._2
//       def y_=(value: Float): Unit = !struct.at2 = value
//       def width: Float = struct._3
//       def width_=(value: Float): Unit = !struct.at3 = value
//       def height: Float = struct._4
//       def height_=(value: Float): Unit = !struct.at4 = value
//   end Rectangle

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type RenderTexture = CStruct3[CUnsignedInt, Texture, Texture]
//   object RenderTexture:
//     given _tag: Tag[RenderTexture] =
//       Tag.materializeCStruct3Tag[CUnsignedInt, Texture, Texture]
//     def apply()(using Zone): Ptr[RenderTexture] =
//       scala.scalanative.unsafe.alloc[RenderTexture](1)
//     def apply(id: CUnsignedInt, texture: Texture, depth: Texture)(using
//         Zone
//     ): Ptr[RenderTexture] =
//       val ____ptr = apply()
//       (!____ptr).id = id
//       (!____ptr).texture = texture
//       (!____ptr).depth = depth
//       ____ptr
//     extension (struct: RenderTexture)
//       def id: CUnsignedInt = struct._1
//       def id_=(value: CUnsignedInt): Unit = !struct.at1 = value
//       def texture: Texture = struct._2
//       def texture_=(value: Texture): Unit = !struct.at2 = value
//       def depth: Texture = struct._3
//       def depth_=(value: Texture): Unit = !struct.at3 = value
//   end RenderTexture

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Shader = CStruct2[CUnsignedInt, Ptr[CInt]]
//   object Shader:
//     given _tag: Tag[Shader] =
//       Tag.materializeCStruct2Tag[CUnsignedInt, Ptr[CInt]]
//     def apply()(using Zone): Ptr[Shader] =
//       scala.scalanative.unsafe.alloc[Shader](1)
//     def apply(id: CUnsignedInt, locs: Ptr[CInt])(using Zone): Ptr[Shader] =
//       val ____ptr = apply()
//       (!____ptr).id = id
//       (!____ptr).locs = locs
//       ____ptr
//     extension (struct: Shader)
//       def id: CUnsignedInt = struct._1
//       def id_=(value: CUnsignedInt): Unit = !struct.at1 = value
//       def locs: Ptr[CInt] = struct._2
//       def locs_=(value: Ptr[CInt]): Unit = !struct.at2 = value
//   end Shader

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Sound = CStruct2[AudioStream, CUnsignedInt]
//   object Sound:
//     given _tag: Tag[Sound] =
//       Tag.materializeCStruct2Tag[AudioStream, CUnsignedInt]
//     def apply()(using Zone): Ptr[Sound] =
//       scala.scalanative.unsafe.alloc[Sound](1)
//     def apply(stream: AudioStream, frameCount: CUnsignedInt)(using
//         Zone
//     ): Ptr[Sound] =
//       val ____ptr = apply()
//       (!____ptr).stream = stream
//       (!____ptr).frameCount = frameCount
//       ____ptr
//     extension (struct: Sound)
//       def stream: AudioStream = struct._1
//       def stream_=(value: AudioStream): Unit = !struct.at1 = value
//       def frameCount: CUnsignedInt = struct._2
//       def frameCount_=(value: CUnsignedInt): Unit = !struct.at2 = value
//   end Sound

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Texture = CStruct5[CUnsignedInt, CInt, CInt, CInt, CInt]
//   object Texture:
//     given _tag: Tag[Texture] =
//       Tag.materializeCStruct5Tag[CUnsignedInt, CInt, CInt, CInt, CInt]
//     def apply()(using Zone): Ptr[Texture] =
//       scala.scalanative.unsafe.alloc[Texture](1)
//     def apply(
//         id: CUnsignedInt,
//         width: CInt,
//         height: CInt,
//         mipmaps: CInt,
//         format: CInt
//     )(using Zone): Ptr[Texture] =
//       val ____ptr = apply()
//       (!____ptr).id = id
//       (!____ptr).width = width
//       (!____ptr).height = height
//       (!____ptr).mipmaps = mipmaps
//       (!____ptr).format = format
//       ____ptr
//     end apply
//     extension (struct: Texture)
//       def id: CUnsignedInt = struct._1
//       def id_=(value: CUnsignedInt): Unit = !struct.at1 = value
//       def width: CInt = struct._2
//       def width_=(value: CInt): Unit = !struct.at2 = value
//       def height: CInt = struct._3
//       def height_=(value: CInt): Unit = !struct.at3 = value
//       def mipmaps: CInt = struct._4
//       def mipmaps_=(value: CInt): Unit = !struct.at4 = value
//       def format: CInt = struct._5
//       def format_=(value: CInt): Unit = !struct.at5 = value
//     end extension
//   end Texture

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Transform = CStruct3[Vector3, Quaternion, Vector3]
//   object Transform:
//     given _tag: Tag[Transform] =
//       Tag.materializeCStruct3Tag[Vector3, Quaternion, Vector3]
//     def apply()(using Zone): Ptr[Transform] =
//       scala.scalanative.unsafe.alloc[Transform](1)
//     def apply(translation: Vector3, rotation: Quaternion, scale: Vector3)(using
//         Zone
//     ): Ptr[Transform] =
//       val ____ptr = apply()
//       (!____ptr).translation = translation
//       (!____ptr).rotation = rotation
//       (!____ptr).scale = scale
//       ____ptr
//     extension (struct: Transform)
//       def translation: Vector3 = struct._1
//       def translation_=(value: Vector3): Unit = !struct.at1 = value
//       def rotation: Quaternion = struct._2
//       def rotation_=(value: Quaternion): Unit = !struct.at2 = value
//       def scale: Vector3 = struct._3
//       def scale_=(value: Vector3): Unit = !struct.at3 = value
//   end Transform

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Vector2 = CStruct2[Float, Float]
//   object Vector2:
//     given _tag: Tag[Vector2] = Tag.materializeCStruct2Tag[Float, Float]
//     def apply()(using Zone): Ptr[Vector2] =
//       scala.scalanative.unsafe.alloc[Vector2](1)
//     def apply(x: Float, y: Float)(using Zone): Ptr[Vector2] =
//       val ____ptr = apply()
//       (!____ptr).x = x
//       (!____ptr).y = y
//       ____ptr
//     extension (struct: Vector2)
//       def x: Float = struct._1
//       def x_=(value: Float): Unit = !struct.at1 = value
//       def y: Float = struct._2
//       def y_=(value: Float): Unit = !struct.at2 = value
//   end Vector2

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Vector3 = CStruct3[Float, Float, Float]
//   object Vector3:
//     given _tag: Tag[Vector3] = Tag.materializeCStruct3Tag[Float, Float, Float]
//     def apply()(using Zone): Ptr[Vector3] =
//       scala.scalanative.unsafe.alloc[Vector3](1)
//     def apply(x: Float, y: Float, z: Float)(using Zone): Ptr[Vector3] =
//       val ____ptr = apply()
//       (!____ptr).x = x
//       (!____ptr).y = y
//       (!____ptr).z = z
//       ____ptr
//     extension (struct: Vector3)
//       def x: Float = struct._1
//       def x_=(value: Float): Unit = !struct.at1 = value
//       def y: Float = struct._2
//       def y_=(value: Float): Unit = !struct.at2 = value
//       def z: Float = struct._3
//       def z_=(value: Float): Unit = !struct.at3 = value
//   end Vector3

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Vector4 = CStruct4[Float, Float, Float, Float]
//   object Vector4:
//     given _tag: Tag[Vector4] =
//       Tag.materializeCStruct4Tag[Float, Float, Float, Float]
//     def apply()(using Zone): Ptr[Vector4] =
//       scala.scalanative.unsafe.alloc[Vector4](1)
//     def apply(x: Float, y: Float, z: Float, w: Float)(using
//         Zone
//     ): Ptr[Vector4] =
//       val ____ptr = apply()
//       (!____ptr).x = x
//       (!____ptr).y = y
//       (!____ptr).z = z
//       (!____ptr).w = w
//       ____ptr
//     extension (struct: Vector4)
//       def x: Float = struct._1
//       def x_=(value: Float): Unit = !struct.at1 = value
//       def y: Float = struct._2
//       def y_=(value: Float): Unit = !struct.at2 = value
//       def z: Float = struct._3
//       def z_=(value: Float): Unit = !struct.at3 = value
//       def w: Float = struct._4
//       def w_=(value: Float): Unit = !struct.at4 = value
//   end Vector4

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type VrDeviceInfo = CStruct10[
//     CInt,
//     CInt,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     Float,
//     CArray[Float, Nat._4],
//     CArray[Float, Nat._4]
//   ]
//   object VrDeviceInfo:
//     given _tag: Tag[VrDeviceInfo] = Tag.materializeCStruct10Tag[
//       CInt,
//       CInt,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       Float,
//       CArray[Float, Nat._4],
//       CArray[Float, Nat._4]
//     ]
//     def apply()(using Zone): Ptr[VrDeviceInfo] =
//       scala.scalanative.unsafe.alloc[VrDeviceInfo](1)
//     def apply(
//         hResolution: CInt,
//         vResolution: CInt,
//         hScreenSize: Float,
//         vScreenSize: Float,
//         vScreenCenter: Float,
//         eyeToScreenDistance: Float,
//         lensSeparationDistance: Float,
//         interpupillaryDistance: Float,
//         lensDistortionValues: CArray[Float, Nat._4],
//         chromaAbCorrection: CArray[Float, Nat._4]
//     )(using Zone): Ptr[VrDeviceInfo] =
//       val ____ptr = apply()
//       (!____ptr).hResolution = hResolution
//       (!____ptr).vResolution = vResolution
//       (!____ptr).hScreenSize = hScreenSize
//       (!____ptr).vScreenSize = vScreenSize
//       (!____ptr).vScreenCenter = vScreenCenter
//       (!____ptr).eyeToScreenDistance = eyeToScreenDistance
//       (!____ptr).lensSeparationDistance = lensSeparationDistance
//       (!____ptr).interpupillaryDistance = interpupillaryDistance
//       (!____ptr).lensDistortionValues = lensDistortionValues
//       (!____ptr).chromaAbCorrection = chromaAbCorrection
//       ____ptr
//     end apply
//     extension (struct: VrDeviceInfo)
//       def hResolution: CInt = struct._1
//       def hResolution_=(value: CInt): Unit = !struct.at1 = value
//       def vResolution: CInt = struct._2
//       def vResolution_=(value: CInt): Unit = !struct.at2 = value
//       def hScreenSize: Float = struct._3
//       def hScreenSize_=(value: Float): Unit = !struct.at3 = value
//       def vScreenSize: Float = struct._4
//       def vScreenSize_=(value: Float): Unit = !struct.at4 = value
//       def vScreenCenter: Float = struct._5
//       def vScreenCenter_=(value: Float): Unit = !struct.at5 = value
//       def eyeToScreenDistance: Float = struct._6
//       def eyeToScreenDistance_=(value: Float): Unit = !struct.at6 = value
//       def lensSeparationDistance: Float = struct._7
//       def lensSeparationDistance_=(value: Float): Unit = !struct.at7 = value
//       def interpupillaryDistance: Float = struct._8
//       def interpupillaryDistance_=(value: Float): Unit = !struct.at8 = value
//       def lensDistortionValues: CArray[Float, Nat._4] = struct._9
//       def lensDistortionValues_=(value: CArray[Float, Nat._4]): Unit =
//         !struct.at9 = value
//       def chromaAbCorrection: CArray[Float, Nat._4] = struct._10
//       def chromaAbCorrection_=(value: CArray[Float, Nat._4]): Unit =
//         !struct.at10 = value
//     end extension
//   end VrDeviceInfo

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type VrStereoConfig = CStruct8[
//     CArray[Matrix, Nat._2],
//     CArray[Matrix, Nat._2],
//     CArray[Float, Nat._2],
//     CArray[Float, Nat._2],
//     CArray[Float, Nat._2],
//     CArray[Float, Nat._2],
//     CArray[Float, Nat._2],
//     CArray[Float, Nat._2]
//   ]
//   object VrStereoConfig:
//     given _tag: Tag[VrStereoConfig] = Tag.materializeCStruct8Tag[
//       CArray[Matrix, Nat._2],
//       CArray[Matrix, Nat._2],
//       CArray[Float, Nat._2],
//       CArray[Float, Nat._2],
//       CArray[Float, Nat._2],
//       CArray[Float, Nat._2],
//       CArray[Float, Nat._2],
//       CArray[Float, Nat._2]
//     ]
//     def apply()(using Zone): Ptr[VrStereoConfig] =
//       scala.scalanative.unsafe.alloc[VrStereoConfig](1)
//     def apply(
//         projection: CArray[Matrix, Nat._2],
//         viewOffset: CArray[Matrix, Nat._2],
//         leftLensCenter: CArray[Float, Nat._2],
//         rightLensCenter: CArray[Float, Nat._2],
//         leftScreenCenter: CArray[Float, Nat._2],
//         rightScreenCenter: CArray[Float, Nat._2],
//         scale: CArray[Float, Nat._2],
//         scaleIn: CArray[Float, Nat._2]
//     )(using Zone): Ptr[VrStereoConfig] =
//       val ____ptr = apply()
//       (!____ptr).projection = projection
//       (!____ptr).viewOffset = viewOffset
//       (!____ptr).leftLensCenter = leftLensCenter
//       (!____ptr).rightLensCenter = rightLensCenter
//       (!____ptr).leftScreenCenter = leftScreenCenter
//       (!____ptr).rightScreenCenter = rightScreenCenter
//       (!____ptr).scale = scale
//       (!____ptr).scaleIn = scaleIn
//       ____ptr
//     end apply
//     extension (struct: VrStereoConfig)
//       def projection: CArray[Matrix, Nat._2] = struct._1
//       def projection_=(value: CArray[Matrix, Nat._2]): Unit = !struct.at1 =
//         value
//       def viewOffset: CArray[Matrix, Nat._2] = struct._2
//       def viewOffset_=(value: CArray[Matrix, Nat._2]): Unit = !struct.at2 =
//         value
//       def leftLensCenter: CArray[Float, Nat._2] = struct._3
//       def leftLensCenter_=(value: CArray[Float, Nat._2]): Unit = !struct.at3 =
//         value
//       def rightLensCenter: CArray[Float, Nat._2] = struct._4
//       def rightLensCenter_=(value: CArray[Float, Nat._2]): Unit = !struct.at4 =
//         value
//       def leftScreenCenter: CArray[Float, Nat._2] = struct._5
//       def leftScreenCenter_=(value: CArray[Float, Nat._2]): Unit = !struct.at5 =
//         value
//       def rightScreenCenter: CArray[Float, Nat._2] = struct._6
//       def rightScreenCenter_=(value: CArray[Float, Nat._2]): Unit =
//         !struct.at6 = value
//       def scale: CArray[Float, Nat._2] = struct._7
//       def scale_=(value: CArray[Float, Nat._2]): Unit = !struct.at7 = value
//       def scaleIn: CArray[Float, Nat._2] = struct._8
//       def scaleIn_=(value: CArray[Float, Nat._2]): Unit = !struct.at8 = value
//     end extension
//   end VrStereoConfig

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type Wave =
//     CStruct5[CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, Ptr[Byte]]
//   object Wave:
//     given _tag: Tag[Wave] = Tag.materializeCStruct5Tag[
//       CUnsignedInt,
//       CUnsignedInt,
//       CUnsignedInt,
//       CUnsignedInt,
//       Ptr[Byte]
//     ]
//     def apply()(using Zone): Ptr[Wave] = scala.scalanative.unsafe.alloc[Wave](1)
//     def apply(
//         frameCount: CUnsignedInt,
//         sampleRate: CUnsignedInt,
//         sampleSize: CUnsignedInt,
//         channels: CUnsignedInt,
//         data: Ptr[Byte]
//     )(using Zone): Ptr[Wave] =
//       val ____ptr = apply()
//       (!____ptr).frameCount = frameCount
//       (!____ptr).sampleRate = sampleRate
//       (!____ptr).sampleSize = sampleSize
//       (!____ptr).channels = channels
//       (!____ptr).data = data
//       ____ptr
//     end apply
//     extension (struct: Wave)
//       def frameCount: CUnsignedInt = struct._1
//       def frameCount_=(value: CUnsignedInt): Unit = !struct.at1 = value
//       def sampleRate: CUnsignedInt = struct._2
//       def sampleRate_=(value: CUnsignedInt): Unit = !struct.at2 = value
//       def sampleSize: CUnsignedInt = struct._3
//       def sampleSize_=(value: CUnsignedInt): Unit = !struct.at3 = value
//       def channels: CUnsignedInt = struct._4
//       def channels_=(value: CUnsignedInt): Unit = !struct.at4 = value
//       def data: Ptr[Byte] = struct._5
//       def data_=(value: Ptr[Byte]): Unit = !struct.at5 = value
//     end extension
//   end Wave

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   opaque type float16 = CStruct1[CArray[Float, Nat.Digit2[Nat._1, Nat._6]]]
//   object float16:
//     given _tag: Tag[float16] =
//       Tag.materializeCStruct1Tag[CArray[Float, Nat.Digit2[Nat._1, Nat._6]]]
//     def apply()(using Zone): Ptr[float16] =
//       scala.scalanative.unsafe.alloc[float16](1)
//     def apply(v: CArray[Float, Nat.Digit2[Nat._1, Nat._6]])(using
//         Zone
//     ): Ptr[float16] =
//       val ____ptr = apply()
//       (!____ptr).v = v
//       ____ptr
//     extension (struct: float16)
//       def v: CArray[Float, Nat.Digit2[Nat._1, Nat._6]] = struct._1
//       def v_=(value: CArray[Float, Nat.Digit2[Nat._1, Nat._6]]): Unit =
//         !struct.at1 = value
//   end float16

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   opaque type float3 = CStruct1[CArray[Float, Nat._3]]
//   object float3:
//     given _tag: Tag[float3] = Tag.materializeCStruct1Tag[CArray[Float, Nat._3]]
//     def apply()(using Zone): Ptr[float3] =
//       scala.scalanative.unsafe.alloc[float3](1)
//     def apply(v: CArray[Float, Nat._3])(using Zone): Ptr[float3] =
//       val ____ptr = apply()
//       (!____ptr).v = v
//       ____ptr
//     extension (struct: float3)
//       def v: CArray[Float, Nat._3] = struct._1
//       def v_=(value: CArray[Float, Nat._3]): Unit = !struct.at1 = value
//   end float3

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type rAudioBuffer = CStruct0
//   object rAudioBuffer:
//     given _tag: Tag[rAudioBuffer] = Tag.materializeCStruct0Tag

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   opaque type rAudioProcessor = CStruct0
//   object rAudioProcessor:
//     given _tag: Tag[rAudioProcessor] = Tag.materializeCStruct0Tag
// end structs

// @extern
// private[raylib] object extern_functions:
//   import _root_.raylib.enumerations.*
//   import _root_.raylib.predef.*
//   import _root_.raylib.aliases.*
//   import _root_.raylib.structs.*

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def AttachAudioMixedProcessor(processor: AudioCallback): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginBlendMode(mode: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginDrawing(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginScissorMode(x: CInt, y: CInt, width: CInt, height: CInt): Unit =
//     extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ChangeDirectory(dir: CString): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Clamp(value: Float, min: Float, max: Float): Float = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ClearWindowState(flags: CUnsignedInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CloseAudioDevice(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CloseWindow(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CodepointToUTF8(codepoint: CInt, utf8Size: Ptr[CInt]): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CompressData(
//       data: Ptr[CUnsignedChar],
//       dataSize: CInt,
//       compDataSize: Ptr[CInt]
//   ): Ptr[CUnsignedChar] = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DecodeDataBase64(
//       data: Ptr[CUnsignedChar],
//       outputSize: Ptr[CInt]
//   ): Ptr[CUnsignedChar] = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DecompressData(
//       compData: Ptr[CUnsignedChar],
//       compDataSize: CInt,
//       dataSize: Ptr[CInt]
//   ): Ptr[CUnsignedChar] = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DetachAudioMixedProcessor(processor: AudioCallback): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DirectoryExists(dirPath: CString): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DisableCursor(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DisableEventWaiting(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawFPS(posX: CInt, posY: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawGrid(slices: CInt, spacing: Float): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def EnableCursor(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def EnableEventWaiting(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def EncodeDataBase64(
//       data: Ptr[CUnsignedChar],
//       dataSize: CInt,
//       outputSize: Ptr[CInt]
//   ): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def EndBlendMode(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def EndDrawing(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def EndMode2D(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def EndMode3D(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def EndScissorMode(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def EndShaderMode(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def EndTextureMode(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def EndVrStereoMode(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportDataAsCode(
//       data: Ptr[CUnsignedChar],
//       dataSize: CInt,
//       fileName: CString
//   ): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def FileExists(fileName: CString): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def FloatEquals(x: Float, y: Float): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshTangents(mesh: Ptr[Mesh]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenTextureMipmaps(texture: Ptr[Texture2D]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetApplicationDirectory(): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCharPressed(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetClipboardText(): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCodepoint(text: CString, codepointSize: Ptr[CInt]): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCodepointCount(text: CString): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCodepointNext(text: CString, codepointSize: Ptr[CInt]): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCodepointPrevious(text: CString, codepointSize: Ptr[CInt]): CInt =
//     extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCurrentMonitor(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetDirectoryPath(filePath: CString): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetFPS(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetFileExtension(fileName: CString): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetFileLength(fileName: CString): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetFileModTime(fileName: CString): CLongInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetFileName(filePath: CString): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetFileNameWithoutExt(filePath: CString): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetFrameTime(): Float = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGamepadAxisCount(gamepad: CInt): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGamepadAxisMovement(gamepad: CInt, axis: CInt): Float = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGamepadButtonPressed(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGamepadName(gamepad: CInt): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGestureDetected(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGestureDragAngle(): Float = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGestureHoldDuration(): Float = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGesturePinchAngle(): Float = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetKeyPressed(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMasterVolume(): Float = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMonitorCount(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMonitorHeight(monitor: CInt): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMonitorName(monitor: CInt): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMonitorPhysicalHeight(monitor: CInt): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMonitorPhysicalWidth(monitor: CInt): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMonitorRefreshRate(monitor: CInt): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMonitorWidth(monitor: CInt): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMouseWheelMove(): Float = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMouseX(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMouseY(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetPixelDataSize(width: CInt, height: CInt, format: CInt): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetPrevDirectoryPath(dirPath: CString): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRandomValue(min: CInt, max: CInt): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRenderHeight(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRenderWidth(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetScreenHeight(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetScreenWidth(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetTime(): Double = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetTouchPointCount(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetTouchPointId(index: CInt): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetTouchX(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetTouchY(): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWindowHandle(): Ptr[Byte] = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWorkingDirectory(): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def HideCursor(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageAlphaCrop(image: Ptr[Image], threshold: Float): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageAlphaPremultiply(image: Ptr[Image]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageBlurGaussian(image: Ptr[Image], blurSize: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageColorBrightness(image: Ptr[Image], brightness: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageColorContrast(image: Ptr[Image], contrast: Float): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageColorGrayscale(image: Ptr[Image]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageColorInvert(image: Ptr[Image]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDither(
//       image: Ptr[Image],
//       rBpp: CInt,
//       gBpp: CInt,
//       bBpp: CInt,
//       aBpp: CInt
//   ): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageFlipHorizontal(image: Ptr[Image]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageFlipVertical(image: Ptr[Image]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageFormat(image: Ptr[Image], newFormat: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageMipmaps(image: Ptr[Image]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageResize(image: Ptr[Image], newWidth: CInt, newHeight: CInt): Unit =
//     extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageResizeNN(image: Ptr[Image], newWidth: CInt, newHeight: CInt): Unit =
//     extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageRotate(image: Ptr[Image], degrees: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageRotateCCW(image: Ptr[Image]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageRotateCW(image: Ptr[Image]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def InitAudioDevice(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def InitWindow(width: CInt, height: CInt, title: CString): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsAudioDeviceReady(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsCursorHidden(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsCursorOnScreen(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsFileDropped(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsFileExtension(fileName: CString, ext: CString): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsGamepadAvailable(gamepad: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsGamepadButtonDown(gamepad: CInt, button: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsGamepadButtonPressed(gamepad: CInt, button: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsGamepadButtonReleased(gamepad: CInt, button: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsGamepadButtonUp(gamepad: CInt, button: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsGestureDetected(gesture: CUnsignedInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsKeyDown(key: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsKeyPressed(key: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsKeyPressedRepeat(key: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsKeyReleased(key: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsKeyUp(key: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsMouseButtonDown(button: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsMouseButtonPressed(button: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsMouseButtonReleased(button: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsMouseButtonUp(button: CInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsPathFile(path: CString): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsWindowFocused(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsWindowFullscreen(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsWindowHidden(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsWindowMaximized(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsWindowMinimized(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsWindowReady(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsWindowResized(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsWindowState(flag: CUnsignedInt): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Lerp(start: Float, end: Float, amount: Float): Float = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadCodepoints(text: CString, count: Ptr[CInt]): Ptr[CInt] = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFileData(fileName: CString, dataSize: Ptr[CInt]): Ptr[CUnsignedChar] =
//     extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFileText(fileName: CString): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFontData(
//       fileData: Ptr[CUnsignedChar],
//       dataSize: CInt,
//       fontSize: CInt,
//       codepoints: Ptr[CInt],
//       codepointCount: CInt,
//       `type`: CInt
//   ): Ptr[GlyphInfo] = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadMaterials(
//       fileName: CString,
//       materialCount: Ptr[CInt]
//   ): Ptr[Material] = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadModelAnimations(
//       fileName: CString,
//       animCount: Ptr[CInt]
//   ): Ptr[ModelAnimation] = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadRandomSequence(count: CUnsignedInt, min: CInt, max: CInt): Ptr[CInt] =
//     extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadUTF8(codepoints: Ptr[CInt], length: CInt): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def MaximizeWindow(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def MeasureText(text: CString, fontSize: CInt): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def MemAlloc(size: CUnsignedInt): Ptr[Byte] = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def MemFree(ptr: Ptr[Byte]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def MemRealloc(ptr: Ptr[Byte], size: CUnsignedInt): Ptr[Byte] = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def MinimizeWindow(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Normalize(value: Float, start: Float, end: Float): Float = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def OpenURL(url: CString): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PollInputEvents(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Remap(
//       value: Float,
//       inputStart: Float,
//       inputEnd: Float,
//       outputStart: Float,
//       outputEnd: Float
//   ): Float = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def RestoreWindow(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SaveFileData(
//       fileName: CString,
//       data: Ptr[Byte],
//       dataSize: CInt
//   ): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SaveFileText(fileName: CString, text: CString): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetAudioStreamBufferSizeDefault(size: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetAutomationEventBaseFrame(frame: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetAutomationEventList(list: Ptr[AutomationEventList]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetClipboardText(text: CString): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetConfigFlags(flags: CUnsignedInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetExitKey(key: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetGamepadMappings(mappings: CString): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetGesturesEnabled(flags: CUnsignedInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetLoadFileDataCallback(callback: LoadFileDataCallback): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetLoadFileTextCallback(callback: LoadFileTextCallback): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMasterVolume(volume: Float): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetModelMeshMaterial(
//       model: Ptr[Model],
//       meshId: CInt,
//       materialId: CInt
//   ): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMouseCursor(cursor: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMouseOffset(offsetX: CInt, offsetY: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMousePosition(x: CInt, y: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMouseScale(scaleX: Float, scaleY: Float): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetRandomSeed(seed: CUnsignedInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetSaveFileDataCallback(callback: SaveFileDataCallback): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetSaveFileTextCallback(callback: SaveFileTextCallback): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetTargetFPS(fps: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetTextLineSpacing(spacing: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetTraceLogCallback(callback: TraceLogCallback): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetTraceLogLevel(logLevel: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowFocused(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowIcons(images: Ptr[Image], count: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowMaxSize(width: CInt, height: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowMinSize(width: CInt, height: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowMonitor(monitor: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowOpacity(opacity: Float): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowPosition(x: CInt, y: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowSize(width: CInt, height: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowState(flags: CUnsignedInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowTitle(title: CString): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ShowCursor(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def StartAutomationEventRecording(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def StopAutomationEventRecording(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SwapScreenBuffer(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TakeScreenshot(fileName: CString): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextAppend(text: CString, append: CString, position: Ptr[CInt]): Unit =
//     extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextCopy(dst: CString, src: CString): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextFindIndex(text: CString, find: CString): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextFormat(text: CString, rest: Any*): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextInsert(text: CString, insert: CString, position: CInt): CString =
//     extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextIsEqual(text1: CString, text2: CString): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextJoin(
//       textList: Ptr[CString],
//       count: CInt,
//       delimiter: CString
//   ): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextLength(text: CString): CUnsignedInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextReplace(text: CString, replace: CString, by: CString): CString =
//     extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextSplit(
//       text: CString,
//       delimiter: CChar,
//       count: Ptr[CInt]
//   ): Ptr[CString] = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextSubtext(text: CString, position: CInt, length: CInt): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextToInteger(text: CString): CInt = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextToLower(text: CString): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextToPascal(text: CString): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TextToUpper(text: CString): CString = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ToggleBorderlessWindowed(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ToggleFullscreen(): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def TraceLog(logLevel: CInt, text: CString, rest: Any*): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadAutomationEventList(list: Ptr[AutomationEventList]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadCodepoints(codepoints: Ptr[CInt]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadFileData(data: Ptr[CUnsignedChar]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadFileText(text: CString): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadFontData(glyphs: Ptr[GlyphInfo], glyphCount: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadImageColors(colors: Ptr[Color]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadImagePalette(colors: Ptr[Color]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadModelAnimations(
//       animations: Ptr[ModelAnimation],
//       animCount: CInt
//   ): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadRandomSequence(sequence: Ptr[CInt]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadUTF8(text: CString): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadWaveSamples(samples: Ptr[Float]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateCamera(camera: Ptr[Camera], mode: CInt): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UploadMesh(mesh: Ptr[Mesh], dynamic: Boolean): Unit = extern

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3OrthoNormalize(v1: Ptr[Vector3], v2: Ptr[Vector3]): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def WaitTime(seconds: Double): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def WaveCrop(wave: Ptr[Wave], initSample: CInt, finalSample: CInt): Unit =
//     extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def WaveFormat(
//       wave: Ptr[Wave],
//       sampleRate: CInt,
//       sampleSize: CInt,
//       channels: CInt
//   ): Unit = extern

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def WindowShouldClose(): Boolean = extern

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Wrap(value: Float, min: Float, max: Float): Float = extern

//   private[raylib] def __sn_wrap_raylib_AttachAudioStreamProcessor(
//       stream: Ptr[AudioStream],
//       processor: AudioCallback
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_BeginMode2D(
//       camera: Ptr[Camera2D]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_BeginMode3D(
//       camera: Ptr[Camera3D]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_BeginShaderMode(
//       shader: Ptr[Shader]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_BeginTextureMode(
//       target: Ptr[RenderTexture2D]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_BeginVrStereoMode(
//       config: Ptr[VrStereoConfig]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionBoxSphere(
//       box: Ptr[BoundingBox],
//       center: Ptr[Vector3],
//       radius: Float
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionBoxes(
//       box1: Ptr[BoundingBox],
//       box2: Ptr[BoundingBox]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionCircleRec(
//       center: Ptr[Vector2],
//       radius: Float,
//       rec: Ptr[Rectangle]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionCircles(
//       center1: Ptr[Vector2],
//       radius1: Float,
//       center2: Ptr[Vector2],
//       radius2: Float
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionLines(
//       startPos1: Ptr[Vector2],
//       endPos1: Ptr[Vector2],
//       startPos2: Ptr[Vector2],
//       endPos2: Ptr[Vector2],
//       collisionPoint: Ptr[Vector2]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionPointCircle(
//       point: Ptr[Vector2],
//       center: Ptr[Vector2],
//       radius: Float
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionPointLine(
//       point: Ptr[Vector2],
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       threshold: CInt
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionPointPoly(
//       point: Ptr[Vector2],
//       points: Ptr[Vector2],
//       pointCount: CInt
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionPointRec(
//       point: Ptr[Vector2],
//       rec: Ptr[Rectangle]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionPointTriangle(
//       point: Ptr[Vector2],
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionRecs(
//       rec1: Ptr[Rectangle],
//       rec2: Ptr[Rectangle]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_CheckCollisionSpheres(
//       center1: Ptr[Vector3],
//       radius1: Float,
//       center2: Ptr[Vector3],
//       radius2: Float
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_ClearBackground(
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ColorAlpha(
//       color: Ptr[Color],
//       alpha: Float,
//       __return: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ColorAlphaBlend(
//       dst: Ptr[Color],
//       src: Ptr[Color],
//       tint: Ptr[Color],
//       __return: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ColorBrightness(
//       color: Ptr[Color],
//       factor: Float,
//       __return: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ColorContrast(
//       color: Ptr[Color],
//       contrast: Float,
//       __return: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ColorFromHSV(
//       hue: Float,
//       saturation: Float,
//       value: Float,
//       __return: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ColorFromNormalized(
//       normalized: Ptr[Vector4],
//       __return: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ColorNormalize(
//       color: Ptr[Color],
//       __return: Ptr[Vector4]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ColorTint(
//       color: Ptr[Color],
//       tint: Ptr[Color],
//       __return: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ColorToHSV(
//       color: Ptr[Color],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ColorToInt(color: Ptr[Color]): CInt =
//     extern

//   private[raylib] def __sn_wrap_raylib_DetachAudioStreamProcessor(
//       stream: Ptr[AudioStream],
//       processor: AudioCallback
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawBillboard(
//       camera: Ptr[Camera],
//       texture: Ptr[Texture2D],
//       position: Ptr[Vector3],
//       size: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawBillboardPro(
//       camera: Ptr[Camera],
//       texture: Ptr[Texture2D],
//       source: Ptr[Rectangle],
//       position: Ptr[Vector3],
//       up: Ptr[Vector3],
//       size: Ptr[Vector2],
//       origin: Ptr[Vector2],
//       rotation: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawBillboardRec(
//       camera: Ptr[Camera],
//       texture: Ptr[Texture2D],
//       source: Ptr[Rectangle],
//       position: Ptr[Vector3],
//       size: Ptr[Vector2],
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawBoundingBox(
//       box: Ptr[BoundingBox],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCapsule(
//       startPos: Ptr[Vector3],
//       endPos: Ptr[Vector3],
//       radius: Float,
//       slices: CInt,
//       rings: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCapsuleWires(
//       startPos: Ptr[Vector3],
//       endPos: Ptr[Vector3],
//       radius: Float,
//       slices: CInt,
//       rings: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCircle(
//       centerX: CInt,
//       centerY: CInt,
//       radius: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCircle3D(
//       center: Ptr[Vector3],
//       radius: Float,
//       rotationAxis: Ptr[Vector3],
//       rotationAngle: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCircleGradient(
//       centerX: CInt,
//       centerY: CInt,
//       radius: Float,
//       color1: Ptr[Color],
//       color2: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCircleLines(
//       centerX: CInt,
//       centerY: CInt,
//       radius: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCircleLinesV(
//       center: Ptr[Vector2],
//       radius: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCircleSector(
//       center: Ptr[Vector2],
//       radius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCircleSectorLines(
//       center: Ptr[Vector2],
//       radius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCircleV(
//       center: Ptr[Vector2],
//       radius: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCube(
//       position: Ptr[Vector3],
//       width: Float,
//       height: Float,
//       length: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCubeV(
//       position: Ptr[Vector3],
//       size: Ptr[Vector3],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCubeWires(
//       position: Ptr[Vector3],
//       width: Float,
//       height: Float,
//       length: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCubeWiresV(
//       position: Ptr[Vector3],
//       size: Ptr[Vector3],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCylinder(
//       position: Ptr[Vector3],
//       radiusTop: Float,
//       radiusBottom: Float,
//       height: Float,
//       slices: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCylinderEx(
//       startPos: Ptr[Vector3],
//       endPos: Ptr[Vector3],
//       startRadius: Float,
//       endRadius: Float,
//       sides: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCylinderWires(
//       position: Ptr[Vector3],
//       radiusTop: Float,
//       radiusBottom: Float,
//       height: Float,
//       slices: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawCylinderWiresEx(
//       startPos: Ptr[Vector3],
//       endPos: Ptr[Vector3],
//       startRadius: Float,
//       endRadius: Float,
//       sides: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawEllipse(
//       centerX: CInt,
//       centerY: CInt,
//       radiusH: Float,
//       radiusV: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawEllipseLines(
//       centerX: CInt,
//       centerY: CInt,
//       radiusH: Float,
//       radiusV: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawLine(
//       startPosX: CInt,
//       startPosY: CInt,
//       endPosX: CInt,
//       endPosY: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawLine3D(
//       startPos: Ptr[Vector3],
//       endPos: Ptr[Vector3],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawLineBezier(
//       startPos: Ptr[Vector2],
//       endPos: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawLineEx(
//       startPos: Ptr[Vector2],
//       endPos: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawLineStrip(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawLineV(
//       startPos: Ptr[Vector2],
//       endPos: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawMesh(
//       mesh: Ptr[Mesh],
//       material: Ptr[Material],
//       transform: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawMeshInstanced(
//       mesh: Ptr[Mesh],
//       material: Ptr[Material],
//       transforms: Ptr[Matrix],
//       instances: CInt
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawModel(
//       model: Ptr[Model],
//       position: Ptr[Vector3],
//       scale: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawModelEx(
//       model: Ptr[Model],
//       position: Ptr[Vector3],
//       rotationAxis: Ptr[Vector3],
//       rotationAngle: Float,
//       scale: Ptr[Vector3],
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawModelWires(
//       model: Ptr[Model],
//       position: Ptr[Vector3],
//       scale: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawModelWiresEx(
//       model: Ptr[Model],
//       position: Ptr[Vector3],
//       rotationAxis: Ptr[Vector3],
//       rotationAngle: Float,
//       scale: Ptr[Vector3],
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawPixel(
//       posX: CInt,
//       posY: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawPixelV(
//       position: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawPlane(
//       centerPos: Ptr[Vector3],
//       size: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawPoint3D(
//       position: Ptr[Vector3],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawPoly(
//       center: Ptr[Vector2],
//       sides: CInt,
//       radius: Float,
//       rotation: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawPolyLines(
//       center: Ptr[Vector2],
//       sides: CInt,
//       radius: Float,
//       rotation: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawPolyLinesEx(
//       center: Ptr[Vector2],
//       sides: CInt,
//       radius: Float,
//       rotation: Float,
//       lineThick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRay(
//       ray: Ptr[Ray],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRectangle(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRectangleGradientEx(
//       rec: Ptr[Rectangle],
//       col1: Ptr[Color],
//       col2: Ptr[Color],
//       col3: Ptr[Color],
//       col4: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRectangleGradientH(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color1: Ptr[Color],
//       color2: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRectangleGradientV(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color1: Ptr[Color],
//       color2: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRectangleLines(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRectangleLinesEx(
//       rec: Ptr[Rectangle],
//       lineThick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRectanglePro(
//       rec: Ptr[Rectangle],
//       origin: Ptr[Vector2],
//       rotation: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRectangleRec(
//       rec: Ptr[Rectangle],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRectangleRounded(
//       rec: Ptr[Rectangle],
//       roundness: Float,
//       segments: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRectangleRoundedLines(
//       rec: Ptr[Rectangle],
//       roundness: Float,
//       segments: CInt,
//       lineThick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRectangleV(
//       position: Ptr[Vector2],
//       size: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRing(
//       center: Ptr[Vector2],
//       innerRadius: Float,
//       outerRadius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawRingLines(
//       center: Ptr[Vector2],
//       innerRadius: Float,
//       outerRadius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSphere(
//       centerPos: Ptr[Vector3],
//       radius: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSphereEx(
//       centerPos: Ptr[Vector3],
//       radius: Float,
//       rings: CInt,
//       slices: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSphereWires(
//       centerPos: Ptr[Vector3],
//       radius: Float,
//       rings: CInt,
//       slices: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSplineBasis(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSplineBezierCubic(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSplineBezierQuadratic(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSplineCatmullRom(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSplineLinear(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSplineSegmentBasis(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSplineSegmentBezierCubic(
//       p1: Ptr[Vector2],
//       c2: Ptr[Vector2],
//       c3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSplineSegmentBezierQuadratic(
//       p1: Ptr[Vector2],
//       c2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSplineSegmentCatmullRom(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawSplineSegmentLinear(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawText(
//       text: CString,
//       posX: CInt,
//       posY: CInt,
//       fontSize: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTextCodepoint(
//       font: Ptr[Font],
//       codepoint: CInt,
//       position: Ptr[Vector2],
//       fontSize: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTextCodepoints(
//       font: Ptr[Font],
//       codepoints: Ptr[CInt],
//       codepointCount: CInt,
//       position: Ptr[Vector2],
//       fontSize: Float,
//       spacing: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTextEx(
//       font: Ptr[Font],
//       text: CString,
//       position: Ptr[Vector2],
//       fontSize: Float,
//       spacing: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTextPro(
//       font: Ptr[Font],
//       text: CString,
//       position: Ptr[Vector2],
//       origin: Ptr[Vector2],
//       rotation: Float,
//       fontSize: Float,
//       spacing: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTexture(
//       texture: Ptr[Texture2D],
//       posX: CInt,
//       posY: CInt,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTextureEx(
//       texture: Ptr[Texture2D],
//       position: Ptr[Vector2],
//       rotation: Float,
//       scale: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTextureNPatch(
//       texture: Ptr[Texture2D],
//       nPatchInfo: Ptr[NPatchInfo],
//       dest: Ptr[Rectangle],
//       origin: Ptr[Vector2],
//       rotation: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTexturePro(
//       texture: Ptr[Texture2D],
//       source: Ptr[Rectangle],
//       dest: Ptr[Rectangle],
//       origin: Ptr[Vector2],
//       rotation: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTextureRec(
//       texture: Ptr[Texture2D],
//       source: Ptr[Rectangle],
//       position: Ptr[Vector2],
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTextureV(
//       texture: Ptr[Texture2D],
//       position: Ptr[Vector2],
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTriangle(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2],
//       v3: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTriangle3D(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       v3: Ptr[Vector3],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTriangleFan(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTriangleLines(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2],
//       v3: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTriangleStrip(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_DrawTriangleStrip3D(
//       points: Ptr[Vector3],
//       pointCount: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ExportAutomationEventList(
//       list: Ptr[AutomationEventList],
//       fileName: CString
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_ExportFontAsCode(
//       font: Ptr[Font],
//       fileName: CString
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_ExportImage(
//       image: Ptr[Image],
//       fileName: CString
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_ExportImageAsCode(
//       image: Ptr[Image],
//       fileName: CString
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_ExportImageToMemory(
//       image: Ptr[Image],
//       fileType: CString,
//       fileSize: Ptr[CInt]
//   ): Ptr[CUnsignedChar] = extern

//   private[raylib] def __sn_wrap_raylib_ExportMesh(
//       mesh: Ptr[Mesh],
//       fileName: CString
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_ExportWave(
//       wave: Ptr[Wave],
//       fileName: CString
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_ExportWaveAsCode(
//       wave: Ptr[Wave],
//       fileName: CString
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_Fade(
//       color: Ptr[Color],
//       alpha: Float,
//       __return: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenImageCellular(
//       width: CInt,
//       height: CInt,
//       tileSize: CInt,
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenImageChecked(
//       width: CInt,
//       height: CInt,
//       checksX: CInt,
//       checksY: CInt,
//       col1: Ptr[Color],
//       col2: Ptr[Color],
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenImageColor(
//       width: CInt,
//       height: CInt,
//       color: Ptr[Color],
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenImageFontAtlas(
//       glyphs: Ptr[GlyphInfo],
//       glyphRecs: Ptr[Ptr[Rectangle]],
//       glyphCount: CInt,
//       fontSize: CInt,
//       padding: CInt,
//       packMethod: CInt,
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenImageGradientLinear(
//       width: CInt,
//       height: CInt,
//       direction: CInt,
//       start: Ptr[Color],
//       end: Ptr[Color],
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenImageGradientRadial(
//       width: CInt,
//       height: CInt,
//       density: Float,
//       inner: Ptr[Color],
//       outer: Ptr[Color],
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenImageGradientSquare(
//       width: CInt,
//       height: CInt,
//       density: Float,
//       inner: Ptr[Color],
//       outer: Ptr[Color],
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenImagePerlinNoise(
//       width: CInt,
//       height: CInt,
//       offsetX: CInt,
//       offsetY: CInt,
//       scale: Float,
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenImageText(
//       width: CInt,
//       height: CInt,
//       text: CString,
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenImageWhiteNoise(
//       width: CInt,
//       height: CInt,
//       factor: Float,
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenMeshCone(
//       radius: Float,
//       height: Float,
//       slices: CInt,
//       __return: Ptr[Mesh]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenMeshCube(
//       width: Float,
//       height: Float,
//       length: Float,
//       __return: Ptr[Mesh]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenMeshCubicmap(
//       cubicmap: Ptr[Image],
//       cubeSize: Ptr[Vector3],
//       __return: Ptr[Mesh]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenMeshCylinder(
//       radius: Float,
//       height: Float,
//       slices: CInt,
//       __return: Ptr[Mesh]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenMeshHeightmap(
//       heightmap: Ptr[Image],
//       size: Ptr[Vector3],
//       __return: Ptr[Mesh]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenMeshHemiSphere(
//       radius: Float,
//       rings: CInt,
//       slices: CInt,
//       __return: Ptr[Mesh]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenMeshKnot(
//       radius: Float,
//       size: Float,
//       radSeg: CInt,
//       sides: CInt,
//       __return: Ptr[Mesh]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenMeshPlane(
//       width: Float,
//       length: Float,
//       resX: CInt,
//       resZ: CInt,
//       __return: Ptr[Mesh]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenMeshPoly(
//       sides: CInt,
//       radius: Float,
//       __return: Ptr[Mesh]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenMeshSphere(
//       radius: Float,
//       rings: CInt,
//       slices: CInt,
//       __return: Ptr[Mesh]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GenMeshTorus(
//       radius: Float,
//       size: Float,
//       radSeg: CInt,
//       sides: CInt,
//       __return: Ptr[Mesh]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetCameraMatrix(
//       camera: Ptr[Camera],
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetCameraMatrix2D(
//       camera: Ptr[Camera2D],
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetCollisionRec(
//       rec1: Ptr[Rectangle],
//       rec2: Ptr[Rectangle],
//       __return: Ptr[Rectangle]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetColor(
//       hexValue: CUnsignedInt,
//       __return: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetFontDefault(
//       __return: Ptr[Font]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetGestureDragVector(
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetGesturePinchVector(
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetGlyphAtlasRec(
//       font: Ptr[Font],
//       codepoint: CInt,
//       __return: Ptr[Rectangle]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetGlyphIndex(
//       font: Ptr[Font],
//       codepoint: CInt
//   ): CInt = extern

//   private[raylib] def __sn_wrap_raylib_GetGlyphInfo(
//       font: Ptr[Font],
//       codepoint: CInt,
//       __return: Ptr[GlyphInfo]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetImageAlphaBorder(
//       image: Ptr[Image],
//       threshold: Float,
//       __return: Ptr[Rectangle]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetImageColor(
//       image: Ptr[Image],
//       x: CInt,
//       y: CInt,
//       __return: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetMeshBoundingBox(
//       mesh: Ptr[Mesh],
//       __return: Ptr[BoundingBox]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetModelBoundingBox(
//       model: Ptr[Model],
//       __return: Ptr[BoundingBox]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetMonitorPosition(
//       monitor: CInt,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetMouseDelta(
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetMousePosition(
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetMouseRay(
//       mousePosition: Ptr[Vector2],
//       camera: Ptr[Camera],
//       __return: Ptr[Ray]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetMouseWheelMoveV(
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetMusicTimeLength(
//       music: Ptr[Music]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_GetMusicTimePlayed(
//       music: Ptr[Music]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_GetPixelColor(
//       srcPtr: Ptr[Byte],
//       format: CInt,
//       __return: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetRayCollisionBox(
//       ray: Ptr[Ray],
//       box: Ptr[BoundingBox],
//       __return: Ptr[RayCollision]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetRayCollisionMesh(
//       ray: Ptr[Ray],
//       mesh: Ptr[Mesh],
//       transform: Ptr[Matrix],
//       __return: Ptr[RayCollision]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetRayCollisionQuad(
//       ray: Ptr[Ray],
//       p1: Ptr[Vector3],
//       p2: Ptr[Vector3],
//       p3: Ptr[Vector3],
//       p4: Ptr[Vector3],
//       __return: Ptr[RayCollision]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetRayCollisionSphere(
//       ray: Ptr[Ray],
//       center: Ptr[Vector3],
//       radius: Float,
//       __return: Ptr[RayCollision]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetRayCollisionTriangle(
//       ray: Ptr[Ray],
//       p1: Ptr[Vector3],
//       p2: Ptr[Vector3],
//       p3: Ptr[Vector3],
//       __return: Ptr[RayCollision]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetScreenToWorld2D(
//       position: Ptr[Vector2],
//       camera: Ptr[Camera2D],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetShaderLocation(
//       shader: Ptr[Shader],
//       uniformName: CString
//   ): CInt = extern

//   private[raylib] def __sn_wrap_raylib_GetShaderLocationAttrib(
//       shader: Ptr[Shader],
//       attribName: CString
//   ): CInt = extern

//   private[raylib] def __sn_wrap_raylib_GetSplinePointBasis(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       t: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetSplinePointBezierCubic(
//       p1: Ptr[Vector2],
//       c2: Ptr[Vector2],
//       c3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       t: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetSplinePointBezierQuad(
//       p1: Ptr[Vector2],
//       c2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       t: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetSplinePointCatmullRom(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       t: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetSplinePointLinear(
//       startPos: Ptr[Vector2],
//       endPos: Ptr[Vector2],
//       t: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetTouchPosition(
//       index: CInt,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetWindowPosition(
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetWindowScaleDPI(
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetWorldToScreen(
//       position: Ptr[Vector3],
//       camera: Ptr[Camera],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetWorldToScreen2D(
//       position: Ptr[Vector2],
//       camera: Ptr[Camera2D],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_GetWorldToScreenEx(
//       position: Ptr[Vector3],
//       camera: Ptr[Camera],
//       width: CInt,
//       height: CInt,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageAlphaClear(
//       image: Ptr[Image],
//       color: Ptr[Color],
//       threshold: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageAlphaMask(
//       image: Ptr[Image],
//       alphaMask: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageClearBackground(
//       dst: Ptr[Image],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageColorReplace(
//       image: Ptr[Image],
//       color: Ptr[Color],
//       replace: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageColorTint(
//       image: Ptr[Image],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageCopy(
//       image: Ptr[Image],
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageCrop(
//       image: Ptr[Image],
//       crop: Ptr[Rectangle]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDraw(
//       dst: Ptr[Image],
//       src: Ptr[Image],
//       srcRec: Ptr[Rectangle],
//       dstRec: Ptr[Rectangle],
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawCircle(
//       dst: Ptr[Image],
//       centerX: CInt,
//       centerY: CInt,
//       radius: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawCircleLines(
//       dst: Ptr[Image],
//       centerX: CInt,
//       centerY: CInt,
//       radius: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawCircleLinesV(
//       dst: Ptr[Image],
//       center: Ptr[Vector2],
//       radius: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawCircleV(
//       dst: Ptr[Image],
//       center: Ptr[Vector2],
//       radius: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawLine(
//       dst: Ptr[Image],
//       startPosX: CInt,
//       startPosY: CInt,
//       endPosX: CInt,
//       endPosY: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawLineV(
//       dst: Ptr[Image],
//       start: Ptr[Vector2],
//       end: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawPixel(
//       dst: Ptr[Image],
//       posX: CInt,
//       posY: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawPixelV(
//       dst: Ptr[Image],
//       position: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawRectangle(
//       dst: Ptr[Image],
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawRectangleLines(
//       dst: Ptr[Image],
//       rec: Ptr[Rectangle],
//       thick: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawRectangleRec(
//       dst: Ptr[Image],
//       rec: Ptr[Rectangle],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawRectangleV(
//       dst: Ptr[Image],
//       position: Ptr[Vector2],
//       size: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawText(
//       dst: Ptr[Image],
//       text: CString,
//       posX: CInt,
//       posY: CInt,
//       fontSize: CInt,
//       color: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageDrawTextEx(
//       dst: Ptr[Image],
//       font: Ptr[Font],
//       text: CString,
//       position: Ptr[Vector2],
//       fontSize: Float,
//       spacing: Float,
//       tint: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageFromImage(
//       image: Ptr[Image],
//       rec: Ptr[Rectangle],
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageResizeCanvas(
//       image: Ptr[Image],
//       newWidth: CInt,
//       newHeight: CInt,
//       offsetX: CInt,
//       offsetY: CInt,
//       fill: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageText(
//       text: CString,
//       fontSize: CInt,
//       color: Ptr[Color],
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageTextEx(
//       font: Ptr[Font],
//       text: CString,
//       fontSize: Float,
//       spacing: Float,
//       tint: Ptr[Color],
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ImageToPOT(
//       image: Ptr[Image],
//       fill: Ptr[Color]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_IsAudioStreamPlaying(
//       stream: Ptr[AudioStream]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsAudioStreamProcessed(
//       stream: Ptr[AudioStream]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsAudioStreamReady(
//       stream: Ptr[AudioStream]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsFontReady(font: Ptr[Font]): Boolean =
//     extern

//   private[raylib] def __sn_wrap_raylib_IsImageReady(
//       image: Ptr[Image]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsMaterialReady(
//       material: Ptr[Material]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsModelAnimationValid(
//       model: Ptr[Model],
//       anim: Ptr[ModelAnimation]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsModelReady(
//       model: Ptr[Model]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsMusicReady(
//       music: Ptr[Music]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsMusicStreamPlaying(
//       music: Ptr[Music]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsRenderTextureReady(
//       target: Ptr[RenderTexture2D]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsShaderReady(
//       shader: Ptr[Shader]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsSoundPlaying(
//       sound: Ptr[Sound]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsSoundReady(
//       sound: Ptr[Sound]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsTextureReady(
//       texture: Ptr[Texture2D]
//   ): Boolean = extern

//   private[raylib] def __sn_wrap_raylib_IsWaveReady(wave: Ptr[Wave]): Boolean =
//     extern

//   private[raylib] def __sn_wrap_raylib_LoadAudioStream(
//       sampleRate: CUnsignedInt,
//       sampleSize: CUnsignedInt,
//       channels: CUnsignedInt,
//       __return: Ptr[AudioStream]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadAutomationEventList(
//       fileName: CString,
//       __return: Ptr[AutomationEventList]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadDirectoryFiles(
//       dirPath: CString,
//       __return: Ptr[FilePathList]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadDirectoryFilesEx(
//       basePath: CString,
//       filter: CString,
//       scanSubdirs: Boolean,
//       __return: Ptr[FilePathList]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadDroppedFiles(
//       __return: Ptr[FilePathList]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadFont(
//       fileName: CString,
//       __return: Ptr[Font]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadFontEx(
//       fileName: CString,
//       fontSize: CInt,
//       codepoints: Ptr[CInt],
//       codepointCount: CInt,
//       __return: Ptr[Font]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadFontFromImage(
//       image: Ptr[Image],
//       key: Ptr[Color],
//       firstChar: CInt,
//       __return: Ptr[Font]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadFontFromMemory(
//       fileType: CString,
//       fileData: Ptr[CUnsignedChar],
//       dataSize: CInt,
//       fontSize: CInt,
//       codepoints: Ptr[CInt],
//       codepointCount: CInt,
//       __return: Ptr[Font]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadImage(
//       fileName: CString,
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadImageAnim(
//       fileName: CString,
//       frames: Ptr[CInt],
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadImageColors(
//       image: Ptr[Image]
//   ): Ptr[Color] = extern

//   private[raylib] def __sn_wrap_raylib_LoadImageFromMemory(
//       fileType: CString,
//       fileData: Ptr[CUnsignedChar],
//       dataSize: CInt,
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadImageFromScreen(
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadImageFromTexture(
//       texture: Ptr[Texture2D],
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadImagePalette(
//       image: Ptr[Image],
//       maxPaletteSize: CInt,
//       colorCount: Ptr[CInt]
//   ): Ptr[Color] = extern

//   private[raylib] def __sn_wrap_raylib_LoadImageRaw(
//       fileName: CString,
//       width: CInt,
//       height: CInt,
//       format: CInt,
//       headerSize: CInt,
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadImageSvg(
//       fileNameOrString: CString,
//       width: CInt,
//       height: CInt,
//       __return: Ptr[Image]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadMaterialDefault(
//       __return: Ptr[Material]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadModel(
//       fileName: CString,
//       __return: Ptr[Model]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadModelFromMesh(
//       mesh: Ptr[Mesh],
//       __return: Ptr[Model]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadMusicStream(
//       fileName: CString,
//       __return: Ptr[Music]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadMusicStreamFromMemory(
//       fileType: CString,
//       data: Ptr[CUnsignedChar],
//       dataSize: CInt,
//       __return: Ptr[Music]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadRenderTexture(
//       width: CInt,
//       height: CInt,
//       __return: Ptr[RenderTexture2D]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadShader(
//       vsFileName: CString,
//       fsFileName: CString,
//       __return: Ptr[Shader]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadShaderFromMemory(
//       vsCode: CString,
//       fsCode: CString,
//       __return: Ptr[Shader]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadSound(
//       fileName: CString,
//       __return: Ptr[Sound]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadSoundAlias(
//       source: Ptr[Sound],
//       __return: Ptr[Sound]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadSoundFromWave(
//       wave: Ptr[Wave],
//       __return: Ptr[Sound]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadTexture(
//       fileName: CString,
//       __return: Ptr[Texture2D]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadTextureCubemap(
//       image: Ptr[Image],
//       layout: CInt,
//       __return: Ptr[TextureCubemap]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadTextureFromImage(
//       image: Ptr[Image],
//       __return: Ptr[Texture2D]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadVrStereoConfig(
//       device: Ptr[VrDeviceInfo],
//       __return: Ptr[VrStereoConfig]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadWave(
//       fileName: CString,
//       __return: Ptr[Wave]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadWaveFromMemory(
//       fileType: CString,
//       fileData: Ptr[CUnsignedChar],
//       dataSize: CInt,
//       __return: Ptr[Wave]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_LoadWaveSamples(
//       wave: Ptr[Wave]
//   ): Ptr[Float] = extern

//   private[raylib] def __sn_wrap_raylib_MatrixAdd(
//       left: Ptr[Matrix],
//       right: Ptr[Matrix],
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixDeterminant(
//       mat: Ptr[Matrix]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_MatrixFrustum(
//       left: Double,
//       right: Double,
//       bottom: Double,
//       top: Double,
//       near: Double,
//       far: Double,
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixIdentity(
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixInvert(
//       mat: Ptr[Matrix],
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixLookAt(
//       eye: Ptr[Vector3],
//       target: Ptr[Vector3],
//       up: Ptr[Vector3],
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixMultiply(
//       left: Ptr[Matrix],
//       right: Ptr[Matrix],
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixOrtho(
//       left: Double,
//       right: Double,
//       bottom: Double,
//       top: Double,
//       nearPlane: Double,
//       farPlane: Double,
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixPerspective(
//       fovY: Double,
//       aspect: Double,
//       nearPlane: Double,
//       farPlane: Double,
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixRotate(
//       axis: Ptr[Vector3],
//       angle: Float,
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixRotateX(
//       angle: Float,
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixRotateXYZ(
//       angle: Ptr[Vector3],
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixRotateY(
//       angle: Float,
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixRotateZ(
//       angle: Float,
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixRotateZYX(
//       angle: Ptr[Vector3],
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixScale(
//       x: Float,
//       y: Float,
//       z: Float,
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixSubtract(
//       left: Ptr[Matrix],
//       right: Ptr[Matrix],
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixToFloatV(
//       mat: Ptr[Matrix],
//       __return: Ptr[float16]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixTrace(mat: Ptr[Matrix]): Float =
//     extern

//   private[raylib] def __sn_wrap_raylib_MatrixTranslate(
//       x: Float,
//       y: Float,
//       z: Float,
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MatrixTranspose(
//       mat: Ptr[Matrix],
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_MeasureTextEx(
//       font: Ptr[Font],
//       text: CString,
//       fontSize: Float,
//       spacing: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_PauseAudioStream(
//       stream: Ptr[AudioStream]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_PauseMusicStream(
//       music: Ptr[Music]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_PauseSound(sound: Ptr[Sound]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_PlayAudioStream(
//       stream: Ptr[AudioStream]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_PlayAutomationEvent(
//       event: Ptr[AutomationEvent]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_PlayMusicStream(
//       music: Ptr[Music]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_PlaySound(sound: Ptr[Sound]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_QuaternionAdd(
//       q1: Ptr[Quaternion],
//       q2: Ptr[Quaternion],
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionAddValue(
//       q: Ptr[Quaternion],
//       add: Float,
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionDivide(
//       q1: Ptr[Quaternion],
//       q2: Ptr[Quaternion],
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionEquals(
//       p: Ptr[Quaternion],
//       q: Ptr[Quaternion]
//   ): CInt = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionFromAxisAngle(
//       axis: Ptr[Vector3],
//       angle: Float,
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionFromEuler(
//       pitch: Float,
//       yaw: Float,
//       roll: Float,
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionFromMatrix(
//       mat: Ptr[Matrix],
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionFromVector3ToVector3(
//       from: Ptr[Vector3],
//       to: Ptr[Vector3],
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionIdentity(
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionInvert(
//       q: Ptr[Quaternion],
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionLength(
//       q: Ptr[Quaternion]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionLerp(
//       q1: Ptr[Quaternion],
//       q2: Ptr[Quaternion],
//       amount: Float,
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionMultiply(
//       q1: Ptr[Quaternion],
//       q2: Ptr[Quaternion],
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionNlerp(
//       q1: Ptr[Quaternion],
//       q2: Ptr[Quaternion],
//       amount: Float,
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionNormalize(
//       q: Ptr[Quaternion],
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionScale(
//       q: Ptr[Quaternion],
//       mul: Float,
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionSlerp(
//       q1: Ptr[Quaternion],
//       q2: Ptr[Quaternion],
//       amount: Float,
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionSubtract(
//       q1: Ptr[Quaternion],
//       q2: Ptr[Quaternion],
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionSubtractValue(
//       q: Ptr[Quaternion],
//       sub: Float,
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionToAxisAngle(
//       q: Ptr[Quaternion],
//       outAxis: Ptr[Vector3],
//       outAngle: Ptr[Float]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionToEuler(
//       q: Ptr[Quaternion],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionToMatrix(
//       q: Ptr[Quaternion],
//       __return: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_QuaternionTransform(
//       q: Ptr[Quaternion],
//       mat: Ptr[Matrix],
//       __return: Ptr[Quaternion]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ResumeAudioStream(
//       stream: Ptr[AudioStream]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ResumeMusicStream(
//       music: Ptr[Music]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_ResumeSound(sound: Ptr[Sound]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_SeekMusicStream(
//       music: Ptr[Music],
//       position: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetAudioStreamCallback(
//       stream: Ptr[AudioStream],
//       callback: AudioCallback
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetAudioStreamPan(
//       stream: Ptr[AudioStream],
//       pan: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetAudioStreamPitch(
//       stream: Ptr[AudioStream],
//       pitch: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetAudioStreamVolume(
//       stream: Ptr[AudioStream],
//       volume: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetMaterialTexture(
//       material: Ptr[Material],
//       mapType: CInt,
//       texture: Ptr[Texture2D]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetMusicPan(
//       music: Ptr[Music],
//       pan: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetMusicPitch(
//       music: Ptr[Music],
//       pitch: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetMusicVolume(
//       music: Ptr[Music],
//       volume: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetPixelColor(
//       dstPtr: Ptr[Byte],
//       color: Ptr[Color],
//       format: CInt
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetShaderValue(
//       shader: Ptr[Shader],
//       locIndex: CInt,
//       value: Ptr[Byte],
//       uniformType: CInt
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetShaderValueMatrix(
//       shader: Ptr[Shader],
//       locIndex: CInt,
//       mat: Ptr[Matrix]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetShaderValueTexture(
//       shader: Ptr[Shader],
//       locIndex: CInt,
//       texture: Ptr[Texture2D]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetShaderValueV(
//       shader: Ptr[Shader],
//       locIndex: CInt,
//       value: Ptr[Byte],
//       uniformType: CInt,
//       count: CInt
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetShapesTexture(
//       texture: Ptr[Texture2D],
//       source: Ptr[Rectangle]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetSoundPan(
//       sound: Ptr[Sound],
//       pan: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetSoundPitch(
//       sound: Ptr[Sound],
//       pitch: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetSoundVolume(
//       sound: Ptr[Sound],
//       volume: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetTextureFilter(
//       texture: Ptr[Texture2D],
//       filter: CInt
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetTextureWrap(
//       texture: Ptr[Texture2D],
//       wrap: CInt
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_SetWindowIcon(image: Ptr[Image]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_StopAudioStream(
//       stream: Ptr[AudioStream]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_StopMusicStream(
//       music: Ptr[Music]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_StopSound(sound: Ptr[Sound]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_UnloadAudioStream(
//       stream: Ptr[AudioStream]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UnloadDirectoryFiles(
//       files: Ptr[FilePathList]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UnloadDroppedFiles(
//       files: Ptr[FilePathList]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UnloadFont(font: Ptr[Font]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_UnloadImage(image: Ptr[Image]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_UnloadMaterial(
//       material: Ptr[Material]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UnloadMesh(mesh: Ptr[Mesh]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_UnloadModel(model: Ptr[Model]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_UnloadModelAnimation(
//       anim: Ptr[ModelAnimation]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UnloadMusicStream(
//       music: Ptr[Music]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UnloadRenderTexture(
//       target: Ptr[RenderTexture2D]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UnloadShader(shader: Ptr[Shader]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_UnloadSound(sound: Ptr[Sound]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_UnloadSoundAlias(
//       alias: Ptr[Sound]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UnloadTexture(
//       texture: Ptr[Texture2D]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UnloadVrStereoConfig(
//       config: Ptr[VrStereoConfig]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UnloadWave(wave: Ptr[Wave]): Unit =
//     extern

//   private[raylib] def __sn_wrap_raylib_UpdateAudioStream(
//       stream: Ptr[AudioStream],
//       data: Ptr[Byte],
//       frameCount: CInt
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UpdateCameraPro(
//       camera: Ptr[Camera],
//       movement: Ptr[Vector3],
//       rotation: Ptr[Vector3],
//       zoom: Float
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UpdateMeshBuffer(
//       mesh: Ptr[Mesh],
//       index: CInt,
//       data: Ptr[Byte],
//       dataSize: CInt,
//       offset: CInt
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UpdateModelAnimation(
//       model: Ptr[Model],
//       anim: Ptr[ModelAnimation],
//       frame: CInt
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UpdateMusicStream(
//       music: Ptr[Music]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UpdateSound(
//       sound: Ptr[Sound],
//       data: Ptr[Byte],
//       sampleCount: CInt
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UpdateTexture(
//       texture: Ptr[Texture2D],
//       pixels: Ptr[Byte]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_UpdateTextureRec(
//       texture: Ptr[Texture2D],
//       rec: Ptr[Rectangle],
//       pixels: Ptr[Byte]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Add(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2AddValue(
//       v: Ptr[Vector2],
//       add: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Angle(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Clamp(
//       v: Ptr[Vector2],
//       min: Ptr[Vector2],
//       max: Ptr[Vector2],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2ClampValue(
//       v: Ptr[Vector2],
//       min: Float,
//       max: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Distance(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_Vector2DistanceSqr(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Divide(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2DotProduct(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Equals(
//       p: Ptr[Vector2],
//       q: Ptr[Vector2]
//   ): CInt = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Invert(
//       v: Ptr[Vector2],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Length(v: Ptr[Vector2]): Float =
//     extern

//   private[raylib] def __sn_wrap_raylib_Vector2LengthSqr(
//       v: Ptr[Vector2]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Lerp(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2],
//       amount: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2LineAngle(
//       start: Ptr[Vector2],
//       end: Ptr[Vector2]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_Vector2MoveTowards(
//       v: Ptr[Vector2],
//       target: Ptr[Vector2],
//       maxDistance: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Multiply(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Negate(
//       v: Ptr[Vector2],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Normalize(
//       v: Ptr[Vector2],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2One(
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Reflect(
//       v: Ptr[Vector2],
//       normal: Ptr[Vector2],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Rotate(
//       v: Ptr[Vector2],
//       angle: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Scale(
//       v: Ptr[Vector2],
//       scale: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Subtract(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2SubtractValue(
//       v: Ptr[Vector2],
//       sub: Float,
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Transform(
//       v: Ptr[Vector2],
//       mat: Ptr[Matrix],
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector2Zero(
//       __return: Ptr[Vector2]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Add(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3AddValue(
//       v: Ptr[Vector3],
//       add: Float,
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Angle(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Barycenter(
//       p: Ptr[Vector3],
//       a: Ptr[Vector3],
//       b: Ptr[Vector3],
//       c: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Clamp(
//       v: Ptr[Vector3],
//       min: Ptr[Vector3],
//       max: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3ClampValue(
//       v: Ptr[Vector3],
//       min: Float,
//       max: Float,
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3CrossProduct(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Distance(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_Vector3DistanceSqr(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Divide(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3DotProduct(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Equals(
//       p: Ptr[Vector3],
//       q: Ptr[Vector3]
//   ): CInt = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Invert(
//       v: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Length(v: Ptr[Vector3]): Float =
//     extern

//   private[raylib] def __sn_wrap_raylib_Vector3LengthSqr(
//       v: Ptr[Vector3]
//   ): Float = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Lerp(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       amount: Float,
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Max(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Min(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Multiply(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Negate(
//       v: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Normalize(
//       v: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3One(
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Perpendicular(
//       v: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Project(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Reflect(
//       v: Ptr[Vector3],
//       normal: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Refract(
//       v: Ptr[Vector3],
//       n: Ptr[Vector3],
//       r: Float,
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Reject(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3RotateByAxisAngle(
//       v: Ptr[Vector3],
//       axis: Ptr[Vector3],
//       angle: Float,
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3RotateByQuaternion(
//       v: Ptr[Vector3],
//       q: Ptr[Quaternion],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Scale(
//       v: Ptr[Vector3],
//       scalar: Float,
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Subtract(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3SubtractValue(
//       v: Ptr[Vector3],
//       sub: Float,
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3ToFloatV(
//       v: Ptr[Vector3],
//       __return: Ptr[float3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Transform(
//       v: Ptr[Vector3],
//       mat: Ptr[Matrix],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Unproject(
//       source: Ptr[Vector3],
//       projection: Ptr[Matrix],
//       view: Ptr[Matrix],
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_Vector3Zero(
//       __return: Ptr[Vector3]
//   ): Unit = extern

//   private[raylib] def __sn_wrap_raylib_WaveCopy(
//       wave: Ptr[Wave],
//       __return: Ptr[Wave]
//   ): Unit = extern
// end extern_functions

// object functions:
//   import _root_.raylib.enumerations.*
//   import _root_.raylib.predef.*
//   import _root_.raylib.aliases.*
//   import _root_.raylib.structs.*
//   import extern_functions.*
//   export extern_functions.*

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def AttachAudioStreamProcessor(stream: AudioStream, processor: AudioCallback)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_AttachAudioStreamProcessor((__ptr_0 + 0), processor)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def AttachAudioStreamProcessor(
//       stream: Ptr[AudioStream],
//       processor: AudioCallback
//   ): Unit =
//     __sn_wrap_raylib_AttachAudioStreamProcessor(stream, processor)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginMode2D(camera: Ptr[Camera2D]): Unit =
//     __sn_wrap_raylib_BeginMode2D(camera)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginMode2D(camera: Camera2D)(using Zone): Unit =
//     val __ptr_0: Ptr[Camera2D] = alloc[Camera2D](1)
//     !(__ptr_0 + 0) = camera
//     __sn_wrap_raylib_BeginMode2D((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginMode3D(camera: Ptr[Camera3D]): Unit =
//     __sn_wrap_raylib_BeginMode3D(camera)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginMode3D(camera: Camera3D)(using Zone): Unit =
//     val __ptr_0: Ptr[Camera3D] = alloc[Camera3D](1)
//     !(__ptr_0 + 0) = camera
//     __sn_wrap_raylib_BeginMode3D((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginShaderMode(shader: Ptr[Shader]): Unit =
//     __sn_wrap_raylib_BeginShaderMode(shader)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginShaderMode(shader: Shader)(using Zone): Unit =
//     val __ptr_0: Ptr[Shader] = alloc[Shader](1)
//     !(__ptr_0 + 0) = shader
//     __sn_wrap_raylib_BeginShaderMode((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginTextureMode(target: Ptr[RenderTexture2D]): Unit =
//     __sn_wrap_raylib_BeginTextureMode(target)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginTextureMode(target: RenderTexture2D)(using Zone): Unit =
//     val __ptr_0: Ptr[RenderTexture2D] = alloc[RenderTexture2D](1)
//     !(__ptr_0 + 0) = target
//     __sn_wrap_raylib_BeginTextureMode((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginVrStereoMode(config: Ptr[VrStereoConfig]): Unit =
//     __sn_wrap_raylib_BeginVrStereoMode(config)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def BeginVrStereoMode(config: VrStereoConfig)(using Zone): Unit =
//     val __ptr_0: Ptr[VrStereoConfig] = alloc[VrStereoConfig](1)
//     !(__ptr_0 + 0) = config
//     __sn_wrap_raylib_BeginVrStereoMode((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionBoxSphere(box: BoundingBox, center: Vector3, radius: Float)(
//       using Zone
//   ): Boolean =
//     val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_0 + 0) = box
//     !(__ptr_1 + 0) = center
//     __sn_wrap_raylib_CheckCollisionBoxSphere(
//       (__ptr_0 + 0),
//       (__ptr_1 + 0),
//       radius
//     )
//   end CheckCollisionBoxSphere

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionBoxSphere(
//       box: Ptr[BoundingBox],
//       center: Ptr[Vector3],
//       radius: Float
//   ): Boolean =
//     __sn_wrap_raylib_CheckCollisionBoxSphere(box, center, radius)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionBoxes(box1: BoundingBox, box2: BoundingBox)(using
//       Zone
//   ): Boolean =
//     val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](2)
//     !(__ptr_0 + 0) = box1
//     !(__ptr_0 + 1) = box2
//     __sn_wrap_raylib_CheckCollisionBoxes((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionBoxes(
//       box1: Ptr[BoundingBox],
//       box2: Ptr[BoundingBox]
//   ): Boolean =
//     __sn_wrap_raylib_CheckCollisionBoxes(box1, box2)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionCircleRec(
//       center: Ptr[Vector2],
//       radius: Float,
//       rec: Ptr[Rectangle]
//   ): Boolean =
//     __sn_wrap_raylib_CheckCollisionCircleRec(center, radius, rec)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionCircleRec(center: Vector2, radius: Float, rec: Rectangle)(
//       using Zone
//   ): Boolean =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_0 + 0) = center
//     !(__ptr_1 + 0) = rec
//     __sn_wrap_raylib_CheckCollisionCircleRec(
//       (__ptr_0 + 0),
//       radius,
//       (__ptr_1 + 0)
//     )
//   end CheckCollisionCircleRec

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionCircles(
//       center1: Vector2,
//       radius1: Float,
//       center2: Vector2,
//       radius2: Float
//   )(using Zone): Boolean =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = center1
//     !(__ptr_0 + 1) = center2
//     __sn_wrap_raylib_CheckCollisionCircles(
//       (__ptr_0 + 0),
//       radius1,
//       (__ptr_0 + 1),
//       radius2
//     )
//   end CheckCollisionCircles

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionCircles(
//       center1: Ptr[Vector2],
//       radius1: Float,
//       center2: Ptr[Vector2],
//       radius2: Float
//   ): Boolean =
//     __sn_wrap_raylib_CheckCollisionCircles(center1, radius1, center2, radius2)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionLines(
//       startPos1: Ptr[Vector2],
//       endPos1: Ptr[Vector2],
//       startPos2: Ptr[Vector2],
//       endPos2: Ptr[Vector2],
//       collisionPoint: Ptr[Vector2]
//   ): Boolean =
//     __sn_wrap_raylib_CheckCollisionLines(
//       startPos1,
//       endPos1,
//       startPos2,
//       endPos2,
//       collisionPoint
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionLines(
//       startPos1: Vector2,
//       endPos1: Vector2,
//       startPos2: Vector2,
//       endPos2: Vector2,
//       collisionPoint: Ptr[Vector2]
//   )(using Zone): Boolean =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](4)
//     !(__ptr_0 + 0) = startPos1
//     !(__ptr_0 + 1) = endPos1
//     !(__ptr_0 + 2) = startPos2
//     !(__ptr_0 + 3) = endPos2
//     __sn_wrap_raylib_CheckCollisionLines(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       (__ptr_0 + 3),
//       collisionPoint
//     )
//   end CheckCollisionLines

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionPointCircle(
//       point: Ptr[Vector2],
//       center: Ptr[Vector2],
//       radius: Float
//   ): Boolean =
//     __sn_wrap_raylib_CheckCollisionPointCircle(point, center, radius)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionPointCircle(point: Vector2, center: Vector2, radius: Float)(
//       using Zone
//   ): Boolean =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = point
//     !(__ptr_0 + 1) = center
//     __sn_wrap_raylib_CheckCollisionPointCircle(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       radius
//     )
//   end CheckCollisionPointCircle

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionPointLine(
//       point: Vector2,
//       p1: Vector2,
//       p2: Vector2,
//       threshold: CInt
//   )(using Zone): Boolean =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_0 + 0) = point
//     !(__ptr_0 + 1) = p1
//     !(__ptr_0 + 2) = p2
//     __sn_wrap_raylib_CheckCollisionPointLine(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       threshold
//     )
//   end CheckCollisionPointLine

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionPointLine(
//       point: Ptr[Vector2],
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       threshold: CInt
//   ): Boolean =
//     __sn_wrap_raylib_CheckCollisionPointLine(point, p1, p2, threshold)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionPointPoly(
//       point: Vector2,
//       points: Ptr[Vector2],
//       pointCount: CInt
//   )(using Zone): Boolean =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_0 + 0) = point
//     __sn_wrap_raylib_CheckCollisionPointPoly((__ptr_0 + 0), points, pointCount)
//   end CheckCollisionPointPoly

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionPointPoly(
//       point: Ptr[Vector2],
//       points: Ptr[Vector2],
//       pointCount: CInt
//   ): Boolean =
//     __sn_wrap_raylib_CheckCollisionPointPoly(point, points, pointCount)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionPointRec(
//       point: Ptr[Vector2],
//       rec: Ptr[Rectangle]
//   ): Boolean =
//     __sn_wrap_raylib_CheckCollisionPointRec(point, rec)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionPointRec(point: Vector2, rec: Rectangle)(using
//       Zone
//   ): Boolean =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_0 + 0) = point
//     !(__ptr_1 + 0) = rec
//     __sn_wrap_raylib_CheckCollisionPointRec((__ptr_0 + 0), (__ptr_1 + 0))
//   end CheckCollisionPointRec

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionPointTriangle(
//       point: Vector2,
//       p1: Vector2,
//       p2: Vector2,
//       p3: Vector2
//   )(using Zone): Boolean =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](4)
//     !(__ptr_0 + 0) = point
//     !(__ptr_0 + 1) = p1
//     !(__ptr_0 + 2) = p2
//     !(__ptr_0 + 3) = p3
//     __sn_wrap_raylib_CheckCollisionPointTriangle(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       (__ptr_0 + 3)
//     )
//   end CheckCollisionPointTriangle

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionPointTriangle(
//       point: Ptr[Vector2],
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2]
//   ): Boolean =
//     __sn_wrap_raylib_CheckCollisionPointTriangle(point, p1, p2, p3)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionRecs(rec1: Rectangle, rec2: Rectangle)(using
//       Zone
//   ): Boolean =
//     val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](2)
//     !(__ptr_0 + 0) = rec1
//     !(__ptr_0 + 1) = rec2
//     __sn_wrap_raylib_CheckCollisionRecs((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionRecs(rec1: Ptr[Rectangle], rec2: Ptr[Rectangle]): Boolean =
//     __sn_wrap_raylib_CheckCollisionRecs(rec1, rec2)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionSpheres(
//       center1: Vector3,
//       radius1: Float,
//       center2: Vector3,
//       radius2: Float
//   )(using Zone): Boolean =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = center1
//     !(__ptr_0 + 1) = center2
//     __sn_wrap_raylib_CheckCollisionSpheres(
//       (__ptr_0 + 0),
//       radius1,
//       (__ptr_0 + 1),
//       radius2
//     )
//   end CheckCollisionSpheres

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def CheckCollisionSpheres(
//       center1: Ptr[Vector3],
//       radius1: Float,
//       center2: Ptr[Vector3],
//       radius2: Float
//   ): Boolean =
//     __sn_wrap_raylib_CheckCollisionSpheres(center1, radius1, center2, radius2)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ClearBackground(color: Color)(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ClearBackground((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ClearBackground(color: Ptr[Color]): Unit =
//     __sn_wrap_raylib_ClearBackground(color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorAlpha(color: Color, alpha: Float)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ColorAlpha((__ptr_0 + 0), alpha, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorAlpha(color: Ptr[Color], alpha: Float)(__return: Ptr[Color]): Unit =
//     __sn_wrap_raylib_ColorAlpha(color, alpha, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorAlpha(color: Ptr[Color], alpha: Float)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     __sn_wrap_raylib_ColorAlpha(color, alpha, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorAlphaBlend(dst: Ptr[Color], src: Ptr[Color], tint: Ptr[Color])(
//       __return: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ColorAlphaBlend(dst, src, tint, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorAlphaBlend(dst: Color, src: Color, tint: Color)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](4)
//     !(__ptr_0 + 0) = dst
//     !(__ptr_0 + 1) = src
//     !(__ptr_0 + 2) = tint
//     __sn_wrap_raylib_ColorAlphaBlend(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       (__ptr_0 + 3)
//     )
//     !(__ptr_0 + 3)
//   end ColorAlphaBlend

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorAlphaBlend(dst: Ptr[Color], src: Ptr[Color], tint: Ptr[Color])(using
//       Zone
//   ): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     __sn_wrap_raylib_ColorAlphaBlend(dst, src, tint, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorBrightness(color: Ptr[Color], factor: Float)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     __sn_wrap_raylib_ColorBrightness(color, factor, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorBrightness(color: Ptr[Color], factor: Float)(
//       __return: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ColorBrightness(color, factor, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorBrightness(color: Color, factor: Float)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ColorBrightness((__ptr_0 + 0), factor, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorContrast(color: Ptr[Color], contrast: Float)(
//       __return: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ColorContrast(color, contrast, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorContrast(color: Color, contrast: Float)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ColorContrast((__ptr_0 + 0), contrast, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorContrast(color: Ptr[Color], contrast: Float)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     __sn_wrap_raylib_ColorContrast(color, contrast, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorFromHSV(hue: Float, saturation: Float, value: Float)(using
//       Zone
//   ): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     __sn_wrap_raylib_ColorFromHSV(hue, saturation, value, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorFromHSV(hue: Float, saturation: Float, value: Float)(
//       __return: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ColorFromHSV(hue, saturation, value, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorFromNormalized(normalized: Ptr[Vector4])(
//       __return: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ColorFromNormalized(normalized, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorFromNormalized(normalized: Ptr[Vector4])(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     __sn_wrap_raylib_ColorFromNormalized(normalized, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorFromNormalized(normalized: Vector4)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector4] = alloc[Vector4](1)
//     !(__ptr_1 + 0) = normalized
//     __sn_wrap_raylib_ColorFromNormalized((__ptr_1 + 0), (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorNormalize(color: Color)(using Zone): Vector4 =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector4] = alloc[Vector4](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ColorNormalize((__ptr_0 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorNormalize(color: Ptr[Color])(__return: Ptr[Vector4]): Unit =
//     __sn_wrap_raylib_ColorNormalize(color, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorNormalize(color: Ptr[Color])(using Zone): Vector4 =
//     val __ptr_0: Ptr[Vector4] = alloc[Vector4](1)
//     __sn_wrap_raylib_ColorNormalize(color, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorTint(color: Ptr[Color], tint: Ptr[Color])(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     __sn_wrap_raylib_ColorTint(color, tint, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorTint(color: Color, tint: Color)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](3)
//     !(__ptr_0 + 0) = color
//     !(__ptr_0 + 1) = tint
//     __sn_wrap_raylib_ColorTint((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorTint(color: Ptr[Color], tint: Ptr[Color])(
//       __return: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ColorTint(color, tint, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorToHSV(color: Color)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ColorToHSV((__ptr_0 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorToHSV(color: Ptr[Color])(__return: Ptr[Vector3]): Unit =
//     __sn_wrap_raylib_ColorToHSV(color, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorToHSV(color: Ptr[Color])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_ColorToHSV(color, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorToInt(color: Ptr[Color]): CInt =
//     __sn_wrap_raylib_ColorToInt(color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ColorToInt(color: Color)(using Zone): CInt =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ColorToInt((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DetachAudioStreamProcessor(stream: AudioStream, processor: AudioCallback)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_DetachAudioStreamProcessor((__ptr_0 + 0), processor)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DetachAudioStreamProcessor(
//       stream: Ptr[AudioStream],
//       processor: AudioCallback
//   ): Unit =
//     __sn_wrap_raylib_DetachAudioStreamProcessor(stream, processor)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawBillboard(
//       camera: Camera,
//       texture: Texture2D,
//       position: Vector3,
//       size: Float,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Texture2D] = alloc[Texture2D](1)
//     val __ptr_2: Ptr[Camera] = alloc[Camera](1)
//     val __ptr_3: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_2 + 0) = camera
//     !(__ptr_1 + 0) = texture
//     !(__ptr_3 + 0) = position
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawBillboard(
//       (__ptr_2 + 0),
//       (__ptr_1 + 0),
//       (__ptr_3 + 0),
//       size,
//       (__ptr_0 + 0)
//     )
//   end DrawBillboard

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawBillboard(
//       camera: Ptr[Camera],
//       texture: Ptr[Texture2D],
//       position: Ptr[Vector3],
//       size: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawBillboard(camera, texture, position, size, tint)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawBillboardPro(
//       camera: Ptr[Camera],
//       texture: Ptr[Texture2D],
//       source: Ptr[Rectangle],
//       position: Ptr[Vector3],
//       up: Ptr[Vector3],
//       size: Ptr[Vector2],
//       origin: Ptr[Vector2],
//       rotation: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawBillboardPro(
//       camera,
//       texture,
//       source,
//       position,
//       up,
//       size,
//       origin,
//       rotation,
//       tint
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawBillboardPro(
//       camera: Camera,
//       texture: Texture2D,
//       source: Rectangle,
//       position: Vector3,
//       up: Vector3,
//       size: Vector2,
//       origin: Vector2,
//       rotation: Float,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_5: Ptr[Vector3] = alloc[Vector3](2)
//     val __ptr_4: Ptr[Vector2] = alloc[Vector2](2)
//     val __ptr_3: Ptr[Rectangle] = alloc[Rectangle](1)
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Texture2D] = alloc[Texture2D](1)
//     val __ptr_2: Ptr[Camera] = alloc[Camera](1)
//     !(__ptr_2 + 0) = camera
//     !(__ptr_1 + 0) = texture
//     !(__ptr_3 + 0) = source
//     !(__ptr_5 + 0) = position
//     !(__ptr_5 + 1) = up
//     !(__ptr_4 + 0) = size
//     !(__ptr_4 + 1) = origin
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawBillboardPro(
//       (__ptr_2 + 0),
//       (__ptr_1 + 0),
//       (__ptr_3 + 0),
//       (__ptr_5 + 0),
//       (__ptr_5 + 1),
//       (__ptr_4 + 0),
//       (__ptr_4 + 1),
//       rotation,
//       (__ptr_0 + 0)
//     )
//   end DrawBillboardPro

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawBillboardRec(
//       camera: Camera,
//       texture: Texture2D,
//       source: Rectangle,
//       position: Vector3,
//       size: Vector2,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_5: Ptr[Vector3] = alloc[Vector3](1)
//     val __ptr_4: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_3: Ptr[Rectangle] = alloc[Rectangle](1)
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Texture2D] = alloc[Texture2D](1)
//     val __ptr_2: Ptr[Camera] = alloc[Camera](1)
//     !(__ptr_2 + 0) = camera
//     !(__ptr_1 + 0) = texture
//     !(__ptr_3 + 0) = source
//     !(__ptr_5 + 0) = position
//     !(__ptr_4 + 0) = size
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawBillboardRec(
//       (__ptr_2 + 0),
//       (__ptr_1 + 0),
//       (__ptr_3 + 0),
//       (__ptr_5 + 0),
//       (__ptr_4 + 0),
//       (__ptr_0 + 0)
//     )
//   end DrawBillboardRec

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawBillboardRec(
//       camera: Ptr[Camera],
//       texture: Ptr[Texture2D],
//       source: Ptr[Rectangle],
//       position: Ptr[Vector3],
//       size: Ptr[Vector2],
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawBillboardRec(
//       camera,
//       texture,
//       source,
//       position,
//       size,
//       tint
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawBoundingBox(box: BoundingBox, color: Color)(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[BoundingBox] = alloc[BoundingBox](1)
//     !(__ptr_1 + 0) = box
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawBoundingBox((__ptr_1 + 0), (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawBoundingBox(box: Ptr[BoundingBox], color: Ptr[Color]): Unit =
//     __sn_wrap_raylib_DrawBoundingBox(box, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCapsule(
//       startPos: Vector3,
//       endPos: Vector3,
//       radius: Float,
//       slices: CInt,
//       rings: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_1 + 0) = startPos
//     !(__ptr_1 + 1) = endPos
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCapsule(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       radius,
//       slices,
//       rings,
//       (__ptr_0 + 0)
//     )
//   end DrawCapsule

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCapsule(
//       startPos: Ptr[Vector3],
//       endPos: Ptr[Vector3],
//       radius: Float,
//       slices: CInt,
//       rings: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCapsule(startPos, endPos, radius, slices, rings, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCapsuleWires(
//       startPos: Ptr[Vector3],
//       endPos: Ptr[Vector3],
//       radius: Float,
//       slices: CInt,
//       rings: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCapsuleWires(
//       startPos,
//       endPos,
//       radius,
//       slices,
//       rings,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCapsuleWires(
//       startPos: Vector3,
//       endPos: Vector3,
//       radius: Float,
//       slices: CInt,
//       rings: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_1 + 0) = startPos
//     !(__ptr_1 + 1) = endPos
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCapsuleWires(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       radius,
//       slices,
//       rings,
//       (__ptr_0 + 0)
//     )
//   end DrawCapsuleWires

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircle(centerX: CInt, centerY: CInt, radius: Float, color: Color)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCircle(centerX, centerY, radius, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircle(
//       centerX: CInt,
//       centerY: CInt,
//       radius: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCircle(centerX, centerY, radius, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircle3D(
//       center: Vector3,
//       radius: Float,
//       rotationAxis: Vector3,
//       rotationAngle: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_1 + 0) = center
//     !(__ptr_1 + 1) = rotationAxis
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCircle3D(
//       (__ptr_1 + 0),
//       radius,
//       (__ptr_1 + 1),
//       rotationAngle,
//       (__ptr_0 + 0)
//     )
//   end DrawCircle3D

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircle3D(
//       center: Ptr[Vector3],
//       radius: Float,
//       rotationAxis: Ptr[Vector3],
//       rotationAngle: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCircle3D(
//       center,
//       radius,
//       rotationAxis,
//       rotationAngle,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleGradient(
//       centerX: CInt,
//       centerY: CInt,
//       radius: Float,
//       color1: Color,
//       color2: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     !(__ptr_0 + 0) = color1
//     !(__ptr_0 + 1) = color2
//     __sn_wrap_raylib_DrawCircleGradient(
//       centerX,
//       centerY,
//       radius,
//       (__ptr_0 + 0),
//       (__ptr_0 + 1)
//     )
//   end DrawCircleGradient

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleGradient(
//       centerX: CInt,
//       centerY: CInt,
//       radius: Float,
//       color1: Ptr[Color],
//       color2: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCircleGradient(
//       centerX,
//       centerY,
//       radius,
//       color1,
//       color2
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleLines(
//       centerX: CInt,
//       centerY: CInt,
//       radius: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCircleLines(centerX, centerY, radius, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleLines(
//       centerX: CInt,
//       centerY: CInt,
//       radius: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCircleLines(centerX, centerY, radius, (__ptr_0 + 0))
//   end DrawCircleLines

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleLinesV(center: Vector2, radius: Float, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = center
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCircleLinesV((__ptr_1 + 0), radius, (__ptr_0 + 0))
//   end DrawCircleLinesV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleLinesV(
//       center: Ptr[Vector2],
//       radius: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCircleLinesV(center, radius, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleSector(
//       center: Ptr[Vector2],
//       radius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCircleSector(
//       center,
//       radius,
//       startAngle,
//       endAngle,
//       segments,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleSector(
//       center: Vector2,
//       radius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = center
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCircleSector(
//       (__ptr_1 + 0),
//       radius,
//       startAngle,
//       endAngle,
//       segments,
//       (__ptr_0 + 0)
//     )
//   end DrawCircleSector

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleSectorLines(
//       center: Vector2,
//       radius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = center
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCircleSectorLines(
//       (__ptr_1 + 0),
//       radius,
//       startAngle,
//       endAngle,
//       segments,
//       (__ptr_0 + 0)
//     )
//   end DrawCircleSectorLines

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleSectorLines(
//       center: Ptr[Vector2],
//       radius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCircleSectorLines(
//       center,
//       radius,
//       startAngle,
//       endAngle,
//       segments,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleV(center: Vector2, radius: Float, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = center
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCircleV((__ptr_1 + 0), radius, (__ptr_0 + 0))
//   end DrawCircleV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCircleV(
//       center: Ptr[Vector2],
//       radius: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCircleV(center, radius, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCube(
//       position: Vector3,
//       width: Float,
//       height: Float,
//       length: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCube(
//       (__ptr_1 + 0),
//       width,
//       height,
//       length,
//       (__ptr_0 + 0)
//     )
//   end DrawCube

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCube(
//       position: Ptr[Vector3],
//       width: Float,
//       height: Float,
//       length: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCube(position, width, height, length, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCubeV(position: Vector3, size: Vector3, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_1 + 0) = position
//     !(__ptr_1 + 1) = size
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCubeV((__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 0))
//   end DrawCubeV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCubeV(
//       position: Ptr[Vector3],
//       size: Ptr[Vector3],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCubeV(position, size, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCubeWires(
//       position: Vector3,
//       width: Float,
//       height: Float,
//       length: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCubeWires(
//       (__ptr_1 + 0),
//       width,
//       height,
//       length,
//       (__ptr_0 + 0)
//     )
//   end DrawCubeWires

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCubeWires(
//       position: Ptr[Vector3],
//       width: Float,
//       height: Float,
//       length: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCubeWires(position, width, height, length, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCubeWiresV(position: Vector3, size: Vector3, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_1 + 0) = position
//     !(__ptr_1 + 1) = size
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCubeWiresV((__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 0))
//   end DrawCubeWiresV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCubeWiresV(
//       position: Ptr[Vector3],
//       size: Ptr[Vector3],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCubeWiresV(position, size, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCylinder(
//       position: Vector3,
//       radiusTop: Float,
//       radiusBottom: Float,
//       height: Float,
//       slices: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCylinder(
//       (__ptr_1 + 0),
//       radiusTop,
//       radiusBottom,
//       height,
//       slices,
//       (__ptr_0 + 0)
//     )
//   end DrawCylinder

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCylinder(
//       position: Ptr[Vector3],
//       radiusTop: Float,
//       radiusBottom: Float,
//       height: Float,
//       slices: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCylinder(
//       position,
//       radiusTop,
//       radiusBottom,
//       height,
//       slices,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCylinderEx(
//       startPos: Ptr[Vector3],
//       endPos: Ptr[Vector3],
//       startRadius: Float,
//       endRadius: Float,
//       sides: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCylinderEx(
//       startPos,
//       endPos,
//       startRadius,
//       endRadius,
//       sides,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCylinderEx(
//       startPos: Vector3,
//       endPos: Vector3,
//       startRadius: Float,
//       endRadius: Float,
//       sides: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_1 + 0) = startPos
//     !(__ptr_1 + 1) = endPos
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCylinderEx(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       startRadius,
//       endRadius,
//       sides,
//       (__ptr_0 + 0)
//     )
//   end DrawCylinderEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCylinderWires(
//       position: Ptr[Vector3],
//       radiusTop: Float,
//       radiusBottom: Float,
//       height: Float,
//       slices: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCylinderWires(
//       position,
//       radiusTop,
//       radiusBottom,
//       height,
//       slices,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCylinderWires(
//       position: Vector3,
//       radiusTop: Float,
//       radiusBottom: Float,
//       height: Float,
//       slices: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCylinderWires(
//       (__ptr_1 + 0),
//       radiusTop,
//       radiusBottom,
//       height,
//       slices,
//       (__ptr_0 + 0)
//     )
//   end DrawCylinderWires

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCylinderWiresEx(
//       startPos: Vector3,
//       endPos: Vector3,
//       startRadius: Float,
//       endRadius: Float,
//       sides: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_1 + 0) = startPos
//     !(__ptr_1 + 1) = endPos
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawCylinderWiresEx(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       startRadius,
//       endRadius,
//       sides,
//       (__ptr_0 + 0)
//     )
//   end DrawCylinderWiresEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawCylinderWiresEx(
//       startPos: Ptr[Vector3],
//       endPos: Ptr[Vector3],
//       startRadius: Float,
//       endRadius: Float,
//       sides: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawCylinderWiresEx(
//       startPos,
//       endPos,
//       startRadius,
//       endRadius,
//       sides,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawEllipse(
//       centerX: CInt,
//       centerY: CInt,
//       radiusH: Float,
//       radiusV: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawEllipse(
//       centerX,
//       centerY,
//       radiusH,
//       radiusV,
//       (__ptr_0 + 0)
//     )
//   end DrawEllipse

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawEllipse(
//       centerX: CInt,
//       centerY: CInt,
//       radiusH: Float,
//       radiusV: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawEllipse(centerX, centerY, radiusH, radiusV, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawEllipseLines(
//       centerX: CInt,
//       centerY: CInt,
//       radiusH: Float,
//       radiusV: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawEllipseLines(
//       centerX,
//       centerY,
//       radiusH,
//       radiusV,
//       (__ptr_0 + 0)
//     )
//   end DrawEllipseLines

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawEllipseLines(
//       centerX: CInt,
//       centerY: CInt,
//       radiusH: Float,
//       radiusV: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawEllipseLines(centerX, centerY, radiusH, radiusV, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLine(
//       startPosX: CInt,
//       startPosY: CInt,
//       endPosX: CInt,
//       endPosY: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawLine(startPosX, startPosY, endPosX, endPosY, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLine(
//       startPosX: CInt,
//       startPosY: CInt,
//       endPosX: CInt,
//       endPosY: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawLine(
//       startPosX,
//       startPosY,
//       endPosX,
//       endPosY,
//       (__ptr_0 + 0)
//     )
//   end DrawLine

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLine3D(startPos: Vector3, endPos: Vector3, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_1 + 0) = startPos
//     !(__ptr_1 + 1) = endPos
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawLine3D((__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 0))
//   end DrawLine3D

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLine3D(
//       startPos: Ptr[Vector3],
//       endPos: Ptr[Vector3],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawLine3D(startPos, endPos, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLineBezier(
//       startPos: Ptr[Vector2],
//       endPos: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawLineBezier(startPos, endPos, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLineBezier(
//       startPos: Vector2,
//       endPos: Vector2,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_1 + 0) = startPos
//     !(__ptr_1 + 1) = endPos
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawLineBezier(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       thick,
//       (__ptr_0 + 0)
//     )
//   end DrawLineBezier

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLineEx(
//       startPos: Vector2,
//       endPos: Vector2,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_1 + 0) = startPos
//     !(__ptr_1 + 1) = endPos
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawLineEx(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       thick,
//       (__ptr_0 + 0)
//     )
//   end DrawLineEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLineEx(
//       startPos: Ptr[Vector2],
//       endPos: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawLineEx(startPos, endPos, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLineStrip(points: Ptr[Vector2], pointCount: CInt, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawLineStrip(points, pointCount, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLineStrip(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawLineStrip(points, pointCount, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLineV(
//       startPos: Ptr[Vector2],
//       endPos: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawLineV(startPos, endPos, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawLineV(startPos: Vector2, endPos: Vector2, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_1 + 0) = startPos
//     !(__ptr_1 + 1) = endPos
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawLineV((__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 0))
//   end DrawLineV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawMesh(mesh: Mesh, material: Material, transform: Matrix)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     val __ptr_1: Ptr[Material] = alloc[Material](1)
//     val __ptr_2: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = mesh
//     !(__ptr_1 + 0) = material
//     !(__ptr_2 + 0) = transform
//     __sn_wrap_raylib_DrawMesh((__ptr_0 + 0), (__ptr_1 + 0), (__ptr_2 + 0))
//   end DrawMesh

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawMesh(
//       mesh: Ptr[Mesh],
//       material: Ptr[Material],
//       transform: Ptr[Matrix]
//   ): Unit =
//     __sn_wrap_raylib_DrawMesh(mesh, material, transform)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawMeshInstanced(
//       mesh: Ptr[Mesh],
//       material: Ptr[Material],
//       transforms: Ptr[Matrix],
//       instances: CInt
//   ): Unit =
//     __sn_wrap_raylib_DrawMeshInstanced(mesh, material, transforms, instances)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawMeshInstanced(
//       mesh: Mesh,
//       material: Material,
//       transforms: Ptr[Matrix],
//       instances: CInt
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     val __ptr_1: Ptr[Material] = alloc[Material](1)
//     !(__ptr_0 + 0) = mesh
//     !(__ptr_1 + 0) = material
//     __sn_wrap_raylib_DrawMeshInstanced(
//       (__ptr_0 + 0),
//       (__ptr_1 + 0),
//       transforms,
//       instances
//     )
//   end DrawMeshInstanced

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawModel(model: Model, position: Vector3, scale: Float, tint: Color)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Model] = alloc[Model](1)
//     val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_1 + 0) = model
//     !(__ptr_2 + 0) = position
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawModel(
//       (__ptr_1 + 0),
//       (__ptr_2 + 0),
//       scale,
//       (__ptr_0 + 0)
//     )
//   end DrawModel

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawModel(
//       model: Ptr[Model],
//       position: Ptr[Vector3],
//       scale: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawModel(model, position, scale, tint)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawModelEx(
//       model: Ptr[Model],
//       position: Ptr[Vector3],
//       rotationAxis: Ptr[Vector3],
//       rotationAngle: Float,
//       scale: Ptr[Vector3],
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawModelEx(
//       model,
//       position,
//       rotationAxis,
//       rotationAngle,
//       scale,
//       tint
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawModelEx(
//       model: Model,
//       position: Vector3,
//       rotationAxis: Vector3,
//       rotationAngle: Float,
//       scale: Vector3,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Model] = alloc[Model](1)
//     val __ptr_2: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_1 + 0) = model
//     !(__ptr_2 + 0) = position
//     !(__ptr_2 + 1) = rotationAxis
//     !(__ptr_2 + 2) = scale
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawModelEx(
//       (__ptr_1 + 0),
//       (__ptr_2 + 0),
//       (__ptr_2 + 1),
//       rotationAngle,
//       (__ptr_2 + 2),
//       (__ptr_0 + 0)
//     )
//   end DrawModelEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawModelWires(
//       model: Model,
//       position: Vector3,
//       scale: Float,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Model] = alloc[Model](1)
//     val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_1 + 0) = model
//     !(__ptr_2 + 0) = position
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawModelWires(
//       (__ptr_1 + 0),
//       (__ptr_2 + 0),
//       scale,
//       (__ptr_0 + 0)
//     )
//   end DrawModelWires

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawModelWires(
//       model: Ptr[Model],
//       position: Ptr[Vector3],
//       scale: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawModelWires(model, position, scale, tint)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawModelWiresEx(
//       model: Ptr[Model],
//       position: Ptr[Vector3],
//       rotationAxis: Ptr[Vector3],
//       rotationAngle: Float,
//       scale: Ptr[Vector3],
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawModelWiresEx(
//       model,
//       position,
//       rotationAxis,
//       rotationAngle,
//       scale,
//       tint
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawModelWiresEx(
//       model: Model,
//       position: Vector3,
//       rotationAxis: Vector3,
//       rotationAngle: Float,
//       scale: Vector3,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Model] = alloc[Model](1)
//     val __ptr_2: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_1 + 0) = model
//     !(__ptr_2 + 0) = position
//     !(__ptr_2 + 1) = rotationAxis
//     !(__ptr_2 + 2) = scale
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawModelWiresEx(
//       (__ptr_1 + 0),
//       (__ptr_2 + 0),
//       (__ptr_2 + 1),
//       rotationAngle,
//       (__ptr_2 + 2),
//       (__ptr_0 + 0)
//     )
//   end DrawModelWiresEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPixel(posX: CInt, posY: CInt, color: Color)(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawPixel(posX, posY, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPixel(posX: CInt, posY: CInt, color: Ptr[Color]): Unit =
//     __sn_wrap_raylib_DrawPixel(posX, posY, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPixelV(position: Ptr[Vector2], color: Ptr[Color]): Unit =
//     __sn_wrap_raylib_DrawPixelV(position, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPixelV(position: Vector2, color: Color)(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawPixelV((__ptr_1 + 0), (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPlane(centerPos: Vector3, size: Vector2, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_2 + 0) = centerPos
//     !(__ptr_1 + 0) = size
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawPlane((__ptr_2 + 0), (__ptr_1 + 0), (__ptr_0 + 0))
//   end DrawPlane

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPlane(
//       centerPos: Ptr[Vector3],
//       size: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawPlane(centerPos, size, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPoint3D(position: Ptr[Vector3], color: Ptr[Color]): Unit =
//     __sn_wrap_raylib_DrawPoint3D(position, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPoint3D(position: Vector3, color: Color)(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawPoint3D((__ptr_1 + 0), (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPoly(
//       center: Ptr[Vector2],
//       sides: CInt,
//       radius: Float,
//       rotation: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawPoly(center, sides, radius, rotation, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPoly(
//       center: Vector2,
//       sides: CInt,
//       radius: Float,
//       rotation: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = center
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawPoly(
//       (__ptr_1 + 0),
//       sides,
//       radius,
//       rotation,
//       (__ptr_0 + 0)
//     )
//   end DrawPoly

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPolyLines(
//       center: Ptr[Vector2],
//       sides: CInt,
//       radius: Float,
//       rotation: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawPolyLines(center, sides, radius, rotation, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPolyLines(
//       center: Vector2,
//       sides: CInt,
//       radius: Float,
//       rotation: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = center
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawPolyLines(
//       (__ptr_1 + 0),
//       sides,
//       radius,
//       rotation,
//       (__ptr_0 + 0)
//     )
//   end DrawPolyLines

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPolyLinesEx(
//       center: Ptr[Vector2],
//       sides: CInt,
//       radius: Float,
//       rotation: Float,
//       lineThick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawPolyLinesEx(
//       center,
//       sides,
//       radius,
//       rotation,
//       lineThick,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawPolyLinesEx(
//       center: Vector2,
//       sides: CInt,
//       radius: Float,
//       rotation: Float,
//       lineThick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = center
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawPolyLinesEx(
//       (__ptr_1 + 0),
//       sides,
//       radius,
//       rotation,
//       lineThick,
//       (__ptr_0 + 0)
//     )
//   end DrawPolyLinesEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRay(ray: Ptr[Ray], color: Ptr[Color]): Unit =
//     __sn_wrap_raylib_DrawRay(ray, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRay(ray: Ray, color: Color)(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Ray] = alloc[Ray](1)
//     !(__ptr_1 + 0) = ray
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawRay((__ptr_1 + 0), (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangle(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRectangle(posX, posY, width, height, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangle(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawRectangle(posX, posY, width, height, (__ptr_0 + 0))
//   end DrawRectangle

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleGradientEx(
//       rec: Rectangle,
//       col1: Color,
//       col2: Color,
//       col3: Color,
//       col4: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](4)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_1 + 0) = rec
//     !(__ptr_0 + 0) = col1
//     !(__ptr_0 + 1) = col2
//     !(__ptr_0 + 2) = col3
//     !(__ptr_0 + 3) = col4
//     __sn_wrap_raylib_DrawRectangleGradientEx(
//       (__ptr_1 + 0),
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       (__ptr_0 + 3)
//     )
//   end DrawRectangleGradientEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleGradientEx(
//       rec: Ptr[Rectangle],
//       col1: Ptr[Color],
//       col2: Ptr[Color],
//       col3: Ptr[Color],
//       col4: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRectangleGradientEx(rec, col1, col2, col3, col4)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleGradientH(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color1: Ptr[Color],
//       color2: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRectangleGradientH(
//       posX,
//       posY,
//       width,
//       height,
//       color1,
//       color2
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleGradientH(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color1: Color,
//       color2: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     !(__ptr_0 + 0) = color1
//     !(__ptr_0 + 1) = color2
//     __sn_wrap_raylib_DrawRectangleGradientH(
//       posX,
//       posY,
//       width,
//       height,
//       (__ptr_0 + 0),
//       (__ptr_0 + 1)
//     )
//   end DrawRectangleGradientH

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleGradientV(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color1: Ptr[Color],
//       color2: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRectangleGradientV(
//       posX,
//       posY,
//       width,
//       height,
//       color1,
//       color2
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleGradientV(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color1: Color,
//       color2: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     !(__ptr_0 + 0) = color1
//     !(__ptr_0 + 1) = color2
//     __sn_wrap_raylib_DrawRectangleGradientV(
//       posX,
//       posY,
//       width,
//       height,
//       (__ptr_0 + 0),
//       (__ptr_0 + 1)
//     )
//   end DrawRectangleGradientV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleLines(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRectangleLines(posX, posY, width, height, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleLines(
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawRectangleLines(
//       posX,
//       posY,
//       width,
//       height,
//       (__ptr_0 + 0)
//     )
//   end DrawRectangleLines

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleLinesEx(rec: Rectangle, lineThick: Float, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_1 + 0) = rec
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawRectangleLinesEx(
//       (__ptr_1 + 0),
//       lineThick,
//       (__ptr_0 + 0)
//     )
//   end DrawRectangleLinesEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleLinesEx(
//       rec: Ptr[Rectangle],
//       lineThick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRectangleLinesEx(rec, lineThick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectanglePro(
//       rec: Rectangle,
//       origin: Vector2,
//       rotation: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_2: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_2 + 0) = rec
//     !(__ptr_1 + 0) = origin
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawRectanglePro(
//       (__ptr_2 + 0),
//       (__ptr_1 + 0),
//       rotation,
//       (__ptr_0 + 0)
//     )
//   end DrawRectanglePro

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectanglePro(
//       rec: Ptr[Rectangle],
//       origin: Ptr[Vector2],
//       rotation: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRectanglePro(rec, origin, rotation, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleRec(rec: Ptr[Rectangle], color: Ptr[Color]): Unit =
//     __sn_wrap_raylib_DrawRectangleRec(rec, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleRec(rec: Rectangle, color: Color)(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_1 + 0) = rec
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawRectangleRec((__ptr_1 + 0), (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleRounded(
//       rec: Ptr[Rectangle],
//       roundness: Float,
//       segments: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRectangleRounded(rec, roundness, segments, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleRounded(
//       rec: Rectangle,
//       roundness: Float,
//       segments: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_1 + 0) = rec
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawRectangleRounded(
//       (__ptr_1 + 0),
//       roundness,
//       segments,
//       (__ptr_0 + 0)
//     )
//   end DrawRectangleRounded

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleRoundedLines(
//       rec: Ptr[Rectangle],
//       roundness: Float,
//       segments: CInt,
//       lineThick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRectangleRoundedLines(
//       rec,
//       roundness,
//       segments,
//       lineThick,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleRoundedLines(
//       rec: Rectangle,
//       roundness: Float,
//       segments: CInt,
//       lineThick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_1 + 0) = rec
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawRectangleRoundedLines(
//       (__ptr_1 + 0),
//       roundness,
//       segments,
//       lineThick,
//       (__ptr_0 + 0)
//     )
//   end DrawRectangleRoundedLines

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleV(position: Vector2, size: Vector2, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_1 + 0) = position
//     !(__ptr_1 + 1) = size
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawRectangleV((__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 0))
//   end DrawRectangleV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRectangleV(
//       position: Ptr[Vector2],
//       size: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRectangleV(position, size, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRing(
//       center: Ptr[Vector2],
//       innerRadius: Float,
//       outerRadius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRing(
//       center,
//       innerRadius,
//       outerRadius,
//       startAngle,
//       endAngle,
//       segments,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRing(
//       center: Vector2,
//       innerRadius: Float,
//       outerRadius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = center
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawRing(
//       (__ptr_1 + 0),
//       innerRadius,
//       outerRadius,
//       startAngle,
//       endAngle,
//       segments,
//       (__ptr_0 + 0)
//     )
//   end DrawRing

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRingLines(
//       center: Vector2,
//       innerRadius: Float,
//       outerRadius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = center
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawRingLines(
//       (__ptr_1 + 0),
//       innerRadius,
//       outerRadius,
//       startAngle,
//       endAngle,
//       segments,
//       (__ptr_0 + 0)
//     )
//   end DrawRingLines

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawRingLines(
//       center: Ptr[Vector2],
//       innerRadius: Float,
//       outerRadius: Float,
//       startAngle: Float,
//       endAngle: Float,
//       segments: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawRingLines(
//       center,
//       innerRadius,
//       outerRadius,
//       startAngle,
//       endAngle,
//       segments,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSphere(centerPos: Vector3, radius: Float, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_1 + 0) = centerPos
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSphere((__ptr_1 + 0), radius, (__ptr_0 + 0))
//   end DrawSphere

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSphere(
//       centerPos: Ptr[Vector3],
//       radius: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSphere(centerPos, radius, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSphereEx(
//       centerPos: Ptr[Vector3],
//       radius: Float,
//       rings: CInt,
//       slices: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSphereEx(centerPos, radius, rings, slices, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSphereEx(
//       centerPos: Vector3,
//       radius: Float,
//       rings: CInt,
//       slices: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_1 + 0) = centerPos
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSphereEx(
//       (__ptr_1 + 0),
//       radius,
//       rings,
//       slices,
//       (__ptr_0 + 0)
//     )
//   end DrawSphereEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSphereWires(
//       centerPos: Ptr[Vector3],
//       radius: Float,
//       rings: CInt,
//       slices: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSphereWires(centerPos, radius, rings, slices, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSphereWires(
//       centerPos: Vector3,
//       radius: Float,
//       rings: CInt,
//       slices: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_1 + 0) = centerPos
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSphereWires(
//       (__ptr_1 + 0),
//       radius,
//       rings,
//       slices,
//       (__ptr_0 + 0)
//     )
//   end DrawSphereWires

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineBasis(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSplineBasis(points, pointCount, thick, (__ptr_0 + 0))
//   end DrawSplineBasis

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineBasis(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSplineBasis(points, pointCount, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineBezierCubic(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSplineBezierCubic(
//       points,
//       pointCount,
//       thick,
//       (__ptr_0 + 0)
//     )
//   end DrawSplineBezierCubic

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineBezierCubic(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSplineBezierCubic(points, pointCount, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineBezierQuadratic(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSplineBezierQuadratic(
//       points,
//       pointCount,
//       thick,
//       (__ptr_0 + 0)
//     )
//   end DrawSplineBezierQuadratic

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineBezierQuadratic(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSplineBezierQuadratic(points, pointCount, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineCatmullRom(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSplineCatmullRom(
//       points,
//       pointCount,
//       thick,
//       (__ptr_0 + 0)
//     )
//   end DrawSplineCatmullRom

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineCatmullRom(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSplineCatmullRom(points, pointCount, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineLinear(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSplineLinear(points, pointCount, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineLinear(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSplineLinear(points, pointCount, thick, (__ptr_0 + 0))
//   end DrawSplineLinear

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineSegmentBasis(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSplineSegmentBasis(p1, p2, p3, p4, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineSegmentBasis(
//       p1: Vector2,
//       p2: Vector2,
//       p3: Vector2,
//       p4: Vector2,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](4)
//     !(__ptr_1 + 0) = p1
//     !(__ptr_1 + 1) = p2
//     !(__ptr_1 + 2) = p3
//     !(__ptr_1 + 3) = p4
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSplineSegmentBasis(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       (__ptr_1 + 2),
//       (__ptr_1 + 3),
//       thick,
//       (__ptr_0 + 0)
//     )
//   end DrawSplineSegmentBasis

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineSegmentBezierCubic(
//       p1: Vector2,
//       c2: Vector2,
//       c3: Vector2,
//       p4: Vector2,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](4)
//     !(__ptr_1 + 0) = p1
//     !(__ptr_1 + 1) = c2
//     !(__ptr_1 + 2) = c3
//     !(__ptr_1 + 3) = p4
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSplineSegmentBezierCubic(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       (__ptr_1 + 2),
//       (__ptr_1 + 3),
//       thick,
//       (__ptr_0 + 0)
//     )
//   end DrawSplineSegmentBezierCubic

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineSegmentBezierCubic(
//       p1: Ptr[Vector2],
//       c2: Ptr[Vector2],
//       c3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSplineSegmentBezierCubic(p1, c2, c3, p4, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineSegmentBezierQuadratic(
//       p1: Ptr[Vector2],
//       c2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSplineSegmentBezierQuadratic(p1, c2, p3, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineSegmentBezierQuadratic(
//       p1: Vector2,
//       c2: Vector2,
//       p3: Vector2,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_1 + 0) = p1
//     !(__ptr_1 + 1) = c2
//     !(__ptr_1 + 2) = p3
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSplineSegmentBezierQuadratic(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       (__ptr_1 + 2),
//       thick,
//       (__ptr_0 + 0)
//     )
//   end DrawSplineSegmentBezierQuadratic

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineSegmentCatmullRom(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSplineSegmentCatmullRom(p1, p2, p3, p4, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineSegmentCatmullRom(
//       p1: Vector2,
//       p2: Vector2,
//       p3: Vector2,
//       p4: Vector2,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](4)
//     !(__ptr_1 + 0) = p1
//     !(__ptr_1 + 1) = p2
//     !(__ptr_1 + 2) = p3
//     !(__ptr_1 + 3) = p4
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSplineSegmentCatmullRom(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       (__ptr_1 + 2),
//       (__ptr_1 + 3),
//       thick,
//       (__ptr_0 + 0)
//     )
//   end DrawSplineSegmentCatmullRom

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineSegmentLinear(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       thick: Float,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawSplineSegmentLinear(p1, p2, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawSplineSegmentLinear(
//       p1: Vector2,
//       p2: Vector2,
//       thick: Float,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_1 + 0) = p1
//     !(__ptr_1 + 1) = p2
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawSplineSegmentLinear(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       thick,
//       (__ptr_0 + 0)
//     )
//   end DrawSplineSegmentLinear

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawText(
//       text: CString,
//       posX: CInt,
//       posY: CInt,
//       fontSize: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawText(text, posX, posY, fontSize, (__ptr_0 + 0))
//   end DrawText

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawText(
//       text: CString,
//       posX: CInt,
//       posY: CInt,
//       fontSize: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawText(text, posX, posY, fontSize, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextCodepoint(
//       font: Ptr[Font],
//       codepoint: CInt,
//       position: Ptr[Vector2],
//       fontSize: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTextCodepoint(
//       font,
//       codepoint,
//       position,
//       fontSize,
//       tint
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextCodepoint(
//       font: Font,
//       codepoint: CInt,
//       position: Vector2,
//       fontSize: Float,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_2: Ptr[Font] = alloc[Font](1)
//     !(__ptr_2 + 0) = font
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawTextCodepoint(
//       (__ptr_2 + 0),
//       codepoint,
//       (__ptr_1 + 0),
//       fontSize,
//       (__ptr_0 + 0)
//     )
//   end DrawTextCodepoint

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextCodepoints(
//       font: Font,
//       codepoints: Ptr[CInt],
//       codepointCount: CInt,
//       position: Vector2,
//       fontSize: Float,
//       spacing: Float,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_2: Ptr[Font] = alloc[Font](1)
//     !(__ptr_2 + 0) = font
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawTextCodepoints(
//       (__ptr_2 + 0),
//       codepoints,
//       codepointCount,
//       (__ptr_1 + 0),
//       fontSize,
//       spacing,
//       (__ptr_0 + 0)
//     )
//   end DrawTextCodepoints

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextCodepoints(
//       font: Ptr[Font],
//       codepoints: Ptr[CInt],
//       codepointCount: CInt,
//       position: Ptr[Vector2],
//       fontSize: Float,
//       spacing: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTextCodepoints(
//       font,
//       codepoints,
//       codepointCount,
//       position,
//       fontSize,
//       spacing,
//       tint
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextEx(
//       font: Font,
//       text: CString,
//       position: Vector2,
//       fontSize: Float,
//       spacing: Float,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_2: Ptr[Font] = alloc[Font](1)
//     !(__ptr_2 + 0) = font
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawTextEx(
//       (__ptr_2 + 0),
//       text,
//       (__ptr_1 + 0),
//       fontSize,
//       spacing,
//       (__ptr_0 + 0)
//     )
//   end DrawTextEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextEx(
//       font: Ptr[Font],
//       text: CString,
//       position: Ptr[Vector2],
//       fontSize: Float,
//       spacing: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTextEx(font, text, position, fontSize, spacing, tint)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextPro(
//       font: Ptr[Font],
//       text: CString,
//       position: Ptr[Vector2],
//       origin: Ptr[Vector2],
//       rotation: Float,
//       fontSize: Float,
//       spacing: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTextPro(
//       font,
//       text,
//       position,
//       origin,
//       rotation,
//       fontSize,
//       spacing,
//       tint
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextPro(
//       font: Font,
//       text: CString,
//       position: Vector2,
//       origin: Vector2,
//       rotation: Float,
//       fontSize: Float,
//       spacing: Float,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
//     val __ptr_2: Ptr[Font] = alloc[Font](1)
//     !(__ptr_2 + 0) = font
//     !(__ptr_1 + 0) = position
//     !(__ptr_1 + 1) = origin
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawTextPro(
//       (__ptr_2 + 0),
//       text,
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       rotation,
//       fontSize,
//       spacing,
//       (__ptr_0 + 0)
//     )
//   end DrawTextPro

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTexture(
//       texture: Ptr[Texture2D],
//       posX: CInt,
//       posY: CInt,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTexture(texture, posX, posY, tint)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTexture(texture: Texture2D, posX: CInt, posY: CInt, tint: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Texture2D] = alloc[Texture2D](1)
//     !(__ptr_1 + 0) = texture
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawTexture((__ptr_1 + 0), posX, posY, (__ptr_0 + 0))
//   end DrawTexture

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextureEx(
//       texture: Texture2D,
//       position: Vector2,
//       rotation: Float,
//       scale: Float,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_2: Ptr[Texture2D] = alloc[Texture2D](1)
//     !(__ptr_2 + 0) = texture
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawTextureEx(
//       (__ptr_2 + 0),
//       (__ptr_1 + 0),
//       rotation,
//       scale,
//       (__ptr_0 + 0)
//     )
//   end DrawTextureEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextureEx(
//       texture: Ptr[Texture2D],
//       position: Ptr[Vector2],
//       rotation: Float,
//       scale: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTextureEx(texture, position, rotation, scale, tint)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextureNPatch(
//       texture: Texture2D,
//       nPatchInfo: NPatchInfo,
//       dest: Rectangle,
//       origin: Vector2,
//       rotation: Float,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_4: Ptr[Rectangle] = alloc[Rectangle](1)
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_3: Ptr[Texture2D] = alloc[Texture2D](1)
//     val __ptr_2: Ptr[NPatchInfo] = alloc[NPatchInfo](1)
//     !(__ptr_3 + 0) = texture
//     !(__ptr_2 + 0) = nPatchInfo
//     !(__ptr_4 + 0) = dest
//     !(__ptr_1 + 0) = origin
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawTextureNPatch(
//       (__ptr_3 + 0),
//       (__ptr_2 + 0),
//       (__ptr_4 + 0),
//       (__ptr_1 + 0),
//       rotation,
//       (__ptr_0 + 0)
//     )
//   end DrawTextureNPatch

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextureNPatch(
//       texture: Ptr[Texture2D],
//       nPatchInfo: Ptr[NPatchInfo],
//       dest: Ptr[Rectangle],
//       origin: Ptr[Vector2],
//       rotation: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTextureNPatch(
//       texture,
//       nPatchInfo,
//       dest,
//       origin,
//       rotation,
//       tint
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTexturePro(
//       texture: Texture2D,
//       source: Rectangle,
//       dest: Rectangle,
//       origin: Vector2,
//       rotation: Float,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_2: Ptr[Texture2D] = alloc[Texture2D](1)
//     val __ptr_3: Ptr[Rectangle] = alloc[Rectangle](2)
//     !(__ptr_2 + 0) = texture
//     !(__ptr_3 + 0) = source
//     !(__ptr_3 + 1) = dest
//     !(__ptr_1 + 0) = origin
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawTexturePro(
//       (__ptr_2 + 0),
//       (__ptr_3 + 0),
//       (__ptr_3 + 1),
//       (__ptr_1 + 0),
//       rotation,
//       (__ptr_0 + 0)
//     )
//   end DrawTexturePro

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTexturePro(
//       texture: Ptr[Texture2D],
//       source: Ptr[Rectangle],
//       dest: Ptr[Rectangle],
//       origin: Ptr[Vector2],
//       rotation: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTexturePro(
//       texture,
//       source,
//       dest,
//       origin,
//       rotation,
//       tint
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextureRec(
//       texture: Texture2D,
//       source: Rectangle,
//       position: Vector2,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_2: Ptr[Texture2D] = alloc[Texture2D](1)
//     val __ptr_3: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_2 + 0) = texture
//     !(__ptr_3 + 0) = source
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawTextureRec(
//       (__ptr_2 + 0),
//       (__ptr_3 + 0),
//       (__ptr_1 + 0),
//       (__ptr_0 + 0)
//     )
//   end DrawTextureRec

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextureRec(
//       texture: Ptr[Texture2D],
//       source: Ptr[Rectangle],
//       position: Ptr[Vector2],
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTextureRec(texture, source, position, tint)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextureV(
//       texture: Ptr[Texture2D],
//       position: Ptr[Vector2],
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTextureV(texture, position, tint)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTextureV(texture: Texture2D, position: Vector2, tint: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_2: Ptr[Texture2D] = alloc[Texture2D](1)
//     !(__ptr_2 + 0) = texture
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_DrawTextureV((__ptr_2 + 0), (__ptr_1 + 0), (__ptr_0 + 0))
//   end DrawTextureV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangle(v1: Vector2, v2: Vector2, v3: Vector2, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_1 + 0) = v1
//     !(__ptr_1 + 1) = v2
//     !(__ptr_1 + 2) = v3
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawTriangle(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       (__ptr_1 + 2),
//       (__ptr_0 + 0)
//     )
//   end DrawTriangle

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangle(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2],
//       v3: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTriangle(v1, v2, v3, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangle3D(
//       v1: Ptr[Vector3],
//       v2: Ptr[Vector3],
//       v3: Ptr[Vector3],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTriangle3D(v1, v2, v3, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangle3D(v1: Vector3, v2: Vector3, v3: Vector3, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_1 + 0) = v1
//     !(__ptr_1 + 1) = v2
//     !(__ptr_1 + 2) = v3
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawTriangle3D(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       (__ptr_1 + 2),
//       (__ptr_0 + 0)
//     )
//   end DrawTriangle3D

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangleFan(points: Ptr[Vector2], pointCount: CInt, color: Color)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawTriangleFan(points, pointCount, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangleFan(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTriangleFan(points, pointCount, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangleLines(
//       v1: Ptr[Vector2],
//       v2: Ptr[Vector2],
//       v3: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTriangleLines(v1, v2, v3, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangleLines(v1: Vector2, v2: Vector2, v3: Vector2, color: Color)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_1 + 0) = v1
//     !(__ptr_1 + 1) = v2
//     !(__ptr_1 + 2) = v3
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawTriangleLines(
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       (__ptr_1 + 2),
//       (__ptr_0 + 0)
//     )
//   end DrawTriangleLines

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangleStrip(points: Ptr[Vector2], pointCount: CInt, color: Color)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawTriangleStrip(points, pointCount, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangleStrip(
//       points: Ptr[Vector2],
//       pointCount: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTriangleStrip(points, pointCount, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangleStrip3D(points: Ptr[Vector3], pointCount: CInt, color: Color)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_DrawTriangleStrip3D(points, pointCount, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def DrawTriangleStrip3D(
//       points: Ptr[Vector3],
//       pointCount: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_DrawTriangleStrip3D(points, pointCount, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportAutomationEventList(list: AutomationEventList, fileName: CString)(
//       using Zone
//   ): Boolean =
//     val __ptr_0: Ptr[AutomationEventList] = alloc[AutomationEventList](1)
//     !(__ptr_0 + 0) = list
//     __sn_wrap_raylib_ExportAutomationEventList((__ptr_0 + 0), fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportAutomationEventList(
//       list: Ptr[AutomationEventList],
//       fileName: CString
//   ): Boolean =
//     __sn_wrap_raylib_ExportAutomationEventList(list, fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportFontAsCode(font: Font, fileName: CString)(using Zone): Boolean =
//     val __ptr_0: Ptr[Font] = alloc[Font](1)
//     !(__ptr_0 + 0) = font
//     __sn_wrap_raylib_ExportFontAsCode((__ptr_0 + 0), fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportFontAsCode(font: Ptr[Font], fileName: CString): Boolean =
//     __sn_wrap_raylib_ExportFontAsCode(font, fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportImage(image: Image, fileName: CString)(using Zone): Boolean =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = image
//     __sn_wrap_raylib_ExportImage((__ptr_0 + 0), fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportImage(image: Ptr[Image], fileName: CString): Boolean =
//     __sn_wrap_raylib_ExportImage(image, fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportImageAsCode(image: Ptr[Image], fileName: CString): Boolean =
//     __sn_wrap_raylib_ExportImageAsCode(image, fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportImageAsCode(image: Image, fileName: CString)(using Zone): Boolean =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = image
//     __sn_wrap_raylib_ExportImageAsCode((__ptr_0 + 0), fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportImageToMemory(
//       image: Ptr[Image],
//       fileType: CString,
//       fileSize: Ptr[CInt]
//   ): Ptr[CUnsignedChar] =
//     __sn_wrap_raylib_ExportImageToMemory(image, fileType, fileSize)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportImageToMemory(image: Image, fileType: CString, fileSize: Ptr[CInt])(
//       using Zone
//   ): Ptr[CUnsignedChar] =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = image
//     __sn_wrap_raylib_ExportImageToMemory((__ptr_0 + 0), fileType, fileSize)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportMesh(mesh: Mesh, fileName: CString)(using Zone): Boolean =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     !(__ptr_0 + 0) = mesh
//     __sn_wrap_raylib_ExportMesh((__ptr_0 + 0), fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportMesh(mesh: Ptr[Mesh], fileName: CString): Boolean =
//     __sn_wrap_raylib_ExportMesh(mesh, fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportWave(wave: Wave, fileName: CString)(using Zone): Boolean =
//     val __ptr_0: Ptr[Wave] = alloc[Wave](1)
//     !(__ptr_0 + 0) = wave
//     __sn_wrap_raylib_ExportWave((__ptr_0 + 0), fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportWave(wave: Ptr[Wave], fileName: CString): Boolean =
//     __sn_wrap_raylib_ExportWave(wave, fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportWaveAsCode(wave: Wave, fileName: CString)(using Zone): Boolean =
//     val __ptr_0: Ptr[Wave] = alloc[Wave](1)
//     !(__ptr_0 + 0) = wave
//     __sn_wrap_raylib_ExportWaveAsCode((__ptr_0 + 0), fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ExportWaveAsCode(wave: Ptr[Wave], fileName: CString): Boolean =
//     __sn_wrap_raylib_ExportWaveAsCode(wave, fileName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def Fade(color: Ptr[Color], alpha: Float)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     __sn_wrap_raylib_Fade(color, alpha, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def Fade(color: Ptr[Color], alpha: Float)(__return: Ptr[Color]): Unit =
//     __sn_wrap_raylib_Fade(color, alpha, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def Fade(color: Color, alpha: Float)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_Fade((__ptr_0 + 0), alpha, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageCellular(width: CInt, height: CInt, tileSize: CInt)(using
//       Zone
//   ): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_GenImageCellular(width, height, tileSize, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageCellular(width: CInt, height: CInt, tileSize: CInt)(
//       __return: Ptr[Image]
//   ): Unit =
//     __sn_wrap_raylib_GenImageCellular(width, height, tileSize, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageChecked(
//       width: CInt,
//       height: CInt,
//       checksX: CInt,
//       checksY: CInt,
//       col1: Ptr[Color],
//       col2: Ptr[Color]
//   )(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_GenImageChecked(
//       width,
//       height,
//       checksX,
//       checksY,
//       col1,
//       col2,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageChecked(
//       width: CInt,
//       height: CInt,
//       checksX: CInt,
//       checksY: CInt,
//       col1: Color,
//       col2: Color
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     val __ptr_1: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = col1
//     !(__ptr_0 + 1) = col2
//     __sn_wrap_raylib_GenImageChecked(
//       width,
//       height,
//       checksX,
//       checksY,
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_1 + 0)
//     )
//     !(__ptr_1 + 0)
//   end GenImageChecked

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageChecked(
//       width: CInt,
//       height: CInt,
//       checksX: CInt,
//       checksY: CInt,
//       col1: Ptr[Color],
//       col2: Ptr[Color]
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_GenImageChecked(
//       width,
//       height,
//       checksX,
//       checksY,
//       col1,
//       col2,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GenImageChecked

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageColor(width: CInt, height: CInt, color: Color)(using
//       Zone
//   ): Image =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_GenImageColor(width, height, (__ptr_0 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)
//   end GenImageColor

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageColor(width: CInt, height: CInt, color: Ptr[Color])(using
//       Zone
//   ): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_GenImageColor(width, height, color, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageColor(width: CInt, height: CInt, color: Ptr[Color])(
//       __return: Ptr[Image]
//   ): Unit =
//     __sn_wrap_raylib_GenImageColor(width, height, color, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageFontAtlas(
//       glyphs: Ptr[GlyphInfo],
//       glyphRecs: Ptr[Ptr[Rectangle]],
//       glyphCount: CInt,
//       fontSize: CInt,
//       padding: CInt,
//       packMethod: CInt
//   )(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_GenImageFontAtlas(
//       glyphs,
//       glyphRecs,
//       glyphCount,
//       fontSize,
//       padding,
//       packMethod,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageFontAtlas(
//       glyphs: Ptr[GlyphInfo],
//       glyphRecs: Ptr[Ptr[Rectangle]],
//       glyphCount: CInt,
//       fontSize: CInt,
//       padding: CInt,
//       packMethod: CInt
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_GenImageFontAtlas(
//       glyphs,
//       glyphRecs,
//       glyphCount,
//       fontSize,
//       padding,
//       packMethod,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GenImageFontAtlas

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageGradientLinear(
//       width: CInt,
//       height: CInt,
//       direction: CInt,
//       start: Ptr[Color],
//       end: Ptr[Color]
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_GenImageGradientLinear(
//       width,
//       height,
//       direction,
//       start,
//       end,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GenImageGradientLinear

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageGradientLinear(
//       width: CInt,
//       height: CInt,
//       direction: CInt,
//       start: Color,
//       end: Color
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     val __ptr_1: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = start
//     !(__ptr_0 + 1) = end
//     __sn_wrap_raylib_GenImageGradientLinear(
//       width,
//       height,
//       direction,
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_1 + 0)
//     )
//     !(__ptr_1 + 0)
//   end GenImageGradientLinear

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageGradientLinear(
//       width: CInt,
//       height: CInt,
//       direction: CInt,
//       start: Ptr[Color],
//       end: Ptr[Color]
//   )(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_GenImageGradientLinear(
//       width,
//       height,
//       direction,
//       start,
//       end,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageGradientRadial(
//       width: CInt,
//       height: CInt,
//       density: Float,
//       inner: Ptr[Color],
//       outer: Ptr[Color]
//   )(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_GenImageGradientRadial(
//       width,
//       height,
//       density,
//       inner,
//       outer,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageGradientRadial(
//       width: CInt,
//       height: CInt,
//       density: Float,
//       inner: Color,
//       outer: Color
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     val __ptr_1: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = inner
//     !(__ptr_0 + 1) = outer
//     __sn_wrap_raylib_GenImageGradientRadial(
//       width,
//       height,
//       density,
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_1 + 0)
//     )
//     !(__ptr_1 + 0)
//   end GenImageGradientRadial

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageGradientRadial(
//       width: CInt,
//       height: CInt,
//       density: Float,
//       inner: Ptr[Color],
//       outer: Ptr[Color]
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_GenImageGradientRadial(
//       width,
//       height,
//       density,
//       inner,
//       outer,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GenImageGradientRadial

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageGradientSquare(
//       width: CInt,
//       height: CInt,
//       density: Float,
//       inner: Ptr[Color],
//       outer: Ptr[Color]
//   )(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_GenImageGradientSquare(
//       width,
//       height,
//       density,
//       inner,
//       outer,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageGradientSquare(
//       width: CInt,
//       height: CInt,
//       density: Float,
//       inner: Color,
//       outer: Color
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     val __ptr_1: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = inner
//     !(__ptr_0 + 1) = outer
//     __sn_wrap_raylib_GenImageGradientSquare(
//       width,
//       height,
//       density,
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_1 + 0)
//     )
//     !(__ptr_1 + 0)
//   end GenImageGradientSquare

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageGradientSquare(
//       width: CInt,
//       height: CInt,
//       density: Float,
//       inner: Ptr[Color],
//       outer: Ptr[Color]
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_GenImageGradientSquare(
//       width,
//       height,
//       density,
//       inner,
//       outer,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GenImageGradientSquare

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImagePerlinNoise(
//       width: CInt,
//       height: CInt,
//       offsetX: CInt,
//       offsetY: CInt,
//       scale: Float
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_GenImagePerlinNoise(
//       width,
//       height,
//       offsetX,
//       offsetY,
//       scale,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GenImagePerlinNoise

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImagePerlinNoise(
//       width: CInt,
//       height: CInt,
//       offsetX: CInt,
//       offsetY: CInt,
//       scale: Float
//   )(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_GenImagePerlinNoise(
//       width,
//       height,
//       offsetX,
//       offsetY,
//       scale,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageText(width: CInt, height: CInt, text: CString)(using
//       Zone
//   ): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_GenImageText(width, height, text, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageText(width: CInt, height: CInt, text: CString)(
//       __return: Ptr[Image]
//   ): Unit =
//     __sn_wrap_raylib_GenImageText(width, height, text, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageWhiteNoise(width: CInt, height: CInt, factor: Float)(
//       __return: Ptr[Image]
//   ): Unit =
//     __sn_wrap_raylib_GenImageWhiteNoise(width, height, factor, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenImageWhiteNoise(width: CInt, height: CInt, factor: Float)(using
//       Zone
//   ): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_GenImageWhiteNoise(width, height, factor, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshCone(radius: Float, height: Float, slices: CInt)(
//       __return: Ptr[Mesh]
//   ): Unit =
//     __sn_wrap_raylib_GenMeshCone(radius, height, slices, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshCone(radius: Float, height: Float, slices: CInt)(using
//       Zone
//   ): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     __sn_wrap_raylib_GenMeshCone(radius, height, slices, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshCube(width: Float, height: Float, length: Float)(using
//       Zone
//   ): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     __sn_wrap_raylib_GenMeshCube(width, height, length, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshCube(width: Float, height: Float, length: Float)(
//       __return: Ptr[Mesh]
//   ): Unit =
//     __sn_wrap_raylib_GenMeshCube(width, height, length, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshCubicmap(cubicmap: Image, cubeSize: Vector3)(using Zone): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     val __ptr_2: Ptr[Image] = alloc[Image](1)
//     !(__ptr_2 + 0) = cubicmap
//     !(__ptr_1 + 0) = cubeSize
//     __sn_wrap_raylib_GenMeshCubicmap(
//       (__ptr_2 + 0),
//       (__ptr_1 + 0),
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GenMeshCubicmap

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshCubicmap(cubicmap: Ptr[Image], cubeSize: Ptr[Vector3])(using
//       Zone
//   ): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     __sn_wrap_raylib_GenMeshCubicmap(cubicmap, cubeSize, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshCubicmap(cubicmap: Ptr[Image], cubeSize: Ptr[Vector3])(
//       __return: Ptr[Mesh]
//   ): Unit =
//     __sn_wrap_raylib_GenMeshCubicmap(cubicmap, cubeSize, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshCylinder(radius: Float, height: Float, slices: CInt)(using
//       Zone
//   ): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     __sn_wrap_raylib_GenMeshCylinder(radius, height, slices, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshCylinder(radius: Float, height: Float, slices: CInt)(
//       __return: Ptr[Mesh]
//   ): Unit =
//     __sn_wrap_raylib_GenMeshCylinder(radius, height, slices, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshHeightmap(heightmap: Ptr[Image], size: Ptr[Vector3])(
//       __return: Ptr[Mesh]
//   ): Unit =
//     __sn_wrap_raylib_GenMeshHeightmap(heightmap, size, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshHeightmap(heightmap: Image, size: Vector3)(using Zone): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     val __ptr_2: Ptr[Image] = alloc[Image](1)
//     !(__ptr_2 + 0) = heightmap
//     !(__ptr_1 + 0) = size
//     __sn_wrap_raylib_GenMeshHeightmap(
//       (__ptr_2 + 0),
//       (__ptr_1 + 0),
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GenMeshHeightmap

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshHeightmap(heightmap: Ptr[Image], size: Ptr[Vector3])(using
//       Zone
//   ): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     __sn_wrap_raylib_GenMeshHeightmap(heightmap, size, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshHemiSphere(radius: Float, rings: CInt, slices: CInt)(using
//       Zone
//   ): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     __sn_wrap_raylib_GenMeshHemiSphere(radius, rings, slices, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshHemiSphere(radius: Float, rings: CInt, slices: CInt)(
//       __return: Ptr[Mesh]
//   ): Unit =
//     __sn_wrap_raylib_GenMeshHemiSphere(radius, rings, slices, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshKnot(radius: Float, size: Float, radSeg: CInt, sides: CInt)(
//       __return: Ptr[Mesh]
//   ): Unit =
//     __sn_wrap_raylib_GenMeshKnot(radius, size, radSeg, sides, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshKnot(radius: Float, size: Float, radSeg: CInt, sides: CInt)(using
//       Zone
//   ): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     __sn_wrap_raylib_GenMeshKnot(radius, size, radSeg, sides, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshPlane(width: Float, length: Float, resX: CInt, resZ: CInt)(
//       __return: Ptr[Mesh]
//   ): Unit =
//     __sn_wrap_raylib_GenMeshPlane(width, length, resX, resZ, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshPlane(width: Float, length: Float, resX: CInt, resZ: CInt)(using
//       Zone
//   ): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     __sn_wrap_raylib_GenMeshPlane(width, length, resX, resZ, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshPoly(sides: CInt, radius: Float)(__return: Ptr[Mesh]): Unit =
//     __sn_wrap_raylib_GenMeshPoly(sides, radius, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshPoly(sides: CInt, radius: Float)(using Zone): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     __sn_wrap_raylib_GenMeshPoly(sides, radius, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshSphere(radius: Float, rings: CInt, slices: CInt)(using
//       Zone
//   ): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     __sn_wrap_raylib_GenMeshSphere(radius, rings, slices, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshSphere(radius: Float, rings: CInt, slices: CInt)(
//       __return: Ptr[Mesh]
//   ): Unit =
//     __sn_wrap_raylib_GenMeshSphere(radius, rings, slices, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshTorus(radius: Float, size: Float, radSeg: CInt, sides: CInt)(using
//       Zone
//   ): Mesh =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     __sn_wrap_raylib_GenMeshTorus(radius, size, radSeg, sides, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GenMeshTorus(radius: Float, size: Float, radSeg: CInt, sides: CInt)(
//       __return: Ptr[Mesh]
//   ): Unit =
//     __sn_wrap_raylib_GenMeshTorus(radius, size, radSeg, sides, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCameraMatrix(camera: Camera)(using Zone): Matrix =
//     val __ptr_0: Ptr[Camera] = alloc[Camera](1)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = camera
//     __sn_wrap_raylib_GetCameraMatrix((__ptr_0 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCameraMatrix(camera: Ptr[Camera])(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_GetCameraMatrix(camera, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCameraMatrix(camera: Ptr[Camera])(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_GetCameraMatrix(camera, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCameraMatrix2D(camera: Camera2D)(using Zone): Matrix =
//     val __ptr_0: Ptr[Camera2D] = alloc[Camera2D](1)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = camera
//     __sn_wrap_raylib_GetCameraMatrix2D((__ptr_0 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCameraMatrix2D(camera: Ptr[Camera2D])(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_GetCameraMatrix2D(camera, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCameraMatrix2D(camera: Ptr[Camera2D])(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_GetCameraMatrix2D(camera, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCollisionRec(rec1: Rectangle, rec2: Rectangle)(using Zone): Rectangle =
//     val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](3)
//     !(__ptr_0 + 0) = rec1
//     !(__ptr_0 + 1) = rec2
//     __sn_wrap_raylib_GetCollisionRec(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end GetCollisionRec

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCollisionRec(rec1: Ptr[Rectangle], rec2: Ptr[Rectangle])(using
//       Zone
//   ): Rectangle =
//     val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
//     __sn_wrap_raylib_GetCollisionRec(rec1, rec2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetCollisionRec(rec1: Ptr[Rectangle], rec2: Ptr[Rectangle])(
//       __return: Ptr[Rectangle]
//   ): Unit =
//     __sn_wrap_raylib_GetCollisionRec(rec1, rec2, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetColor(hexValue: CUnsignedInt)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     __sn_wrap_raylib_GetColor(hexValue, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetColor(hexValue: CUnsignedInt)(__return: Ptr[Color]): Unit =
//     __sn_wrap_raylib_GetColor(hexValue, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetFontDefault()(using Zone): Font =
//     val __ptr_0: Ptr[Font] = alloc[Font](1)
//     __sn_wrap_raylib_GetFontDefault((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetFontDefault()(__return: Ptr[Font]): Unit =
//     __sn_wrap_raylib_GetFontDefault(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGestureDragVector()(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetGestureDragVector((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGestureDragVector()(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetGestureDragVector(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGesturePinchVector()(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetGesturePinchVector((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGesturePinchVector()(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetGesturePinchVector(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGlyphAtlasRec(font: Ptr[Font], codepoint: CInt)(
//       __return: Ptr[Rectangle]
//   ): Unit =
//     __sn_wrap_raylib_GetGlyphAtlasRec(font, codepoint, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGlyphAtlasRec(font: Font, codepoint: CInt)(using Zone): Rectangle =
//     val __ptr_0: Ptr[Font] = alloc[Font](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_0 + 0) = font
//     __sn_wrap_raylib_GetGlyphAtlasRec((__ptr_0 + 0), codepoint, (__ptr_1 + 0))
//     !(__ptr_1 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGlyphAtlasRec(font: Ptr[Font], codepoint: CInt)(using
//       Zone
//   ): Rectangle =
//     val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
//     __sn_wrap_raylib_GetGlyphAtlasRec(font, codepoint, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGlyphIndex(font: Ptr[Font], codepoint: CInt): CInt =
//     __sn_wrap_raylib_GetGlyphIndex(font, codepoint)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGlyphIndex(font: Font, codepoint: CInt)(using Zone): CInt =
//     val __ptr_0: Ptr[Font] = alloc[Font](1)
//     !(__ptr_0 + 0) = font
//     __sn_wrap_raylib_GetGlyphIndex((__ptr_0 + 0), codepoint)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGlyphInfo(font: Ptr[Font], codepoint: CInt)(
//       __return: Ptr[GlyphInfo]
//   ): Unit =
//     __sn_wrap_raylib_GetGlyphInfo(font, codepoint, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGlyphInfo(font: Ptr[Font], codepoint: CInt)(using Zone): GlyphInfo =
//     val __ptr_0: Ptr[GlyphInfo] = alloc[GlyphInfo](1)
//     __sn_wrap_raylib_GetGlyphInfo(font, codepoint, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetGlyphInfo(font: Font, codepoint: CInt)(using Zone): GlyphInfo =
//     val __ptr_0: Ptr[GlyphInfo] = alloc[GlyphInfo](1)
//     val __ptr_1: Ptr[Font] = alloc[Font](1)
//     !(__ptr_1 + 0) = font
//     __sn_wrap_raylib_GetGlyphInfo((__ptr_1 + 0), codepoint, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetImageAlphaBorder(image: Ptr[Image], threshold: Float)(using
//       Zone
//   ): Rectangle =
//     val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
//     __sn_wrap_raylib_GetImageAlphaBorder(image, threshold, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetImageAlphaBorder(image: Image, threshold: Float)(using
//       Zone
//   ): Rectangle =
//     val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
//     val __ptr_1: Ptr[Image] = alloc[Image](1)
//     !(__ptr_1 + 0) = image
//     __sn_wrap_raylib_GetImageAlphaBorder(
//       (__ptr_1 + 0),
//       threshold,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GetImageAlphaBorder

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetImageAlphaBorder(image: Ptr[Image], threshold: Float)(
//       __return: Ptr[Rectangle]
//   ): Unit =
//     __sn_wrap_raylib_GetImageAlphaBorder(image, threshold, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetImageColor(image: Ptr[Image], x: CInt, y: CInt)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     __sn_wrap_raylib_GetImageColor(image, x, y, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetImageColor(image: Ptr[Image], x: CInt, y: CInt)(
//       __return: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_GetImageColor(image, x, y, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetImageColor(image: Image, x: CInt, y: CInt)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Image] = alloc[Image](1)
//     !(__ptr_1 + 0) = image
//     __sn_wrap_raylib_GetImageColor((__ptr_1 + 0), x, y, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMeshBoundingBox(mesh: Mesh)(using Zone): BoundingBox =
//     val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
//     val __ptr_1: Ptr[Mesh] = alloc[Mesh](1)
//     !(__ptr_1 + 0) = mesh
//     __sn_wrap_raylib_GetMeshBoundingBox((__ptr_1 + 0), (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMeshBoundingBox(mesh: Ptr[Mesh])(__return: Ptr[BoundingBox]): Unit =
//     __sn_wrap_raylib_GetMeshBoundingBox(mesh, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMeshBoundingBox(mesh: Ptr[Mesh])(using Zone): BoundingBox =
//     val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
//     __sn_wrap_raylib_GetMeshBoundingBox(mesh, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetModelBoundingBox(model: Model)(using Zone): BoundingBox =
//     val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
//     val __ptr_1: Ptr[Model] = alloc[Model](1)
//     !(__ptr_1 + 0) = model
//     __sn_wrap_raylib_GetModelBoundingBox((__ptr_1 + 0), (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetModelBoundingBox(model: Ptr[Model])(using Zone): BoundingBox =
//     val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
//     __sn_wrap_raylib_GetModelBoundingBox(model, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetModelBoundingBox(model: Ptr[Model])(__return: Ptr[BoundingBox]): Unit =
//     __sn_wrap_raylib_GetModelBoundingBox(model, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMonitorPosition(monitor: CInt)(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetMonitorPosition(monitor, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMonitorPosition(monitor: CInt)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetMonitorPosition(monitor, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMouseDelta()(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetMouseDelta((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMouseDelta()(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetMouseDelta(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMousePosition()(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetMousePosition((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMousePosition()(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetMousePosition(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMouseRay(mousePosition: Vector2, camera: Camera)(using Zone): Ray =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_1: Ptr[Ray] = alloc[Ray](1)
//     val __ptr_2: Ptr[Camera] = alloc[Camera](1)
//     !(__ptr_0 + 0) = mousePosition
//     !(__ptr_2 + 0) = camera
//     __sn_wrap_raylib_GetMouseRay((__ptr_0 + 0), (__ptr_2 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)
//   end GetMouseRay

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMouseRay(mousePosition: Ptr[Vector2], camera: Ptr[Camera])(using
//       Zone
//   ): Ray =
//     val __ptr_0: Ptr[Ray] = alloc[Ray](1)
//     __sn_wrap_raylib_GetMouseRay(mousePosition, camera, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMouseRay(mousePosition: Ptr[Vector2], camera: Ptr[Camera])(
//       __return: Ptr[Ray]
//   ): Unit =
//     __sn_wrap_raylib_GetMouseRay(mousePosition, camera, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMouseWheelMoveV()(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetMouseWheelMoveV((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMouseWheelMoveV()(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetMouseWheelMoveV(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMusicTimeLength(music: Ptr[Music]): Float =
//     __sn_wrap_raylib_GetMusicTimeLength(music)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMusicTimeLength(music: Music)(using Zone): Float =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_GetMusicTimeLength((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMusicTimePlayed(music: Music)(using Zone): Float =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_GetMusicTimePlayed((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetMusicTimePlayed(music: Ptr[Music]): Float =
//     __sn_wrap_raylib_GetMusicTimePlayed(music)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetPixelColor(srcPtr: Ptr[Byte], format: CInt)(using Zone): Color =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     __sn_wrap_raylib_GetPixelColor(srcPtr, format, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetPixelColor(srcPtr: Ptr[Byte], format: CInt)(
//       __return: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_GetPixelColor(srcPtr, format, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionBox(ray: Ptr[Ray], box: Ptr[BoundingBox])(using
//       Zone
//   ): RayCollision =
//     val __ptr_0: Ptr[RayCollision] = alloc[RayCollision](1)
//     __sn_wrap_raylib_GetRayCollisionBox(ray, box, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionBox(ray: Ptr[Ray], box: Ptr[BoundingBox])(
//       __return: Ptr[RayCollision]
//   ): Unit =
//     __sn_wrap_raylib_GetRayCollisionBox(ray, box, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionBox(ray: Ray, box: BoundingBox)(using Zone): RayCollision =
//     val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
//     val __ptr_1: Ptr[Ray] = alloc[Ray](1)
//     val __ptr_2: Ptr[RayCollision] = alloc[RayCollision](1)
//     !(__ptr_1 + 0) = ray
//     !(__ptr_0 + 0) = box
//     __sn_wrap_raylib_GetRayCollisionBox(
//       (__ptr_1 + 0),
//       (__ptr_0 + 0),
//       (__ptr_2 + 0)
//     )
//     !(__ptr_2 + 0)
//   end GetRayCollisionBox

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionMesh(
//       ray: Ptr[Ray],
//       mesh: Ptr[Mesh],
//       transform: Ptr[Matrix]
//   )(__return: Ptr[RayCollision]): Unit =
//     __sn_wrap_raylib_GetRayCollisionMesh(ray, mesh, transform, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionMesh(ray: Ray, mesh: Mesh, transform: Matrix)(using
//       Zone
//   ): RayCollision =
//     val __ptr_0: Ptr[Ray] = alloc[Ray](1)
//     val __ptr_1: Ptr[Mesh] = alloc[Mesh](1)
//     val __ptr_2: Ptr[RayCollision] = alloc[RayCollision](1)
//     val __ptr_3: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = ray
//     !(__ptr_1 + 0) = mesh
//     !(__ptr_3 + 0) = transform
//     __sn_wrap_raylib_GetRayCollisionMesh(
//       (__ptr_0 + 0),
//       (__ptr_1 + 0),
//       (__ptr_3 + 0),
//       (__ptr_2 + 0)
//     )
//     !(__ptr_2 + 0)
//   end GetRayCollisionMesh

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionMesh(
//       ray: Ptr[Ray],
//       mesh: Ptr[Mesh],
//       transform: Ptr[Matrix]
//   )(using Zone): RayCollision =
//     val __ptr_0: Ptr[RayCollision] = alloc[RayCollision](1)
//     __sn_wrap_raylib_GetRayCollisionMesh(ray, mesh, transform, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end GetRayCollisionMesh

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionQuad(
//       ray: Ptr[Ray],
//       p1: Ptr[Vector3],
//       p2: Ptr[Vector3],
//       p3: Ptr[Vector3],
//       p4: Ptr[Vector3]
//   )(__return: Ptr[RayCollision]): Unit =
//     __sn_wrap_raylib_GetRayCollisionQuad(ray, p1, p2, p3, p4, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionQuad(
//       ray: Ray,
//       p1: Vector3,
//       p2: Vector3,
//       p3: Vector3,
//       p4: Vector3
//   )(using Zone): RayCollision =
//     val __ptr_0: Ptr[Ray] = alloc[Ray](1)
//     val __ptr_1: Ptr[RayCollision] = alloc[RayCollision](1)
//     val __ptr_2: Ptr[Vector3] = alloc[Vector3](4)
//     !(__ptr_0 + 0) = ray
//     !(__ptr_2 + 0) = p1
//     !(__ptr_2 + 1) = p2
//     !(__ptr_2 + 2) = p3
//     !(__ptr_2 + 3) = p4
//     __sn_wrap_raylib_GetRayCollisionQuad(
//       (__ptr_0 + 0),
//       (__ptr_2 + 0),
//       (__ptr_2 + 1),
//       (__ptr_2 + 2),
//       (__ptr_2 + 3),
//       (__ptr_1 + 0)
//     )
//     !(__ptr_1 + 0)
//   end GetRayCollisionQuad

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionQuad(
//       ray: Ptr[Ray],
//       p1: Ptr[Vector3],
//       p2: Ptr[Vector3],
//       p3: Ptr[Vector3],
//       p4: Ptr[Vector3]
//   )(using Zone): RayCollision =
//     val __ptr_0: Ptr[RayCollision] = alloc[RayCollision](1)
//     __sn_wrap_raylib_GetRayCollisionQuad(ray, p1, p2, p3, p4, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end GetRayCollisionQuad

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionSphere(ray: Ray, center: Vector3, radius: Float)(using
//       Zone
//   ): RayCollision =
//     val __ptr_0: Ptr[Ray] = alloc[Ray](1)
//     val __ptr_1: Ptr[RayCollision] = alloc[RayCollision](1)
//     val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_0 + 0) = ray
//     !(__ptr_2 + 0) = center
//     __sn_wrap_raylib_GetRayCollisionSphere(
//       (__ptr_0 + 0),
//       (__ptr_2 + 0),
//       radius,
//       (__ptr_1 + 0)
//     )
//     !(__ptr_1 + 0)
//   end GetRayCollisionSphere

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionSphere(ray: Ptr[Ray], center: Ptr[Vector3], radius: Float)(
//       __return: Ptr[RayCollision]
//   ): Unit =
//     __sn_wrap_raylib_GetRayCollisionSphere(ray, center, radius, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionSphere(ray: Ptr[Ray], center: Ptr[Vector3], radius: Float)(
//       using Zone
//   ): RayCollision =
//     val __ptr_0: Ptr[RayCollision] = alloc[RayCollision](1)
//     __sn_wrap_raylib_GetRayCollisionSphere(ray, center, radius, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionTriangle(
//       ray: Ptr[Ray],
//       p1: Ptr[Vector3],
//       p2: Ptr[Vector3],
//       p3: Ptr[Vector3]
//   )(using Zone): RayCollision =
//     val __ptr_0: Ptr[RayCollision] = alloc[RayCollision](1)
//     __sn_wrap_raylib_GetRayCollisionTriangle(ray, p1, p2, p3, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end GetRayCollisionTriangle

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionTriangle(ray: Ray, p1: Vector3, p2: Vector3, p3: Vector3)(
//       using Zone
//   ): RayCollision =
//     val __ptr_0: Ptr[Ray] = alloc[Ray](1)
//     val __ptr_1: Ptr[RayCollision] = alloc[RayCollision](1)
//     val __ptr_2: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = ray
//     !(__ptr_2 + 0) = p1
//     !(__ptr_2 + 1) = p2
//     !(__ptr_2 + 2) = p3
//     __sn_wrap_raylib_GetRayCollisionTriangle(
//       (__ptr_0 + 0),
//       (__ptr_2 + 0),
//       (__ptr_2 + 1),
//       (__ptr_2 + 2),
//       (__ptr_1 + 0)
//     )
//     !(__ptr_1 + 0)
//   end GetRayCollisionTriangle

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetRayCollisionTriangle(
//       ray: Ptr[Ray],
//       p1: Ptr[Vector3],
//       p2: Ptr[Vector3],
//       p3: Ptr[Vector3]
//   )(__return: Ptr[RayCollision]): Unit =
//     __sn_wrap_raylib_GetRayCollisionTriangle(ray, p1, p2, p3, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetScreenToWorld2D(position: Ptr[Vector2], camera: Ptr[Camera2D])(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetScreenToWorld2D(position, camera, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetScreenToWorld2D(position: Ptr[Vector2], camera: Ptr[Camera2D])(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_GetScreenToWorld2D(position, camera, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetScreenToWorld2D(position: Vector2, camera: Camera2D)(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     val __ptr_1: Ptr[Camera2D] = alloc[Camera2D](1)
//     !(__ptr_0 + 0) = position
//     !(__ptr_1 + 0) = camera
//     __sn_wrap_raylib_GetScreenToWorld2D(
//       (__ptr_0 + 0),
//       (__ptr_1 + 0),
//       (__ptr_0 + 1)
//     )
//     !(__ptr_0 + 1)
//   end GetScreenToWorld2D

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetShaderLocation(shader: Ptr[Shader], uniformName: CString): CInt =
//     __sn_wrap_raylib_GetShaderLocation(shader, uniformName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetShaderLocation(shader: Shader, uniformName: CString)(using
//       Zone
//   ): CInt =
//     val __ptr_0: Ptr[Shader] = alloc[Shader](1)
//     !(__ptr_0 + 0) = shader
//     __sn_wrap_raylib_GetShaderLocation((__ptr_0 + 0), uniformName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetShaderLocationAttrib(shader: Ptr[Shader], attribName: CString): CInt =
//     __sn_wrap_raylib_GetShaderLocationAttrib(shader, attribName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetShaderLocationAttrib(shader: Shader, attribName: CString)(using
//       Zone
//   ): CInt =
//     val __ptr_0: Ptr[Shader] = alloc[Shader](1)
//     !(__ptr_0 + 0) = shader
//     __sn_wrap_raylib_GetShaderLocationAttrib((__ptr_0 + 0), attribName)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointBasis(
//       p1: Vector2,
//       p2: Vector2,
//       p3: Vector2,
//       p4: Vector2,
//       t: Float
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](5)
//     !(__ptr_0 + 0) = p1
//     !(__ptr_0 + 1) = p2
//     !(__ptr_0 + 2) = p3
//     !(__ptr_0 + 3) = p4
//     __sn_wrap_raylib_GetSplinePointBasis(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       (__ptr_0 + 3),
//       t,
//       (__ptr_0 + 4)
//     )
//     !(__ptr_0 + 4)
//   end GetSplinePointBasis

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointBasis(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       t: Float
//   )(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetSplinePointBasis(p1, p2, p3, p4, t, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointBasis(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       t: Float
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetSplinePointBasis(p1, p2, p3, p4, t, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end GetSplinePointBasis

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointBezierCubic(
//       p1: Ptr[Vector2],
//       c2: Ptr[Vector2],
//       c3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       t: Float
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetSplinePointBezierCubic(p1, c2, c3, p4, t, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end GetSplinePointBezierCubic

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointBezierCubic(
//       p1: Ptr[Vector2],
//       c2: Ptr[Vector2],
//       c3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       t: Float
//   )(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetSplinePointBezierCubic(p1, c2, c3, p4, t, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointBezierCubic(
//       p1: Vector2,
//       c2: Vector2,
//       c3: Vector2,
//       p4: Vector2,
//       t: Float
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](5)
//     !(__ptr_0 + 0) = p1
//     !(__ptr_0 + 1) = c2
//     !(__ptr_0 + 2) = c3
//     !(__ptr_0 + 3) = p4
//     __sn_wrap_raylib_GetSplinePointBezierCubic(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       (__ptr_0 + 3),
//       t,
//       (__ptr_0 + 4)
//     )
//     !(__ptr_0 + 4)
//   end GetSplinePointBezierCubic

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointBezierQuad(
//       p1: Ptr[Vector2],
//       c2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       t: Float
//   )(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetSplinePointBezierQuad(p1, c2, p3, t, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointBezierQuad(p1: Vector2, c2: Vector2, p3: Vector2, t: Float)(
//       using Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](4)
//     !(__ptr_0 + 0) = p1
//     !(__ptr_0 + 1) = c2
//     !(__ptr_0 + 2) = p3
//     __sn_wrap_raylib_GetSplinePointBezierQuad(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       t,
//       (__ptr_0 + 3)
//     )
//     !(__ptr_0 + 3)
//   end GetSplinePointBezierQuad

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointBezierQuad(
//       p1: Ptr[Vector2],
//       c2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       t: Float
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetSplinePointBezierQuad(p1, c2, p3, t, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end GetSplinePointBezierQuad

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointCatmullRom(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       t: Float
//   )(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetSplinePointCatmullRom(p1, p2, p3, p4, t, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointCatmullRom(
//       p1: Ptr[Vector2],
//       p2: Ptr[Vector2],
//       p3: Ptr[Vector2],
//       p4: Ptr[Vector2],
//       t: Float
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetSplinePointCatmullRom(p1, p2, p3, p4, t, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end GetSplinePointCatmullRom

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointCatmullRom(
//       p1: Vector2,
//       p2: Vector2,
//       p3: Vector2,
//       p4: Vector2,
//       t: Float
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](5)
//     !(__ptr_0 + 0) = p1
//     !(__ptr_0 + 1) = p2
//     !(__ptr_0 + 2) = p3
//     !(__ptr_0 + 3) = p4
//     __sn_wrap_raylib_GetSplinePointCatmullRom(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       (__ptr_0 + 3),
//       t,
//       (__ptr_0 + 4)
//     )
//     !(__ptr_0 + 4)
//   end GetSplinePointCatmullRom

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointLinear(
//       startPos: Ptr[Vector2],
//       endPos: Ptr[Vector2],
//       t: Float
//   )(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetSplinePointLinear(startPos, endPos, t, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointLinear(startPos: Vector2, endPos: Vector2, t: Float)(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_0 + 0) = startPos
//     !(__ptr_0 + 1) = endPos
//     __sn_wrap_raylib_GetSplinePointLinear(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       t,
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end GetSplinePointLinear

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetSplinePointLinear(
//       startPos: Ptr[Vector2],
//       endPos: Ptr[Vector2],
//       t: Float
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetSplinePointLinear(startPos, endPos, t, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end GetSplinePointLinear

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetTouchPosition(index: CInt)(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetTouchPosition(index, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetTouchPosition(index: CInt)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetTouchPosition(index, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWindowPosition()(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetWindowPosition((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWindowPosition()(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetWindowPosition(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWindowScaleDPI()(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetWindowScaleDPI((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWindowScaleDPI()(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetWindowScaleDPI(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWorldToScreen(position: Ptr[Vector3], camera: Ptr[Camera])(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_GetWorldToScreen(position, camera, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWorldToScreen(position: Ptr[Vector3], camera: Ptr[Camera])(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetWorldToScreen(position, camera, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWorldToScreen(position: Vector3, camera: Camera)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_1: Ptr[Camera] = alloc[Camera](1)
//     val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_2 + 0) = position
//     !(__ptr_1 + 0) = camera
//     __sn_wrap_raylib_GetWorldToScreen(
//       (__ptr_2 + 0),
//       (__ptr_1 + 0),
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GetWorldToScreen

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWorldToScreen2D(position: Vector2, camera: Camera2D)(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     val __ptr_1: Ptr[Camera2D] = alloc[Camera2D](1)
//     !(__ptr_0 + 0) = position
//     !(__ptr_1 + 0) = camera
//     __sn_wrap_raylib_GetWorldToScreen2D(
//       (__ptr_0 + 0),
//       (__ptr_1 + 0),
//       (__ptr_0 + 1)
//     )
//     !(__ptr_0 + 1)
//   end GetWorldToScreen2D

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWorldToScreen2D(position: Ptr[Vector2], camera: Ptr[Camera2D])(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_GetWorldToScreen2D(position, camera, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWorldToScreen2D(position: Ptr[Vector2], camera: Ptr[Camera2D])(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetWorldToScreen2D(position, camera, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWorldToScreenEx(
//       position: Ptr[Vector3],
//       camera: Ptr[Camera],
//       width: CInt,
//       height: CInt
//   )(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_GetWorldToScreenEx(
//       position,
//       camera,
//       width,
//       height,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWorldToScreenEx(
//       position: Vector3,
//       camera: Camera,
//       width: CInt,
//       height: CInt
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_1: Ptr[Camera] = alloc[Camera](1)
//     val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_2 + 0) = position
//     !(__ptr_1 + 0) = camera
//     __sn_wrap_raylib_GetWorldToScreenEx(
//       (__ptr_2 + 0),
//       (__ptr_1 + 0),
//       width,
//       height,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GetWorldToScreenEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def GetWorldToScreenEx(
//       position: Ptr[Vector3],
//       camera: Ptr[Camera],
//       width: CInt,
//       height: CInt
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_GetWorldToScreenEx(
//       position,
//       camera,
//       width,
//       height,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end GetWorldToScreenEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageAlphaClear(image: Ptr[Image], color: Color, threshold: Float)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageAlphaClear(image, (__ptr_0 + 0), threshold)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageAlphaClear(
//       image: Ptr[Image],
//       color: Ptr[Color],
//       threshold: Float
//   ): Unit =
//     __sn_wrap_raylib_ImageAlphaClear(image, color, threshold)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageAlphaMask(image: Ptr[Image], alphaMask: Ptr[Image]): Unit =
//     __sn_wrap_raylib_ImageAlphaMask(image, alphaMask)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageAlphaMask(image: Ptr[Image], alphaMask: Image)(using Zone): Unit =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = alphaMask
//     __sn_wrap_raylib_ImageAlphaMask(image, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageClearBackground(dst: Ptr[Image], color: Color)(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageClearBackground(dst, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageClearBackground(dst: Ptr[Image], color: Ptr[Color]): Unit =
//     __sn_wrap_raylib_ImageClearBackground(dst, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageColorReplace(image: Ptr[Image], color: Color, replace: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](2)
//     !(__ptr_0 + 0) = color
//     !(__ptr_0 + 1) = replace
//     __sn_wrap_raylib_ImageColorReplace(image, (__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageColorReplace(
//       image: Ptr[Image],
//       color: Ptr[Color],
//       replace: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageColorReplace(image, color, replace)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageColorTint(image: Ptr[Image], color: Ptr[Color]): Unit =
//     __sn_wrap_raylib_ImageColorTint(image, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageColorTint(image: Ptr[Image], color: Color)(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageColorTint(image, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageCopy(image: Ptr[Image])(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_ImageCopy(image, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageCopy(image: Ptr[Image])(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_ImageCopy(image, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageCopy(image: Image)(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](2)
//     !(__ptr_0 + 0) = image
//     __sn_wrap_raylib_ImageCopy((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageCrop(image: Ptr[Image], crop: Ptr[Rectangle]): Unit =
//     __sn_wrap_raylib_ImageCrop(image, crop)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageCrop(image: Ptr[Image], crop: Rectangle)(using Zone): Unit =
//     val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_0 + 0) = crop
//     __sn_wrap_raylib_ImageCrop(image, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDraw(
//       dst: Ptr[Image],
//       src: Image,
//       srcRec: Rectangle,
//       dstRec: Rectangle,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](2)
//     val __ptr_2: Ptr[Image] = alloc[Image](1)
//     !(__ptr_2 + 0) = src
//     !(__ptr_1 + 0) = srcRec
//     !(__ptr_1 + 1) = dstRec
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_ImageDraw(
//       dst,
//       (__ptr_2 + 0),
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       (__ptr_0 + 0)
//     )
//   end ImageDraw

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDraw(
//       dst: Ptr[Image],
//       src: Ptr[Image],
//       srcRec: Ptr[Rectangle],
//       dstRec: Ptr[Rectangle],
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDraw(dst, src, srcRec, dstRec, tint)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawCircle(
//       dst: Ptr[Image],
//       centerX: CInt,
//       centerY: CInt,
//       radius: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawCircle(
//       dst,
//       centerX,
//       centerY,
//       radius,
//       (__ptr_0 + 0)
//     )
//   end ImageDrawCircle

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawCircle(
//       dst: Ptr[Image],
//       centerX: CInt,
//       centerY: CInt,
//       radius: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawCircle(dst, centerX, centerY, radius, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawCircleLines(
//       dst: Ptr[Image],
//       centerX: CInt,
//       centerY: CInt,
//       radius: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawCircleLines(dst, centerX, centerY, radius, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawCircleLines(
//       dst: Ptr[Image],
//       centerX: CInt,
//       centerY: CInt,
//       radius: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawCircleLines(
//       dst,
//       centerX,
//       centerY,
//       radius,
//       (__ptr_0 + 0)
//     )
//   end ImageDrawCircleLines

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawCircleLinesV(
//       dst: Ptr[Image],
//       center: Ptr[Vector2],
//       radius: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawCircleLinesV(dst, center, radius, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawCircleLinesV(
//       dst: Ptr[Image],
//       center: Vector2,
//       radius: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = center
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawCircleLinesV(
//       dst,
//       (__ptr_1 + 0),
//       radius,
//       (__ptr_0 + 0)
//     )
//   end ImageDrawCircleLinesV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawCircleV(
//       dst: Ptr[Image],
//       center: Ptr[Vector2],
//       radius: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawCircleV(dst, center, radius, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawCircleV(
//       dst: Ptr[Image],
//       center: Vector2,
//       radius: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = center
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawCircleV(dst, (__ptr_1 + 0), radius, (__ptr_0 + 0))
//   end ImageDrawCircleV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawLine(
//       dst: Ptr[Image],
//       startPosX: CInt,
//       startPosY: CInt,
//       endPosX: CInt,
//       endPosY: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawLine(
//       dst,
//       startPosX,
//       startPosY,
//       endPosX,
//       endPosY,
//       color
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawLine(
//       dst: Ptr[Image],
//       startPosX: CInt,
//       startPosY: CInt,
//       endPosX: CInt,
//       endPosY: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawLine(
//       dst,
//       startPosX,
//       startPosY,
//       endPosX,
//       endPosY,
//       (__ptr_0 + 0)
//     )
//   end ImageDrawLine

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawLineV(
//       dst: Ptr[Image],
//       start: Vector2,
//       end: Vector2,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_1 + 0) = start
//     !(__ptr_1 + 1) = end
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawLineV(
//       dst,
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       (__ptr_0 + 0)
//     )
//   end ImageDrawLineV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawLineV(
//       dst: Ptr[Image],
//       start: Ptr[Vector2],
//       end: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawLineV(dst, start, end, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawPixel(
//       dst: Ptr[Image],
//       posX: CInt,
//       posY: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawPixel(dst, posX, posY, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawPixel(dst: Ptr[Image], posX: CInt, posY: CInt, color: Color)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawPixel(dst, posX, posY, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawPixelV(
//       dst: Ptr[Image],
//       position: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawPixelV(dst, position, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawPixelV(dst: Ptr[Image], position: Vector2, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawPixelV(dst, (__ptr_1 + 0), (__ptr_0 + 0))
//   end ImageDrawPixelV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawRectangle(
//       dst: Ptr[Image],
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawRectangle(
//       dst,
//       posX,
//       posY,
//       width,
//       height,
//       (__ptr_0 + 0)
//     )
//   end ImageDrawRectangle

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawRectangle(
//       dst: Ptr[Image],
//       posX: CInt,
//       posY: CInt,
//       width: CInt,
//       height: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawRectangle(dst, posX, posY, width, height, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawRectangleLines(
//       dst: Ptr[Image],
//       rec: Rectangle,
//       thick: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_1 + 0) = rec
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawRectangleLines(
//       dst,
//       (__ptr_1 + 0),
//       thick,
//       (__ptr_0 + 0)
//     )
//   end ImageDrawRectangleLines

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawRectangleLines(
//       dst: Ptr[Image],
//       rec: Ptr[Rectangle],
//       thick: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawRectangleLines(dst, rec, thick, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawRectangleRec(dst: Ptr[Image], rec: Rectangle, color: Color)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_1 + 0) = rec
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawRectangleRec(dst, (__ptr_1 + 0), (__ptr_0 + 0))
//   end ImageDrawRectangleRec

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawRectangleRec(
//       dst: Ptr[Image],
//       rec: Ptr[Rectangle],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawRectangleRec(dst, rec, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawRectangleV(
//       dst: Ptr[Image],
//       position: Vector2,
//       size: Vector2,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_1 + 0) = position
//     !(__ptr_1 + 1) = size
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawRectangleV(
//       dst,
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       (__ptr_0 + 0)
//     )
//   end ImageDrawRectangleV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawRectangleV(
//       dst: Ptr[Image],
//       position: Ptr[Vector2],
//       size: Ptr[Vector2],
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawRectangleV(dst, position, size, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawText(
//       dst: Ptr[Image],
//       text: CString,
//       posX: CInt,
//       posY: CInt,
//       fontSize: CInt,
//       color: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawText(dst, text, posX, posY, fontSize, color)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawText(
//       dst: Ptr[Image],
//       text: CString,
//       posX: CInt,
//       posY: CInt,
//       fontSize: CInt,
//       color: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageDrawText(
//       dst,
//       text,
//       posX,
//       posY,
//       fontSize,
//       (__ptr_0 + 0)
//     )
//   end ImageDrawText

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawTextEx(
//       dst: Ptr[Image],
//       font: Ptr[Font],
//       text: CString,
//       position: Ptr[Vector2],
//       fontSize: Float,
//       spacing: Float,
//       tint: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageDrawTextEx(
//       dst,
//       font,
//       text,
//       position,
//       fontSize,
//       spacing,
//       tint
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageDrawTextEx(
//       dst: Ptr[Image],
//       font: Font,
//       text: CString,
//       position: Vector2,
//       fontSize: Float,
//       spacing: Float,
//       tint: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_2: Ptr[Font] = alloc[Font](1)
//     !(__ptr_2 + 0) = font
//     !(__ptr_1 + 0) = position
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_ImageDrawTextEx(
//       dst,
//       (__ptr_2 + 0),
//       text,
//       (__ptr_1 + 0),
//       fontSize,
//       spacing,
//       (__ptr_0 + 0)
//     )
//   end ImageDrawTextEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageFromImage(image: Ptr[Image], rec: Ptr[Rectangle])(using
//       Zone
//   ): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_ImageFromImage(image, rec, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageFromImage(image: Image, rec: Rectangle)(using Zone): Image =
//     val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
//     val __ptr_1: Ptr[Image] = alloc[Image](2)
//     !(__ptr_1 + 0) = image
//     !(__ptr_0 + 0) = rec
//     __sn_wrap_raylib_ImageFromImage((__ptr_1 + 0), (__ptr_0 + 0), (__ptr_1 + 1))
//     !(__ptr_1 + 1)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageFromImage(image: Ptr[Image], rec: Ptr[Rectangle])(
//       __return: Ptr[Image]
//   ): Unit =
//     __sn_wrap_raylib_ImageFromImage(image, rec, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageResizeCanvas(
//       image: Ptr[Image],
//       newWidth: CInt,
//       newHeight: CInt,
//       offsetX: CInt,
//       offsetY: CInt,
//       fill: Color
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = fill
//     __sn_wrap_raylib_ImageResizeCanvas(
//       image,
//       newWidth,
//       newHeight,
//       offsetX,
//       offsetY,
//       (__ptr_0 + 0)
//     )
//   end ImageResizeCanvas

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageResizeCanvas(
//       image: Ptr[Image],
//       newWidth: CInt,
//       newHeight: CInt,
//       offsetX: CInt,
//       offsetY: CInt,
//       fill: Ptr[Color]
//   ): Unit =
//     __sn_wrap_raylib_ImageResizeCanvas(
//       image,
//       newWidth,
//       newHeight,
//       offsetX,
//       offsetY,
//       fill
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageText(text: CString, fontSize: CInt, color: Color)(using
//       Zone
//   ): Image =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_ImageText(text, fontSize, (__ptr_0 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)
//   end ImageText

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageText(text: CString, fontSize: CInt, color: Ptr[Color])(
//       __return: Ptr[Image]
//   ): Unit =
//     __sn_wrap_raylib_ImageText(text, fontSize, color, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageText(text: CString, fontSize: CInt, color: Ptr[Color])(using
//       Zone
//   ): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_ImageText(text, fontSize, color, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageTextEx(
//       font: Ptr[Font],
//       text: CString,
//       fontSize: Float,
//       spacing: Float,
//       tint: Ptr[Color]
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_ImageTextEx(
//       font,
//       text,
//       fontSize,
//       spacing,
//       tint,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end ImageTextEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageTextEx(
//       font: Ptr[Font],
//       text: CString,
//       fontSize: Float,
//       spacing: Float,
//       tint: Ptr[Color]
//   )(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_ImageTextEx(font, text, fontSize, spacing, tint, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageTextEx(
//       font: Font,
//       text: CString,
//       fontSize: Float,
//       spacing: Float,
//       tint: Color
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Font] = alloc[Font](1)
//     val __ptr_2: Ptr[Image] = alloc[Image](1)
//     !(__ptr_1 + 0) = font
//     !(__ptr_0 + 0) = tint
//     __sn_wrap_raylib_ImageTextEx(
//       (__ptr_1 + 0),
//       text,
//       fontSize,
//       spacing,
//       (__ptr_0 + 0),
//       (__ptr_2 + 0)
//     )
//     !(__ptr_2 + 0)
//   end ImageTextEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageToPOT(image: Ptr[Image], fill: Color)(using Zone): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = fill
//     __sn_wrap_raylib_ImageToPOT(image, (__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ImageToPOT(image: Ptr[Image], fill: Ptr[Color]): Unit =
//     __sn_wrap_raylib_ImageToPOT(image, fill)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsAudioStreamPlaying(stream: Ptr[AudioStream]): Boolean =
//     __sn_wrap_raylib_IsAudioStreamPlaying(stream)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsAudioStreamPlaying(stream: AudioStream)(using Zone): Boolean =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_IsAudioStreamPlaying((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsAudioStreamProcessed(stream: AudioStream)(using Zone): Boolean =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_IsAudioStreamProcessed((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsAudioStreamProcessed(stream: Ptr[AudioStream]): Boolean =
//     __sn_wrap_raylib_IsAudioStreamProcessed(stream)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsAudioStreamReady(stream: AudioStream)(using Zone): Boolean =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_IsAudioStreamReady((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsAudioStreamReady(stream: Ptr[AudioStream]): Boolean =
//     __sn_wrap_raylib_IsAudioStreamReady(stream)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsFontReady(font: Ptr[Font]): Boolean =
//     __sn_wrap_raylib_IsFontReady(font)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsFontReady(font: Font)(using Zone): Boolean =
//     val __ptr_0: Ptr[Font] = alloc[Font](1)
//     !(__ptr_0 + 0) = font
//     __sn_wrap_raylib_IsFontReady((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsImageReady(image: Ptr[Image]): Boolean =
//     __sn_wrap_raylib_IsImageReady(image)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsImageReady(image: Image)(using Zone): Boolean =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = image
//     __sn_wrap_raylib_IsImageReady((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsMaterialReady(material: Material)(using Zone): Boolean =
//     val __ptr_0: Ptr[Material] = alloc[Material](1)
//     !(__ptr_0 + 0) = material
//     __sn_wrap_raylib_IsMaterialReady((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsMaterialReady(material: Ptr[Material]): Boolean =
//     __sn_wrap_raylib_IsMaterialReady(material)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsModelAnimationValid(
//       model: Ptr[Model],
//       anim: Ptr[ModelAnimation]
//   ): Boolean =
//     __sn_wrap_raylib_IsModelAnimationValid(model, anim)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsModelAnimationValid(model: Model, anim: ModelAnimation)(using
//       Zone
//   ): Boolean =
//     val __ptr_0: Ptr[Model] = alloc[Model](1)
//     val __ptr_1: Ptr[ModelAnimation] = alloc[ModelAnimation](1)
//     !(__ptr_0 + 0) = model
//     !(__ptr_1 + 0) = anim
//     __sn_wrap_raylib_IsModelAnimationValid((__ptr_0 + 0), (__ptr_1 + 0))
//   end IsModelAnimationValid

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsModelReady(model: Ptr[Model]): Boolean =
//     __sn_wrap_raylib_IsModelReady(model)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsModelReady(model: Model)(using Zone): Boolean =
//     val __ptr_0: Ptr[Model] = alloc[Model](1)
//     !(__ptr_0 + 0) = model
//     __sn_wrap_raylib_IsModelReady((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsMusicReady(music: Music)(using Zone): Boolean =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_IsMusicReady((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsMusicReady(music: Ptr[Music]): Boolean =
//     __sn_wrap_raylib_IsMusicReady(music)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsMusicStreamPlaying(music: Ptr[Music]): Boolean =
//     __sn_wrap_raylib_IsMusicStreamPlaying(music)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsMusicStreamPlaying(music: Music)(using Zone): Boolean =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_IsMusicStreamPlaying((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsRenderTextureReady(target: Ptr[RenderTexture2D]): Boolean =
//     __sn_wrap_raylib_IsRenderTextureReady(target)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsRenderTextureReady(target: RenderTexture2D)(using Zone): Boolean =
//     val __ptr_0: Ptr[RenderTexture2D] = alloc[RenderTexture2D](1)
//     !(__ptr_0 + 0) = target
//     __sn_wrap_raylib_IsRenderTextureReady((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsShaderReady(shader: Shader)(using Zone): Boolean =
//     val __ptr_0: Ptr[Shader] = alloc[Shader](1)
//     !(__ptr_0 + 0) = shader
//     __sn_wrap_raylib_IsShaderReady((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsShaderReady(shader: Ptr[Shader]): Boolean =
//     __sn_wrap_raylib_IsShaderReady(shader)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsSoundPlaying(sound: Sound)(using Zone): Boolean =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = sound
//     __sn_wrap_raylib_IsSoundPlaying((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsSoundPlaying(sound: Ptr[Sound]): Boolean =
//     __sn_wrap_raylib_IsSoundPlaying(sound)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsSoundReady(sound: Sound)(using Zone): Boolean =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = sound
//     __sn_wrap_raylib_IsSoundReady((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsSoundReady(sound: Ptr[Sound]): Boolean =
//     __sn_wrap_raylib_IsSoundReady(sound)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsTextureReady(texture: Texture2D)(using Zone): Boolean =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     !(__ptr_0 + 0) = texture
//     __sn_wrap_raylib_IsTextureReady((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsTextureReady(texture: Ptr[Texture2D]): Boolean =
//     __sn_wrap_raylib_IsTextureReady(texture)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsWaveReady(wave: Wave)(using Zone): Boolean =
//     val __ptr_0: Ptr[Wave] = alloc[Wave](1)
//     !(__ptr_0 + 0) = wave
//     __sn_wrap_raylib_IsWaveReady((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def IsWaveReady(wave: Ptr[Wave]): Boolean =
//     __sn_wrap_raylib_IsWaveReady(wave)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadAudioStream(
//       sampleRate: CUnsignedInt,
//       sampleSize: CUnsignedInt,
//       channels: CUnsignedInt
//   )(using Zone): AudioStream =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     __sn_wrap_raylib_LoadAudioStream(
//       sampleRate,
//       sampleSize,
//       channels,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end LoadAudioStream

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadAudioStream(
//       sampleRate: CUnsignedInt,
//       sampleSize: CUnsignedInt,
//       channels: CUnsignedInt
//   )(__return: Ptr[AudioStream]): Unit =
//     __sn_wrap_raylib_LoadAudioStream(sampleRate, sampleSize, channels, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadAutomationEventList(fileName: CString)(
//       __return: Ptr[AutomationEventList]
//   ): Unit =
//     __sn_wrap_raylib_LoadAutomationEventList(fileName, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadAutomationEventList(fileName: CString)(using
//       Zone
//   ): AutomationEventList =
//     val __ptr_0: Ptr[AutomationEventList] = alloc[AutomationEventList](1)
//     __sn_wrap_raylib_LoadAutomationEventList(fileName, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadDirectoryFiles(dirPath: CString)(__return: Ptr[FilePathList]): Unit =
//     __sn_wrap_raylib_LoadDirectoryFiles(dirPath, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadDirectoryFiles(dirPath: CString)(using Zone): FilePathList =
//     val __ptr_0: Ptr[FilePathList] = alloc[FilePathList](1)
//     __sn_wrap_raylib_LoadDirectoryFiles(dirPath, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadDirectoryFilesEx(
//       basePath: CString,
//       filter: CString,
//       scanSubdirs: Boolean
//   )(__return: Ptr[FilePathList]): Unit =
//     __sn_wrap_raylib_LoadDirectoryFilesEx(
//       basePath,
//       filter,
//       scanSubdirs,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadDirectoryFilesEx(
//       basePath: CString,
//       filter: CString,
//       scanSubdirs: Boolean
//   )(using Zone): FilePathList =
//     val __ptr_0: Ptr[FilePathList] = alloc[FilePathList](1)
//     __sn_wrap_raylib_LoadDirectoryFilesEx(
//       basePath,
//       filter,
//       scanSubdirs,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end LoadDirectoryFilesEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadDroppedFiles()(using Zone): FilePathList =
//     val __ptr_0: Ptr[FilePathList] = alloc[FilePathList](1)
//     __sn_wrap_raylib_LoadDroppedFiles((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadDroppedFiles()(__return: Ptr[FilePathList]): Unit =
//     __sn_wrap_raylib_LoadDroppedFiles(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFont(fileName: CString)(using Zone): Font =
//     val __ptr_0: Ptr[Font] = alloc[Font](1)
//     __sn_wrap_raylib_LoadFont(fileName, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFont(fileName: CString)(__return: Ptr[Font]): Unit =
//     __sn_wrap_raylib_LoadFont(fileName, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFontEx(
//       fileName: CString,
//       fontSize: CInt,
//       codepoints: Ptr[CInt],
//       codepointCount: CInt
//   )(using Zone): Font =
//     val __ptr_0: Ptr[Font] = alloc[Font](1)
//     __sn_wrap_raylib_LoadFontEx(
//       fileName,
//       fontSize,
//       codepoints,
//       codepointCount,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end LoadFontEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFontEx(
//       fileName: CString,
//       fontSize: CInt,
//       codepoints: Ptr[CInt],
//       codepointCount: CInt
//   )(__return: Ptr[Font]): Unit =
//     __sn_wrap_raylib_LoadFontEx(
//       fileName,
//       fontSize,
//       codepoints,
//       codepointCount,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFontFromImage(image: Ptr[Image], key: Ptr[Color], firstChar: CInt)(
//       using Zone
//   ): Font =
//     val __ptr_0: Ptr[Font] = alloc[Font](1)
//     __sn_wrap_raylib_LoadFontFromImage(image, key, firstChar, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFontFromImage(image: Image, key: Color, firstChar: CInt)(using
//       Zone
//   ): Font =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     val __ptr_1: Ptr[Font] = alloc[Font](1)
//     val __ptr_2: Ptr[Image] = alloc[Image](1)
//     !(__ptr_2 + 0) = image
//     !(__ptr_0 + 0) = key
//     __sn_wrap_raylib_LoadFontFromImage(
//       (__ptr_2 + 0),
//       (__ptr_0 + 0),
//       firstChar,
//       (__ptr_1 + 0)
//     )
//     !(__ptr_1 + 0)
//   end LoadFontFromImage

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFontFromImage(image: Ptr[Image], key: Ptr[Color], firstChar: CInt)(
//       __return: Ptr[Font]
//   ): Unit =
//     __sn_wrap_raylib_LoadFontFromImage(image, key, firstChar, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFontFromMemory(
//       fileType: CString,
//       fileData: Ptr[CUnsignedChar],
//       dataSize: CInt,
//       fontSize: CInt,
//       codepoints: Ptr[CInt],
//       codepointCount: CInt
//   )(using Zone): Font =
//     val __ptr_0: Ptr[Font] = alloc[Font](1)
//     __sn_wrap_raylib_LoadFontFromMemory(
//       fileType,
//       fileData,
//       dataSize,
//       fontSize,
//       codepoints,
//       codepointCount,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end LoadFontFromMemory

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadFontFromMemory(
//       fileType: CString,
//       fileData: Ptr[CUnsignedChar],
//       dataSize: CInt,
//       fontSize: CInt,
//       codepoints: Ptr[CInt],
//       codepointCount: CInt
//   )(__return: Ptr[Font]): Unit =
//     __sn_wrap_raylib_LoadFontFromMemory(
//       fileType,
//       fileData,
//       dataSize,
//       fontSize,
//       codepoints,
//       codepointCount,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImage(fileName: CString)(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_LoadImage(fileName, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImage(fileName: CString)(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_LoadImage(fileName, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageAnim(fileName: CString, frames: Ptr[CInt])(
//       __return: Ptr[Image]
//   ): Unit =
//     __sn_wrap_raylib_LoadImageAnim(fileName, frames, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageAnim(fileName: CString, frames: Ptr[CInt])(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_LoadImageAnim(fileName, frames, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageColors(image: Ptr[Image]): Ptr[Color] =
//     __sn_wrap_raylib_LoadImageColors(image)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageColors(image: Image)(using Zone): Ptr[Color] =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = image
//     __sn_wrap_raylib_LoadImageColors((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageFromMemory(
//       fileType: CString,
//       fileData: Ptr[CUnsignedChar],
//       dataSize: CInt
//   )(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_LoadImageFromMemory(fileType, fileData, dataSize, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageFromMemory(
//       fileType: CString,
//       fileData: Ptr[CUnsignedChar],
//       dataSize: CInt
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_LoadImageFromMemory(
//       fileType,
//       fileData,
//       dataSize,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end LoadImageFromMemory

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageFromScreen()(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_LoadImageFromScreen(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageFromScreen()(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_LoadImageFromScreen((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageFromTexture(texture: Ptr[Texture2D])(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_LoadImageFromTexture(texture, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageFromTexture(texture: Ptr[Texture2D])(
//       __return: Ptr[Image]
//   ): Unit =
//     __sn_wrap_raylib_LoadImageFromTexture(texture, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageFromTexture(texture: Texture2D)(using Zone): Image =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     val __ptr_1: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = texture
//     __sn_wrap_raylib_LoadImageFromTexture((__ptr_0 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImagePalette(
//       image: Image,
//       maxPaletteSize: CInt,
//       colorCount: Ptr[CInt]
//   )(using Zone): Ptr[Color] =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = image
//     __sn_wrap_raylib_LoadImagePalette((__ptr_0 + 0), maxPaletteSize, colorCount)
//   end LoadImagePalette

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImagePalette(
//       image: Ptr[Image],
//       maxPaletteSize: CInt,
//       colorCount: Ptr[CInt]
//   ): Ptr[Color] =
//     __sn_wrap_raylib_LoadImagePalette(image, maxPaletteSize, colorCount)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageRaw(
//       fileName: CString,
//       width: CInt,
//       height: CInt,
//       format: CInt,
//       headerSize: CInt
//   )(using Zone): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_LoadImageRaw(
//       fileName,
//       width,
//       height,
//       format,
//       headerSize,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end LoadImageRaw

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageRaw(
//       fileName: CString,
//       width: CInt,
//       height: CInt,
//       format: CInt,
//       headerSize: CInt
//   )(__return: Ptr[Image]): Unit =
//     __sn_wrap_raylib_LoadImageRaw(
//       fileName,
//       width,
//       height,
//       format,
//       headerSize,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageSvg(fileNameOrString: CString, width: CInt, height: CInt)(using
//       Zone
//   ): Image =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     __sn_wrap_raylib_LoadImageSvg(
//       fileNameOrString,
//       width,
//       height,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end LoadImageSvg

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadImageSvg(fileNameOrString: CString, width: CInt, height: CInt)(
//       __return: Ptr[Image]
//   ): Unit =
//     __sn_wrap_raylib_LoadImageSvg(fileNameOrString, width, height, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadMaterialDefault()(using Zone): Material =
//     val __ptr_0: Ptr[Material] = alloc[Material](1)
//     __sn_wrap_raylib_LoadMaterialDefault((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadMaterialDefault()(__return: Ptr[Material]): Unit =
//     __sn_wrap_raylib_LoadMaterialDefault(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadModel(fileName: CString)(__return: Ptr[Model]): Unit =
//     __sn_wrap_raylib_LoadModel(fileName, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadModel(fileName: CString)(using Zone): Model =
//     val __ptr_0: Ptr[Model] = alloc[Model](1)
//     __sn_wrap_raylib_LoadModel(fileName, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadModelFromMesh(mesh: Ptr[Mesh])(using Zone): Model =
//     val __ptr_0: Ptr[Model] = alloc[Model](1)
//     __sn_wrap_raylib_LoadModelFromMesh(mesh, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadModelFromMesh(mesh: Ptr[Mesh])(__return: Ptr[Model]): Unit =
//     __sn_wrap_raylib_LoadModelFromMesh(mesh, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadModelFromMesh(mesh: Mesh)(using Zone): Model =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     val __ptr_1: Ptr[Model] = alloc[Model](1)
//     !(__ptr_0 + 0) = mesh
//     __sn_wrap_raylib_LoadModelFromMesh((__ptr_0 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadMusicStream(fileName: CString)(using Zone): Music =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     __sn_wrap_raylib_LoadMusicStream(fileName, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadMusicStream(fileName: CString)(__return: Ptr[Music]): Unit =
//     __sn_wrap_raylib_LoadMusicStream(fileName, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadMusicStreamFromMemory(
//       fileType: CString,
//       data: Ptr[CUnsignedChar],
//       dataSize: CInt
//   )(using Zone): Music =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     __sn_wrap_raylib_LoadMusicStreamFromMemory(
//       fileType,
//       data,
//       dataSize,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end LoadMusicStreamFromMemory

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadMusicStreamFromMemory(
//       fileType: CString,
//       data: Ptr[CUnsignedChar],
//       dataSize: CInt
//   )(__return: Ptr[Music]): Unit =
//     __sn_wrap_raylib_LoadMusicStreamFromMemory(
//       fileType,
//       data,
//       dataSize,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadRenderTexture(width: CInt, height: CInt)(using
//       Zone
//   ): RenderTexture2D =
//     val __ptr_0: Ptr[RenderTexture2D] = alloc[RenderTexture2D](1)
//     __sn_wrap_raylib_LoadRenderTexture(width, height, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadRenderTexture(width: CInt, height: CInt)(
//       __return: Ptr[RenderTexture2D]
//   ): Unit =
//     __sn_wrap_raylib_LoadRenderTexture(width, height, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadShader(vsFileName: CString, fsFileName: CString)(using Zone): Shader =
//     val __ptr_0: Ptr[Shader] = alloc[Shader](1)
//     __sn_wrap_raylib_LoadShader(vsFileName, fsFileName, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadShader(vsFileName: CString, fsFileName: CString)(
//       __return: Ptr[Shader]
//   ): Unit =
//     __sn_wrap_raylib_LoadShader(vsFileName, fsFileName, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadShaderFromMemory(vsCode: CString, fsCode: CString)(using
//       Zone
//   ): Shader =
//     val __ptr_0: Ptr[Shader] = alloc[Shader](1)
//     __sn_wrap_raylib_LoadShaderFromMemory(vsCode, fsCode, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadShaderFromMemory(vsCode: CString, fsCode: CString)(
//       __return: Ptr[Shader]
//   ): Unit =
//     __sn_wrap_raylib_LoadShaderFromMemory(vsCode, fsCode, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadSound(fileName: CString)(using Zone): Sound =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     __sn_wrap_raylib_LoadSound(fileName, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadSound(fileName: CString)(__return: Ptr[Sound]): Unit =
//     __sn_wrap_raylib_LoadSound(fileName, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadSoundAlias(source: Sound)(using Zone): Sound =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](2)
//     !(__ptr_0 + 0) = source
//     __sn_wrap_raylib_LoadSoundAlias((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadSoundAlias(source: Ptr[Sound])(using Zone): Sound =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     __sn_wrap_raylib_LoadSoundAlias(source, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadSoundAlias(source: Ptr[Sound])(__return: Ptr[Sound]): Unit =
//     __sn_wrap_raylib_LoadSoundAlias(source, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadSoundFromWave(wave: Ptr[Wave])(using Zone): Sound =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     __sn_wrap_raylib_LoadSoundFromWave(wave, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadSoundFromWave(wave: Ptr[Wave])(__return: Ptr[Sound]): Unit =
//     __sn_wrap_raylib_LoadSoundFromWave(wave, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadSoundFromWave(wave: Wave)(using Zone): Sound =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     val __ptr_1: Ptr[Wave] = alloc[Wave](1)
//     !(__ptr_1 + 0) = wave
//     __sn_wrap_raylib_LoadSoundFromWave((__ptr_1 + 0), (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadTexture(fileName: CString)(__return: Ptr[Texture2D]): Unit =
//     __sn_wrap_raylib_LoadTexture(fileName, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadTexture(fileName: CString)(using Zone): Texture2D =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     __sn_wrap_raylib_LoadTexture(fileName, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadTextureCubemap(image: Ptr[Image], layout: CInt)(using
//       Zone
//   ): TextureCubemap =
//     val __ptr_0: Ptr[TextureCubemap] = alloc[TextureCubemap](1)
//     __sn_wrap_raylib_LoadTextureCubemap(image, layout, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadTextureCubemap(image: Image, layout: CInt)(using
//       Zone
//   ): TextureCubemap =
//     val __ptr_0: Ptr[TextureCubemap] = alloc[TextureCubemap](1)
//     val __ptr_1: Ptr[Image] = alloc[Image](1)
//     !(__ptr_1 + 0) = image
//     __sn_wrap_raylib_LoadTextureCubemap((__ptr_1 + 0), layout, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end LoadTextureCubemap

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadTextureCubemap(image: Ptr[Image], layout: CInt)(
//       __return: Ptr[TextureCubemap]
//   ): Unit =
//     __sn_wrap_raylib_LoadTextureCubemap(image, layout, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadTextureFromImage(image: Image)(using Zone): Texture2D =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     val __ptr_1: Ptr[Image] = alloc[Image](1)
//     !(__ptr_1 + 0) = image
//     __sn_wrap_raylib_LoadTextureFromImage((__ptr_1 + 0), (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadTextureFromImage(image: Ptr[Image])(using Zone): Texture2D =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     __sn_wrap_raylib_LoadTextureFromImage(image, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadTextureFromImage(image: Ptr[Image])(__return: Ptr[Texture2D]): Unit =
//     __sn_wrap_raylib_LoadTextureFromImage(image, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadVrStereoConfig(device: Ptr[VrDeviceInfo])(
//       __return: Ptr[VrStereoConfig]
//   ): Unit =
//     __sn_wrap_raylib_LoadVrStereoConfig(device, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadVrStereoConfig(device: VrDeviceInfo)(using Zone): VrStereoConfig =
//     val __ptr_0: Ptr[VrStereoConfig] = alloc[VrStereoConfig](1)
//     val __ptr_1: Ptr[VrDeviceInfo] = alloc[VrDeviceInfo](1)
//     !(__ptr_1 + 0) = device
//     __sn_wrap_raylib_LoadVrStereoConfig((__ptr_1 + 0), (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadVrStereoConfig(device: Ptr[VrDeviceInfo])(using
//       Zone
//   ): VrStereoConfig =
//     val __ptr_0: Ptr[VrStereoConfig] = alloc[VrStereoConfig](1)
//     __sn_wrap_raylib_LoadVrStereoConfig(device, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadWave(fileName: CString)(__return: Ptr[Wave]): Unit =
//     __sn_wrap_raylib_LoadWave(fileName, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadWave(fileName: CString)(using Zone): Wave =
//     val __ptr_0: Ptr[Wave] = alloc[Wave](1)
//     __sn_wrap_raylib_LoadWave(fileName, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadWaveFromMemory(
//       fileType: CString,
//       fileData: Ptr[CUnsignedChar],
//       dataSize: CInt
//   )(__return: Ptr[Wave]): Unit =
//     __sn_wrap_raylib_LoadWaveFromMemory(fileType, fileData, dataSize, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadWaveFromMemory(
//       fileType: CString,
//       fileData: Ptr[CUnsignedChar],
//       dataSize: CInt
//   )(using Zone): Wave =
//     val __ptr_0: Ptr[Wave] = alloc[Wave](1)
//     __sn_wrap_raylib_LoadWaveFromMemory(
//       fileType,
//       fileData,
//       dataSize,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end LoadWaveFromMemory

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadWaveSamples(wave: Wave)(using Zone): Ptr[Float] =
//     val __ptr_0: Ptr[Wave] = alloc[Wave](1)
//     !(__ptr_0 + 0) = wave
//     __sn_wrap_raylib_LoadWaveSamples((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def LoadWaveSamples(wave: Ptr[Wave]): Ptr[Float] =
//     __sn_wrap_raylib_LoadWaveSamples(wave)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixAdd(left: Matrix, right: Matrix)(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](3)
//     !(__ptr_0 + 0) = left
//     !(__ptr_0 + 1) = right
//     __sn_wrap_raylib_MatrixAdd((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixAdd(left: Ptr[Matrix], right: Ptr[Matrix])(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixAdd(left, right, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixAdd(left: Ptr[Matrix], right: Ptr[Matrix])(
//       __return: Ptr[Matrix]
//   ): Unit =
//     __sn_wrap_raylib_MatrixAdd(left, right, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixDeterminant(mat: Ptr[Matrix]): Float =
//     __sn_wrap_raylib_MatrixDeterminant(mat)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixDeterminant(mat: Matrix)(using Zone): Float =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = mat
//     __sn_wrap_raylib_MatrixDeterminant((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixFrustum(
//       left: Double,
//       right: Double,
//       bottom: Double,
//       top: Double,
//       near: Double,
//       far: Double
//   )(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixFrustum(
//       left,
//       right,
//       bottom,
//       top,
//       near,
//       far,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixFrustum(
//       left: Double,
//       right: Double,
//       bottom: Double,
//       top: Double,
//       near: Double,
//       far: Double
//   )(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixFrustum(
//       left,
//       right,
//       bottom,
//       top,
//       near,
//       far,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end MatrixFrustum

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixIdentity()(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixIdentity((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixIdentity()(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixIdentity(__return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixInvert(mat: Ptr[Matrix])(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixInvert(mat, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixInvert(mat: Ptr[Matrix])(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixInvert(mat, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixInvert(mat: Matrix)(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](2)
//     !(__ptr_0 + 0) = mat
//     __sn_wrap_raylib_MatrixInvert((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixLookAt(eye: Ptr[Vector3], target: Ptr[Vector3], up: Ptr[Vector3])(
//       __return: Ptr[Matrix]
//   ): Unit =
//     __sn_wrap_raylib_MatrixLookAt(eye, target, up, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixLookAt(eye: Ptr[Vector3], target: Ptr[Vector3], up: Ptr[Vector3])(
//       using Zone
//   ): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixLookAt(eye, target, up, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixLookAt(eye: Vector3, target: Vector3, up: Vector3)(using
//       Zone
//   ): Matrix =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = eye
//     !(__ptr_0 + 1) = target
//     !(__ptr_0 + 2) = up
//     __sn_wrap_raylib_MatrixLookAt(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       (__ptr_1 + 0)
//     )
//     !(__ptr_1 + 0)
//   end MatrixLookAt

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixMultiply(left: Matrix, right: Matrix)(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](3)
//     !(__ptr_0 + 0) = left
//     !(__ptr_0 + 1) = right
//     __sn_wrap_raylib_MatrixMultiply((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixMultiply(left: Ptr[Matrix], right: Ptr[Matrix])(using
//       Zone
//   ): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixMultiply(left, right, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixMultiply(left: Ptr[Matrix], right: Ptr[Matrix])(
//       __return: Ptr[Matrix]
//   ): Unit =
//     __sn_wrap_raylib_MatrixMultiply(left, right, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixOrtho(
//       left: Double,
//       right: Double,
//       bottom: Double,
//       top: Double,
//       nearPlane: Double,
//       farPlane: Double
//   )(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixOrtho(
//       left,
//       right,
//       bottom,
//       top,
//       nearPlane,
//       farPlane,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end MatrixOrtho

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixOrtho(
//       left: Double,
//       right: Double,
//       bottom: Double,
//       top: Double,
//       nearPlane: Double,
//       farPlane: Double
//   )(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixOrtho(
//       left,
//       right,
//       bottom,
//       top,
//       nearPlane,
//       farPlane,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixPerspective(
//       fovY: Double,
//       aspect: Double,
//       nearPlane: Double,
//       farPlane: Double
//   )(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixPerspective(
//       fovY,
//       aspect,
//       nearPlane,
//       farPlane,
//       __return
//     )

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixPerspective(
//       fovY: Double,
//       aspect: Double,
//       nearPlane: Double,
//       farPlane: Double
//   )(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixPerspective(
//       fovY,
//       aspect,
//       nearPlane,
//       farPlane,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end MatrixPerspective

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotate(axis: Vector3, angle: Float)(using Zone): Matrix =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = axis
//     __sn_wrap_raylib_MatrixRotate((__ptr_0 + 0), angle, (__ptr_1 + 0))
//     !(__ptr_1 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotate(axis: Ptr[Vector3], angle: Float)(
//       __return: Ptr[Matrix]
//   ): Unit =
//     __sn_wrap_raylib_MatrixRotate(axis, angle, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotate(axis: Ptr[Vector3], angle: Float)(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixRotate(axis, angle, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateX(angle: Float)(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixRotateX(angle, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateX(angle: Float)(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixRotateX(angle, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateXYZ(angle: Ptr[Vector3])(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixRotateXYZ(angle, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateXYZ(angle: Vector3)(using Zone): Matrix =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = angle
//     __sn_wrap_raylib_MatrixRotateXYZ((__ptr_0 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateXYZ(angle: Ptr[Vector3])(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixRotateXYZ(angle, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateY(angle: Float)(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixRotateY(angle, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateY(angle: Float)(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixRotateY(angle, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateZ(angle: Float)(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixRotateZ(angle, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateZ(angle: Float)(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixRotateZ(angle, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateZYX(angle: Ptr[Vector3])(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixRotateZYX(angle, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateZYX(angle: Vector3)(using Zone): Matrix =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = angle
//     __sn_wrap_raylib_MatrixRotateZYX((__ptr_0 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixRotateZYX(angle: Ptr[Vector3])(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixRotateZYX(angle, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixScale(x: Float, y: Float, z: Float)(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixScale(x, y, z, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixScale(x: Float, y: Float, z: Float)(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixScale(x, y, z, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixSubtract(left: Matrix, right: Matrix)(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](3)
//     !(__ptr_0 + 0) = left
//     !(__ptr_0 + 1) = right
//     __sn_wrap_raylib_MatrixSubtract((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixSubtract(left: Ptr[Matrix], right: Ptr[Matrix])(using
//       Zone
//   ): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixSubtract(left, right, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixSubtract(left: Ptr[Matrix], right: Ptr[Matrix])(
//       __return: Ptr[Matrix]
//   ): Unit =
//     __sn_wrap_raylib_MatrixSubtract(left, right, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixToFloatV(mat: Ptr[Matrix])(__return: Ptr[float16]): Unit =
//     __sn_wrap_raylib_MatrixToFloatV(mat, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixToFloatV(mat: Matrix)(using Zone): float16 =
//     val __ptr_0: Ptr[float16] = alloc[float16](1)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_1 + 0) = mat
//     __sn_wrap_raylib_MatrixToFloatV((__ptr_1 + 0), (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixToFloatV(mat: Ptr[Matrix])(using Zone): float16 =
//     val __ptr_0: Ptr[float16] = alloc[float16](1)
//     __sn_wrap_raylib_MatrixToFloatV(mat, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixTrace(mat: Matrix)(using Zone): Float =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = mat
//     __sn_wrap_raylib_MatrixTrace((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixTrace(mat: Ptr[Matrix]): Float =
//     __sn_wrap_raylib_MatrixTrace(mat)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixTranslate(x: Float, y: Float, z: Float)(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixTranslate(x, y, z, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixTranslate(x: Float, y: Float, z: Float)(
//       __return: Ptr[Matrix]
//   ): Unit =
//     __sn_wrap_raylib_MatrixTranslate(x, y, z, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixTranspose(mat: Matrix)(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](2)
//     !(__ptr_0 + 0) = mat
//     __sn_wrap_raylib_MatrixTranspose((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixTranspose(mat: Ptr[Matrix])(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_MatrixTranspose(mat, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def MatrixTranspose(mat: Ptr[Matrix])(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_MatrixTranspose(mat, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def MeasureTextEx(
//       font: Ptr[Font],
//       text: CString,
//       fontSize: Float,
//       spacing: Float
//   )(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_MeasureTextEx(font, text, fontSize, spacing, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def MeasureTextEx(font: Font, text: CString, fontSize: Float, spacing: Float)(
//       using Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     val __ptr_1: Ptr[Font] = alloc[Font](1)
//     !(__ptr_1 + 0) = font
//     __sn_wrap_raylib_MeasureTextEx(
//       (__ptr_1 + 0),
//       text,
//       fontSize,
//       spacing,
//       (__ptr_0 + 0)
//     )
//     !(__ptr_0 + 0)
//   end MeasureTextEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def MeasureTextEx(
//       font: Ptr[Font],
//       text: CString,
//       fontSize: Float,
//       spacing: Float
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_MeasureTextEx(font, text, fontSize, spacing, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end MeasureTextEx

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PauseAudioStream(stream: AudioStream)(using Zone): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_PauseAudioStream((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PauseAudioStream(stream: Ptr[AudioStream]): Unit =
//     __sn_wrap_raylib_PauseAudioStream(stream)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PauseMusicStream(music: Music)(using Zone): Unit =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_PauseMusicStream((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PauseMusicStream(music: Ptr[Music]): Unit =
//     __sn_wrap_raylib_PauseMusicStream(music)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PauseSound(sound: Ptr[Sound]): Unit =
//     __sn_wrap_raylib_PauseSound(sound)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PauseSound(sound: Sound)(using Zone): Unit =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = sound
//     __sn_wrap_raylib_PauseSound((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PlayAudioStream(stream: Ptr[AudioStream]): Unit =
//     __sn_wrap_raylib_PlayAudioStream(stream)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PlayAudioStream(stream: AudioStream)(using Zone): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_PlayAudioStream((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PlayAutomationEvent(event: AutomationEvent)(using Zone): Unit =
//     val __ptr_0: Ptr[AutomationEvent] = alloc[AutomationEvent](1)
//     !(__ptr_0 + 0) = event
//     __sn_wrap_raylib_PlayAutomationEvent((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PlayAutomationEvent(event: Ptr[AutomationEvent]): Unit =
//     __sn_wrap_raylib_PlayAutomationEvent(event)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PlayMusicStream(music: Music)(using Zone): Unit =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_PlayMusicStream((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PlayMusicStream(music: Ptr[Music]): Unit =
//     __sn_wrap_raylib_PlayMusicStream(music)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PlaySound(sound: Sound)(using Zone): Unit =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = sound
//     __sn_wrap_raylib_PlaySound((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def PlaySound(sound: Ptr[Sound]): Unit =
//     __sn_wrap_raylib_PlaySound(sound)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionAdd(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionAdd(q1, q2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionAdd(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionAdd(q1, q2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionAdd(q1: Quaternion, q2: Quaternion)(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
//     !(__ptr_0 + 0) = q1
//     !(__ptr_0 + 1) = q2
//     __sn_wrap_raylib_QuaternionAdd((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionAddValue(q: Ptr[Quaternion], add: Float)(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionAddValue(q, add, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionAddValue(q: Ptr[Quaternion], add: Float)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionAddValue(q, add, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionAddValue(q: Quaternion, add: Float)(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
//     !(__ptr_0 + 0) = q
//     __sn_wrap_raylib_QuaternionAddValue((__ptr_0 + 0), add, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionDivide(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionDivide(q1, q2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionDivide(q1: Quaternion, q2: Quaternion)(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
//     !(__ptr_0 + 0) = q1
//     !(__ptr_0 + 1) = q2
//     __sn_wrap_raylib_QuaternionDivide(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end QuaternionDivide

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionDivide(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionDivide(q1, q2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionEquals(p: Quaternion, q: Quaternion)(using Zone): CInt =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
//     !(__ptr_0 + 0) = p
//     !(__ptr_0 + 1) = q
//     __sn_wrap_raylib_QuaternionEquals((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionEquals(p: Ptr[Quaternion], q: Ptr[Quaternion]): CInt =
//     __sn_wrap_raylib_QuaternionEquals(p, q)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionFromAxisAngle(axis: Ptr[Vector3], angle: Float)(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionFromAxisAngle(axis, angle, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionFromAxisAngle(axis: Vector3, angle: Float)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     val __ptr_1: Ptr[Quaternion] = alloc[Quaternion](1)
//     !(__ptr_0 + 0) = axis
//     __sn_wrap_raylib_QuaternionFromAxisAngle(
//       (__ptr_0 + 0),
//       angle,
//       (__ptr_1 + 0)
//     )
//     !(__ptr_1 + 0)
//   end QuaternionFromAxisAngle

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionFromAxisAngle(axis: Ptr[Vector3], angle: Float)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionFromAxisAngle(axis, angle, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionFromEuler(pitch: Float, yaw: Float, roll: Float)(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionFromEuler(pitch, yaw, roll, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionFromEuler(pitch: Float, yaw: Float, roll: Float)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionFromEuler(pitch, yaw, roll, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionFromMatrix(mat: Matrix)(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_1 + 0) = mat
//     __sn_wrap_raylib_QuaternionFromMatrix((__ptr_1 + 0), (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionFromMatrix(mat: Ptr[Matrix])(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionFromMatrix(mat, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionFromMatrix(mat: Ptr[Matrix])(__return: Ptr[Quaternion]): Unit =
//     __sn_wrap_raylib_QuaternionFromMatrix(mat, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionFromVector3ToVector3(from: Ptr[Vector3], to: Ptr[Vector3])(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionFromVector3ToVector3(from, to, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionFromVector3ToVector3(from: Vector3, to: Vector3)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     val __ptr_1: Ptr[Quaternion] = alloc[Quaternion](1)
//     !(__ptr_0 + 0) = from
//     !(__ptr_0 + 1) = to
//     __sn_wrap_raylib_QuaternionFromVector3ToVector3(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_1 + 0)
//     )
//     !(__ptr_1 + 0)
//   end QuaternionFromVector3ToVector3

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionFromVector3ToVector3(from: Ptr[Vector3], to: Ptr[Vector3])(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionFromVector3ToVector3(from, to, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionIdentity()(__return: Ptr[Quaternion]): Unit =
//     __sn_wrap_raylib_QuaternionIdentity(__return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionIdentity()(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionIdentity((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionInvert(q: Ptr[Quaternion])(__return: Ptr[Quaternion]): Unit =
//     __sn_wrap_raylib_QuaternionInvert(q, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionInvert(q: Ptr[Quaternion])(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionInvert(q, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionInvert(q: Quaternion)(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
//     !(__ptr_0 + 0) = q
//     __sn_wrap_raylib_QuaternionInvert((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionLength(q: Quaternion)(using Zone): Float =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     !(__ptr_0 + 0) = q
//     __sn_wrap_raylib_QuaternionLength((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionLength(q: Ptr[Quaternion]): Float =
//     __sn_wrap_raylib_QuaternionLength(q)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionLerp(q1: Quaternion, q2: Quaternion, amount: Float)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
//     !(__ptr_0 + 0) = q1
//     !(__ptr_0 + 1) = q2
//     __sn_wrap_raylib_QuaternionLerp(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       amount,
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end QuaternionLerp

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionLerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
//       using Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionLerp(q1, q2, amount, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionLerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionLerp(q1, q2, amount, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionMultiply(q1: Quaternion, q2: Quaternion)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
//     !(__ptr_0 + 0) = q1
//     !(__ptr_0 + 1) = q2
//     __sn_wrap_raylib_QuaternionMultiply(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end QuaternionMultiply

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionMultiply(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionMultiply(q1, q2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionMultiply(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionMultiply(q1, q2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionNlerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
//       using Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionNlerp(q1, q2, amount, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionNlerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionNlerp(q1, q2, amount, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionNlerp(q1: Quaternion, q2: Quaternion, amount: Float)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
//     !(__ptr_0 + 0) = q1
//     !(__ptr_0 + 1) = q2
//     __sn_wrap_raylib_QuaternionNlerp(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       amount,
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end QuaternionNlerp

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionNormalize(q: Ptr[Quaternion])(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionNormalize(q, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionNormalize(q: Quaternion)(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
//     !(__ptr_0 + 0) = q
//     __sn_wrap_raylib_QuaternionNormalize((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionNormalize(q: Ptr[Quaternion])(__return: Ptr[Quaternion]): Unit =
//     __sn_wrap_raylib_QuaternionNormalize(q, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionScale(q: Ptr[Quaternion], mul: Float)(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionScale(q, mul, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionScale(q: Ptr[Quaternion], mul: Float)(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionScale(q, mul, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionScale(q: Quaternion, mul: Float)(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
//     !(__ptr_0 + 0) = q
//     __sn_wrap_raylib_QuaternionScale((__ptr_0 + 0), mul, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionSlerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
//       using Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionSlerp(q1, q2, amount, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionSlerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionSlerp(q1, q2, amount, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionSlerp(q1: Quaternion, q2: Quaternion, amount: Float)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
//     !(__ptr_0 + 0) = q1
//     !(__ptr_0 + 1) = q2
//     __sn_wrap_raylib_QuaternionSlerp(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       amount,
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end QuaternionSlerp

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionSubtract(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionSubtract(q1, q2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionSubtract(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionSubtract(q1, q2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionSubtract(q1: Quaternion, q2: Quaternion)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
//     !(__ptr_0 + 0) = q1
//     !(__ptr_0 + 1) = q2
//     __sn_wrap_raylib_QuaternionSubtract(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end QuaternionSubtract

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionSubtractValue(q: Ptr[Quaternion], sub: Float)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionSubtractValue(q, sub, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionSubtractValue(q: Ptr[Quaternion], sub: Float)(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionSubtractValue(q, sub, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionSubtractValue(q: Quaternion, sub: Float)(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
//     !(__ptr_0 + 0) = q
//     __sn_wrap_raylib_QuaternionSubtractValue((__ptr_0 + 0), sub, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionToAxisAngle(
//       q: Ptr[Quaternion],
//       outAxis: Ptr[Vector3],
//       outAngle: Ptr[Float]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionToAxisAngle(q, outAxis, outAngle)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionToAxisAngle(
//       q: Quaternion,
//       outAxis: Ptr[Vector3],
//       outAngle: Ptr[Float]
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     !(__ptr_0 + 0) = q
//     __sn_wrap_raylib_QuaternionToAxisAngle((__ptr_0 + 0), outAxis, outAngle)
//   end QuaternionToAxisAngle

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionToEuler(q: Quaternion)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     val __ptr_1: Ptr[Quaternion] = alloc[Quaternion](1)
//     !(__ptr_1 + 0) = q
//     __sn_wrap_raylib_QuaternionToEuler((__ptr_1 + 0), (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionToEuler(q: Ptr[Quaternion])(__return: Ptr[Vector3]): Unit =
//     __sn_wrap_raylib_QuaternionToEuler(q, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionToEuler(q: Ptr[Quaternion])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_QuaternionToEuler(q, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionToMatrix(q: Ptr[Quaternion])(__return: Ptr[Matrix]): Unit =
//     __sn_wrap_raylib_QuaternionToMatrix(q, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionToMatrix(q: Quaternion)(using Zone): Matrix =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = q
//     __sn_wrap_raylib_QuaternionToMatrix((__ptr_0 + 0), (__ptr_1 + 0))
//     !(__ptr_1 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionToMatrix(q: Ptr[Quaternion])(using Zone): Matrix =
//     val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
//     __sn_wrap_raylib_QuaternionToMatrix(q, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionTransform(q: Ptr[Quaternion], mat: Ptr[Matrix])(using
//       Zone
//   ): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
//     __sn_wrap_raylib_QuaternionTransform(q, mat, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionTransform(q: Ptr[Quaternion], mat: Ptr[Matrix])(
//       __return: Ptr[Quaternion]
//   ): Unit =
//     __sn_wrap_raylib_QuaternionTransform(q, mat, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def QuaternionTransform(q: Quaternion, mat: Matrix)(using Zone): Quaternion =
//     val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = q
//     !(__ptr_1 + 0) = mat
//     __sn_wrap_raylib_QuaternionTransform(
//       (__ptr_0 + 0),
//       (__ptr_1 + 0),
//       (__ptr_0 + 1)
//     )
//     !(__ptr_0 + 1)
//   end QuaternionTransform

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ResumeAudioStream(stream: Ptr[AudioStream]): Unit =
//     __sn_wrap_raylib_ResumeAudioStream(stream)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ResumeAudioStream(stream: AudioStream)(using Zone): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_ResumeAudioStream((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ResumeMusicStream(music: Music)(using Zone): Unit =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_ResumeMusicStream((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ResumeMusicStream(music: Ptr[Music]): Unit =
//     __sn_wrap_raylib_ResumeMusicStream(music)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ResumeSound(sound: Ptr[Sound]): Unit =
//     __sn_wrap_raylib_ResumeSound(sound)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def ResumeSound(sound: Sound)(using Zone): Unit =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = sound
//     __sn_wrap_raylib_ResumeSound((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SeekMusicStream(music: Music, position: Float)(using Zone): Unit =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_SeekMusicStream((__ptr_0 + 0), position)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SeekMusicStream(music: Ptr[Music], position: Float): Unit =
//     __sn_wrap_raylib_SeekMusicStream(music, position)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetAudioStreamCallback(stream: AudioStream, callback: AudioCallback)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_SetAudioStreamCallback((__ptr_0 + 0), callback)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetAudioStreamCallback(
//       stream: Ptr[AudioStream],
//       callback: AudioCallback
//   ): Unit =
//     __sn_wrap_raylib_SetAudioStreamCallback(stream, callback)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetAudioStreamPan(stream: Ptr[AudioStream], pan: Float): Unit =
//     __sn_wrap_raylib_SetAudioStreamPan(stream, pan)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetAudioStreamPan(stream: AudioStream, pan: Float)(using Zone): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_SetAudioStreamPan((__ptr_0 + 0), pan)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetAudioStreamPitch(stream: Ptr[AudioStream], pitch: Float): Unit =
//     __sn_wrap_raylib_SetAudioStreamPitch(stream, pitch)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetAudioStreamPitch(stream: AudioStream, pitch: Float)(using Zone): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_SetAudioStreamPitch((__ptr_0 + 0), pitch)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetAudioStreamVolume(stream: Ptr[AudioStream], volume: Float): Unit =
//     __sn_wrap_raylib_SetAudioStreamVolume(stream, volume)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetAudioStreamVolume(stream: AudioStream, volume: Float)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_SetAudioStreamVolume((__ptr_0 + 0), volume)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMaterialTexture(
//       material: Ptr[Material],
//       mapType: CInt,
//       texture: Ptr[Texture2D]
//   ): Unit =
//     __sn_wrap_raylib_SetMaterialTexture(material, mapType, texture)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMaterialTexture(
//       material: Ptr[Material],
//       mapType: CInt,
//       texture: Texture2D
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     !(__ptr_0 + 0) = texture
//     __sn_wrap_raylib_SetMaterialTexture(material, mapType, (__ptr_0 + 0))
//   end SetMaterialTexture

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMusicPan(music: Music, pan: Float)(using Zone): Unit =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_SetMusicPan((__ptr_0 + 0), pan)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMusicPan(music: Ptr[Music], pan: Float): Unit =
//     __sn_wrap_raylib_SetMusicPan(music, pan)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMusicPitch(music: Ptr[Music], pitch: Float): Unit =
//     __sn_wrap_raylib_SetMusicPitch(music, pitch)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMusicPitch(music: Music, pitch: Float)(using Zone): Unit =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_SetMusicPitch((__ptr_0 + 0), pitch)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMusicVolume(music: Music, volume: Float)(using Zone): Unit =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_SetMusicVolume((__ptr_0 + 0), volume)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetMusicVolume(music: Ptr[Music], volume: Float): Unit =
//     __sn_wrap_raylib_SetMusicVolume(music, volume)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetPixelColor(dstPtr: Ptr[Byte], color: Color, format: CInt)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Color] = alloc[Color](1)
//     !(__ptr_0 + 0) = color
//     __sn_wrap_raylib_SetPixelColor(dstPtr, (__ptr_0 + 0), format)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetPixelColor(dstPtr: Ptr[Byte], color: Ptr[Color], format: CInt): Unit =
//     __sn_wrap_raylib_SetPixelColor(dstPtr, color, format)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetShaderValue(
//       shader: Ptr[Shader],
//       locIndex: CInt,
//       value: Ptr[Byte],
//       uniformType: CInt
//   ): Unit =
//     __sn_wrap_raylib_SetShaderValue(shader, locIndex, value, uniformType)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetShaderValue(
//       shader: Shader,
//       locIndex: CInt,
//       value: Ptr[Byte],
//       uniformType: CInt
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Shader] = alloc[Shader](1)
//     !(__ptr_0 + 0) = shader
//     __sn_wrap_raylib_SetShaderValue((__ptr_0 + 0), locIndex, value, uniformType)
//   end SetShaderValue

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetShaderValueMatrix(
//       shader: Ptr[Shader],
//       locIndex: CInt,
//       mat: Ptr[Matrix]
//   ): Unit =
//     __sn_wrap_raylib_SetShaderValueMatrix(shader, locIndex, mat)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetShaderValueMatrix(shader: Shader, locIndex: CInt, mat: Matrix)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Shader] = alloc[Shader](1)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = shader
//     !(__ptr_1 + 0) = mat
//     __sn_wrap_raylib_SetShaderValueMatrix(
//       (__ptr_0 + 0),
//       locIndex,
//       (__ptr_1 + 0)
//     )
//   end SetShaderValueMatrix

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetShaderValueTexture(
//       shader: Ptr[Shader],
//       locIndex: CInt,
//       texture: Ptr[Texture2D]
//   ): Unit =
//     __sn_wrap_raylib_SetShaderValueTexture(shader, locIndex, texture)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetShaderValueTexture(shader: Shader, locIndex: CInt, texture: Texture2D)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[Shader] = alloc[Shader](1)
//     val __ptr_1: Ptr[Texture2D] = alloc[Texture2D](1)
//     !(__ptr_0 + 0) = shader
//     !(__ptr_1 + 0) = texture
//     __sn_wrap_raylib_SetShaderValueTexture(
//       (__ptr_0 + 0),
//       locIndex,
//       (__ptr_1 + 0)
//     )
//   end SetShaderValueTexture

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetShaderValueV(
//       shader: Shader,
//       locIndex: CInt,
//       value: Ptr[Byte],
//       uniformType: CInt,
//       count: CInt
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Shader] = alloc[Shader](1)
//     !(__ptr_0 + 0) = shader
//     __sn_wrap_raylib_SetShaderValueV(
//       (__ptr_0 + 0),
//       locIndex,
//       value,
//       uniformType,
//       count
//     )
//   end SetShaderValueV

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetShaderValueV(
//       shader: Ptr[Shader],
//       locIndex: CInt,
//       value: Ptr[Byte],
//       uniformType: CInt,
//       count: CInt
//   ): Unit =
//     __sn_wrap_raylib_SetShaderValueV(
//       shader,
//       locIndex,
//       value,
//       uniformType,
//       count
//     )

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetShapesTexture(texture: Ptr[Texture2D], source: Ptr[Rectangle]): Unit =
//     __sn_wrap_raylib_SetShapesTexture(texture, source)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetShapesTexture(texture: Texture2D, source: Rectangle)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_0 + 0) = texture
//     !(__ptr_1 + 0) = source
//     __sn_wrap_raylib_SetShapesTexture((__ptr_0 + 0), (__ptr_1 + 0))
//   end SetShapesTexture

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetSoundPan(sound: Sound, pan: Float)(using Zone): Unit =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = sound
//     __sn_wrap_raylib_SetSoundPan((__ptr_0 + 0), pan)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetSoundPan(sound: Ptr[Sound], pan: Float): Unit =
//     __sn_wrap_raylib_SetSoundPan(sound, pan)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetSoundPitch(sound: Ptr[Sound], pitch: Float): Unit =
//     __sn_wrap_raylib_SetSoundPitch(sound, pitch)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetSoundPitch(sound: Sound, pitch: Float)(using Zone): Unit =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = sound
//     __sn_wrap_raylib_SetSoundPitch((__ptr_0 + 0), pitch)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetSoundVolume(sound: Ptr[Sound], volume: Float): Unit =
//     __sn_wrap_raylib_SetSoundVolume(sound, volume)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetSoundVolume(sound: Sound, volume: Float)(using Zone): Unit =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = sound
//     __sn_wrap_raylib_SetSoundVolume((__ptr_0 + 0), volume)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetTextureFilter(texture: Ptr[Texture2D], filter: CInt): Unit =
//     __sn_wrap_raylib_SetTextureFilter(texture, filter)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetTextureFilter(texture: Texture2D, filter: CInt)(using Zone): Unit =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     !(__ptr_0 + 0) = texture
//     __sn_wrap_raylib_SetTextureFilter((__ptr_0 + 0), filter)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetTextureWrap(texture: Texture2D, wrap: CInt)(using Zone): Unit =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     !(__ptr_0 + 0) = texture
//     __sn_wrap_raylib_SetTextureWrap((__ptr_0 + 0), wrap)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetTextureWrap(texture: Ptr[Texture2D], wrap: CInt): Unit =
//     __sn_wrap_raylib_SetTextureWrap(texture, wrap)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowIcon(image: Image)(using Zone): Unit =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = image
//     __sn_wrap_raylib_SetWindowIcon((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def SetWindowIcon(image: Ptr[Image]): Unit =
//     __sn_wrap_raylib_SetWindowIcon(image)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def StopAudioStream(stream: Ptr[AudioStream]): Unit =
//     __sn_wrap_raylib_StopAudioStream(stream)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def StopAudioStream(stream: AudioStream)(using Zone): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_StopAudioStream((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def StopMusicStream(music: Ptr[Music]): Unit =
//     __sn_wrap_raylib_StopMusicStream(music)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def StopMusicStream(music: Music)(using Zone): Unit =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_StopMusicStream((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def StopSound(sound: Sound)(using Zone): Unit =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = sound
//     __sn_wrap_raylib_StopSound((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def StopSound(sound: Ptr[Sound]): Unit =
//     __sn_wrap_raylib_StopSound(sound)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadAudioStream(stream: AudioStream)(using Zone): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_UnloadAudioStream((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadAudioStream(stream: Ptr[AudioStream]): Unit =
//     __sn_wrap_raylib_UnloadAudioStream(stream)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadDirectoryFiles(files: FilePathList)(using Zone): Unit =
//     val __ptr_0: Ptr[FilePathList] = alloc[FilePathList](1)
//     !(__ptr_0 + 0) = files
//     __sn_wrap_raylib_UnloadDirectoryFiles((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadDirectoryFiles(files: Ptr[FilePathList]): Unit =
//     __sn_wrap_raylib_UnloadDirectoryFiles(files)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadDroppedFiles(files: FilePathList)(using Zone): Unit =
//     val __ptr_0: Ptr[FilePathList] = alloc[FilePathList](1)
//     !(__ptr_0 + 0) = files
//     __sn_wrap_raylib_UnloadDroppedFiles((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadDroppedFiles(files: Ptr[FilePathList]): Unit =
//     __sn_wrap_raylib_UnloadDroppedFiles(files)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadFont(font: Ptr[Font]): Unit =
//     __sn_wrap_raylib_UnloadFont(font)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadFont(font: Font)(using Zone): Unit =
//     val __ptr_0: Ptr[Font] = alloc[Font](1)
//     !(__ptr_0 + 0) = font
//     __sn_wrap_raylib_UnloadFont((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadImage(image: Image)(using Zone): Unit =
//     val __ptr_0: Ptr[Image] = alloc[Image](1)
//     !(__ptr_0 + 0) = image
//     __sn_wrap_raylib_UnloadImage((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadImage(image: Ptr[Image]): Unit =
//     __sn_wrap_raylib_UnloadImage(image)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadMaterial(material: Material)(using Zone): Unit =
//     val __ptr_0: Ptr[Material] = alloc[Material](1)
//     !(__ptr_0 + 0) = material
//     __sn_wrap_raylib_UnloadMaterial((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadMaterial(material: Ptr[Material]): Unit =
//     __sn_wrap_raylib_UnloadMaterial(material)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadMesh(mesh: Mesh)(using Zone): Unit =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     !(__ptr_0 + 0) = mesh
//     __sn_wrap_raylib_UnloadMesh((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadMesh(mesh: Ptr[Mesh]): Unit =
//     __sn_wrap_raylib_UnloadMesh(mesh)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadModel(model: Ptr[Model]): Unit =
//     __sn_wrap_raylib_UnloadModel(model)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadModel(model: Model)(using Zone): Unit =
//     val __ptr_0: Ptr[Model] = alloc[Model](1)
//     !(__ptr_0 + 0) = model
//     __sn_wrap_raylib_UnloadModel((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadModelAnimation(anim: Ptr[ModelAnimation]): Unit =
//     __sn_wrap_raylib_UnloadModelAnimation(anim)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadModelAnimation(anim: ModelAnimation)(using Zone): Unit =
//     val __ptr_0: Ptr[ModelAnimation] = alloc[ModelAnimation](1)
//     !(__ptr_0 + 0) = anim
//     __sn_wrap_raylib_UnloadModelAnimation((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadMusicStream(music: Music)(using Zone): Unit =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_UnloadMusicStream((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadMusicStream(music: Ptr[Music]): Unit =
//     __sn_wrap_raylib_UnloadMusicStream(music)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadRenderTexture(target: Ptr[RenderTexture2D]): Unit =
//     __sn_wrap_raylib_UnloadRenderTexture(target)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadRenderTexture(target: RenderTexture2D)(using Zone): Unit =
//     val __ptr_0: Ptr[RenderTexture2D] = alloc[RenderTexture2D](1)
//     !(__ptr_0 + 0) = target
//     __sn_wrap_raylib_UnloadRenderTexture((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadShader(shader: Shader)(using Zone): Unit =
//     val __ptr_0: Ptr[Shader] = alloc[Shader](1)
//     !(__ptr_0 + 0) = shader
//     __sn_wrap_raylib_UnloadShader((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadShader(shader: Ptr[Shader]): Unit =
//     __sn_wrap_raylib_UnloadShader(shader)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadSound(sound: Ptr[Sound]): Unit =
//     __sn_wrap_raylib_UnloadSound(sound)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadSound(sound: Sound)(using Zone): Unit =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = sound
//     __sn_wrap_raylib_UnloadSound((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadSoundAlias(alias: Ptr[Sound]): Unit =
//     __sn_wrap_raylib_UnloadSoundAlias(alias)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadSoundAlias(alias: Sound)(using Zone): Unit =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = alias
//     __sn_wrap_raylib_UnloadSoundAlias((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadTexture(texture: Texture2D)(using Zone): Unit =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     !(__ptr_0 + 0) = texture
//     __sn_wrap_raylib_UnloadTexture((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadTexture(texture: Ptr[Texture2D]): Unit =
//     __sn_wrap_raylib_UnloadTexture(texture)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadVrStereoConfig(config: Ptr[VrStereoConfig]): Unit =
//     __sn_wrap_raylib_UnloadVrStereoConfig(config)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadVrStereoConfig(config: VrStereoConfig)(using Zone): Unit =
//     val __ptr_0: Ptr[VrStereoConfig] = alloc[VrStereoConfig](1)
//     !(__ptr_0 + 0) = config
//     __sn_wrap_raylib_UnloadVrStereoConfig((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadWave(wave: Wave)(using Zone): Unit =
//     val __ptr_0: Ptr[Wave] = alloc[Wave](1)
//     !(__ptr_0 + 0) = wave
//     __sn_wrap_raylib_UnloadWave((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UnloadWave(wave: Ptr[Wave]): Unit =
//     __sn_wrap_raylib_UnloadWave(wave)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateAudioStream(
//       stream: Ptr[AudioStream],
//       data: Ptr[Byte],
//       frameCount: CInt
//   ): Unit =
//     __sn_wrap_raylib_UpdateAudioStream(stream, data, frameCount)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateAudioStream(stream: AudioStream, data: Ptr[Byte], frameCount: CInt)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
//     !(__ptr_0 + 0) = stream
//     __sn_wrap_raylib_UpdateAudioStream((__ptr_0 + 0), data, frameCount)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateCameraPro(
//       camera: Ptr[Camera],
//       movement: Vector3,
//       rotation: Vector3,
//       zoom: Float
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = movement
//     !(__ptr_0 + 1) = rotation
//     __sn_wrap_raylib_UpdateCameraPro(camera, (__ptr_0 + 0), (__ptr_0 + 1), zoom)
//   end UpdateCameraPro

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateCameraPro(
//       camera: Ptr[Camera],
//       movement: Ptr[Vector3],
//       rotation: Ptr[Vector3],
//       zoom: Float
//   ): Unit =
//     __sn_wrap_raylib_UpdateCameraPro(camera, movement, rotation, zoom)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateMeshBuffer(
//       mesh: Mesh,
//       index: CInt,
//       data: Ptr[Byte],
//       dataSize: CInt,
//       offset: CInt
//   )(using Zone): Unit =
//     val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
//     !(__ptr_0 + 0) = mesh
//     __sn_wrap_raylib_UpdateMeshBuffer(
//       (__ptr_0 + 0),
//       index,
//       data,
//       dataSize,
//       offset
//     )
//   end UpdateMeshBuffer

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateMeshBuffer(
//       mesh: Ptr[Mesh],
//       index: CInt,
//       data: Ptr[Byte],
//       dataSize: CInt,
//       offset: CInt
//   ): Unit =
//     __sn_wrap_raylib_UpdateMeshBuffer(mesh, index, data, dataSize, offset)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateModelAnimation(model: Model, anim: ModelAnimation, frame: CInt)(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[Model] = alloc[Model](1)
//     val __ptr_1: Ptr[ModelAnimation] = alloc[ModelAnimation](1)
//     !(__ptr_0 + 0) = model
//     !(__ptr_1 + 0) = anim
//     __sn_wrap_raylib_UpdateModelAnimation((__ptr_0 + 0), (__ptr_1 + 0), frame)
//   end UpdateModelAnimation

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateModelAnimation(
//       model: Ptr[Model],
//       anim: Ptr[ModelAnimation],
//       frame: CInt
//   ): Unit =
//     __sn_wrap_raylib_UpdateModelAnimation(model, anim, frame)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateMusicStream(music: Music)(using Zone): Unit =
//     val __ptr_0: Ptr[Music] = alloc[Music](1)
//     !(__ptr_0 + 0) = music
//     __sn_wrap_raylib_UpdateMusicStream((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateMusicStream(music: Ptr[Music]): Unit =
//     __sn_wrap_raylib_UpdateMusicStream(music)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateSound(sound: Ptr[Sound], data: Ptr[Byte], sampleCount: CInt): Unit =
//     __sn_wrap_raylib_UpdateSound(sound, data, sampleCount)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateSound(sound: Sound, data: Ptr[Byte], sampleCount: CInt)(using
//       Zone
//   ): Unit =
//     val __ptr_0: Ptr[Sound] = alloc[Sound](1)
//     !(__ptr_0 + 0) = sound
//     __sn_wrap_raylib_UpdateSound((__ptr_0 + 0), data, sampleCount)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateTexture(texture: Texture2D, pixels: Ptr[Byte])(using Zone): Unit =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     !(__ptr_0 + 0) = texture
//     __sn_wrap_raylib_UpdateTexture((__ptr_0 + 0), pixels)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateTexture(texture: Ptr[Texture2D], pixels: Ptr[Byte]): Unit =
//     __sn_wrap_raylib_UpdateTexture(texture, pixels)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateTextureRec(texture: Texture2D, rec: Rectangle, pixels: Ptr[Byte])(
//       using Zone
//   ): Unit =
//     val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
//     val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
//     !(__ptr_0 + 0) = texture
//     !(__ptr_1 + 0) = rec
//     __sn_wrap_raylib_UpdateTextureRec((__ptr_0 + 0), (__ptr_1 + 0), pixels)
//   end UpdateTextureRec

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def UpdateTextureRec(
//       texture: Ptr[Texture2D],
//       rec: Ptr[Rectangle],
//       pixels: Ptr[Byte]
//   ): Unit =
//     __sn_wrap_raylib_UpdateTextureRec(texture, rec, pixels)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Add(v1: Vector2, v2: Vector2)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector2Add((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Add(v1: Ptr[Vector2], v2: Ptr[Vector2])(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Add(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Add(v1: Ptr[Vector2], v2: Ptr[Vector2])(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2Add(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2AddValue(v: Vector2, add: Float)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector2AddValue((__ptr_0 + 0), add, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2AddValue(v: Ptr[Vector2], add: Float)(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2AddValue(v, add, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2AddValue(v: Ptr[Vector2], add: Float)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2AddValue(v, add, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Angle(v1: Vector2, v2: Vector2)(using Zone): Float =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector2Angle((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Angle(v1: Ptr[Vector2], v2: Ptr[Vector2]): Float =
//     __sn_wrap_raylib_Vector2Angle(v1, v2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Clamp(v: Ptr[Vector2], min: Ptr[Vector2], max: Ptr[Vector2])(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Clamp(v, min, max, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Clamp(v: Ptr[Vector2], min: Ptr[Vector2], max: Ptr[Vector2])(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2Clamp(v, min, max, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Clamp(v: Vector2, min: Vector2, max: Vector2)(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](4)
//     !(__ptr_0 + 0) = v
//     !(__ptr_0 + 1) = min
//     !(__ptr_0 + 2) = max
//     __sn_wrap_raylib_Vector2Clamp(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       (__ptr_0 + 3)
//     )
//     !(__ptr_0 + 3)
//   end Vector2Clamp

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2ClampValue(v: Ptr[Vector2], min: Float, max: Float)(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2ClampValue(v, min, max, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2ClampValue(v: Ptr[Vector2], min: Float, max: Float)(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2ClampValue(v, min, max, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2ClampValue(v: Vector2, min: Float, max: Float)(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector2ClampValue((__ptr_0 + 0), min, max, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Distance(v1: Vector2, v2: Vector2)(using Zone): Float =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector2Distance((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Distance(v1: Ptr[Vector2], v2: Ptr[Vector2]): Float =
//     __sn_wrap_raylib_Vector2Distance(v1, v2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2DistanceSqr(v1: Ptr[Vector2], v2: Ptr[Vector2]): Float =
//     __sn_wrap_raylib_Vector2DistanceSqr(v1, v2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2DistanceSqr(v1: Vector2, v2: Vector2)(using Zone): Float =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector2DistanceSqr((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Divide(v1: Vector2, v2: Vector2)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector2Divide((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Divide(v1: Ptr[Vector2], v2: Ptr[Vector2])(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2Divide(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Divide(v1: Ptr[Vector2], v2: Ptr[Vector2])(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Divide(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2DotProduct(v1: Ptr[Vector2], v2: Ptr[Vector2]): Float =
//     __sn_wrap_raylib_Vector2DotProduct(v1, v2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2DotProduct(v1: Vector2, v2: Vector2)(using Zone): Float =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector2DotProduct((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Equals(p: Ptr[Vector2], q: Ptr[Vector2]): CInt =
//     __sn_wrap_raylib_Vector2Equals(p, q)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Equals(p: Vector2, q: Vector2)(using Zone): CInt =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = p
//     !(__ptr_0 + 1) = q
//     __sn_wrap_raylib_Vector2Equals((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Invert(v: Ptr[Vector2])(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_Vector2Invert(v, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Invert(v: Vector2)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector2Invert((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Invert(v: Ptr[Vector2])(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Invert(v, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Length(v: Ptr[Vector2]): Float =
//     __sn_wrap_raylib_Vector2Length(v)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Length(v: Vector2)(using Zone): Float =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector2Length((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2LengthSqr(v: Ptr[Vector2]): Float =
//     __sn_wrap_raylib_Vector2LengthSqr(v)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2LengthSqr(v: Vector2)(using Zone): Float =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector2LengthSqr((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Lerp(v1: Ptr[Vector2], v2: Ptr[Vector2], amount: Float)(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Lerp(v1, v2, amount, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Lerp(v1: Ptr[Vector2], v2: Ptr[Vector2], amount: Float)(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2Lerp(v1, v2, amount, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Lerp(v1: Vector2, v2: Vector2, amount: Float)(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector2Lerp(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       amount,
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end Vector2Lerp

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2LineAngle(start: Ptr[Vector2], end: Ptr[Vector2]): Float =
//     __sn_wrap_raylib_Vector2LineAngle(start, end)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2LineAngle(start: Vector2, end: Vector2)(using Zone): Float =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = start
//     !(__ptr_0 + 1) = end
//     __sn_wrap_raylib_Vector2LineAngle((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2MoveTowards(
//       v: Ptr[Vector2],
//       target: Ptr[Vector2],
//       maxDistance: Float
//   )(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2MoveTowards(v, target, maxDistance, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end Vector2MoveTowards

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2MoveTowards(v: Vector2, target: Vector2, maxDistance: Float)(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_0 + 0) = v
//     !(__ptr_0 + 1) = target
//     __sn_wrap_raylib_Vector2MoveTowards(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       maxDistance,
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end Vector2MoveTowards

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2MoveTowards(
//       v: Ptr[Vector2],
//       target: Ptr[Vector2],
//       maxDistance: Float
//   )(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_Vector2MoveTowards(v, target, maxDistance, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Multiply(v1: Vector2, v2: Vector2)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector2Multiply(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end Vector2Multiply

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Multiply(v1: Ptr[Vector2], v2: Ptr[Vector2])(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Multiply(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Multiply(v1: Ptr[Vector2], v2: Ptr[Vector2])(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2Multiply(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Negate(v: Vector2)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector2Negate((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Negate(v: Ptr[Vector2])(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_Vector2Negate(v, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Negate(v: Ptr[Vector2])(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Negate(v, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Normalize(v: Ptr[Vector2])(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_Vector2Normalize(v, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Normalize(v: Ptr[Vector2])(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Normalize(v, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Normalize(v: Vector2)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector2Normalize((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2One()(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_Vector2One(__return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2One()(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2One((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Reflect(v: Vector2, normal: Vector2)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_0 + 0) = v
//     !(__ptr_0 + 1) = normal
//     __sn_wrap_raylib_Vector2Reflect((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Reflect(v: Ptr[Vector2], normal: Ptr[Vector2])(using
//       Zone
//   ): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Reflect(v, normal, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Reflect(v: Ptr[Vector2], normal: Ptr[Vector2])(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2Reflect(v, normal, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Rotate(v: Ptr[Vector2], angle: Float)(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2Rotate(v, angle, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Rotate(v: Vector2, angle: Float)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector2Rotate((__ptr_0 + 0), angle, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Rotate(v: Ptr[Vector2], angle: Float)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Rotate(v, angle, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Scale(v: Ptr[Vector2], scale: Float)(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2Scale(v, scale, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Scale(v: Ptr[Vector2], scale: Float)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Scale(v, scale, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Scale(v: Vector2, scale: Float)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector2Scale((__ptr_0 + 0), scale, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Subtract(v1: Vector2, v2: Vector2)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector2Subtract(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end Vector2Subtract

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Subtract(v1: Ptr[Vector2], v2: Ptr[Vector2])(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Subtract(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Subtract(v1: Ptr[Vector2], v2: Ptr[Vector2])(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2Subtract(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2SubtractValue(v: Ptr[Vector2], sub: Float)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2SubtractValue(v, sub, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2SubtractValue(v: Vector2, sub: Float)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector2SubtractValue((__ptr_0 + 0), sub, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2SubtractValue(v: Ptr[Vector2], sub: Float)(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2SubtractValue(v, sub, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Transform(v: Vector2, mat: Matrix)(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = v
//     !(__ptr_1 + 0) = mat
//     __sn_wrap_raylib_Vector2Transform(
//       (__ptr_0 + 0),
//       (__ptr_1 + 0),
//       (__ptr_0 + 1)
//     )
//     !(__ptr_0 + 1)
//   end Vector2Transform

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Transform(v: Ptr[Vector2], mat: Ptr[Matrix])(
//       __return: Ptr[Vector2]
//   ): Unit =
//     __sn_wrap_raylib_Vector2Transform(v, mat, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Transform(v: Ptr[Vector2], mat: Ptr[Matrix])(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Transform(v, mat, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Zero()(__return: Ptr[Vector2]): Unit =
//     __sn_wrap_raylib_Vector2Zero(__return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector2Zero()(using Zone): Vector2 =
//     val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
//     __sn_wrap_raylib_Vector2Zero((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Add(v1: Ptr[Vector3], v2: Ptr[Vector3])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Add(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Add(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3Add((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Add(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Add(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3AddValue(v: Ptr[Vector3], add: Float)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3AddValue(v, add, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3AddValue(v: Vector3, add: Float)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector3AddValue((__ptr_0 + 0), add, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3AddValue(v: Ptr[Vector3], add: Float)(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3AddValue(v, add, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Angle(v1: Vector3, v2: Vector3)(using Zone): Float =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3Angle((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Angle(v1: Ptr[Vector3], v2: Ptr[Vector3]): Float =
//     __sn_wrap_raylib_Vector3Angle(v1, v2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Barycenter(
//       p: Ptr[Vector3],
//       a: Ptr[Vector3],
//       b: Ptr[Vector3],
//       c: Ptr[Vector3]
//   )(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Barycenter(p, a, b, c, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end Vector3Barycenter

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Barycenter(
//       p: Ptr[Vector3],
//       a: Ptr[Vector3],
//       b: Ptr[Vector3],
//       c: Ptr[Vector3]
//   )(__return: Ptr[Vector3]): Unit =
//     __sn_wrap_raylib_Vector3Barycenter(p, a, b, c, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Barycenter(p: Vector3, a: Vector3, b: Vector3, c: Vector3)(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](5)
//     !(__ptr_0 + 0) = p
//     !(__ptr_0 + 1) = a
//     !(__ptr_0 + 2) = b
//     !(__ptr_0 + 3) = c
//     __sn_wrap_raylib_Vector3Barycenter(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       (__ptr_0 + 3),
//       (__ptr_0 + 4)
//     )
//     !(__ptr_0 + 4)
//   end Vector3Barycenter

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Clamp(v: Vector3, min: Vector3, max: Vector3)(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](4)
//     !(__ptr_0 + 0) = v
//     !(__ptr_0 + 1) = min
//     !(__ptr_0 + 2) = max
//     __sn_wrap_raylib_Vector3Clamp(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2),
//       (__ptr_0 + 3)
//     )
//     !(__ptr_0 + 3)
//   end Vector3Clamp

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Clamp(v: Ptr[Vector3], min: Ptr[Vector3], max: Ptr[Vector3])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Clamp(v, min, max, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Clamp(v: Ptr[Vector3], min: Ptr[Vector3], max: Ptr[Vector3])(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Clamp(v, min, max, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3ClampValue(v: Ptr[Vector3], min: Float, max: Float)(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3ClampValue(v, min, max, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3ClampValue(v: Ptr[Vector3], min: Float, max: Float)(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3ClampValue(v, min, max, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3ClampValue(v: Vector3, min: Float, max: Float)(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector3ClampValue((__ptr_0 + 0), min, max, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3CrossProduct(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3CrossProduct(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end Vector3CrossProduct

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3CrossProduct(v1: Ptr[Vector3], v2: Ptr[Vector3])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3CrossProduct(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3CrossProduct(v1: Ptr[Vector3], v2: Ptr[Vector3])(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3CrossProduct(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Distance(v1: Ptr[Vector3], v2: Ptr[Vector3]): Float =
//     __sn_wrap_raylib_Vector3Distance(v1, v2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Distance(v1: Vector3, v2: Vector3)(using Zone): Float =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3Distance((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3DistanceSqr(v1: Vector3, v2: Vector3)(using Zone): Float =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3DistanceSqr((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3DistanceSqr(v1: Ptr[Vector3], v2: Ptr[Vector3]): Float =
//     __sn_wrap_raylib_Vector3DistanceSqr(v1, v2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Divide(v1: Ptr[Vector3], v2: Ptr[Vector3])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Divide(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Divide(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3Divide((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Divide(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Divide(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3DotProduct(v1: Ptr[Vector3], v2: Ptr[Vector3]): Float =
//     __sn_wrap_raylib_Vector3DotProduct(v1, v2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3DotProduct(v1: Vector3, v2: Vector3)(using Zone): Float =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3DotProduct((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Equals(p: Ptr[Vector3], q: Ptr[Vector3]): CInt =
//     __sn_wrap_raylib_Vector3Equals(p, q)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Equals(p: Vector3, q: Vector3)(using Zone): CInt =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = p
//     !(__ptr_0 + 1) = q
//     __sn_wrap_raylib_Vector3Equals((__ptr_0 + 0), (__ptr_0 + 1))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Invert(v: Ptr[Vector3])(__return: Ptr[Vector3]): Unit =
//     __sn_wrap_raylib_Vector3Invert(v, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Invert(v: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Invert(v, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Invert(v: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector3Invert((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Length(v: Ptr[Vector3]): Float =
//     __sn_wrap_raylib_Vector3Length(v)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Length(v: Vector3)(using Zone): Float =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector3Length((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3LengthSqr(v: Ptr[Vector3]): Float =
//     __sn_wrap_raylib_Vector3LengthSqr(v)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3LengthSqr(v: Vector3)(using Zone): Float =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector3LengthSqr((__ptr_0 + 0))

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Lerp(v1: Ptr[Vector3], v2: Ptr[Vector3], amount: Float)(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Lerp(v1, v2, amount, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Lerp(v1: Ptr[Vector3], v2: Ptr[Vector3], amount: Float)(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Lerp(v1, v2, amount, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Lerp(v1: Vector3, v2: Vector3, amount: Float)(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3Lerp(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       amount,
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end Vector3Lerp

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Max(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Max(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Max(v1: Ptr[Vector3], v2: Ptr[Vector3])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Max(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Max(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3Max((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Min(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Min(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Min(v1: Ptr[Vector3], v2: Ptr[Vector3])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Min(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Min(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3Min((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Multiply(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Multiply(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Multiply(v1: Ptr[Vector3], v2: Ptr[Vector3])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Multiply(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Multiply(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3Multiply(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end Vector3Multiply

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Negate(v: Ptr[Vector3])(__return: Ptr[Vector3]): Unit =
//     __sn_wrap_raylib_Vector3Negate(v, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Negate(v: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector3Negate((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Negate(v: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Negate(v, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Normalize(v: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector3Normalize((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Normalize(v: Ptr[Vector3])(__return: Ptr[Vector3]): Unit =
//     __sn_wrap_raylib_Vector3Normalize(v, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Normalize(v: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Normalize(v, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3One()(__return: Ptr[Vector3]): Unit =
//     __sn_wrap_raylib_Vector3One(__return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3One()(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3One((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Perpendicular(v: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Perpendicular(v, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Perpendicular(v: Ptr[Vector3])(__return: Ptr[Vector3]): Unit =
//     __sn_wrap_raylib_Vector3Perpendicular(v, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Perpendicular(v: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector3Perpendicular((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Project(v1: Ptr[Vector3], v2: Ptr[Vector3])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Project(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Project(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Project(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Project(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3Project((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Reflect(v: Ptr[Vector3], normal: Ptr[Vector3])(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Reflect(v, normal, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Reflect(v: Ptr[Vector3], normal: Ptr[Vector3])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Reflect(v, normal, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Reflect(v: Vector3, normal: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v
//     !(__ptr_0 + 1) = normal
//     __sn_wrap_raylib_Vector3Reflect((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Refract(v: Ptr[Vector3], n: Ptr[Vector3], r: Float)(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Refract(v, n, r, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Refract(v: Vector3, n: Vector3, r: Float)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v
//     !(__ptr_0 + 1) = n
//     __sn_wrap_raylib_Vector3Refract(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       r,
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end Vector3Refract

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Refract(v: Ptr[Vector3], n: Ptr[Vector3], r: Float)(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Refract(v, n, r, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Reject(v1: Ptr[Vector3], v2: Ptr[Vector3])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Reject(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Reject(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Reject(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Reject(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3Reject((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
//     !(__ptr_0 + 2)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3RotateByAxisAngle(v: Vector3, axis: Vector3, angle: Float)(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v
//     !(__ptr_0 + 1) = axis
//     __sn_wrap_raylib_Vector3RotateByAxisAngle(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       angle,
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end Vector3RotateByAxisAngle

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3RotateByAxisAngle(
//       v: Ptr[Vector3],
//       axis: Ptr[Vector3],
//       angle: Float
//   )(__return: Ptr[Vector3]): Unit =
//     __sn_wrap_raylib_Vector3RotateByAxisAngle(v, axis, angle, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3RotateByAxisAngle(
//       v: Ptr[Vector3],
//       axis: Ptr[Vector3],
//       angle: Float
//   )(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3RotateByAxisAngle(v, axis, angle, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end Vector3RotateByAxisAngle

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3RotateByQuaternion(v: Ptr[Vector3], q: Ptr[Quaternion])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3RotateByQuaternion(v, q, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3RotateByQuaternion(v: Ptr[Vector3], q: Ptr[Quaternion])(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3RotateByQuaternion(v, q, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3RotateByQuaternion(v: Vector3, q: Quaternion)(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     val __ptr_1: Ptr[Quaternion] = alloc[Quaternion](1)
//     !(__ptr_0 + 0) = v
//     !(__ptr_1 + 0) = q
//     __sn_wrap_raylib_Vector3RotateByQuaternion(
//       (__ptr_0 + 0),
//       (__ptr_1 + 0),
//       (__ptr_0 + 1)
//     )
//     !(__ptr_0 + 1)
//   end Vector3RotateByQuaternion

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Scale(v: Ptr[Vector3], scalar: Float)(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Scale(v, scalar, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Scale(v: Vector3, scalar: Float)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector3Scale((__ptr_0 + 0), scalar, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Scale(v: Ptr[Vector3], scalar: Float)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Scale(v, scalar, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Subtract(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
//     !(__ptr_0 + 0) = v1
//     !(__ptr_0 + 1) = v2
//     __sn_wrap_raylib_Vector3Subtract(
//       (__ptr_0 + 0),
//       (__ptr_0 + 1),
//       (__ptr_0 + 2)
//     )
//     !(__ptr_0 + 2)
//   end Vector3Subtract

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Subtract(v1: Ptr[Vector3], v2: Ptr[Vector3])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Subtract(v1, v2, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Subtract(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Subtract(v1, v2, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3SubtractValue(v: Ptr[Vector3], sub: Float)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3SubtractValue(v, sub, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3SubtractValue(v: Vector3, sub: Float)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     !(__ptr_0 + 0) = v
//     __sn_wrap_raylib_Vector3SubtractValue((__ptr_0 + 0), sub, (__ptr_0 + 1))
//     !(__ptr_0 + 1)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3SubtractValue(v: Ptr[Vector3], sub: Float)(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3SubtractValue(v, sub, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3ToFloatV(v: Ptr[Vector3])(__return: Ptr[float3]): Unit =
//     __sn_wrap_raylib_Vector3ToFloatV(v, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3ToFloatV(v: Vector3)(using Zone): float3 =
//     val __ptr_0: Ptr[float3] = alloc[float3](1)
//     val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
//     !(__ptr_1 + 0) = v
//     __sn_wrap_raylib_Vector3ToFloatV((__ptr_1 + 0), (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3ToFloatV(v: Ptr[Vector3])(using Zone): float3 =
//     val __ptr_0: Ptr[float3] = alloc[float3](1)
//     __sn_wrap_raylib_Vector3ToFloatV(v, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Transform(v: Ptr[Vector3], mat: Ptr[Matrix])(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Transform(v, mat, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Transform(v: Vector3, mat: Matrix)(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
//     !(__ptr_0 + 0) = v
//     !(__ptr_1 + 0) = mat
//     __sn_wrap_raylib_Vector3Transform(
//       (__ptr_0 + 0),
//       (__ptr_1 + 0),
//       (__ptr_0 + 1)
//     )
//     !(__ptr_0 + 1)
//   end Vector3Transform

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Transform(v: Ptr[Vector3], mat: Ptr[Matrix])(
//       __return: Ptr[Vector3]
//   ): Unit =
//     __sn_wrap_raylib_Vector3Transform(v, mat, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Unproject(
//       source: Ptr[Vector3],
//       projection: Ptr[Matrix],
//       view: Ptr[Matrix]
//   )(__return: Ptr[Vector3]): Unit =
//     __sn_wrap_raylib_Vector3Unproject(source, projection, view, __return)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Unproject(source: Vector3, projection: Matrix, view: Matrix)(using
//       Zone
//   ): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
//     val __ptr_1: Ptr[Matrix] = alloc[Matrix](2)
//     !(__ptr_0 + 0) = source
//     !(__ptr_1 + 0) = projection
//     !(__ptr_1 + 1) = view
//     __sn_wrap_raylib_Vector3Unproject(
//       (__ptr_0 + 0),
//       (__ptr_1 + 0),
//       (__ptr_1 + 1),
//       (__ptr_0 + 1)
//     )
//     !(__ptr_0 + 1)
//   end Vector3Unproject

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Unproject(
//       source: Ptr[Vector3],
//       projection: Ptr[Matrix],
//       view: Ptr[Matrix]
//   )(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Unproject(source, projection, view, (__ptr_0 + 0))
//     !(__ptr_0 + 0)
//   end Vector3Unproject

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Zero()(using Zone): Vector3 =
//     val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
//     __sn_wrap_raylib_Vector3Zero((__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raymath.h
//     */
//   def Vector3Zero()(__return: Ptr[Vector3]): Unit =
//     __sn_wrap_raylib_Vector3Zero(__return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def WaveCopy(wave: Ptr[Wave])(using Zone): Wave =
//     val __ptr_0: Ptr[Wave] = alloc[Wave](1)
//     __sn_wrap_raylib_WaveCopy(wave, (__ptr_0 + 0))
//     !(__ptr_0 + 0)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def WaveCopy(wave: Ptr[Wave])(__return: Ptr[Wave]): Unit =
//     __sn_wrap_raylib_WaveCopy(wave, __return)

//   /** [bindgen] header: ./raylib/src/raylib.h
//     */
//   def WaveCopy(wave: Wave)(using Zone): Wave =
//     val __ptr_0: Ptr[Wave] = alloc[Wave](2)
//     !(__ptr_0 + 0) = wave
//     __sn_wrap_raylib_WaveCopy((__ptr_0 + 0), (__ptr_0 + 1))
//     !(__ptr_0 + 1)
// end functions

// object types:
//   export _root_.raylib.structs.*
//   export _root_.raylib.aliases.*
//   export _root_.raylib.enumerations.*

// object all:
//   export _root_.raylib.enumerations.BlendMode
//   export _root_.raylib.enumerations.CameraMode
//   export _root_.raylib.enumerations.CameraProjection
//   export _root_.raylib.enumerations.ConfigFlags
//   export _root_.raylib.enumerations.CubemapLayout
//   export _root_.raylib.enumerations.FontType
//   export _root_.raylib.enumerations.GamepadAxis
//   export _root_.raylib.enumerations.GamepadButton
//   export _root_.raylib.enumerations.Gesture
//   export _root_.raylib.enumerations.KeyboardKey
//   export _root_.raylib.enumerations.MaterialMapIndex
//   export _root_.raylib.enumerations.MouseButton
//   export _root_.raylib.enumerations.MouseCursor
//   export _root_.raylib.enumerations.NPatchLayout
//   export _root_.raylib.enumerations.PixelFormat
//   export _root_.raylib.enumerations.ShaderAttributeDataType
//   export _root_.raylib.enumerations.ShaderLocationIndex
//   export _root_.raylib.enumerations.ShaderUniformDataType
//   export _root_.raylib.enumerations.TextureFilter
//   export _root_.raylib.enumerations.TextureWrap
//   export _root_.raylib.enumerations.TraceLogLevel
//   export _root_.raylib.aliases.AudioCallback
//   export _root_.raylib.aliases.Camera
//   export _root_.raylib.aliases.LoadFileDataCallback
//   export _root_.raylib.aliases.LoadFileTextCallback
//   export _root_.raylib.aliases.Quaternion
//   export _root_.raylib.aliases.RenderTexture2D
//   export _root_.raylib.aliases.SaveFileDataCallback
//   export _root_.raylib.aliases.SaveFileTextCallback
//   export _root_.raylib.aliases.Texture2D
//   export _root_.raylib.aliases.TextureCubemap
//   export _root_.raylib.aliases.TraceLogCallback
//   export _root_.raylib.aliases.va_list
//   export _root_.raylib.structs.AudioStream
//   export _root_.raylib.structs.AutomationEvent
//   export _root_.raylib.structs.AutomationEventList
//   export _root_.raylib.structs.BoneInfo
//   export _root_.raylib.structs.BoundingBox
//   export _root_.raylib.structs.Camera2D
//   export _root_.raylib.structs.Camera3D
//   export _root_.raylib.structs.Color
//   export _root_.raylib.structs.FilePathList
//   export _root_.raylib.structs.Font
//   export _root_.raylib.structs.GlyphInfo
//   export _root_.raylib.structs.Image
//   export _root_.raylib.structs.Material
//   export _root_.raylib.structs.MaterialMap
//   export _root_.raylib.structs.Matrix
//   export _root_.raylib.structs.Mesh
//   export _root_.raylib.structs.Model
//   export _root_.raylib.structs.ModelAnimation
//   export _root_.raylib.structs.Music
//   export _root_.raylib.structs.NPatchInfo
//   export _root_.raylib.structs.Ray
//   export _root_.raylib.structs.RayCollision
//   export _root_.raylib.structs.Rectangle
//   export _root_.raylib.structs.RenderTexture
//   export _root_.raylib.structs.Shader
//   export _root_.raylib.structs.Sound
//   export _root_.raylib.structs.Texture
//   export _root_.raylib.structs.Transform
//   export _root_.raylib.structs.Vector2
//   export _root_.raylib.structs.Vector3
//   export _root_.raylib.structs.Vector4
//   export _root_.raylib.structs.VrDeviceInfo
//   export _root_.raylib.structs.VrStereoConfig
//   export _root_.raylib.structs.Wave
//   export _root_.raylib.structs.float16
//   export _root_.raylib.structs.float3
//   export _root_.raylib.structs.rAudioBuffer
//   export _root_.raylib.structs.rAudioProcessor
//   export _root_.raylib.functions.AttachAudioMixedProcessor
//   export _root_.raylib.functions.BeginBlendMode
//   export _root_.raylib.functions.BeginDrawing
//   export _root_.raylib.functions.BeginScissorMode
//   export _root_.raylib.functions.ChangeDirectory
//   export _root_.raylib.functions.Clamp
//   export _root_.raylib.functions.ClearWindowState
//   export _root_.raylib.functions.CloseAudioDevice
//   export _root_.raylib.functions.CloseWindow
//   export _root_.raylib.functions.CodepointToUTF8
//   export _root_.raylib.functions.CompressData
//   export _root_.raylib.functions.DecodeDataBase64
//   export _root_.raylib.functions.DecompressData
//   export _root_.raylib.functions.DetachAudioMixedProcessor
//   export _root_.raylib.functions.DirectoryExists
//   export _root_.raylib.functions.DisableCursor
//   export _root_.raylib.functions.DisableEventWaiting
//   export _root_.raylib.functions.DrawFPS
//   export _root_.raylib.functions.DrawGrid
//   export _root_.raylib.functions.EnableCursor
//   export _root_.raylib.functions.EnableEventWaiting
//   export _root_.raylib.functions.EncodeDataBase64
//   export _root_.raylib.functions.EndBlendMode
//   export _root_.raylib.functions.EndDrawing
//   export _root_.raylib.functions.EndMode2D
//   export _root_.raylib.functions.EndMode3D
//   export _root_.raylib.functions.EndScissorMode
//   export _root_.raylib.functions.EndShaderMode
//   export _root_.raylib.functions.EndTextureMode
//   export _root_.raylib.functions.EndVrStereoMode
//   export _root_.raylib.functions.ExportDataAsCode
//   export _root_.raylib.functions.FileExists
//   export _root_.raylib.functions.FloatEquals
//   export _root_.raylib.functions.GenMeshTangents
//   export _root_.raylib.functions.GenTextureMipmaps
//   export _root_.raylib.functions.GetApplicationDirectory
//   export _root_.raylib.functions.GetCharPressed
//   export _root_.raylib.functions.GetClipboardText
//   export _root_.raylib.functions.GetCodepoint
//   export _root_.raylib.functions.GetCodepointCount
//   export _root_.raylib.functions.GetCodepointNext
//   export _root_.raylib.functions.GetCodepointPrevious
//   export _root_.raylib.functions.GetCurrentMonitor
//   export _root_.raylib.functions.GetDirectoryPath
//   export _root_.raylib.functions.GetFPS
//   export _root_.raylib.functions.GetFileExtension
//   export _root_.raylib.functions.GetFileLength
//   export _root_.raylib.functions.GetFileModTime
//   export _root_.raylib.functions.GetFileName
//   export _root_.raylib.functions.GetFileNameWithoutExt
//   export _root_.raylib.functions.GetFrameTime
//   export _root_.raylib.functions.GetGamepadAxisCount
//   export _root_.raylib.functions.GetGamepadAxisMovement
//   export _root_.raylib.functions.GetGamepadButtonPressed
//   export _root_.raylib.functions.GetGamepadName
//   export _root_.raylib.functions.GetGestureDetected
//   export _root_.raylib.functions.GetGestureDragAngle
//   export _root_.raylib.functions.GetGestureHoldDuration
//   export _root_.raylib.functions.GetGesturePinchAngle
//   export _root_.raylib.functions.GetKeyPressed
//   export _root_.raylib.functions.GetMasterVolume
//   export _root_.raylib.functions.GetMonitorCount
//   export _root_.raylib.functions.GetMonitorHeight
//   export _root_.raylib.functions.GetMonitorName
//   export _root_.raylib.functions.GetMonitorPhysicalHeight
//   export _root_.raylib.functions.GetMonitorPhysicalWidth
//   export _root_.raylib.functions.GetMonitorRefreshRate
//   export _root_.raylib.functions.GetMonitorWidth
//   export _root_.raylib.functions.GetMouseWheelMove
//   export _root_.raylib.functions.GetMouseX
//   export _root_.raylib.functions.GetMouseY
//   export _root_.raylib.functions.GetPixelDataSize
//   export _root_.raylib.functions.GetPrevDirectoryPath
//   export _root_.raylib.functions.GetRandomValue
//   export _root_.raylib.functions.GetRenderHeight
//   export _root_.raylib.functions.GetRenderWidth
//   export _root_.raylib.functions.GetScreenHeight
//   export _root_.raylib.functions.GetScreenWidth
//   export _root_.raylib.functions.GetTime
//   export _root_.raylib.functions.GetTouchPointCount
//   export _root_.raylib.functions.GetTouchPointId
//   export _root_.raylib.functions.GetTouchX
//   export _root_.raylib.functions.GetTouchY
//   export _root_.raylib.functions.GetWindowHandle
//   export _root_.raylib.functions.GetWorkingDirectory
//   export _root_.raylib.functions.HideCursor
//   export _root_.raylib.functions.ImageAlphaCrop
//   export _root_.raylib.functions.ImageAlphaPremultiply
//   export _root_.raylib.functions.ImageBlurGaussian
//   export _root_.raylib.functions.ImageColorBrightness
//   export _root_.raylib.functions.ImageColorContrast
//   export _root_.raylib.functions.ImageColorGrayscale
//   export _root_.raylib.functions.ImageColorInvert
//   export _root_.raylib.functions.ImageDither
//   export _root_.raylib.functions.ImageFlipHorizontal
//   export _root_.raylib.functions.ImageFlipVertical
//   export _root_.raylib.functions.ImageFormat
//   export _root_.raylib.functions.ImageMipmaps
//   export _root_.raylib.functions.ImageResize
//   export _root_.raylib.functions.ImageResizeNN
//   export _root_.raylib.functions.ImageRotate
//   export _root_.raylib.functions.ImageRotateCCW
//   export _root_.raylib.functions.ImageRotateCW
//   export _root_.raylib.functions.InitAudioDevice
//   export _root_.raylib.functions.InitWindow
//   export _root_.raylib.functions.IsAudioDeviceReady
//   export _root_.raylib.functions.IsCursorHidden
//   export _root_.raylib.functions.IsCursorOnScreen
//   export _root_.raylib.functions.IsFileDropped
//   export _root_.raylib.functions.IsFileExtension
//   export _root_.raylib.functions.IsGamepadAvailable
//   export _root_.raylib.functions.IsGamepadButtonDown
//   export _root_.raylib.functions.IsGamepadButtonPressed
//   export _root_.raylib.functions.IsGamepadButtonReleased
//   export _root_.raylib.functions.IsGamepadButtonUp
//   export _root_.raylib.functions.IsGestureDetected
//   export _root_.raylib.functions.IsKeyDown
//   export _root_.raylib.functions.IsKeyPressed
//   export _root_.raylib.functions.IsKeyPressedRepeat
//   export _root_.raylib.functions.IsKeyReleased
//   export _root_.raylib.functions.IsKeyUp
//   export _root_.raylib.functions.IsMouseButtonDown
//   export _root_.raylib.functions.IsMouseButtonPressed
//   export _root_.raylib.functions.IsMouseButtonReleased
//   export _root_.raylib.functions.IsMouseButtonUp
//   export _root_.raylib.functions.IsPathFile
//   export _root_.raylib.functions.IsWindowFocused
//   export _root_.raylib.functions.IsWindowFullscreen
//   export _root_.raylib.functions.IsWindowHidden
//   export _root_.raylib.functions.IsWindowMaximized
//   export _root_.raylib.functions.IsWindowMinimized
//   export _root_.raylib.functions.IsWindowReady
//   export _root_.raylib.functions.IsWindowResized
//   export _root_.raylib.functions.IsWindowState
//   export _root_.raylib.functions.Lerp
//   export _root_.raylib.functions.LoadCodepoints
//   export _root_.raylib.functions.LoadFileData
//   export _root_.raylib.functions.LoadFileText
//   export _root_.raylib.functions.LoadFontData
//   export _root_.raylib.functions.LoadMaterials
//   export _root_.raylib.functions.LoadModelAnimations
//   export _root_.raylib.functions.LoadRandomSequence
//   export _root_.raylib.functions.LoadUTF8
//   export _root_.raylib.functions.MaximizeWindow
//   export _root_.raylib.functions.MeasureText
//   export _root_.raylib.functions.MemAlloc
//   export _root_.raylib.functions.MemFree
//   export _root_.raylib.functions.MemRealloc
//   export _root_.raylib.functions.MinimizeWindow
//   export _root_.raylib.functions.Normalize
//   export _root_.raylib.functions.OpenURL
//   export _root_.raylib.functions.PollInputEvents
//   export _root_.raylib.functions.Remap
//   export _root_.raylib.functions.RestoreWindow
//   export _root_.raylib.functions.SaveFileData
//   export _root_.raylib.functions.SaveFileText
//   export _root_.raylib.functions.SetAudioStreamBufferSizeDefault
//   export _root_.raylib.functions.SetAutomationEventBaseFrame
//   export _root_.raylib.functions.SetAutomationEventList
//   export _root_.raylib.functions.SetClipboardText
//   export _root_.raylib.functions.SetConfigFlags
//   export _root_.raylib.functions.SetExitKey
//   export _root_.raylib.functions.SetGamepadMappings
//   export _root_.raylib.functions.SetGesturesEnabled
//   export _root_.raylib.functions.SetLoadFileDataCallback
//   export _root_.raylib.functions.SetLoadFileTextCallback
//   export _root_.raylib.functions.SetMasterVolume
//   export _root_.raylib.functions.SetModelMeshMaterial
//   export _root_.raylib.functions.SetMouseCursor
//   export _root_.raylib.functions.SetMouseOffset
//   export _root_.raylib.functions.SetMousePosition
//   export _root_.raylib.functions.SetMouseScale
//   export _root_.raylib.functions.SetRandomSeed
//   export _root_.raylib.functions.SetSaveFileDataCallback
//   export _root_.raylib.functions.SetSaveFileTextCallback
//   export _root_.raylib.functions.SetTargetFPS
//   export _root_.raylib.functions.SetTextLineSpacing
//   export _root_.raylib.functions.SetTraceLogCallback
//   export _root_.raylib.functions.SetTraceLogLevel
//   export _root_.raylib.functions.SetWindowFocused
//   export _root_.raylib.functions.SetWindowIcons
//   export _root_.raylib.functions.SetWindowMaxSize
//   export _root_.raylib.functions.SetWindowMinSize
//   export _root_.raylib.functions.SetWindowMonitor
//   export _root_.raylib.functions.SetWindowOpacity
//   export _root_.raylib.functions.SetWindowPosition
//   export _root_.raylib.functions.SetWindowSize
//   export _root_.raylib.functions.SetWindowState
//   export _root_.raylib.functions.SetWindowTitle
//   export _root_.raylib.functions.ShowCursor
//   export _root_.raylib.functions.StartAutomationEventRecording
//   export _root_.raylib.functions.StopAutomationEventRecording
//   export _root_.raylib.functions.SwapScreenBuffer
//   export _root_.raylib.functions.TakeScreenshot
//   export _root_.raylib.functions.TextAppend
//   export _root_.raylib.functions.TextCopy
//   export _root_.raylib.functions.TextFindIndex
//   export _root_.raylib.functions.TextFormat
//   export _root_.raylib.functions.TextInsert
//   export _root_.raylib.functions.TextIsEqual
//   export _root_.raylib.functions.TextJoin
//   export _root_.raylib.functions.TextLength
//   export _root_.raylib.functions.TextReplace
//   export _root_.raylib.functions.TextSplit
//   export _root_.raylib.functions.TextSubtext
//   export _root_.raylib.functions.TextToInteger
//   export _root_.raylib.functions.TextToLower
//   export _root_.raylib.functions.TextToPascal
//   export _root_.raylib.functions.TextToUpper
//   export _root_.raylib.functions.ToggleBorderlessWindowed
//   export _root_.raylib.functions.ToggleFullscreen
//   export _root_.raylib.functions.TraceLog
//   export _root_.raylib.functions.UnloadAutomationEventList
//   export _root_.raylib.functions.UnloadCodepoints
//   export _root_.raylib.functions.UnloadFileData
//   export _root_.raylib.functions.UnloadFileText
//   export _root_.raylib.functions.UnloadFontData
//   export _root_.raylib.functions.UnloadImageColors
//   export _root_.raylib.functions.UnloadImagePalette
//   export _root_.raylib.functions.UnloadModelAnimations
//   export _root_.raylib.functions.UnloadRandomSequence
//   export _root_.raylib.functions.UnloadUTF8
//   export _root_.raylib.functions.UnloadWaveSamples
//   export _root_.raylib.functions.UpdateCamera
//   export _root_.raylib.functions.UploadMesh
//   export _root_.raylib.functions.Vector3OrthoNormalize
//   export _root_.raylib.functions.WaitTime
//   export _root_.raylib.functions.WaveCrop
//   export _root_.raylib.functions.WaveFormat
//   export _root_.raylib.functions.WindowShouldClose
//   export _root_.raylib.functions.Wrap
//   export _root_.raylib.functions.AttachAudioStreamProcessor
//   export _root_.raylib.functions.BeginMode2D
//   export _root_.raylib.functions.BeginMode3D
//   export _root_.raylib.functions.BeginShaderMode
//   export _root_.raylib.functions.BeginTextureMode
//   export _root_.raylib.functions.BeginVrStereoMode
//   export _root_.raylib.functions.CheckCollisionBoxSphere
//   export _root_.raylib.functions.CheckCollisionBoxes
//   export _root_.raylib.functions.CheckCollisionCircleRec
//   export _root_.raylib.functions.CheckCollisionCircles
//   export _root_.raylib.functions.CheckCollisionLines
//   export _root_.raylib.functions.CheckCollisionPointCircle
//   export _root_.raylib.functions.CheckCollisionPointLine
//   export _root_.raylib.functions.CheckCollisionPointPoly
//   export _root_.raylib.functions.CheckCollisionPointRec
//   export _root_.raylib.functions.CheckCollisionPointTriangle
//   export _root_.raylib.functions.CheckCollisionRecs
//   export _root_.raylib.functions.CheckCollisionSpheres
//   export _root_.raylib.functions.ClearBackground
//   export _root_.raylib.functions.ColorAlpha
//   export _root_.raylib.functions.ColorAlphaBlend
//   export _root_.raylib.functions.ColorBrightness
//   export _root_.raylib.functions.ColorContrast
//   export _root_.raylib.functions.ColorFromHSV
//   export _root_.raylib.functions.ColorFromNormalized
//   export _root_.raylib.functions.ColorNormalize
//   export _root_.raylib.functions.ColorTint
//   export _root_.raylib.functions.ColorToHSV
//   export _root_.raylib.functions.ColorToInt
//   export _root_.raylib.functions.DetachAudioStreamProcessor
//   export _root_.raylib.functions.DrawBillboard
//   export _root_.raylib.functions.DrawBillboardPro
//   export _root_.raylib.functions.DrawBillboardRec
//   export _root_.raylib.functions.DrawBoundingBox
//   export _root_.raylib.functions.DrawCapsule
//   export _root_.raylib.functions.DrawCapsuleWires
//   export _root_.raylib.functions.DrawCircle
//   export _root_.raylib.functions.DrawCircle3D
//   export _root_.raylib.functions.DrawCircleGradient
//   export _root_.raylib.functions.DrawCircleLines
//   export _root_.raylib.functions.DrawCircleLinesV
//   export _root_.raylib.functions.DrawCircleSector
//   export _root_.raylib.functions.DrawCircleSectorLines
//   export _root_.raylib.functions.DrawCircleV
//   export _root_.raylib.functions.DrawCube
//   export _root_.raylib.functions.DrawCubeV
//   export _root_.raylib.functions.DrawCubeWires
//   export _root_.raylib.functions.DrawCubeWiresV
//   export _root_.raylib.functions.DrawCylinder
//   export _root_.raylib.functions.DrawCylinderEx
//   export _root_.raylib.functions.DrawCylinderWires
//   export _root_.raylib.functions.DrawCylinderWiresEx
//   export _root_.raylib.functions.DrawEllipse
//   export _root_.raylib.functions.DrawEllipseLines
//   export _root_.raylib.functions.DrawLine
//   export _root_.raylib.functions.DrawLine3D
//   export _root_.raylib.functions.DrawLineBezier
//   export _root_.raylib.functions.DrawLineEx
//   export _root_.raylib.functions.DrawLineStrip
//   export _root_.raylib.functions.DrawLineV
//   export _root_.raylib.functions.DrawMesh
//   export _root_.raylib.functions.DrawMeshInstanced
//   export _root_.raylib.functions.DrawModel
//   export _root_.raylib.functions.DrawModelEx
//   export _root_.raylib.functions.DrawModelWires
//   export _root_.raylib.functions.DrawModelWiresEx
//   export _root_.raylib.functions.DrawPixel
//   export _root_.raylib.functions.DrawPixelV
//   export _root_.raylib.functions.DrawPlane
//   export _root_.raylib.functions.DrawPoint3D
//   export _root_.raylib.functions.DrawPoly
//   export _root_.raylib.functions.DrawPolyLines
//   export _root_.raylib.functions.DrawPolyLinesEx
//   export _root_.raylib.functions.DrawRay
//   export _root_.raylib.functions.DrawRectangle
//   export _root_.raylib.functions.DrawRectangleGradientEx
//   export _root_.raylib.functions.DrawRectangleGradientH
//   export _root_.raylib.functions.DrawRectangleGradientV
//   export _root_.raylib.functions.DrawRectangleLines
//   export _root_.raylib.functions.DrawRectangleLinesEx
//   export _root_.raylib.functions.DrawRectanglePro
//   export _root_.raylib.functions.DrawRectangleRec
//   export _root_.raylib.functions.DrawRectangleRounded
//   export _root_.raylib.functions.DrawRectangleRoundedLines
//   export _root_.raylib.functions.DrawRectangleV
//   export _root_.raylib.functions.DrawRing
//   export _root_.raylib.functions.DrawRingLines
//   export _root_.raylib.functions.DrawSphere
//   export _root_.raylib.functions.DrawSphereEx
//   export _root_.raylib.functions.DrawSphereWires
//   export _root_.raylib.functions.DrawSplineBasis
//   export _root_.raylib.functions.DrawSplineBezierCubic
//   export _root_.raylib.functions.DrawSplineBezierQuadratic
//   export _root_.raylib.functions.DrawSplineCatmullRom
//   export _root_.raylib.functions.DrawSplineLinear
//   export _root_.raylib.functions.DrawSplineSegmentBasis
//   export _root_.raylib.functions.DrawSplineSegmentBezierCubic
//   export _root_.raylib.functions.DrawSplineSegmentBezierQuadratic
//   export _root_.raylib.functions.DrawSplineSegmentCatmullRom
//   export _root_.raylib.functions.DrawSplineSegmentLinear
//   export _root_.raylib.functions.DrawText
//   export _root_.raylib.functions.DrawTextCodepoint
//   export _root_.raylib.functions.DrawTextCodepoints
//   export _root_.raylib.functions.DrawTextEx
//   export _root_.raylib.functions.DrawTextPro
//   export _root_.raylib.functions.DrawTexture
//   export _root_.raylib.functions.DrawTextureEx
//   export _root_.raylib.functions.DrawTextureNPatch
//   export _root_.raylib.functions.DrawTexturePro
//   export _root_.raylib.functions.DrawTextureRec
//   export _root_.raylib.functions.DrawTextureV
//   export _root_.raylib.functions.DrawTriangle
//   export _root_.raylib.functions.DrawTriangle3D
//   export _root_.raylib.functions.DrawTriangleFan
//   export _root_.raylib.functions.DrawTriangleLines
//   export _root_.raylib.functions.DrawTriangleStrip
//   export _root_.raylib.functions.DrawTriangleStrip3D
//   export _root_.raylib.functions.ExportAutomationEventList
//   export _root_.raylib.functions.ExportFontAsCode
//   export _root_.raylib.functions.ExportImage
//   export _root_.raylib.functions.ExportImageAsCode
//   export _root_.raylib.functions.ExportImageToMemory
//   export _root_.raylib.functions.ExportMesh
//   export _root_.raylib.functions.ExportWave
//   export _root_.raylib.functions.ExportWaveAsCode
//   export _root_.raylib.functions.Fade
//   export _root_.raylib.functions.GenImageCellular
//   export _root_.raylib.functions.GenImageChecked
//   export _root_.raylib.functions.GenImageColor
//   export _root_.raylib.functions.GenImageFontAtlas
//   export _root_.raylib.functions.GenImageGradientLinear
//   export _root_.raylib.functions.GenImageGradientRadial
//   export _root_.raylib.functions.GenImageGradientSquare
//   export _root_.raylib.functions.GenImagePerlinNoise
//   export _root_.raylib.functions.GenImageText
//   export _root_.raylib.functions.GenImageWhiteNoise
//   export _root_.raylib.functions.GenMeshCone
//   export _root_.raylib.functions.GenMeshCube
//   export _root_.raylib.functions.GenMeshCubicmap
//   export _root_.raylib.functions.GenMeshCylinder
//   export _root_.raylib.functions.GenMeshHeightmap
//   export _root_.raylib.functions.GenMeshHemiSphere
//   export _root_.raylib.functions.GenMeshKnot
//   export _root_.raylib.functions.GenMeshPlane
//   export _root_.raylib.functions.GenMeshPoly
//   export _root_.raylib.functions.GenMeshSphere
//   export _root_.raylib.functions.GenMeshTorus
//   export _root_.raylib.functions.GetCameraMatrix
//   export _root_.raylib.functions.GetCameraMatrix2D
//   export _root_.raylib.functions.GetCollisionRec
//   export _root_.raylib.functions.GetColor
//   export _root_.raylib.functions.GetFontDefault
//   export _root_.raylib.functions.GetGestureDragVector
//   export _root_.raylib.functions.GetGesturePinchVector
//   export _root_.raylib.functions.GetGlyphAtlasRec
//   export _root_.raylib.functions.GetGlyphIndex
//   export _root_.raylib.functions.GetGlyphInfo
//   export _root_.raylib.functions.GetImageAlphaBorder
//   export _root_.raylib.functions.GetImageColor
//   export _root_.raylib.functions.GetMeshBoundingBox
//   export _root_.raylib.functions.GetModelBoundingBox
//   export _root_.raylib.functions.GetMonitorPosition
//   export _root_.raylib.functions.GetMouseDelta
//   export _root_.raylib.functions.GetMousePosition
//   export _root_.raylib.functions.GetMouseRay
//   export _root_.raylib.functions.GetMouseWheelMoveV
//   export _root_.raylib.functions.GetMusicTimeLength
//   export _root_.raylib.functions.GetMusicTimePlayed
//   export _root_.raylib.functions.GetPixelColor
//   export _root_.raylib.functions.GetRayCollisionBox
//   export _root_.raylib.functions.GetRayCollisionMesh
//   export _root_.raylib.functions.GetRayCollisionQuad
//   export _root_.raylib.functions.GetRayCollisionSphere
//   export _root_.raylib.functions.GetRayCollisionTriangle
//   export _root_.raylib.functions.GetScreenToWorld2D
//   export _root_.raylib.functions.GetShaderLocation
//   export _root_.raylib.functions.GetShaderLocationAttrib
//   export _root_.raylib.functions.GetSplinePointBasis
//   export _root_.raylib.functions.GetSplinePointBezierCubic
//   export _root_.raylib.functions.GetSplinePointBezierQuad
//   export _root_.raylib.functions.GetSplinePointCatmullRom
//   export _root_.raylib.functions.GetSplinePointLinear
//   export _root_.raylib.functions.GetTouchPosition
//   export _root_.raylib.functions.GetWindowPosition
//   export _root_.raylib.functions.GetWindowScaleDPI
//   export _root_.raylib.functions.GetWorldToScreen
//   export _root_.raylib.functions.GetWorldToScreen2D
//   export _root_.raylib.functions.GetWorldToScreenEx
//   export _root_.raylib.functions.ImageAlphaClear
//   export _root_.raylib.functions.ImageAlphaMask
//   export _root_.raylib.functions.ImageClearBackground
//   export _root_.raylib.functions.ImageColorReplace
//   export _root_.raylib.functions.ImageColorTint
//   export _root_.raylib.functions.ImageCopy
//   export _root_.raylib.functions.ImageCrop
//   export _root_.raylib.functions.ImageDraw
//   export _root_.raylib.functions.ImageDrawCircle
//   export _root_.raylib.functions.ImageDrawCircleLines
//   export _root_.raylib.functions.ImageDrawCircleLinesV
//   export _root_.raylib.functions.ImageDrawCircleV
//   export _root_.raylib.functions.ImageDrawLine
//   export _root_.raylib.functions.ImageDrawLineV
//   export _root_.raylib.functions.ImageDrawPixel
//   export _root_.raylib.functions.ImageDrawPixelV
//   export _root_.raylib.functions.ImageDrawRectangle
//   export _root_.raylib.functions.ImageDrawRectangleLines
//   export _root_.raylib.functions.ImageDrawRectangleRec
//   export _root_.raylib.functions.ImageDrawRectangleV
//   export _root_.raylib.functions.ImageDrawText
//   export _root_.raylib.functions.ImageDrawTextEx
//   export _root_.raylib.functions.ImageFromImage
//   export _root_.raylib.functions.ImageResizeCanvas
//   export _root_.raylib.functions.ImageText
//   export _root_.raylib.functions.ImageTextEx
//   export _root_.raylib.functions.ImageToPOT
//   export _root_.raylib.functions.IsAudioStreamPlaying
//   export _root_.raylib.functions.IsAudioStreamProcessed
//   export _root_.raylib.functions.IsAudioStreamReady
//   export _root_.raylib.functions.IsFontReady
//   export _root_.raylib.functions.IsImageReady
//   export _root_.raylib.functions.IsMaterialReady
//   export _root_.raylib.functions.IsModelAnimationValid
//   export _root_.raylib.functions.IsModelReady
//   export _root_.raylib.functions.IsMusicReady
//   export _root_.raylib.functions.IsMusicStreamPlaying
//   export _root_.raylib.functions.IsRenderTextureReady
//   export _root_.raylib.functions.IsShaderReady
//   export _root_.raylib.functions.IsSoundPlaying
//   export _root_.raylib.functions.IsSoundReady
//   export _root_.raylib.functions.IsTextureReady
//   export _root_.raylib.functions.IsWaveReady
//   export _root_.raylib.functions.LoadAudioStream
//   export _root_.raylib.functions.LoadAutomationEventList
//   export _root_.raylib.functions.LoadDirectoryFiles
//   export _root_.raylib.functions.LoadDirectoryFilesEx
//   export _root_.raylib.functions.LoadDroppedFiles
//   export _root_.raylib.functions.LoadFont
//   export _root_.raylib.functions.LoadFontEx
//   export _root_.raylib.functions.LoadFontFromImage
//   export _root_.raylib.functions.LoadFontFromMemory
//   export _root_.raylib.functions.LoadImage
//   export _root_.raylib.functions.LoadImageAnim
//   export _root_.raylib.functions.LoadImageColors
//   export _root_.raylib.functions.LoadImageFromMemory
//   export _root_.raylib.functions.LoadImageFromScreen
//   export _root_.raylib.functions.LoadImageFromTexture
//   export _root_.raylib.functions.LoadImagePalette
//   export _root_.raylib.functions.LoadImageRaw
//   export _root_.raylib.functions.LoadImageSvg
//   export _root_.raylib.functions.LoadMaterialDefault
//   export _root_.raylib.functions.LoadModel
//   export _root_.raylib.functions.LoadModelFromMesh
//   export _root_.raylib.functions.LoadMusicStream
//   export _root_.raylib.functions.LoadMusicStreamFromMemory
//   export _root_.raylib.functions.LoadRenderTexture
//   export _root_.raylib.functions.LoadShader
//   export _root_.raylib.functions.LoadShaderFromMemory
//   export _root_.raylib.functions.LoadSound
//   export _root_.raylib.functions.LoadSoundAlias
//   export _root_.raylib.functions.LoadSoundFromWave
//   export _root_.raylib.functions.LoadTexture
//   export _root_.raylib.functions.LoadTextureCubemap
//   export _root_.raylib.functions.LoadTextureFromImage
//   export _root_.raylib.functions.LoadVrStereoConfig
//   export _root_.raylib.functions.LoadWave
//   export _root_.raylib.functions.LoadWaveFromMemory
//   export _root_.raylib.functions.LoadWaveSamples
//   export _root_.raylib.functions.MatrixAdd
//   export _root_.raylib.functions.MatrixDeterminant
//   export _root_.raylib.functions.MatrixFrustum
//   export _root_.raylib.functions.MatrixIdentity
//   export _root_.raylib.functions.MatrixInvert
//   export _root_.raylib.functions.MatrixLookAt
//   export _root_.raylib.functions.MatrixMultiply
//   export _root_.raylib.functions.MatrixOrtho
//   export _root_.raylib.functions.MatrixPerspective
//   export _root_.raylib.functions.MatrixRotate
//   export _root_.raylib.functions.MatrixRotateX
//   export _root_.raylib.functions.MatrixRotateXYZ
//   export _root_.raylib.functions.MatrixRotateY
//   export _root_.raylib.functions.MatrixRotateZ
//   export _root_.raylib.functions.MatrixRotateZYX
//   export _root_.raylib.functions.MatrixScale
//   export _root_.raylib.functions.MatrixSubtract
//   export _root_.raylib.functions.MatrixToFloatV
//   export _root_.raylib.functions.MatrixTrace
//   export _root_.raylib.functions.MatrixTranslate
//   export _root_.raylib.functions.MatrixTranspose
//   export _root_.raylib.functions.MeasureTextEx
//   export _root_.raylib.functions.PauseAudioStream
//   export _root_.raylib.functions.PauseMusicStream
//   export _root_.raylib.functions.PauseSound
//   export _root_.raylib.functions.PlayAudioStream
//   export _root_.raylib.functions.PlayAutomationEvent
//   export _root_.raylib.functions.PlayMusicStream
//   export _root_.raylib.functions.PlaySound
//   export _root_.raylib.functions.QuaternionAdd
//   export _root_.raylib.functions.QuaternionAddValue
//   export _root_.raylib.functions.QuaternionDivide
//   export _root_.raylib.functions.QuaternionEquals
//   export _root_.raylib.functions.QuaternionFromAxisAngle
//   export _root_.raylib.functions.QuaternionFromEuler
//   export _root_.raylib.functions.QuaternionFromMatrix
//   export _root_.raylib.functions.QuaternionFromVector3ToVector3
//   export _root_.raylib.functions.QuaternionIdentity
//   export _root_.raylib.functions.QuaternionInvert
//   export _root_.raylib.functions.QuaternionLength
//   export _root_.raylib.functions.QuaternionLerp
//   export _root_.raylib.functions.QuaternionMultiply
//   export _root_.raylib.functions.QuaternionNlerp
//   export _root_.raylib.functions.QuaternionNormalize
//   export _root_.raylib.functions.QuaternionScale
//   export _root_.raylib.functions.QuaternionSlerp
//   export _root_.raylib.functions.QuaternionSubtract
//   export _root_.raylib.functions.QuaternionSubtractValue
//   export _root_.raylib.functions.QuaternionToAxisAngle
//   export _root_.raylib.functions.QuaternionToEuler
//   export _root_.raylib.functions.QuaternionToMatrix
//   export _root_.raylib.functions.QuaternionTransform
//   export _root_.raylib.functions.ResumeAudioStream
//   export _root_.raylib.functions.ResumeMusicStream
//   export _root_.raylib.functions.ResumeSound
//   export _root_.raylib.functions.SeekMusicStream
//   export _root_.raylib.functions.SetAudioStreamCallback
//   export _root_.raylib.functions.SetAudioStreamPan
//   export _root_.raylib.functions.SetAudioStreamPitch
//   export _root_.raylib.functions.SetAudioStreamVolume
//   export _root_.raylib.functions.SetMaterialTexture
//   export _root_.raylib.functions.SetMusicPan
//   export _root_.raylib.functions.SetMusicPitch
//   export _root_.raylib.functions.SetMusicVolume
//   export _root_.raylib.functions.SetPixelColor
//   export _root_.raylib.functions.SetShaderValue
//   export _root_.raylib.functions.SetShaderValueMatrix
//   export _root_.raylib.functions.SetShaderValueTexture
//   export _root_.raylib.functions.SetShaderValueV
//   export _root_.raylib.functions.SetShapesTexture
//   export _root_.raylib.functions.SetSoundPan
//   export _root_.raylib.functions.SetSoundPitch
//   export _root_.raylib.functions.SetSoundVolume
//   export _root_.raylib.functions.SetTextureFilter
//   export _root_.raylib.functions.SetTextureWrap
//   export _root_.raylib.functions.SetWindowIcon
//   export _root_.raylib.functions.StopAudioStream
//   export _root_.raylib.functions.StopMusicStream
//   export _root_.raylib.functions.StopSound
//   export _root_.raylib.functions.UnloadAudioStream
//   export _root_.raylib.functions.UnloadDirectoryFiles
//   export _root_.raylib.functions.UnloadDroppedFiles
//   export _root_.raylib.functions.UnloadFont
//   export _root_.raylib.functions.UnloadImage
//   export _root_.raylib.functions.UnloadMaterial
//   export _root_.raylib.functions.UnloadMesh
//   export _root_.raylib.functions.UnloadModel
//   export _root_.raylib.functions.UnloadModelAnimation
//   export _root_.raylib.functions.UnloadMusicStream
//   export _root_.raylib.functions.UnloadRenderTexture
//   export _root_.raylib.functions.UnloadShader
//   export _root_.raylib.functions.UnloadSound
//   export _root_.raylib.functions.UnloadSoundAlias
//   export _root_.raylib.functions.UnloadTexture
//   export _root_.raylib.functions.UnloadVrStereoConfig
//   export _root_.raylib.functions.UnloadWave
//   export _root_.raylib.functions.UpdateAudioStream
//   export _root_.raylib.functions.UpdateCameraPro
//   export _root_.raylib.functions.UpdateMeshBuffer
//   export _root_.raylib.functions.UpdateModelAnimation
//   export _root_.raylib.functions.UpdateMusicStream
//   export _root_.raylib.functions.UpdateSound
//   export _root_.raylib.functions.UpdateTexture
//   export _root_.raylib.functions.UpdateTextureRec
//   export _root_.raylib.functions.Vector2Add
//   export _root_.raylib.functions.Vector2AddValue
//   export _root_.raylib.functions.Vector2Angle
//   export _root_.raylib.functions.Vector2Clamp
//   export _root_.raylib.functions.Vector2ClampValue
//   export _root_.raylib.functions.Vector2Distance
//   export _root_.raylib.functions.Vector2DistanceSqr
//   export _root_.raylib.functions.Vector2Divide
//   export _root_.raylib.functions.Vector2DotProduct
//   export _root_.raylib.functions.Vector2Equals
//   export _root_.raylib.functions.Vector2Invert
//   export _root_.raylib.functions.Vector2Length
//   export _root_.raylib.functions.Vector2LengthSqr
//   export _root_.raylib.functions.Vector2Lerp
//   export _root_.raylib.functions.Vector2LineAngle
//   export _root_.raylib.functions.Vector2MoveTowards
//   export _root_.raylib.functions.Vector2Multiply
//   export _root_.raylib.functions.Vector2Negate
//   export _root_.raylib.functions.Vector2Normalize
//   export _root_.raylib.functions.Vector2One
//   export _root_.raylib.functions.Vector2Reflect
//   export _root_.raylib.functions.Vector2Rotate
//   export _root_.raylib.functions.Vector2Scale
//   export _root_.raylib.functions.Vector2Subtract
//   export _root_.raylib.functions.Vector2SubtractValue
//   export _root_.raylib.functions.Vector2Transform
//   export _root_.raylib.functions.Vector2Zero
//   export _root_.raylib.functions.Vector3Add
//   export _root_.raylib.functions.Vector3AddValue
//   export _root_.raylib.functions.Vector3Angle
//   export _root_.raylib.functions.Vector3Barycenter
//   export _root_.raylib.functions.Vector3Clamp
//   export _root_.raylib.functions.Vector3ClampValue
//   export _root_.raylib.functions.Vector3CrossProduct
//   export _root_.raylib.functions.Vector3Distance
//   export _root_.raylib.functions.Vector3DistanceSqr
//   export _root_.raylib.functions.Vector3Divide
//   export _root_.raylib.functions.Vector3DotProduct
//   export _root_.raylib.functions.Vector3Equals
//   export _root_.raylib.functions.Vector3Invert
//   export _root_.raylib.functions.Vector3Length
//   export _root_.raylib.functions.Vector3LengthSqr
//   export _root_.raylib.functions.Vector3Lerp
//   export _root_.raylib.functions.Vector3Max
//   export _root_.raylib.functions.Vector3Min
//   export _root_.raylib.functions.Vector3Multiply
//   export _root_.raylib.functions.Vector3Negate
//   export _root_.raylib.functions.Vector3Normalize
//   export _root_.raylib.functions.Vector3One
//   export _root_.raylib.functions.Vector3Perpendicular
//   export _root_.raylib.functions.Vector3Project
//   export _root_.raylib.functions.Vector3Reflect
//   export _root_.raylib.functions.Vector3Refract
//   export _root_.raylib.functions.Vector3Reject
//   export _root_.raylib.functions.Vector3RotateByAxisAngle
//   export _root_.raylib.functions.Vector3RotateByQuaternion
//   export _root_.raylib.functions.Vector3Scale
//   export _root_.raylib.functions.Vector3Subtract
//   export _root_.raylib.functions.Vector3SubtractValue
//   export _root_.raylib.functions.Vector3ToFloatV
//   export _root_.raylib.functions.Vector3Transform
//   export _root_.raylib.functions.Vector3Unproject
//   export _root_.raylib.functions.Vector3Zero
//   export _root_.raylib.functions.WaveCopy
// end all
