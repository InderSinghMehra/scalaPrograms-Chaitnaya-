

object HigherOrderFunc {
  
  def math(x: Double, y: Double, z: Double, f:(Double,Double)=> Double): Double = f(f(x,y),z);  
  def main(args: Array[String]) {
    val result = math(50, 20, 30, (x,y)=>x+y); // use * or min instead of +
    println(result);                            // use _(underscore) wildcard in place of x & y, math(50,20,10, _max_);  
    
  }
}