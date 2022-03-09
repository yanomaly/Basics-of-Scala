package SmallTasks

object Duplicate extends App{
  def duplicate[T](someList: List[T], nDups: Int): List[T] = {
    someList.flatMap(x => dup(x, nDups))
  }

  def dup[T](elem: T, nDups: Int): List[T] = {
    var res: List[T] = Nil
    def go(nDups: Int, res: List[T]): List[T] = {
      if (nDups == 0) res
      else go(nDups - 1, elem :: res)
    }
    go(nDups, res)
  }

  print(duplicate(List("a", "b", "c"), 1))
}
