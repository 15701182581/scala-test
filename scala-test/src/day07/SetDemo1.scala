package day07

import scala.collection.mutable

object SetDemo1 {
  def main(args: Array[String]): Unit = {
    val set1 = Set(1, 2, 3)
    println(set1)
    val set2 = mutable.Set(1, 2, 3)
    println(set2)

    set2 += 4
    set2.add(5)
    println(set2)

    set2 -= 4
    set2.remove(5)
    println(set2)

    set2.foreach(x => print(" " + x))
  }
}
