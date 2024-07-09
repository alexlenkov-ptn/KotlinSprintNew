fun main() {
    val player = Player(500)
    println(player.mapExperienceAndSkills)
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

fun Map<String, Int>.maxCategory(player: Player): String {
    // фильтрануть всё, что ниже значения опыта нашего игрок
    val experience = player.experience
    var key: String = ""

    val mapFilter = this.filter { it.value <= experience }

    mapFilter.map { if (it.value <= experience) key = it.key }

    return key
}