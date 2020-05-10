package day07

object TupleDemo1 {
  def main(args: Array[String]): Unit = {
    val tuple = (1, 2)
    println(tuple)
    println(tuple._1 + " " + tuple._2)
    println(tuple.productElement(0) + " " + tuple.productElement(1))

    tuple.productIterator.foreach(x => print(x + " "))
  }
}
