
@main
def main(): Unit = {

  val text =
    """
    |Pick one:
    |1: Addition
    |2: Subtraction
    |3: Multiplication
    |4: Division
    |5: Exit
    """.stripMargin

  var keepRunning = true
  while (keepRunning) {
  println(text)

  val operation = Console.in.readLine().toInt
    if (operation < 5 && operation > 0) {
      println("Enter x:")
      val x = Console.in.readLine().toInt
      println("Enter y")
      val y = Console.in.readLine().toInt

      if (operation == 1) {
        println("Result:" + (x + y))
      }
      else if (operation == 2) {
        println("Result:" + (x - y))
      }
      else if (operation == 3) {
        println("Result:" + (x * y))
      }
      else if (operation == 4) {
        println("Result:" + (x / y))
      }
    }
    else if (operation == 5) {
      keepRunning = false
    }
    else {
      println("try again")
    }
  }
}