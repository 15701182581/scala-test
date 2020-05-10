package day08

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object MO3 {
  def main(args: Array[String]): Unit = {

    test4()

  }

  def test1(): Unit = {
    val str = "AAAAAAABBBBBBBCCCCCCCDDDDEEEFFJJJKK"
    println(str.flatMap(x => x.toString).toBuffer)

    val bf = str.foldLeft(new ArrayBuffer[Char]())((x: ArrayBuffer[Char], y: Char) => {
      x.append(y)
      x
    })
    println(bf)
  }

  def test2(): Unit = {
    val str = "AAAAAAABBBBBBBCCCCCCCDDDDEEEFFJJJKK"
    val map = str.foldLeft(new mutable.HashMap[Char, Int]())((map : mutable.HashMap[Char, Int], c: Char) => {
      map += (c -> (map.getOrElse(c, 0) + 1))
    })
    println(map)
  }

  def test3(): Unit = {
    val sentence = List("hello wold", "hello jax", "my name is jack", "how are you",
      "how do you do", "hello", "ok", "ok", "ok")

    val map = sentence.foldLeft(new mutable.HashMap[String, Int]())((map : mutable.HashMap[String, Int], str: String) => {
      str.split(" ").foreach(str => {
        map += str -> (map.getOrElse(str, 0) + 1)
      })
      map
    })
    val sorted = map.toList.sortWith((m1, m2) => m1._2 < m2._2)
    println(map)
    println(sorted)

  }

  def test4(): Unit = {
    val list1 = List(1, 2, 3)
    val list2 = List(2, 3, 4, 5)
    println(list1.zip(list2))
    val arr1 = Array(1, 2, 3)
    println(list1.zip(arr1))
  }
}
