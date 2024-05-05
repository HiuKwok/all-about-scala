package syntax.collection

import collection.mutable._
import scala.collection.JavaConverters
import scala.concurrent.JavaConversions
import scala.jdk.CollectionConverters
import scala.jdk.CollectionConverters._

/**
 * https://docs.scala-lang.org/overviews/collections-2.13/conversions-between-java-and-scala-collections.html
 *
 * Bidirectional:
 * Iterator               <=>     java.util.Iterator
 * Iterator               <=>     java.util.Enumeration
 * Iterable               <=>     java.lang.Iterable
 * Iterable               <=>     java.util.Collection
 * mutable.Buffer         <=>     java.util.List
 * mutable.Set            <=>     java.util.Set
 * mutable.Map            <=>     java.util.Map
 * mutable.ConcurrentMap  <=>     java.util.concurrent.ConcurrentMap
 *
 * Scala -> Java (Oneway):
 *
 * Seq           =>    java.util.List
 * mutable.Seq   =>    java.util.List
 * Set           =>    java.util.Set
 * Map           =>    java.util.Map
 *
 */
object collections {

  def main(args: Array[String]): Unit = {

    // mutable.Buffer         <=>     java.util.List
    val jul: java.util.List[Int] = ArrayBuffer(1, 2, 3).asJava
    // Seq           =>    java.util.List
    val buf: Seq[Int] = jul.asScala
    // mutable.Map            <=>     java.util.Map
    val m: java.util.Map[String, Int] = HashMap("abc" -> 1, "hello" -> 2).asJava

    // Java -> Scala
    val javaList: java.util.List[String] = new java.util.ArrayList[String]()
    javaList.add("Java")
    javaList.add("Scala")

    val scalaList: List[String] = javaList.asScala.toList
    println(scalaList) // Output: List(Java, Scala)

    val javaSet: java.util.Set[String] = new java.util.HashSet[String]()
    javaSet.add("Java")
    javaSet.add("Scala")

    val scalaSet: Predef.Set[String] = javaSet.asScala.toSet
    println(scalaSet) // Output: Set(Java, Scala)

    val javaMap: java.util.Map[String, Int] = new java.util.HashMap[String, Int]()
    javaMap.put("one", 1)
    javaMap.put("two", 2)

    val scalaMap: Predef.Map[String, Int] = javaMap.asScala.toMap
    println(scalaMap) // Output: Map(one -> 1, two -> 2)


    // Scala to Java
    val scalaListNew: List[String] = List("Scala", "Java")

    ;
    val javaListNew: java.util.List[String] = scalaListNew.asJava
    println(javaListNew) // Output: [Scala, Java]


    val scalaSetNew: Set[String] = Set("Scala", "Java")

    val javaSetNew: java.util.Set[String] = scalaSetNew.asJava
    println(javaSetNew) // Output: [Scala, Java]

    val scalaMapNew: Map[String, Int] = Map("one" -> 1, "two" -> 2)

    val javaMapNew: java.util.Map[String, Int] = scalaMapNew.asJava
    println(javaMapNew) // Output: {one=1, two=2}


  }

}
