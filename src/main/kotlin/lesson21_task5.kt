fun main() {
    val player = Player(100)
    println(player.mapExperienceAndSkills.maxCategory())
}

class Player(private val experience: Int) {
    var mapExperienceAndSkills: MutableMap<String, Int> = mutableMapOf(
        "Вампиризм" to 100,
        "Призыв нежити" to 200,
        "Панацея" to 300,
        "Призыв стража смерти" to 500,
        "Мир призраков" to 500
    ).filterValues { it <= experience }.toMutableMap()

}

fun Map<String, Int>.maxCategory(): String? = maxByOrNull { it.value }?.key