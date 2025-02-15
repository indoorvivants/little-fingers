package raylib

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type AudioStream = CStruct5[Ptr[rAudioBuffer], Ptr[rAudioProcessor], CUnsignedInt, CUnsignedInt, CUnsignedInt]
object AudioStream:
  given _tag: Tag[AudioStream] = Tag.materializeCStruct5Tag[Ptr[rAudioBuffer], Ptr[rAudioProcessor], CUnsignedInt, CUnsignedInt, CUnsignedInt]
  def apply()(using Zone): Ptr[AudioStream] = scala.scalanative.unsafe.alloc[AudioStream](1)
  def apply(buffer : Ptr[rAudioBuffer], processor : Ptr[rAudioProcessor], sampleRate : CUnsignedInt, sampleSize : CUnsignedInt, channels : CUnsignedInt)(using Zone): Ptr[AudioStream] = 
    val ____ptr = apply()
    (!____ptr).buffer = buffer
    (!____ptr).processor = processor
    (!____ptr).sampleRate = sampleRate
    (!____ptr).sampleSize = sampleSize
    (!____ptr).channels = channels
    ____ptr
  extension (struct: AudioStream)
    def buffer : Ptr[rAudioBuffer] = struct._1
    def buffer_=(value: Ptr[rAudioBuffer]): Unit = !struct.at1 = value
    def processor : Ptr[rAudioProcessor] = struct._2
    def processor_=(value: Ptr[rAudioProcessor]): Unit = !struct.at2 = value
    def sampleRate : CUnsignedInt = struct._3
    def sampleRate_=(value: CUnsignedInt): Unit = !struct.at3 = value
    def sampleSize : CUnsignedInt = struct._4
    def sampleSize_=(value: CUnsignedInt): Unit = !struct.at4 = value
    def channels : CUnsignedInt = struct._5
    def channels_=(value: CUnsignedInt): Unit = !struct.at5 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type AutomationEvent = CStruct3[CUnsignedInt, CUnsignedInt, CArray[CInt, Nat._4]]
