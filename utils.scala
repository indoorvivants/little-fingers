import scalanative.unsafe.*
import scalanative.unsigned.*

opaque type UnsignedMadness = Boolean
object UnsignedMadness:
  inline def apply[A](inline f: UnsignedMadness ?=> A): A =
    f(using true)

given a(using UnsignedMadness): Conversion[Byte, CUnsignedChar] with
  def apply(x: Byte): CUnsignedChar = x.toInt.toUByte

def zone[A](f: Zone ?=> A): A =
  Zone(z => f(using z))

