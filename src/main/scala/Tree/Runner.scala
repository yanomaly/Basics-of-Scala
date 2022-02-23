package Tree

object Runner extends App {
  var tree: Tree = new Tree(new Node())
  var values = scala.collection.mutable.ListBuffer[Int]()
  scala.io.StdIn.readLine().split(" ").toStream.foreach(x => values.+=(x.toInt))
  tree.root = new Node(values(0))
  for(i <- 1 until values.size)
    tree.add(tree.root, values(i))
  tree.straight(tree.root)
}
