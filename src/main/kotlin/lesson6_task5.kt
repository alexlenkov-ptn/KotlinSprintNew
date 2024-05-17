fun main() {

    var tries = 3

    do {
        val countRandomFirst = (LOWER_RANGE..UPPER_RANGE).random()
        val countRandomSecond = (LOWER_RANGE..UPPER_RANGE).random()
        println("Докажите, что вы не бот. Введите ответ примера: $countRandomFirst + $countRandomSecond")
        val userCount = readln().toInt()
        tries--
        if ((countRandomFirst + countRandomSecond) == userCount) {
            println("Ответ правильный. Вы можете войти в систему")
        } else if (tries == 0) {
            println("Доступ запрещен")
        } else {
            println("Ответ неправильный. Осталось попыток: $tries")
        }
    } while (((countRandomFirst + countRandomSecond) != userCount) && tries != 0)


}
const val LOWER_RANGE = 1
const val UPPER_RANGE = 9