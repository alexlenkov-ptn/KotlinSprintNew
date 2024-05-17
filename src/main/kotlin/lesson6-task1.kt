fun main() {
    var userNameRegistration: String
    var userPasswordRegistration: String
    var userNameAutorizatiion: String
    var userPasswordAutorization: String

    println("Для регистрации введите логин")
    userNameRegistration = readln().toString()
    println("Укажите пароль")
    userPasswordRegistration = readln().toString()

    do {
        println("Система загружается...")
        Thread.sleep(1000)
        println(
            "Пройдите авторизацию. " +
                    "\nВведите логин:"
        )
        userNameAutorizatiion = readln().toString()
        println("Введите пароль:")
        userPasswordAutorization = readln().toString()

        val compareResult: Boolean = if (userNameAutorizatiion == userNameRegistration && userPasswordAutorization ==
            userPasswordRegistration) {
            true
        } else {
            false
        }
        if (compareResult == false) {
            println("На каком-то из этапов вы совершили ошибку. Попробуйте пройти процесс заново")
        }

    } while (!compareResult)
    println("Вы успешно авторизовались в системе")

}
