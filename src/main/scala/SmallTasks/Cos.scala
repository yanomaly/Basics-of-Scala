package SmallTasks

object Cos extends App {
  print("Input argiment (in rad.) near zero: ")
  val x = scala.io.StdIn.readDouble() % (2 * Math.PI)
  print("Input scale (numbers afler dot): ")
  val digits = scala.io.StdIn.readInt()
  val scale = Math.pow(10, -digits)
  val out = "%." + digits + "f"

  var counter = 1
  var counter2 = 1
  var cos1 = 1.0
  var cos2 = 1.0
  var sc = 1.0

  val factor: Int => Int = (x: Int) =>
    if (x == 0) 1
    else x * factor(x - 1)

  while (Math.abs(sc) > scale)
    sc *= Math.pow(x, 2) / (counter * (counter + 1))
    cos1 += sc * Math.pow(-1, counter2)
    counter += 2
    counter2 += 1

  counter = 2
  counter2 = 1
  sc = 1.0

  while (Math.abs(sc) > scale)
    sc = Math.pow(x, counter) * Math.pow(-1, counter2) / factor(counter)
    cos2 += sc
    counter += 2
    counter2 += 1

  printf(out, cos1)
  println()
  printf(out, cos2)
  println()
  printf(out, Math.cos(x))
}
