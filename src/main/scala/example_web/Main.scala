package example_web

import org.eclipse.jetty.server.Server

object Main extends App {


  Console.println("Hello World: " + (args mkString ", "))

  val server = new Server(8080)

  server.start()
  server.join()

}
