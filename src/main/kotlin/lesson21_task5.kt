fun main() {
    val player = Player(400)
    println(player.mapExperienceAndSkills.maxCategory(player))
}

class Player(val experience: Int) {
    val mapExperienceAndSkills: Map<String, Int> = mapOf(
        "Вампиризм" to 100,
        "Призыв нежити" to 200,
        "Панацея" to 300,
        "Призыв стража смерти" to 500,
        "Мир призраков" to 500
    )
}

fun Map<String, Int>.maxCategory(player: Player): String? {
    val mapFilter = this.filter { it.value <= player.experience }
    val mapOfMax = mapFilter.maxByOrNull { it.value }
    return mapOfMax?.key
}