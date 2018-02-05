package models

trait Pet {
  val name: String
}

trait Walking {
  def walk: String
}

trait DogWalking extends Walking {
  override def walk = "waddle"
}

trait CatWalking extends Walking {
  override def walk: String = "wiggle"
}

class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet