ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"


libraryDependencies ++= Seq (
  "org.eclipse.jetty" % "jetty-server" % "9.3.13.v20161014",
  "org.eclipse.jetty.websocket" % "javax-websocket-server-impl" % "9.3.13.v20161014"
)

lazy val root = (project in file("."))
  .settings(
    name := "hello_scala"
  )
