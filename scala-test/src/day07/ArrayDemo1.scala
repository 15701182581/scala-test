package day07

object ArrayDemo1 {
  def main(args: Array[String]): Unit = {
    //  定长数组的使用
    val arr = new Array[Int](3)
    arr(0) = 0
    arr(1) = 1
    arr(2) = 2
    println(arr.length)
    arr.foreach(println(_))

    val arr2 = Array(1, 2, "xx")
    println("arr2.length = " + arr2.length)
    arr2.foreach(x => print(" " + x))

    println("")

    val arr2Buffer = arr2.toBuffer
    arr2Buffer.append(123)
    arr2Buffer.foreach(x => print(" " + x))
  }
}