object AutomationEvent:
  given _tag: Tag[AutomationEvent] = Tag.materializeCStruct3Tag[CUnsignedInt, CUnsignedInt, CArray[CInt, Nat._4]]
  def apply()(using Zone): Ptr[AutomationEvent] = scala.scalanative.unsafe.alloc[AutomationEvent](1)
  def apply(frame : CUnsignedInt, `type` : CUnsignedInt, params : CArray[CInt, Nat._4])(using Zone): Ptr[AutomationEvent] = 
    val ____ptr = apply()
    (!____ptr).frame = frame
    (!____ptr).`type` = `type`
    (!____ptr).params = params
    ____ptr
  extension (struct: AutomationEvent)
    def frame : CUnsignedInt = struct._1
    def frame_=(value: CUnsignedInt): Unit = !struct.at1 = value
    def `type` : CUnsignedInt = struct._2
    def type_=(value: CUnsignedInt): Unit = !struct.at2 = value
    def params : CArray[CInt, Nat._4] = struct._3
    def params_=(value: CArray[CInt, Nat._4]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type AutomationEventList = CStruct3[CUnsignedInt, CUnsignedInt, Ptr[AutomationEvent]]
object AutomationEventList:
  given _tag: Tag[AutomationEventList] = Tag.materializeCStruct3Tag[CUnsignedInt, CUnsignedInt, Ptr[AutomationEvent]]
  def apply()(using Zone): Ptr[AutomationEventList] = scala.scalanative.unsafe.alloc[AutomationEventList](1)
  def apply(capacity : CUnsignedInt, count : CUnsignedInt, events : Ptr[AutomationEvent])(using Zone): Ptr[AutomationEventList] = 
    val ____ptr = apply()
    (!____ptr).capacity = capacity
    (!____ptr).count = count
    (!____ptr).events = events
    ____ptr
  extension (struct: AutomationEventList)
    def capacity : CUnsignedInt = struct._1
    def capacity_=(value: CUnsignedInt): Unit = !struct.at1 = value
    def count : CUnsignedInt = struct._2
    def count_=(value: CUnsignedInt): Unit = !struct.at2 = value
    def events : Ptr[AutomationEvent] = struct._3
    def events_=(value: Ptr[AutomationEvent]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type BoneInfo = CStruct2[CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], CInt]
object BoneInfo:
  given _tag: Tag[BoneInfo] = Tag.materializeCStruct2Tag[CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], CInt]
  def apply()(using Zone): Ptr[BoneInfo] = scala.scalanative.unsafe.alloc[BoneInfo](1)
  def apply(name : CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], parent : CInt)(using Zone): Ptr[BoneInfo] = 
    val ____ptr = apply()
    (!____ptr).name = name
    (!____ptr).parent = parent
    ____ptr
  extension (struct: BoneInfo)
    def name : CArray[CChar, Nat.Digit2[Nat._3, Nat._2]] = struct._1
    def name_=(value: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at1 = value
    def parent : CInt = struct._2
    def parent_=(value: CInt): Unit = !struct.at2 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type BoundingBox = CStruct2[Vector3, Vector3]
object BoundingBox:
  given _tag: Tag[BoundingBox] = Tag.materializeCStruct2Tag[Vector3, Vector3]
  def apply()(using Zone): Ptr[BoundingBox] = scala.scalanative.unsafe.alloc[BoundingBox](1)
  def apply(min : Vector3, max : Vector3)(using Zone): Ptr[BoundingBox] = 
    val ____ptr = apply()
    (!____ptr).min = min
    (!____ptr).max = max
    ____ptr
  extension (struct: BoundingBox)
    def min : Vector3 = struct._1
    def min_=(value: Vector3): Unit = !struct.at1 = value
    def max : Vector3 = struct._2
    def max_=(value: Vector3): Unit = !struct.at2 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Camera2D = CStruct4[Vector2, Vector2, Float, Float]
object Camera2D:
  given _tag: Tag[Camera2D] = Tag.materializeCStruct4Tag[Vector2, Vector2, Float, Float]
  def apply()(using Zone): Ptr[Camera2D] = scala.scalanative.unsafe.alloc[Camera2D](1)
  def apply(offset : Vector2, target : Vector2, rotation : Float, zoom : Float)(using Zone): Ptr[Camera2D] = 
    val ____ptr = apply()
    (!____ptr).offset = offset
    (!____ptr).target = target
    (!____ptr).rotation = rotation
    (!____ptr).zoom = zoom
    ____ptr
  extension (struct: Camera2D)
    def offset : Vector2 = struct._1
    def offset_=(value: Vector2): Unit = !struct.at1 = value
    def target : Vector2 = struct._2
    def target_=(value: Vector2): Unit = !struct.at2 = value
    def rotation : Float = struct._3
    def rotation_=(value: Float): Unit = !struct.at3 = value
    def zoom : Float = struct._4
    def zoom_=(value: Float): Unit = !struct.at4 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Camera3D = CStruct5[Vector3, Vector3, Vector3, Float, CInt]
object Camera3D:
  given _tag: Tag[Camera3D] = Tag.materializeCStruct5Tag[Vector3, Vector3, Vector3, Float, CInt]
  def apply()(using Zone): Ptr[Camera3D] = scala.scalanative.unsafe.alloc[Camera3D](1)
  def apply(position : Vector3, target : Vector3, up : Vector3, fovy : Float, projection : CInt)(using Zone): Ptr[Camera3D] = 
    val ____ptr = apply()
    (!____ptr).position = position
    (!____ptr).target = target
    (!____ptr).up = up
    (!____ptr).fovy = fovy
    (!____ptr).projection = projection
    ____ptr
  extension (struct: Camera3D)
    def position : Vector3 = struct._1
    def position_=(value: Vector3): Unit = !struct.at1 = value
    def target : Vector3 = struct._2
    def target_=(value: Vector3): Unit = !struct.at2 = value
    def up : Vector3 = struct._3
    def up_=(value: Vector3): Unit = !struct.at3 = value
    def fovy : Float = struct._4
    def fovy_=(value: Float): Unit = !struct.at4 = value
    def projection : CInt = struct._5
    def projection_=(value: CInt): Unit = !struct.at5 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Color = CStruct4[CUnsignedChar, CUnsignedChar, CUnsignedChar, CUnsignedChar]
object Color:
  given _tag: Tag[Color] = Tag.materializeCStruct4Tag[CUnsignedChar, CUnsignedChar, CUnsignedChar, CUnsignedChar]
  def apply()(using Zone): Ptr[Color] = scala.scalanative.unsafe.alloc[Color](1)
  def apply(r : CUnsignedChar, g : CUnsignedChar, b : CUnsignedChar, a : CUnsignedChar)(using Zone): Ptr[Color] = 
    val ____ptr = apply()
    (!____ptr).r = r
    (!____ptr).g = g
    (!____ptr).b = b
    (!____ptr).a = a
    ____ptr
  extension (struct: Color)
    def r : CUnsignedChar = struct._1
    def r_=(value: CUnsignedChar): Unit = !struct.at1 = value
    def g : CUnsignedChar = struct._2
    def g_=(value: CUnsignedChar): Unit = !struct.at2 = value
    def b : CUnsignedChar = struct._3
    def b_=(value: CUnsignedChar): Unit = !struct.at3 = value
    def a : CUnsignedChar = struct._4
    def a_=(value: CUnsignedChar): Unit = !struct.at4 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type FilePathList = CStruct3[CUnsignedInt, CUnsignedInt, Ptr[CString]]
object FilePathList:
  given _tag: Tag[FilePathList] = Tag.materializeCStruct3Tag[CUnsignedInt, CUnsignedInt, Ptr[CString]]
  def apply()(using Zone): Ptr[FilePathList] = scala.scalanative.unsafe.alloc[FilePathList](1)
  def apply(capacity : CUnsignedInt, count : CUnsignedInt, paths : Ptr[CString])(using Zone): Ptr[FilePathList] = 
    val ____ptr = apply()
    (!____ptr).capacity = capacity
    (!____ptr).count = count
    (!____ptr).paths = paths
    ____ptr
  extension (struct: FilePathList)
    def capacity : CUnsignedInt = struct._1
    def capacity_=(value: CUnsignedInt): Unit = !struct.at1 = value
    def count : CUnsignedInt = struct._2
    def count_=(value: CUnsignedInt): Unit = !struct.at2 = value
    def paths : Ptr[CString] = struct._3
    def paths_=(value: Ptr[CString]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Font = CStruct6[CInt, CInt, CInt, Texture2D, Ptr[Rectangle], Ptr[GlyphInfo]]
object Font:
  given _tag: Tag[Font] = Tag.materializeCStruct6Tag[CInt, CInt, CInt, Texture2D, Ptr[Rectangle], Ptr[GlyphInfo]]
  def apply()(using Zone): Ptr[Font] = scala.scalanative.unsafe.alloc[Font](1)
  def apply(baseSize : CInt, glyphCount : CInt, glyphPadding : CInt, texture : Texture2D, recs : Ptr[Rectangle], glyphs : Ptr[GlyphInfo])(using Zone): Ptr[Font] = 
    val ____ptr = apply()
    (!____ptr).baseSize = baseSize
    (!____ptr).glyphCount = glyphCount
    (!____ptr).glyphPadding = glyphPadding
    (!____ptr).texture = texture
    (!____ptr).recs = recs
    (!____ptr).glyphs = glyphs
    ____ptr
  extension (struct: Font)
    def baseSize : CInt = struct._1
    def baseSize_=(value: CInt): Unit = !struct.at1 = value
    def glyphCount : CInt = struct._2
    def glyphCount_=(value: CInt): Unit = !struct.at2 = value
    def glyphPadding : CInt = struct._3
    def glyphPadding_=(value: CInt): Unit = !struct.at3 = value
    def texture : Texture2D = struct._4
    def texture_=(value: Texture2D): Unit = !struct.at4 = value
    def recs : Ptr[Rectangle] = struct._5
    def recs_=(value: Ptr[Rectangle]): Unit = !struct.at5 = value
    def glyphs : Ptr[GlyphInfo] = struct._6
    def glyphs_=(value: Ptr[GlyphInfo]): Unit = !struct.at6 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type GlyphInfo = CStruct5[CInt, CInt, CInt, CInt, Image]
object GlyphInfo:
  given _tag: Tag[GlyphInfo] = Tag.materializeCStruct5Tag[CInt, CInt, CInt, CInt, Image]
  def apply()(using Zone): Ptr[GlyphInfo] = scala.scalanative.unsafe.alloc[GlyphInfo](1)
  def apply(value : CInt, offsetX : CInt, offsetY : CInt, advanceX : CInt, image : Image)(using Zone): Ptr[GlyphInfo] = 
    val ____ptr = apply()
    (!____ptr).value = value
    (!____ptr).offsetX = offsetX
    (!____ptr).offsetY = offsetY
    (!____ptr).advanceX = advanceX
    (!____ptr).image = image
    ____ptr
  extension (struct: GlyphInfo)
    def value : CInt = struct._1
    def value_=(value: CInt): Unit = !struct.at1 = value
    def offsetX : CInt = struct._2
    def offsetX_=(value: CInt): Unit = !struct.at2 = value
    def offsetY : CInt = struct._3
    def offsetY_=(value: CInt): Unit = !struct.at3 = value
    def advanceX : CInt = struct._4
    def advanceX_=(value: CInt): Unit = !struct.at4 = value
    def image : Image = struct._5
    def image_=(value: Image): Unit = !struct.at5 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Image = CStruct5[Ptr[Byte], CInt, CInt, CInt, CInt]
object Image:
  given _tag: Tag[Image] = Tag.materializeCStruct5Tag[Ptr[Byte], CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[Image] = scala.scalanative.unsafe.alloc[Image](1)
  def apply(data : Ptr[Byte], width : CInt, height : CInt, mipmaps : CInt, format : CInt)(using Zone): Ptr[Image] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).width = width
    (!____ptr).height = height
    (!____ptr).mipmaps = mipmaps
    (!____ptr).format = format
    ____ptr
  extension (struct: Image)
    def data : Ptr[Byte] = struct._1
    def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
    def width : CInt = struct._2
    def width_=(value: CInt): Unit = !struct.at2 = value
    def height : CInt = struct._3
    def height_=(value: CInt): Unit = !struct.at3 = value
    def mipmaps : CInt = struct._4
    def mipmaps_=(value: CInt): Unit = !struct.at4 = value
    def format : CInt = struct._5
    def format_=(value: CInt): Unit = !struct.at5 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Material = CStruct3[Shader, Ptr[MaterialMap], CArray[Float, Nat._4]]
object Material:
  given _tag: Tag[Material] = Tag.materializeCStruct3Tag[Shader, Ptr[MaterialMap], CArray[Float, Nat._4]]
  def apply()(using Zone): Ptr[Material] = scala.scalanative.unsafe.alloc[Material](1)
  def apply(shader : Shader, maps : Ptr[MaterialMap], params : CArray[Float, Nat._4])(using Zone): Ptr[Material] = 
    val ____ptr = apply()
    (!____ptr).shader = shader
    (!____ptr).maps = maps
    (!____ptr).params = params
    ____ptr
  extension (struct: Material)
    def shader : Shader = struct._1
    def shader_=(value: Shader): Unit = !struct.at1 = value
    def maps : Ptr[MaterialMap] = struct._2
    def maps_=(value: Ptr[MaterialMap]): Unit = !struct.at2 = value
    def params : CArray[Float, Nat._4] = struct._3
    def params_=(value: CArray[Float, Nat._4]): Unit = !struct.at3 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type MaterialMap = CStruct3[Texture2D, Color, Float]
object MaterialMap:
  given _tag: Tag[MaterialMap] = Tag.materializeCStruct3Tag[Texture2D, Color, Float]
  def apply()(using Zone): Ptr[MaterialMap] = scala.scalanative.unsafe.alloc[MaterialMap](1)
  def apply(texture : Texture2D, color : Color, value : Float)(using Zone): Ptr[MaterialMap] = 
    val ____ptr = apply()
    (!____ptr).texture = texture
    (!____ptr).color = color
    (!____ptr).value = value
    ____ptr
  extension (struct: MaterialMap)
    def texture : Texture2D = struct._1
    def texture_=(value: Texture2D): Unit = !struct.at1 = value
    def color : Color = struct._2
    def color_=(value: Color): Unit = !struct.at2 = value
    def value : Float = struct._3
    def value_=(value: Float): Unit = !struct.at3 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Matrix = CStruct16[Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float]
object Matrix:
  given _tag: Tag[Matrix] = Tag.materializeCStruct16Tag[Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float, Float]
  def apply()(using Zone): Ptr[Matrix] = scala.scalanative.unsafe.alloc[Matrix](1)
  def apply(m0 : Float, m4 : Float, m8 : Float, m12 : Float, m1 : Float, m5 : Float, m9 : Float, m13 : Float, m2 : Float, m6 : Float, m10 : Float, m14 : Float, m3 : Float, m7 : Float, m11 : Float, m15 : Float)(using Zone): Ptr[Matrix] = 
    val ____ptr = apply()
    (!____ptr).m0 = m0
    (!____ptr).m4 = m4
    (!____ptr).m8 = m8
    (!____ptr).m12 = m12
    (!____ptr).m1 = m1
    (!____ptr).m5 = m5
    (!____ptr).m9 = m9
    (!____ptr).m13 = m13
    (!____ptr).m2 = m2
    (!____ptr).m6 = m6
    (!____ptr).m10 = m10
    (!____ptr).m14 = m14
    (!____ptr).m3 = m3
    (!____ptr).m7 = m7
    (!____ptr).m11 = m11
    (!____ptr).m15 = m15
    ____ptr
  extension (struct: Matrix)
    def m0 : Float = struct._1
    def m0_=(value: Float): Unit = !struct.at1 = value
    def m4 : Float = struct._2
    def m4_=(value: Float): Unit = !struct.at2 = value
    def m8 : Float = struct._3
    def m8_=(value: Float): Unit = !struct.at3 = value
    def m12 : Float = struct._4
    def m12_=(value: Float): Unit = !struct.at4 = value
    def m1 : Float = struct._5
    def m1_=(value: Float): Unit = !struct.at5 = value
    def m5 : Float = struct._6
    def m5_=(value: Float): Unit = !struct.at6 = value
    def m9 : Float = struct._7
    def m9_=(value: Float): Unit = !struct.at7 = value
    def m13 : Float = struct._8
    def m13_=(value: Float): Unit = !struct.at8 = value
    def m2 : Float = struct._9
    def m2_=(value: Float): Unit = !struct.at9 = value
    def m6 : Float = struct._10
    def m6_=(value: Float): Unit = !struct.at10 = value
    def m10 : Float = struct._11
    def m10_=(value: Float): Unit = !struct.at11 = value
    def m14 : Float = struct._12
    def m14_=(value: Float): Unit = !struct.at12 = value
    def m3 : Float = struct._13
    def m3_=(value: Float): Unit = !struct.at13 = value
    def m7 : Float = struct._14
    def m7_=(value: Float): Unit = !struct.at14 = value
    def m11 : Float = struct._15
    def m11_=(value: Float): Unit = !struct.at15 = value
    def m15 : Float = struct._16
    def m15_=(value: Float): Unit = !struct.at16 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Mesh = CStruct17[CInt, CInt, Ptr[Float], Ptr[Float], Ptr[Float], Ptr[Float], Ptr[Float], Ptr[CUnsignedChar], Ptr[CUnsignedShort], Ptr[Float], Ptr[Float], Ptr[CUnsignedChar], Ptr[Float], Ptr[Matrix], CInt, CUnsignedInt, Ptr[CUnsignedInt]]
object Mesh:
  given _tag: Tag[Mesh] = Tag.materializeCStruct17Tag[CInt, CInt, Ptr[Float], Ptr[Float], Ptr[Float], Ptr[Float], Ptr[Float], Ptr[CUnsignedChar], Ptr[CUnsignedShort], Ptr[Float], Ptr[Float], Ptr[CUnsignedChar], Ptr[Float], Ptr[Matrix], CInt, CUnsignedInt, Ptr[CUnsignedInt]]
  def apply()(using Zone): Ptr[Mesh] = scala.scalanative.unsafe.alloc[Mesh](1)
  def apply(vertexCount : CInt, triangleCount : CInt, vertices : Ptr[Float], texcoords : Ptr[Float], texcoords2 : Ptr[Float], normals : Ptr[Float], tangents : Ptr[Float], colors : Ptr[CUnsignedChar], indices : Ptr[CUnsignedShort], animVertices : Ptr[Float], animNormals : Ptr[Float], boneIds : Ptr[CUnsignedChar], boneWeights : Ptr[Float], boneMatrices : Ptr[Matrix], boneCount : CInt, vaoId : CUnsignedInt, vboId : Ptr[CUnsignedInt])(using Zone): Ptr[Mesh] = 
    val ____ptr = apply()
    (!____ptr).vertexCount = vertexCount
    (!____ptr).triangleCount = triangleCount
    (!____ptr).vertices = vertices
    (!____ptr).texcoords = texcoords
    (!____ptr).texcoords2 = texcoords2
    (!____ptr).normals = normals
    (!____ptr).tangents = tangents
    (!____ptr).colors = colors
    (!____ptr).indices = indices
    (!____ptr).animVertices = animVertices
    (!____ptr).animNormals = animNormals
    (!____ptr).boneIds = boneIds
    (!____ptr).boneWeights = boneWeights
    (!____ptr).boneMatrices = boneMatrices
    (!____ptr).boneCount = boneCount
    (!____ptr).vaoId = vaoId
    (!____ptr).vboId = vboId
    ____ptr
  extension (struct: Mesh)
    def vertexCount : CInt = struct._1
    def vertexCount_=(value: CInt): Unit = !struct.at1 = value
    def triangleCount : CInt = struct._2
    def triangleCount_=(value: CInt): Unit = !struct.at2 = value
    def vertices : Ptr[Float] = struct._3
    def vertices_=(value: Ptr[Float]): Unit = !struct.at3 = value
    def texcoords : Ptr[Float] = struct._4
    def texcoords_=(value: Ptr[Float]): Unit = !struct.at4 = value
    def texcoords2 : Ptr[Float] = struct._5
    def texcoords2_=(value: Ptr[Float]): Unit = !struct.at5 = value
    def normals : Ptr[Float] = struct._6
    def normals_=(value: Ptr[Float]): Unit = !struct.at6 = value
    def tangents : Ptr[Float] = struct._7
    def tangents_=(value: Ptr[Float]): Unit = !struct.at7 = value
    def colors : Ptr[CUnsignedChar] = struct._8
    def colors_=(value: Ptr[CUnsignedChar]): Unit = !struct.at8 = value
    def indices : Ptr[CUnsignedShort] = struct._9
    def indices_=(value: Ptr[CUnsignedShort]): Unit = !struct.at9 = value
    def animVertices : Ptr[Float] = struct._10
    def animVertices_=(value: Ptr[Float]): Unit = !struct.at10 = value
    def animNormals : Ptr[Float] = struct._11
    def animNormals_=(value: Ptr[Float]): Unit = !struct.at11 = value
    def boneIds : Ptr[CUnsignedChar] = struct._12
    def boneIds_=(value: Ptr[CUnsignedChar]): Unit = !struct.at12 = value
    def boneWeights : Ptr[Float] = struct._13
    def boneWeights_=(value: Ptr[Float]): Unit = !struct.at13 = value
    def boneMatrices : Ptr[Matrix] = struct._14
    def boneMatrices_=(value: Ptr[Matrix]): Unit = !struct.at14 = value
    def boneCount : CInt = struct._15
    def boneCount_=(value: CInt): Unit = !struct.at15 = value
    def vaoId : CUnsignedInt = struct._16
    def vaoId_=(value: CUnsignedInt): Unit = !struct.at16 = value
    def vboId : Ptr[CUnsignedInt] = struct._17
    def vboId_=(value: Ptr[CUnsignedInt]): Unit = !struct.at17 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Model = CStruct9[Matrix, CInt, CInt, Ptr[Mesh], Ptr[Material], Ptr[CInt], CInt, Ptr[BoneInfo], Ptr[Transform]]
object Model:
  given _tag: Tag[Model] = Tag.materializeCStruct9Tag[Matrix, CInt, CInt, Ptr[Mesh], Ptr[Material], Ptr[CInt], CInt, Ptr[BoneInfo], Ptr[Transform]]
  def apply()(using Zone): Ptr[Model] = scala.scalanative.unsafe.alloc[Model](1)
  def apply(transform : Matrix, meshCount : CInt, materialCount : CInt, meshes : Ptr[Mesh], materials : Ptr[Material], meshMaterial : Ptr[CInt], boneCount : CInt, bones : Ptr[BoneInfo], bindPose : Ptr[Transform])(using Zone): Ptr[Model] = 
    val ____ptr = apply()
    (!____ptr).transform = transform
    (!____ptr).meshCount = meshCount
    (!____ptr).materialCount = materialCount
    (!____ptr).meshes = meshes
    (!____ptr).materials = materials
    (!____ptr).meshMaterial = meshMaterial
    (!____ptr).boneCount = boneCount
    (!____ptr).bones = bones
    (!____ptr).bindPose = bindPose
    ____ptr
  extension (struct: Model)
    def transform : Matrix = struct._1
    def transform_=(value: Matrix): Unit = !struct.at1 = value
    def meshCount : CInt = struct._2
    def meshCount_=(value: CInt): Unit = !struct.at2 = value
    def materialCount : CInt = struct._3
    def materialCount_=(value: CInt): Unit = !struct.at3 = value
    def meshes : Ptr[Mesh] = struct._4
    def meshes_=(value: Ptr[Mesh]): Unit = !struct.at4 = value
    def materials : Ptr[Material] = struct._5
    def materials_=(value: Ptr[Material]): Unit = !struct.at5 = value
    def meshMaterial : Ptr[CInt] = struct._6
    def meshMaterial_=(value: Ptr[CInt]): Unit = !struct.at6 = value
    def boneCount : CInt = struct._7
    def boneCount_=(value: CInt): Unit = !struct.at7 = value
    def bones : Ptr[BoneInfo] = struct._8
    def bones_=(value: Ptr[BoneInfo]): Unit = !struct.at8 = value
    def bindPose : Ptr[Transform] = struct._9
    def bindPose_=(value: Ptr[Transform]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type ModelAnimation = CStruct5[CInt, CInt, Ptr[BoneInfo], Ptr[Ptr[Transform]], CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]]
object ModelAnimation:
  given _tag: Tag[ModelAnimation] = Tag.materializeCStruct5Tag[CInt, CInt, Ptr[BoneInfo], Ptr[Ptr[Transform]], CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]]
  def apply()(using Zone): Ptr[ModelAnimation] = scala.scalanative.unsafe.alloc[ModelAnimation](1)
  def apply(boneCount : CInt, frameCount : CInt, bones : Ptr[BoneInfo], framePoses : Ptr[Ptr[Transform]], name : CArray[CChar, Nat.Digit2[Nat._3, Nat._2]])(using Zone): Ptr[ModelAnimation] = 
    val ____ptr = apply()
    (!____ptr).boneCount = boneCount
    (!____ptr).frameCount = frameCount
    (!____ptr).bones = bones
    (!____ptr).framePoses = framePoses
    (!____ptr).name = name
    ____ptr
  extension (struct: ModelAnimation)
    def boneCount : CInt = struct._1
    def boneCount_=(value: CInt): Unit = !struct.at1 = value
    def frameCount : CInt = struct._2
    def frameCount_=(value: CInt): Unit = !struct.at2 = value
    def bones : Ptr[BoneInfo] = struct._3
    def bones_=(value: Ptr[BoneInfo]): Unit = !struct.at3 = value
    def framePoses : Ptr[Ptr[Transform]] = struct._4
    def framePoses_=(value: Ptr[Ptr[Transform]]): Unit = !struct.at4 = value
    def name : CArray[CChar, Nat.Digit2[Nat._3, Nat._2]] = struct._5
    def name_=(value: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Music = CStruct5[AudioStream, CUnsignedInt, Boolean, CInt, Ptr[Byte]]
object Music:
  given _tag: Tag[Music] = Tag.materializeCStruct5Tag[AudioStream, CUnsignedInt, Boolean, CInt, Ptr[Byte]]
  def apply()(using Zone): Ptr[Music] = scala.scalanative.unsafe.alloc[Music](1)
  def apply(stream : AudioStream, frameCount : CUnsignedInt, looping : Boolean, ctxType : CInt, ctxData : Ptr[Byte])(using Zone): Ptr[Music] = 
    val ____ptr = apply()
    (!____ptr).stream = stream
    (!____ptr).frameCount = frameCount
    (!____ptr).looping = looping
    (!____ptr).ctxType = ctxType
    (!____ptr).ctxData = ctxData
    ____ptr
  extension (struct: Music)
    def stream : AudioStream = struct._1
    def stream_=(value: AudioStream): Unit = !struct.at1 = value
    def frameCount : CUnsignedInt = struct._2
    def frameCount_=(value: CUnsignedInt): Unit = !struct.at2 = value
    def looping : Boolean = struct._3
    def looping_=(value: Boolean): Unit = !struct.at3 = value
    def ctxType : CInt = struct._4
    def ctxType_=(value: CInt): Unit = !struct.at4 = value
    def ctxData : Ptr[Byte] = struct._5
    def ctxData_=(value: Ptr[Byte]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type NPatchInfo = CStruct6[Rectangle, CInt, CInt, CInt, CInt, CInt]
object NPatchInfo:
  given _tag: Tag[NPatchInfo] = Tag.materializeCStruct6Tag[Rectangle, CInt, CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[NPatchInfo] = scala.scalanative.unsafe.alloc[NPatchInfo](1)
  def apply(source : Rectangle, left : CInt, top : CInt, right : CInt, bottom : CInt, layout : CInt)(using Zone): Ptr[NPatchInfo] = 
    val ____ptr = apply()
    (!____ptr).source = source
    (!____ptr).left = left
    (!____ptr).top = top
    (!____ptr).right = right
    (!____ptr).bottom = bottom
    (!____ptr).layout = layout
    ____ptr
  extension (struct: NPatchInfo)
    def source : Rectangle = struct._1
    def source_=(value: Rectangle): Unit = !struct.at1 = value
    def left : CInt = struct._2
    def left_=(value: CInt): Unit = !struct.at2 = value
    def top : CInt = struct._3
    def top_=(value: CInt): Unit = !struct.at3 = value
    def right : CInt = struct._4
    def right_=(value: CInt): Unit = !struct.at4 = value
    def bottom : CInt = struct._5
    def bottom_=(value: CInt): Unit = !struct.at5 = value
    def layout : CInt = struct._6
    def layout_=(value: CInt): Unit = !struct.at6 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Ray = CStruct2[Vector3, Vector3]
object Ray:
  given _tag: Tag[Ray] = Tag.materializeCStruct2Tag[Vector3, Vector3]
  def apply()(using Zone): Ptr[Ray] = scala.scalanative.unsafe.alloc[Ray](1)
  def apply(position : Vector3, direction : Vector3)(using Zone): Ptr[Ray] = 
    val ____ptr = apply()
    (!____ptr).position = position
    (!____ptr).direction = direction
    ____ptr
  extension (struct: Ray)
    def position : Vector3 = struct._1
    def position_=(value: Vector3): Unit = !struct.at1 = value
    def direction : Vector3 = struct._2
    def direction_=(value: Vector3): Unit = !struct.at2 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type RayCollision = CStruct4[Boolean, Float, Vector3, Vector3]
object RayCollision:
  given _tag: Tag[RayCollision] = Tag.materializeCStruct4Tag[Boolean, Float, Vector3, Vector3]
  def apply()(using Zone): Ptr[RayCollision] = scala.scalanative.unsafe.alloc[RayCollision](1)
  def apply(hit : Boolean, distance : Float, point : Vector3, normal : Vector3)(using Zone): Ptr[RayCollision] = 
    val ____ptr = apply()
    (!____ptr).hit = hit
    (!____ptr).distance = distance
    (!____ptr).point = point
    (!____ptr).normal = normal
    ____ptr
  extension (struct: RayCollision)
    def hit : Boolean = struct._1
    def hit_=(value: Boolean): Unit = !struct.at1 = value
    def distance : Float = struct._2
    def distance_=(value: Float): Unit = !struct.at2 = value
    def point : Vector3 = struct._3
    def point_=(value: Vector3): Unit = !struct.at3 = value
    def normal : Vector3 = struct._4
    def normal_=(value: Vector3): Unit = !struct.at4 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Rectangle = CStruct4[Float, Float, Float, Float]
object Rectangle:
  given _tag: Tag[Rectangle] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  def apply()(using Zone): Ptr[Rectangle] = scala.scalanative.unsafe.alloc[Rectangle](1)
  def apply(x : Float, y : Float, width : Float, height : Float)(using Zone): Ptr[Rectangle] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr
  extension (struct: Rectangle)
    def x : Float = struct._1
    def x_=(value: Float): Unit = !struct.at1 = value
    def y : Float = struct._2
    def y_=(value: Float): Unit = !struct.at2 = value
    def width : Float = struct._3
    def width_=(value: Float): Unit = !struct.at3 = value
    def height : Float = struct._4
    def height_=(value: Float): Unit = !struct.at4 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type RenderTexture = CStruct3[CUnsignedInt, Texture, Texture]
object RenderTexture:
  given _tag: Tag[RenderTexture] = Tag.materializeCStruct3Tag[CUnsignedInt, Texture, Texture]
  def apply()(using Zone): Ptr[RenderTexture] = scala.scalanative.unsafe.alloc[RenderTexture](1)
  def apply(id : CUnsignedInt, texture : Texture, depth : Texture)(using Zone): Ptr[RenderTexture] = 
    val ____ptr = apply()
    (!____ptr).id = id
    (!____ptr).texture = texture
    (!____ptr).depth = depth
    ____ptr
  extension (struct: RenderTexture)
    def id : CUnsignedInt = struct._1
    def id_=(value: CUnsignedInt): Unit = !struct.at1 = value
    def texture : Texture = struct._2
    def texture_=(value: Texture): Unit = !struct.at2 = value
    def depth : Texture = struct._3
    def depth_=(value: Texture): Unit = !struct.at3 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Shader = CStruct2[CUnsignedInt, Ptr[CInt]]
object Shader:
  given _tag: Tag[Shader] = Tag.materializeCStruct2Tag[CUnsignedInt, Ptr[CInt]]
  def apply()(using Zone): Ptr[Shader] = scala.scalanative.unsafe.alloc[Shader](1)
  def apply(id : CUnsignedInt, locs : Ptr[CInt])(using Zone): Ptr[Shader] = 
    val ____ptr = apply()
    (!____ptr).id = id
    (!____ptr).locs = locs
    ____ptr
  extension (struct: Shader)
    def id : CUnsignedInt = struct._1
    def id_=(value: CUnsignedInt): Unit = !struct.at1 = value
    def locs : Ptr[CInt] = struct._2
    def locs_=(value: Ptr[CInt]): Unit = !struct.at2 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Sound = CStruct2[AudioStream, CUnsignedInt]
object Sound:
  given _tag: Tag[Sound] = Tag.materializeCStruct2Tag[AudioStream, CUnsignedInt]
  def apply()(using Zone): Ptr[Sound] = scala.scalanative.unsafe.alloc[Sound](1)
  def apply(stream : AudioStream, frameCount : CUnsignedInt)(using Zone): Ptr[Sound] = 
    val ____ptr = apply()
    (!____ptr).stream = stream
    (!____ptr).frameCount = frameCount
    ____ptr
  extension (struct: Sound)
    def stream : AudioStream = struct._1
    def stream_=(value: AudioStream): Unit = !struct.at1 = value
    def frameCount : CUnsignedInt = struct._2
    def frameCount_=(value: CUnsignedInt): Unit = !struct.at2 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Texture = CStruct5[CUnsignedInt, CInt, CInt, CInt, CInt]
object Texture:
  given _tag: Tag[Texture] = Tag.materializeCStruct5Tag[CUnsignedInt, CInt, CInt, CInt, CInt]
  def apply()(using Zone): Ptr[Texture] = scala.scalanative.unsafe.alloc[Texture](1)
  def apply(id : CUnsignedInt, width : CInt, height : CInt, mipmaps : CInt, format : CInt)(using Zone): Ptr[Texture] = 
    val ____ptr = apply()
    (!____ptr).id = id
    (!____ptr).width = width
    (!____ptr).height = height
    (!____ptr).mipmaps = mipmaps
    (!____ptr).format = format
    ____ptr
  extension (struct: Texture)
    def id : CUnsignedInt = struct._1
    def id_=(value: CUnsignedInt): Unit = !struct.at1 = value
    def width : CInt = struct._2
    def width_=(value: CInt): Unit = !struct.at2 = value
    def height : CInt = struct._3
    def height_=(value: CInt): Unit = !struct.at3 = value
    def mipmaps : CInt = struct._4
    def mipmaps_=(value: CInt): Unit = !struct.at4 = value
    def format : CInt = struct._5
    def format_=(value: CInt): Unit = !struct.at5 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Transform = CStruct3[Vector3, Quaternion, Vector3]
object Transform:
  given _tag: Tag[Transform] = Tag.materializeCStruct3Tag[Vector3, Quaternion, Vector3]
  def apply()(using Zone): Ptr[Transform] = scala.scalanative.unsafe.alloc[Transform](1)
  def apply(translation : Vector3, rotation : Quaternion, scale : Vector3)(using Zone): Ptr[Transform] = 
    val ____ptr = apply()
    (!____ptr).translation = translation
    (!____ptr).rotation = rotation
    (!____ptr).scale = scale
    ____ptr
  extension (struct: Transform)
    def translation : Vector3 = struct._1
    def translation_=(value: Vector3): Unit = !struct.at1 = value
    def rotation : Quaternion = struct._2
    def rotation_=(value: Quaternion): Unit = !struct.at2 = value
    def scale : Vector3 = struct._3
    def scale_=(value: Vector3): Unit = !struct.at3 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Vector2 = CStruct2[Float, Float]
object Vector2:
  given _tag: Tag[Vector2] = Tag.materializeCStruct2Tag[Float, Float]
  def apply()(using Zone): Ptr[Vector2] = scala.scalanative.unsafe.alloc[Vector2](1)
  def apply(x : Float, y : Float)(using Zone): Ptr[Vector2] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    ____ptr
  extension (struct: Vector2)
    def x : Float = struct._1
    def x_=(value: Float): Unit = !struct.at1 = value
    def y : Float = struct._2
    def y_=(value: Float): Unit = !struct.at2 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Vector3 = CStruct3[Float, Float, Float]
object Vector3:
  given _tag: Tag[Vector3] = Tag.materializeCStruct3Tag[Float, Float, Float]
  def apply()(using Zone): Ptr[Vector3] = scala.scalanative.unsafe.alloc[Vector3](1)
  def apply(x : Float, y : Float, z : Float)(using Zone): Ptr[Vector3] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).z = z
    ____ptr
  extension (struct: Vector3)
    def x : Float = struct._1
    def x_=(value: Float): Unit = !struct.at1 = value
    def y : Float = struct._2
    def y_=(value: Float): Unit = !struct.at2 = value
    def z : Float = struct._3
    def z_=(value: Float): Unit = !struct.at3 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Vector4 = CStruct4[Float, Float, Float, Float]
object Vector4:
  given _tag: Tag[Vector4] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  def apply()(using Zone): Ptr[Vector4] = scala.scalanative.unsafe.alloc[Vector4](1)
  def apply(x : Float, y : Float, z : Float, w : Float)(using Zone): Ptr[Vector4] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).z = z
    (!____ptr).w = w
    ____ptr
  extension (struct: Vector4)
    def x : Float = struct._1
    def x_=(value: Float): Unit = !struct.at1 = value
    def y : Float = struct._2
    def y_=(value: Float): Unit = !struct.at2 = value
    def z : Float = struct._3
    def z_=(value: Float): Unit = !struct.at3 = value
    def w : Float = struct._4
    def w_=(value: Float): Unit = !struct.at4 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type VrDeviceInfo = CStruct9[CInt, CInt, Float, Float, Float, Float, Float, CArray[Float, Nat._4], CArray[Float, Nat._4]]
object VrDeviceInfo:
  given _tag: Tag[VrDeviceInfo] = Tag.materializeCStruct9Tag[CInt, CInt, Float, Float, Float, Float, Float, CArray[Float, Nat._4], CArray[Float, Nat._4]]
  def apply()(using Zone): Ptr[VrDeviceInfo] = scala.scalanative.unsafe.alloc[VrDeviceInfo](1)
  def apply(hResolution : CInt, vResolution : CInt, hScreenSize : Float, vScreenSize : Float, eyeToScreenDistance : Float, lensSeparationDistance : Float, interpupillaryDistance : Float, lensDistortionValues : CArray[Float, Nat._4], chromaAbCorrection : CArray[Float, Nat._4])(using Zone): Ptr[VrDeviceInfo] = 
    val ____ptr = apply()
    (!____ptr).hResolution = hResolution
    (!____ptr).vResolution = vResolution
    (!____ptr).hScreenSize = hScreenSize
    (!____ptr).vScreenSize = vScreenSize
    (!____ptr).eyeToScreenDistance = eyeToScreenDistance
    (!____ptr).lensSeparationDistance = lensSeparationDistance
    (!____ptr).interpupillaryDistance = interpupillaryDistance
    (!____ptr).lensDistortionValues = lensDistortionValues
    (!____ptr).chromaAbCorrection = chromaAbCorrection
    ____ptr
  extension (struct: VrDeviceInfo)
    def hResolution : CInt = struct._1
    def hResolution_=(value: CInt): Unit = !struct.at1 = value
    def vResolution : CInt = struct._2
    def vResolution_=(value: CInt): Unit = !struct.at2 = value
    def hScreenSize : Float = struct._3
    def hScreenSize_=(value: Float): Unit = !struct.at3 = value
    def vScreenSize : Float = struct._4
    def vScreenSize_=(value: Float): Unit = !struct.at4 = value
    def eyeToScreenDistance : Float = struct._5
    def eyeToScreenDistance_=(value: Float): Unit = !struct.at5 = value
    def lensSeparationDistance : Float = struct._6
    def lensSeparationDistance_=(value: Float): Unit = !struct.at6 = value
    def interpupillaryDistance : Float = struct._7
    def interpupillaryDistance_=(value: Float): Unit = !struct.at7 = value
    def lensDistortionValues : CArray[Float, Nat._4] = struct._8
    def lensDistortionValues_=(value: CArray[Float, Nat._4]): Unit = !struct.at8 = value
    def chromaAbCorrection : CArray[Float, Nat._4] = struct._9
    def chromaAbCorrection_=(value: CArray[Float, Nat._4]): Unit = !struct.at9 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type VrStereoConfig = CStruct8[CArray[Matrix, Nat._2], CArray[Matrix, Nat._2], CArray[Float, Nat._2], CArray[Float, Nat._2], CArray[Float, Nat._2], CArray[Float, Nat._2], CArray[Float, Nat._2], CArray[Float, Nat._2]]
object VrStereoConfig:
  given _tag: Tag[VrStereoConfig] = Tag.materializeCStruct8Tag[CArray[Matrix, Nat._2], CArray[Matrix, Nat._2], CArray[Float, Nat._2], CArray[Float, Nat._2], CArray[Float, Nat._2], CArray[Float, Nat._2], CArray[Float, Nat._2], CArray[Float, Nat._2]]
  def apply()(using Zone): Ptr[VrStereoConfig] = scala.scalanative.unsafe.alloc[VrStereoConfig](1)
  def apply(projection : CArray[Matrix, Nat._2], viewOffset : CArray[Matrix, Nat._2], leftLensCenter : CArray[Float, Nat._2], rightLensCenter : CArray[Float, Nat._2], leftScreenCenter : CArray[Float, Nat._2], rightScreenCenter : CArray[Float, Nat._2], scale : CArray[Float, Nat._2], scaleIn : CArray[Float, Nat._2])(using Zone): Ptr[VrStereoConfig] = 
    val ____ptr = apply()
    (!____ptr).projection = projection
    (!____ptr).viewOffset = viewOffset
    (!____ptr).leftLensCenter = leftLensCenter
    (!____ptr).rightLensCenter = rightLensCenter
    (!____ptr).leftScreenCenter = leftScreenCenter
    (!____ptr).rightScreenCenter = rightScreenCenter
    (!____ptr).scale = scale
    (!____ptr).scaleIn = scaleIn
    ____ptr
  extension (struct: VrStereoConfig)
    def projection : CArray[Matrix, Nat._2] = struct._1
    def projection_=(value: CArray[Matrix, Nat._2]): Unit = !struct.at1 = value
    def viewOffset : CArray[Matrix, Nat._2] = struct._2
    def viewOffset_=(value: CArray[Matrix, Nat._2]): Unit = !struct.at2 = value
    def leftLensCenter : CArray[Float, Nat._2] = struct._3
    def leftLensCenter_=(value: CArray[Float, Nat._2]): Unit = !struct.at3 = value
    def rightLensCenter : CArray[Float, Nat._2] = struct._4
    def rightLensCenter_=(value: CArray[Float, Nat._2]): Unit = !struct.at4 = value
    def leftScreenCenter : CArray[Float, Nat._2] = struct._5
    def leftScreenCenter_=(value: CArray[Float, Nat._2]): Unit = !struct.at5 = value
    def rightScreenCenter : CArray[Float, Nat._2] = struct._6
    def rightScreenCenter_=(value: CArray[Float, Nat._2]): Unit = !struct.at6 = value
    def scale : CArray[Float, Nat._2] = struct._7
    def scale_=(value: CArray[Float, Nat._2]): Unit = !struct.at7 = value
    def scaleIn : CArray[Float, Nat._2] = struct._8
    def scaleIn_=(value: CArray[Float, Nat._2]): Unit = !struct.at8 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type Wave = CStruct5[CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, Ptr[Byte]]
object Wave:
  given _tag: Tag[Wave] = Tag.materializeCStruct5Tag[CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, Ptr[Byte]]
  def apply()(using Zone): Ptr[Wave] = scala.scalanative.unsafe.alloc[Wave](1)
  def apply(frameCount : CUnsignedInt, sampleRate : CUnsignedInt, sampleSize : CUnsignedInt, channels : CUnsignedInt, data : Ptr[Byte])(using Zone): Ptr[Wave] = 
    val ____ptr = apply()
    (!____ptr).frameCount = frameCount
    (!____ptr).sampleRate = sampleRate
    (!____ptr).sampleSize = sampleSize
    (!____ptr).channels = channels
    (!____ptr).data = data
    ____ptr
  extension (struct: Wave)
    def frameCount : CUnsignedInt = struct._1
    def frameCount_=(value: CUnsignedInt): Unit = !struct.at1 = value
    def sampleRate : CUnsignedInt = struct._2
    def sampleRate_=(value: CUnsignedInt): Unit = !struct.at2 = value
    def sampleSize : CUnsignedInt = struct._3
    def sampleSize_=(value: CUnsignedInt): Unit = !struct.at3 = value
    def channels : CUnsignedInt = struct._4
    def channels_=(value: CUnsignedInt): Unit = !struct.at4 = value
    def data : Ptr[Byte] = struct._5
    def data_=(value: Ptr[Byte]): Unit = !struct.at5 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raymath.h
*/
opaque type float16 = CStruct1[CArray[Float, Nat.Digit2[Nat._1, Nat._6]]]
object float16:
  given _tag: Tag[float16] = Tag.materializeCStruct1Tag[CArray[Float, Nat.Digit2[Nat._1, Nat._6]]]
  def apply()(using Zone): Ptr[float16] = scala.scalanative.unsafe.alloc[float16](1)
  def apply(v : CArray[Float, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[float16] = 
    val ____ptr = apply()
    (!____ptr).v = v
    ____ptr
  extension (struct: float16)
    def v : CArray[Float, Nat.Digit2[Nat._1, Nat._6]] = struct._1
    def v_=(value: CArray[Float, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at1 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raymath.h
*/
opaque type float3 = CStruct1[CArray[Float, Nat._3]]
object float3:
  given _tag: Tag[float3] = Tag.materializeCStruct1Tag[CArray[Float, Nat._3]]
  def apply()(using Zone): Ptr[float3] = scala.scalanative.unsafe.alloc[float3](1)
  def apply(v : CArray[Float, Nat._3])(using Zone): Ptr[float3] = 
    val ____ptr = apply()
    (!____ptr).v = v
    ____ptr
  extension (struct: float3)
    def v : CArray[Float, Nat._3] = struct._1
    def v_=(value: CArray[Float, Nat._3]): Unit = !struct.at1 = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type rAudioBuffer = CStruct0
object rAudioBuffer:
  given _tag: Tag[rAudioBuffer] = Tag.materializeCStruct0Tag

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/indoorvivants/little-fingers/raylib/src/raylib.h
*/
opaque type rAudioProcessor = CStruct0
object rAudioProcessor:
  given _tag: Tag[rAudioProcessor] = Tag.materializeCStruct0Tag