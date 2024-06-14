fun main() {
    val player = Player("player", 100, 4)
    player.getDamage(50)
    player.getConditionPlayer()
    println()
    player.getHeal(100)
    player.getConditionPlayer()
    println()
    player.getDamage(50)
    player.getConditionPlayer()
    println()
    player.getHeal(100)
    player.getConditionPlayer()
    println()
    player.getDamage(200)
    player.getConditionPlayer()
    println()
    player.getDamage(200)
}

class Player(
    protected val name: String,
    protected var health: Int,
    protected var damage: Int,
) {

    fun getDamage (damage: Int) {
        if (health > 0) health = health - damage
        else println("Урон по персонажу не работает. Игрок мертв")
        healthIsOver(health)
    }

    fun getHeal (heal: Int) {
        if (health > 0) health = health + heal
        else println("Лечение не работает. Игрок мертв")
        healthIsOver(health)
    }

    private fun healthIsOver(health: Int) {
        if (health <= 0) {
            this.health = 0
            damage = 0
        }
    }

    fun getConditionPlayer() {
        println("Состояние игрока $name: \n" +
                "Здоровье: $health\n" +
                "Наносимый урон: $damage")
    }
}