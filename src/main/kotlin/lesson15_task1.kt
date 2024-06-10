fun main() {
    val seagull = Seagull()
    seagull.printName()
    seagull.moveFlying()

    val duck = Duck()
    duck.printName()
    duck.moveFlying()
    duck.printName()
    duck.moveSwimming()

    val carp = Carp()
    carp.printName()
    carp.moveSwimming()
}

interface Flying {
    fun moveFlying() {
        println(" летит")
    }
}

interface Swimming {
    fun moveSwimming() {
        println(" плывет")
    }
}

class Seagull(
    _name: String = "Чайка"
) : Flying {
    val name = _name
    fun printName() {
        print(name)
    }
}

class Duck(
    _name: String = "Утка"
) : Flying, Swimming {
    val name = _name
    fun printName() = print(name)
}

class Carp(
    val _name: String = "Карась",
) : Swimming {
    val name = _name
    fun printName() {
        print(name)
    }
}