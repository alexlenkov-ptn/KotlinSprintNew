fun main() {
    val player = Player(100)
    println(player.mapExperienceAndSkills.maxCategory())
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

fun Map<String, Int>.maxCategory(): String? = maxByOrNull { it.value }?.key