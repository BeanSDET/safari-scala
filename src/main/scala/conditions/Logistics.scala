package conditions

case class Truck(capacity: Int)
case class Car(seats: Int, manual: Boolean)

object Logistics {
  def main(args: Array[String]): Unit = {
//    val thing: Any = Truck(10)
    val thing: Any = Car(5, true)

    val maxLoad = thing match {
//      case t: Truck => t.capacity
      case Truck(c) => c
      // guard condition does not need parens...
      case Car(s, _) if s > 4 => 170 * (s - 1)
      case Car(s, _) => 150 * (s - 1) + 20 // for the trunk :)
    }

    println(s"thing can carry $maxLoad")
  }
}
