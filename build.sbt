import sbt.Keys.testOptions

name := "cucumber-scala-example"

version := "1.0"

scalaVersion := "2.11.11"

lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .settings(Defaults.itSettings: _*)
  .settings(
    libraryDependencies ++= dependencies,
    testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-v", "+q", "-n", "-a"),
    testOptions in IntegrationTest += Tests.Argument(TestFrameworks.JUnit, "-v", "+q", "-n", "-a")
  )

lazy val dependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.3" % "test,it",
  "info.cukes" %% "cucumber-scala" % "1.2.5" % "test,it",
  "info.cukes" % "cucumber-junit" % "1.2.5" % "test,it",
  "junit" % "junit" % "4.12" % "test,it",
  "com.novocode" % "junit-interface" % "0.11" % "test,it"
)


