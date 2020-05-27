

object foreach extends App {
 val x = List(1,2,3,4,5,6,7,8,9,10)
 x.foreach(c => if(c%2==0) println(c))
}