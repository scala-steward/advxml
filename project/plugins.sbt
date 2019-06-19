addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.0")

resolvers ++= Seq(
  Resolver.sonatypeRepo("public"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases"),
  "Maven repo1" at "http://repo1.maven.org/",
  "Maven repo2" at "http://mvnrepository.com/artifact"
)