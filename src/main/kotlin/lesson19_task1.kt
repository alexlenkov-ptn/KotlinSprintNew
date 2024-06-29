import java.util.*
import kotlin.enums.EnumEntries

fun main() {
    val enumSet: List<AquariumSimulator> = AquariumSimulator.entries
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

