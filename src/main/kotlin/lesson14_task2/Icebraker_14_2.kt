package lesson14_task2

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