package day07

import scala.collection.mutable.ListBuffer

object ListBufferDemo1 {
  def main(args: Array[String]): Unit = {
    val lb = ListBuffer[Int](1, 2, 3)

    println("lb hashcode: " + lb.hashCode())

    lb.append(4, 5, 6)
    lb.foreach(x => print(" " + x))
    println("  =====")
    println("lb hashcode: " + lb.hashCode())

    lb += 4
    lb.foreach(x => print(" " + x))
    println("  =====")
    println("lb hashcode: " + lb.hashCode())

    lb ++= lb
    println(lb)

    lb.remove(7, 7)
    println(lb)



  }
}
