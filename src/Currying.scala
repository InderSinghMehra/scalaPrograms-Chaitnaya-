//Currying is the technique of Transforming a function
// that takes multiple arguments into a function
//that takes a single argument

object Currying {

  def add(x: Int, y:Int) = x + y
  
  def add2 (x: Int) = (y: Int) => x+y; //curried func
  
  def main(args:Array[String]) {
    println(add(30,40));
    
    
    println(add2(2)(30));
    val sum40 = add2(40);
    println(sum40(100));
  }
  
  
}