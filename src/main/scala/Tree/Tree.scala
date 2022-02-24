package Tree

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

  def straight(node: Node, action: Function1[Node, Unit]): Unit =
    if(node != null)
      action(node)
      straight(node.leftChild, action)
      straight(node.rightChild, action)
  def reverce(node: Node, action: Function1[Node, Unit]): Unit =
    if(node != null)
      reverce(node.leftChild, action)
      reverce(node.rightChild, action)
      action(node)
  def inner(node: Node, action: Function1[Node, Unit]): Unit =
    if(node != null)
      inner(node.leftChild, action)
      action(node)
      inner(node.rightChild, action)

  def findMin(node: Node): Node =
    if(node.leftChild != null)
      findMin(node.leftChild)
    else
      return node
  def findMax(node: Node): Node =
    if(node.rightChild != null)
      findMax(node.rightChild)
    else
      return node
  def find(node: Node, key: Int): Boolean =
    if(node.value == key) true
    else if(node.value > key) find(node.leftChild, key)
    else if(node.value < key) find(node.rightChild, key)
    false

  def delete(node: Node, key: Int): Node =
    if(node == null)
      null
    if(node.value > key)
      node.leftChild = delete(node.leftChild, key)
      node.leftChild
    else if(node.value < key)
      node.rightChild = delete(node.rightChild, key)
      node.rightChild
    if (node.leftChild == null)
      node.rightChild
    else if (node.rightChild == null)
      node.leftChild
    else
      var min = findMin(node).value
      node.value = min
      node.rightChild = delete(node.rightChild, min)
      node
}
