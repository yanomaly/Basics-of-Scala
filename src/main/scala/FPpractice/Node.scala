package FPpractice

case class Node[+T](
  override val value: T,
  override val leftChild: BinaryTree[T],
  override val rightChild: BinaryTree[T])
  extends BinaryTree[T] {

  override def isEmpty: Boolean = false
  override def isLeaf: Boolean = rightChild.isEmpty && leftChild.isEmpty

  override def collectLeaves: List[BinaryTree[T]] = {
    var res: List[BinaryTree[T]] = List()
    def go(node: BinaryTree[T]): Unit ={
      if(node.isLeaf) res
      else go(node.leftChild); go(node.rightChild);
    }
    res
  }
}