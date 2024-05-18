fun main() {

    var tries = 3

    var countRandomFirst: Int = 0
    var countRandomSecond: Int = 0
    var userCount: Int = 0
    var sumCounts: Int = 0

    do {
        countRandomFirst = (LOWER_RANGE..UPPER_RANGE).random()
        countRandomSecond = (LOWER_RANGE..UPPER_RANGE).random()
        sumCounts = countRandomFirst + countRandomSecond

        println("Докажите, что вы не бот. Введите ответ примера: $countRandomFirst + $countRandomSecond")
        userCount = readln().toInt()

        if(userCount == sumCounts) break

        tries--
        if (tries < 3) println("Ответ неправильный. Осталось попыток: $tries")

    } while (tries > 0)

    if ((countRandomFirst + countRandomSecond) == userCount) {
        println("Ответ правильный. Вы можете войти в систему")
    } else {
        println("Доступ запрещен")
    }

}

const val LOWER_RANGE = 1
const val UPPER_RANGE = 9