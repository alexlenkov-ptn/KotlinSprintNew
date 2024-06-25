fun main() {
    val player = Player("Carl J", 60)
    player.showInfo()

    val heal: (Player) -> Unit = { player: Player ->
        val healPoint = 50
        player.changeHealth(healPoint)
    }
    heal(player)
    player.showInfo()
}

class Player(
    val name: String,
    var health: Int,
) {
    private val healthMax: Int = 100

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