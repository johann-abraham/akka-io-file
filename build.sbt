name := "akka-io-file"

organization := "io.github.drexin"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.5"



parallelExecution in Test := false

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.6" % "compile"

libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.3.6" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"

