package FPpractice

abstract class BinaryTree[+T] {
  def value: T
  def leftChild: BinaryTree[T]
  def rightChild: BinaryTree[T]

  def isEmpty:  Boolean
  def isLeaf: Boolean

  def collectLeaves: List[BinaryTree[T]]
}
