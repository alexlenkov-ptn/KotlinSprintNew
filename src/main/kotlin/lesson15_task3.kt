fun main() {
    val message1 = "Hello Ken"
    val message2 = "Hi Barbie"
    val user = StandartUser("Ken")
    val adm = AdministrationUser("Barbie")

    user.readMessage()
    user.printForumMessage(message2)

    adm.readMessage()
    adm.printForumMessage(message1)

    adm.deleteForumMessage(message2)
    adm.deleteForumUser(user)
}

abstract class User(val name: String) {
    fun readMessage() = println("Пользователь <$name> читает сообщение")
    fun printForumMessage(message: String) = println(message)
}

class StandartUser(name: String) : User(name)
class AdministrationUser(name: String) : User(name) {
    fun deleteForumMessage(message: String) = println("Администратор <$name> удалил сообщение <${message}>")
    fun deleteForumUser(user: StandartUser) = println("Администратор <$name> удалил пользователя <${user.name}>")
}