
import scala.util.Random

object PatternMatch extends App {
  val i = Random.nextInt(10);
  def matchTest(x: Int): String = i match {
    case 0 => "zero"
    case 1 => "One"
    case _ => "other"
  }
  matchTest(4)
}