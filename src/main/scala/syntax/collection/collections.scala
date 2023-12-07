package syntax.collection

import collection.mutable._
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
  }

}
