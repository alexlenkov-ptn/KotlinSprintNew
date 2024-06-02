package lesson14_task1

open class Liner(
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
}