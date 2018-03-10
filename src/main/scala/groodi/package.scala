import macrocompat.bundle

import scala.language.experimental.macros
import scala.reflect.macros.blackbox

package object groodi {

  sealed trait SqlArgument

  object SqlArgument {
    case class IntValue(x: Int) extends SqlArgument
    case class FloatValue(x: Float) extends SqlArgument
    case class StringValue(x: String) extends SqlArgument
    case class AnyValue(x: Any) extends SqlArgument
  }

  case class PreparedStatement(parts: Seq[String], args: Seq[SqlArgument])

  trait SqlEncoder[T] extends (T => SqlArgument)

  object SqlEncoder {
    implicit val intEncoder: SqlEncoder[Int] = x => SqlArgument.IntValue(x)
    implicit val floatEncoder: SqlEncoder[Float] = x => SqlArgument.FloatValue(x)
    implicit val stringEncoder: SqlEncoder[String] = x => SqlArgument.StringValue(x)
    implicit val objectEncoder: SqlEncoder[Any] = x => SqlArgument.AnyValue(x)
  }

  @bundle class SqlInterpolationMacro(val c: blackbox.Context) {
    import c.universe._

    def sqlImpl(args: c.Tree*): c.Tree = {
      val Apply(_, List(Apply(_, rawParts))) = c.prefix.tree
      val xs = args.map(x => q"implicitly[groodi.SqlEncoder[${x.tpe}]].apply($x)")
      val parts = rawParts.map(s => Literal(Constant(s)))
      q"""groodi.PreparedStatement(Seq(..$parts), Seq(..$xs))"""
    }
  }

  implicit class SqlStringInterpolation(val sc: StringContext) extends AnyVal {
    def sql(args: Any*): PreparedStatement =
      macro SqlInterpolationMacro.sqlImpl

//    {
//
//      val statement = sc.parts.mkString("?")
//      val prepared = connection.prepareStatement(statement)
//
//      args.zipWithIndex foreach {
//        case (arg: Int, i) => prepared.setInt(i + 1, arg)
//        case (arg: Float, i) => prepared.setFloat(i + 1, arg)
//        case (arg: String, i) => prepared.setString(i + 1, arg)
//        case (arg, i) => prepared.setObject(i + 1, arg)
//      }
//
//      prepared
//    }
  }

}
