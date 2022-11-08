package teaching



class Animal {

  def introduceYourself(animal: Animal): String = {
    animal match {
      case Dog(name, breed, age) => s"Woof! My name is $name, I'm a $age year old $breed"
      case Cat(name, activity, colour) => s"Meow, My name is $name and I'm a $colour cat & my favourite activity is $activity"
      case _ => "I'm an unknown animal"
    }
  }


  case class Dog(name: String, breed: String, age: Int) extends Animal

  case class Cat(name: String, activity: String, colour: String) extends Animal



}
//val animal = new Animal
//val doggo= animal.Dog("Baxter", "Cockapoo", 5)
//animal.introduceYourself(doggo)




