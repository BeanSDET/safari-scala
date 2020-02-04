package date

//NO KEYWORD PUBLIC (public is actually the default!)
/*public */
object Date {
  def dayOfWeek(day: Int, month: Int, year: Int = 2020): Int = {
    // if month is jan or feb, treat it as month 13, 14 of PREVIOUS YEAR
//    var m = month
//    if (month < 3) {
//      m += 12
//    }
//    // "if" expression IS the ternary operator
//    val m : Int = if (month < 3) (month + 12) else month
//    val y : Int = if (month < 3) (year - 1) else year

//    val tup = if (month < 3) (month + 12, year - 1) else (month, year)
//    val m = tup._1
//    val y = tup._2

      val (m, y) = if (month < 3) (month + 12, year - 1) else (month, year)

    /*return */
    (day + (13 * (m + 1) / 5) + y + y / 4 - y / 100 + y / 400) % 7
  }

  private val dayNamesInternal: Array[String] =
    Array.apply("Saturday", "Sunday", "Monday",
      "Tuesday", "Wednesday", "Thursday", "Friday")

  def dayNames(index: Int): String = dayNamesInternal.apply(index)

  val daysInJan : Int = 31
}

// for free: apply method in companion object...
// toString, equals, hashcode (and more)
case class Date(day: Int, month: Int, year: Int)

//class Date(val day: Int, val month: Int, val year: Int) // OR "var"
//{
//  constructor body...
//  other methods...
//}

//class Date(d: Int, m: Int, y: Int) {
//  println("making a date...")
////  var day: Int = _
//  val day: Int = d
//  val month: Int = m
//  val year: Int = y
////  println()
//
//  override def toString:String = s"date made has day: ${this.day}, month:" +
//    s" ${this.month}, year: ${this.year}"
//}
//
