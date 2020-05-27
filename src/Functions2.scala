object Functions2 { 
  object Math {
    def add(x: Int = 45, y: Int = 15): Int = {    //can use + instead of add. not function overloading but just declation.
      return x + y;
    }
    def square(x: Int) = x*x;                     //can use ** instead of square. not function overloading but just declation.
  }
  def print(x: Int, y : Int): Unit={
    println(x+y);
  }
  def main(args: Array[String]){
    
    var add = (x : Int, y : Int) => x+y;
    println(add(200,300)); 
   print(200,100);
   println(Math.add(10)); //if provided 1 value then it will be provided to x.
   println(Math.square(5));
  }
}