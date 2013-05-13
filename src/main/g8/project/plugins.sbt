
// Resolvers

resolvers += Classpaths.typesafeResolver

resolvers += "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo"

resolvers += Classpaths.sbtPluginReleases

// Plugins

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.1.0")

addSbtPlugin("reaktor" % "sbt-scct" % "0.2-SNAPSHOT")

addSbtPlugin("me.lessis" % "sbt-growl-plugin" % "0.1.3")

addSbtPlugin("org.scalatra.sbt" % "scalatra-sbt" % "0.2.0")

addSbtPlugin("com.typesafe.startscript" % "xsbt-start-script-plugin" % "0.5.3")
