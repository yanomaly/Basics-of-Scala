package ContactList
import scala.io.StdIn.*
import scala.util.Random
import scala.language.postfixOps

object Runner extends App {
//  var list: List[Int] = List.fill(Random.nextInt(100))(Random.nextInt(200))
//  list.sorted
//  list.foreach(x => print(s"$x "))
//  println()
//  val col: PartialFunction[Int, Int] =
//    case x if (x < 100 && x % 4 == 0) => x/4
//  val res = list.collect(col).tail
//  res.foreach(x => print(s"$x "))

  val input = " aboba   o   aoaoa "
  val arra = input.split("[ ]+")
  var out = ""
  for(i <- arra.length - 1 to 0 by -1)
    out += arra(i) + " "
  print(out.trim)
}
