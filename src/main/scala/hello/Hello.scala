package hello

object Hello {
  def +-+-+(text: String): String =
    text + " a bit more"

  def main(args : Array[String]) : Unit = {
    println("Getting started")
    println("Hello Scala World!")

//    var x : Int = 99
//    x += 10
    // x++ // NO
//    val ninetyNine : Int = 99 // like final in Java / const in C# or JavaScript
    // type inferencing...
    val ninetyNine = 99 // like final in Java / const in C# or JavaScript
    val x/* : Int*/ = ninetyNine + 10
//    x = x + 1
    println(s"x is ${x}") // also f"..." for formatting..
    // Strongly, STATICALLY typed...
    var y = 100
//    y = "Fred" // NO, cannot assign String to Int, even with type inference

    // Scala allows "Operator overloading"
    val bigger = y.+(4)

    // Scala allows "Infix invocation"
    val bigger2 = y + 4

    println(s"longer than fred is ${Hello.+-+-+("fred")}")
    println(s"longer than fred is ${Hello +-+-+ "fred"}")

    var odd : Any = "Hello"
    odd = 99
    
  }
}
