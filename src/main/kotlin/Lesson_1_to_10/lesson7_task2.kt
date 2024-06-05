package Lesson_1_to_10

fun main() {
    val rangeRandomCode = 1000..9999

    do {
        val randomCode = rangeRandomCode.random()
        println("Ваш код авторизации: $randomCode")
        println("Введите код авторизации:")
        val userCode = readln().toInt()
        if (randomCode == userCode) {
            println("Вы успешно авторизовались")
        } else {
            println("Код неверный. Выслали вам новый")
        }
    } while (randomCode != userCode)
}