package day07

import scala.collection.mutable

object QueueDemo2 {
  def main(args: Array[String]): Unit = {
    val queue = mutable.Queue[Int](1, 2, 3, 4, 5)
    println(queue.head)
    println(queue.front)
    println(queue.last)
    println(queue.tail)
  }
}
