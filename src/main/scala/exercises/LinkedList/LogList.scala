package exercises.LinkedList

abstract class LogList {
  def last(): String
  def previous(): LogList
  def isEmpty(): Boolean
  def all(): String
  def add(msg: String): LogList
}
