import kotlin.math.tan

fun main() {
    val tank = Tank()
    tank.shot()
    println()
    tank.reload(Cartridges.BLUE)
    tank.shot()
    println()
    tank.reload(Cartridges.RED)
    tank.shot()
    println()
    tank.reload(Cartridges.GREEN)
    tank.shot()
}

enum class Cartridges(val damage: Int?) {
    BLUE(5),
    GREEN(10),
    RED(20),
    NONE(null),
}

class Tank() {
    private var cartridges: Cartridges = Cartridges.NONE

    fun reload(cartridges: Cartridges) {
        this.cartridges = cartridges
        println("Танк перевооружён на:\n" +
                "тип патронов - ${cartridges.name};\n" +
                "урон - ${cartridges.damage} ед.")
    }

    fun shot() {
        if (cartridges == Cartridges.NONE) {
            println("Сначала зарядите танк")
        }else {
            println("Танк выстрелил. Урон - ${cartridges.damage} ед.")
        }
    }
}