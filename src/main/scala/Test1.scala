import scala.Array.{ofDim, range}

object Test1 extends App{
  val mul = (_:Int)*(_:Int)
  print(mul(2, 5))

  var myMatrix = ofDim[Int](3,3)
  val array = range(10, 20, 2)

  array.foreach(println(_))
  for(i <- 0 until 3; j <- 0 until 3)
    myMatrix(i)(j) = i*j

  println()
  for(i <- 0 until 3) {

    for( j <- 0 until 3){
      print(myMatrix(i)(j) + " ")

    }
    println()
  }
}
