import sbt._

object Dependencies {

  val Play_2_5 = "2.5.18"
  val Play_2_6 = "2.6.19"
  val Play_2_7 = "2.7.0-M4"

  val ScalaCheck_1_12 = "1.12.5"
  val ScalaCheck_1_13 = "1.13.5"
  val ScalaCheck_1_14 = "1.14.0"

  private val Play_2_6_JsonVersion = "2.6.10"
  private val ScalaCheckOpsVersion = "2.2.0"
  private val ScalaTest_2 = "2.2.6"
  private val ScalaTest_3 = "3.0.5"
  private val ScalaTest_3_M4 = "3.0.6-SNAP4"

  def playJson(playVersion: String): ModuleID = {
    val playJsonVersion = playVersion match {
      case Play_2_6 => Play_2_6_JsonVersion
      case Play_2_5 | Play_2_7 => playVersion
    }
    "com.typesafe.play" %% "play-json" % playJsonVersion
  }

  def scalacheckOps(scalaCheckVersion: String): ModuleID = {
    val suffix = scalaCheckVersion match {
      case ScalaCheck_1_12 => "_1-12"
      case ScalaCheck_1_13 => "_1-13"
      case ScalaCheck_1_14 => "_1-14"
    }
    "com.rallyhealth" %% s"scalacheck-ops$suffix" % ScalaCheckOpsVersion
  }

  def scalatest(scalaCheckVersion: String): ModuleID = {
    val scalatestVersion = scalaCheckVersion match {
      case ScalaCheck_1_12 => ScalaTest_2
      case ScalaCheck_1_13 => ScalaTest_3
      case ScalaCheck_1_14 => ScalaTest_3_M4
    }
    "org.scalatest" %% "scalatest" % scalatestVersion
  }

}
