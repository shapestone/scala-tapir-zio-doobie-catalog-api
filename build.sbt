ThisBuild / scalaVersion := "2.13.6"

ThisBuild / version      := "0.1.0"
ThisBuild / organization := "com.shapestone"
ThisBuild / description := "Scala Tapir ZIO Template Project"

lazy val root = (project in file("."))
  .settings(
    name := "Server",
    libraryDependencies += "com.typesafe" % "config" % "1.4.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test,
  )
