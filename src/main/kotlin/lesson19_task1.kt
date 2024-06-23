fun main() {
    val list = listOf(
        AquariumSimulator.GUPPY, AquariumSimulator.ANGELFISH,
        AquariumSimulator.GOLDFISH, AquariumSimulator.SIAMESE
    )
    list.map {
        println(it.name)
    }

}

enum class AquariumSimulator() {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE,
}

