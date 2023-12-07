ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"


libraryDependencies ++= Seq (
  "org.eclipse.jetty" % "jetty-server" % "11.0.14",
)

lazy val root = (project in file("."))
  .settings(
    name := "hello_scala"
  )
