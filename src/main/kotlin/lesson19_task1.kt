import java.util.*

fun main() {
    val enumSet: Set<AquariumSimulator> = AquariumSimulator.values().toSet()
    enumSet.forEach() {
        println(it)
    }
}

enum class AquariumSimulator() {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE,
}

