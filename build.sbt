name := "play-jsonpath"

organization := "com.josephpconley"

version := "2.7.0-SNAPSHOT"

scalaVersion := "2.12.7"

crossScalaVersions := Seq("2.11.4", "2.12.7")

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
	"com.typesafe.play" %% "play-json" % "[2.7.0,2.7.+)",
	"io.gatling" %% "jsonpath" % "0.6.14",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

publishMavenStyle := true

publishArtifact in Test := false

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/josephpconley/play-jsonpath"))

pomExtra := (
    <scm>
      <url>git@github.com:josephpconley/play-jsonpath.git</url>
      <connection>scm:git:git@github.com:josephpconley/play-jsonpath.git</connection>
    </scm>
    <developers>
      <developer>
        <id>josephpconley</id>
        <name>Joe Conley</name>
        <url>http://www.josephpconley.com</url>
      </developer>
    </developers>)
