package day07

import java.util

import scala.collection.JavaConversions.asScalaBuffer

object JavaList2ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arrayList = new util.ArrayList[Int]()
    arrayList.add(1)
    arrayList.add(2)
    arrayList.add(3)

    val arrayBuffer = arrayList.toBuffer
    arrayBuffer.append(4)

    arrayBuffer.foreach(i => print(" " + i))
  }
}
