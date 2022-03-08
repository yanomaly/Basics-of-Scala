package SmallTasks

object Optn extends App{
  def unsafeMethod(): String = "Amogus"
  def maybeSafeMethod(): String = "Aboba"

  val chainedResult = Option(unsafeMethod()).orElse(Option(maybeSafeMethod()))
  println(chainedResult)

  val el = List()
  val a = el match{
    case List(_, _*) => "Aboba"
    case _ => "ne aboba"
  }

  print(a)
}


