package lesson11_task2

class User2(
    val id: Int,
    val login: String,
    val mail: String,
    var password: String,
    var bio: String,
) {
    fun setBio() {
        println("Введите новое био")
        val newBio = readln().toString()
        bio = newBio
    }

    fun changePassword() {
        println("Укажите текущий пароль:")
        val userPassword = readln().toString()
        if (userPassword == password) {
            println("Укажите новый пароль")
            val userPasswordNew = readln().toString()
            password = userPasswordNew
        } else {
            println("Пароль неверный")
        }
    }
}