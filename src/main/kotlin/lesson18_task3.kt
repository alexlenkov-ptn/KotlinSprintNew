fun main() {
    val fox = Fox("fox")
    val dog = Dog("dog")
    val cat = Cat("cat")
    val listOfAnimals: List<Animal> = listOf(fox, dog, cat)
    listOfAnimals.map {
        it.eat()
    }
}

abstract class Animal(name: String) {
    val name = name
    open var food: String = ""
    open fun sleep() {}
    open fun eat() {}
}

class Fox(name: String) : Animal(name) {
    override var food = "ягоды"
    override fun eat() {
        println("$name ест $food")
    }

    override fun sleep() {
        println("$name спит")
    }
}

class Dog(name: String) : Animal(name) {
    override var food = "кости"
    override fun eat() {
        println("$name ест $food")
    }

    override fun sleep() {
        println("$name спит")
    }
}

class Cat(name: String) : Animal(name) {
    override var food = "рыб"
    override fun eat() {
        println("$name ест $food")
    }

    override fun sleep() {
        println("$name спит")
    }
}