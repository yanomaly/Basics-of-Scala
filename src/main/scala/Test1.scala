import scala.Array.{ofDim, range}

object Test1 extends App{
  //////////////////////////////////////////////////////////////////////////////////
//  val mul = (_:Int)*(_:Int)
//  print(mul(2, 5))
//
//  var myMatrix = ofDim[Int](3,3)
//  val array = range(10, 20, 2)
//
//  array.foreach(println(_))
//  for(i <- 0 until 3; j <- 0 until 3)
//    myMatrix(i)(j) = i*j
//
//  println()
//  for(i <- 0 until 3) {
//    for( j <- 0 until 3){
//      print(myMatrix(i)(j) + " ")
//    }
//    println()
//  }
//
//  def someFunc: Int => Function1[Int, Int] = new Function1[Int, Function1[Int, Int]] {
//    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
//      override def apply(y: Int): Int = x + y
//    }
//  }
//
//  val res = someFunc(1)
//  print(res)
//  //////////////////////////////////////////////////////////////////////////////////
//  val progLanguages = List("java", "scala", "python")
//  val lngAbbrev = List("JA", "SCA", "PY")
//
//  println(lngAbbrev.flatMap(abr => progLanguages.filter(pr => pr.startsWith(abr.toLowerCase())).map(pr => (abr, pr))))
//
//  val sampleTuple = new Tuple2(2, "Hello, World")
//  println(sampleTuple.copy(_2 = "Scala").swap._1 + 5)
  //////////////////////////////////////////////////////////////////////////////////
//  val nums1 = List(1, 2, 3)
//  val nums2 = List(4, 6, 7)
//  val nums3 = List(10, 100, 1000)
//
//  println(for {
//    a <- nums1
//    b <- nums2 if b % 2 == 1
//    c <- nums3
//  } yield (a + b) * c)
//
//  println(nums1.flatMap(a => nums2.filter(_ % 2 == 1).flatMap(b => nums3.map(c => (a + b) * c))))
//
//  println(nums1.flatMap(a => nums2.flatMap(b => nums3.filter(_ % 2 == 1).map(c => (a + b) * c))))
//
//  println(for {
//    a <- nums1
//    b <- nums2
//    c <- nums3
//  } yield (a + b) * c)
//
//  println(nums1.flatMap(a => nums2.filter(_ % 2 == 1).flatMap(b => nums3.map(c => a + b * c))))
  //////////////////////////////////////////////////////////////////////////////////
//  def unsafeMethod(): String = "Amogus"
//
//  def maybeSafeMethod(): String = "Aboba"
//
//  val chainedResult = Option(unsafeMethod()).orElse(Option(maybeSafeMethod()))
//  println(chainedResult)
//
//  val el = List()
//  val a = el match{
//    case List(_, _*) => "Aboba"
//    case _ => "ne aboba"
//  }
//
//  print(a)
  //////////////////////////////////////////////////////////////////////////////////
//  def guard(data: Any, maxLength: Int): String ={
//    val res = data match{
//      case list: List[Any] => if(list.length <= maxLength) "Задан список List допустимой длины" else "Длина списка больше максимально допустимого значения"
//      case str: String => if(str.length <= maxLength) "Длина строки не превышает максимально допустимого значения" else "Получена строка недопустимой длины"
//      case _ => "Что это? Это не строка и не список"
//    }
//    res
//  }
  //////////////////////////////////////////////////////////////////////////////////
//  val nameSurname = scala.io.StdIn.readLine()
//  if(nameSurname != null && nameSurname.nonEmpty)
//    print(nameSurname.split(" ")(0).charAt(0) + ". " + nameSurname.split(" ")(1).charAt(0) +".")
  //////////////////////////////////////////////////////////////////////////////////
//    val msg: PartialFunction[String, String] = {
//      case "hello" => "Hi, I'm Bot"
//      case "bye" => "Bye-bye"
//      case "what's up" => "sup-sup"
//    }
//    val chatbot = msg.lift
//
//  scala.io.Source.stdin.getLines().map(chatbot).foreach(println)
  //////////////////////////////////////////////////////////////////////////////////
//  def compare(v1: String, v2: String): Int = {
//    var res = 0
//    val v1s = v1.split(".").map(delZero)
//    val v2s = v2.split(".").map(delZero)
//    if(v1s.length > v2s.length) {
//      for(i <- v2s)
//        if()
//    }
//    else if(v1s.length < v2s.length){
//      for(i <- v1s)
//        if()
//    }
//
//  }

  def delZero(str: String): String ={
    def go(str: String): String ={
      if(!str.startsWith("0") || str.length == 1) str
      else go(str.substring(1))
    }
    go(str)
  }
}


