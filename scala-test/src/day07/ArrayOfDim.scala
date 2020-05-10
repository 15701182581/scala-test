package day07

object ArrayOfDim {
  def main(args: Array[String]): Unit = {
    //  2维数组 3 * 4
    val arr34 = Array.ofDim[Int](3, 4)
    (0 until 3).foreach(i => {
      (0 until 4).foreach(j => {
        arr34(i)(j) = i * 10 + j
      })
    })
    arr34.foreach(row => {
      row.zipWithIndex.foreach(x => print("\t" + x._1))
      println()
    })
  }
}
