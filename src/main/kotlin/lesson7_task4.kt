fun main() {
    val rangeMax = readln().toInt()

    for (i in RANGE_MIN..rangeMax) {
        println("Прошло времени, секунд: $i; Осталось времени, секунд: ${rangeMax - i}")
        Thread.sleep(SECOND)
        if (i == rangeMax)
            println("Время вышло")
    }
}

const val RANGE_MIN = 0
const val SECOND: Long = 1000