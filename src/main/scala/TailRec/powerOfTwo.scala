package TailRec

object powerOfTwo extends App {
  def powerOfTwo(deg: Int = 1) = {
    def calculate(two: BigInt, count: Int): BigInt = {
      if (count == 1) two
      else calculate(two * 2, count - 1)
    }

    calculate(2, deg)
  }

  print(powerOfTwo(5))
}
