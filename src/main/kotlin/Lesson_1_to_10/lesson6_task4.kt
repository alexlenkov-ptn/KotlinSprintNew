package Lesson_1_to_10

fun main() {
    val countRandom = (LOWER_RANGE..UPPER_RANGE).random()
    var countResult: Int
    var tries = 5

    do {
        println("Количество попыток: $tries")
        Thread.sleep(HALF_SECOND)
        println("Введите загадываемое число")
        countResult = readln().toInt()

        tries--
        if (countRandom == countResult) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно!")
        }
    } while (tries != 0 && countRandom != countResult)

}

const val LOWER_RANGE = 1
const val UPPER_RANGE = 9
const val HALF_SECOND: Long = 500
