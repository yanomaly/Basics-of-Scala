package SmallTasks

class mid {
  def middle[A](data: Iterable[A])=
      if(data.size == 2)
        data.tail
      else if(data.size == 1)
        data.last
      else
      data.slice(data.size/2, data.size/2 + 2).head
}
