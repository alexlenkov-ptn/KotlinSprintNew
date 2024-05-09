const val FIRST_TRUE_COUNT = 19
const val SECOND_TRUE_COUNT = 0


fun main() {
    println("Введите первое число")
    val firstUserCount = readLine()!!.toInt()
    println("Введите второе число")
    val secondUserCount = readLine()!!.toInt()

    if (firstUserCount == FIRST_TRUE_COUNT || secondUserCount == SECOND_TRUE_COUNT ||
        secondUserCount == FIRST_TRUE_COUNT || firstUserCount == SECOND_TRUE_COUNT) {
        if((firstUserCount == FIRST_TRUE_COUNT && secondUserCount == SECOND_TRUE_COUNT) ||
            (secondUserCount == FIRST_TRUE_COUNT && firstUserCount == SECOND_TRUE_COUNT)) {
            println("Поздравляем! Вы выиграли главный приз!")
        }else{
            println("Вы выиграли утешительный приз!")
        }
    }else{
        println("Неудача!")
    }
}

/*
Задача 3 к Уроку 5

Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42.
Если угадать только одно – игрок получает утешительный приз. Напиши программу, проверяющую выигрыш.
Пользователь должен вводить числа в консоль. Правильные числа заранее известны и хранятся в переменных.
Оформить ввод текстовыми подсказками о том, что нужно вводить.
Вывести отдельным сообщением, какие числа были нужны для победы.

- если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
- если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
- если не угадано ничего, вывести “Неудача!”;
- программа должна учитывать ввод чисел в обратном порядке.
 */