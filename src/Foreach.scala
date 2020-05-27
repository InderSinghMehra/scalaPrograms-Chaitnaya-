

object Foreach extends App {
  val li = List(1, 2, 3, 4, 5, 6, 7)
  li.foreach(println);
  var i = 0
  val Name = List("Inder","Singh","Mehra")
  for(i <- 0 to (Name.length -1)) { println(Name(i)) }
  
}