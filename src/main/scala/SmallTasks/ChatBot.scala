package SmallTasks

object ChatBot extends App {
  val msg: PartialFunction[String, String] = {
    case "hello" => "Hi, I'm Bot"
    case "bye" => "Bye-bye"
    case "what's up" => "sup-sup"
  }
  val chatbot = msg.lift

  scala.io.Source.stdin.getLines().map(chatbot).foreach(println)
}
