package lesson14_task2

class CargoShip_14_2(
    // Поля по умолчанию
    name: String = "Cargo Ship",
    speed: Int = 5,
    loadCapacity: Int = 40,
) : Liner_14_2(name = name,
    speed = speed,
    loadCapacity = loadCapacity,) {

    override fun loadCargo() {
        println("Погрузочный кран активирован")
    }
}