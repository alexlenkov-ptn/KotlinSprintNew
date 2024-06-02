package lesson14_task1

class Icebraker (
    // Поля по умолчанию
    name: String = "Icebreaker",
    speed: Int = 3,
    passengerCapacity: Int = 10,
    areBreakIce: Boolean = true,
) : Liner(name = name,
    speed = speed,
    passengerCapacity = passengerCapacity,
    areBreakIce = areBreakIce,) {

}