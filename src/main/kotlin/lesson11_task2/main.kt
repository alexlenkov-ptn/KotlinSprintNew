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

    showInformation(user1)

}

fun showInformation(user: User2) {
    println(
        "Id: ${user.id} \n" +
                "Login: ${user.login} \n" +
                "Mail: ${user.mail} \n" +
                "Password: ${user.password} \n" +
                "Bio: ${user.bio}"
    )
}