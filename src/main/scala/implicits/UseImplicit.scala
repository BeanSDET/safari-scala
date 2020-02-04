package implicits

object NumConv {
  implicit def makeMessage(x : Int): String =
    s"value of x was $x"
}

object UseImplicit {

  def doSomething(implicit x : String): Unit =
    println(s"message is $x")

  def main(args: Array[String]): Unit = {
    doSomething("Hello");

    {
//      implicit val msg1: String = "magical"
      import ImplicitValues.msg
      doSomething
      doSomething("Not magic")
    }

    {
      import NumConv.makeMessage
      val m: String = 99

      println(s"m is $m")
    }
  }
}
