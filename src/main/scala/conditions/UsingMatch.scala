package conditions

object UsingMatch {
  def main(args: Array[String]): Unit = {
    val x:Any = "banana"

    // tests from top to bottom (ambiguous matches are possible)
    val s: String = x match {
      case 0 => "it's zero"
      case 10 => "ten!!!"
        // NEVER USE "instanceof" followed by a cast...
        // use match /case instead!
      case x: Int => s"not zero or ten, but $x"
      case _ => "it's something other than those values"
    }

    println(s"s is $s")
  }
}
