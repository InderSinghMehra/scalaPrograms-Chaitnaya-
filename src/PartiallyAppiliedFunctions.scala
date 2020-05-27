
//what are partially applied funct?  how function work;
//when a funciton in invoked it is said a funtion is applied on that code to the arguments aka fully applied funtion.
//when a few arguments are provided and a third one is default or use a wild card it is said as partial function. 
import java.util.Date
object PartiallyAppiliedFunctions {
  
  def log(date: Date, message: String)={
    println(date + "   " + message);
  }
  
  
  def main(args: Array[String]) {
    val sum = (a: Int, b: Int, c: Int) => a+b+c
    val f = sum(10 ,20 ,_ : Int)
     println(f(30));
    
    val date = new Date;
    val newlog= log(date, _:String);
    newlog("the message 1");
    newlog("the message 2");
    newlog("the message 3");
    newlog("the message 4");
    
  }
  
  
}