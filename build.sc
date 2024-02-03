#!/usr/bin/env -S scala-cli shebang 
//> using scala 3.3.1
//> using dep io.get-coursier:coursier-cli_2.13:2.1.8
//> using dep com.indoorvivants.detective::platform::0.0.2
//> using option -Wunused:all

import com.indoorvivants.detective.Platform, Platform.*

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
    buildArgs(binName, if release then "release-fast" else "debug")
  )
end appCommand

def buildArgs(name: String, mode: String) =
  s"launch com.indoorvivants.vcpkg:sn-vcpkg_3:0.0.19 -- scala-cli raylib -- package src raylib-bindings resources --native-mode $mode -f -o $name"
    .split(" ")

object ArtifactNames:
  def jarString(os: Platform.OS): String =
    import Platform.OS.*
    os match
      case Windows => "windows"
      case MacOS   => "osx"
      case Linux   => "linux"
      case Unknown => "unknown"

  def jarString(bits: Platform.Bits, arch: Platform.Arch): String =
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
