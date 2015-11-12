import sbt._, Keys._

object Dependencies {

  object Version {
    val scalaz = "7.1.5"
    val scalaprops = "0.1.16"
    val testInterface = "1.0"
  }

  val scalazConcurrent = "org.scalaz" %% "scalaz-concurrent" % Version.scalaz
  val testInterface = "org.scala-sbt" % "test-interface" % Version.testInterface
  val scalapropsGen = "com.github.scalaprops" %% "scalaprops-gen" % Version.scalaprops
  val scalapropsCore = "com.github.scalaprops" %% "scalaprops-core" % Version.scalaprops
  val scalapropsScalazlaws = "com.github.scalaprops" %% "scalaprops-scalazlaws" % Version.scalaprops
}
