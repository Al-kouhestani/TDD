package unitTests
import add.SimpleMethods
import add.SimpleMethods.{Trapezoid, Triangle, factorial}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.convertToAnyMustWrapper


class SimpleMethodsSpec extends AnyFlatSpec {


  "SimpleMethods" should " adding one to every element of the list" in {
    val someList: List[Int] = List(1, 2, 3)
    val expectedResult: List[Int] = List(2, 3, 4)
    val actualResult: List[Int] = SimpleMethods.addOne(someList)
    expectedResult mustEqual actualResult

  }
  "SimpleMethods" should "print 'too high' if any number larger than 50 is passed to it" in {
    val testNumber: BigDecimal = 99.00
    val expectedResult: String = "too high"
    val actualResult: String = SimpleMethods.evaluateCosts(testNumber)
    expectedResult mustEqual actualResult
  }
  "SimpleMethods" should "the case classes should calculate the correct area when invoked" in {
    val expTriangleArea: Int = 9
    val expTrapezoidArea: Int = 30
    Triangle(6,3).area mustEqual expTriangleArea
    Trapezoid(10, 2, 4).area mustEqual expTrapezoidArea
  }
  "SimpleMethods" should "return the correct sum of the list using foldLeft/Right" in {
    val x = List(1,2,3,4,5,6,7,8,9,10)
    val y= x.foldLeft(0)((n,m)=> n+m)
    x.sum mustEqual y
  }
  "SimpleMethods" should "factorial should return the correct sum" in {
    val a = 10
    val b = 3628800
    val c= factorial(a)
    c mustEqual b
  }
//  "SimpleMethods" should "factorial2 " in {
////    val factorial4 = factorial2(5)
//    println(remainingMoney(16.50, 20.00))
////    println(solution(5))
//  }
}
