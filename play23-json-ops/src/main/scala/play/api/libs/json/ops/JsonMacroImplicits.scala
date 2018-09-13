package play.api.libs.json.ops

import play.api.libs.json.Json

import scala.language.implicitConversions

private[ops] trait JsonMacroImplicits {

  implicit def jsonMacroOps(json: Json.type): JsonMacroOps.type = JsonMacroOps
}
