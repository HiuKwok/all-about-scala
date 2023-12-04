package example_random_generator

import scala.util.Random

object GeneratorMain extends App {

  val rand = new Random

  println("Hello: " + rand.nextInt())

}
