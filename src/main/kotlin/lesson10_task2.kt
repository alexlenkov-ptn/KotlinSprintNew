fun main() {
    println("Введите логин")
    val userName = readln().toString()
    println("Введите пароль")
    val userPassword = readln().toString()
    checkPassAndInfo(userName, userPassword)
}

fun checkPassAndInfo(userName: String, userPassword: String) {
    if (userName.length < MIN_LENGTH || userPassword.length < MIN_LENGTH) {
        println("Логин или пароль недостаточно длинные")
    }
}

const val MIN_LENGTH = 4