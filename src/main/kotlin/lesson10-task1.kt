fun main() {
    val computerThrow = throwDice()
    val peopleThrow = throwDice()
    println("Компьютер бросил кубик. Выпало $computerThrow")
    println("Человек бросил кубик. Выпало $peopleThrow")
    if (computerThrow > peopleThrow) {
        println("Победили машины")
    } else if (computerThrow == peopleThrow) {
        println("Боевая ничья")
    } else {
        println("Победило человечество")
    }
}

fun throwDice() = (MIN_COUNT_DICE..MAX_COUNT_DICE).random()

const val MIN_COUNT_DICE = 1
const val MAX_COUNT_DICE = 6