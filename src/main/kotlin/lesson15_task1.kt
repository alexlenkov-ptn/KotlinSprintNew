fun main() {
    val seagull = Seagull()
    seagull.showName()
    seagull.move()

    val duck = Duck()
    duck.showName()
    duck.move()

    val carp = Carp()
    carp.showName()
    carp.move()
}

interface Flying {
    fun move() {
        println(" летит")
    }
}

abstract class Bird(
    val name: String,
) : Flying {
    fun showName() {
        print(name)
    }
}
class Seagull(
    name: String = "Чайка"
) : Bird(name)

class Duck (
    name: String = "Утка"
) : Bird(name)

interface Swimming {
    fun move() {
        print(" плывет")
    }
}

class Carp(
    val name: String = "Карась"
) : Swimming {
    fun showName() {
        print(name)
    }
}