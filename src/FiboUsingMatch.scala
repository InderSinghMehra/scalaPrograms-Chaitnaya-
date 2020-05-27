

object FiboUsingMatch {
  def fib(a: Int): Int = a match {
    case 0  => 0
    case 1 | 2  => 1
    case _ => fib(a - 1) + fib(a - 2)
  }
  def main(args: Array[String]) = {
    println(fib(3))
  }
}