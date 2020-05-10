package day08

object MO1 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3).map(x => 2 * x)
    println(list)
  }

  def testMyPrint(): Unit = {
    val f = myPrint _
    f()
  }

  def myPrint(): Unit = {
    println("hello world")
  }
}
