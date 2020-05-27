

object Filtereg2 extends App {
  val m1 = Map("Inder" -> 1, "Singh" -> 2, "Mehra" -> 3)
  val result = m1.filter(x => x._1 == "Inder")
  println(result)
}