package day07

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo1 {
  def main(args: Array[String]): Unit = {

    val arraybuffer = ArrayBuffer[Int](1, 2, 3)
    println("arraybuffer hash code: " + arraybuffer.hashCode())
    arraybuffer.append(4, 5)
    println("arraybuffer hash code: " + arraybuffer.hashCode())

    arraybuffer.foreach(x => print(" " + x))

    arraybuffer.remove(1, 2)
    println("\n=====")
    arraybuffer.foreach(x => print(" " + x))

    val arr = arraybuffer.toArray
    println(arr)
  }
}
