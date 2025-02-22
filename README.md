# Little Fingers

A simple Scala 3 Native application that uses Raylib to render a window where letters are animated when pressed. Written for a [post in my blog](https://blog.indoorvivants.com/2024-02-05-defeating-toddler-with-raylib).
The purpose of this "game" is to distract my toddler who is adamant he needs to smash random keys. I also learned quite a lot making it.

[Blog post](https://blog.indoorvivants.com/2024-02-05-defeating-toddler-with-raylib) | [Tweet](https://twitter.com/velvetbaldmime/status/1755240417900036162)


![CleanShot 2024-02-01 at 22 31 59](https://github.com/indoorvivants/little-fingers/assets/1052965/01ccc0ac-e823-4e49-a3a9-9dc54708b9f9)

_Important: The exact state of repository as described in the blogpost is at [this commit](https://github.com/indoorvivants/little-fingers/tree/e70988460e4cabcfc526f1bf7d1b9930865190bd). Since then, Raylib released 5.5 and introduced some breaking changes, so the bindings were updated to reflect that, and Scala Native was updated to 0.5.x_


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
./build.sc bindings
```

[coursier]: https://get-coursier.io
[sn-vcpkg]: https://github.com/indoorvivants/sn-vcpkg
[vcpkg]: https://vcpkg.io/en/
