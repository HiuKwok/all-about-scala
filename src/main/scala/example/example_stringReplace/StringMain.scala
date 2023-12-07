package example.example_stringReplace

object StringMain {
  def main(args: Array[String]) = {

    val name = "Andy"
    val h = "Hello $name"
    val count = 1

    // Won't work.
    println(h)
    // But this work.
    println(s"Hello $name")
    // Can also do arithmetic
    println(s"1 + 1: ${count + 1}")

  }
}
