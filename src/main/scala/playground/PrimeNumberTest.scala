package playground

import scala.annotation.tailrec

object PrimeNumberTest extends App{

  def testIfPrime(number: Int): Boolean = {

    @tailrec
    def testIfPrimeStep(nextDivisor: Int): Boolean = {

      if (number == 1 || nextDivisor == 1) true else {
        if (number % nextDivisor == 0) false
        else
          testIfPrimeStep(nextDivisor - 1)
      }

    }

    if(number>0)
      testIfPrimeStep(number-1)
    else
      false
  }

  @tailrec
  def printCheck(first: Int, last: Int): Unit = {
    if(first == last)
      println(last + " " + testIfPrime(last) )
    else{
      println(first + " " + testIfPrime(first))
      printCheck(first + 1, last)
    }

  }

  printCheck(1,21)
}
