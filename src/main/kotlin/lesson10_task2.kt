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

/*
Для регистрации в приложении пользователь придумывает логин и пароль.
И логин, и пароль должны содержать в себе хотя бы 4 символа. Если всё верно, программа выводит приветственное сообщение.

- считывай логин и пароль с консоли поочередно;
- вынеси в отдельную функцию валидацию длины введенных данных;
- если логин или пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".
 */