package day07

object ListDemo1 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)
    val emptyList = Nil
    println(list)
    println(emptyList)
    println(list(2))

    println("=====")
    //  往list追加元素
    val list2 = list :+ 4
    val list3 = 4 +: list
    println("list : " + list)
    println("list2: " + list2)
    println("list3: " + list3)

    println("=====")

    // :: , :::
    val list4 = 5 :: 6 :: 7 :: list2
    println("list4 = " + list4)
    val list5 = 5 :: list2 ::: list ::: 10 :: Nil
    println("list5 = " + list5)
  }
}
