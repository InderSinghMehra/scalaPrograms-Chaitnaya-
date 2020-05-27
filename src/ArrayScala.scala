object ArrayScala {
  val myarray: Array[Int] = new Array[Int](4);
  val myarray2 = new Array[Int](5);
  def main(args:Array[String])  {
    myarray(0) = 20;
    myarray(1) = 30;
    myarray(2) = 40;
    myarray(3) = 50;
    //println(myarray);
    for(x <- myarray)  {
      println(x);
      
     }
    for(i <- 0 to (myarray.length - 1)) {
      println(myarray(i));
    }
  }
}