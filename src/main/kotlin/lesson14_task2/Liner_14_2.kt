package lesson14_task2

open class Liner_14_2(
    // Поля по умолчанию
    var name: String = "Liner",
    var speed: Int = 10,
    var loadCapacity: Int = 20,
    var passengerCapacity: Int = 50,
    var areBreakIce: Boolean = false,
) {
    // speed
    // loadCapacity - грузоподъёмность
    // passengerCapacity - вместительность пассажиров
    // areBreakIce - ломают лёд (true / false)
    open fun loadCargo() {
        println("Горизонтальный трап со шкафута выдвинут")
    }

    fun printShipInfo() {
        println("""
            Данные корабля: ${name}
            Скорость: ${speed}
            Вместимость: ${loadCapacity}
            Грузоподъёмность: ${loadCapacity}
            Вместимость пассажиров: ${passengerCapacity}
            Возможность ломать лёд: ${areBreakIce}
        """.trimIndent())
    }
}