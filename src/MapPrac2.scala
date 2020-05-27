

object MapPrac2 {
  def main(args:Array[String]) {
    val map1 = Map("Inder" -> 1,
        "singh" -> 2,
        "mehra" -> 3)
     val check = map1("Inder")
    println(check)
    
    val checkKaro = if(map1.contains("singh")) map1("singh") else 0 //  map1("Inder") 
    println(checkKaro)
  }
}