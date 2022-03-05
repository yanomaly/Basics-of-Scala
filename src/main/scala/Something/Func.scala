package Something

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
