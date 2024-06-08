fun main() {
    val forum = Forum()
    val user = StandartUsers(forum, "Ken")
    val adm = AdministrationUsers(forum, "Barbie")
    val message1 = "Hello Ken"
    val message2 = "Hi Barbie"

    user.printForumMessage(message1)
    user.printForumMessage(message2)
    user.readMessage()
    adm.deleteForumMessage(message1)
    user.readMessage()
}


abstract class Users(_forum: Forum) {
    val forum = _forum
    fun readMessage() = forum.readMessage()
    fun printForumMessage(message: String) = forum.printMessage(message)

}


class StandartUsers(_forum: Forum, val name: String) : Users(_forum = _forum)

class AdministrationUsers(_forum: Forum, val name: String) : Users(_forum = _forum) {
    fun deleteForumMessage(message: String) = forum.deleteMessage(message)
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
        } else if (user is AdministrationUsers) {
            listOfAdministrationUsers.add(user)
        }
    }

    fun deleteMessage(message: String) {
        if (listOfMessages.contains(message)) {
            listOfMessages.removeAt(listOfMessages.indexOf(message))
        } else {
            println("Сообщение не было найдено на форуме")
        }
    }

    fun deleteStandartUsers(user: StandartUsers) {
        if (listOfStandartUsers.contains(user)) listOfStandartUsers.removeAt(listOfStandartUsers.indexOf(user))
        else println("Такой пользователь не найден")
        // todo (listOfStandartUsers.remove(user) можно сделать еще так и для deleteMessage тоже
    }
}


/*
Задача 3 к Уроку 15

На форуме есть два типа пользователей – обычные пользователи и администраторы.

Пользователи могут читать форум и писать сообщения. (2 метода)
Администраторы дополнительно могут удалять сообщения и пользователей.

Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс.

У абстрактного класса должны быть соответствующие общие поля и методы.
Действия на форуме отобрази сообщениями в консоль.
 */

