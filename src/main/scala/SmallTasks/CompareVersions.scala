package SmallTasks

object CompareVersions extends App{
  def compare(v1: String, v2: String): Int = {
    var res = 0
    val v1s = v1.split("\\.").map(delZero)
    val v2s = v2.split("\\.").map(delZero)
    if (v1s.length > v2s.length) {
      for (i <- v2s.length - 1 to 0 by -1)
        if (v2s(i) > v1s(i))
          res = -1
        else if (v2s(i) < v1s(i))
          res = 1
      if (res != 0)
        res
      else
        for (i <- v2s.length to v1s.length - 1)
          if (v1s(i) != 0)
            res = 1
    }
    if (v1s.length < v2s.length) {
      for (i <- v1s.length - 1 to 0 by -1)
        if (v2s(i) > v1s(i))
          res = -1
        else if (v2s(i) < v1s(i))
          res = 1
      if (res != 0)
        res
      else
        for (i <- v1s.length to v2s.length - 1)
          if (v2s(i) != 0)
            res = -1
    }

    if (v1s.length == v2s.length) {
      for (i <- v2s.length - 1 to 0 by -1)
        if (v2s(i) > v1s(i))
          res = -1
        else if (v2s(i) < v1s(i))
          res = 1
    }
    res
  }

  def delZero(str: String): Int ={
    def go(str: String): Int ={
      if(!str.startsWith("0") || str.length == 1) str.toInt
      else go(str.substring(1))
    }
    go(str)
  }

  print(compare("1.0.0.00.0.01", "1.000"))
}
