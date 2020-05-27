//closures: a closure is a function which uses one or 
//more variable which are declared outside the functions. can be pure or impure named or unm=amed.
//uses 1 or more variables which are declared  outside
//impure closure is when the datatype of the variable is var
//pure is when its a val
object Closures {
  var number = 10;
  val add =(x: Int) => {
    number = x+ number;
    number;
  }
  
  def main(args: Array[String]){
    number =100; //closure take the last modified value ormost recent state outside the *closure*
    println(add(20));
    
  }
   
}