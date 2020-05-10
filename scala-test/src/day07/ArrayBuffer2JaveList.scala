package day07

import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions.bufferAsJavaList

object ArrayBuffer2JaveList {
  def main(args: Array[String]): Unit = {
    val arrBuffer = ArrayBuffer[String]("1", "2", "3")
    val javaList = new ProcessBuilder(arrBuffer)
    println(javaList.command())
  }
}
