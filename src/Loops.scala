object Loops {
  def main(args: Array[String]) {
     var x = 0;
     while(x < 10) {
       println("x = "+ x);
       x +=1; 
     }
     var y = 0;
     do {
       println("y = " + y);
       y += 1;
     } while (y < 10);
     /*for (var a <- Range) { }*/
     for(i <- 1 to 5; j <- 1 to 3) {
       println("i using to " + i + " " + j);
     }
     for(i <- 1 until 5) {
       println("i using until " +i);
     }
     
     val lst = List(7,6,1,2,3,4,5,6,7,8,9,10);
     
     for (i <- lst) {
       println("i using lst " +i);
     }
     for (i <- lst; if i <= 6) {
       println("i using lst " +i);
     }     
    val result = for {i <- lst; if i < 6} yield {
       i*i
    }
    println("result = "+ result);
  } 
}