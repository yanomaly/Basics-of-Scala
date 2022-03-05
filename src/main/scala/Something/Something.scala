package Something

object Something extends App {
  val contacts1: Func = new Func
  for (i <- 0 until 2)
    println("Input contact: ")
    contacts1.setContact(scala.io.StdIn.readLine())
  println(contacts1.getContact("123"))
  println()
  contacts1.show(contacts1.sort(2))
  println()
  contacts1.show(contacts1.sort(1))
}
