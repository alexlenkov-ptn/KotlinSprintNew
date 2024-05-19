
fun main() {
    var humanResultDice: Int
    var computerResultDice: Int
    var userAnswer: String = ""
    var computerWins: Int = 0
    var humanWins: Int = 0

    do {
        humanResultDice = generateDice()
        computerResultDice = generateDice()
        startRound(humanResultDice, computerResultDice)

        userAnswer = readln().toLowerCase()

        if(humanResultDice > computerResultDice) humanWins++
        else if (humanResultDice < computerResultDice) computerWins++

    }while (userAnswer == userPositiveAnswer)

    println("Игра закончилась со счётом: \n" +
            "Человечество: $humanWins \n" +
            "Компьютеры: $computerWins")
}

fun startRound(humanResultDice: Int?, computerResultDice: Int?) {
    println("Человечество сделало свой ход. Выпало число: $humanResultDice \n" +
            "Машины сделали свой ход. Выпало число: $computerResultDice \n" +
            "Хотите продолжить раунд? Да / Нет")
}

fun generateDice(): Int {
    return (MIN_RESULT_DICE..MAX_RESULT_DICE).random().toInt()
}

const val MIN_RESULT_DICE = 1
const val MAX_RESULT_DICE = 6
const val userPositiveAnswer = "да"





