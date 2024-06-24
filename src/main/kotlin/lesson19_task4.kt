fun main() {
    val tank = Tank()
    tank.shot()
    println()
    tank.reload(Cartridge.BLUE)
    tank.shot()
    println()
    tank.reload(Cartridge.RED)
    tank.shot()
    println()
    tank.reload(Cartridge.GREEN)
    tank.shot()
}

enum class Cartridge(val damage: Int?) {
    BLUE(5),
    GREEN(10),
    RED(20),
    NONE(null),
}

class Tank() {
    private var cartridges: Cartridge = Cartridge.NONE

    fun reload(cartridges: Cartridge) {
        this.cartridges = cartridges
        println("Танк перевооружён на:\n" +
                "тип патронов - ${cartridges.name};\n" +
                "урон - ${cartridges.damage} ед.")
    }

    fun shot() {
        if (cartridges == Cartridge.NONE) {
            println("Сначала зарядите танк")
        }else {
            println("Танк выстрелил. Урон - ${cartridges.damage} ед.")
        }
    }
}