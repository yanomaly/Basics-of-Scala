package Button

class RoundedButton(override val label: String) extends Button {
  override def click(): String = s"rounded button -${this.label}- has been clicked"
}
