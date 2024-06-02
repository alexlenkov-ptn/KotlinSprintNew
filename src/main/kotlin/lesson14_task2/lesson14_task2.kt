package lesson14_task2

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