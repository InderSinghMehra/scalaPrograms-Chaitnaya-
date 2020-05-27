

object cur {
     def add(a:Int)(b:Int) = {  
        a+b  
    }  
    def main(args: Array[String]) = {  
        var result = add(10)(10)  
        println("10 + 10 = "+result)  
        var addIt = add(10) _
        var result2 = addIt(10)
        println("10 + 10 = "+result2)
    }  
}  