# Little Fingers

A simple Scala 3 Native application that uses Raylib to render a window where letters are animated when pressed.
The purpose of this "game" is to distract my toddler who is adamant he needs to smash random keys. I also learned quite a lot making it.

![CleanShot 2024-02-01 at 22 31 59](https://github.com/indoorvivants/little-fingers/assets/1052965/01ccc0ac-e823-4e49-a3a9-9dc54708b9f9)


## Getting started

To run this, you will need to install [Scala CLI](https://scala-cli.virtuslab.org/).
This project is only tested on Mac OS and Linux. 
Instructions and adjustment for Windows are welcome, as long as they're 
accompanied by a Github Actions workflow.

The project contains a build script that goes like this (all of this should be transparent to you and will be bootstrap from just having scala-cli):

1. Invoke Scala CLI which
2. invokes [coursier][coursier] CLI which 
3. invokes [sn-vcpkg][sn-vcpkg] CLI which 
4. installs dependencies by invoking [vcpkg][vcpkg] CLI and then 
5. invokes scala-cli with correct compilation and linking flags which 
6. produces the binary

Absolutely scrumptious madness.

Run:

```
./build.sc app-debug
./build.sc app-release
```

to build a `little-fingers` binary in debug or release configuration


## Regenerating bindings

To do this, first obtain and setup the bindgen CLI: https://sn-bindgen.indoorvivants.com/quickstart/index.html

```bash 
sn-bindgen --package raylib --header raylib-bindings/raylib-amalgam.h --scala --multi-file --out raylib-bindings/ --flavour scala-native05 -- -I$(pwd)
sn-bindgen --package raylib --header raylib-bindings/raylib-amalgam.h --c --out resources/scala-native/raylib.c
 --c-import "raylib.h" --c-import "raymath.h" --flavour scala-native05 -- -I$(pwd)
```

[coursier]: https://get-coursier.io
[sn-vcpkg]: https://github.com/indoorvivants/sn-vcpkg
[vcpkg]: https://vcpkg.io/en/
