object Main{
  def main(args:Array[String]):Unit = {

    var a:Double = 0
    var b:Double = 1
    var count = 0
    def loop():Unit = {
      if (count<1000){
        var next = a+b
        a = b
        b = next
        var fib:Double = next/a
        println(s"fib: $fib \t")

        count += 1
        loop()
      }
    }
    loop()





  }
} 
