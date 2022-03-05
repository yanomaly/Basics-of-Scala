package TailRec

object RecNumber extends App {
  def number(x: Int, y: Int, n: Int): Int = {
    def rec(x: Int, y: Int, n: Int): Int = {
      if (n == 0) x
      else rec(x + y, y, n - 1)
    }

    def prnt(x: Int, xCopy: Int): Int = {
      if (xCopy == 0) return x
      else print(x + " ");
      prnt(x, xCopy / 10)
    }

    prnt(rec(x, y, n), rec(x, y, n))
  }

  number(2, 2, 1)
  print("is the result")
}
