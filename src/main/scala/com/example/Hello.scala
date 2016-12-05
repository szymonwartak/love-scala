package com.example

// SETUP
// download activator (https://www.lightbend.com/activator/download)
// setup intellij shortcuts for Scala Console (command-shift-d)
// - select line at caret (command-\)
// - send selection to console (command-enter)

object Hello {
  def main(args: Array[String]): Unit = {

    // basic
    val value = 1 + 3
    println(s"Hello, world! $value")

    // maps
    val m1 = Map("asdf" -> 1, "qwer" -> 2)
    val m2 = Map(("asdf", 1), ("qwer", 2))

    // syntactic sugar & collections
    m1.foreach(kv => println(kv))
    m1.foreach(println)
    m1 foreach println

    List(1,2,3).map(n => n + 1) // immutable! returns new collection
    List(1,2,3).map(_ + 1)

    // strings
    "1234".map(_.toInt + 1)

    // equality
    "1" == "1"
    List(1,2,3) == List(1,2,3) // only for collections in same category: Set(1) != List(1); List(1) == Vector(1)

    // more collections
    List(1,2,3).filter(_ % 2)
    List(1,2,3).groupBy(_ % 2)
    List(1,2,3).head // .tail .last .take(2)

    // folds
    List(1,2,3).reduce(_ + _) // .sum .min
    List(1,2,3).sortBy(-_)

    // Option, PM, flatMap
    "asdf" match {
      case s: String if s.startsWith("a") => Some(s)
      case _ => None
    }
    List(1,2,3).flatMap(n => if (n > 2) Some(n) else None)


    // more reading: http://docs.scala-lang.org/overviews/

  }
}
