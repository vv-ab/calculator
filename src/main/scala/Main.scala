
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
  var lastResult: Float = 0
  while (keepRunning) {

    println(text)

    val operation = Console.in.readLine().toInt

    if (operation < 5 && operation > 0) {

      print("Enter x (Number or 'r'): ")
      val xInput = Console.in.readLine()
      var x: Float = 0
      if (xInput == "r") {
        x = lastResult
      }
      else {
        x = xInput.toFloat
      }

      print("Enter y (Number or 'r'): ")
      val yInput = Console.in.readLine()
      var y: Float = 0
      if (yInput == "r") {
        y = lastResult
      }
      else {
        y = yInput.toFloat
      }

      if (operation == 1) {
        lastResult = x + y
      }
      else if (operation == 2) {
        lastResult = x - y
      }
      else if (operation == 3) {
        lastResult = x * y
      }
      else if (operation == 4) {
        lastResult = x / y
      }

      println(s"Result: $lastResult")
    }
    else if (operation == 5) {
      keepRunning = false
    }
    else {
      println("try again")
    }
  }
}