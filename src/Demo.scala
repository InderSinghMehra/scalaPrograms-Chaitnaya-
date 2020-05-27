

object Demo {
  val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)                     //List1
  val mymap = Map(1 -> "Inder", 2 -> "Singh", 3 -> "Mehra")         //List2 - map
  def main(args:Array[String]) = {                                  //define function
    println(lst.map(x => x * 2));                                   //map x*2-List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    println(lst.map(x => "hi" + x));                                //List(hi1, hi2, hi3, hi4, hi5, hi6, hi7, hi8, hi9, hi10)
    println(lst.map(x => "hi" * x));                                //List(hi, hihi, hihihi, hihihihi, hihihihihi, hihihihihihi, hihihihihihihi, hihihihihihihihi, hihihihihihihihihi, hihihihihihihihihihi)
    println(mymap.map(x => "Hie " + x ));                           //List(Hie (1,Inder), Hie (2,Singh), Hie (3,Mehra))
    println(mymap.mapValues(x => "Hie " + x ));                     //Map(1 -> Hie Inder, 2 -> Hie Singh, 3 -> Hie Mehra)
    println("hello".map(_.toUpper))                                 //HELLO
    println(List(List(1,2,3), List(3,4,5)));                        //List(List(1, 2, 3), List(3, 4, 5))
    println(List(List(1,2,3), List(3,4,5)).flatten);                //List(1, 2, 3, 3, 4, 5)
    println(lst.map(x => List(x, x+1)));                            //List(List(1, 2), List(2, 3), List(3, 4), List(4, 5), List(5, 6), List(6, 7), List(7, 8), List(8, 9), List(9, 10), List(10, 11))
    println(lst.flatMap(x => List(x, x+1)));                        //List(1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11)
    
    println(lst.filter(x => x%2 == 0));                             //List(2, 4, 6, 8, 10)
    
  }
}