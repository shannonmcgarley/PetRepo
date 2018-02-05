package repositories

import models.Pet

class PetRepo {

  def all() : List[Pet] = Nil
  def findByName (name : String) : Option[Pet] = None
  def dogs() : List[Pet] = Nil
  def cats() : List[Pet] = Nil
  def other() : List[Pet] = Nil
  def add(pet : Pet*) : List[Pet] = ???
  def removeByName (name : String) : List[Pet] = ???
  def update (pet : Pet) : List[Pet] = ???

}
