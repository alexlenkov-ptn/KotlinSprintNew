
fun main() {

}

class Player(val experience: Int) {
    val mapExperienceAndSkills: Map<String, Int> = mapOf("Вампиризм" to 100,
        "Призыв нежити" to 200,
        "Панацея" to 300,
        "Вызов стража смерти" to 500,
        "Мир призраков" to 500)
}

fun Map<String, Int>.maxCategory(player: Player) {

}


// класс Player, который хранится Map (навыки)