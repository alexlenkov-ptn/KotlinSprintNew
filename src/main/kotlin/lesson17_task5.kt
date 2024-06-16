fun main() {
    val user = User("John", "00")
    user.login = "Alex"
    println(user.password)
    user.password = "1111"

}

class User(
    login: String,
    password: String,
) {

    var login = login
        set(value: String) {
            field = value
            println("Логин успешно изменен")
        }

    var password = password
        get() = field.replace(field, "${"*".repeat(field.length)}")
        set(value: String) {
            println("Вы не можете изменить пароль")
        }
}