fun main() {
    var userName: String
    var userPassword: String
    var name: String
    var password: String

    do {
        println("Для регистрации введите логин")
        userName = readln().toString()
        println("Укажите пароль")
        userPassword = readln().toString()
        println("Система загружается...")
        Thread.sleep(1000)
        println(
            "Пройдите авторизацию. " +
                    "\nВведите логин:"
        )
        name = readln().toString()
        println("Введите пароль:")
        password = readln().toString()

        val compareResult: Boolean = if (name == userName && password == userPassword) {
            true
        } else {
            false
        }
        if (compareResult == true) {
            println("Вы успешно авторизовались в системе")
        } else {
            println("На каком-то из этапов вы совершили ошибку. Попробуйте пройти процесс заново")
        }

    } while (!compareResult)
}

/*
На этапе авторизации в приложении пользователь, не имея аккаунта, выбрал регистрацию.
Нужно создать блок программы, который сначала предлагает создать логин и пароль,
затем запрашивает их, чтобы войти в приложение.

Если логин или пароль введены неверно – данные запрашиваются заново.
Если данные верны, выводится сообщение – “Авторизация прошла успешно”.
 */