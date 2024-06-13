fun main() {

}

class Player(
    protected val name: String,
    protected var health: Int,
    protected val damage: Int,
) {

    fun getDamage (damage: Int) {
        health = health - damage
    }

    fun getHeal (heal: Int) {
        health = health + heal
    }

    private fun healthIsOver() {

    }
}