package unitTests
import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.convertToAnyMustWrapper


class SimpleMethodsSpec extends AnyFlatSpec {





  "SimpleMethods" should "return the correct list when the map function is invoked " in {
      val someList : List[Int]= List(1,2,3)
      val otherList: List[Int] = List(2,3,4)
      val expectedResult: List[Int] = someList.map(x=> x+1)
       expectedResult mustEqual otherList


  }
}
