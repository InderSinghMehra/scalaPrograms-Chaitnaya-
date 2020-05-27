object FunctionsScala {
   object Math {
    def square (x : Int) = x*x;
  }
  def add(x : Int, y : Int) : Int = {
    return x + y;
  }
  def sub(x : Int, y : Int) : Int = {
             x - y;
  } 
  def mul(x : Int, y : Int) : Int = return x * y;
  def div(x : Int, y : Int) = x / y; 
  def main(args: Array[String]) {
    println(add(45,15));
    println(sub(45,15));
    println(mul(45,15));
    println(div(45,15));
    println(Math.square(5));
    println(Math square 5);
  } 
}