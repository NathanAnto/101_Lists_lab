
object Main extends App {
  var flightList:LinkedList = new LinkedList()
  println(flightList)
  flightList.addToStart("Rome")
  println(flightList)
  flightList.addToStart("Paris")
  println(flightList)
  flightList.addToStart("Tokyo")
  println(flightList)
  flightList.addToStart("Beijing")
  println(flightList)
  println(s"Last element: ${flightList.getLastElement.item}")
  flightList.removeFirstElement()
  println(flightList)
  flightList.addToEnd("Geneva")
  println(flightList)
  flightList.isPresent("Rome")
  flightList.isPresent("Niger")

  println(flightList.findElement("Paris").item)

  println(flightList)
  flightList.swapElements("Geneva", "Paris")
  println(flightList)

  flightList.removeLastElement()

  flightList.removeElement("Geneva")
  println(flightList)

  flightList.insertAfter("Tokyo", "Cape Town")
  println(flightList)
}
