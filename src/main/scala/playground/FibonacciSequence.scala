package playground

object FibonacciSequence extends App{

  def fibonacciSequence(position: Int): Int = {
    if(position <= 0 ) 0 else{
      if(position == 1 ) 1 else fibonacciSequence(position-1) + fibonacciSequence(position-2)
    }

  }

  println( fibonacciSequence(0))
  println( fibonacciSequence(1))
  println( fibonacciSequence(2))
  println( fibonacciSequence(3))
  println( fibonacciSequence(4))
  println( fibonacciSequence(5))
  println( fibonacciSequence(6))
  println( fibonacciSequence(11))

}
