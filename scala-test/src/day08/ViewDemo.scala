package day08

object ViewDemo {
  def main(args: Array[String]): Unit = {

    val rs = (1 to 100).view.filter(x => x.toString == x.toString.reverse)
    println(rs)
    println(rs.size)

    val view = (1 to 100).view.filter(x => x.toString == x.toString.reverse)
    println(view)
    println(view.size)
  }
}
