
class LinkedList {
  var head: Node = _
  def addToStart(element: String): Unit = {
    head = new Node(element, head)
  }

  def insertAfter(before: String, after: String): Unit = {
    val n = findElement(before)
    if(n != null)
      n.next = new Node(after, n.next)
  }

  def addToEnd(element: String): Unit = {
    if (getSize() > 0)
      getLastElement().next = new Node(element, null)
    else
      addToStart(element)
  }

  def removeFirstElement(): Unit = {
    if(head != null)
      head = head.next
  }

  def removeLastElement(): Unit = {
    if(getSize() <= 1) removeFirstElement()
    else if(getSize() == 2) head.next = null
    else {
      var last: Node = head

      while (last.next.next != null)
        last = last.next

//      println(s"Removing last element: ${last.next.item}")
      last.next = null
    }
  }

  def removeElement(e: String): Unit = {
    if(getSize() <= 1) {
      removeFirstElement()
      return
    }

    val element = findElement(e)
    if(element != null) {
      var prev: Node = head
      val r: Node = element

      if(prev == r) {
        head = head.next
        return
      }

      while(r != null) {
        val after: Node = r.next
        if(prev.next == r) {
          prev.next = after
          return
        }
        prev = prev.next
      }
    }
  }

  def swapElements(e1: String, e2: String): Unit = {
    val n1 = findElement(e1)
    val n2 = findElement(e2)

    if(n1 != null && n2 != null) {
      n1.item = e2
      n2.item = e1
    }
  }

  def getLastElement(): Node =  {
    var last: Node = head
    for(i <- 1 until getSize) last = last.next

    last
  }

  def getSize(): Int = {
    var count: Int = 0
    var current: Node = head
    while (current != null) {
      count += 1
      current = current.next
    }

    count
  }

  def findElement(s: String): Node = {
    var last: Node = head
    while (last != null) {
      if(last.item == s) return last
      last = last.next
    }

    null
  }

  def isPresent(e: String): Boolean = {
    var present: Boolean = false

    var last: Node = head
    while (last != null) {
      if(last.item == e) present = true
      last = last.next
    }
//    println(s"Is $e present ? $present")
    present
  }

  override def toString: String = {
    var s: String = s"List content (size ${getSize()}) : "
    var current: Node = head

    while (current != null) {
      s += s"${current.item} -> "
      current = current.next
    }

    s += "null"
    s
  }
}
