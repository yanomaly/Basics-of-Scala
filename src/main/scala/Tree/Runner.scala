package Tree

object Runner extends App {
  var tree: Tree = new Tree(new Node())
  var values = scala.collection.mutable.ListBuffer[Int]()
  scala.io.StdIn.readLine().split(" ").toStream.foreach(x => values.+=(x.toInt))
  tree.root = new Node(values(0))
  for(i <- 1 until values.size)
    tree.add(tree.root, values(i))
  tree.reverce(tree.root, x =>
    if(x.rightChild == null && x.leftChild == null) x.height = 0
    else if(x.rightChild != null && x.leftChild == null) x.height = x.rightChild.height + 1
    else if(x.rightChild == null && x.leftChild != null) x.height = x.leftChild.height + 1
    else if(x.rightChild != null && x.leftChild != null) x.height = if(x.leftChild.height >= x.rightChild.height) x.leftChild.height else x.rightChild.height
  )
  println()
  tree.straight(tree.root, x => println(x.height))
  tree.root = tree.delete(tree.root, 4)
  println()
  tree.straight(tree.root, x => println(x.value))
}
