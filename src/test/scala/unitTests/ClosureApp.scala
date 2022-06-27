package unitTests

object ClosureApp extends App{
  val factor = 3
  val multiplier= (i:Int) => i* factor
  println(List(1,2,3,4,5).foreach(x=> x*3))
  println(List(1,2,3,4,5).map(x=> x*3))
  println(List(20,90,80).map(multiplier))


}
