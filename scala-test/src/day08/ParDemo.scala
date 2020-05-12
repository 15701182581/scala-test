package day08

object ParDemo {
  def main(args: Array[String]): Unit = {
    //  并行计算
    (1 to 5).par.foreach(x => {
      println(Thread.currentThread().getId + " " + x)
    })
  }
}
