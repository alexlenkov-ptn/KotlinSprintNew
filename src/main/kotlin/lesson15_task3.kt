fun main() {
    val forum = Forum()
    val userKen = StandartUsers(forum, "Ken")
    val admBarbie = AdministrationUsers(forum, "Barbie")
    val message1 = "Hello Ken"
    val message2 = "Hi Barbie"

    admBarbie.addForumUser(userKen)
    admBarbie.printForumMessage(message1)

    userKen.printForumMessage(message2)
    userKen.readMessage()

    println(forum.listOfStandartUsers)

    admBarbie.deleteForumMessage(message2)

    println(forum.listOfMessages)
    println(forum.listOfStandartUsers)

    admBarbie.deleteForumUser(userKen)
    println(forum.listOfStandartUsers)
}


abstract class Users(_forum: Forum) {
    val forum = _forum
    fun readMessage() = forum.readMessage()
    fun printForumMessage(message: String) = forum.printMessage(message)
}


class StandartUsers(_forum: Forum, val name: String) : Users(_forum = _forum)

class AdministrationUsers(_forum: Forum, val name: String) : Users(_forum = _forum) {
    fun deleteForumMessage(message: String) = forum.deleteMessage(message)
    fun deleteForumUser(user: StandartUsers) = forum.deleteStandartUsers(user)
    fun addForumUser(user: StandartUsers) = forum.addUsers(user)
}


class Forum() {
    val listOfMessages: MutableList<String> = mutableListOf()
    val listOfStandartUsers: MutableList<Users> = mutableListOf()
    val listOfAdministrationUsers: MutableList<AdministrationUsers> = mutableListOf()

    fun readMessage() = listOfMessages.forEach() { println(it) }
    fun printMessage(message: String) = listOfMessages.add(message)

    fun addUsers(user: Users) {
        if (user is StandartUsers) {
            listOfStandartUsers.add(user)
            println("Пользователь <${user.name}> добавлен на форум")
        } else if (user is AdministrationUsers) {
            listOfAdministrationUsers.add(user)
        }
    }

    fun deleteMessage(message: String) {
        if (listOfMessages.remove(message)) println("Сообщение <${message}> было удалено с форума")
            else {
            println("Сообщение не было найдено на форуме")
        }
    }

    fun deleteStandartUsers(user: StandartUsers) {
        if (listOfStandartUsers.remove(user)) println("Пользователь ${user.name} был удалён из форума")
        else println("Такой пользователь не найден")
    }
}

