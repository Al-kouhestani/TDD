package add


object SimpleMethods {

  def addOne(x: List[Int]): List[Int] = {
    val y = x.map(x => x + 1)
    y
  }

  def evaluateCosts(x: BigDecimal): String = {
    x match {
      case x if (x >= 50.00) => "too high" //ask mazin
      case _ => "within budget"
    }
  }

  def sumOfList(x: List[Int]): Int = {
    val y = x.sum
    y
  }

  def factorial(x: Int): Int = {
    if (x == 0) 1
    else x * factorial(x - 1)
  }


  sealed trait area

  case class Triangle(height: Int, base: Int) extends area {
    val area: Int = (height * base) / 2
  }

  case class Trapezoid(height: Int, a: Int, b: Int) extends area {
    val area: Int = (a + b) / 2 * height
  }

  def factorial2(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1) accumulator else {
        println(i-1, i*accumulator)
        fact(i - 1, i * accumulator)
      }
    }

    fact(i, 1)
  }
  object MultiplesOf3Or5 {
    def solution(number: Int): Int = {
      val x= 1 to number
      val num = x.filter(x => x % 5 == 0 | x % 3 == 0).sum
      num
    }
  }





}
