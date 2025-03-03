package playground

object FactorialFunction extends App{

  def factorOf(number: Int): Int ={
    if(number == 1) 1 else factorOf(number - 1) * number
  }

  println("result: " + factorOf(5))
}
