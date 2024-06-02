package lesson14_task1

class Icebraker (
    name: String = "Icebreaker",
    speed: Int = 25,
    passengerCapacity: Int = 25,
    areBreakIce: Boolean = true,
) : Liner(name = name,
    speed = speed,
    passengerCapacity = passengerCapacity,
    areBreakIce = areBreakIce,) {

}