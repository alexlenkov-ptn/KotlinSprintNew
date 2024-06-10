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

interface Search {
    fun searchAccessory() {
    }
}

class Instrument(val name: String,
                 val count: Int) : Search {
    override fun searchAccessory() {
        println("Выполняется поиск для инструмента $name...")
    }
}

class Accessory(val name: String,
                val count: Int) {
    fun printInfo() = println("$name: $count шт.")
}


