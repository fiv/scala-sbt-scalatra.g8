
// Info

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_version$"

seq(webSettings:_*)

seq(com.typesafe.startscript.StartScriptPlugin.startScriptForClassesSettings: _*)

scalacOptions ++= Seq("-feature")

seq(ScctPlugin.instrumentSettings : _*)

testOptions in ScctTest += Tests.Argument("-oFD")

// Resolvers

resolvers += Resolver.sonatypeRepo("releases")

resolvers += Classpaths.typesafeReleases

// Libraries

libraryDependencies ++= Seq(
    "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
    "com.typesafe" %% "scalalogging-slf4j" % "1.0.1",
    "ch.qos.logback" % "logback-classic" % "1.0.10",
    "org.scalatra" %% "scalatra" % "2.2.0",
    "org.scalatra" %% "scalatra-scalate" % "2.2.0",
    "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided",
    "org.eclipse.jetty" % "jetty-webapp" % "8.1.10.v20130312" % "compile;container",
    "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "compile;container;provided;test" artifacts Artifact("javax.servlet", "jar", "jar"),
    "com.google.guava" % "guava" % "14.0.1",
    "com.github.nscala-time" %% "nscala-time" % "0.4.0",
    "org.json4s" %% "json4s-native" % "3.2.4",
    "org.json4s" %% "json4s-jackson" % "3.2.4",
    "com.typesafe.slick" %% "slick" % "1.0.0",
    "org.slf4j" % "slf4j-nop" % "1.6.4",
    "com.h2database" % "h2" % "1.3.171",
    "c3p0" % "c3p0" % "0.9.1.2",
    "org.scalatra" %% "scalatra-scalatest" % "2.2.1" % "test"
)

