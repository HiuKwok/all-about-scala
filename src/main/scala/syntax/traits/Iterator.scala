package syntax.traits

// Trait
trait Iterator[A] {
  def hasNext: Boolean

  def next(): A
}

// Impl
class IntIterator(to: Int) extends Iterator[Int] {

  // Unlike Java interface, Trait about to have its own impl and state.
  private var current = 0

  override def hasNext: Boolean = current < to

  override def next(): Int = {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}
