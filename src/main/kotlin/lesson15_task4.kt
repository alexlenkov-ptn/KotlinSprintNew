fun main() {
    val guitar = Instrument("Guitar", 5)
    val drum = Instrument("Drum", 10)
    val drumStick = Accessory("Drum Stick", 51)
    val guitarStrings = Accessory("Guitar Strings", 10)

    guitar.searchAccessory()
    guitarStrings.printInfo()

    drum.searchAccessory()
    drumStick.printInfo()

}

interface Searching {
    fun searchAccessory()
}

abstract class Goods (val name: String, val count: Int)

class Instrument(name: String,
                 count: Int) : Goods(name, count), Searching {
    override fun searchAccessory() {
        println("Выполняется поиск для инструмента $name...")
    }
}

class Accessory(name: String,
                count: Int) : Goods(name, count) {
    fun printInfo() = println("$name: $count шт.")
}