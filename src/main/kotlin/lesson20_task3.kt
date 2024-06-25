fun main() {
    val player = Player(false)
    val player2 = Player(true)

    val checkKey: (Player) -> Unit = { player: Player ->
        if (player.isKeyAvailable) println("Дверь открыта")
        else println("Дверь закрыта")
    }
    checkKey(player)
    checkKey(player2)
}

class Player(val isKeyAvailable: Boolean)