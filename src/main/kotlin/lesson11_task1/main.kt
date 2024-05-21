package lesson11_task1

fun main() {
    val user1: User = User(
        id = 1,
        login = "john",
        mail = "john@google.com",
        password = "0000",
    )
    val user2: User = User(
        id = 2,
        login = "dan",
        mail = "dan@outlook.com",
        password = "0000",
    )

    println(user1.id)
    println(user1.login)
    println(user1.mail)
    println(user1.password)

    println()

    println(user2.id)
    println(user2.login)
    println(user2.mail)
    println(user2.password)

}