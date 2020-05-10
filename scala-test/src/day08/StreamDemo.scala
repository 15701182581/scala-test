package day08

import scala.collection.mutable

object StreamDemo {
  def main(args: Array[String]): Unit = {
    def loop1(v: Int): Stream[Int] = v #:: loop1(v + 1)
    def loop2(v: Int): Stream[Int] = v #:: loop2(v + 2)
    loop2(1).take(10).foreach(println(_))
  }
}
