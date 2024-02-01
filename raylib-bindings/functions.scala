package raylib

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def AttachAudioMixedProcessor(processor: AudioCallback): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def BeginBlendMode(mode: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def BeginDrawing(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def BeginScissorMode(
    x: CInt,
    y: CInt,
    width: CInt,
    height: CInt
): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ChangeDirectory(dir: CString): Boolean = extern

/** [bindgen] header: ./raylib/src/raymath.h
  */
@extern def Clamp(value: Float, min: Float, max: Float): Float = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ClearWindowState(flags: CUnsignedInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def CloseAudioDevice(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def CloseWindow(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def CodepointToUTF8(codepoint: CInt, utf8Size: Ptr[CInt]): CString =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def CompressData(
    data: Ptr[CUnsignedChar],
    dataSize: CInt,
    compDataSize: Ptr[CInt]
): Ptr[CUnsignedChar] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def DecodeDataBase64(
    data: Ptr[CUnsignedChar],
    outputSize: Ptr[CInt]
): Ptr[CUnsignedChar] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def DecompressData(
    compData: Ptr[CUnsignedChar],
    compDataSize: CInt,
    dataSize: Ptr[CInt]
): Ptr[CUnsignedChar] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def DetachAudioMixedProcessor(processor: AudioCallback): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def DirectoryExists(dirPath: CString): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def DisableCursor(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def DisableEventWaiting(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def DrawFPS(posX: CInt, posY: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def DrawGrid(slices: CInt, spacing: Float): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def EnableCursor(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def EnableEventWaiting(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def EncodeDataBase64(
    data: Ptr[CUnsignedChar],
    dataSize: CInt,
    outputSize: Ptr[CInt]
): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def EndBlendMode(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def EndDrawing(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def EndMode2D(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def EndMode3D(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def EndScissorMode(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def EndShaderMode(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def EndTextureMode(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def EndVrStereoMode(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ExportDataAsCode(
    data: Ptr[CUnsignedChar],
    dataSize: CInt,
    fileName: CString
): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def FileExists(fileName: CString): Boolean = extern

/** [bindgen] header: ./raylib/src/raymath.h
  */
@extern def FloatEquals(x: Float, y: Float): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GenMeshTangents(mesh: Ptr[Mesh]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GenTextureMipmaps(texture: Ptr[Texture2D]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetApplicationDirectory(): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetCharPressed(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetClipboardText(): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetCodepoint(text: CString, codepointSize: Ptr[CInt]): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetCodepointCount(text: CString): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetCodepointNext(text: CString, codepointSize: Ptr[CInt]): CInt =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetCodepointPrevious(
    text: CString,
    codepointSize: Ptr[CInt]
): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetCurrentMonitor(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetDirectoryPath(filePath: CString): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetFPS(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetFileExtension(fileName: CString): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetFileLength(fileName: CString): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetFileModTime(fileName: CString): CLongInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetFileName(filePath: CString): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetFileNameWithoutExt(filePath: CString): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetFrameTime(): Float = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetGamepadAxisCount(gamepad: CInt): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetGamepadAxisMovement(gamepad: CInt, axis: CInt): Float = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetGamepadButtonPressed(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetGamepadName(gamepad: CInt): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetGestureDetected(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetGestureDragAngle(): Float = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetGestureHoldDuration(): Float = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetGesturePinchAngle(): Float = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetKeyPressed(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetMasterVolume(): Float = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetMonitorCount(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetMonitorHeight(monitor: CInt): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetMonitorName(monitor: CInt): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetMonitorPhysicalHeight(monitor: CInt): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetMonitorPhysicalWidth(monitor: CInt): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetMonitorRefreshRate(monitor: CInt): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetMonitorWidth(monitor: CInt): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetMouseWheelMove(): Float = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetMouseX(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetMouseY(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetPixelDataSize(width: CInt, height: CInt, format: CInt): CInt =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetPrevDirectoryPath(dirPath: CString): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetRandomValue(min: CInt, max: CInt): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetRenderHeight(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetRenderWidth(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetScreenHeight(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetScreenWidth(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetTime(): Double = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetTouchPointCount(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetTouchPointId(index: CInt): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetTouchX(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetTouchY(): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetWindowHandle(): Ptr[Byte] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def GetWorkingDirectory(): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def HideCursor(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageAlphaCrop(image: Ptr[Image], threshold: Float): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageAlphaPremultiply(image: Ptr[Image]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageBlurGaussian(image: Ptr[Image], blurSize: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageColorBrightness(image: Ptr[Image], brightness: CInt): Unit =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageColorContrast(image: Ptr[Image], contrast: Float): Unit =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageColorGrayscale(image: Ptr[Image]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageColorInvert(image: Ptr[Image]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageDither(
    image: Ptr[Image],
    rBpp: CInt,
    gBpp: CInt,
    bBpp: CInt,
    aBpp: CInt
): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageFlipHorizontal(image: Ptr[Image]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageFlipVertical(image: Ptr[Image]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageFormat(image: Ptr[Image], newFormat: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageMipmaps(image: Ptr[Image]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageResize(
    image: Ptr[Image],
    newWidth: CInt,
    newHeight: CInt
): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageResizeNN(
    image: Ptr[Image],
    newWidth: CInt,
    newHeight: CInt
): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageRotate(image: Ptr[Image], degrees: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageRotateCCW(image: Ptr[Image]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ImageRotateCW(image: Ptr[Image]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def InitAudioDevice(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def InitWindow(width: CInt, height: CInt, title: CString): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsAudioDeviceReady(): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsCursorHidden(): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsCursorOnScreen(): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsFileDropped(): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsFileExtension(fileName: CString, ext: CString): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsGamepadAvailable(gamepad: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsGamepadButtonDown(gamepad: CInt, button: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsGamepadButtonPressed(gamepad: CInt, button: CInt): Boolean =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsGamepadButtonReleased(gamepad: CInt, button: CInt): Boolean =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsGamepadButtonUp(gamepad: CInt, button: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsGestureDetected(gesture: CUnsignedInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsKeyDown(key: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsKeyPressed(key: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsKeyPressedRepeat(key: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsKeyReleased(key: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsKeyUp(key: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsMouseButtonDown(button: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsMouseButtonPressed(button: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsMouseButtonReleased(button: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsMouseButtonUp(button: CInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsPathFile(path: CString): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsWindowFocused(): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsWindowFullscreen(): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsWindowHidden(): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsWindowMaximized(): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsWindowMinimized(): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsWindowReady(): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsWindowResized(): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def IsWindowState(flag: CUnsignedInt): Boolean = extern

/** [bindgen] header: ./raylib/src/raymath.h
  */
@extern def Lerp(start: Float, end: Float, amount: Float): Float = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def LoadCodepoints(text: CString, count: Ptr[CInt]): Ptr[CInt] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def LoadFileData(
    fileName: CString,
    dataSize: Ptr[CInt]
): Ptr[CUnsignedChar] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def LoadFileText(fileName: CString): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def LoadFontData(
    fileData: Ptr[CUnsignedChar],
    dataSize: CInt,
    fontSize: CInt,
    codepoints: Ptr[CInt],
    codepointCount: CInt,
    `type`: CInt
): Ptr[GlyphInfo] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def LoadMaterials(
    fileName: CString,
    materialCount: Ptr[CInt]
): Ptr[Material] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def LoadModelAnimations(
    fileName: CString,
    animCount: Ptr[CInt]
): Ptr[ModelAnimation] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def LoadRandomSequence(
    count: CUnsignedInt,
    min: CInt,
    max: CInt
): Ptr[CInt] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def LoadUTF8(codepoints: Ptr[CInt], length: CInt): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def MaximizeWindow(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def MeasureText(text: CString, fontSize: CInt): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def MemAlloc(size: CUnsignedInt): Ptr[Byte] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def MemFree(ptr: Ptr[Byte]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def MemRealloc(ptr: Ptr[Byte], size: CUnsignedInt): Ptr[Byte] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def MinimizeWindow(): Unit = extern

/** [bindgen] header: ./raylib/src/raymath.h
  */
@extern def Normalize(value: Float, start: Float, end: Float): Float = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def OpenURL(url: CString): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def PollInputEvents(): Unit = extern

/** [bindgen] header: ./raylib/src/raymath.h
  */
@extern def Remap(
    value: Float,
    inputStart: Float,
    inputEnd: Float,
    outputStart: Float,
    outputEnd: Float
): Float = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def RestoreWindow(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SaveFileData(
    fileName: CString,
    data: Ptr[Byte],
    dataSize: CInt
): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SaveFileText(fileName: CString, text: CString): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetAudioStreamBufferSizeDefault(size: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetAutomationEventBaseFrame(frame: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetAutomationEventList(list: Ptr[AutomationEventList]): Unit =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetClipboardText(text: CString): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetConfigFlags(flags: CUnsignedInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetExitKey(key: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetGamepadMappings(mappings: CString): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetGesturesEnabled(flags: CUnsignedInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetLoadFileDataCallback(callback: LoadFileDataCallback): Unit =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetLoadFileTextCallback(callback: LoadFileTextCallback): Unit =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetMasterVolume(volume: Float): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetModelMeshMaterial(
    model: Ptr[Model],
    meshId: CInt,
    materialId: CInt
): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetMouseCursor(cursor: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetMouseOffset(offsetX: CInt, offsetY: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetMousePosition(x: CInt, y: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetMouseScale(scaleX: Float, scaleY: Float): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetRandomSeed(seed: CUnsignedInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetSaveFileDataCallback(callback: SaveFileDataCallback): Unit =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetSaveFileTextCallback(callback: SaveFileTextCallback): Unit =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetTargetFPS(fps: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetTextLineSpacing(spacing: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetTraceLogCallback(callback: TraceLogCallback): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetTraceLogLevel(logLevel: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetWindowFocused(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetWindowIcons(images: Ptr[Image], count: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetWindowMaxSize(width: CInt, height: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetWindowMinSize(width: CInt, height: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetWindowMonitor(monitor: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetWindowOpacity(opacity: Float): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetWindowPosition(x: CInt, y: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetWindowSize(width: CInt, height: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetWindowState(flags: CUnsignedInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SetWindowTitle(title: CString): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ShowCursor(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def StartAutomationEventRecording(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def StopAutomationEventRecording(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def SwapScreenBuffer(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TakeScreenshot(fileName: CString): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextAppend(
    text: CString,
    append: CString,
    position: Ptr[CInt]
): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextCopy(dst: CString, src: CString): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextFindIndex(text: CString, find: CString): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextFormat(text: CString, rest: Any*): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextInsert(
    text: CString,
    insert: CString,
    position: CInt
): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextIsEqual(text1: CString, text2: CString): Boolean = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextJoin(
    textList: Ptr[CString],
    count: CInt,
    delimiter: CString
): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextLength(text: CString): CUnsignedInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextReplace(text: CString, replace: CString, by: CString): CString =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextSplit(
    text: CString,
    delimiter: CChar,
    count: Ptr[CInt]
): Ptr[CString] = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextSubtext(text: CString, position: CInt, length: CInt): CString =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextToInteger(text: CString): CInt = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextToLower(text: CString): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextToPascal(text: CString): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TextToUpper(text: CString): CString = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ToggleBorderlessWindowed(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def ToggleFullscreen(): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def TraceLog(logLevel: CInt, text: CString, rest: Any*): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UnloadAutomationEventList(list: Ptr[AutomationEventList]): Unit =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UnloadCodepoints(codepoints: Ptr[CInt]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UnloadFileData(data: Ptr[CUnsignedChar]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UnloadFileText(text: CString): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UnloadFontData(glyphs: Ptr[GlyphInfo], glyphCount: CInt): Unit =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UnloadImageColors(colors: Ptr[Color]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UnloadImagePalette(colors: Ptr[Color]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UnloadModelAnimations(
    animations: Ptr[ModelAnimation],
    animCount: CInt
): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UnloadRandomSequence(sequence: Ptr[CInt]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UnloadUTF8(text: CString): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UnloadWaveSamples(samples: Ptr[Float]): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UpdateCamera(camera: Ptr[Camera], mode: CInt): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def UploadMesh(mesh: Ptr[Mesh], dynamic: Boolean): Unit = extern

/** [bindgen] header: ./raylib/src/raymath.h
  */
@extern def Vector3OrthoNormalize(v1: Ptr[Vector3], v2: Ptr[Vector3]): Unit =
  extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def WaitTime(seconds: Double): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def WaveCrop(
    wave: Ptr[Wave],
    initSample: CInt,
    finalSample: CInt
): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def WaveFormat(
    wave: Ptr[Wave],
    sampleRate: CInt,
    sampleSize: CInt,
    channels: CInt
): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
@extern def WindowShouldClose(): Boolean = extern

/** [bindgen] header: ./raylib/src/raymath.h
  */
@extern def Wrap(value: Float, min: Float, max: Float): Float = extern

@extern private[raylib] def __sn_wrap_raylib_AttachAudioStreamProcessor(
    stream: Ptr[AudioStream],
    processor: AudioCallback
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_BeginMode2D(
    camera: Ptr[Camera2D]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_BeginMode3D(
    camera: Ptr[Camera3D]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_BeginShaderMode(
    shader: Ptr[Shader]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_BeginTextureMode(
    target: Ptr[RenderTexture2D]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_BeginVrStereoMode(
    config: Ptr[VrStereoConfig]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionBoxSphere(
    box: Ptr[BoundingBox],
    center: Ptr[Vector3],
    radius: Float
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionBoxes(
    box1: Ptr[BoundingBox],
    box2: Ptr[BoundingBox]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionCircleRec(
    center: Ptr[Vector2],
    radius: Float,
    rec: Ptr[Rectangle]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionCircles(
    center1: Ptr[Vector2],
    radius1: Float,
    center2: Ptr[Vector2],
    radius2: Float
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionLines(
    startPos1: Ptr[Vector2],
    endPos1: Ptr[Vector2],
    startPos2: Ptr[Vector2],
    endPos2: Ptr[Vector2],
    collisionPoint: Ptr[Vector2]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionPointCircle(
    point: Ptr[Vector2],
    center: Ptr[Vector2],
    radius: Float
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionPointLine(
    point: Ptr[Vector2],
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    threshold: CInt
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionPointPoly(
    point: Ptr[Vector2],
    points: Ptr[Vector2],
    pointCount: CInt
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionPointRec(
    point: Ptr[Vector2],
    rec: Ptr[Rectangle]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionPointTriangle(
    point: Ptr[Vector2],
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionRecs(
    rec1: Ptr[Rectangle],
    rec2: Ptr[Rectangle]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_CheckCollisionSpheres(
    center1: Ptr[Vector3],
    radius1: Float,
    center2: Ptr[Vector3],
    radius2: Float
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_ClearBackground(
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ColorAlpha(
    color: Ptr[Color],
    alpha: Float,
    __return: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ColorAlphaBlend(
    dst: Ptr[Color],
    src: Ptr[Color],
    tint: Ptr[Color],
    __return: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ColorBrightness(
    color: Ptr[Color],
    factor: Float,
    __return: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ColorContrast(
    color: Ptr[Color],
    contrast: Float,
    __return: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ColorFromHSV(
    hue: Float,
    saturation: Float,
    value: Float,
    __return: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ColorFromNormalized(
    normalized: Ptr[Vector4],
    __return: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ColorNormalize(
    color: Ptr[Color],
    __return: Ptr[Vector4]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ColorTint(
    color: Ptr[Color],
    tint: Ptr[Color],
    __return: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ColorToHSV(
    color: Ptr[Color],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ColorToInt(
    color: Ptr[Color]
): CInt = extern

@extern private[raylib] def __sn_wrap_raylib_DetachAudioStreamProcessor(
    stream: Ptr[AudioStream],
    processor: AudioCallback
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawBillboard(
    camera: Ptr[Camera],
    texture: Ptr[Texture2D],
    position: Ptr[Vector3],
    size: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawBillboardPro(
    camera: Ptr[Camera],
    texture: Ptr[Texture2D],
    source: Ptr[Rectangle],
    position: Ptr[Vector3],
    up: Ptr[Vector3],
    size: Ptr[Vector2],
    origin: Ptr[Vector2],
    rotation: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawBillboardRec(
    camera: Ptr[Camera],
    texture: Ptr[Texture2D],
    source: Ptr[Rectangle],
    position: Ptr[Vector3],
    size: Ptr[Vector2],
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawBoundingBox(
    box: Ptr[BoundingBox],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCapsule(
    startPos: Ptr[Vector3],
    endPos: Ptr[Vector3],
    radius: Float,
    slices: CInt,
    rings: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCapsuleWires(
    startPos: Ptr[Vector3],
    endPos: Ptr[Vector3],
    radius: Float,
    slices: CInt,
    rings: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCircle(
    centerX: CInt,
    centerY: CInt,
    radius: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCircle3D(
    center: Ptr[Vector3],
    radius: Float,
    rotationAxis: Ptr[Vector3],
    rotationAngle: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCircleGradient(
    centerX: CInt,
    centerY: CInt,
    radius: Float,
    color1: Ptr[Color],
    color2: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCircleLines(
    centerX: CInt,
    centerY: CInt,
    radius: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCircleLinesV(
    center: Ptr[Vector2],
    radius: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCircleSector(
    center: Ptr[Vector2],
    radius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCircleSectorLines(
    center: Ptr[Vector2],
    radius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCircleV(
    center: Ptr[Vector2],
    radius: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCube(
    position: Ptr[Vector3],
    width: Float,
    height: Float,
    length: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCubeV(
    position: Ptr[Vector3],
    size: Ptr[Vector3],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCubeWires(
    position: Ptr[Vector3],
    width: Float,
    height: Float,
    length: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCubeWiresV(
    position: Ptr[Vector3],
    size: Ptr[Vector3],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCylinder(
    position: Ptr[Vector3],
    radiusTop: Float,
    radiusBottom: Float,
    height: Float,
    slices: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCylinderEx(
    startPos: Ptr[Vector3],
    endPos: Ptr[Vector3],
    startRadius: Float,
    endRadius: Float,
    sides: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCylinderWires(
    position: Ptr[Vector3],
    radiusTop: Float,
    radiusBottom: Float,
    height: Float,
    slices: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawCylinderWiresEx(
    startPos: Ptr[Vector3],
    endPos: Ptr[Vector3],
    startRadius: Float,
    endRadius: Float,
    sides: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawEllipse(
    centerX: CInt,
    centerY: CInt,
    radiusH: Float,
    radiusV: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawEllipseLines(
    centerX: CInt,
    centerY: CInt,
    radiusH: Float,
    radiusV: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawLine(
    startPosX: CInt,
    startPosY: CInt,
    endPosX: CInt,
    endPosY: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawLine3D(
    startPos: Ptr[Vector3],
    endPos: Ptr[Vector3],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawLineBezier(
    startPos: Ptr[Vector2],
    endPos: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawLineEx(
    startPos: Ptr[Vector2],
    endPos: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawLineStrip(
    points: Ptr[Vector2],
    pointCount: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawLineV(
    startPos: Ptr[Vector2],
    endPos: Ptr[Vector2],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawMesh(
    mesh: Ptr[Mesh],
    material: Ptr[Material],
    transform: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawMeshInstanced(
    mesh: Ptr[Mesh],
    material: Ptr[Material],
    transforms: Ptr[Matrix],
    instances: CInt
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawModel(
    model: Ptr[Model],
    position: Ptr[Vector3],
    scale: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawModelEx(
    model: Ptr[Model],
    position: Ptr[Vector3],
    rotationAxis: Ptr[Vector3],
    rotationAngle: Float,
    scale: Ptr[Vector3],
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawModelWires(
    model: Ptr[Model],
    position: Ptr[Vector3],
    scale: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawModelWiresEx(
    model: Ptr[Model],
    position: Ptr[Vector3],
    rotationAxis: Ptr[Vector3],
    rotationAngle: Float,
    scale: Ptr[Vector3],
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawPixel(
    posX: CInt,
    posY: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawPixelV(
    position: Ptr[Vector2],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawPlane(
    centerPos: Ptr[Vector3],
    size: Ptr[Vector2],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawPoint3D(
    position: Ptr[Vector3],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawPoly(
    center: Ptr[Vector2],
    sides: CInt,
    radius: Float,
    rotation: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawPolyLines(
    center: Ptr[Vector2],
    sides: CInt,
    radius: Float,
    rotation: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawPolyLinesEx(
    center: Ptr[Vector2],
    sides: CInt,
    radius: Float,
    rotation: Float,
    lineThick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRay(
    ray: Ptr[Ray],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRectangle(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRectangleGradientEx(
    rec: Ptr[Rectangle],
    col1: Ptr[Color],
    col2: Ptr[Color],
    col3: Ptr[Color],
    col4: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRectangleGradientH(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color1: Ptr[Color],
    color2: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRectangleGradientV(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color1: Ptr[Color],
    color2: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRectangleLines(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRectangleLinesEx(
    rec: Ptr[Rectangle],
    lineThick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRectanglePro(
    rec: Ptr[Rectangle],
    origin: Ptr[Vector2],
    rotation: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRectangleRec(
    rec: Ptr[Rectangle],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRectangleRounded(
    rec: Ptr[Rectangle],
    roundness: Float,
    segments: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRectangleRoundedLines(
    rec: Ptr[Rectangle],
    roundness: Float,
    segments: CInt,
    lineThick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRectangleV(
    position: Ptr[Vector2],
    size: Ptr[Vector2],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRing(
    center: Ptr[Vector2],
    innerRadius: Float,
    outerRadius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawRingLines(
    center: Ptr[Vector2],
    innerRadius: Float,
    outerRadius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSphere(
    centerPos: Ptr[Vector3],
    radius: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSphereEx(
    centerPos: Ptr[Vector3],
    radius: Float,
    rings: CInt,
    slices: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSphereWires(
    centerPos: Ptr[Vector3],
    radius: Float,
    rings: CInt,
    slices: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSplineBasis(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSplineBezierCubic(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSplineBezierQuadratic(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSplineCatmullRom(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSplineLinear(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSplineSegmentBasis(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2],
    p4: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSplineSegmentBezierCubic(
    p1: Ptr[Vector2],
    c2: Ptr[Vector2],
    c3: Ptr[Vector2],
    p4: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSplineSegmentBezierQuadratic(
    p1: Ptr[Vector2],
    c2: Ptr[Vector2],
    p3: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSplineSegmentCatmullRom(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2],
    p4: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawSplineSegmentLinear(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawText(
    text: CString,
    posX: CInt,
    posY: CInt,
    fontSize: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTextCodepoint(
    font: Ptr[Font],
    codepoint: CInt,
    position: Ptr[Vector2],
    fontSize: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTextCodepoints(
    font: Ptr[Font],
    codepoints: Ptr[CInt],
    codepointCount: CInt,
    position: Ptr[Vector2],
    fontSize: Float,
    spacing: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTextEx(
    font: Ptr[Font],
    text: CString,
    position: Ptr[Vector2],
    fontSize: Float,
    spacing: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTextPro(
    font: Ptr[Font],
    text: CString,
    position: Ptr[Vector2],
    origin: Ptr[Vector2],
    rotation: Float,
    fontSize: Float,
    spacing: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTexture(
    texture: Ptr[Texture2D],
    posX: CInt,
    posY: CInt,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTextureEx(
    texture: Ptr[Texture2D],
    position: Ptr[Vector2],
    rotation: Float,
    scale: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTextureNPatch(
    texture: Ptr[Texture2D],
    nPatchInfo: Ptr[NPatchInfo],
    dest: Ptr[Rectangle],
    origin: Ptr[Vector2],
    rotation: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTexturePro(
    texture: Ptr[Texture2D],
    source: Ptr[Rectangle],
    dest: Ptr[Rectangle],
    origin: Ptr[Vector2],
    rotation: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTextureRec(
    texture: Ptr[Texture2D],
    source: Ptr[Rectangle],
    position: Ptr[Vector2],
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTextureV(
    texture: Ptr[Texture2D],
    position: Ptr[Vector2],
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTriangle(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2],
    v3: Ptr[Vector2],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTriangle3D(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    v3: Ptr[Vector3],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTriangleFan(
    points: Ptr[Vector2],
    pointCount: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTriangleLines(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2],
    v3: Ptr[Vector2],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTriangleStrip(
    points: Ptr[Vector2],
    pointCount: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_DrawTriangleStrip3D(
    points: Ptr[Vector3],
    pointCount: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ExportAutomationEventList(
    list: Ptr[AutomationEventList],
    fileName: CString
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_ExportFontAsCode(
    font: Ptr[Font],
    fileName: CString
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_ExportImage(
    image: Ptr[Image],
    fileName: CString
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_ExportImageAsCode(
    image: Ptr[Image],
    fileName: CString
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_ExportImageToMemory(
    image: Ptr[Image],
    fileType: CString,
    fileSize: Ptr[CInt]
): Ptr[CUnsignedChar] = extern

@extern private[raylib] def __sn_wrap_raylib_ExportMesh(
    mesh: Ptr[Mesh],
    fileName: CString
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_ExportWave(
    wave: Ptr[Wave],
    fileName: CString
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_ExportWaveAsCode(
    wave: Ptr[Wave],
    fileName: CString
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_Fade(
    color: Ptr[Color],
    alpha: Float,
    __return: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenImageCellular(
    width: CInt,
    height: CInt,
    tileSize: CInt,
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenImageChecked(
    width: CInt,
    height: CInt,
    checksX: CInt,
    checksY: CInt,
    col1: Ptr[Color],
    col2: Ptr[Color],
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenImageColor(
    width: CInt,
    height: CInt,
    color: Ptr[Color],
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenImageFontAtlas(
    glyphs: Ptr[GlyphInfo],
    glyphRecs: Ptr[Ptr[Rectangle]],
    glyphCount: CInt,
    fontSize: CInt,
    padding: CInt,
    packMethod: CInt,
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenImageGradientLinear(
    width: CInt,
    height: CInt,
    direction: CInt,
    start: Ptr[Color],
    end: Ptr[Color],
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenImageGradientRadial(
    width: CInt,
    height: CInt,
    density: Float,
    inner: Ptr[Color],
    outer: Ptr[Color],
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenImageGradientSquare(
    width: CInt,
    height: CInt,
    density: Float,
    inner: Ptr[Color],
    outer: Ptr[Color],
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenImagePerlinNoise(
    width: CInt,
    height: CInt,
    offsetX: CInt,
    offsetY: CInt,
    scale: Float,
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenImageText(
    width: CInt,
    height: CInt,
    text: CString,
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenImageWhiteNoise(
    width: CInt,
    height: CInt,
    factor: Float,
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenMeshCone(
    radius: Float,
    height: Float,
    slices: CInt,
    __return: Ptr[Mesh]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenMeshCube(
    width: Float,
    height: Float,
    length: Float,
    __return: Ptr[Mesh]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenMeshCubicmap(
    cubicmap: Ptr[Image],
    cubeSize: Ptr[Vector3],
    __return: Ptr[Mesh]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenMeshCylinder(
    radius: Float,
    height: Float,
    slices: CInt,
    __return: Ptr[Mesh]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenMeshHeightmap(
    heightmap: Ptr[Image],
    size: Ptr[Vector3],
    __return: Ptr[Mesh]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenMeshHemiSphere(
    radius: Float,
    rings: CInt,
    slices: CInt,
    __return: Ptr[Mesh]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenMeshKnot(
    radius: Float,
    size: Float,
    radSeg: CInt,
    sides: CInt,
    __return: Ptr[Mesh]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenMeshPlane(
    width: Float,
    length: Float,
    resX: CInt,
    resZ: CInt,
    __return: Ptr[Mesh]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenMeshPoly(
    sides: CInt,
    radius: Float,
    __return: Ptr[Mesh]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenMeshSphere(
    radius: Float,
    rings: CInt,
    slices: CInt,
    __return: Ptr[Mesh]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GenMeshTorus(
    radius: Float,
    size: Float,
    radSeg: CInt,
    sides: CInt,
    __return: Ptr[Mesh]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetCameraMatrix(
    camera: Ptr[Camera],
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetCameraMatrix2D(
    camera: Ptr[Camera2D],
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetCollisionRec(
    rec1: Ptr[Rectangle],
    rec2: Ptr[Rectangle],
    __return: Ptr[Rectangle]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetColor(
    hexValue: CUnsignedInt,
    __return: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetFontDefault(
    __return: Ptr[Font]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetGestureDragVector(
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetGesturePinchVector(
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetGlyphAtlasRec(
    font: Ptr[Font],
    codepoint: CInt,
    __return: Ptr[Rectangle]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetGlyphIndex(
    font: Ptr[Font],
    codepoint: CInt
): CInt = extern

@extern private[raylib] def __sn_wrap_raylib_GetGlyphInfo(
    font: Ptr[Font],
    codepoint: CInt,
    __return: Ptr[GlyphInfo]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetImageAlphaBorder(
    image: Ptr[Image],
    threshold: Float,
    __return: Ptr[Rectangle]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetImageColor(
    image: Ptr[Image],
    x: CInt,
    y: CInt,
    __return: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetMeshBoundingBox(
    mesh: Ptr[Mesh],
    __return: Ptr[BoundingBox]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetModelBoundingBox(
    model: Ptr[Model],
    __return: Ptr[BoundingBox]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetMonitorPosition(
    monitor: CInt,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetMouseDelta(
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetMousePosition(
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetMouseRay(
    mousePosition: Ptr[Vector2],
    camera: Ptr[Camera],
    __return: Ptr[Ray]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetMouseWheelMoveV(
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetMusicTimeLength(
    music: Ptr[Music]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_GetMusicTimePlayed(
    music: Ptr[Music]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_GetPixelColor(
    srcPtr: Ptr[Byte],
    format: CInt,
    __return: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetRayCollisionBox(
    ray: Ptr[Ray],
    box: Ptr[BoundingBox],
    __return: Ptr[RayCollision]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetRayCollisionMesh(
    ray: Ptr[Ray],
    mesh: Ptr[Mesh],
    transform: Ptr[Matrix],
    __return: Ptr[RayCollision]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetRayCollisionQuad(
    ray: Ptr[Ray],
    p1: Ptr[Vector3],
    p2: Ptr[Vector3],
    p3: Ptr[Vector3],
    p4: Ptr[Vector3],
    __return: Ptr[RayCollision]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetRayCollisionSphere(
    ray: Ptr[Ray],
    center: Ptr[Vector3],
    radius: Float,
    __return: Ptr[RayCollision]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetRayCollisionTriangle(
    ray: Ptr[Ray],
    p1: Ptr[Vector3],
    p2: Ptr[Vector3],
    p3: Ptr[Vector3],
    __return: Ptr[RayCollision]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetScreenToWorld2D(
    position: Ptr[Vector2],
    camera: Ptr[Camera2D],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetShaderLocation(
    shader: Ptr[Shader],
    uniformName: CString
): CInt = extern

@extern private[raylib] def __sn_wrap_raylib_GetShaderLocationAttrib(
    shader: Ptr[Shader],
    attribName: CString
): CInt = extern

@extern private[raylib] def __sn_wrap_raylib_GetSplinePointBasis(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2],
    p4: Ptr[Vector2],
    t: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetSplinePointBezierCubic(
    p1: Ptr[Vector2],
    c2: Ptr[Vector2],
    c3: Ptr[Vector2],
    p4: Ptr[Vector2],
    t: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetSplinePointBezierQuad(
    p1: Ptr[Vector2],
    c2: Ptr[Vector2],
    p3: Ptr[Vector2],
    t: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetSplinePointCatmullRom(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2],
    p4: Ptr[Vector2],
    t: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetSplinePointLinear(
    startPos: Ptr[Vector2],
    endPos: Ptr[Vector2],
    t: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetTouchPosition(
    index: CInt,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetWindowPosition(
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetWindowScaleDPI(
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetWorldToScreen(
    position: Ptr[Vector3],
    camera: Ptr[Camera],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetWorldToScreen2D(
    position: Ptr[Vector2],
    camera: Ptr[Camera2D],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_GetWorldToScreenEx(
    position: Ptr[Vector3],
    camera: Ptr[Camera],
    width: CInt,
    height: CInt,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageAlphaClear(
    image: Ptr[Image],
    color: Ptr[Color],
    threshold: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageAlphaMask(
    image: Ptr[Image],
    alphaMask: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageClearBackground(
    dst: Ptr[Image],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageColorReplace(
    image: Ptr[Image],
    color: Ptr[Color],
    replace: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageColorTint(
    image: Ptr[Image],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageCopy(
    image: Ptr[Image],
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageCrop(
    image: Ptr[Image],
    crop: Ptr[Rectangle]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDraw(
    dst: Ptr[Image],
    src: Ptr[Image],
    srcRec: Ptr[Rectangle],
    dstRec: Ptr[Rectangle],
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawCircle(
    dst: Ptr[Image],
    centerX: CInt,
    centerY: CInt,
    radius: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawCircleLines(
    dst: Ptr[Image],
    centerX: CInt,
    centerY: CInt,
    radius: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawCircleLinesV(
    dst: Ptr[Image],
    center: Ptr[Vector2],
    radius: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawCircleV(
    dst: Ptr[Image],
    center: Ptr[Vector2],
    radius: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawLine(
    dst: Ptr[Image],
    startPosX: CInt,
    startPosY: CInt,
    endPosX: CInt,
    endPosY: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawLineV(
    dst: Ptr[Image],
    start: Ptr[Vector2],
    end: Ptr[Vector2],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawPixel(
    dst: Ptr[Image],
    posX: CInt,
    posY: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawPixelV(
    dst: Ptr[Image],
    position: Ptr[Vector2],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawRectangle(
    dst: Ptr[Image],
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawRectangleLines(
    dst: Ptr[Image],
    rec: Ptr[Rectangle],
    thick: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawRectangleRec(
    dst: Ptr[Image],
    rec: Ptr[Rectangle],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawRectangleV(
    dst: Ptr[Image],
    position: Ptr[Vector2],
    size: Ptr[Vector2],
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawText(
    dst: Ptr[Image],
    text: CString,
    posX: CInt,
    posY: CInt,
    fontSize: CInt,
    color: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageDrawTextEx(
    dst: Ptr[Image],
    font: Ptr[Font],
    text: CString,
    position: Ptr[Vector2],
    fontSize: Float,
    spacing: Float,
    tint: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageFromImage(
    image: Ptr[Image],
    rec: Ptr[Rectangle],
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageResizeCanvas(
    image: Ptr[Image],
    newWidth: CInt,
    newHeight: CInt,
    offsetX: CInt,
    offsetY: CInt,
    fill: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageText(
    text: CString,
    fontSize: CInt,
    color: Ptr[Color],
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageTextEx(
    font: Ptr[Font],
    text: CString,
    fontSize: Float,
    spacing: Float,
    tint: Ptr[Color],
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ImageToPOT(
    image: Ptr[Image],
    fill: Ptr[Color]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_IsAudioStreamPlaying(
    stream: Ptr[AudioStream]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsAudioStreamProcessed(
    stream: Ptr[AudioStream]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsAudioStreamReady(
    stream: Ptr[AudioStream]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsFontReady(
    font: Ptr[Font]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsImageReady(
    image: Ptr[Image]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsMaterialReady(
    material: Ptr[Material]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsModelAnimationValid(
    model: Ptr[Model],
    anim: Ptr[ModelAnimation]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsModelReady(
    model: Ptr[Model]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsMusicReady(
    music: Ptr[Music]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsMusicStreamPlaying(
    music: Ptr[Music]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsRenderTextureReady(
    target: Ptr[RenderTexture2D]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsShaderReady(
    shader: Ptr[Shader]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsSoundPlaying(
    sound: Ptr[Sound]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsSoundReady(
    sound: Ptr[Sound]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsTextureReady(
    texture: Ptr[Texture2D]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_IsWaveReady(
    wave: Ptr[Wave]
): Boolean = extern

@extern private[raylib] def __sn_wrap_raylib_LoadAudioStream(
    sampleRate: CUnsignedInt,
    sampleSize: CUnsignedInt,
    channels: CUnsignedInt,
    __return: Ptr[AudioStream]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadAutomationEventList(
    fileName: CString,
    __return: Ptr[AutomationEventList]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadDirectoryFiles(
    dirPath: CString,
    __return: Ptr[FilePathList]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadDirectoryFilesEx(
    basePath: CString,
    filter: CString,
    scanSubdirs: Boolean,
    __return: Ptr[FilePathList]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadDroppedFiles(
    __return: Ptr[FilePathList]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadFont(
    fileName: CString,
    __return: Ptr[Font]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadFontEx(
    fileName: CString,
    fontSize: CInt,
    codepoints: Ptr[CInt],
    codepointCount: CInt,
    __return: Ptr[Font]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadFontFromImage(
    image: Ptr[Image],
    key: Ptr[Color],
    firstChar: CInt,
    __return: Ptr[Font]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadFontFromMemory(
    fileType: CString,
    fileData: Ptr[CUnsignedChar],
    dataSize: CInt,
    fontSize: CInt,
    codepoints: Ptr[CInt],
    codepointCount: CInt,
    __return: Ptr[Font]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadImage(
    fileName: CString,
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadImageAnim(
    fileName: CString,
    frames: Ptr[CInt],
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadImageColors(
    image: Ptr[Image]
): Ptr[Color] = extern

@extern private[raylib] def __sn_wrap_raylib_LoadImageFromMemory(
    fileType: CString,
    fileData: Ptr[CUnsignedChar],
    dataSize: CInt,
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadImageFromScreen(
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadImageFromTexture(
    texture: Ptr[Texture2D],
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadImagePalette(
    image: Ptr[Image],
    maxPaletteSize: CInt,
    colorCount: Ptr[CInt]
): Ptr[Color] = extern

@extern private[raylib] def __sn_wrap_raylib_LoadImageRaw(
    fileName: CString,
    width: CInt,
    height: CInt,
    format: CInt,
    headerSize: CInt,
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadImageSvg(
    fileNameOrString: CString,
    width: CInt,
    height: CInt,
    __return: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadMaterialDefault(
    __return: Ptr[Material]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadModel(
    fileName: CString,
    __return: Ptr[Model]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadModelFromMesh(
    mesh: Ptr[Mesh],
    __return: Ptr[Model]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadMusicStream(
    fileName: CString,
    __return: Ptr[Music]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadMusicStreamFromMemory(
    fileType: CString,
    data: Ptr[CUnsignedChar],
    dataSize: CInt,
    __return: Ptr[Music]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadRenderTexture(
    width: CInt,
    height: CInt,
    __return: Ptr[RenderTexture2D]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadShader(
    vsFileName: CString,
    fsFileName: CString,
    __return: Ptr[Shader]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadShaderFromMemory(
    vsCode: CString,
    fsCode: CString,
    __return: Ptr[Shader]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadSound(
    fileName: CString,
    __return: Ptr[Sound]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadSoundAlias(
    source: Ptr[Sound],
    __return: Ptr[Sound]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadSoundFromWave(
    wave: Ptr[Wave],
    __return: Ptr[Sound]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadTexture(
    fileName: CString,
    __return: Ptr[Texture2D]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadTextureCubemap(
    image: Ptr[Image],
    layout: CInt,
    __return: Ptr[TextureCubemap]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadTextureFromImage(
    image: Ptr[Image],
    __return: Ptr[Texture2D]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadVrStereoConfig(
    device: Ptr[VrDeviceInfo],
    __return: Ptr[VrStereoConfig]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadWave(
    fileName: CString,
    __return: Ptr[Wave]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadWaveFromMemory(
    fileType: CString,
    fileData: Ptr[CUnsignedChar],
    dataSize: CInt,
    __return: Ptr[Wave]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_LoadWaveSamples(
    wave: Ptr[Wave]
): Ptr[Float] = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixAdd(
    left: Ptr[Matrix],
    right: Ptr[Matrix],
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixDeterminant(
    mat: Ptr[Matrix]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixFrustum(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    near: Double,
    far: Double,
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixIdentity(
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixInvert(
    mat: Ptr[Matrix],
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixLookAt(
    eye: Ptr[Vector3],
    target: Ptr[Vector3],
    up: Ptr[Vector3],
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixMultiply(
    left: Ptr[Matrix],
    right: Ptr[Matrix],
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixOrtho(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    nearPlane: Double,
    farPlane: Double,
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixPerspective(
    fovY: Double,
    aspect: Double,
    nearPlane: Double,
    farPlane: Double,
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixRotate(
    axis: Ptr[Vector3],
    angle: Float,
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixRotateX(
    angle: Float,
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixRotateXYZ(
    angle: Ptr[Vector3],
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixRotateY(
    angle: Float,
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixRotateZ(
    angle: Float,
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixRotateZYX(
    angle: Ptr[Vector3],
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixScale(
    x: Float,
    y: Float,
    z: Float,
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixSubtract(
    left: Ptr[Matrix],
    right: Ptr[Matrix],
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixToFloatV(
    mat: Ptr[Matrix],
    __return: Ptr[float16]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixTrace(
    mat: Ptr[Matrix]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixTranslate(
    x: Float,
    y: Float,
    z: Float,
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MatrixTranspose(
    mat: Ptr[Matrix],
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_MeasureTextEx(
    font: Ptr[Font],
    text: CString,
    fontSize: Float,
    spacing: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_PauseAudioStream(
    stream: Ptr[AudioStream]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_PauseMusicStream(
    music: Ptr[Music]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_PauseSound(
    sound: Ptr[Sound]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_PlayAudioStream(
    stream: Ptr[AudioStream]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_PlayAutomationEvent(
    event: Ptr[AutomationEvent]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_PlayMusicStream(
    music: Ptr[Music]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_PlaySound(
    sound: Ptr[Sound]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionAdd(
    q1: Ptr[Quaternion],
    q2: Ptr[Quaternion],
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionAddValue(
    q: Ptr[Quaternion],
    add: Float,
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionDivide(
    q1: Ptr[Quaternion],
    q2: Ptr[Quaternion],
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionEquals(
    p: Ptr[Quaternion],
    q: Ptr[Quaternion]
): CInt = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionFromAxisAngle(
    axis: Ptr[Vector3],
    angle: Float,
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionFromEuler(
    pitch: Float,
    yaw: Float,
    roll: Float,
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionFromMatrix(
    mat: Ptr[Matrix],
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionFromVector3ToVector3(
    from: Ptr[Vector3],
    to: Ptr[Vector3],
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionIdentity(
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionInvert(
    q: Ptr[Quaternion],
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionLength(
    q: Ptr[Quaternion]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionLerp(
    q1: Ptr[Quaternion],
    q2: Ptr[Quaternion],
    amount: Float,
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionMultiply(
    q1: Ptr[Quaternion],
    q2: Ptr[Quaternion],
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionNlerp(
    q1: Ptr[Quaternion],
    q2: Ptr[Quaternion],
    amount: Float,
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionNormalize(
    q: Ptr[Quaternion],
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionScale(
    q: Ptr[Quaternion],
    mul: Float,
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionSlerp(
    q1: Ptr[Quaternion],
    q2: Ptr[Quaternion],
    amount: Float,
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionSubtract(
    q1: Ptr[Quaternion],
    q2: Ptr[Quaternion],
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionSubtractValue(
    q: Ptr[Quaternion],
    sub: Float,
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionToAxisAngle(
    q: Ptr[Quaternion],
    outAxis: Ptr[Vector3],
    outAngle: Ptr[Float]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionToEuler(
    q: Ptr[Quaternion],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionToMatrix(
    q: Ptr[Quaternion],
    __return: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_QuaternionTransform(
    q: Ptr[Quaternion],
    mat: Ptr[Matrix],
    __return: Ptr[Quaternion]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ResumeAudioStream(
    stream: Ptr[AudioStream]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ResumeMusicStream(
    music: Ptr[Music]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_ResumeSound(
    sound: Ptr[Sound]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SeekMusicStream(
    music: Ptr[Music],
    position: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetAudioStreamCallback(
    stream: Ptr[AudioStream],
    callback: AudioCallback
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetAudioStreamPan(
    stream: Ptr[AudioStream],
    pan: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetAudioStreamPitch(
    stream: Ptr[AudioStream],
    pitch: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetAudioStreamVolume(
    stream: Ptr[AudioStream],
    volume: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetMaterialTexture(
    material: Ptr[Material],
    mapType: CInt,
    texture: Ptr[Texture2D]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetMusicPan(
    music: Ptr[Music],
    pan: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetMusicPitch(
    music: Ptr[Music],
    pitch: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetMusicVolume(
    music: Ptr[Music],
    volume: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetPixelColor(
    dstPtr: Ptr[Byte],
    color: Ptr[Color],
    format: CInt
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetShaderValue(
    shader: Ptr[Shader],
    locIndex: CInt,
    value: Ptr[Byte],
    uniformType: CInt
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetShaderValueMatrix(
    shader: Ptr[Shader],
    locIndex: CInt,
    mat: Ptr[Matrix]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetShaderValueTexture(
    shader: Ptr[Shader],
    locIndex: CInt,
    texture: Ptr[Texture2D]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetShaderValueV(
    shader: Ptr[Shader],
    locIndex: CInt,
    value: Ptr[Byte],
    uniformType: CInt,
    count: CInt
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetShapesTexture(
    texture: Ptr[Texture2D],
    source: Ptr[Rectangle]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetSoundPan(
    sound: Ptr[Sound],
    pan: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetSoundPitch(
    sound: Ptr[Sound],
    pitch: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetSoundVolume(
    sound: Ptr[Sound],
    volume: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetTextureFilter(
    texture: Ptr[Texture2D],
    filter: CInt
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetTextureWrap(
    texture: Ptr[Texture2D],
    wrap: CInt
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_SetWindowIcon(
    image: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_StopAudioStream(
    stream: Ptr[AudioStream]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_StopMusicStream(
    music: Ptr[Music]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_StopSound(
    sound: Ptr[Sound]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadAudioStream(
    stream: Ptr[AudioStream]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadDirectoryFiles(
    files: Ptr[FilePathList]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadDroppedFiles(
    files: Ptr[FilePathList]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadFont(font: Ptr[Font]): Unit =
  extern

@extern private[raylib] def __sn_wrap_raylib_UnloadImage(
    image: Ptr[Image]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadMaterial(
    material: Ptr[Material]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadMesh(mesh: Ptr[Mesh]): Unit =
  extern

@extern private[raylib] def __sn_wrap_raylib_UnloadModel(
    model: Ptr[Model]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadModelAnimation(
    anim: Ptr[ModelAnimation]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadMusicStream(
    music: Ptr[Music]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadRenderTexture(
    target: Ptr[RenderTexture2D]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadShader(
    shader: Ptr[Shader]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadSound(
    sound: Ptr[Sound]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadSoundAlias(
    alias: Ptr[Sound]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadTexture(
    texture: Ptr[Texture2D]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadVrStereoConfig(
    config: Ptr[VrStereoConfig]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UnloadWave(wave: Ptr[Wave]): Unit =
  extern

@extern private[raylib] def __sn_wrap_raylib_UpdateAudioStream(
    stream: Ptr[AudioStream],
    data: Ptr[Byte],
    frameCount: CInt
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UpdateCameraPro(
    camera: Ptr[Camera],
    movement: Ptr[Vector3],
    rotation: Ptr[Vector3],
    zoom: Float
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UpdateMeshBuffer(
    mesh: Ptr[Mesh],
    index: CInt,
    data: Ptr[Byte],
    dataSize: CInt,
    offset: CInt
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UpdateModelAnimation(
    model: Ptr[Model],
    anim: Ptr[ModelAnimation],
    frame: CInt
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UpdateMusicStream(
    music: Ptr[Music]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UpdateSound(
    sound: Ptr[Sound],
    data: Ptr[Byte],
    sampleCount: CInt
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UpdateTexture(
    texture: Ptr[Texture2D],
    pixels: Ptr[Byte]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_UpdateTextureRec(
    texture: Ptr[Texture2D],
    rec: Ptr[Rectangle],
    pixels: Ptr[Byte]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Add(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2AddValue(
    v: Ptr[Vector2],
    add: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Angle(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Clamp(
    v: Ptr[Vector2],
    min: Ptr[Vector2],
    max: Ptr[Vector2],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2ClampValue(
    v: Ptr[Vector2],
    min: Float,
    max: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Distance(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2DistanceSqr(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Divide(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2DotProduct(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Equals(
    p: Ptr[Vector2],
    q: Ptr[Vector2]
): CInt = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Invert(
    v: Ptr[Vector2],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Length(
    v: Ptr[Vector2]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2LengthSqr(
    v: Ptr[Vector2]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Lerp(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2],
    amount: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2LineAngle(
    start: Ptr[Vector2],
    end: Ptr[Vector2]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2MoveTowards(
    v: Ptr[Vector2],
    target: Ptr[Vector2],
    maxDistance: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Multiply(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Negate(
    v: Ptr[Vector2],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Normalize(
    v: Ptr[Vector2],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2One(
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Reflect(
    v: Ptr[Vector2],
    normal: Ptr[Vector2],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Rotate(
    v: Ptr[Vector2],
    angle: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Scale(
    v: Ptr[Vector2],
    scale: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Subtract(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2SubtractValue(
    v: Ptr[Vector2],
    sub: Float,
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Transform(
    v: Ptr[Vector2],
    mat: Ptr[Matrix],
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector2Zero(
    __return: Ptr[Vector2]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Add(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3AddValue(
    v: Ptr[Vector3],
    add: Float,
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Angle(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Barycenter(
    p: Ptr[Vector3],
    a: Ptr[Vector3],
    b: Ptr[Vector3],
    c: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Clamp(
    v: Ptr[Vector3],
    min: Ptr[Vector3],
    max: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3ClampValue(
    v: Ptr[Vector3],
    min: Float,
    max: Float,
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3CrossProduct(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Distance(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3DistanceSqr(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Divide(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3DotProduct(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Equals(
    p: Ptr[Vector3],
    q: Ptr[Vector3]
): CInt = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Invert(
    v: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Length(
    v: Ptr[Vector3]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3LengthSqr(
    v: Ptr[Vector3]
): Float = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Lerp(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    amount: Float,
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Max(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Min(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Multiply(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Negate(
    v: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Normalize(
    v: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3One(
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Perpendicular(
    v: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Project(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Reflect(
    v: Ptr[Vector3],
    normal: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Refract(
    v: Ptr[Vector3],
    n: Ptr[Vector3],
    r: Float,
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Reject(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3RotateByAxisAngle(
    v: Ptr[Vector3],
    axis: Ptr[Vector3],
    angle: Float,
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3RotateByQuaternion(
    v: Ptr[Vector3],
    q: Ptr[Quaternion],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Scale(
    v: Ptr[Vector3],
    scalar: Float,
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Subtract(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3SubtractValue(
    v: Ptr[Vector3],
    sub: Float,
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3ToFloatV(
    v: Ptr[Vector3],
    __return: Ptr[float3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Transform(
    v: Ptr[Vector3],
    mat: Ptr[Matrix],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Unproject(
    source: Ptr[Vector3],
    projection: Ptr[Matrix],
    view: Ptr[Matrix],
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_Vector3Zero(
    __return: Ptr[Vector3]
): Unit = extern

@extern private[raylib] def __sn_wrap_raylib_WaveCopy(
    wave: Ptr[Wave],
    __return: Ptr[Wave]
): Unit = extern

/** [bindgen] header: ./raylib/src/raylib.h
  */
def AttachAudioStreamProcessor(
    stream: Ptr[AudioStream],
    processor: AudioCallback
): Unit =
  __sn_wrap_raylib_AttachAudioStreamProcessor(stream, processor)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def AttachAudioStreamProcessor(stream: AudioStream, processor: AudioCallback)(
    using Zone
): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_AttachAudioStreamProcessor((__ptr_0 + 0), processor)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def BeginMode2D(camera: Camera2D)(using Zone): Unit =
  val __ptr_0: Ptr[Camera2D] = alloc[Camera2D](1)
  !(__ptr_0 + 0) = camera
  __sn_wrap_raylib_BeginMode2D((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def BeginMode2D(camera: Ptr[Camera2D]): Unit =
  __sn_wrap_raylib_BeginMode2D(camera)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def BeginMode3D(camera: Camera3D)(using Zone): Unit =
  val __ptr_0: Ptr[Camera3D] = alloc[Camera3D](1)
  !(__ptr_0 + 0) = camera
  __sn_wrap_raylib_BeginMode3D((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def BeginMode3D(camera: Ptr[Camera3D]): Unit =
  __sn_wrap_raylib_BeginMode3D(camera)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def BeginShaderMode(shader: Ptr[Shader]): Unit =
  __sn_wrap_raylib_BeginShaderMode(shader)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def BeginShaderMode(shader: Shader)(using Zone): Unit =
  val __ptr_0: Ptr[Shader] = alloc[Shader](1)
  !(__ptr_0 + 0) = shader
  __sn_wrap_raylib_BeginShaderMode((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def BeginTextureMode(target: RenderTexture2D)(using Zone): Unit =
  val __ptr_0: Ptr[RenderTexture2D] = alloc[RenderTexture2D](1)
  !(__ptr_0 + 0) = target
  __sn_wrap_raylib_BeginTextureMode((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def BeginTextureMode(target: Ptr[RenderTexture2D]): Unit =
  __sn_wrap_raylib_BeginTextureMode(target)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def BeginVrStereoMode(config: VrStereoConfig)(using Zone): Unit =
  val __ptr_0: Ptr[VrStereoConfig] = alloc[VrStereoConfig](1)
  !(__ptr_0 + 0) = config
  __sn_wrap_raylib_BeginVrStereoMode((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def BeginVrStereoMode(config: Ptr[VrStereoConfig]): Unit =
  __sn_wrap_raylib_BeginVrStereoMode(config)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionBoxSphere(
    box: Ptr[BoundingBox],
    center: Ptr[Vector3],
    radius: Float
): Boolean =
  __sn_wrap_raylib_CheckCollisionBoxSphere(box, center, radius)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionBoxSphere(box: BoundingBox, center: Vector3, radius: Float)(
    using Zone
): Boolean =
  val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_0 + 0) = box
  !(__ptr_1 + 0) = center
  __sn_wrap_raylib_CheckCollisionBoxSphere((__ptr_0 + 0), (__ptr_1 + 0), radius)
end CheckCollisionBoxSphere

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionBoxes(box1: BoundingBox, box2: BoundingBox)(using
    Zone
): Boolean =
  val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](2)
  !(__ptr_0 + 0) = box1
  !(__ptr_0 + 1) = box2
  __sn_wrap_raylib_CheckCollisionBoxes((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionBoxes(
    box1: Ptr[BoundingBox],
    box2: Ptr[BoundingBox]
): Boolean =
  __sn_wrap_raylib_CheckCollisionBoxes(box1, box2)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionCircleRec(
    center: Ptr[Vector2],
    radius: Float,
    rec: Ptr[Rectangle]
): Boolean =
  __sn_wrap_raylib_CheckCollisionCircleRec(center, radius, rec)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionCircleRec(center: Vector2, radius: Float, rec: Rectangle)(
    using Zone
): Boolean =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_0 + 0) = center
  !(__ptr_1 + 0) = rec
  __sn_wrap_raylib_CheckCollisionCircleRec((__ptr_0 + 0), radius, (__ptr_1 + 0))
end CheckCollisionCircleRec

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionCircles(
    center1: Vector2,
    radius1: Float,
    center2: Vector2,
    radius2: Float
)(using Zone): Boolean =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = center1
  !(__ptr_0 + 1) = center2
  __sn_wrap_raylib_CheckCollisionCircles(
    (__ptr_0 + 0),
    radius1,
    (__ptr_0 + 1),
    radius2
  )
end CheckCollisionCircles

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionCircles(
    center1: Ptr[Vector2],
    radius1: Float,
    center2: Ptr[Vector2],
    radius2: Float
): Boolean =
  __sn_wrap_raylib_CheckCollisionCircles(center1, radius1, center2, radius2)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionLines(
    startPos1: Vector2,
    endPos1: Vector2,
    startPos2: Vector2,
    endPos2: Vector2,
    collisionPoint: Ptr[Vector2]
)(using Zone): Boolean =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](4)
  !(__ptr_0 + 0) = startPos1
  !(__ptr_0 + 1) = endPos1
  !(__ptr_0 + 2) = startPos2
  !(__ptr_0 + 3) = endPos2
  __sn_wrap_raylib_CheckCollisionLines(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    (__ptr_0 + 3),
    collisionPoint
  )
end CheckCollisionLines

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionLines(
    startPos1: Ptr[Vector2],
    endPos1: Ptr[Vector2],
    startPos2: Ptr[Vector2],
    endPos2: Ptr[Vector2],
    collisionPoint: Ptr[Vector2]
): Boolean =
  __sn_wrap_raylib_CheckCollisionLines(
    startPos1,
    endPos1,
    startPos2,
    endPos2,
    collisionPoint
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionPointCircle(
    point: Ptr[Vector2],
    center: Ptr[Vector2],
    radius: Float
): Boolean =
  __sn_wrap_raylib_CheckCollisionPointCircle(point, center, radius)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionPointCircle(point: Vector2, center: Vector2, radius: Float)(
    using Zone
): Boolean =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = point
  !(__ptr_0 + 1) = center
  __sn_wrap_raylib_CheckCollisionPointCircle(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    radius
  )
end CheckCollisionPointCircle

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionPointLine(
    point: Vector2,
    p1: Vector2,
    p2: Vector2,
    threshold: CInt
)(using Zone): Boolean =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_0 + 0) = point
  !(__ptr_0 + 1) = p1
  !(__ptr_0 + 2) = p2
  __sn_wrap_raylib_CheckCollisionPointLine(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    threshold
  )
end CheckCollisionPointLine

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionPointLine(
    point: Ptr[Vector2],
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    threshold: CInt
): Boolean =
  __sn_wrap_raylib_CheckCollisionPointLine(point, p1, p2, threshold)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionPointPoly(
    point: Ptr[Vector2],
    points: Ptr[Vector2],
    pointCount: CInt
): Boolean =
  __sn_wrap_raylib_CheckCollisionPointPoly(point, points, pointCount)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionPointPoly(
    point: Vector2,
    points: Ptr[Vector2],
    pointCount: CInt
)(using Zone): Boolean =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_0 + 0) = point
  __sn_wrap_raylib_CheckCollisionPointPoly((__ptr_0 + 0), points, pointCount)
end CheckCollisionPointPoly

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionPointRec(point: Ptr[Vector2], rec: Ptr[Rectangle]): Boolean =
  __sn_wrap_raylib_CheckCollisionPointRec(point, rec)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionPointRec(point: Vector2, rec: Rectangle)(using
    Zone
): Boolean =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_0 + 0) = point
  !(__ptr_1 + 0) = rec
  __sn_wrap_raylib_CheckCollisionPointRec((__ptr_0 + 0), (__ptr_1 + 0))
end CheckCollisionPointRec

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionPointTriangle(
    point: Ptr[Vector2],
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2]
): Boolean =
  __sn_wrap_raylib_CheckCollisionPointTriangle(point, p1, p2, p3)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionPointTriangle(
    point: Vector2,
    p1: Vector2,
    p2: Vector2,
    p3: Vector2
)(using Zone): Boolean =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](4)
  !(__ptr_0 + 0) = point
  !(__ptr_0 + 1) = p1
  !(__ptr_0 + 2) = p2
  !(__ptr_0 + 3) = p3
  __sn_wrap_raylib_CheckCollisionPointTriangle(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    (__ptr_0 + 3)
  )
end CheckCollisionPointTriangle

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionRecs(rec1: Rectangle, rec2: Rectangle)(using Zone): Boolean =
  val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](2)
  !(__ptr_0 + 0) = rec1
  !(__ptr_0 + 1) = rec2
  __sn_wrap_raylib_CheckCollisionRecs((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionRecs(rec1: Ptr[Rectangle], rec2: Ptr[Rectangle]): Boolean =
  __sn_wrap_raylib_CheckCollisionRecs(rec1, rec2)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionSpheres(
    center1: Vector3,
    radius1: Float,
    center2: Vector3,
    radius2: Float
)(using Zone): Boolean =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = center1
  !(__ptr_0 + 1) = center2
  __sn_wrap_raylib_CheckCollisionSpheres(
    (__ptr_0 + 0),
    radius1,
    (__ptr_0 + 1),
    radius2
  )
end CheckCollisionSpheres

/** [bindgen] header: ./raylib/src/raylib.h
  */
def CheckCollisionSpheres(
    center1: Ptr[Vector3],
    radius1: Float,
    center2: Ptr[Vector3],
    radius2: Float
): Boolean =
  __sn_wrap_raylib_CheckCollisionSpheres(center1, radius1, center2, radius2)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ClearBackground(color: Ptr[Color]): Unit =
  __sn_wrap_raylib_ClearBackground(color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ClearBackground(color: Color)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ClearBackground((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorAlpha(color: Ptr[Color], alpha: Float)(__return: Ptr[Color]): Unit =
  __sn_wrap_raylib_ColorAlpha(color, alpha, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorAlpha(color: Ptr[Color], alpha: Float)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  __sn_wrap_raylib_ColorAlpha(color, alpha, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorAlpha(color: Color, alpha: Float)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ColorAlpha((__ptr_0 + 0), alpha, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorAlphaBlend(dst: Color, src: Color, tint: Color)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](4)
  !(__ptr_0 + 0) = dst
  !(__ptr_0 + 1) = src
  !(__ptr_0 + 2) = tint
  __sn_wrap_raylib_ColorAlphaBlend(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    (__ptr_0 + 3)
  )
  !(__ptr_0 + 3)
end ColorAlphaBlend

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorAlphaBlend(dst: Ptr[Color], src: Ptr[Color], tint: Ptr[Color])(using
    Zone
): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  __sn_wrap_raylib_ColorAlphaBlend(dst, src, tint, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorAlphaBlend(dst: Ptr[Color], src: Ptr[Color], tint: Ptr[Color])(
    __return: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ColorAlphaBlend(dst, src, tint, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorBrightness(color: Ptr[Color], factor: Float)(
    __return: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ColorBrightness(color, factor, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorBrightness(color: Ptr[Color], factor: Float)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  __sn_wrap_raylib_ColorBrightness(color, factor, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorBrightness(color: Color, factor: Float)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ColorBrightness((__ptr_0 + 0), factor, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorContrast(color: Color, contrast: Float)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ColorContrast((__ptr_0 + 0), contrast, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorContrast(color: Ptr[Color], contrast: Float)(
    __return: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ColorContrast(color, contrast, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorContrast(color: Ptr[Color], contrast: Float)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  __sn_wrap_raylib_ColorContrast(color, contrast, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorFromHSV(hue: Float, saturation: Float, value: Float)(
    __return: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ColorFromHSV(hue, saturation, value, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorFromHSV(hue: Float, saturation: Float, value: Float)(using
    Zone
): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  __sn_wrap_raylib_ColorFromHSV(hue, saturation, value, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorFromNormalized(normalized: Ptr[Vector4])(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  __sn_wrap_raylib_ColorFromNormalized(normalized, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorFromNormalized(normalized: Vector4)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector4] = alloc[Vector4](1)
  !(__ptr_1 + 0) = normalized
  __sn_wrap_raylib_ColorFromNormalized((__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorFromNormalized(normalized: Ptr[Vector4])(__return: Ptr[Color]): Unit =
  __sn_wrap_raylib_ColorFromNormalized(normalized, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorNormalize(color: Color)(using Zone): Vector4 =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector4] = alloc[Vector4](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ColorNormalize((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorNormalize(color: Ptr[Color])(__return: Ptr[Vector4]): Unit =
  __sn_wrap_raylib_ColorNormalize(color, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorNormalize(color: Ptr[Color])(using Zone): Vector4 =
  val __ptr_0: Ptr[Vector4] = alloc[Vector4](1)
  __sn_wrap_raylib_ColorNormalize(color, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorTint(color: Ptr[Color], tint: Ptr[Color])(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  __sn_wrap_raylib_ColorTint(color, tint, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorTint(color: Color, tint: Color)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](3)
  !(__ptr_0 + 0) = color
  !(__ptr_0 + 1) = tint
  __sn_wrap_raylib_ColorTint((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorTint(color: Ptr[Color], tint: Ptr[Color])(__return: Ptr[Color]): Unit =
  __sn_wrap_raylib_ColorTint(color, tint, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorToHSV(color: Color)(using Zone): Vector3 =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ColorToHSV((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorToHSV(color: Ptr[Color])(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_ColorToHSV(color, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorToHSV(color: Ptr[Color])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_ColorToHSV(color, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorToInt(color: Ptr[Color]): CInt =
  __sn_wrap_raylib_ColorToInt(color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ColorToInt(color: Color)(using Zone): CInt =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ColorToInt((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DetachAudioStreamProcessor(
    stream: Ptr[AudioStream],
    processor: AudioCallback
): Unit =
  __sn_wrap_raylib_DetachAudioStreamProcessor(stream, processor)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DetachAudioStreamProcessor(stream: AudioStream, processor: AudioCallback)(
    using Zone
): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_DetachAudioStreamProcessor((__ptr_0 + 0), processor)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawBillboard(
    camera: Camera,
    texture: Texture2D,
    position: Vector3,
    size: Float,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Texture2D] = alloc[Texture2D](1)
  val __ptr_2: Ptr[Camera] = alloc[Camera](1)
  val __ptr_3: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_2 + 0) = camera
  !(__ptr_1 + 0) = texture
  !(__ptr_3 + 0) = position
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawBillboard(
    (__ptr_2 + 0),
    (__ptr_1 + 0),
    (__ptr_3 + 0),
    size,
    (__ptr_0 + 0)
  )
end DrawBillboard

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawBillboard(
    camera: Ptr[Camera],
    texture: Ptr[Texture2D],
    position: Ptr[Vector3],
    size: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawBillboard(camera, texture, position, size, tint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawBillboardPro(
    camera: Ptr[Camera],
    texture: Ptr[Texture2D],
    source: Ptr[Rectangle],
    position: Ptr[Vector3],
    up: Ptr[Vector3],
    size: Ptr[Vector2],
    origin: Ptr[Vector2],
    rotation: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawBillboardPro(
    camera,
    texture,
    source,
    position,
    up,
    size,
    origin,
    rotation,
    tint
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawBillboardPro(
    camera: Camera,
    texture: Texture2D,
    source: Rectangle,
    position: Vector3,
    up: Vector3,
    size: Vector2,
    origin: Vector2,
    rotation: Float,
    tint: Color
)(using Zone): Unit =
  val __ptr_5: Ptr[Vector3] = alloc[Vector3](2)
  val __ptr_4: Ptr[Vector2] = alloc[Vector2](2)
  val __ptr_3: Ptr[Rectangle] = alloc[Rectangle](1)
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Texture2D] = alloc[Texture2D](1)
  val __ptr_2: Ptr[Camera] = alloc[Camera](1)
  !(__ptr_2 + 0) = camera
  !(__ptr_1 + 0) = texture
  !(__ptr_3 + 0) = source
  !(__ptr_5 + 0) = position
  !(__ptr_5 + 1) = up
  !(__ptr_4 + 0) = size
  !(__ptr_4 + 1) = origin
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawBillboardPro(
    (__ptr_2 + 0),
    (__ptr_1 + 0),
    (__ptr_3 + 0),
    (__ptr_5 + 0),
    (__ptr_5 + 1),
    (__ptr_4 + 0),
    (__ptr_4 + 1),
    rotation,
    (__ptr_0 + 0)
  )
end DrawBillboardPro

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawBillboardRec(
    camera: Ptr[Camera],
    texture: Ptr[Texture2D],
    source: Ptr[Rectangle],
    position: Ptr[Vector3],
    size: Ptr[Vector2],
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawBillboardRec(
    camera,
    texture,
    source,
    position,
    size,
    tint
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawBillboardRec(
    camera: Camera,
    texture: Texture2D,
    source: Rectangle,
    position: Vector3,
    size: Vector2,
    tint: Color
)(using Zone): Unit =
  val __ptr_5: Ptr[Vector3] = alloc[Vector3](1)
  val __ptr_4: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_3: Ptr[Rectangle] = alloc[Rectangle](1)
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Texture2D] = alloc[Texture2D](1)
  val __ptr_2: Ptr[Camera] = alloc[Camera](1)
  !(__ptr_2 + 0) = camera
  !(__ptr_1 + 0) = texture
  !(__ptr_3 + 0) = source
  !(__ptr_5 + 0) = position
  !(__ptr_4 + 0) = size
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawBillboardRec(
    (__ptr_2 + 0),
    (__ptr_1 + 0),
    (__ptr_3 + 0),
    (__ptr_5 + 0),
    (__ptr_4 + 0),
    (__ptr_0 + 0)
  )
end DrawBillboardRec

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawBoundingBox(box: BoundingBox, color: Color)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[BoundingBox] = alloc[BoundingBox](1)
  !(__ptr_1 + 0) = box
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawBoundingBox((__ptr_1 + 0), (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawBoundingBox(box: Ptr[BoundingBox], color: Ptr[Color]): Unit =
  __sn_wrap_raylib_DrawBoundingBox(box, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCapsule(
    startPos: Ptr[Vector3],
    endPos: Ptr[Vector3],
    radius: Float,
    slices: CInt,
    rings: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCapsule(startPos, endPos, radius, slices, rings, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCapsule(
    startPos: Vector3,
    endPos: Vector3,
    radius: Float,
    slices: CInt,
    rings: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_1 + 0) = startPos
  !(__ptr_1 + 1) = endPos
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCapsule(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    radius,
    slices,
    rings,
    (__ptr_0 + 0)
  )
end DrawCapsule

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCapsuleWires(
    startPos: Ptr[Vector3],
    endPos: Ptr[Vector3],
    radius: Float,
    slices: CInt,
    rings: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCapsuleWires(
    startPos,
    endPos,
    radius,
    slices,
    rings,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCapsuleWires(
    startPos: Vector3,
    endPos: Vector3,
    radius: Float,
    slices: CInt,
    rings: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_1 + 0) = startPos
  !(__ptr_1 + 1) = endPos
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCapsuleWires(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    radius,
    slices,
    rings,
    (__ptr_0 + 0)
  )
end DrawCapsuleWires

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircle(centerX: CInt, centerY: CInt, radius: Float, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCircle(centerX, centerY, radius, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircle(
    centerX: CInt,
    centerY: CInt,
    radius: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCircle(centerX, centerY, radius, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircle3D(
    center: Vector3,
    radius: Float,
    rotationAxis: Vector3,
    rotationAngle: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_1 + 0) = center
  !(__ptr_1 + 1) = rotationAxis
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCircle3D(
    (__ptr_1 + 0),
    radius,
    (__ptr_1 + 1),
    rotationAngle,
    (__ptr_0 + 0)
  )
end DrawCircle3D

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircle3D(
    center: Ptr[Vector3],
    radius: Float,
    rotationAxis: Ptr[Vector3],
    rotationAngle: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCircle3D(
    center,
    radius,
    rotationAxis,
    rotationAngle,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleGradient(
    centerX: CInt,
    centerY: CInt,
    radius: Float,
    color1: Ptr[Color],
    color2: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCircleGradient(centerX, centerY, radius, color1, color2)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleGradient(
    centerX: CInt,
    centerY: CInt,
    radius: Float,
    color1: Color,
    color2: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  !(__ptr_0 + 0) = color1
  !(__ptr_0 + 1) = color2
  __sn_wrap_raylib_DrawCircleGradient(
    centerX,
    centerY,
    radius,
    (__ptr_0 + 0),
    (__ptr_0 + 1)
  )
end DrawCircleGradient

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleLines(
    centerX: CInt,
    centerY: CInt,
    radius: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCircleLines(centerX, centerY, radius, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleLines(centerX: CInt, centerY: CInt, radius: Float, color: Color)(
    using Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCircleLines(centerX, centerY, radius, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleLinesV(
    center: Ptr[Vector2],
    radius: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCircleLinesV(center, radius, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleLinesV(center: Vector2, radius: Float, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = center
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCircleLinesV((__ptr_1 + 0), radius, (__ptr_0 + 0))
end DrawCircleLinesV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleSector(
    center: Ptr[Vector2],
    radius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCircleSector(
    center,
    radius,
    startAngle,
    endAngle,
    segments,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleSector(
    center: Vector2,
    radius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = center
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCircleSector(
    (__ptr_1 + 0),
    radius,
    startAngle,
    endAngle,
    segments,
    (__ptr_0 + 0)
  )
end DrawCircleSector

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleSectorLines(
    center: Vector2,
    radius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = center
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCircleSectorLines(
    (__ptr_1 + 0),
    radius,
    startAngle,
    endAngle,
    segments,
    (__ptr_0 + 0)
  )
end DrawCircleSectorLines

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleSectorLines(
    center: Ptr[Vector2],
    radius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCircleSectorLines(
    center,
    radius,
    startAngle,
    endAngle,
    segments,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleV(center: Ptr[Vector2], radius: Float, color: Ptr[Color]): Unit =
  __sn_wrap_raylib_DrawCircleV(center, radius, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCircleV(center: Vector2, radius: Float, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = center
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCircleV((__ptr_1 + 0), radius, (__ptr_0 + 0))
end DrawCircleV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCube(
    position: Vector3,
    width: Float,
    height: Float,
    length: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCube((__ptr_1 + 0), width, height, length, (__ptr_0 + 0))
end DrawCube

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCube(
    position: Ptr[Vector3],
    width: Float,
    height: Float,
    length: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCube(position, width, height, length, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCubeV(position: Vector3, size: Vector3, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_1 + 0) = position
  !(__ptr_1 + 1) = size
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCubeV((__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 0))
end DrawCubeV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCubeV(
    position: Ptr[Vector3],
    size: Ptr[Vector3],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCubeV(position, size, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCubeWires(
    position: Vector3,
    width: Float,
    height: Float,
    length: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCubeWires(
    (__ptr_1 + 0),
    width,
    height,
    length,
    (__ptr_0 + 0)
  )
end DrawCubeWires

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCubeWires(
    position: Ptr[Vector3],
    width: Float,
    height: Float,
    length: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCubeWires(position, width, height, length, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCubeWiresV(position: Vector3, size: Vector3, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_1 + 0) = position
  !(__ptr_1 + 1) = size
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCubeWiresV((__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 0))
end DrawCubeWiresV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCubeWiresV(
    position: Ptr[Vector3],
    size: Ptr[Vector3],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCubeWiresV(position, size, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCylinder(
    position: Vector3,
    radiusTop: Float,
    radiusBottom: Float,
    height: Float,
    slices: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCylinder(
    (__ptr_1 + 0),
    radiusTop,
    radiusBottom,
    height,
    slices,
    (__ptr_0 + 0)
  )
end DrawCylinder

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCylinder(
    position: Ptr[Vector3],
    radiusTop: Float,
    radiusBottom: Float,
    height: Float,
    slices: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCylinder(
    position,
    radiusTop,
    radiusBottom,
    height,
    slices,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCylinderEx(
    startPos: Vector3,
    endPos: Vector3,
    startRadius: Float,
    endRadius: Float,
    sides: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_1 + 0) = startPos
  !(__ptr_1 + 1) = endPos
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCylinderEx(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    startRadius,
    endRadius,
    sides,
    (__ptr_0 + 0)
  )
end DrawCylinderEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCylinderEx(
    startPos: Ptr[Vector3],
    endPos: Ptr[Vector3],
    startRadius: Float,
    endRadius: Float,
    sides: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCylinderEx(
    startPos,
    endPos,
    startRadius,
    endRadius,
    sides,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCylinderWires(
    position: Ptr[Vector3],
    radiusTop: Float,
    radiusBottom: Float,
    height: Float,
    slices: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCylinderWires(
    position,
    radiusTop,
    radiusBottom,
    height,
    slices,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCylinderWires(
    position: Vector3,
    radiusTop: Float,
    radiusBottom: Float,
    height: Float,
    slices: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCylinderWires(
    (__ptr_1 + 0),
    radiusTop,
    radiusBottom,
    height,
    slices,
    (__ptr_0 + 0)
  )
end DrawCylinderWires

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCylinderWiresEx(
    startPos: Ptr[Vector3],
    endPos: Ptr[Vector3],
    startRadius: Float,
    endRadius: Float,
    sides: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawCylinderWiresEx(
    startPos,
    endPos,
    startRadius,
    endRadius,
    sides,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawCylinderWiresEx(
    startPos: Vector3,
    endPos: Vector3,
    startRadius: Float,
    endRadius: Float,
    sides: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_1 + 0) = startPos
  !(__ptr_1 + 1) = endPos
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawCylinderWiresEx(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    startRadius,
    endRadius,
    sides,
    (__ptr_0 + 0)
  )
end DrawCylinderWiresEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawEllipse(
    centerX: CInt,
    centerY: CInt,
    radiusH: Float,
    radiusV: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawEllipse(centerX, centerY, radiusH, radiusV, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawEllipse(
    centerX: CInt,
    centerY: CInt,
    radiusH: Float,
    radiusV: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawEllipse(
    centerX,
    centerY,
    radiusH,
    radiusV,
    (__ptr_0 + 0)
  )
end DrawEllipse

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawEllipseLines(
    centerX: CInt,
    centerY: CInt,
    radiusH: Float,
    radiusV: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawEllipseLines(centerX, centerY, radiusH, radiusV, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawEllipseLines(
    centerX: CInt,
    centerY: CInt,
    radiusH: Float,
    radiusV: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawEllipseLines(
    centerX,
    centerY,
    radiusH,
    radiusV,
    (__ptr_0 + 0)
  )
end DrawEllipseLines

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLine(
    startPosX: CInt,
    startPosY: CInt,
    endPosX: CInt,
    endPosY: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawLine(startPosX, startPosY, endPosX, endPosY, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLine(
    startPosX: CInt,
    startPosY: CInt,
    endPosX: CInt,
    endPosY: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawLine(
    startPosX,
    startPosY,
    endPosX,
    endPosY,
    (__ptr_0 + 0)
  )
end DrawLine

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLine3D(startPos: Vector3, endPos: Vector3, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_1 + 0) = startPos
  !(__ptr_1 + 1) = endPos
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawLine3D((__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 0))
end DrawLine3D

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLine3D(
    startPos: Ptr[Vector3],
    endPos: Ptr[Vector3],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawLine3D(startPos, endPos, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLineBezier(
    startPos: Ptr[Vector2],
    endPos: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawLineBezier(startPos, endPos, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLineBezier(
    startPos: Vector2,
    endPos: Vector2,
    thick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_1 + 0) = startPos
  !(__ptr_1 + 1) = endPos
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawLineBezier(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    thick,
    (__ptr_0 + 0)
  )
end DrawLineBezier

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLineEx(startPos: Vector2, endPos: Vector2, thick: Float, color: Color)(
    using Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_1 + 0) = startPos
  !(__ptr_1 + 1) = endPos
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawLineEx(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    thick,
    (__ptr_0 + 0)
  )
end DrawLineEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLineEx(
    startPos: Ptr[Vector2],
    endPos: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawLineEx(startPos, endPos, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLineStrip(points: Ptr[Vector2], pointCount: CInt, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawLineStrip(points, pointCount, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLineStrip(
    points: Ptr[Vector2],
    pointCount: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawLineStrip(points, pointCount, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLineV(startPos: Vector2, endPos: Vector2, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_1 + 0) = startPos
  !(__ptr_1 + 1) = endPos
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawLineV((__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 0))
end DrawLineV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawLineV(
    startPos: Ptr[Vector2],
    endPos: Ptr[Vector2],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawLineV(startPos, endPos, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawMesh(
    mesh: Ptr[Mesh],
    material: Ptr[Material],
    transform: Ptr[Matrix]
): Unit =
  __sn_wrap_raylib_DrawMesh(mesh, material, transform)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawMesh(mesh: Mesh, material: Material, transform: Matrix)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  val __ptr_1: Ptr[Material] = alloc[Material](1)
  val __ptr_2: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = mesh
  !(__ptr_1 + 0) = material
  !(__ptr_2 + 0) = transform
  __sn_wrap_raylib_DrawMesh((__ptr_0 + 0), (__ptr_1 + 0), (__ptr_2 + 0))
end DrawMesh

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawMeshInstanced(
    mesh: Mesh,
    material: Material,
    transforms: Ptr[Matrix],
    instances: CInt
)(using Zone): Unit =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  val __ptr_1: Ptr[Material] = alloc[Material](1)
  !(__ptr_0 + 0) = mesh
  !(__ptr_1 + 0) = material
  __sn_wrap_raylib_DrawMeshInstanced(
    (__ptr_0 + 0),
    (__ptr_1 + 0),
    transforms,
    instances
  )
end DrawMeshInstanced

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawMeshInstanced(
    mesh: Ptr[Mesh],
    material: Ptr[Material],
    transforms: Ptr[Matrix],
    instances: CInt
): Unit =
  __sn_wrap_raylib_DrawMeshInstanced(mesh, material, transforms, instances)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawModel(
    model: Ptr[Model],
    position: Ptr[Vector3],
    scale: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawModel(model, position, scale, tint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawModel(model: Model, position: Vector3, scale: Float, tint: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Model] = alloc[Model](1)
  val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_1 + 0) = model
  !(__ptr_2 + 0) = position
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawModel((__ptr_1 + 0), (__ptr_2 + 0), scale, (__ptr_0 + 0))
end DrawModel

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawModelEx(
    model: Ptr[Model],
    position: Ptr[Vector3],
    rotationAxis: Ptr[Vector3],
    rotationAngle: Float,
    scale: Ptr[Vector3],
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawModelEx(
    model,
    position,
    rotationAxis,
    rotationAngle,
    scale,
    tint
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawModelEx(
    model: Model,
    position: Vector3,
    rotationAxis: Vector3,
    rotationAngle: Float,
    scale: Vector3,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Model] = alloc[Model](1)
  val __ptr_2: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_1 + 0) = model
  !(__ptr_2 + 0) = position
  !(__ptr_2 + 1) = rotationAxis
  !(__ptr_2 + 2) = scale
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawModelEx(
    (__ptr_1 + 0),
    (__ptr_2 + 0),
    (__ptr_2 + 1),
    rotationAngle,
    (__ptr_2 + 2),
    (__ptr_0 + 0)
  )
end DrawModelEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawModelWires(
    model: Ptr[Model],
    position: Ptr[Vector3],
    scale: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawModelWires(model, position, scale, tint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawModelWires(model: Model, position: Vector3, scale: Float, tint: Color)(
    using Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Model] = alloc[Model](1)
  val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_1 + 0) = model
  !(__ptr_2 + 0) = position
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawModelWires(
    (__ptr_1 + 0),
    (__ptr_2 + 0),
    scale,
    (__ptr_0 + 0)
  )
end DrawModelWires

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawModelWiresEx(
    model: Ptr[Model],
    position: Ptr[Vector3],
    rotationAxis: Ptr[Vector3],
    rotationAngle: Float,
    scale: Ptr[Vector3],
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawModelWiresEx(
    model,
    position,
    rotationAxis,
    rotationAngle,
    scale,
    tint
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawModelWiresEx(
    model: Model,
    position: Vector3,
    rotationAxis: Vector3,
    rotationAngle: Float,
    scale: Vector3,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Model] = alloc[Model](1)
  val __ptr_2: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_1 + 0) = model
  !(__ptr_2 + 0) = position
  !(__ptr_2 + 1) = rotationAxis
  !(__ptr_2 + 2) = scale
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawModelWiresEx(
    (__ptr_1 + 0),
    (__ptr_2 + 0),
    (__ptr_2 + 1),
    rotationAngle,
    (__ptr_2 + 2),
    (__ptr_0 + 0)
  )
end DrawModelWiresEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPixel(posX: CInt, posY: CInt, color: Ptr[Color]): Unit =
  __sn_wrap_raylib_DrawPixel(posX, posY, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPixel(posX: CInt, posY: CInt, color: Color)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawPixel(posX, posY, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPixelV(position: Vector2, color: Color)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawPixelV((__ptr_1 + 0), (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPixelV(position: Ptr[Vector2], color: Ptr[Color]): Unit =
  __sn_wrap_raylib_DrawPixelV(position, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPlane(
    centerPos: Ptr[Vector3],
    size: Ptr[Vector2],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawPlane(centerPos, size, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPlane(centerPos: Vector3, size: Vector2, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_2 + 0) = centerPos
  !(__ptr_1 + 0) = size
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawPlane((__ptr_2 + 0), (__ptr_1 + 0), (__ptr_0 + 0))
end DrawPlane

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPoint3D(position: Vector3, color: Color)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawPoint3D((__ptr_1 + 0), (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPoint3D(position: Ptr[Vector3], color: Ptr[Color]): Unit =
  __sn_wrap_raylib_DrawPoint3D(position, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPoly(
    center: Vector2,
    sides: CInt,
    radius: Float,
    rotation: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = center
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawPoly(
    (__ptr_1 + 0),
    sides,
    radius,
    rotation,
    (__ptr_0 + 0)
  )
end DrawPoly

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPoly(
    center: Ptr[Vector2],
    sides: CInt,
    radius: Float,
    rotation: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawPoly(center, sides, radius, rotation, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPolyLines(
    center: Ptr[Vector2],
    sides: CInt,
    radius: Float,
    rotation: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawPolyLines(center, sides, radius, rotation, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPolyLines(
    center: Vector2,
    sides: CInt,
    radius: Float,
    rotation: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = center
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawPolyLines(
    (__ptr_1 + 0),
    sides,
    radius,
    rotation,
    (__ptr_0 + 0)
  )
end DrawPolyLines

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPolyLinesEx(
    center: Ptr[Vector2],
    sides: CInt,
    radius: Float,
    rotation: Float,
    lineThick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawPolyLinesEx(
    center,
    sides,
    radius,
    rotation,
    lineThick,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawPolyLinesEx(
    center: Vector2,
    sides: CInt,
    radius: Float,
    rotation: Float,
    lineThick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = center
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawPolyLinesEx(
    (__ptr_1 + 0),
    sides,
    radius,
    rotation,
    lineThick,
    (__ptr_0 + 0)
  )
end DrawPolyLinesEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRay(ray: Ptr[Ray], color: Ptr[Color]): Unit =
  __sn_wrap_raylib_DrawRay(ray, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRay(ray: Ray, color: Color)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Ray] = alloc[Ray](1)
  !(__ptr_1 + 0) = ray
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawRay((__ptr_1 + 0), (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangle(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRectangle(posX, posY, width, height, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangle(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawRectangle(posX, posY, width, height, (__ptr_0 + 0))
end DrawRectangle

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleGradientEx(
    rec: Ptr[Rectangle],
    col1: Ptr[Color],
    col2: Ptr[Color],
    col3: Ptr[Color],
    col4: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRectangleGradientEx(rec, col1, col2, col3, col4)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleGradientEx(
    rec: Rectangle,
    col1: Color,
    col2: Color,
    col3: Color,
    col4: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](4)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_1 + 0) = rec
  !(__ptr_0 + 0) = col1
  !(__ptr_0 + 1) = col2
  !(__ptr_0 + 2) = col3
  !(__ptr_0 + 3) = col4
  __sn_wrap_raylib_DrawRectangleGradientEx(
    (__ptr_1 + 0),
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    (__ptr_0 + 3)
  )
end DrawRectangleGradientEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleGradientH(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color1: Ptr[Color],
    color2: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRectangleGradientH(
    posX,
    posY,
    width,
    height,
    color1,
    color2
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleGradientH(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color1: Color,
    color2: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  !(__ptr_0 + 0) = color1
  !(__ptr_0 + 1) = color2
  __sn_wrap_raylib_DrawRectangleGradientH(
    posX,
    posY,
    width,
    height,
    (__ptr_0 + 0),
    (__ptr_0 + 1)
  )
end DrawRectangleGradientH

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleGradientV(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color1: Color,
    color2: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  !(__ptr_0 + 0) = color1
  !(__ptr_0 + 1) = color2
  __sn_wrap_raylib_DrawRectangleGradientV(
    posX,
    posY,
    width,
    height,
    (__ptr_0 + 0),
    (__ptr_0 + 1)
  )
end DrawRectangleGradientV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleGradientV(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color1: Ptr[Color],
    color2: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRectangleGradientV(
    posX,
    posY,
    width,
    height,
    color1,
    color2
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleLines(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRectangleLines(posX, posY, width, height, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleLines(
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawRectangleLines(posX, posY, width, height, (__ptr_0 + 0))
end DrawRectangleLines

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleLinesEx(
    rec: Ptr[Rectangle],
    lineThick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRectangleLinesEx(rec, lineThick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleLinesEx(rec: Rectangle, lineThick: Float, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_1 + 0) = rec
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawRectangleLinesEx((__ptr_1 + 0), lineThick, (__ptr_0 + 0))
end DrawRectangleLinesEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectanglePro(
    rec: Ptr[Rectangle],
    origin: Ptr[Vector2],
    rotation: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRectanglePro(rec, origin, rotation, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectanglePro(
    rec: Rectangle,
    origin: Vector2,
    rotation: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_2: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_2 + 0) = rec
  !(__ptr_1 + 0) = origin
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawRectanglePro(
    (__ptr_2 + 0),
    (__ptr_1 + 0),
    rotation,
    (__ptr_0 + 0)
  )
end DrawRectanglePro

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleRec(rec: Rectangle, color: Color)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_1 + 0) = rec
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawRectangleRec((__ptr_1 + 0), (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleRec(rec: Ptr[Rectangle], color: Ptr[Color]): Unit =
  __sn_wrap_raylib_DrawRectangleRec(rec, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleRounded(
    rec: Rectangle,
    roundness: Float,
    segments: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_1 + 0) = rec
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawRectangleRounded(
    (__ptr_1 + 0),
    roundness,
    segments,
    (__ptr_0 + 0)
  )
end DrawRectangleRounded

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleRounded(
    rec: Ptr[Rectangle],
    roundness: Float,
    segments: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRectangleRounded(rec, roundness, segments, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleRoundedLines(
    rec: Rectangle,
    roundness: Float,
    segments: CInt,
    lineThick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_1 + 0) = rec
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawRectangleRoundedLines(
    (__ptr_1 + 0),
    roundness,
    segments,
    lineThick,
    (__ptr_0 + 0)
  )
end DrawRectangleRoundedLines

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleRoundedLines(
    rec: Ptr[Rectangle],
    roundness: Float,
    segments: CInt,
    lineThick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRectangleRoundedLines(
    rec,
    roundness,
    segments,
    lineThick,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleV(position: Vector2, size: Vector2, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_1 + 0) = position
  !(__ptr_1 + 1) = size
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawRectangleV((__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 0))
end DrawRectangleV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRectangleV(
    position: Ptr[Vector2],
    size: Ptr[Vector2],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRectangleV(position, size, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRing(
    center: Ptr[Vector2],
    innerRadius: Float,
    outerRadius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRing(
    center,
    innerRadius,
    outerRadius,
    startAngle,
    endAngle,
    segments,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRing(
    center: Vector2,
    innerRadius: Float,
    outerRadius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = center
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawRing(
    (__ptr_1 + 0),
    innerRadius,
    outerRadius,
    startAngle,
    endAngle,
    segments,
    (__ptr_0 + 0)
  )
end DrawRing

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRingLines(
    center: Ptr[Vector2],
    innerRadius: Float,
    outerRadius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawRingLines(
    center,
    innerRadius,
    outerRadius,
    startAngle,
    endAngle,
    segments,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawRingLines(
    center: Vector2,
    innerRadius: Float,
    outerRadius: Float,
    startAngle: Float,
    endAngle: Float,
    segments: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = center
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawRingLines(
    (__ptr_1 + 0),
    innerRadius,
    outerRadius,
    startAngle,
    endAngle,
    segments,
    (__ptr_0 + 0)
  )
end DrawRingLines

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSphere(centerPos: Vector3, radius: Float, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_1 + 0) = centerPos
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSphere((__ptr_1 + 0), radius, (__ptr_0 + 0))
end DrawSphere

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSphere(
    centerPos: Ptr[Vector3],
    radius: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSphere(centerPos, radius, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSphereEx(
    centerPos: Vector3,
    radius: Float,
    rings: CInt,
    slices: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_1 + 0) = centerPos
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSphereEx(
    (__ptr_1 + 0),
    radius,
    rings,
    slices,
    (__ptr_0 + 0)
  )
end DrawSphereEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSphereEx(
    centerPos: Ptr[Vector3],
    radius: Float,
    rings: CInt,
    slices: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSphereEx(centerPos, radius, rings, slices, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSphereWires(
    centerPos: Vector3,
    radius: Float,
    rings: CInt,
    slices: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_1 + 0) = centerPos
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSphereWires(
    (__ptr_1 + 0),
    radius,
    rings,
    slices,
    (__ptr_0 + 0)
  )
end DrawSphereWires

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSphereWires(
    centerPos: Ptr[Vector3],
    radius: Float,
    rings: CInt,
    slices: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSphereWires(centerPos, radius, rings, slices, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineBasis(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSplineBasis(points, pointCount, thick, (__ptr_0 + 0))
end DrawSplineBasis

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineBasis(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSplineBasis(points, pointCount, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineBezierCubic(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSplineBezierCubic(
    points,
    pointCount,
    thick,
    (__ptr_0 + 0)
  )
end DrawSplineBezierCubic

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineBezierCubic(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSplineBezierCubic(points, pointCount, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineBezierQuadratic(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSplineBezierQuadratic(points, pointCount, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineBezierQuadratic(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSplineBezierQuadratic(
    points,
    pointCount,
    thick,
    (__ptr_0 + 0)
  )
end DrawSplineBezierQuadratic

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineCatmullRom(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSplineCatmullRom(points, pointCount, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineCatmullRom(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSplineCatmullRom(
    points,
    pointCount,
    thick,
    (__ptr_0 + 0)
  )
end DrawSplineCatmullRom

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineLinear(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSplineLinear(points, pointCount, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineLinear(
    points: Ptr[Vector2],
    pointCount: CInt,
    thick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSplineLinear(points, pointCount, thick, (__ptr_0 + 0))
end DrawSplineLinear

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineSegmentBasis(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2],
    p4: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSplineSegmentBasis(p1, p2, p3, p4, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineSegmentBasis(
    p1: Vector2,
    p2: Vector2,
    p3: Vector2,
    p4: Vector2,
    thick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](4)
  !(__ptr_1 + 0) = p1
  !(__ptr_1 + 1) = p2
  !(__ptr_1 + 2) = p3
  !(__ptr_1 + 3) = p4
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSplineSegmentBasis(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    (__ptr_1 + 2),
    (__ptr_1 + 3),
    thick,
    (__ptr_0 + 0)
  )
end DrawSplineSegmentBasis

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineSegmentBezierCubic(
    p1: Ptr[Vector2],
    c2: Ptr[Vector2],
    c3: Ptr[Vector2],
    p4: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSplineSegmentBezierCubic(p1, c2, c3, p4, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineSegmentBezierCubic(
    p1: Vector2,
    c2: Vector2,
    c3: Vector2,
    p4: Vector2,
    thick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](4)
  !(__ptr_1 + 0) = p1
  !(__ptr_1 + 1) = c2
  !(__ptr_1 + 2) = c3
  !(__ptr_1 + 3) = p4
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSplineSegmentBezierCubic(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    (__ptr_1 + 2),
    (__ptr_1 + 3),
    thick,
    (__ptr_0 + 0)
  )
end DrawSplineSegmentBezierCubic

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineSegmentBezierQuadratic(
    p1: Ptr[Vector2],
    c2: Ptr[Vector2],
    p3: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSplineSegmentBezierQuadratic(p1, c2, p3, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineSegmentBezierQuadratic(
    p1: Vector2,
    c2: Vector2,
    p3: Vector2,
    thick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_1 + 0) = p1
  !(__ptr_1 + 1) = c2
  !(__ptr_1 + 2) = p3
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSplineSegmentBezierQuadratic(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    (__ptr_1 + 2),
    thick,
    (__ptr_0 + 0)
  )
end DrawSplineSegmentBezierQuadratic

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineSegmentCatmullRom(
    p1: Vector2,
    p2: Vector2,
    p3: Vector2,
    p4: Vector2,
    thick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](4)
  !(__ptr_1 + 0) = p1
  !(__ptr_1 + 1) = p2
  !(__ptr_1 + 2) = p3
  !(__ptr_1 + 3) = p4
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSplineSegmentCatmullRom(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    (__ptr_1 + 2),
    (__ptr_1 + 3),
    thick,
    (__ptr_0 + 0)
  )
end DrawSplineSegmentCatmullRom

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineSegmentCatmullRom(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2],
    p4: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSplineSegmentCatmullRom(p1, p2, p3, p4, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineSegmentLinear(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    thick: Float,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawSplineSegmentLinear(p1, p2, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawSplineSegmentLinear(
    p1: Vector2,
    p2: Vector2,
    thick: Float,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_1 + 0) = p1
  !(__ptr_1 + 1) = p2
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawSplineSegmentLinear(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    thick,
    (__ptr_0 + 0)
  )
end DrawSplineSegmentLinear

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawText(
    text: CString,
    posX: CInt,
    posY: CInt,
    fontSize: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawText(text, posX, posY, fontSize, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawText(
    text: CString,
    posX: CInt,
    posY: CInt,
    fontSize: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawText(text, posX, posY, fontSize, (__ptr_0 + 0))
end DrawText

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextCodepoint(
    font: Font,
    codepoint: CInt,
    position: Vector2,
    fontSize: Float,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_2: Ptr[Font] = alloc[Font](1)
  !(__ptr_2 + 0) = font
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawTextCodepoint(
    (__ptr_2 + 0),
    codepoint,
    (__ptr_1 + 0),
    fontSize,
    (__ptr_0 + 0)
  )
end DrawTextCodepoint

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextCodepoint(
    font: Ptr[Font],
    codepoint: CInt,
    position: Ptr[Vector2],
    fontSize: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTextCodepoint(font, codepoint, position, fontSize, tint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextCodepoints(
    font: Ptr[Font],
    codepoints: Ptr[CInt],
    codepointCount: CInt,
    position: Ptr[Vector2],
    fontSize: Float,
    spacing: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTextCodepoints(
    font,
    codepoints,
    codepointCount,
    position,
    fontSize,
    spacing,
    tint
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextCodepoints(
    font: Font,
    codepoints: Ptr[CInt],
    codepointCount: CInt,
    position: Vector2,
    fontSize: Float,
    spacing: Float,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_2: Ptr[Font] = alloc[Font](1)
  !(__ptr_2 + 0) = font
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawTextCodepoints(
    (__ptr_2 + 0),
    codepoints,
    codepointCount,
    (__ptr_1 + 0),
    fontSize,
    spacing,
    (__ptr_0 + 0)
  )
end DrawTextCodepoints

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextEx(
    font: Ptr[Font],
    text: CString,
    position: Ptr[Vector2],
    fontSize: Float,
    spacing: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTextEx(font, text, position, fontSize, spacing, tint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextEx(
    font: Font,
    text: CString,
    position: Vector2,
    fontSize: Float,
    spacing: Float,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_2: Ptr[Font] = alloc[Font](1)
  !(__ptr_2 + 0) = font
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawTextEx(
    (__ptr_2 + 0),
    text,
    (__ptr_1 + 0),
    fontSize,
    spacing,
    (__ptr_0 + 0)
  )
end DrawTextEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextPro(
    font: Font,
    text: CString,
    position: Vector2,
    origin: Vector2,
    rotation: Float,
    fontSize: Float,
    spacing: Float,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
  val __ptr_2: Ptr[Font] = alloc[Font](1)
  !(__ptr_2 + 0) = font
  !(__ptr_1 + 0) = position
  !(__ptr_1 + 1) = origin
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawTextPro(
    (__ptr_2 + 0),
    text,
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    rotation,
    fontSize,
    spacing,
    (__ptr_0 + 0)
  )
end DrawTextPro

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextPro(
    font: Ptr[Font],
    text: CString,
    position: Ptr[Vector2],
    origin: Ptr[Vector2],
    rotation: Float,
    fontSize: Float,
    spacing: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTextPro(
    font,
    text,
    position,
    origin,
    rotation,
    fontSize,
    spacing,
    tint
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTexture(
    texture: Ptr[Texture2D],
    posX: CInt,
    posY: CInt,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTexture(texture, posX, posY, tint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTexture(texture: Texture2D, posX: CInt, posY: CInt, tint: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Texture2D] = alloc[Texture2D](1)
  !(__ptr_1 + 0) = texture
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawTexture((__ptr_1 + 0), posX, posY, (__ptr_0 + 0))
end DrawTexture

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextureEx(
    texture: Ptr[Texture2D],
    position: Ptr[Vector2],
    rotation: Float,
    scale: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTextureEx(texture, position, rotation, scale, tint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextureEx(
    texture: Texture2D,
    position: Vector2,
    rotation: Float,
    scale: Float,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_2: Ptr[Texture2D] = alloc[Texture2D](1)
  !(__ptr_2 + 0) = texture
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawTextureEx(
    (__ptr_2 + 0),
    (__ptr_1 + 0),
    rotation,
    scale,
    (__ptr_0 + 0)
  )
end DrawTextureEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextureNPatch(
    texture: Texture2D,
    nPatchInfo: NPatchInfo,
    dest: Rectangle,
    origin: Vector2,
    rotation: Float,
    tint: Color
)(using Zone): Unit =
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_4: Ptr[Rectangle] = alloc[Rectangle](1)
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_3: Ptr[Texture2D] = alloc[Texture2D](1)
  val __ptr_2: Ptr[NPatchInfo] = alloc[NPatchInfo](1)
  !(__ptr_3 + 0) = texture
  !(__ptr_2 + 0) = nPatchInfo
  !(__ptr_4 + 0) = dest
  !(__ptr_1 + 0) = origin
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawTextureNPatch(
    (__ptr_3 + 0),
    (__ptr_2 + 0),
    (__ptr_4 + 0),
    (__ptr_1 + 0),
    rotation,
    (__ptr_0 + 0)
  )
end DrawTextureNPatch

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextureNPatch(
    texture: Ptr[Texture2D],
    nPatchInfo: Ptr[NPatchInfo],
    dest: Ptr[Rectangle],
    origin: Ptr[Vector2],
    rotation: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTextureNPatch(
    texture,
    nPatchInfo,
    dest,
    origin,
    rotation,
    tint
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTexturePro(
    texture: Ptr[Texture2D],
    source: Ptr[Rectangle],
    dest: Ptr[Rectangle],
    origin: Ptr[Vector2],
    rotation: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTexturePro(texture, source, dest, origin, rotation, tint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTexturePro(
    texture: Texture2D,
    source: Rectangle,
    dest: Rectangle,
    origin: Vector2,
    rotation: Float,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_2: Ptr[Texture2D] = alloc[Texture2D](1)
  val __ptr_3: Ptr[Rectangle] = alloc[Rectangle](2)
  !(__ptr_2 + 0) = texture
  !(__ptr_3 + 0) = source
  !(__ptr_3 + 1) = dest
  !(__ptr_1 + 0) = origin
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawTexturePro(
    (__ptr_2 + 0),
    (__ptr_3 + 0),
    (__ptr_3 + 1),
    (__ptr_1 + 0),
    rotation,
    (__ptr_0 + 0)
  )
end DrawTexturePro

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextureRec(
    texture: Ptr[Texture2D],
    source: Ptr[Rectangle],
    position: Ptr[Vector2],
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTextureRec(texture, source, position, tint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextureRec(
    texture: Texture2D,
    source: Rectangle,
    position: Vector2,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_2: Ptr[Texture2D] = alloc[Texture2D](1)
  val __ptr_3: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_2 + 0) = texture
  !(__ptr_3 + 0) = source
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawTextureRec(
    (__ptr_2 + 0),
    (__ptr_3 + 0),
    (__ptr_1 + 0),
    (__ptr_0 + 0)
  )
end DrawTextureRec

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextureV(texture: Texture2D, position: Vector2, tint: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_2: Ptr[Texture2D] = alloc[Texture2D](1)
  !(__ptr_2 + 0) = texture
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_DrawTextureV((__ptr_2 + 0), (__ptr_1 + 0), (__ptr_0 + 0))
end DrawTextureV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTextureV(
    texture: Ptr[Texture2D],
    position: Ptr[Vector2],
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTextureV(texture, position, tint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangle(v1: Vector2, v2: Vector2, v3: Vector2, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_1 + 0) = v1
  !(__ptr_1 + 1) = v2
  !(__ptr_1 + 2) = v3
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawTriangle(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    (__ptr_1 + 2),
    (__ptr_0 + 0)
  )
end DrawTriangle

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangle(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2],
    v3: Ptr[Vector2],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTriangle(v1, v2, v3, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangle3D(
    v1: Ptr[Vector3],
    v2: Ptr[Vector3],
    v3: Ptr[Vector3],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTriangle3D(v1, v2, v3, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangle3D(v1: Vector3, v2: Vector3, v3: Vector3, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_1 + 0) = v1
  !(__ptr_1 + 1) = v2
  !(__ptr_1 + 2) = v3
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawTriangle3D(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    (__ptr_1 + 2),
    (__ptr_0 + 0)
  )
end DrawTriangle3D

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangleFan(
    points: Ptr[Vector2],
    pointCount: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTriangleFan(points, pointCount, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangleFan(points: Ptr[Vector2], pointCount: CInt, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawTriangleFan(points, pointCount, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangleLines(v1: Vector2, v2: Vector2, v3: Vector2, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_1 + 0) = v1
  !(__ptr_1 + 1) = v2
  !(__ptr_1 + 2) = v3
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawTriangleLines(
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    (__ptr_1 + 2),
    (__ptr_0 + 0)
  )
end DrawTriangleLines

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangleLines(
    v1: Ptr[Vector2],
    v2: Ptr[Vector2],
    v3: Ptr[Vector2],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTriangleLines(v1, v2, v3, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangleStrip(points: Ptr[Vector2], pointCount: CInt, color: Color)(
    using Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawTriangleStrip(points, pointCount, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangleStrip(
    points: Ptr[Vector2],
    pointCount: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTriangleStrip(points, pointCount, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangleStrip3D(points: Ptr[Vector3], pointCount: CInt, color: Color)(
    using Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_DrawTriangleStrip3D(points, pointCount, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def DrawTriangleStrip3D(
    points: Ptr[Vector3],
    pointCount: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_DrawTriangleStrip3D(points, pointCount, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportAutomationEventList(
    list: Ptr[AutomationEventList],
    fileName: CString
): Boolean =
  __sn_wrap_raylib_ExportAutomationEventList(list, fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportAutomationEventList(list: AutomationEventList, fileName: CString)(
    using Zone
): Boolean =
  val __ptr_0: Ptr[AutomationEventList] = alloc[AutomationEventList](1)
  !(__ptr_0 + 0) = list
  __sn_wrap_raylib_ExportAutomationEventList((__ptr_0 + 0), fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportFontAsCode(font: Ptr[Font], fileName: CString): Boolean =
  __sn_wrap_raylib_ExportFontAsCode(font, fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportFontAsCode(font: Font, fileName: CString)(using Zone): Boolean =
  val __ptr_0: Ptr[Font] = alloc[Font](1)
  !(__ptr_0 + 0) = font
  __sn_wrap_raylib_ExportFontAsCode((__ptr_0 + 0), fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportImage(image: Ptr[Image], fileName: CString): Boolean =
  __sn_wrap_raylib_ExportImage(image, fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportImage(image: Image, fileName: CString)(using Zone): Boolean =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = image
  __sn_wrap_raylib_ExportImage((__ptr_0 + 0), fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportImageAsCode(image: Ptr[Image], fileName: CString): Boolean =
  __sn_wrap_raylib_ExportImageAsCode(image, fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportImageAsCode(image: Image, fileName: CString)(using Zone): Boolean =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = image
  __sn_wrap_raylib_ExportImageAsCode((__ptr_0 + 0), fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportImageToMemory(image: Image, fileType: CString, fileSize: Ptr[CInt])(
    using Zone
): Ptr[CUnsignedChar] =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = image
  __sn_wrap_raylib_ExportImageToMemory((__ptr_0 + 0), fileType, fileSize)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportImageToMemory(
    image: Ptr[Image],
    fileType: CString,
    fileSize: Ptr[CInt]
): Ptr[CUnsignedChar] =
  __sn_wrap_raylib_ExportImageToMemory(image, fileType, fileSize)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportMesh(mesh: Ptr[Mesh], fileName: CString): Boolean =
  __sn_wrap_raylib_ExportMesh(mesh, fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportMesh(mesh: Mesh, fileName: CString)(using Zone): Boolean =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  !(__ptr_0 + 0) = mesh
  __sn_wrap_raylib_ExportMesh((__ptr_0 + 0), fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportWave(wave: Ptr[Wave], fileName: CString): Boolean =
  __sn_wrap_raylib_ExportWave(wave, fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportWave(wave: Wave, fileName: CString)(using Zone): Boolean =
  val __ptr_0: Ptr[Wave] = alloc[Wave](1)
  !(__ptr_0 + 0) = wave
  __sn_wrap_raylib_ExportWave((__ptr_0 + 0), fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportWaveAsCode(wave: Wave, fileName: CString)(using Zone): Boolean =
  val __ptr_0: Ptr[Wave] = alloc[Wave](1)
  !(__ptr_0 + 0) = wave
  __sn_wrap_raylib_ExportWaveAsCode((__ptr_0 + 0), fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ExportWaveAsCode(wave: Ptr[Wave], fileName: CString): Boolean =
  __sn_wrap_raylib_ExportWaveAsCode(wave, fileName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def Fade(color: Color, alpha: Float)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_Fade((__ptr_0 + 0), alpha, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def Fade(color: Ptr[Color], alpha: Float)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  __sn_wrap_raylib_Fade(color, alpha, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def Fade(color: Ptr[Color], alpha: Float)(__return: Ptr[Color]): Unit =
  __sn_wrap_raylib_Fade(color, alpha, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageCellular(width: CInt, height: CInt, tileSize: CInt)(using
    Zone
): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_GenImageCellular(width, height, tileSize, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageCellular(width: CInt, height: CInt, tileSize: CInt)(
    __return: Ptr[Image]
): Unit =
  __sn_wrap_raylib_GenImageCellular(width, height, tileSize, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageChecked(
    width: CInt,
    height: CInt,
    checksX: CInt,
    checksY: CInt,
    col1: Color,
    col2: Color
)(using Zone): Image =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  val __ptr_1: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = col1
  !(__ptr_0 + 1) = col2
  __sn_wrap_raylib_GenImageChecked(
    width,
    height,
    checksX,
    checksY,
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_1 + 0)
  )
  !(__ptr_1 + 0)
end GenImageChecked

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageChecked(
    width: CInt,
    height: CInt,
    checksX: CInt,
    checksY: CInt,
    col1: Ptr[Color],
    col2: Ptr[Color]
)(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_GenImageChecked(
    width,
    height,
    checksX,
    checksY,
    col1,
    col2,
    __return
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageChecked(
    width: CInt,
    height: CInt,
    checksX: CInt,
    checksY: CInt,
    col1: Ptr[Color],
    col2: Ptr[Color]
)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_GenImageChecked(
    width,
    height,
    checksX,
    checksY,
    col1,
    col2,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end GenImageChecked

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageColor(width: CInt, height: CInt, color: Ptr[Color])(
    __return: Ptr[Image]
): Unit =
  __sn_wrap_raylib_GenImageColor(width, height, color, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageColor(width: CInt, height: CInt, color: Ptr[Color])(using
    Zone
): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_GenImageColor(width, height, color, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageColor(width: CInt, height: CInt, color: Color)(using Zone): Image =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_GenImageColor(width, height, (__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageFontAtlas(
    glyphs: Ptr[GlyphInfo],
    glyphRecs: Ptr[Ptr[Rectangle]],
    glyphCount: CInt,
    fontSize: CInt,
    padding: CInt,
    packMethod: CInt
)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_GenImageFontAtlas(
    glyphs,
    glyphRecs,
    glyphCount,
    fontSize,
    padding,
    packMethod,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end GenImageFontAtlas

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageFontAtlas(
    glyphs: Ptr[GlyphInfo],
    glyphRecs: Ptr[Ptr[Rectangle]],
    glyphCount: CInt,
    fontSize: CInt,
    padding: CInt,
    packMethod: CInt
)(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_GenImageFontAtlas(
    glyphs,
    glyphRecs,
    glyphCount,
    fontSize,
    padding,
    packMethod,
    __return
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageGradientLinear(
    width: CInt,
    height: CInt,
    direction: CInt,
    start: Ptr[Color],
    end: Ptr[Color]
)(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_GenImageGradientLinear(
    width,
    height,
    direction,
    start,
    end,
    __return
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageGradientLinear(
    width: CInt,
    height: CInt,
    direction: CInt,
    start: Ptr[Color],
    end: Ptr[Color]
)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_GenImageGradientLinear(
    width,
    height,
    direction,
    start,
    end,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end GenImageGradientLinear

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageGradientLinear(
    width: CInt,
    height: CInt,
    direction: CInt,
    start: Color,
    end: Color
)(using Zone): Image =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  val __ptr_1: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = start
  !(__ptr_0 + 1) = end
  __sn_wrap_raylib_GenImageGradientLinear(
    width,
    height,
    direction,
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_1 + 0)
  )
  !(__ptr_1 + 0)
end GenImageGradientLinear

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageGradientRadial(
    width: CInt,
    height: CInt,
    density: Float,
    inner: Ptr[Color],
    outer: Ptr[Color]
)(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_GenImageGradientRadial(
    width,
    height,
    density,
    inner,
    outer,
    __return
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageGradientRadial(
    width: CInt,
    height: CInt,
    density: Float,
    inner: Ptr[Color],
    outer: Ptr[Color]
)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_GenImageGradientRadial(
    width,
    height,
    density,
    inner,
    outer,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end GenImageGradientRadial

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageGradientRadial(
    width: CInt,
    height: CInt,
    density: Float,
    inner: Color,
    outer: Color
)(using Zone): Image =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  val __ptr_1: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = inner
  !(__ptr_0 + 1) = outer
  __sn_wrap_raylib_GenImageGradientRadial(
    width,
    height,
    density,
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_1 + 0)
  )
  !(__ptr_1 + 0)
end GenImageGradientRadial

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageGradientSquare(
    width: CInt,
    height: CInt,
    density: Float,
    inner: Color,
    outer: Color
)(using Zone): Image =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  val __ptr_1: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = inner
  !(__ptr_0 + 1) = outer
  __sn_wrap_raylib_GenImageGradientSquare(
    width,
    height,
    density,
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_1 + 0)
  )
  !(__ptr_1 + 0)
end GenImageGradientSquare

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageGradientSquare(
    width: CInt,
    height: CInt,
    density: Float,
    inner: Ptr[Color],
    outer: Ptr[Color]
)(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_GenImageGradientSquare(
    width,
    height,
    density,
    inner,
    outer,
    __return
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageGradientSquare(
    width: CInt,
    height: CInt,
    density: Float,
    inner: Ptr[Color],
    outer: Ptr[Color]
)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_GenImageGradientSquare(
    width,
    height,
    density,
    inner,
    outer,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end GenImageGradientSquare

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImagePerlinNoise(
    width: CInt,
    height: CInt,
    offsetX: CInt,
    offsetY: CInt,
    scale: Float
)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_GenImagePerlinNoise(
    width,
    height,
    offsetX,
    offsetY,
    scale,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end GenImagePerlinNoise

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImagePerlinNoise(
    width: CInt,
    height: CInt,
    offsetX: CInt,
    offsetY: CInt,
    scale: Float
)(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_GenImagePerlinNoise(
    width,
    height,
    offsetX,
    offsetY,
    scale,
    __return
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageText(width: CInt, height: CInt, text: CString)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_GenImageText(width, height, text, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageText(width: CInt, height: CInt, text: CString)(
    __return: Ptr[Image]
): Unit =
  __sn_wrap_raylib_GenImageText(width, height, text, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageWhiteNoise(width: CInt, height: CInt, factor: Float)(using
    Zone
): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_GenImageWhiteNoise(width, height, factor, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenImageWhiteNoise(width: CInt, height: CInt, factor: Float)(
    __return: Ptr[Image]
): Unit =
  __sn_wrap_raylib_GenImageWhiteNoise(width, height, factor, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshCone(radius: Float, height: Float, slices: CInt)(using Zone): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  __sn_wrap_raylib_GenMeshCone(radius, height, slices, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshCone(radius: Float, height: Float, slices: CInt)(
    __return: Ptr[Mesh]
): Unit =
  __sn_wrap_raylib_GenMeshCone(radius, height, slices, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshCube(width: Float, height: Float, length: Float)(using Zone): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  __sn_wrap_raylib_GenMeshCube(width, height, length, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshCube(width: Float, height: Float, length: Float)(
    __return: Ptr[Mesh]
): Unit =
  __sn_wrap_raylib_GenMeshCube(width, height, length, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshCubicmap(cubicmap: Image, cubeSize: Vector3)(using Zone): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  val __ptr_2: Ptr[Image] = alloc[Image](1)
  !(__ptr_2 + 0) = cubicmap
  !(__ptr_1 + 0) = cubeSize
  __sn_wrap_raylib_GenMeshCubicmap((__ptr_2 + 0), (__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)
end GenMeshCubicmap

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshCubicmap(cubicmap: Ptr[Image], cubeSize: Ptr[Vector3])(
    __return: Ptr[Mesh]
): Unit =
  __sn_wrap_raylib_GenMeshCubicmap(cubicmap, cubeSize, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshCubicmap(cubicmap: Ptr[Image], cubeSize: Ptr[Vector3])(using
    Zone
): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  __sn_wrap_raylib_GenMeshCubicmap(cubicmap, cubeSize, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshCylinder(radius: Float, height: Float, slices: CInt)(
    __return: Ptr[Mesh]
): Unit =
  __sn_wrap_raylib_GenMeshCylinder(radius, height, slices, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshCylinder(radius: Float, height: Float, slices: CInt)(using
    Zone
): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  __sn_wrap_raylib_GenMeshCylinder(radius, height, slices, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshHeightmap(heightmap: Image, size: Vector3)(using Zone): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  val __ptr_2: Ptr[Image] = alloc[Image](1)
  !(__ptr_2 + 0) = heightmap
  !(__ptr_1 + 0) = size
  __sn_wrap_raylib_GenMeshHeightmap((__ptr_2 + 0), (__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)
end GenMeshHeightmap

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshHeightmap(heightmap: Ptr[Image], size: Ptr[Vector3])(using
    Zone
): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  __sn_wrap_raylib_GenMeshHeightmap(heightmap, size, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshHeightmap(heightmap: Ptr[Image], size: Ptr[Vector3])(
    __return: Ptr[Mesh]
): Unit =
  __sn_wrap_raylib_GenMeshHeightmap(heightmap, size, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshHemiSphere(radius: Float, rings: CInt, slices: CInt)(
    __return: Ptr[Mesh]
): Unit =
  __sn_wrap_raylib_GenMeshHemiSphere(radius, rings, slices, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshHemiSphere(radius: Float, rings: CInt, slices: CInt)(using
    Zone
): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  __sn_wrap_raylib_GenMeshHemiSphere(radius, rings, slices, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshKnot(radius: Float, size: Float, radSeg: CInt, sides: CInt)(
    __return: Ptr[Mesh]
): Unit =
  __sn_wrap_raylib_GenMeshKnot(radius, size, radSeg, sides, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshKnot(radius: Float, size: Float, radSeg: CInt, sides: CInt)(using
    Zone
): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  __sn_wrap_raylib_GenMeshKnot(radius, size, radSeg, sides, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshPlane(width: Float, length: Float, resX: CInt, resZ: CInt)(using
    Zone
): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  __sn_wrap_raylib_GenMeshPlane(width, length, resX, resZ, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshPlane(width: Float, length: Float, resX: CInt, resZ: CInt)(
    __return: Ptr[Mesh]
): Unit =
  __sn_wrap_raylib_GenMeshPlane(width, length, resX, resZ, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshPoly(sides: CInt, radius: Float)(__return: Ptr[Mesh]): Unit =
  __sn_wrap_raylib_GenMeshPoly(sides, radius, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshPoly(sides: CInt, radius: Float)(using Zone): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  __sn_wrap_raylib_GenMeshPoly(sides, radius, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshSphere(radius: Float, rings: CInt, slices: CInt)(using Zone): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  __sn_wrap_raylib_GenMeshSphere(radius, rings, slices, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshSphere(radius: Float, rings: CInt, slices: CInt)(
    __return: Ptr[Mesh]
): Unit =
  __sn_wrap_raylib_GenMeshSphere(radius, rings, slices, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshTorus(radius: Float, size: Float, radSeg: CInt, sides: CInt)(using
    Zone
): Mesh =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  __sn_wrap_raylib_GenMeshTorus(radius, size, radSeg, sides, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GenMeshTorus(radius: Float, size: Float, radSeg: CInt, sides: CInt)(
    __return: Ptr[Mesh]
): Unit =
  __sn_wrap_raylib_GenMeshTorus(radius, size, radSeg, sides, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetCameraMatrix(camera: Camera)(using Zone): Matrix =
  val __ptr_0: Ptr[Camera] = alloc[Camera](1)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = camera
  __sn_wrap_raylib_GetCameraMatrix((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetCameraMatrix(camera: Ptr[Camera])(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_GetCameraMatrix(camera, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetCameraMatrix(camera: Ptr[Camera])(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_GetCameraMatrix(camera, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetCameraMatrix2D(camera: Camera2D)(using Zone): Matrix =
  val __ptr_0: Ptr[Camera2D] = alloc[Camera2D](1)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = camera
  __sn_wrap_raylib_GetCameraMatrix2D((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetCameraMatrix2D(camera: Ptr[Camera2D])(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_GetCameraMatrix2D(camera, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetCameraMatrix2D(camera: Ptr[Camera2D])(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_GetCameraMatrix2D(camera, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetCollisionRec(rec1: Rectangle, rec2: Rectangle)(using Zone): Rectangle =
  val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](3)
  !(__ptr_0 + 0) = rec1
  !(__ptr_0 + 1) = rec2
  __sn_wrap_raylib_GetCollisionRec((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetCollisionRec(rec1: Ptr[Rectangle], rec2: Ptr[Rectangle])(using
    Zone
): Rectangle =
  val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
  __sn_wrap_raylib_GetCollisionRec(rec1, rec2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetCollisionRec(rec1: Ptr[Rectangle], rec2: Ptr[Rectangle])(
    __return: Ptr[Rectangle]
): Unit =
  __sn_wrap_raylib_GetCollisionRec(rec1, rec2, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetColor(hexValue: CUnsignedInt)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  __sn_wrap_raylib_GetColor(hexValue, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetColor(hexValue: CUnsignedInt)(__return: Ptr[Color]): Unit =
  __sn_wrap_raylib_GetColor(hexValue, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetFontDefault()(using Zone): Font =
  val __ptr_0: Ptr[Font] = alloc[Font](1)
  __sn_wrap_raylib_GetFontDefault((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetFontDefault()(__return: Ptr[Font]): Unit =
  __sn_wrap_raylib_GetFontDefault(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGestureDragVector()(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetGestureDragVector((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGestureDragVector()(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetGestureDragVector(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGesturePinchVector()(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetGesturePinchVector((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGesturePinchVector()(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetGesturePinchVector(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGlyphAtlasRec(font: Font, codepoint: CInt)(using Zone): Rectangle =
  val __ptr_0: Ptr[Font] = alloc[Font](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_0 + 0) = font
  __sn_wrap_raylib_GetGlyphAtlasRec((__ptr_0 + 0), codepoint, (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGlyphAtlasRec(font: Ptr[Font], codepoint: CInt)(
    __return: Ptr[Rectangle]
): Unit =
  __sn_wrap_raylib_GetGlyphAtlasRec(font, codepoint, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGlyphAtlasRec(font: Ptr[Font], codepoint: CInt)(using Zone): Rectangle =
  val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
  __sn_wrap_raylib_GetGlyphAtlasRec(font, codepoint, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGlyphIndex(font: Font, codepoint: CInt)(using Zone): CInt =
  val __ptr_0: Ptr[Font] = alloc[Font](1)
  !(__ptr_0 + 0) = font
  __sn_wrap_raylib_GetGlyphIndex((__ptr_0 + 0), codepoint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGlyphIndex(font: Ptr[Font], codepoint: CInt): CInt =
  __sn_wrap_raylib_GetGlyphIndex(font, codepoint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGlyphInfo(font: Ptr[Font], codepoint: CInt)(
    __return: Ptr[GlyphInfo]
): Unit =
  __sn_wrap_raylib_GetGlyphInfo(font, codepoint, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGlyphInfo(font: Font, codepoint: CInt)(using Zone): GlyphInfo =
  val __ptr_0: Ptr[GlyphInfo] = alloc[GlyphInfo](1)
  val __ptr_1: Ptr[Font] = alloc[Font](1)
  !(__ptr_1 + 0) = font
  __sn_wrap_raylib_GetGlyphInfo((__ptr_1 + 0), codepoint, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetGlyphInfo(font: Ptr[Font], codepoint: CInt)(using Zone): GlyphInfo =
  val __ptr_0: Ptr[GlyphInfo] = alloc[GlyphInfo](1)
  __sn_wrap_raylib_GetGlyphInfo(font, codepoint, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetImageAlphaBorder(image: Ptr[Image], threshold: Float)(
    __return: Ptr[Rectangle]
): Unit =
  __sn_wrap_raylib_GetImageAlphaBorder(image, threshold, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetImageAlphaBorder(image: Ptr[Image], threshold: Float)(using
    Zone
): Rectangle =
  val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
  __sn_wrap_raylib_GetImageAlphaBorder(image, threshold, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetImageAlphaBorder(image: Image, threshold: Float)(using Zone): Rectangle =
  val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
  val __ptr_1: Ptr[Image] = alloc[Image](1)
  !(__ptr_1 + 0) = image
  __sn_wrap_raylib_GetImageAlphaBorder((__ptr_1 + 0), threshold, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetImageColor(image: Ptr[Image], x: CInt, y: CInt)(
    __return: Ptr[Color]
): Unit =
  __sn_wrap_raylib_GetImageColor(image, x, y, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetImageColor(image: Image, x: CInt, y: CInt)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Image] = alloc[Image](1)
  !(__ptr_1 + 0) = image
  __sn_wrap_raylib_GetImageColor((__ptr_1 + 0), x, y, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetImageColor(image: Ptr[Image], x: CInt, y: CInt)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  __sn_wrap_raylib_GetImageColor(image, x, y, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMeshBoundingBox(mesh: Ptr[Mesh])(__return: Ptr[BoundingBox]): Unit =
  __sn_wrap_raylib_GetMeshBoundingBox(mesh, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMeshBoundingBox(mesh: Mesh)(using Zone): BoundingBox =
  val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
  val __ptr_1: Ptr[Mesh] = alloc[Mesh](1)
  !(__ptr_1 + 0) = mesh
  __sn_wrap_raylib_GetMeshBoundingBox((__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMeshBoundingBox(mesh: Ptr[Mesh])(using Zone): BoundingBox =
  val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
  __sn_wrap_raylib_GetMeshBoundingBox(mesh, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetModelBoundingBox(model: Model)(using Zone): BoundingBox =
  val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
  val __ptr_1: Ptr[Model] = alloc[Model](1)
  !(__ptr_1 + 0) = model
  __sn_wrap_raylib_GetModelBoundingBox((__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetModelBoundingBox(model: Ptr[Model])(using Zone): BoundingBox =
  val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
  __sn_wrap_raylib_GetModelBoundingBox(model, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetModelBoundingBox(model: Ptr[Model])(__return: Ptr[BoundingBox]): Unit =
  __sn_wrap_raylib_GetModelBoundingBox(model, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMonitorPosition(monitor: CInt)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetMonitorPosition(monitor, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMonitorPosition(monitor: CInt)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetMonitorPosition(monitor, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMouseDelta()(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetMouseDelta((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMouseDelta()(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetMouseDelta(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMousePosition()(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetMousePosition(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMousePosition()(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetMousePosition((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMouseRay(mousePosition: Vector2, camera: Camera)(using Zone): Ray =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_1: Ptr[Ray] = alloc[Ray](1)
  val __ptr_2: Ptr[Camera] = alloc[Camera](1)
  !(__ptr_0 + 0) = mousePosition
  !(__ptr_2 + 0) = camera
  __sn_wrap_raylib_GetMouseRay((__ptr_0 + 0), (__ptr_2 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)
end GetMouseRay

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMouseRay(mousePosition: Ptr[Vector2], camera: Ptr[Camera])(using
    Zone
): Ray =
  val __ptr_0: Ptr[Ray] = alloc[Ray](1)
  __sn_wrap_raylib_GetMouseRay(mousePosition, camera, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMouseRay(mousePosition: Ptr[Vector2], camera: Ptr[Camera])(
    __return: Ptr[Ray]
): Unit =
  __sn_wrap_raylib_GetMouseRay(mousePosition, camera, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMouseWheelMoveV()(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetMouseWheelMoveV(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMouseWheelMoveV()(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetMouseWheelMoveV((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMusicTimeLength(music: Music)(using Zone): Float =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_GetMusicTimeLength((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMusicTimeLength(music: Ptr[Music]): Float =
  __sn_wrap_raylib_GetMusicTimeLength(music)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMusicTimePlayed(music: Music)(using Zone): Float =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_GetMusicTimePlayed((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetMusicTimePlayed(music: Ptr[Music]): Float =
  __sn_wrap_raylib_GetMusicTimePlayed(music)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetPixelColor(srcPtr: Ptr[Byte], format: CInt)(__return: Ptr[Color]): Unit =
  __sn_wrap_raylib_GetPixelColor(srcPtr, format, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetPixelColor(srcPtr: Ptr[Byte], format: CInt)(using Zone): Color =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  __sn_wrap_raylib_GetPixelColor(srcPtr, format, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionBox(ray: Ptr[Ray], box: Ptr[BoundingBox])(using
    Zone
): RayCollision =
  val __ptr_0: Ptr[RayCollision] = alloc[RayCollision](1)
  __sn_wrap_raylib_GetRayCollisionBox(ray, box, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionBox(ray: Ptr[Ray], box: Ptr[BoundingBox])(
    __return: Ptr[RayCollision]
): Unit =
  __sn_wrap_raylib_GetRayCollisionBox(ray, box, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionBox(ray: Ray, box: BoundingBox)(using Zone): RayCollision =
  val __ptr_0: Ptr[BoundingBox] = alloc[BoundingBox](1)
  val __ptr_1: Ptr[Ray] = alloc[Ray](1)
  val __ptr_2: Ptr[RayCollision] = alloc[RayCollision](1)
  !(__ptr_1 + 0) = ray
  !(__ptr_0 + 0) = box
  __sn_wrap_raylib_GetRayCollisionBox(
    (__ptr_1 + 0),
    (__ptr_0 + 0),
    (__ptr_2 + 0)
  )
  !(__ptr_2 + 0)
end GetRayCollisionBox

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionMesh(ray: Ptr[Ray], mesh: Ptr[Mesh], transform: Ptr[Matrix])(
    __return: Ptr[RayCollision]
): Unit =
  __sn_wrap_raylib_GetRayCollisionMesh(ray, mesh, transform, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionMesh(ray: Ptr[Ray], mesh: Ptr[Mesh], transform: Ptr[Matrix])(
    using Zone
): RayCollision =
  val __ptr_0: Ptr[RayCollision] = alloc[RayCollision](1)
  __sn_wrap_raylib_GetRayCollisionMesh(ray, mesh, transform, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionMesh(ray: Ray, mesh: Mesh, transform: Matrix)(using
    Zone
): RayCollision =
  val __ptr_0: Ptr[Ray] = alloc[Ray](1)
  val __ptr_1: Ptr[Mesh] = alloc[Mesh](1)
  val __ptr_2: Ptr[RayCollision] = alloc[RayCollision](1)
  val __ptr_3: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = ray
  !(__ptr_1 + 0) = mesh
  !(__ptr_3 + 0) = transform
  __sn_wrap_raylib_GetRayCollisionMesh(
    (__ptr_0 + 0),
    (__ptr_1 + 0),
    (__ptr_3 + 0),
    (__ptr_2 + 0)
  )
  !(__ptr_2 + 0)
end GetRayCollisionMesh

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionQuad(
    ray: Ray,
    p1: Vector3,
    p2: Vector3,
    p3: Vector3,
    p4: Vector3
)(using Zone): RayCollision =
  val __ptr_0: Ptr[Ray] = alloc[Ray](1)
  val __ptr_1: Ptr[RayCollision] = alloc[RayCollision](1)
  val __ptr_2: Ptr[Vector3] = alloc[Vector3](4)
  !(__ptr_0 + 0) = ray
  !(__ptr_2 + 0) = p1
  !(__ptr_2 + 1) = p2
  !(__ptr_2 + 2) = p3
  !(__ptr_2 + 3) = p4
  __sn_wrap_raylib_GetRayCollisionQuad(
    (__ptr_0 + 0),
    (__ptr_2 + 0),
    (__ptr_2 + 1),
    (__ptr_2 + 2),
    (__ptr_2 + 3),
    (__ptr_1 + 0)
  )
  !(__ptr_1 + 0)
end GetRayCollisionQuad

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionQuad(
    ray: Ptr[Ray],
    p1: Ptr[Vector3],
    p2: Ptr[Vector3],
    p3: Ptr[Vector3],
    p4: Ptr[Vector3]
)(using Zone): RayCollision =
  val __ptr_0: Ptr[RayCollision] = alloc[RayCollision](1)
  __sn_wrap_raylib_GetRayCollisionQuad(ray, p1, p2, p3, p4, (__ptr_0 + 0))
  !(__ptr_0 + 0)
end GetRayCollisionQuad

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionQuad(
    ray: Ptr[Ray],
    p1: Ptr[Vector3],
    p2: Ptr[Vector3],
    p3: Ptr[Vector3],
    p4: Ptr[Vector3]
)(__return: Ptr[RayCollision]): Unit =
  __sn_wrap_raylib_GetRayCollisionQuad(ray, p1, p2, p3, p4, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionSphere(ray: Ray, center: Vector3, radius: Float)(using
    Zone
): RayCollision =
  val __ptr_0: Ptr[Ray] = alloc[Ray](1)
  val __ptr_1: Ptr[RayCollision] = alloc[RayCollision](1)
  val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_0 + 0) = ray
  !(__ptr_2 + 0) = center
  __sn_wrap_raylib_GetRayCollisionSphere(
    (__ptr_0 + 0),
    (__ptr_2 + 0),
    radius,
    (__ptr_1 + 0)
  )
  !(__ptr_1 + 0)
end GetRayCollisionSphere

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionSphere(ray: Ptr[Ray], center: Ptr[Vector3], radius: Float)(
    using Zone
): RayCollision =
  val __ptr_0: Ptr[RayCollision] = alloc[RayCollision](1)
  __sn_wrap_raylib_GetRayCollisionSphere(ray, center, radius, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionSphere(ray: Ptr[Ray], center: Ptr[Vector3], radius: Float)(
    __return: Ptr[RayCollision]
): Unit =
  __sn_wrap_raylib_GetRayCollisionSphere(ray, center, radius, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionTriangle(
    ray: Ptr[Ray],
    p1: Ptr[Vector3],
    p2: Ptr[Vector3],
    p3: Ptr[Vector3]
)(__return: Ptr[RayCollision]): Unit =
  __sn_wrap_raylib_GetRayCollisionTriangle(ray, p1, p2, p3, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionTriangle(
    ray: Ptr[Ray],
    p1: Ptr[Vector3],
    p2: Ptr[Vector3],
    p3: Ptr[Vector3]
)(using Zone): RayCollision =
  val __ptr_0: Ptr[RayCollision] = alloc[RayCollision](1)
  __sn_wrap_raylib_GetRayCollisionTriangle(ray, p1, p2, p3, (__ptr_0 + 0))
  !(__ptr_0 + 0)
end GetRayCollisionTriangle

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetRayCollisionTriangle(ray: Ray, p1: Vector3, p2: Vector3, p3: Vector3)(
    using Zone
): RayCollision =
  val __ptr_0: Ptr[Ray] = alloc[Ray](1)
  val __ptr_1: Ptr[RayCollision] = alloc[RayCollision](1)
  val __ptr_2: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = ray
  !(__ptr_2 + 0) = p1
  !(__ptr_2 + 1) = p2
  !(__ptr_2 + 2) = p3
  __sn_wrap_raylib_GetRayCollisionTriangle(
    (__ptr_0 + 0),
    (__ptr_2 + 0),
    (__ptr_2 + 1),
    (__ptr_2 + 2),
    (__ptr_1 + 0)
  )
  !(__ptr_1 + 0)
end GetRayCollisionTriangle

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetScreenToWorld2D(position: Ptr[Vector2], camera: Ptr[Camera2D])(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_GetScreenToWorld2D(position, camera, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetScreenToWorld2D(position: Ptr[Vector2], camera: Ptr[Camera2D])(using
    Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetScreenToWorld2D(position, camera, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetScreenToWorld2D(position: Vector2, camera: Camera2D)(using
    Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  val __ptr_1: Ptr[Camera2D] = alloc[Camera2D](1)
  !(__ptr_0 + 0) = position
  !(__ptr_1 + 0) = camera
  __sn_wrap_raylib_GetScreenToWorld2D(
    (__ptr_0 + 0),
    (__ptr_1 + 0),
    (__ptr_0 + 1)
  )
  !(__ptr_0 + 1)
end GetScreenToWorld2D

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetShaderLocation(shader: Ptr[Shader], uniformName: CString): CInt =
  __sn_wrap_raylib_GetShaderLocation(shader, uniformName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetShaderLocation(shader: Shader, uniformName: CString)(using Zone): CInt =
  val __ptr_0: Ptr[Shader] = alloc[Shader](1)
  !(__ptr_0 + 0) = shader
  __sn_wrap_raylib_GetShaderLocation((__ptr_0 + 0), uniformName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetShaderLocationAttrib(shader: Shader, attribName: CString)(using
    Zone
): CInt =
  val __ptr_0: Ptr[Shader] = alloc[Shader](1)
  !(__ptr_0 + 0) = shader
  __sn_wrap_raylib_GetShaderLocationAttrib((__ptr_0 + 0), attribName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetShaderLocationAttrib(shader: Ptr[Shader], attribName: CString): CInt =
  __sn_wrap_raylib_GetShaderLocationAttrib(shader, attribName)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointBasis(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2],
    p4: Ptr[Vector2],
    t: Float
)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetSplinePointBasis(p1, p2, p3, p4, t, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointBasis(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2],
    p4: Ptr[Vector2],
    t: Float
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetSplinePointBasis(p1, p2, p3, p4, t, (__ptr_0 + 0))
  !(__ptr_0 + 0)
end GetSplinePointBasis

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointBasis(
    p1: Vector2,
    p2: Vector2,
    p3: Vector2,
    p4: Vector2,
    t: Float
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](5)
  !(__ptr_0 + 0) = p1
  !(__ptr_0 + 1) = p2
  !(__ptr_0 + 2) = p3
  !(__ptr_0 + 3) = p4
  __sn_wrap_raylib_GetSplinePointBasis(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    (__ptr_0 + 3),
    t,
    (__ptr_0 + 4)
  )
  !(__ptr_0 + 4)
end GetSplinePointBasis

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointBezierCubic(
    p1: Ptr[Vector2],
    c2: Ptr[Vector2],
    c3: Ptr[Vector2],
    p4: Ptr[Vector2],
    t: Float
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetSplinePointBezierCubic(p1, c2, c3, p4, t, (__ptr_0 + 0))
  !(__ptr_0 + 0)
end GetSplinePointBezierCubic

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointBezierCubic(
    p1: Ptr[Vector2],
    c2: Ptr[Vector2],
    c3: Ptr[Vector2],
    p4: Ptr[Vector2],
    t: Float
)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetSplinePointBezierCubic(p1, c2, c3, p4, t, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointBezierCubic(
    p1: Vector2,
    c2: Vector2,
    c3: Vector2,
    p4: Vector2,
    t: Float
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](5)
  !(__ptr_0 + 0) = p1
  !(__ptr_0 + 1) = c2
  !(__ptr_0 + 2) = c3
  !(__ptr_0 + 3) = p4
  __sn_wrap_raylib_GetSplinePointBezierCubic(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    (__ptr_0 + 3),
    t,
    (__ptr_0 + 4)
  )
  !(__ptr_0 + 4)
end GetSplinePointBezierCubic

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointBezierQuad(
    p1: Ptr[Vector2],
    c2: Ptr[Vector2],
    p3: Ptr[Vector2],
    t: Float
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetSplinePointBezierQuad(p1, c2, p3, t, (__ptr_0 + 0))
  !(__ptr_0 + 0)
end GetSplinePointBezierQuad

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointBezierQuad(p1: Vector2, c2: Vector2, p3: Vector2, t: Float)(
    using Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](4)
  !(__ptr_0 + 0) = p1
  !(__ptr_0 + 1) = c2
  !(__ptr_0 + 2) = p3
  __sn_wrap_raylib_GetSplinePointBezierQuad(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    t,
    (__ptr_0 + 3)
  )
  !(__ptr_0 + 3)
end GetSplinePointBezierQuad

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointBezierQuad(
    p1: Ptr[Vector2],
    c2: Ptr[Vector2],
    p3: Ptr[Vector2],
    t: Float
)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetSplinePointBezierQuad(p1, c2, p3, t, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointCatmullRom(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2],
    p4: Ptr[Vector2],
    t: Float
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetSplinePointCatmullRom(p1, p2, p3, p4, t, (__ptr_0 + 0))
  !(__ptr_0 + 0)
end GetSplinePointCatmullRom

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointCatmullRom(
    p1: Vector2,
    p2: Vector2,
    p3: Vector2,
    p4: Vector2,
    t: Float
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](5)
  !(__ptr_0 + 0) = p1
  !(__ptr_0 + 1) = p2
  !(__ptr_0 + 2) = p3
  !(__ptr_0 + 3) = p4
  __sn_wrap_raylib_GetSplinePointCatmullRom(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    (__ptr_0 + 3),
    t,
    (__ptr_0 + 4)
  )
  !(__ptr_0 + 4)
end GetSplinePointCatmullRom

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointCatmullRom(
    p1: Ptr[Vector2],
    p2: Ptr[Vector2],
    p3: Ptr[Vector2],
    p4: Ptr[Vector2],
    t: Float
)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetSplinePointCatmullRom(p1, p2, p3, p4, t, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointLinear(
    startPos: Ptr[Vector2],
    endPos: Ptr[Vector2],
    t: Float
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetSplinePointLinear(startPos, endPos, t, (__ptr_0 + 0))
  !(__ptr_0 + 0)
end GetSplinePointLinear

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointLinear(
    startPos: Ptr[Vector2],
    endPos: Ptr[Vector2],
    t: Float
)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetSplinePointLinear(startPos, endPos, t, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetSplinePointLinear(startPos: Vector2, endPos: Vector2, t: Float)(using
    Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_0 + 0) = startPos
  !(__ptr_0 + 1) = endPos
  __sn_wrap_raylib_GetSplinePointLinear(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    t,
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end GetSplinePointLinear

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetTouchPosition(index: CInt)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetTouchPosition(index, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetTouchPosition(index: CInt)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetTouchPosition(index, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWindowPosition()(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetWindowPosition((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWindowPosition()(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetWindowPosition(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWindowScaleDPI()(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetWindowScaleDPI((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWindowScaleDPI()(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetWindowScaleDPI(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWorldToScreen(position: Ptr[Vector3], camera: Ptr[Camera])(using
    Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetWorldToScreen(position, camera, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWorldToScreen(position: Vector3, camera: Camera)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_1: Ptr[Camera] = alloc[Camera](1)
  val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_2 + 0) = position
  !(__ptr_1 + 0) = camera
  __sn_wrap_raylib_GetWorldToScreen((__ptr_2 + 0), (__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)
end GetWorldToScreen

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWorldToScreen(position: Ptr[Vector3], camera: Ptr[Camera])(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_GetWorldToScreen(position, camera, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWorldToScreen2D(position: Vector2, camera: Camera2D)(using
    Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  val __ptr_1: Ptr[Camera2D] = alloc[Camera2D](1)
  !(__ptr_0 + 0) = position
  !(__ptr_1 + 0) = camera
  __sn_wrap_raylib_GetWorldToScreen2D(
    (__ptr_0 + 0),
    (__ptr_1 + 0),
    (__ptr_0 + 1)
  )
  !(__ptr_0 + 1)
end GetWorldToScreen2D

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWorldToScreen2D(position: Ptr[Vector2], camera: Ptr[Camera2D])(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_GetWorldToScreen2D(position, camera, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWorldToScreen2D(position: Ptr[Vector2], camera: Ptr[Camera2D])(using
    Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetWorldToScreen2D(position, camera, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWorldToScreenEx(
    position: Vector3,
    camera: Camera,
    width: CInt,
    height: CInt
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_1: Ptr[Camera] = alloc[Camera](1)
  val __ptr_2: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_2 + 0) = position
  !(__ptr_1 + 0) = camera
  __sn_wrap_raylib_GetWorldToScreenEx(
    (__ptr_2 + 0),
    (__ptr_1 + 0),
    width,
    height,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end GetWorldToScreenEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWorldToScreenEx(
    position: Ptr[Vector3],
    camera: Ptr[Camera],
    width: CInt,
    height: CInt
)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_GetWorldToScreenEx(position, camera, width, height, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def GetWorldToScreenEx(
    position: Ptr[Vector3],
    camera: Ptr[Camera],
    width: CInt,
    height: CInt
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_GetWorldToScreenEx(
    position,
    camera,
    width,
    height,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end GetWorldToScreenEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageAlphaClear(image: Ptr[Image], color: Color, threshold: Float)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageAlphaClear(image, (__ptr_0 + 0), threshold)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageAlphaClear(
    image: Ptr[Image],
    color: Ptr[Color],
    threshold: Float
): Unit =
  __sn_wrap_raylib_ImageAlphaClear(image, color, threshold)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageAlphaMask(image: Ptr[Image], alphaMask: Ptr[Image]): Unit =
  __sn_wrap_raylib_ImageAlphaMask(image, alphaMask)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageAlphaMask(image: Ptr[Image], alphaMask: Image)(using Zone): Unit =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = alphaMask
  __sn_wrap_raylib_ImageAlphaMask(image, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageClearBackground(dst: Ptr[Image], color: Color)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageClearBackground(dst, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageClearBackground(dst: Ptr[Image], color: Ptr[Color]): Unit =
  __sn_wrap_raylib_ImageClearBackground(dst, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageColorReplace(
    image: Ptr[Image],
    color: Ptr[Color],
    replace: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageColorReplace(image, color, replace)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageColorReplace(image: Ptr[Image], color: Color, replace: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](2)
  !(__ptr_0 + 0) = color
  !(__ptr_0 + 1) = replace
  __sn_wrap_raylib_ImageColorReplace(image, (__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageColorTint(image: Ptr[Image], color: Color)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageColorTint(image, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageColorTint(image: Ptr[Image], color: Ptr[Color]): Unit =
  __sn_wrap_raylib_ImageColorTint(image, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageCopy(image: Ptr[Image])(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_ImageCopy(image, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageCopy(image: Image)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](2)
  !(__ptr_0 + 0) = image
  __sn_wrap_raylib_ImageCopy((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageCopy(image: Ptr[Image])(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_ImageCopy(image, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageCrop(image: Ptr[Image], crop: Rectangle)(using Zone): Unit =
  val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_0 + 0) = crop
  __sn_wrap_raylib_ImageCrop(image, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageCrop(image: Ptr[Image], crop: Ptr[Rectangle]): Unit =
  __sn_wrap_raylib_ImageCrop(image, crop)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDraw(
    dst: Ptr[Image],
    src: Ptr[Image],
    srcRec: Ptr[Rectangle],
    dstRec: Ptr[Rectangle],
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDraw(dst, src, srcRec, dstRec, tint)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDraw(
    dst: Ptr[Image],
    src: Image,
    srcRec: Rectangle,
    dstRec: Rectangle,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](2)
  val __ptr_2: Ptr[Image] = alloc[Image](1)
  !(__ptr_2 + 0) = src
  !(__ptr_1 + 0) = srcRec
  !(__ptr_1 + 1) = dstRec
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_ImageDraw(
    dst,
    (__ptr_2 + 0),
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    (__ptr_0 + 0)
  )
end ImageDraw

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawCircle(
    dst: Ptr[Image],
    centerX: CInt,
    centerY: CInt,
    radius: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawCircle(dst, centerX, centerY, radius, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawCircle(
    dst: Ptr[Image],
    centerX: CInt,
    centerY: CInt,
    radius: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawCircle(dst, centerX, centerY, radius, (__ptr_0 + 0))
end ImageDrawCircle

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawCircleLines(
    dst: Ptr[Image],
    centerX: CInt,
    centerY: CInt,
    radius: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawCircleLines(dst, centerX, centerY, radius, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawCircleLines(
    dst: Ptr[Image],
    centerX: CInt,
    centerY: CInt,
    radius: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawCircleLines(
    dst,
    centerX,
    centerY,
    radius,
    (__ptr_0 + 0)
  )
end ImageDrawCircleLines

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawCircleLinesV(
    dst: Ptr[Image],
    center: Ptr[Vector2],
    radius: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawCircleLinesV(dst, center, radius, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawCircleLinesV(
    dst: Ptr[Image],
    center: Vector2,
    radius: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = center
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawCircleLinesV(
    dst,
    (__ptr_1 + 0),
    radius,
    (__ptr_0 + 0)
  )
end ImageDrawCircleLinesV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawCircleV(
    dst: Ptr[Image],
    center: Vector2,
    radius: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = center
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawCircleV(dst, (__ptr_1 + 0), radius, (__ptr_0 + 0))
end ImageDrawCircleV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawCircleV(
    dst: Ptr[Image],
    center: Ptr[Vector2],
    radius: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawCircleV(dst, center, radius, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawLine(
    dst: Ptr[Image],
    startPosX: CInt,
    startPosY: CInt,
    endPosX: CInt,
    endPosY: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawLine(
    dst,
    startPosX,
    startPosY,
    endPosX,
    endPosY,
    color
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawLine(
    dst: Ptr[Image],
    startPosX: CInt,
    startPosY: CInt,
    endPosX: CInt,
    endPosY: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawLine(
    dst,
    startPosX,
    startPosY,
    endPosX,
    endPosY,
    (__ptr_0 + 0)
  )
end ImageDrawLine

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawLineV(dst: Ptr[Image], start: Vector2, end: Vector2, color: Color)(
    using Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_1 + 0) = start
  !(__ptr_1 + 1) = end
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawLineV(
    dst,
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    (__ptr_0 + 0)
  )
end ImageDrawLineV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawLineV(
    dst: Ptr[Image],
    start: Ptr[Vector2],
    end: Ptr[Vector2],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawLineV(dst, start, end, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawPixel(dst: Ptr[Image], posX: CInt, posY: CInt, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawPixel(dst, posX, posY, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawPixel(
    dst: Ptr[Image],
    posX: CInt,
    posY: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawPixel(dst, posX, posY, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawPixelV(dst: Ptr[Image], position: Vector2, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawPixelV(dst, (__ptr_1 + 0), (__ptr_0 + 0))
end ImageDrawPixelV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawPixelV(
    dst: Ptr[Image],
    position: Ptr[Vector2],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawPixelV(dst, position, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawRectangle(
    dst: Ptr[Image],
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawRectangle(dst, posX, posY, width, height, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawRectangle(
    dst: Ptr[Image],
    posX: CInt,
    posY: CInt,
    width: CInt,
    height: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawRectangle(
    dst,
    posX,
    posY,
    width,
    height,
    (__ptr_0 + 0)
  )
end ImageDrawRectangle

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawRectangleLines(
    dst: Ptr[Image],
    rec: Rectangle,
    thick: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_1 + 0) = rec
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawRectangleLines(
    dst,
    (__ptr_1 + 0),
    thick,
    (__ptr_0 + 0)
  )
end ImageDrawRectangleLines

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawRectangleLines(
    dst: Ptr[Image],
    rec: Ptr[Rectangle],
    thick: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawRectangleLines(dst, rec, thick, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawRectangleRec(dst: Ptr[Image], rec: Rectangle, color: Color)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_1 + 0) = rec
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawRectangleRec(dst, (__ptr_1 + 0), (__ptr_0 + 0))
end ImageDrawRectangleRec

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawRectangleRec(
    dst: Ptr[Image],
    rec: Ptr[Rectangle],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawRectangleRec(dst, rec, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawRectangleV(
    dst: Ptr[Image],
    position: Vector2,
    size: Vector2,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_1 + 0) = position
  !(__ptr_1 + 1) = size
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawRectangleV(
    dst,
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    (__ptr_0 + 0)
  )
end ImageDrawRectangleV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawRectangleV(
    dst: Ptr[Image],
    position: Ptr[Vector2],
    size: Ptr[Vector2],
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawRectangleV(dst, position, size, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawText(
    dst: Ptr[Image],
    text: CString,
    posX: CInt,
    posY: CInt,
    fontSize: CInt,
    color: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawText(dst, text, posX, posY, fontSize, color)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawText(
    dst: Ptr[Image],
    text: CString,
    posX: CInt,
    posY: CInt,
    fontSize: CInt,
    color: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageDrawText(dst, text, posX, posY, fontSize, (__ptr_0 + 0))
end ImageDrawText

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawTextEx(
    dst: Ptr[Image],
    font: Ptr[Font],
    text: CString,
    position: Ptr[Vector2],
    fontSize: Float,
    spacing: Float,
    tint: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageDrawTextEx(
    dst,
    font,
    text,
    position,
    fontSize,
    spacing,
    tint
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageDrawTextEx(
    dst: Ptr[Image],
    font: Font,
    text: CString,
    position: Vector2,
    fontSize: Float,
    spacing: Float,
    tint: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_2: Ptr[Font] = alloc[Font](1)
  !(__ptr_2 + 0) = font
  !(__ptr_1 + 0) = position
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_ImageDrawTextEx(
    dst,
    (__ptr_2 + 0),
    text,
    (__ptr_1 + 0),
    fontSize,
    spacing,
    (__ptr_0 + 0)
  )
end ImageDrawTextEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageFromImage(image: Ptr[Image], rec: Ptr[Rectangle])(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_ImageFromImage(image, rec, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageFromImage(image: Image, rec: Rectangle)(using Zone): Image =
  val __ptr_0: Ptr[Rectangle] = alloc[Rectangle](1)
  val __ptr_1: Ptr[Image] = alloc[Image](2)
  !(__ptr_1 + 0) = image
  !(__ptr_0 + 0) = rec
  __sn_wrap_raylib_ImageFromImage((__ptr_1 + 0), (__ptr_0 + 0), (__ptr_1 + 1))
  !(__ptr_1 + 1)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageFromImage(image: Ptr[Image], rec: Ptr[Rectangle])(
    __return: Ptr[Image]
): Unit =
  __sn_wrap_raylib_ImageFromImage(image, rec, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageResizeCanvas(
    image: Ptr[Image],
    newWidth: CInt,
    newHeight: CInt,
    offsetX: CInt,
    offsetY: CInt,
    fill: Color
)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = fill
  __sn_wrap_raylib_ImageResizeCanvas(
    image,
    newWidth,
    newHeight,
    offsetX,
    offsetY,
    (__ptr_0 + 0)
  )
end ImageResizeCanvas

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageResizeCanvas(
    image: Ptr[Image],
    newWidth: CInt,
    newHeight: CInt,
    offsetX: CInt,
    offsetY: CInt,
    fill: Ptr[Color]
): Unit =
  __sn_wrap_raylib_ImageResizeCanvas(
    image,
    newWidth,
    newHeight,
    offsetX,
    offsetY,
    fill
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageText(text: CString, fontSize: CInt, color: Ptr[Color])(using
    Zone
): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_ImageText(text, fontSize, color, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageText(text: CString, fontSize: CInt, color: Color)(using Zone): Image =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_ImageText(text, fontSize, (__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageText(text: CString, fontSize: CInt, color: Ptr[Color])(
    __return: Ptr[Image]
): Unit =
  __sn_wrap_raylib_ImageText(text, fontSize, color, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageTextEx(
    font: Ptr[Font],
    text: CString,
    fontSize: Float,
    spacing: Float,
    tint: Ptr[Color]
)(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_ImageTextEx(font, text, fontSize, spacing, tint, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageTextEx(
    font: Font,
    text: CString,
    fontSize: Float,
    spacing: Float,
    tint: Color
)(using Zone): Image =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Font] = alloc[Font](1)
  val __ptr_2: Ptr[Image] = alloc[Image](1)
  !(__ptr_1 + 0) = font
  !(__ptr_0 + 0) = tint
  __sn_wrap_raylib_ImageTextEx(
    (__ptr_1 + 0),
    text,
    fontSize,
    spacing,
    (__ptr_0 + 0),
    (__ptr_2 + 0)
  )
  !(__ptr_2 + 0)
end ImageTextEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageTextEx(
    font: Ptr[Font],
    text: CString,
    fontSize: Float,
    spacing: Float,
    tint: Ptr[Color]
)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_ImageTextEx(
    font,
    text,
    fontSize,
    spacing,
    tint,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end ImageTextEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageToPOT(image: Ptr[Image], fill: Color)(using Zone): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = fill
  __sn_wrap_raylib_ImageToPOT(image, (__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ImageToPOT(image: Ptr[Image], fill: Ptr[Color]): Unit =
  __sn_wrap_raylib_ImageToPOT(image, fill)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsAudioStreamPlaying(stream: Ptr[AudioStream]): Boolean =
  __sn_wrap_raylib_IsAudioStreamPlaying(stream)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsAudioStreamPlaying(stream: AudioStream)(using Zone): Boolean =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_IsAudioStreamPlaying((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsAudioStreamProcessed(stream: Ptr[AudioStream]): Boolean =
  __sn_wrap_raylib_IsAudioStreamProcessed(stream)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsAudioStreamProcessed(stream: AudioStream)(using Zone): Boolean =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_IsAudioStreamProcessed((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsAudioStreamReady(stream: Ptr[AudioStream]): Boolean =
  __sn_wrap_raylib_IsAudioStreamReady(stream)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsAudioStreamReady(stream: AudioStream)(using Zone): Boolean =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_IsAudioStreamReady((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsFontReady(font: Ptr[Font]): Boolean =
  __sn_wrap_raylib_IsFontReady(font)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsFontReady(font: Font)(using Zone): Boolean =
  val __ptr_0: Ptr[Font] = alloc[Font](1)
  !(__ptr_0 + 0) = font
  __sn_wrap_raylib_IsFontReady((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsImageReady(image: Image)(using Zone): Boolean =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = image
  __sn_wrap_raylib_IsImageReady((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsImageReady(image: Ptr[Image]): Boolean =
  __sn_wrap_raylib_IsImageReady(image)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsMaterialReady(material: Material)(using Zone): Boolean =
  val __ptr_0: Ptr[Material] = alloc[Material](1)
  !(__ptr_0 + 0) = material
  __sn_wrap_raylib_IsMaterialReady((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsMaterialReady(material: Ptr[Material]): Boolean =
  __sn_wrap_raylib_IsMaterialReady(material)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsModelAnimationValid(model: Model, anim: ModelAnimation)(using
    Zone
): Boolean =
  val __ptr_0: Ptr[Model] = alloc[Model](1)
  val __ptr_1: Ptr[ModelAnimation] = alloc[ModelAnimation](1)
  !(__ptr_0 + 0) = model
  !(__ptr_1 + 0) = anim
  __sn_wrap_raylib_IsModelAnimationValid((__ptr_0 + 0), (__ptr_1 + 0))
end IsModelAnimationValid

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsModelAnimationValid(
    model: Ptr[Model],
    anim: Ptr[ModelAnimation]
): Boolean =
  __sn_wrap_raylib_IsModelAnimationValid(model, anim)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsModelReady(model: Model)(using Zone): Boolean =
  val __ptr_0: Ptr[Model] = alloc[Model](1)
  !(__ptr_0 + 0) = model
  __sn_wrap_raylib_IsModelReady((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsModelReady(model: Ptr[Model]): Boolean =
  __sn_wrap_raylib_IsModelReady(model)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsMusicReady(music: Ptr[Music]): Boolean =
  __sn_wrap_raylib_IsMusicReady(music)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsMusicReady(music: Music)(using Zone): Boolean =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_IsMusicReady((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsMusicStreamPlaying(music: Ptr[Music]): Boolean =
  __sn_wrap_raylib_IsMusicStreamPlaying(music)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsMusicStreamPlaying(music: Music)(using Zone): Boolean =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_IsMusicStreamPlaying((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsRenderTextureReady(target: Ptr[RenderTexture2D]): Boolean =
  __sn_wrap_raylib_IsRenderTextureReady(target)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsRenderTextureReady(target: RenderTexture2D)(using Zone): Boolean =
  val __ptr_0: Ptr[RenderTexture2D] = alloc[RenderTexture2D](1)
  !(__ptr_0 + 0) = target
  __sn_wrap_raylib_IsRenderTextureReady((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsShaderReady(shader: Shader)(using Zone): Boolean =
  val __ptr_0: Ptr[Shader] = alloc[Shader](1)
  !(__ptr_0 + 0) = shader
  __sn_wrap_raylib_IsShaderReady((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsShaderReady(shader: Ptr[Shader]): Boolean =
  __sn_wrap_raylib_IsShaderReady(shader)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsSoundPlaying(sound: Ptr[Sound]): Boolean =
  __sn_wrap_raylib_IsSoundPlaying(sound)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsSoundPlaying(sound: Sound)(using Zone): Boolean =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = sound
  __sn_wrap_raylib_IsSoundPlaying((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsSoundReady(sound: Sound)(using Zone): Boolean =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = sound
  __sn_wrap_raylib_IsSoundReady((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsSoundReady(sound: Ptr[Sound]): Boolean =
  __sn_wrap_raylib_IsSoundReady(sound)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsTextureReady(texture: Texture2D)(using Zone): Boolean =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  !(__ptr_0 + 0) = texture
  __sn_wrap_raylib_IsTextureReady((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsTextureReady(texture: Ptr[Texture2D]): Boolean =
  __sn_wrap_raylib_IsTextureReady(texture)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsWaveReady(wave: Wave)(using Zone): Boolean =
  val __ptr_0: Ptr[Wave] = alloc[Wave](1)
  !(__ptr_0 + 0) = wave
  __sn_wrap_raylib_IsWaveReady((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def IsWaveReady(wave: Ptr[Wave]): Boolean =
  __sn_wrap_raylib_IsWaveReady(wave)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadAudioStream(
    sampleRate: CUnsignedInt,
    sampleSize: CUnsignedInt,
    channels: CUnsignedInt
)(using Zone): AudioStream =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  __sn_wrap_raylib_LoadAudioStream(
    sampleRate,
    sampleSize,
    channels,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end LoadAudioStream

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadAudioStream(
    sampleRate: CUnsignedInt,
    sampleSize: CUnsignedInt,
    channels: CUnsignedInt
)(__return: Ptr[AudioStream]): Unit =
  __sn_wrap_raylib_LoadAudioStream(sampleRate, sampleSize, channels, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadAutomationEventList(fileName: CString)(
    __return: Ptr[AutomationEventList]
): Unit =
  __sn_wrap_raylib_LoadAutomationEventList(fileName, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadAutomationEventList(fileName: CString)(using
    Zone
): AutomationEventList =
  val __ptr_0: Ptr[AutomationEventList] = alloc[AutomationEventList](1)
  __sn_wrap_raylib_LoadAutomationEventList(fileName, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadDirectoryFiles(dirPath: CString)(using Zone): FilePathList =
  val __ptr_0: Ptr[FilePathList] = alloc[FilePathList](1)
  __sn_wrap_raylib_LoadDirectoryFiles(dirPath, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadDirectoryFiles(dirPath: CString)(__return: Ptr[FilePathList]): Unit =
  __sn_wrap_raylib_LoadDirectoryFiles(dirPath, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadDirectoryFilesEx(
    basePath: CString,
    filter: CString,
    scanSubdirs: Boolean
)(__return: Ptr[FilePathList]): Unit =
  __sn_wrap_raylib_LoadDirectoryFilesEx(basePath, filter, scanSubdirs, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadDirectoryFilesEx(
    basePath: CString,
    filter: CString,
    scanSubdirs: Boolean
)(using Zone): FilePathList =
  val __ptr_0: Ptr[FilePathList] = alloc[FilePathList](1)
  __sn_wrap_raylib_LoadDirectoryFilesEx(
    basePath,
    filter,
    scanSubdirs,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end LoadDirectoryFilesEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadDroppedFiles()(__return: Ptr[FilePathList]): Unit =
  __sn_wrap_raylib_LoadDroppedFiles(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadDroppedFiles()(using Zone): FilePathList =
  val __ptr_0: Ptr[FilePathList] = alloc[FilePathList](1)
  __sn_wrap_raylib_LoadDroppedFiles((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadFont(fileName: CString)(using Zone): Font =
  val __ptr_0: Ptr[Font] = alloc[Font](1)
  __sn_wrap_raylib_LoadFont(fileName, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadFont(fileName: CString)(__return: Ptr[Font]): Unit =
  __sn_wrap_raylib_LoadFont(fileName, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadFontEx(
    fileName: CString,
    fontSize: CInt,
    codepoints: Ptr[CInt],
    codepointCount: CInt
)(__return: Ptr[Font]): Unit =
  __sn_wrap_raylib_LoadFontEx(
    fileName,
    fontSize,
    codepoints,
    codepointCount,
    __return
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadFontEx(
    fileName: CString,
    fontSize: CInt,
    codepoints: Ptr[CInt],
    codepointCount: CInt
)(using Zone): Font =
  val __ptr_0: Ptr[Font] = alloc[Font](1)
  __sn_wrap_raylib_LoadFontEx(
    fileName,
    fontSize,
    codepoints,
    codepointCount,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end LoadFontEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadFontFromImage(image: Image, key: Color, firstChar: CInt)(using
    Zone
): Font =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  val __ptr_1: Ptr[Font] = alloc[Font](1)
  val __ptr_2: Ptr[Image] = alloc[Image](1)
  !(__ptr_2 + 0) = image
  !(__ptr_0 + 0) = key
  __sn_wrap_raylib_LoadFontFromImage(
    (__ptr_2 + 0),
    (__ptr_0 + 0),
    firstChar,
    (__ptr_1 + 0)
  )
  !(__ptr_1 + 0)
end LoadFontFromImage

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadFontFromImage(image: Ptr[Image], key: Ptr[Color], firstChar: CInt)(
    __return: Ptr[Font]
): Unit =
  __sn_wrap_raylib_LoadFontFromImage(image, key, firstChar, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadFontFromImage(image: Ptr[Image], key: Ptr[Color], firstChar: CInt)(using
    Zone
): Font =
  val __ptr_0: Ptr[Font] = alloc[Font](1)
  __sn_wrap_raylib_LoadFontFromImage(image, key, firstChar, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadFontFromMemory(
    fileType: CString,
    fileData: Ptr[CUnsignedChar],
    dataSize: CInt,
    fontSize: CInt,
    codepoints: Ptr[CInt],
    codepointCount: CInt
)(__return: Ptr[Font]): Unit =
  __sn_wrap_raylib_LoadFontFromMemory(
    fileType,
    fileData,
    dataSize,
    fontSize,
    codepoints,
    codepointCount,
    __return
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadFontFromMemory(
    fileType: CString,
    fileData: Ptr[CUnsignedChar],
    dataSize: CInt,
    fontSize: CInt,
    codepoints: Ptr[CInt],
    codepointCount: CInt
)(using Zone): Font =
  val __ptr_0: Ptr[Font] = alloc[Font](1)
  __sn_wrap_raylib_LoadFontFromMemory(
    fileType,
    fileData,
    dataSize,
    fontSize,
    codepoints,
    codepointCount,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end LoadFontFromMemory

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImage(fileName: CString)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_LoadImage(fileName, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImage(fileName: CString)(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_LoadImage(fileName, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageAnim(fileName: CString, frames: Ptr[CInt])(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_LoadImageAnim(fileName, frames, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageAnim(fileName: CString, frames: Ptr[CInt])(
    __return: Ptr[Image]
): Unit =
  __sn_wrap_raylib_LoadImageAnim(fileName, frames, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageColors(image: Ptr[Image]): Ptr[Color] =
  __sn_wrap_raylib_LoadImageColors(image)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageColors(image: Image)(using Zone): Ptr[Color] =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = image
  __sn_wrap_raylib_LoadImageColors((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageFromMemory(
    fileType: CString,
    fileData: Ptr[CUnsignedChar],
    dataSize: CInt
)(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_LoadImageFromMemory(fileType, fileData, dataSize, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageFromMemory(
    fileType: CString,
    fileData: Ptr[CUnsignedChar],
    dataSize: CInt
)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_LoadImageFromMemory(
    fileType,
    fileData,
    dataSize,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end LoadImageFromMemory

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageFromScreen()(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_LoadImageFromScreen(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageFromScreen()(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_LoadImageFromScreen((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageFromTexture(texture: Ptr[Texture2D])(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_LoadImageFromTexture(texture, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageFromTexture(texture: Texture2D)(using Zone): Image =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  val __ptr_1: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = texture
  __sn_wrap_raylib_LoadImageFromTexture((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageFromTexture(texture: Ptr[Texture2D])(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_LoadImageFromTexture(texture, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImagePalette(
    image: Ptr[Image],
    maxPaletteSize: CInt,
    colorCount: Ptr[CInt]
): Ptr[Color] =
  __sn_wrap_raylib_LoadImagePalette(image, maxPaletteSize, colorCount)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImagePalette(image: Image, maxPaletteSize: CInt, colorCount: Ptr[CInt])(
    using Zone
): Ptr[Color] =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = image
  __sn_wrap_raylib_LoadImagePalette((__ptr_0 + 0), maxPaletteSize, colorCount)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageRaw(
    fileName: CString,
    width: CInt,
    height: CInt,
    format: CInt,
    headerSize: CInt
)(using Zone): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_LoadImageRaw(
    fileName,
    width,
    height,
    format,
    headerSize,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end LoadImageRaw

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageRaw(
    fileName: CString,
    width: CInt,
    height: CInt,
    format: CInt,
    headerSize: CInt
)(__return: Ptr[Image]): Unit =
  __sn_wrap_raylib_LoadImageRaw(
    fileName,
    width,
    height,
    format,
    headerSize,
    __return
  )

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageSvg(fileNameOrString: CString, width: CInt, height: CInt)(
    __return: Ptr[Image]
): Unit =
  __sn_wrap_raylib_LoadImageSvg(fileNameOrString, width, height, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadImageSvg(fileNameOrString: CString, width: CInt, height: CInt)(using
    Zone
): Image =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  __sn_wrap_raylib_LoadImageSvg(fileNameOrString, width, height, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadMaterialDefault()(using Zone): Material =
  val __ptr_0: Ptr[Material] = alloc[Material](1)
  __sn_wrap_raylib_LoadMaterialDefault((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadMaterialDefault()(__return: Ptr[Material]): Unit =
  __sn_wrap_raylib_LoadMaterialDefault(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadModel(fileName: CString)(__return: Ptr[Model]): Unit =
  __sn_wrap_raylib_LoadModel(fileName, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadModel(fileName: CString)(using Zone): Model =
  val __ptr_0: Ptr[Model] = alloc[Model](1)
  __sn_wrap_raylib_LoadModel(fileName, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadModelFromMesh(mesh: Ptr[Mesh])(__return: Ptr[Model]): Unit =
  __sn_wrap_raylib_LoadModelFromMesh(mesh, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadModelFromMesh(mesh: Ptr[Mesh])(using Zone): Model =
  val __ptr_0: Ptr[Model] = alloc[Model](1)
  __sn_wrap_raylib_LoadModelFromMesh(mesh, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadModelFromMesh(mesh: Mesh)(using Zone): Model =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  val __ptr_1: Ptr[Model] = alloc[Model](1)
  !(__ptr_0 + 0) = mesh
  __sn_wrap_raylib_LoadModelFromMesh((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadMusicStream(fileName: CString)(using Zone): Music =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  __sn_wrap_raylib_LoadMusicStream(fileName, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadMusicStream(fileName: CString)(__return: Ptr[Music]): Unit =
  __sn_wrap_raylib_LoadMusicStream(fileName, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadMusicStreamFromMemory(
    fileType: CString,
    data: Ptr[CUnsignedChar],
    dataSize: CInt
)(using Zone): Music =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  __sn_wrap_raylib_LoadMusicStreamFromMemory(
    fileType,
    data,
    dataSize,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end LoadMusicStreamFromMemory

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadMusicStreamFromMemory(
    fileType: CString,
    data: Ptr[CUnsignedChar],
    dataSize: CInt
)(__return: Ptr[Music]): Unit =
  __sn_wrap_raylib_LoadMusicStreamFromMemory(fileType, data, dataSize, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadRenderTexture(width: CInt, height: CInt)(
    __return: Ptr[RenderTexture2D]
): Unit =
  __sn_wrap_raylib_LoadRenderTexture(width, height, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadRenderTexture(width: CInt, height: CInt)(using Zone): RenderTexture2D =
  val __ptr_0: Ptr[RenderTexture2D] = alloc[RenderTexture2D](1)
  __sn_wrap_raylib_LoadRenderTexture(width, height, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadShader(vsFileName: CString, fsFileName: CString)(using Zone): Shader =
  val __ptr_0: Ptr[Shader] = alloc[Shader](1)
  __sn_wrap_raylib_LoadShader(vsFileName, fsFileName, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadShader(vsFileName: CString, fsFileName: CString)(
    __return: Ptr[Shader]
): Unit =
  __sn_wrap_raylib_LoadShader(vsFileName, fsFileName, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadShaderFromMemory(vsCode: CString, fsCode: CString)(
    __return: Ptr[Shader]
): Unit =
  __sn_wrap_raylib_LoadShaderFromMemory(vsCode, fsCode, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadShaderFromMemory(vsCode: CString, fsCode: CString)(using Zone): Shader =
  val __ptr_0: Ptr[Shader] = alloc[Shader](1)
  __sn_wrap_raylib_LoadShaderFromMemory(vsCode, fsCode, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadSound(fileName: CString)(__return: Ptr[Sound]): Unit =
  __sn_wrap_raylib_LoadSound(fileName, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadSound(fileName: CString)(using Zone): Sound =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  __sn_wrap_raylib_LoadSound(fileName, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadSoundAlias(source: Sound)(using Zone): Sound =
  val __ptr_0: Ptr[Sound] = alloc[Sound](2)
  !(__ptr_0 + 0) = source
  __sn_wrap_raylib_LoadSoundAlias((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadSoundAlias(source: Ptr[Sound])(using Zone): Sound =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  __sn_wrap_raylib_LoadSoundAlias(source, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadSoundAlias(source: Ptr[Sound])(__return: Ptr[Sound]): Unit =
  __sn_wrap_raylib_LoadSoundAlias(source, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadSoundFromWave(wave: Ptr[Wave])(using Zone): Sound =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  __sn_wrap_raylib_LoadSoundFromWave(wave, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadSoundFromWave(wave: Ptr[Wave])(__return: Ptr[Sound]): Unit =
  __sn_wrap_raylib_LoadSoundFromWave(wave, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadSoundFromWave(wave: Wave)(using Zone): Sound =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  val __ptr_1: Ptr[Wave] = alloc[Wave](1)
  !(__ptr_1 + 0) = wave
  __sn_wrap_raylib_LoadSoundFromWave((__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadTexture(fileName: CString)(using Zone): Texture2D =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  __sn_wrap_raylib_LoadTexture(fileName, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadTexture(fileName: CString)(__return: Ptr[Texture2D]): Unit =
  __sn_wrap_raylib_LoadTexture(fileName, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadTextureCubemap(image: Ptr[Image], layout: CInt)(using
    Zone
): TextureCubemap =
  val __ptr_0: Ptr[TextureCubemap] = alloc[TextureCubemap](1)
  __sn_wrap_raylib_LoadTextureCubemap(image, layout, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadTextureCubemap(image: Ptr[Image], layout: CInt)(
    __return: Ptr[TextureCubemap]
): Unit =
  __sn_wrap_raylib_LoadTextureCubemap(image, layout, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadTextureCubemap(image: Image, layout: CInt)(using Zone): TextureCubemap =
  val __ptr_0: Ptr[TextureCubemap] = alloc[TextureCubemap](1)
  val __ptr_1: Ptr[Image] = alloc[Image](1)
  !(__ptr_1 + 0) = image
  __sn_wrap_raylib_LoadTextureCubemap((__ptr_1 + 0), layout, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadTextureFromImage(image: Ptr[Image])(using Zone): Texture2D =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  __sn_wrap_raylib_LoadTextureFromImage(image, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadTextureFromImage(image: Image)(using Zone): Texture2D =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  val __ptr_1: Ptr[Image] = alloc[Image](1)
  !(__ptr_1 + 0) = image
  __sn_wrap_raylib_LoadTextureFromImage((__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadTextureFromImage(image: Ptr[Image])(__return: Ptr[Texture2D]): Unit =
  __sn_wrap_raylib_LoadTextureFromImage(image, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadVrStereoConfig(device: VrDeviceInfo)(using Zone): VrStereoConfig =
  val __ptr_0: Ptr[VrStereoConfig] = alloc[VrStereoConfig](1)
  val __ptr_1: Ptr[VrDeviceInfo] = alloc[VrDeviceInfo](1)
  !(__ptr_1 + 0) = device
  __sn_wrap_raylib_LoadVrStereoConfig((__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadVrStereoConfig(device: Ptr[VrDeviceInfo])(using Zone): VrStereoConfig =
  val __ptr_0: Ptr[VrStereoConfig] = alloc[VrStereoConfig](1)
  __sn_wrap_raylib_LoadVrStereoConfig(device, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadVrStereoConfig(device: Ptr[VrDeviceInfo])(
    __return: Ptr[VrStereoConfig]
): Unit =
  __sn_wrap_raylib_LoadVrStereoConfig(device, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadWave(fileName: CString)(__return: Ptr[Wave]): Unit =
  __sn_wrap_raylib_LoadWave(fileName, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadWave(fileName: CString)(using Zone): Wave =
  val __ptr_0: Ptr[Wave] = alloc[Wave](1)
  __sn_wrap_raylib_LoadWave(fileName, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadWaveFromMemory(
    fileType: CString,
    fileData: Ptr[CUnsignedChar],
    dataSize: CInt
)(__return: Ptr[Wave]): Unit =
  __sn_wrap_raylib_LoadWaveFromMemory(fileType, fileData, dataSize, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadWaveFromMemory(
    fileType: CString,
    fileData: Ptr[CUnsignedChar],
    dataSize: CInt
)(using Zone): Wave =
  val __ptr_0: Ptr[Wave] = alloc[Wave](1)
  __sn_wrap_raylib_LoadWaveFromMemory(
    fileType,
    fileData,
    dataSize,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end LoadWaveFromMemory

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadWaveSamples(wave: Wave)(using Zone): Ptr[Float] =
  val __ptr_0: Ptr[Wave] = alloc[Wave](1)
  !(__ptr_0 + 0) = wave
  __sn_wrap_raylib_LoadWaveSamples((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def LoadWaveSamples(wave: Ptr[Wave]): Ptr[Float] =
  __sn_wrap_raylib_LoadWaveSamples(wave)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixAdd(left: Matrix, right: Matrix)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](3)
  !(__ptr_0 + 0) = left
  !(__ptr_0 + 1) = right
  __sn_wrap_raylib_MatrixAdd((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixAdd(left: Ptr[Matrix], right: Ptr[Matrix])(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixAdd(left, right, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixAdd(left: Ptr[Matrix], right: Ptr[Matrix])(
    __return: Ptr[Matrix]
): Unit =
  __sn_wrap_raylib_MatrixAdd(left, right, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixDeterminant(mat: Matrix)(using Zone): Float =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = mat
  __sn_wrap_raylib_MatrixDeterminant((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixDeterminant(mat: Ptr[Matrix]): Float =
  __sn_wrap_raylib_MatrixDeterminant(mat)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixFrustum(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    near: Double,
    far: Double
)(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixFrustum(left, right, bottom, top, near, far, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixFrustum(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    near: Double,
    far: Double
)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixFrustum(
    left,
    right,
    bottom,
    top,
    near,
    far,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end MatrixFrustum

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixIdentity()(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixIdentity((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixIdentity()(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixIdentity(__return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixInvert(mat: Ptr[Matrix])(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixInvert(mat, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixInvert(mat: Ptr[Matrix])(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixInvert(mat, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixInvert(mat: Matrix)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](2)
  !(__ptr_0 + 0) = mat
  __sn_wrap_raylib_MatrixInvert((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixLookAt(eye: Ptr[Vector3], target: Ptr[Vector3], up: Ptr[Vector3])(
    using Zone
): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixLookAt(eye, target, up, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixLookAt(eye: Vector3, target: Vector3, up: Vector3)(using
    Zone
): Matrix =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = eye
  !(__ptr_0 + 1) = target
  !(__ptr_0 + 2) = up
  __sn_wrap_raylib_MatrixLookAt(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    (__ptr_1 + 0)
  )
  !(__ptr_1 + 0)
end MatrixLookAt

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixLookAt(eye: Ptr[Vector3], target: Ptr[Vector3], up: Ptr[Vector3])(
    __return: Ptr[Matrix]
): Unit =
  __sn_wrap_raylib_MatrixLookAt(eye, target, up, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixMultiply(left: Matrix, right: Matrix)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](3)
  !(__ptr_0 + 0) = left
  !(__ptr_0 + 1) = right
  __sn_wrap_raylib_MatrixMultiply((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixMultiply(left: Ptr[Matrix], right: Ptr[Matrix])(
    __return: Ptr[Matrix]
): Unit =
  __sn_wrap_raylib_MatrixMultiply(left, right, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixMultiply(left: Ptr[Matrix], right: Ptr[Matrix])(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixMultiply(left, right, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixOrtho(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    nearPlane: Double,
    farPlane: Double
)(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixOrtho(
    left,
    right,
    bottom,
    top,
    nearPlane,
    farPlane,
    __return
  )

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixOrtho(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    nearPlane: Double,
    farPlane: Double
)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixOrtho(
    left,
    right,
    bottom,
    top,
    nearPlane,
    farPlane,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end MatrixOrtho

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixPerspective(
    fovY: Double,
    aspect: Double,
    nearPlane: Double,
    farPlane: Double
)(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixPerspective(
    fovY,
    aspect,
    nearPlane,
    farPlane,
    __return
  )

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixPerspective(
    fovY: Double,
    aspect: Double,
    nearPlane: Double,
    farPlane: Double
)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixPerspective(
    fovY,
    aspect,
    nearPlane,
    farPlane,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end MatrixPerspective

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotate(axis: Ptr[Vector3], angle: Float)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixRotate(axis, angle, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotate(axis: Vector3, angle: Float)(using Zone): Matrix =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = axis
  __sn_wrap_raylib_MatrixRotate((__ptr_0 + 0), angle, (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotate(axis: Ptr[Vector3], angle: Float)(
    __return: Ptr[Matrix]
): Unit =
  __sn_wrap_raylib_MatrixRotate(axis, angle, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateX(angle: Float)(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixRotateX(angle, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateX(angle: Float)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixRotateX(angle, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateXYZ(angle: Vector3)(using Zone): Matrix =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = angle
  __sn_wrap_raylib_MatrixRotateXYZ((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateXYZ(angle: Ptr[Vector3])(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixRotateXYZ(angle, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateXYZ(angle: Ptr[Vector3])(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixRotateXYZ(angle, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateY(angle: Float)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixRotateY(angle, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateY(angle: Float)(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixRotateY(angle, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateZ(angle: Float)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixRotateZ(angle, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateZ(angle: Float)(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixRotateZ(angle, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateZYX(angle: Vector3)(using Zone): Matrix =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = angle
  __sn_wrap_raylib_MatrixRotateZYX((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateZYX(angle: Ptr[Vector3])(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixRotateZYX(angle, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixRotateZYX(angle: Ptr[Vector3])(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixRotateZYX(angle, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixScale(x: Float, y: Float, z: Float)(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixScale(x, y, z, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixScale(x: Float, y: Float, z: Float)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixScale(x, y, z, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixSubtract(left: Matrix, right: Matrix)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](3)
  !(__ptr_0 + 0) = left
  !(__ptr_0 + 1) = right
  __sn_wrap_raylib_MatrixSubtract((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixSubtract(left: Ptr[Matrix], right: Ptr[Matrix])(
    __return: Ptr[Matrix]
): Unit =
  __sn_wrap_raylib_MatrixSubtract(left, right, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixSubtract(left: Ptr[Matrix], right: Ptr[Matrix])(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixSubtract(left, right, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixToFloatV(mat: Ptr[Matrix])(__return: Ptr[float16]): Unit =
  __sn_wrap_raylib_MatrixToFloatV(mat, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixToFloatV(mat: Matrix)(using Zone): float16 =
  val __ptr_0: Ptr[float16] = alloc[float16](1)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_1 + 0) = mat
  __sn_wrap_raylib_MatrixToFloatV((__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixToFloatV(mat: Ptr[Matrix])(using Zone): float16 =
  val __ptr_0: Ptr[float16] = alloc[float16](1)
  __sn_wrap_raylib_MatrixToFloatV(mat, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixTrace(mat: Ptr[Matrix]): Float =
  __sn_wrap_raylib_MatrixTrace(mat)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixTrace(mat: Matrix)(using Zone): Float =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = mat
  __sn_wrap_raylib_MatrixTrace((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixTranslate(x: Float, y: Float, z: Float)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixTranslate(x, y, z, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixTranslate(x: Float, y: Float, z: Float)(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixTranslate(x, y, z, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixTranspose(mat: Matrix)(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](2)
  !(__ptr_0 + 0) = mat
  __sn_wrap_raylib_MatrixTranspose((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixTranspose(mat: Ptr[Matrix])(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_MatrixTranspose(mat, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def MatrixTranspose(mat: Ptr[Matrix])(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_MatrixTranspose(mat, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def MeasureTextEx(
    font: Ptr[Font],
    text: CString,
    fontSize: Float,
    spacing: Float
)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_MeasureTextEx(font, text, fontSize, spacing, __return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def MeasureTextEx(
    font: Ptr[Font],
    text: CString,
    fontSize: Float,
    spacing: Float
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_MeasureTextEx(font, text, fontSize, spacing, (__ptr_0 + 0))
  !(__ptr_0 + 0)
end MeasureTextEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def MeasureTextEx(font: Font, text: CString, fontSize: Float, spacing: Float)(
    using Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  val __ptr_1: Ptr[Font] = alloc[Font](1)
  !(__ptr_1 + 0) = font
  __sn_wrap_raylib_MeasureTextEx(
    (__ptr_1 + 0),
    text,
    fontSize,
    spacing,
    (__ptr_0 + 0)
  )
  !(__ptr_0 + 0)
end MeasureTextEx

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PauseAudioStream(stream: AudioStream)(using Zone): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_PauseAudioStream((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PauseAudioStream(stream: Ptr[AudioStream]): Unit =
  __sn_wrap_raylib_PauseAudioStream(stream)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PauseMusicStream(music: Ptr[Music]): Unit =
  __sn_wrap_raylib_PauseMusicStream(music)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PauseMusicStream(music: Music)(using Zone): Unit =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_PauseMusicStream((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PauseSound(sound: Ptr[Sound]): Unit =
  __sn_wrap_raylib_PauseSound(sound)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PauseSound(sound: Sound)(using Zone): Unit =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = sound
  __sn_wrap_raylib_PauseSound((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PlayAudioStream(stream: AudioStream)(using Zone): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_PlayAudioStream((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PlayAudioStream(stream: Ptr[AudioStream]): Unit =
  __sn_wrap_raylib_PlayAudioStream(stream)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PlayAutomationEvent(event: Ptr[AutomationEvent]): Unit =
  __sn_wrap_raylib_PlayAutomationEvent(event)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PlayAutomationEvent(event: AutomationEvent)(using Zone): Unit =
  val __ptr_0: Ptr[AutomationEvent] = alloc[AutomationEvent](1)
  !(__ptr_0 + 0) = event
  __sn_wrap_raylib_PlayAutomationEvent((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PlayMusicStream(music: Music)(using Zone): Unit =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_PlayMusicStream((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PlayMusicStream(music: Ptr[Music]): Unit =
  __sn_wrap_raylib_PlayMusicStream(music)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PlaySound(sound: Sound)(using Zone): Unit =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = sound
  __sn_wrap_raylib_PlaySound((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def PlaySound(sound: Ptr[Sound]): Unit =
  __sn_wrap_raylib_PlaySound(sound)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionAdd(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionAdd(q1, q2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionAdd(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionAdd(q1, q2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionAdd(q1: Quaternion, q2: Quaternion)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
  !(__ptr_0 + 0) = q1
  !(__ptr_0 + 1) = q2
  __sn_wrap_raylib_QuaternionAdd((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionAddValue(q: Quaternion, add: Float)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
  !(__ptr_0 + 0) = q
  __sn_wrap_raylib_QuaternionAddValue((__ptr_0 + 0), add, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionAddValue(q: Ptr[Quaternion], add: Float)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionAddValue(q, add, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionAddValue(q: Ptr[Quaternion], add: Float)(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionAddValue(q, add, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionDivide(q1: Quaternion, q2: Quaternion)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
  !(__ptr_0 + 0) = q1
  !(__ptr_0 + 1) = q2
  __sn_wrap_raylib_QuaternionDivide((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionDivide(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionDivide(q1, q2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionDivide(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionDivide(q1, q2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionEquals(p: Quaternion, q: Quaternion)(using Zone): CInt =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
  !(__ptr_0 + 0) = p
  !(__ptr_0 + 1) = q
  __sn_wrap_raylib_QuaternionEquals((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionEquals(p: Ptr[Quaternion], q: Ptr[Quaternion]): CInt =
  __sn_wrap_raylib_QuaternionEquals(p, q)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionFromAxisAngle(axis: Vector3, angle: Float)(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  val __ptr_1: Ptr[Quaternion] = alloc[Quaternion](1)
  !(__ptr_0 + 0) = axis
  __sn_wrap_raylib_QuaternionFromAxisAngle((__ptr_0 + 0), angle, (__ptr_1 + 0))
  !(__ptr_1 + 0)
end QuaternionFromAxisAngle

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionFromAxisAngle(axis: Ptr[Vector3], angle: Float)(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionFromAxisAngle(axis, angle, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionFromAxisAngle(axis: Ptr[Vector3], angle: Float)(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionFromAxisAngle(axis, angle, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionFromEuler(pitch: Float, yaw: Float, roll: Float)(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionFromEuler(pitch, yaw, roll, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionFromEuler(pitch: Float, yaw: Float, roll: Float)(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionFromEuler(pitch, yaw, roll, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionFromMatrix(mat: Matrix)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_1 + 0) = mat
  __sn_wrap_raylib_QuaternionFromMatrix((__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionFromMatrix(mat: Ptr[Matrix])(__return: Ptr[Quaternion]): Unit =
  __sn_wrap_raylib_QuaternionFromMatrix(mat, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionFromMatrix(mat: Ptr[Matrix])(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionFromMatrix(mat, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionFromVector3ToVector3(from: Ptr[Vector3], to: Ptr[Vector3])(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionFromVector3ToVector3(from, to, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionFromVector3ToVector3(from: Ptr[Vector3], to: Ptr[Vector3])(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionFromVector3ToVector3(from, to, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionFromVector3ToVector3(from: Vector3, to: Vector3)(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  val __ptr_1: Ptr[Quaternion] = alloc[Quaternion](1)
  !(__ptr_0 + 0) = from
  !(__ptr_0 + 1) = to
  __sn_wrap_raylib_QuaternionFromVector3ToVector3(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_1 + 0)
  )
  !(__ptr_1 + 0)
end QuaternionFromVector3ToVector3

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionIdentity()(__return: Ptr[Quaternion]): Unit =
  __sn_wrap_raylib_QuaternionIdentity(__return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionIdentity()(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionIdentity((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionInvert(q: Ptr[Quaternion])(__return: Ptr[Quaternion]): Unit =
  __sn_wrap_raylib_QuaternionInvert(q, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionInvert(q: Ptr[Quaternion])(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionInvert(q, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionInvert(q: Quaternion)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
  !(__ptr_0 + 0) = q
  __sn_wrap_raylib_QuaternionInvert((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionLength(q: Ptr[Quaternion]): Float =
  __sn_wrap_raylib_QuaternionLength(q)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionLength(q: Quaternion)(using Zone): Float =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  !(__ptr_0 + 0) = q
  __sn_wrap_raylib_QuaternionLength((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionLerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
    using Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionLerp(q1, q2, amount, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionLerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionLerp(q1, q2, amount, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionLerp(q1: Quaternion, q2: Quaternion, amount: Float)(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
  !(__ptr_0 + 0) = q1
  !(__ptr_0 + 1) = q2
  __sn_wrap_raylib_QuaternionLerp(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    amount,
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end QuaternionLerp

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionMultiply(q1: Quaternion, q2: Quaternion)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
  !(__ptr_0 + 0) = q1
  !(__ptr_0 + 1) = q2
  __sn_wrap_raylib_QuaternionMultiply(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end QuaternionMultiply

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionMultiply(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionMultiply(q1, q2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionMultiply(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionMultiply(q1, q2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionNlerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionNlerp(q1, q2, amount, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionNlerp(q1: Quaternion, q2: Quaternion, amount: Float)(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
  !(__ptr_0 + 0) = q1
  !(__ptr_0 + 1) = q2
  __sn_wrap_raylib_QuaternionNlerp(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    amount,
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end QuaternionNlerp

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionNlerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
    using Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionNlerp(q1, q2, amount, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionNormalize(q: Ptr[Quaternion])(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionNormalize(q, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionNormalize(q: Quaternion)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
  !(__ptr_0 + 0) = q
  __sn_wrap_raylib_QuaternionNormalize((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionNormalize(q: Ptr[Quaternion])(__return: Ptr[Quaternion]): Unit =
  __sn_wrap_raylib_QuaternionNormalize(q, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionScale(q: Ptr[Quaternion], mul: Float)(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionScale(q, mul, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionScale(q: Quaternion, mul: Float)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
  !(__ptr_0 + 0) = q
  __sn_wrap_raylib_QuaternionScale((__ptr_0 + 0), mul, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionScale(q: Ptr[Quaternion], mul: Float)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionScale(q, mul, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionSlerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
    using Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionSlerp(q1, q2, amount, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionSlerp(q1: Quaternion, q2: Quaternion, amount: Float)(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
  !(__ptr_0 + 0) = q1
  !(__ptr_0 + 1) = q2
  __sn_wrap_raylib_QuaternionSlerp(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    amount,
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end QuaternionSlerp

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionSlerp(q1: Ptr[Quaternion], q2: Ptr[Quaternion], amount: Float)(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionSlerp(q1, q2, amount, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionSubtract(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionSubtract(q1, q2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionSubtract(q1: Quaternion, q2: Quaternion)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](3)
  !(__ptr_0 + 0) = q1
  !(__ptr_0 + 1) = q2
  __sn_wrap_raylib_QuaternionSubtract(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end QuaternionSubtract

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionSubtract(q1: Ptr[Quaternion], q2: Ptr[Quaternion])(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionSubtract(q1, q2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionSubtractValue(q: Quaternion, sub: Float)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
  !(__ptr_0 + 0) = q
  __sn_wrap_raylib_QuaternionSubtractValue((__ptr_0 + 0), sub, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionSubtractValue(q: Ptr[Quaternion], sub: Float)(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionSubtractValue(q, sub, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionSubtractValue(q: Ptr[Quaternion], sub: Float)(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionSubtractValue(q, sub, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionToAxisAngle(
    q: Quaternion,
    outAxis: Ptr[Vector3],
    outAngle: Ptr[Float]
)(using Zone): Unit =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  !(__ptr_0 + 0) = q
  __sn_wrap_raylib_QuaternionToAxisAngle((__ptr_0 + 0), outAxis, outAngle)
end QuaternionToAxisAngle

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionToAxisAngle(
    q: Ptr[Quaternion],
    outAxis: Ptr[Vector3],
    outAngle: Ptr[Float]
): Unit =
  __sn_wrap_raylib_QuaternionToAxisAngle(q, outAxis, outAngle)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionToEuler(q: Ptr[Quaternion])(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_QuaternionToEuler(q, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionToEuler(q: Quaternion)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  val __ptr_1: Ptr[Quaternion] = alloc[Quaternion](1)
  !(__ptr_1 + 0) = q
  __sn_wrap_raylib_QuaternionToEuler((__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionToEuler(q: Ptr[Quaternion])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_QuaternionToEuler(q, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionToMatrix(q: Quaternion)(using Zone): Matrix =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = q
  __sn_wrap_raylib_QuaternionToMatrix((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionToMatrix(q: Ptr[Quaternion])(using Zone): Matrix =
  val __ptr_0: Ptr[Matrix] = alloc[Matrix](1)
  __sn_wrap_raylib_QuaternionToMatrix(q, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionToMatrix(q: Ptr[Quaternion])(__return: Ptr[Matrix]): Unit =
  __sn_wrap_raylib_QuaternionToMatrix(q, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionTransform(q: Ptr[Quaternion], mat: Ptr[Matrix])(using
    Zone
): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](1)
  __sn_wrap_raylib_QuaternionTransform(q, mat, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionTransform(q: Ptr[Quaternion], mat: Ptr[Matrix])(
    __return: Ptr[Quaternion]
): Unit =
  __sn_wrap_raylib_QuaternionTransform(q, mat, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def QuaternionTransform(q: Quaternion, mat: Matrix)(using Zone): Quaternion =
  val __ptr_0: Ptr[Quaternion] = alloc[Quaternion](2)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = q
  !(__ptr_1 + 0) = mat
  __sn_wrap_raylib_QuaternionTransform(
    (__ptr_0 + 0),
    (__ptr_1 + 0),
    (__ptr_0 + 1)
  )
  !(__ptr_0 + 1)
end QuaternionTransform

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ResumeAudioStream(stream: AudioStream)(using Zone): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_ResumeAudioStream((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ResumeAudioStream(stream: Ptr[AudioStream]): Unit =
  __sn_wrap_raylib_ResumeAudioStream(stream)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ResumeMusicStream(music: Music)(using Zone): Unit =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_ResumeMusicStream((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ResumeMusicStream(music: Ptr[Music]): Unit =
  __sn_wrap_raylib_ResumeMusicStream(music)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ResumeSound(sound: Ptr[Sound]): Unit =
  __sn_wrap_raylib_ResumeSound(sound)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def ResumeSound(sound: Sound)(using Zone): Unit =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = sound
  __sn_wrap_raylib_ResumeSound((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SeekMusicStream(music: Music, position: Float)(using Zone): Unit =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_SeekMusicStream((__ptr_0 + 0), position)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SeekMusicStream(music: Ptr[Music], position: Float): Unit =
  __sn_wrap_raylib_SeekMusicStream(music, position)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetAudioStreamCallback(stream: AudioStream, callback: AudioCallback)(using
    Zone
): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_SetAudioStreamCallback((__ptr_0 + 0), callback)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetAudioStreamCallback(
    stream: Ptr[AudioStream],
    callback: AudioCallback
): Unit =
  __sn_wrap_raylib_SetAudioStreamCallback(stream, callback)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetAudioStreamPan(stream: AudioStream, pan: Float)(using Zone): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_SetAudioStreamPan((__ptr_0 + 0), pan)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetAudioStreamPan(stream: Ptr[AudioStream], pan: Float): Unit =
  __sn_wrap_raylib_SetAudioStreamPan(stream, pan)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetAudioStreamPitch(stream: AudioStream, pitch: Float)(using Zone): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_SetAudioStreamPitch((__ptr_0 + 0), pitch)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetAudioStreamPitch(stream: Ptr[AudioStream], pitch: Float): Unit =
  __sn_wrap_raylib_SetAudioStreamPitch(stream, pitch)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetAudioStreamVolume(stream: AudioStream, volume: Float)(using Zone): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_SetAudioStreamVolume((__ptr_0 + 0), volume)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetAudioStreamVolume(stream: Ptr[AudioStream], volume: Float): Unit =
  __sn_wrap_raylib_SetAudioStreamVolume(stream, volume)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetMaterialTexture(
    material: Ptr[Material],
    mapType: CInt,
    texture: Texture2D
)(using Zone): Unit =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  !(__ptr_0 + 0) = texture
  __sn_wrap_raylib_SetMaterialTexture(material, mapType, (__ptr_0 + 0))
end SetMaterialTexture

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetMaterialTexture(
    material: Ptr[Material],
    mapType: CInt,
    texture: Ptr[Texture2D]
): Unit =
  __sn_wrap_raylib_SetMaterialTexture(material, mapType, texture)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetMusicPan(music: Ptr[Music], pan: Float): Unit =
  __sn_wrap_raylib_SetMusicPan(music, pan)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetMusicPan(music: Music, pan: Float)(using Zone): Unit =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_SetMusicPan((__ptr_0 + 0), pan)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetMusicPitch(music: Music, pitch: Float)(using Zone): Unit =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_SetMusicPitch((__ptr_0 + 0), pitch)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetMusicPitch(music: Ptr[Music], pitch: Float): Unit =
  __sn_wrap_raylib_SetMusicPitch(music, pitch)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetMusicVolume(music: Music, volume: Float)(using Zone): Unit =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_SetMusicVolume((__ptr_0 + 0), volume)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetMusicVolume(music: Ptr[Music], volume: Float): Unit =
  __sn_wrap_raylib_SetMusicVolume(music, volume)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetPixelColor(dstPtr: Ptr[Byte], color: Ptr[Color], format: CInt): Unit =
  __sn_wrap_raylib_SetPixelColor(dstPtr, color, format)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetPixelColor(dstPtr: Ptr[Byte], color: Color, format: CInt)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Color] = alloc[Color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_raylib_SetPixelColor(dstPtr, (__ptr_0 + 0), format)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetShaderValue(
    shader: Ptr[Shader],
    locIndex: CInt,
    value: Ptr[Byte],
    uniformType: CInt
): Unit =
  __sn_wrap_raylib_SetShaderValue(shader, locIndex, value, uniformType)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetShaderValue(
    shader: Shader,
    locIndex: CInt,
    value: Ptr[Byte],
    uniformType: CInt
)(using Zone): Unit =
  val __ptr_0: Ptr[Shader] = alloc[Shader](1)
  !(__ptr_0 + 0) = shader
  __sn_wrap_raylib_SetShaderValue((__ptr_0 + 0), locIndex, value, uniformType)
end SetShaderValue

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetShaderValueMatrix(
    shader: Ptr[Shader],
    locIndex: CInt,
    mat: Ptr[Matrix]
): Unit =
  __sn_wrap_raylib_SetShaderValueMatrix(shader, locIndex, mat)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetShaderValueMatrix(shader: Shader, locIndex: CInt, mat: Matrix)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Shader] = alloc[Shader](1)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = shader
  !(__ptr_1 + 0) = mat
  __sn_wrap_raylib_SetShaderValueMatrix((__ptr_0 + 0), locIndex, (__ptr_1 + 0))
end SetShaderValueMatrix

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetShaderValueTexture(shader: Shader, locIndex: CInt, texture: Texture2D)(
    using Zone
): Unit =
  val __ptr_0: Ptr[Shader] = alloc[Shader](1)
  val __ptr_1: Ptr[Texture2D] = alloc[Texture2D](1)
  !(__ptr_0 + 0) = shader
  !(__ptr_1 + 0) = texture
  __sn_wrap_raylib_SetShaderValueTexture((__ptr_0 + 0), locIndex, (__ptr_1 + 0))
end SetShaderValueTexture

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetShaderValueTexture(
    shader: Ptr[Shader],
    locIndex: CInt,
    texture: Ptr[Texture2D]
): Unit =
  __sn_wrap_raylib_SetShaderValueTexture(shader, locIndex, texture)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetShaderValueV(
    shader: Ptr[Shader],
    locIndex: CInt,
    value: Ptr[Byte],
    uniformType: CInt,
    count: CInt
): Unit =
  __sn_wrap_raylib_SetShaderValueV(shader, locIndex, value, uniformType, count)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetShaderValueV(
    shader: Shader,
    locIndex: CInt,
    value: Ptr[Byte],
    uniformType: CInt,
    count: CInt
)(using Zone): Unit =
  val __ptr_0: Ptr[Shader] = alloc[Shader](1)
  !(__ptr_0 + 0) = shader
  __sn_wrap_raylib_SetShaderValueV(
    (__ptr_0 + 0),
    locIndex,
    value,
    uniformType,
    count
  )
end SetShaderValueV

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetShapesTexture(texture: Ptr[Texture2D], source: Ptr[Rectangle]): Unit =
  __sn_wrap_raylib_SetShapesTexture(texture, source)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetShapesTexture(texture: Texture2D, source: Rectangle)(using Zone): Unit =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_0 + 0) = texture
  !(__ptr_1 + 0) = source
  __sn_wrap_raylib_SetShapesTexture((__ptr_0 + 0), (__ptr_1 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetSoundPan(sound: Sound, pan: Float)(using Zone): Unit =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = sound
  __sn_wrap_raylib_SetSoundPan((__ptr_0 + 0), pan)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetSoundPan(sound: Ptr[Sound], pan: Float): Unit =
  __sn_wrap_raylib_SetSoundPan(sound, pan)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetSoundPitch(sound: Sound, pitch: Float)(using Zone): Unit =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = sound
  __sn_wrap_raylib_SetSoundPitch((__ptr_0 + 0), pitch)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetSoundPitch(sound: Ptr[Sound], pitch: Float): Unit =
  __sn_wrap_raylib_SetSoundPitch(sound, pitch)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetSoundVolume(sound: Ptr[Sound], volume: Float): Unit =
  __sn_wrap_raylib_SetSoundVolume(sound, volume)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetSoundVolume(sound: Sound, volume: Float)(using Zone): Unit =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = sound
  __sn_wrap_raylib_SetSoundVolume((__ptr_0 + 0), volume)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetTextureFilter(texture: Ptr[Texture2D], filter: CInt): Unit =
  __sn_wrap_raylib_SetTextureFilter(texture, filter)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetTextureFilter(texture: Texture2D, filter: CInt)(using Zone): Unit =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  !(__ptr_0 + 0) = texture
  __sn_wrap_raylib_SetTextureFilter((__ptr_0 + 0), filter)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetTextureWrap(texture: Texture2D, wrap: CInt)(using Zone): Unit =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  !(__ptr_0 + 0) = texture
  __sn_wrap_raylib_SetTextureWrap((__ptr_0 + 0), wrap)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetTextureWrap(texture: Ptr[Texture2D], wrap: CInt): Unit =
  __sn_wrap_raylib_SetTextureWrap(texture, wrap)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetWindowIcon(image: Ptr[Image]): Unit =
  __sn_wrap_raylib_SetWindowIcon(image)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def SetWindowIcon(image: Image)(using Zone): Unit =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = image
  __sn_wrap_raylib_SetWindowIcon((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def StopAudioStream(stream: AudioStream)(using Zone): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_StopAudioStream((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def StopAudioStream(stream: Ptr[AudioStream]): Unit =
  __sn_wrap_raylib_StopAudioStream(stream)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def StopMusicStream(music: Music)(using Zone): Unit =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_StopMusicStream((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def StopMusicStream(music: Ptr[Music]): Unit =
  __sn_wrap_raylib_StopMusicStream(music)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def StopSound(sound: Ptr[Sound]): Unit =
  __sn_wrap_raylib_StopSound(sound)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def StopSound(sound: Sound)(using Zone): Unit =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = sound
  __sn_wrap_raylib_StopSound((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadAudioStream(stream: Ptr[AudioStream]): Unit =
  __sn_wrap_raylib_UnloadAudioStream(stream)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadAudioStream(stream: AudioStream)(using Zone): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_UnloadAudioStream((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadDirectoryFiles(files: FilePathList)(using Zone): Unit =
  val __ptr_0: Ptr[FilePathList] = alloc[FilePathList](1)
  !(__ptr_0 + 0) = files
  __sn_wrap_raylib_UnloadDirectoryFiles((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadDirectoryFiles(files: Ptr[FilePathList]): Unit =
  __sn_wrap_raylib_UnloadDirectoryFiles(files)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadDroppedFiles(files: FilePathList)(using Zone): Unit =
  val __ptr_0: Ptr[FilePathList] = alloc[FilePathList](1)
  !(__ptr_0 + 0) = files
  __sn_wrap_raylib_UnloadDroppedFiles((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadDroppedFiles(files: Ptr[FilePathList]): Unit =
  __sn_wrap_raylib_UnloadDroppedFiles(files)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadFont(font: Ptr[Font]): Unit =
  __sn_wrap_raylib_UnloadFont(font)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadFont(font: Font)(using Zone): Unit =
  val __ptr_0: Ptr[Font] = alloc[Font](1)
  !(__ptr_0 + 0) = font
  __sn_wrap_raylib_UnloadFont((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadImage(image: Image)(using Zone): Unit =
  val __ptr_0: Ptr[Image] = alloc[Image](1)
  !(__ptr_0 + 0) = image
  __sn_wrap_raylib_UnloadImage((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadImage(image: Ptr[Image]): Unit =
  __sn_wrap_raylib_UnloadImage(image)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadMaterial(material: Material)(using Zone): Unit =
  val __ptr_0: Ptr[Material] = alloc[Material](1)
  !(__ptr_0 + 0) = material
  __sn_wrap_raylib_UnloadMaterial((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadMaterial(material: Ptr[Material]): Unit =
  __sn_wrap_raylib_UnloadMaterial(material)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadMesh(mesh: Mesh)(using Zone): Unit =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  !(__ptr_0 + 0) = mesh
  __sn_wrap_raylib_UnloadMesh((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadMesh(mesh: Ptr[Mesh]): Unit =
  __sn_wrap_raylib_UnloadMesh(mesh)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadModel(model: Model)(using Zone): Unit =
  val __ptr_0: Ptr[Model] = alloc[Model](1)
  !(__ptr_0 + 0) = model
  __sn_wrap_raylib_UnloadModel((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadModel(model: Ptr[Model]): Unit =
  __sn_wrap_raylib_UnloadModel(model)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadModelAnimation(anim: Ptr[ModelAnimation]): Unit =
  __sn_wrap_raylib_UnloadModelAnimation(anim)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadModelAnimation(anim: ModelAnimation)(using Zone): Unit =
  val __ptr_0: Ptr[ModelAnimation] = alloc[ModelAnimation](1)
  !(__ptr_0 + 0) = anim
  __sn_wrap_raylib_UnloadModelAnimation((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadMusicStream(music: Music)(using Zone): Unit =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_UnloadMusicStream((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadMusicStream(music: Ptr[Music]): Unit =
  __sn_wrap_raylib_UnloadMusicStream(music)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadRenderTexture(target: RenderTexture2D)(using Zone): Unit =
  val __ptr_0: Ptr[RenderTexture2D] = alloc[RenderTexture2D](1)
  !(__ptr_0 + 0) = target
  __sn_wrap_raylib_UnloadRenderTexture((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadRenderTexture(target: Ptr[RenderTexture2D]): Unit =
  __sn_wrap_raylib_UnloadRenderTexture(target)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadShader(shader: Shader)(using Zone): Unit =
  val __ptr_0: Ptr[Shader] = alloc[Shader](1)
  !(__ptr_0 + 0) = shader
  __sn_wrap_raylib_UnloadShader((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadShader(shader: Ptr[Shader]): Unit =
  __sn_wrap_raylib_UnloadShader(shader)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadSound(sound: Ptr[Sound]): Unit =
  __sn_wrap_raylib_UnloadSound(sound)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadSound(sound: Sound)(using Zone): Unit =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = sound
  __sn_wrap_raylib_UnloadSound((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadSoundAlias(alias: Sound)(using Zone): Unit =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = alias
  __sn_wrap_raylib_UnloadSoundAlias((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadSoundAlias(alias: Ptr[Sound]): Unit =
  __sn_wrap_raylib_UnloadSoundAlias(alias)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadTexture(texture: Texture2D)(using Zone): Unit =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  !(__ptr_0 + 0) = texture
  __sn_wrap_raylib_UnloadTexture((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadTexture(texture: Ptr[Texture2D]): Unit =
  __sn_wrap_raylib_UnloadTexture(texture)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadVrStereoConfig(config: VrStereoConfig)(using Zone): Unit =
  val __ptr_0: Ptr[VrStereoConfig] = alloc[VrStereoConfig](1)
  !(__ptr_0 + 0) = config
  __sn_wrap_raylib_UnloadVrStereoConfig((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadVrStereoConfig(config: Ptr[VrStereoConfig]): Unit =
  __sn_wrap_raylib_UnloadVrStereoConfig(config)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadWave(wave: Ptr[Wave]): Unit =
  __sn_wrap_raylib_UnloadWave(wave)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UnloadWave(wave: Wave)(using Zone): Unit =
  val __ptr_0: Ptr[Wave] = alloc[Wave](1)
  !(__ptr_0 + 0) = wave
  __sn_wrap_raylib_UnloadWave((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateAudioStream(stream: AudioStream, data: Ptr[Byte], frameCount: CInt)(
    using Zone
): Unit =
  val __ptr_0: Ptr[AudioStream] = alloc[AudioStream](1)
  !(__ptr_0 + 0) = stream
  __sn_wrap_raylib_UpdateAudioStream((__ptr_0 + 0), data, frameCount)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateAudioStream(
    stream: Ptr[AudioStream],
    data: Ptr[Byte],
    frameCount: CInt
): Unit =
  __sn_wrap_raylib_UpdateAudioStream(stream, data, frameCount)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateCameraPro(
    camera: Ptr[Camera],
    movement: Ptr[Vector3],
    rotation: Ptr[Vector3],
    zoom: Float
): Unit =
  __sn_wrap_raylib_UpdateCameraPro(camera, movement, rotation, zoom)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateCameraPro(
    camera: Ptr[Camera],
    movement: Vector3,
    rotation: Vector3,
    zoom: Float
)(using Zone): Unit =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = movement
  !(__ptr_0 + 1) = rotation
  __sn_wrap_raylib_UpdateCameraPro(camera, (__ptr_0 + 0), (__ptr_0 + 1), zoom)
end UpdateCameraPro

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateMeshBuffer(
    mesh: Ptr[Mesh],
    index: CInt,
    data: Ptr[Byte],
    dataSize: CInt,
    offset: CInt
): Unit =
  __sn_wrap_raylib_UpdateMeshBuffer(mesh, index, data, dataSize, offset)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateMeshBuffer(
    mesh: Mesh,
    index: CInt,
    data: Ptr[Byte],
    dataSize: CInt,
    offset: CInt
)(using Zone): Unit =
  val __ptr_0: Ptr[Mesh] = alloc[Mesh](1)
  !(__ptr_0 + 0) = mesh
  __sn_wrap_raylib_UpdateMeshBuffer(
    (__ptr_0 + 0),
    index,
    data,
    dataSize,
    offset
  )
end UpdateMeshBuffer

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateModelAnimation(
    model: Ptr[Model],
    anim: Ptr[ModelAnimation],
    frame: CInt
): Unit =
  __sn_wrap_raylib_UpdateModelAnimation(model, anim, frame)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateModelAnimation(model: Model, anim: ModelAnimation, frame: CInt)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Model] = alloc[Model](1)
  val __ptr_1: Ptr[ModelAnimation] = alloc[ModelAnimation](1)
  !(__ptr_0 + 0) = model
  !(__ptr_1 + 0) = anim
  __sn_wrap_raylib_UpdateModelAnimation((__ptr_0 + 0), (__ptr_1 + 0), frame)
end UpdateModelAnimation

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateMusicStream(music: Ptr[Music]): Unit =
  __sn_wrap_raylib_UpdateMusicStream(music)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateMusicStream(music: Music)(using Zone): Unit =
  val __ptr_0: Ptr[Music] = alloc[Music](1)
  !(__ptr_0 + 0) = music
  __sn_wrap_raylib_UpdateMusicStream((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateSound(sound: Sound, data: Ptr[Byte], sampleCount: CInt)(using
    Zone
): Unit =
  val __ptr_0: Ptr[Sound] = alloc[Sound](1)
  !(__ptr_0 + 0) = sound
  __sn_wrap_raylib_UpdateSound((__ptr_0 + 0), data, sampleCount)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateSound(sound: Ptr[Sound], data: Ptr[Byte], sampleCount: CInt): Unit =
  __sn_wrap_raylib_UpdateSound(sound, data, sampleCount)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateTexture(texture: Texture2D, pixels: Ptr[Byte])(using Zone): Unit =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  !(__ptr_0 + 0) = texture
  __sn_wrap_raylib_UpdateTexture((__ptr_0 + 0), pixels)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateTexture(texture: Ptr[Texture2D], pixels: Ptr[Byte]): Unit =
  __sn_wrap_raylib_UpdateTexture(texture, pixels)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateTextureRec(
    texture: Ptr[Texture2D],
    rec: Ptr[Rectangle],
    pixels: Ptr[Byte]
): Unit =
  __sn_wrap_raylib_UpdateTextureRec(texture, rec, pixels)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def UpdateTextureRec(texture: Texture2D, rec: Rectangle, pixels: Ptr[Byte])(
    using Zone
): Unit =
  val __ptr_0: Ptr[Texture2D] = alloc[Texture2D](1)
  val __ptr_1: Ptr[Rectangle] = alloc[Rectangle](1)
  !(__ptr_0 + 0) = texture
  !(__ptr_1 + 0) = rec
  __sn_wrap_raylib_UpdateTextureRec((__ptr_0 + 0), (__ptr_1 + 0), pixels)
end UpdateTextureRec

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Add(v1: Vector2, v2: Vector2)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector2Add((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Add(v1: Ptr[Vector2], v2: Ptr[Vector2])(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_Vector2Add(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Add(v1: Ptr[Vector2], v2: Ptr[Vector2])(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Add(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2AddValue(v: Vector2, add: Float)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector2AddValue((__ptr_0 + 0), add, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2AddValue(v: Ptr[Vector2], add: Float)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_Vector2AddValue(v, add, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2AddValue(v: Ptr[Vector2], add: Float)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2AddValue(v, add, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Angle(v1: Ptr[Vector2], v2: Ptr[Vector2]): Float =
  __sn_wrap_raylib_Vector2Angle(v1, v2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Angle(v1: Vector2, v2: Vector2)(using Zone): Float =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector2Angle((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Clamp(v: Ptr[Vector2], min: Ptr[Vector2], max: Ptr[Vector2])(using
    Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Clamp(v, min, max, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Clamp(v: Ptr[Vector2], min: Ptr[Vector2], max: Ptr[Vector2])(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_Vector2Clamp(v, min, max, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Clamp(v: Vector2, min: Vector2, max: Vector2)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](4)
  !(__ptr_0 + 0) = v
  !(__ptr_0 + 1) = min
  !(__ptr_0 + 2) = max
  __sn_wrap_raylib_Vector2Clamp(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    (__ptr_0 + 3)
  )
  !(__ptr_0 + 3)
end Vector2Clamp

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2ClampValue(v: Ptr[Vector2], min: Float, max: Float)(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_Vector2ClampValue(v, min, max, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2ClampValue(v: Ptr[Vector2], min: Float, max: Float)(using
    Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2ClampValue(v, min, max, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2ClampValue(v: Vector2, min: Float, max: Float)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector2ClampValue((__ptr_0 + 0), min, max, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Distance(v1: Vector2, v2: Vector2)(using Zone): Float =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector2Distance((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Distance(v1: Ptr[Vector2], v2: Ptr[Vector2]): Float =
  __sn_wrap_raylib_Vector2Distance(v1, v2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2DistanceSqr(v1: Vector2, v2: Vector2)(using Zone): Float =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector2DistanceSqr((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2DistanceSqr(v1: Ptr[Vector2], v2: Ptr[Vector2]): Float =
  __sn_wrap_raylib_Vector2DistanceSqr(v1, v2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Divide(v1: Ptr[Vector2], v2: Ptr[Vector2])(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_Vector2Divide(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Divide(v1: Vector2, v2: Vector2)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector2Divide((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Divide(v1: Ptr[Vector2], v2: Ptr[Vector2])(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Divide(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2DotProduct(v1: Vector2, v2: Vector2)(using Zone): Float =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector2DotProduct((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2DotProduct(v1: Ptr[Vector2], v2: Ptr[Vector2]): Float =
  __sn_wrap_raylib_Vector2DotProduct(v1, v2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Equals(p: Vector2, q: Vector2)(using Zone): CInt =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = p
  !(__ptr_0 + 1) = q
  __sn_wrap_raylib_Vector2Equals((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Equals(p: Ptr[Vector2], q: Ptr[Vector2]): CInt =
  __sn_wrap_raylib_Vector2Equals(p, q)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Invert(v: Vector2)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector2Invert((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Invert(v: Ptr[Vector2])(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_Vector2Invert(v, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Invert(v: Ptr[Vector2])(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Invert(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Length(v: Vector2)(using Zone): Float =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector2Length((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Length(v: Ptr[Vector2]): Float =
  __sn_wrap_raylib_Vector2Length(v)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2LengthSqr(v: Vector2)(using Zone): Float =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector2LengthSqr((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2LengthSqr(v: Ptr[Vector2]): Float =
  __sn_wrap_raylib_Vector2LengthSqr(v)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Lerp(v1: Vector2, v2: Vector2, amount: Float)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector2Lerp(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    amount,
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end Vector2Lerp

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Lerp(v1: Ptr[Vector2], v2: Ptr[Vector2], amount: Float)(using
    Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Lerp(v1, v2, amount, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Lerp(v1: Ptr[Vector2], v2: Ptr[Vector2], amount: Float)(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_Vector2Lerp(v1, v2, amount, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2LineAngle(start: Vector2, end: Vector2)(using Zone): Float =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = start
  !(__ptr_0 + 1) = end
  __sn_wrap_raylib_Vector2LineAngle((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2LineAngle(start: Ptr[Vector2], end: Ptr[Vector2]): Float =
  __sn_wrap_raylib_Vector2LineAngle(start, end)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2MoveTowards(
    v: Ptr[Vector2],
    target: Ptr[Vector2],
    maxDistance: Float
)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2MoveTowards(v, target, maxDistance, (__ptr_0 + 0))
  !(__ptr_0 + 0)
end Vector2MoveTowards

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2MoveTowards(v: Vector2, target: Vector2, maxDistance: Float)(using
    Zone
): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_0 + 0) = v
  !(__ptr_0 + 1) = target
  __sn_wrap_raylib_Vector2MoveTowards(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    maxDistance,
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end Vector2MoveTowards

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2MoveTowards(
    v: Ptr[Vector2],
    target: Ptr[Vector2],
    maxDistance: Float
)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_Vector2MoveTowards(v, target, maxDistance, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Multiply(v1: Vector2, v2: Vector2)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector2Multiply((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Multiply(v1: Ptr[Vector2], v2: Ptr[Vector2])(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Multiply(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Multiply(v1: Ptr[Vector2], v2: Ptr[Vector2])(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_Vector2Multiply(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Negate(v: Ptr[Vector2])(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_Vector2Negate(v, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Negate(v: Vector2)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector2Negate((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Negate(v: Ptr[Vector2])(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Negate(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Normalize(v: Ptr[Vector2])(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Normalize(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Normalize(v: Ptr[Vector2])(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_Vector2Normalize(v, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Normalize(v: Vector2)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector2Normalize((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2One()(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_Vector2One(__return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2One()(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2One((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Reflect(v: Vector2, normal: Vector2)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_0 + 0) = v
  !(__ptr_0 + 1) = normal
  __sn_wrap_raylib_Vector2Reflect((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Reflect(v: Ptr[Vector2], normal: Ptr[Vector2])(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Reflect(v, normal, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Reflect(v: Ptr[Vector2], normal: Ptr[Vector2])(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_Vector2Reflect(v, normal, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Rotate(v: Ptr[Vector2], angle: Float)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_Vector2Rotate(v, angle, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Rotate(v: Ptr[Vector2], angle: Float)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Rotate(v, angle, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Rotate(v: Vector2, angle: Float)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector2Rotate((__ptr_0 + 0), angle, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Scale(v: Ptr[Vector2], scale: Float)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Scale(v, scale, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Scale(v: Ptr[Vector2], scale: Float)(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_Vector2Scale(v, scale, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Scale(v: Vector2, scale: Float)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector2Scale((__ptr_0 + 0), scale, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Subtract(v1: Ptr[Vector2], v2: Ptr[Vector2])(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_Vector2Subtract(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Subtract(v1: Vector2, v2: Vector2)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector2Subtract((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Subtract(v1: Ptr[Vector2], v2: Ptr[Vector2])(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Subtract(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2SubtractValue(v: Ptr[Vector2], sub: Float)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2SubtractValue(v, sub, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2SubtractValue(v: Ptr[Vector2], sub: Float)(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_Vector2SubtractValue(v, sub, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2SubtractValue(v: Vector2, sub: Float)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector2SubtractValue((__ptr_0 + 0), sub, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Transform(v: Vector2, mat: Matrix)(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](2)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = v
  !(__ptr_1 + 0) = mat
  __sn_wrap_raylib_Vector2Transform((__ptr_0 + 0), (__ptr_1 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Transform(v: Ptr[Vector2], mat: Ptr[Matrix])(
    __return: Ptr[Vector2]
): Unit =
  __sn_wrap_raylib_Vector2Transform(v, mat, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Transform(v: Ptr[Vector2], mat: Ptr[Matrix])(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Transform(v, mat, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Zero()(__return: Ptr[Vector2]): Unit =
  __sn_wrap_raylib_Vector2Zero(__return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector2Zero()(using Zone): Vector2 =
  val __ptr_0: Ptr[Vector2] = alloc[Vector2](1)
  __sn_wrap_raylib_Vector2Zero((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Add(v1: Ptr[Vector3], v2: Ptr[Vector3])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Add(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Add(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3Add((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Add(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Add(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3AddValue(v: Vector3, add: Float)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector3AddValue((__ptr_0 + 0), add, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3AddValue(v: Ptr[Vector3], add: Float)(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_Vector3AddValue(v, add, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3AddValue(v: Ptr[Vector3], add: Float)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3AddValue(v, add, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Angle(v1: Ptr[Vector3], v2: Ptr[Vector3]): Float =
  __sn_wrap_raylib_Vector3Angle(v1, v2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Angle(v1: Vector3, v2: Vector3)(using Zone): Float =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3Angle((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Barycenter(
    p: Ptr[Vector3],
    a: Ptr[Vector3],
    b: Ptr[Vector3],
    c: Ptr[Vector3]
)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Barycenter(p, a, b, c, (__ptr_0 + 0))
  !(__ptr_0 + 0)
end Vector3Barycenter

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Barycenter(p: Vector3, a: Vector3, b: Vector3, c: Vector3)(using
    Zone
): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](5)
  !(__ptr_0 + 0) = p
  !(__ptr_0 + 1) = a
  !(__ptr_0 + 2) = b
  !(__ptr_0 + 3) = c
  __sn_wrap_raylib_Vector3Barycenter(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    (__ptr_0 + 3),
    (__ptr_0 + 4)
  )
  !(__ptr_0 + 4)
end Vector3Barycenter

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Barycenter(
    p: Ptr[Vector3],
    a: Ptr[Vector3],
    b: Ptr[Vector3],
    c: Ptr[Vector3]
)(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_Vector3Barycenter(p, a, b, c, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Clamp(v: Vector3, min: Vector3, max: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](4)
  !(__ptr_0 + 0) = v
  !(__ptr_0 + 1) = min
  !(__ptr_0 + 2) = max
  __sn_wrap_raylib_Vector3Clamp(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2),
    (__ptr_0 + 3)
  )
  !(__ptr_0 + 3)
end Vector3Clamp

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Clamp(v: Ptr[Vector3], min: Ptr[Vector3], max: Ptr[Vector3])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Clamp(v, min, max, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Clamp(v: Ptr[Vector3], min: Ptr[Vector3], max: Ptr[Vector3])(using
    Zone
): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Clamp(v, min, max, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3ClampValue(v: Ptr[Vector3], min: Float, max: Float)(using
    Zone
): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3ClampValue(v, min, max, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3ClampValue(v: Ptr[Vector3], min: Float, max: Float)(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3ClampValue(v, min, max, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3ClampValue(v: Vector3, min: Float, max: Float)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector3ClampValue((__ptr_0 + 0), min, max, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3CrossProduct(v1: Ptr[Vector3], v2: Ptr[Vector3])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3CrossProduct(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3CrossProduct(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3CrossProduct(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end Vector3CrossProduct

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3CrossProduct(v1: Ptr[Vector3], v2: Ptr[Vector3])(using
    Zone
): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3CrossProduct(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Distance(v1: Ptr[Vector3], v2: Ptr[Vector3]): Float =
  __sn_wrap_raylib_Vector3Distance(v1, v2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Distance(v1: Vector3, v2: Vector3)(using Zone): Float =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3Distance((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3DistanceSqr(v1: Vector3, v2: Vector3)(using Zone): Float =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3DistanceSqr((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3DistanceSqr(v1: Ptr[Vector3], v2: Ptr[Vector3]): Float =
  __sn_wrap_raylib_Vector3DistanceSqr(v1, v2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Divide(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3Divide((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Divide(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Divide(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Divide(v1: Ptr[Vector3], v2: Ptr[Vector3])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Divide(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3DotProduct(v1: Vector3, v2: Vector3)(using Zone): Float =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3DotProduct((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3DotProduct(v1: Ptr[Vector3], v2: Ptr[Vector3]): Float =
  __sn_wrap_raylib_Vector3DotProduct(v1, v2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Equals(p: Ptr[Vector3], q: Ptr[Vector3]): CInt =
  __sn_wrap_raylib_Vector3Equals(p, q)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Equals(p: Vector3, q: Vector3)(using Zone): CInt =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = p
  !(__ptr_0 + 1) = q
  __sn_wrap_raylib_Vector3Equals((__ptr_0 + 0), (__ptr_0 + 1))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Invert(v: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Invert(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Invert(v: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector3Invert((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Invert(v: Ptr[Vector3])(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_Vector3Invert(v, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Length(v: Vector3)(using Zone): Float =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector3Length((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Length(v: Ptr[Vector3]): Float =
  __sn_wrap_raylib_Vector3Length(v)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3LengthSqr(v: Ptr[Vector3]): Float =
  __sn_wrap_raylib_Vector3LengthSqr(v)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3LengthSqr(v: Vector3)(using Zone): Float =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector3LengthSqr((__ptr_0 + 0))

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Lerp(v1: Vector3, v2: Vector3, amount: Float)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3Lerp(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    amount,
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end Vector3Lerp

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Lerp(v1: Ptr[Vector3], v2: Ptr[Vector3], amount: Float)(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Lerp(v1, v2, amount, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Lerp(v1: Ptr[Vector3], v2: Ptr[Vector3], amount: Float)(using
    Zone
): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Lerp(v1, v2, amount, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Max(v1: Ptr[Vector3], v2: Ptr[Vector3])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Max(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Max(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Max(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Max(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3Max((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Min(v1: Ptr[Vector3], v2: Ptr[Vector3])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Min(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Min(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Min(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Min(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3Min((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Multiply(v1: Ptr[Vector3], v2: Ptr[Vector3])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Multiply(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Multiply(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Multiply(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Multiply(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3Multiply((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Negate(v: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector3Negate((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Negate(v: Ptr[Vector3])(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_Vector3Negate(v, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Negate(v: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Negate(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Normalize(v: Ptr[Vector3])(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_Vector3Normalize(v, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Normalize(v: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector3Normalize((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Normalize(v: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Normalize(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3One()(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_Vector3One(__return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3One()(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3One((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Perpendicular(v: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Perpendicular(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Perpendicular(v: Ptr[Vector3])(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_Vector3Perpendicular(v, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Perpendicular(v: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector3Perpendicular((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Project(v1: Ptr[Vector3], v2: Ptr[Vector3])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Project(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Project(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Project(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Project(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3Project((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Reflect(v: Ptr[Vector3], normal: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Reflect(v, normal, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Reflect(v: Ptr[Vector3], normal: Ptr[Vector3])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Reflect(v, normal, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Reflect(v: Vector3, normal: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v
  !(__ptr_0 + 1) = normal
  __sn_wrap_raylib_Vector3Reflect((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Refract(v: Ptr[Vector3], n: Ptr[Vector3], r: Float)(using
    Zone
): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Refract(v, n, r, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Refract(v: Ptr[Vector3], n: Ptr[Vector3], r: Float)(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Refract(v, n, r, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Refract(v: Vector3, n: Vector3, r: Float)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v
  !(__ptr_0 + 1) = n
  __sn_wrap_raylib_Vector3Refract(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    r,
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end Vector3Refract

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Reject(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Reject(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Reject(v1: Ptr[Vector3], v2: Ptr[Vector3])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Reject(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Reject(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3Reject((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3RotateByAxisAngle(v: Ptr[Vector3], axis: Ptr[Vector3], angle: Float)(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3RotateByAxisAngle(v, axis, angle, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3RotateByAxisAngle(v: Vector3, axis: Vector3, angle: Float)(using
    Zone
): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v
  !(__ptr_0 + 1) = axis
  __sn_wrap_raylib_Vector3RotateByAxisAngle(
    (__ptr_0 + 0),
    (__ptr_0 + 1),
    angle,
    (__ptr_0 + 2)
  )
  !(__ptr_0 + 2)
end Vector3RotateByAxisAngle

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3RotateByAxisAngle(v: Ptr[Vector3], axis: Ptr[Vector3], angle: Float)(
    using Zone
): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3RotateByAxisAngle(v, axis, angle, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3RotateByQuaternion(v: Ptr[Vector3], q: Ptr[Quaternion])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3RotateByQuaternion(v, q, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3RotateByQuaternion(v: Ptr[Vector3], q: Ptr[Quaternion])(using
    Zone
): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3RotateByQuaternion(v, q, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3RotateByQuaternion(v: Vector3, q: Quaternion)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  val __ptr_1: Ptr[Quaternion] = alloc[Quaternion](1)
  !(__ptr_0 + 0) = v
  !(__ptr_1 + 0) = q
  __sn_wrap_raylib_Vector3RotateByQuaternion(
    (__ptr_0 + 0),
    (__ptr_1 + 0),
    (__ptr_0 + 1)
  )
  !(__ptr_0 + 1)
end Vector3RotateByQuaternion

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Scale(v: Vector3, scalar: Float)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector3Scale((__ptr_0 + 0), scalar, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Scale(v: Ptr[Vector3], scalar: Float)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Scale(v, scalar, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Scale(v: Ptr[Vector3], scalar: Float)(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_Vector3Scale(v, scalar, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Subtract(v1: Vector3, v2: Vector3)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](3)
  !(__ptr_0 + 0) = v1
  !(__ptr_0 + 1) = v2
  __sn_wrap_raylib_Vector3Subtract((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Subtract(v1: Ptr[Vector3], v2: Ptr[Vector3])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Subtract(v1, v2, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Subtract(v1: Ptr[Vector3], v2: Ptr[Vector3])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Subtract(v1, v2, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3SubtractValue(v: Ptr[Vector3], sub: Float)(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3SubtractValue(v, sub, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3SubtractValue(v: Vector3, sub: Float)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_raylib_Vector3SubtractValue((__ptr_0 + 0), sub, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3SubtractValue(v: Ptr[Vector3], sub: Float)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3SubtractValue(v, sub, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3ToFloatV(v: Vector3)(using Zone): float3 =
  val __ptr_0: Ptr[float3] = alloc[float3](1)
  val __ptr_1: Ptr[Vector3] = alloc[Vector3](1)
  !(__ptr_1 + 0) = v
  __sn_wrap_raylib_Vector3ToFloatV((__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3ToFloatV(v: Ptr[Vector3])(__return: Ptr[float3]): Unit =
  __sn_wrap_raylib_Vector3ToFloatV(v, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3ToFloatV(v: Ptr[Vector3])(using Zone): float3 =
  val __ptr_0: Ptr[float3] = alloc[float3](1)
  __sn_wrap_raylib_Vector3ToFloatV(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Transform(v: Ptr[Vector3], mat: Ptr[Matrix])(
    __return: Ptr[Vector3]
): Unit =
  __sn_wrap_raylib_Vector3Transform(v, mat, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Transform(v: Ptr[Vector3], mat: Ptr[Matrix])(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Transform(v, mat, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Transform(v: Vector3, mat: Matrix)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](1)
  !(__ptr_0 + 0) = v
  !(__ptr_1 + 0) = mat
  __sn_wrap_raylib_Vector3Transform((__ptr_0 + 0), (__ptr_1 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Unproject(source: Vector3, projection: Matrix, view: Matrix)(using
    Zone
): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](2)
  val __ptr_1: Ptr[Matrix] = alloc[Matrix](2)
  !(__ptr_0 + 0) = source
  !(__ptr_1 + 0) = projection
  !(__ptr_1 + 1) = view
  __sn_wrap_raylib_Vector3Unproject(
    (__ptr_0 + 0),
    (__ptr_1 + 0),
    (__ptr_1 + 1),
    (__ptr_0 + 1)
  )
  !(__ptr_0 + 1)
end Vector3Unproject

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Unproject(
    source: Ptr[Vector3],
    projection: Ptr[Matrix],
    view: Ptr[Matrix]
)(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Unproject(source, projection, view, (__ptr_0 + 0))
  !(__ptr_0 + 0)
end Vector3Unproject

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Unproject(
    source: Ptr[Vector3],
    projection: Ptr[Matrix],
    view: Ptr[Matrix]
)(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_Vector3Unproject(source, projection, view, __return)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Zero()(using Zone): Vector3 =
  val __ptr_0: Ptr[Vector3] = alloc[Vector3](1)
  __sn_wrap_raylib_Vector3Zero((__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raymath.h
  */
def Vector3Zero()(__return: Ptr[Vector3]): Unit =
  __sn_wrap_raylib_Vector3Zero(__return)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def WaveCopy(wave: Ptr[Wave])(using Zone): Wave =
  val __ptr_0: Ptr[Wave] = alloc[Wave](1)
  __sn_wrap_raylib_WaveCopy(wave, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def WaveCopy(wave: Wave)(using Zone): Wave =
  val __ptr_0: Ptr[Wave] = alloc[Wave](2)
  !(__ptr_0 + 0) = wave
  __sn_wrap_raylib_WaveCopy((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/** [bindgen] header: ./raylib/src/raylib.h
  */
def WaveCopy(wave: Ptr[Wave])(__return: Ptr[Wave]): Unit =
  __sn_wrap_raylib_WaveCopy(wave, __return)
