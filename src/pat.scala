

object pat extends App {

  val i, j = 0;

  for (i <- 0 to 5) {
    for (j <- 0 to i) {
      print("*")
    }
    print("\n");
  }
}