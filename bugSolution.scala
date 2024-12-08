```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
  def myMethod(): Int = {
    if (x > 5) {
      x * 2
    } else {
      //Handle the case where x is not greater than 5 more gracefully
      0 //Or any other appropriate default value
    }
  }
}

object Main extends App{
  val obj1 = new MyClass(10)
  println(obj1.myMethod()) // Output: 20

  val obj2 = new MyClass()
  println(obj2.myMethod()) // Output: 0
}
```