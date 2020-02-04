package laziness

object PassByName {
  def doStuff(x: => String): Unit = {
    lazy val msg: String = x
    println("in doStuff")
    if (math.random() > 0.5) {
      println(s"x is ${msg}")
      println(s"x is ${msg}")
      println(s"x is ${msg}")
    }
  }

  def getName:String = {
    println("Calculating name....")
    "Fred"
  }

  def log(message: => String) : Unit = {
    // is this message needed? check log level...
    // if so, evaluate it, otherwise bypass
  }

  def main(args: Array[String]): Unit = {
    doStuff(getName)
  }
}
