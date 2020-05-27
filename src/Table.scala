

object Table extends App{
  def tab(n: Int) = {
    for (i <- 0 to 10) {
      println(n + " * " + i + " = " + n * i);
    }
  }
 // def main(args: Array[String]) = {
    val i = Console.readInt()
    tab(i)
  //}
    
}