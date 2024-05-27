fun main() {
    println("Введите логин")
    val userName = readln().toString()
    println("Введите пароль")
    val userPassword = readln().toString()

    if (checkString(userName) && checkString(userPassword)) println("Вход успешный")
        else println("Пароль или логин менее 4 символов")

}

fun checkString(string: String): Boolean {
    if (string.length >= MIN_LENGTH) return true
    else return false
}

const val MIN_LENGTH = 4