#!/usr/bin/env -S scala-cli shebang
//> using scala 3.6.3
//> using dep io.get-coursier:coursier-cli_2.13:2.1.8
//> using dep com.indoorvivants.detective::platform::0.1.0
//> using dep com.lihaoyi::os-lib:0.11.0
//> using option -Wunused:all

import com.indoorvivants.detective.Platform

args.headOption match
  case None =>
    sys.error("You need to provide a build command, one of: [app]")

  case Some("app-debug") =>
    appCommand(platform = false, release = false)

  case Some("app-platform-debug") =>
    appCommand(platform = true, release = false)

  case Some("app-release") =>
    appCommand(platform = false, release = true)

  case Some("app-platform-release") =>
    appCommand(platform = true, release = true)

  case Some("bindings") =>
    bindingsCommand()

  case Some(other) =>
    sys.error(s"Unknown command: [$other]")
end match

def appCommand(platform: Boolean, release: Boolean) =
  val binName =
    if platform then
      val platformExt =
        ArtifactNames.coursierString(Platform.target) + ArtifactNames.ext(
          Platform.os
        )

      "little-fingers-" + platformExt
    else "little-fingers"

  coursier.cli.Coursier.main(
    buildArgs(binName, if release then "release-fast" else "debug").toArray
  )
end appCommand

def bindingsCommand() =

  val scalaBindings =
    List(
      "sn-bindgen",
      "--package",
      "raylib",
      "--header",
      "raylib-bindings/raylib-amalgam.h",
      "--scala",
      "--multi-file",
      "--out",
      s"${os.pwd / "raylib-bindings"}",
      "--flavour",
      "scala-native05",
      "--",
      s"-I${os.pwd}"
    )

  val cBindings =
    List(
      "sn-bindgen",
      "--package",
      "raylib",
      "--header",
      "raylib-bindings/raylib-amalgam.h",
      "--c",
      "--out",
      s"${os.pwd / "resources/scala-native/raylib.c"}",
      "--c-import",
      "raylib.h",
      "--c-import",
      "raymath.h",
      "--flavour",
      "scala-native05",
      "--",
      s"-I${os.pwd}"
    )

  os.proc(scalaBindings).call()
  os.proc(cBindings).call()
end bindingsCommand

def buildArgs(name: String, mode: String) =
  List(
    "launch",
    "com.indoorvivants.vcpkg:sn-vcpkg_3:0.0.21",
    "--",
    "scala-cli",
    "raylib",
    sys.env.get("VERBOSE").map(_ => "-v"),
    "--",
    "package",
    "src",
    "raylib-bindings",
    "resources",
    "--native-mode",
    mode,
    "-f",
    "-o",
    name
  ).flatMap:
    case s: String             => Some(s)
    case other: Option[String] => other

object ArtifactNames:
  def jarString(os: Platform.OS): String =
    import Platform.OS.*
    os match
      case Windows => "windows"
      case MacOS   => "osx"
      case Linux   => "linux"
      case Unknown => "unknown"

  def jarString(bits: Platform.Bits, arch: Platform.Arch): String =
    import Platform.{Bits, Arch}
    (bits, arch) match
      case (Bits.x64, Arch.Intel) => "x86_64"
      case (Bits.x64, Arch.Arm)   => "aarch64"
      case (Bits.x32, Arch.Intel) => "x86_32"
      case (Bits.x32, Arch.Arm)   => "aarch32"

  def jarString(target: Platform.Target): String =
    jarString(target.bits, target.arch) + "-" + jarString(target.os)

  def ext(os: Platform.OS): String =
    os match
      case Platform.OS.Windows => ".exe"
      case _                   => ""

  def coursierString(os: Platform.OS): String =
    import Platform.OS.*
    os match
      case Windows => "pc-win32"
      case MacOS   => "apple-darwin"
      case Linux   => "pc-linux"
      case Unknown => "unknown"

  def coursierString(target: Platform.Target): String =
    jarString(target.bits, target.arch) + "-" + coursierString(target.os)
end ArtifactNames
