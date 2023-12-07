package syntax.traits

object mainTraits {

  def main(args: Array[String]): Unit = {

    val iterator = new IntIterator(10)

    iterator.next() // returns 0
    iterator.next() // returns 1

    println(iterator.next())
  }

}
