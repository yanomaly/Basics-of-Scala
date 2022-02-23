package Tree

class Node(var value: Int = 0, var leftChild: Node = null, var rightChild: Node = null, var height: Int = -1)

class Tree(var root: Node) {

  def add(node: Node, value: Int): Boolean =
    if(node.leftChild != null && node.rightChild != null)
      if(node.value > value)
        add(node.leftChild, value)
        true
      else
        add(node.rightChild, value)
        true

    else if(node.leftChild == null && node.rightChild == null)
      if(node.value > value)
        node.leftChild = new Node(value)
        true
      else
        node.rightChild = new Node(value)

    else if(node.leftChild == null && node.rightChild != null)
      if(node.value > value)
        node.leftChild = new Node(value)
        true
      else
        add(node.rightChild, value)

    else if(node.leftChild != null && node.rightChild == null)
      if(node.value < value)
        node.rightChild = new Node(value)
        true
      else
        add(node.leftChild, value)

    false

  def straight(node: Node): Boolean =
    if(node != null)
      println(node.value)
      straight(node.leftChild)
      straight(node.rightChild)
    true
  def reverce(node: Node): Boolean =
    if(node != null)
      reverce(node.leftChild)
      reverce(node.rightChild)
      println(node.value)
    true
  def inner(node: Node): Boolean =
    if(node != null)
      inner(node.leftChild)
      println(node.value)
      inner(node.rightChild)
    true

}
