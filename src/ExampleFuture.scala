import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object ExampleFuture extends App{
 // used by 'time' method
 implicit val baseTime = System.currentTimeMillis
 // 2 - create a Future
 val f = Future {
 //  Thread.sleep(1)
   println("This is the Future")
 }
// Thread.sleep(2000)
 println("This is outside the future")
}
  

