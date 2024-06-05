package lesson11_task2

fun main() {
    val user1: User2 = User2(
        id = 1,
        login = "pavel",
        mail = "pavel@mail.ru",
        password = "0000",
        bio = "Владислав. Живу в Краснодаре. 23 года"
    )
    user1.setBio()

    user1.changePassword()

    user1.showInformation()

}