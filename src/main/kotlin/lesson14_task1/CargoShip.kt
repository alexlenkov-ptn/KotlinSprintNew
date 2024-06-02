package lesson14_task1

class CargoShip(
    name: String = "Cargo Ship",
    speed: Int = 30,
    loadCapacity: Int = 40,
) : Liner(name = name,
    speed = speed,
    loadCapacity = loadCapacity,) {

}