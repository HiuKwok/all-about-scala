package example_random_generator

object GeneratorMain extends App {

  val rand = new scala.util.Random

  println("Hello: " + rand.nextInt())

}
