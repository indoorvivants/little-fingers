package raylib

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type AudioCallback = CFuncPtr2[Ptr[Byte], CUnsignedInt, Unit]
object AudioCallback: 
  given _tag: Tag[AudioCallback] = Tag.materializeCFuncPtr2[Ptr[Byte], CUnsignedInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): AudioCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[Byte], CUnsignedInt, Unit]): AudioCallback = o
  extension (v: AudioCallback)
    inline def value: CFuncPtr2[Ptr[Byte], CUnsignedInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
type Camera = Camera3D
object Camera: 
  given _tag: Tag[Camera] = Camera3D._tag
  inline def apply(inline o: Camera3D): Camera = o
  extension (v: Camera)
    inline def value: Camera3D = v

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type LoadFileDataCallback = CFuncPtr2[CString, Ptr[CInt], Ptr[CUnsignedChar]]
object LoadFileDataCallback: 
  given _tag: Tag[LoadFileDataCallback] = Tag.materializeCFuncPtr2[CString, Ptr[CInt], Ptr[CUnsignedChar]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): LoadFileDataCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[CString, Ptr[CInt], Ptr[CUnsignedChar]]): LoadFileDataCallback = o
  extension (v: LoadFileDataCallback)
    inline def value: CFuncPtr2[CString, Ptr[CInt], Ptr[CUnsignedChar]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type LoadFileTextCallback = CFuncPtr1[CString, CString]
object LoadFileTextCallback: 
  given _tag: Tag[LoadFileTextCallback] = Tag.materializeCFuncPtr1[CString, CString]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): LoadFileTextCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[CString, CString]): LoadFileTextCallback = o
  extension (v: LoadFileTextCallback)
    inline def value: CFuncPtr1[CString, CString] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
type Quaternion = Vector4
object Quaternion: 
  given _tag: Tag[Quaternion] = Vector4._tag
  inline def apply(inline o: Vector4): Quaternion = o
  extension (v: Quaternion)
    inline def value: Vector4 = v

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
type RenderTexture2D = RenderTexture
object RenderTexture2D: 
  given _tag: Tag[RenderTexture2D] = RenderTexture._tag
  inline def apply(inline o: RenderTexture): RenderTexture2D = o
  extension (v: RenderTexture2D)
    inline def value: RenderTexture = v

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type SaveFileDataCallback = CFuncPtr3[CString, Ptr[Byte], CInt, Boolean]
object SaveFileDataCallback: 
  given _tag: Tag[SaveFileDataCallback] = Tag.materializeCFuncPtr3[CString, Ptr[Byte], CInt, Boolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): SaveFileDataCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[CString, Ptr[Byte], CInt, Boolean]): SaveFileDataCallback = o
  extension (v: SaveFileDataCallback)
    inline def value: CFuncPtr3[CString, Ptr[Byte], CInt, Boolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type SaveFileTextCallback = CFuncPtr2[CString, CString, Boolean]
object SaveFileTextCallback: 
  given _tag: Tag[SaveFileTextCallback] = Tag.materializeCFuncPtr2[CString, CString, Boolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): SaveFileTextCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[CString, CString, Boolean]): SaveFileTextCallback = o
  extension (v: SaveFileTextCallback)
    inline def value: CFuncPtr2[CString, CString, Boolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
type Texture2D = Texture
object Texture2D: 
  given _tag: Tag[Texture2D] = Texture._tag
  inline def apply(inline o: Texture): Texture2D = o
  extension (v: Texture2D)
    inline def value: Texture = v

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
type TextureCubemap = Texture
object TextureCubemap: 
  given _tag: Tag[TextureCubemap] = Texture._tag
  inline def apply(inline o: Texture): TextureCubemap = o
  extension (v: TextureCubemap)
    inline def value: Texture = v

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type TraceLogCallback = CFuncPtr3[CInt, CString, va_list, Unit]
object TraceLogCallback: 
  given _tag: Tag[TraceLogCallback] = Tag.materializeCFuncPtr3[CInt, CString, va_list, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): TraceLogCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[CInt, CString, va_list, Unit]): TraceLogCallback = o
  extension (v: TraceLogCallback)
    inline def value: CFuncPtr3[CInt, CString, va_list, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type va_list = unsafe.CVarArgList
object va_list: 
  val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
  inline def apply(inline o: unsafe.CVarArgList): va_list = o
  extension (v: va_list)
    inline def value: unsafe.CVarArgList = v