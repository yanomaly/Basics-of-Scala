package SmallTasks

object CountingChars extends App {
  def countChars(someString: String): Map[Char, Int] = {
    mk(someString.toLowerCase.toCharArray.sorted)
  }

  def mk(arr: Array[Char]): Map[Char, Int] = {
    def go(arr: Array[Char], map: Map[Char, Int]): Map[Char, Int] = {
      if (arr.isEmpty) map
      else {
        val chr = arr(0)
        val next = arr.filter(!chr.equals(_))
        val count = arr.length - next.length
        val nextMap = map + (chr -> count)
        go(next, nextMap)
      }
    }
    go(arr, Map())
  }

  print(countChars("someString").toList.sorted((x: (Char, Int), y: (Char, Int)) => x._2.compareTo(y._2)))
}
