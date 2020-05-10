package day07

import scala.collection.mutable.Queue

object QueueDemo {
  def main(args: Array[String]): Unit = {
    val queue = Queue[Int](1, 2, 3)
    queue += 4
    println(queue)
    queue ++= List(5, 6 , 7)
    println(queue)

    queue.enqueue(8,9)
    println(queue)

    println(queue.dequeue())
    println(queue)

  }
}
