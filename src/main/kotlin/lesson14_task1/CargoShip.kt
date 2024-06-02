package lesson14_task1

class CargoShip(
    // Поля по умолчанию
    name: String = "Cargo Ship",
    speed: Int = 5,
    loadCapacity: Int = 40,
) : Liner(name = name,
    speed = speed,
    loadCapacity = loadCapacity,) {

}