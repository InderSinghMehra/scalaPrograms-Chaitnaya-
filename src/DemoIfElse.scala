object DemoIfElse {
  def main(args: Array[String]) {
   val x = 20;
   val y = 30;
   var res ="";
   
   if(x == 20 && y == 30){    //&& both condition  || one condition true will do the work.
     println("It matches")
     res = "x == 20 && y == 30";
   } else {
     println("No it doesn't")
     res = "x != 20";
   }
      println(res);   
     val res2 = if (x != 20) "x == 20" else "x != 20";
     println("It doesnot match",res2); 
  }
}