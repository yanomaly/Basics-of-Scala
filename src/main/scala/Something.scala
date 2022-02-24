import scala.language.postfixOps

class Func{
  private val contacts: List[String] = Nil

  def setContact(contact: String): List[String] =
    contacts :+ contact

  def getContact(part: String): List[String]=
    contacts.filter(x => x.matches(part))

  def sort(order: Int): List[String]=
    if(order == 1) contacts.sortWith((x, y) => x.compare(y) > 0)
    else contacts.sortWith((x, y) => x.length.compare(y.length) < 0)

  def show(show: List[String]): Unit=
    show.foreach(x => println(x))

  override def toString: String =
    var result: String = ""
    contacts.foreach(x => result += x)
    result
}

object Something extends App {
  val contacts1: Func = new Func
  for(i <- 0 until 2)
    println("Input contact: ")
    contacts1.setContact(scala.io.StdIn.readLine())
  println(contacts1.getContact("123"))
  println()
  contacts1.show(contacts1.sort(2))
  println()
  contacts1.show(contacts1.sort(1))
}
