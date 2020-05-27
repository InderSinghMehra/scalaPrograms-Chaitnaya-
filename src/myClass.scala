
trait myPet {
  def pet
  def color
}
class myClass extends myPet {
  def pet() {
    println("hello pet")
  }
  def color() {
    println("blue")
  }
  def pet_name() {
    println("Pet_name : Dollar")
  }
}
object main {
  def main(args:Array[String]) = {
    val obj = new myClass()
    obj.pet();
    obj.color();
    obj.pet_name();
  }
}