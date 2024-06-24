import java.util.*

fun main() {
    for (fish in AquariumSimulator.entries) {
        println(fish.toString())
    }
}

enum class AquariumSimulator() {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE,
}

