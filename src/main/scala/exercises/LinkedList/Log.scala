package exercises.LinkedList

class Log (head: String, tail: LogList) extends LogList{
  def last(): String = head
  def previous(): LogList = tail
  def isEmpty(): Boolean = if(head == null) true else false
  def all(): String = {
    def go(log: LogList, acc: String): String = {
      if(log.isEmpty()) acc
      else go(log.previous(), acc + log.last() + " ")
    }
    go(this, "")
  }
  def add(msg: String): LogList = new Log(msg, this)
}
