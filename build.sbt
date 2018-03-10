name := "Grooudi"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.typelevel" %% "macro-compat" % "1.1.1",
  "org.scala-lang" % "scala-compiler" % scalaVersion.value % "provided",
  "com.lihaoyi" %% "utest" % "0.6.3" % "test",
  compilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.patch),
)

testFrameworks += new TestFramework("utest.runner.Framework")