fun main() {
    val user = User("John", "0000")
    println(user.checkPassword("0000"))
}

class User(
    private val login: String,
    private val password: String,
) {

    fun checkPassword(password: String): Boolean {
        return password == this.password
    }
}