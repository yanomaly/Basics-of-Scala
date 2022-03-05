package Button

class Button(val label: String) {
  def click(): String = s"button -${this.label}- has been clicked"
  def this() = this("test")
}
