package date

object UseDate {
  def apply(i: Int): String = "You gave me number " + i

  def update(i: Int, s: String): Unit =
    println(s"updating element at ${i}, with ${s}")

  def main(args: Array[String]): Unit = {
    //    Date.dayNames(0) = "Samedi" // nope, it's private now...
    println(s"day zero is ${Date.dayNames(0)}")
    println(s"days in January ${Date.daysInJan}")

    println(s"for 5 get ${UseDate.apply(5)}")
    println(s"for 5 get ${UseDate(5)}")

    UseDate.update(99, "Fascinating")
    UseDate(99) = "Fascinating"

    println(s"Day of Jan 1, 2000 was ${Date.dayOfWeek(1, 1, 2000)}")
    println(s"Day of Feb 4, 2020 is ${Date.dayOfWeek(month = 2, day = 4, year = 2020)}")
    println(s"Day of Feb 4, 2020 is ${Date.dayOfWeek(month = 2, day = 4)}")

    println(s"type of Date is ${Date.getClass.getName}")
    //    val d = new Date(4, 2, 2020)
    val d = Date(4, 2, 2020)
    println(s"day is ${d.day}")
    println(s"day is ${d}")

    val d1 = Date(4, 2, 2020)
    val d2 = Date(5, 2, 2020)

    // == operator delegates to .equals method!!!
    println(s"d equals d1? ${d == d1}")
    println(s"d1 equals d2? ${d1 == d2}")

    // check object identity with eq()
    println(s"d same as d1? ${d eq d1}")
    println(s"d same as d1? ${d.eq(d1)}")

  }
}
