package day07

import scala.collection.mutable

object MapDemo1 {
  def main(args: Array[String]): Unit = {
    val map = Map("jax" -> 1, "wuzhaogui" -> 2, "haha" -> "hehe")
    println(map)

    val map2 = mutable.Map[String, Int]("a" -> 1, "b" -> 2, "c" -> 3)
    println(map2)

    val map3 = mutable.Map(("a", 1), ("b", 2), ("c", 3))
    println(map3)

    val map4 = new mutable.HashMap[String, Int]()
    map4.put("a", 1)
    map4 += "b" -> 2
    map4("c") = 3
    map4 += ("d" -> 4, "e" -> 5)
//    map4 -= "a"
//    map4 -= ("b", "c")
//    map4.remove("d")
    println(map4)
    map4.foreach(entry => {
      println(entry._1 + " " + entry._2)
    })

  }
}
