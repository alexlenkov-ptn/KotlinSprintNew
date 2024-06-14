fun main() {
    val ship = Ship()
    ship.name = "Титаник"
}

class Ship() {
    var name: String = "Аврора"
        set(value: String) {
            if (value == "Аврора") field = value else println("Имя корабля менять запрещено")
        }
    val averageSpeed: Int = 5
    val port = "port"

}