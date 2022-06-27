import sbt.Keys.libraryDependencies
// you can use % test to explicitly declare the dependency for test packages alone e.g.   "org.scalatest"               %% "scalatest"          % "3.2.3"  % Test
//Then we tell sbt that we're using this library as a test framework with this line:
//testFrameworks += TestFramework("munit.Framework")
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"
val test = Seq(
  "org.scalatest"               %% "scalatest"          % "3.2.3",
  "org.scalatestplus.play"      %% "scalatestplus-play" % "5.1.0",
  "org.mockito"                 % "mockito-core"        % "4.0.0",
  "org.mockito"                 %% "mockito-scala"      % "1.17.5",
  "org.scalacheck"              %% "scalacheck"         % "1.15.2",

).map(_ % Test)
lazy val root = (project in file("."))
  .settings(
    name := "TDD",
      libraryDependencies ++= test
  )



