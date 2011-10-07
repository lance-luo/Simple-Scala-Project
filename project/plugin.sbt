// Eclipse
// https://github.com/typesafehub/sbteclipse
// run "sbt eclipse"
resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "1.4.0")


// IntelliJ IDEA
// https://github.com/mpeltonen/sbt-idea
// run "sbt gen-idea"
resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "0.11.0")