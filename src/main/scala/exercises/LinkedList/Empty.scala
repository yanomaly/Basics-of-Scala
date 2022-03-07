package exercises.LinkedList

object Empty extends LogList{
  def last(): String = throw new NoSuchElementException
  def previous(): LogList = throw new NoSuchElementException
  def isEmpty(): Boolean = true
  def all(): String = ""
  def add(msg: String): LogList = new Log(msg, Empty)
}
