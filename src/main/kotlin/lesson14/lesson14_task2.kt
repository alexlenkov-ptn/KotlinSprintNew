package lesson14

fun main() {
    val liner: Liner_14_2 = Liner_14_2()
    val cargoShip: CargoShip_14_2 = CargoShip_14_2()
    val icebreaker: Icebraker_14_2 = Icebraker_14_2()

    liner.printShipInfo()
    println()
    cargoShip.printShipInfo()
    println()
    icebreaker.printShipInfo()
    println()
    liner.loadCargo()
    println()
    cargoShip.loadCargo()
    println()
    icebreaker.loadCargo()
}

open class Liner_14_2(
    var name: String = "Liner",
    var speed: Int = 10,
    var loadCapacity: Int = 20,
    var passengerCapacity: Int = 50,
    var areBreakIce: Boolean = false,
) {
    open fun loadCargo() {
        println("Горизонтальный трап со шкафута выдвинут")
    }

    fun printShipInfo() {
        println(
            """
            Данные корабля: ${name}
            Скорость: ${speed}
            Вместимость: ${loadCapacity}
            Грузоподъёмность: ${loadCapacity}
            Вместимость пассажиров: ${passengerCapacity}
            Возможность ломать лёд: ${areBreakIce}
        """.trimIndent()
        )
    }
}

class CargoShip_14_2(
    name: String = "Cargo Ship",
    speed: Int = 5,
    loadCapacity: Int = 40,
) : Liner_14_2(
    name = name,
    speed = speed,
    loadCapacity = loadCapacity,
) {

    override fun loadCargo() {
        println("Погрузочный кран активирован")
    }
}

class Icebraker_14_2(
    // Поля по умолчанию
    name: String = "Icebreaker",
    speed: Int = 3,
    passengerCapacity: Int = 10,
    areBreakIce: Boolean = true,
) : Liner_14_2(
    name = name,
    speed = speed,
    passengerCapacity = passengerCapacity,
    areBreakIce = areBreakIce,
) {

    override fun loadCargo() {
        println("Кормовые ворота открыты")
    }
}