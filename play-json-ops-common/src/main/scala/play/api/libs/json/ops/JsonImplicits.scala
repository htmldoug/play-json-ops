package play.api.libs.json.ops

import play.api.libs.json._

import scala.language.implicitConversions

private[ops] trait JsonImplicits extends ImplicitTupleFormats with JsValueImplicits {

  implicit def formatOps(format: Format.type): FormatOps.type = FormatOps

  implicit def oformatOps(oformat: OFormat.type): OFormatOps.type = OFormatOps

  implicit def abstractJsonOps(json: Json.type): AbstractJsonOps.type = AbstractJsonOps

  implicit def abstractJsonOps(json: TypeKeyExtractor.type): AbstractJsonOps.type = AbstractJsonOps
}
