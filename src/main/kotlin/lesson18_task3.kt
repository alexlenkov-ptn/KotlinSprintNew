fun main() {
    val fox = Fox("fox")
    val dog = Dog("dog")
    val cat = Cat("cat")
    val listOfAnimals: List<Animal> = listOf(fox, dog, cat)
    listOfAnimals.map {
        it.eat()
    }
}

abstract class Animal(
    val name: String,
    val food: String
) {
    abstract fun sleep()
    abstract fun eat()
}

class Fox(
    name: String,
    food: String = "ягоды"
) : Animal(name, food) {
    override fun eat() {
        println("$name ест $food")
    }

    override fun sleep() {
        println("$name спит")
    }
}

class Dog(
    name: String,
    food: String = "кости"
) : Animal(name, food) {
    override fun eat() {
        println("$name ест $food")
    }

    override fun sleep() {
        println("$name спит")
    }
}

class Cat(
    name: String,
    food: String = "рыб"
) : Animal(name, food) {
    override fun eat() {
        println("$name ест $food")
    }

    override fun sleep() {
        println("$name спит")
    }
}