package day08

object MO2 {
  def main(args: Array[String]): Unit = {
    test6()
  }

  def test1(): Unit = {
    val list = List("Alice", "Jax", "HelloWorld")
    println(list.map(x => x.toUpperCase))
  }

  def test2(): Unit = {
    val list = List(11, 2, 33)
    println(list.flatMap(x => x.toString))
    val list2 = List(List(1, 2, 3), 4, 5, List("str"), "str")
    println(list2.flatMap(x => x.toString))
    val list3 = List(List(1, 2, List(3, 4)), 5, List(6))
    println(list3.flatMap(x => x.toString))
  }

  def test3(): Unit = {
    val list = List("Alice", "alice", "jax", "wuzhaogui", "abc")
    println(list.filter(x => x.startsWith("a")))
  }

  def test4(): Unit = {
    val list = List(1, 2, 3)
    println(list.sum)
    println(list.reduce((x, y) => x + y))
    println(list.reduceLeft((x, y) => x + y))
    println(list.reduceRight((x ,y) => x - y))

    println("===========")

    println(list.min)
    println(list.max)
    println(list.reduce((x, y) => x.min(y)))
    println(list.reduce((x, y) => x.max(y)))

  }

  def test5(): Unit = {
    val list5 = List(1, 2, 3, 4, 5)
    println(list5.fold(10)((x, y) => x + y))
    println((10 /: list5)((x, y) => x + y))// /: use foldleft instead
  }

  def test6(): Unit = {
    println((1 to 3).scan(10)((x, y) => x - y))
    println((1 to 3).scanRight(10)((x, y) => x - y))
  }


}
