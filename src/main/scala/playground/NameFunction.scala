package playground

object NameFunction extends App {

  def greetingKidsFunction(name: String, age: Int): Unit = {
    println("Hello, my name is " + name + " and I am " + age + " yeares old." )
  }

  greetingKidsFunction("Kulfon", 30)

}
