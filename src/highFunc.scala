

object highFunc {
  def main(args:Array[String]) = {
    functioneg(150 ,multiplyby2);
  }
  def functioneg(a: Int,i:Int => AnyVal):Unit ={
    println(i(a));
  }
  def multiplyby2(a:Int):Int ={
    a*2
  }
}