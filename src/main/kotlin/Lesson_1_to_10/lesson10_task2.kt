package Lesson_1_to_10

fun main() {
    println("Введите логин")
    val userName = readln().toString()
    println("Введите пароль")
    val userPassword = readln().toString()

    if (Lesson_1_to_10.checkString(userName) && Lesson_1_to_10.checkString(userPassword)) println("Вход успешный")
        else println("Пароль или логин менее 4 символов")

}

fun checkString(string: String): Boolean = string.length >= Lesson_1_to_10.MIN_LENGTH

const val MIN_LENGTH = 4