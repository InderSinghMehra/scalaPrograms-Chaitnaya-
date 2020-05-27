

object Nested {
  def NestSum(a:Int, b:Int, c:Int) = {
    def sum2(x:Int, y:Int) = {
      x+y
    }
    sum2(a,sum2(b,c))
  }
  def main(args:Array[String]) {
    var result = NestSum(10,10,10);
    println(result);
  }
}