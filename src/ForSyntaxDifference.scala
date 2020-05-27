

object ForSyntaxDifference extends App {
  for (w <- 0 to 3; z <- 1 to w) {
    print("*");
    println("");
  }

  for (w1 <- 0 to 3) {
    for (w2 <- 1 to w1) {
      print("*");
    }
    println("");

  }

}