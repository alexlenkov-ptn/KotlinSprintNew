

fun main() {
    val user = User("John", "0000")
    println(checkPassword("0000", user))
}

class User(
    private val login: String,
    private val password: String,
) {
    fun getPassword() = password
}

fun checkPassword(password: String, user: User) : Boolean {
    if(password == user.getPassword()) return true
    else return false
}