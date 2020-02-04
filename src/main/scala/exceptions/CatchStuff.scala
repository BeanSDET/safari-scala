package exceptions

import java.sql.SQLException

import scala.util.{Failure, Success, Try}

object CatchStuff {
  def dodgy:String =
    if (math.random() > 0.5)
      throw new SQLException("Oops") else "Hello"

  def main(args: Array[String]): Unit = {
    println("starting")
//    try {
//      dodgy
//    } catch {
//      case z => println(s"caught an object $z")
//    }

    // Also see "Either"
    Try(dodgy) match {
      case Success(m) => println(s"succeeded, message is $m")
      case Failure(e) => println(s"failed, exception is ${e.getMessage}")
    }
//    println(s"got t which is $t")
    println("done")
  }
}
