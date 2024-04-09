package tache2

object Main extends App {
  val names: List[String] = List("Nathan", "Paul", "Jeremy", "Mamadou")
  println(names.mkString(","))
  if(names.contains("Paul"))
    println("List contains Paul")

  val newNames: List[String] = names.filter(s => s != "Paul")

  println(newNames.mkString(","))
}
