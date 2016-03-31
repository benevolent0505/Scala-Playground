name := "DataBaseProgramming"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "org.xerial" % "sqlite-jdbc" % "3.8.11.2",
  "com.typesafe" % "config" % "1.3.0",
  "joda-time" % "joda-time" % "2.9.3"
)