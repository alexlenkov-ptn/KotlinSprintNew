fun main() {
    val player = Player("Carl J", 100)
    println(player.isHealthy())
}

class Player(
    val name: String,
    var health: Int,
    val healthMax: Int = 100
) {
    fun changeHealth(healPoint: Int) {
        if (health + healPoint >= healthMax) health = healthMax
        else health += healPoint
    }

    fun showInfo() {
        println(
            "Имя: $name\n" +
                    "Здоровье: $health"
        )
    }
}

fun Player.isHealthy() : Boolean {
    if (this.health == this.healthMax) return true
    else return false
}