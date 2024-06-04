package lesson11_task5

fun main() {
    val forum = Forum()
    val factory: ForumPersonFactory = ForumPersonFactory()

    factory.createNewUser(1, "Dmitry")
    factory.createNewUser(2, "Pavel")
    factory.createNewMessage(1, "I am Dmitry")
    factory.createNewMessage(2, "I am Pavel")

//todo Указал что нужно доделать ниже

//    val user1 = createNewUser(1, "Dmitry")
//    val user2 = forumPersonFactory.createNewUser(2, "Pavel")
//    val message1 = forumPersonFactory.createNewMessage(2, "I am Pavel")
//    val message2 = forumPersonFactory.createNewMessage(1, "I am Dmitry")
    forum.printThread()
}

class ForumPersonFactory {

    fun createNewUser(userId: Int, userName: String): ForumPerson {
        val user = ForumPerson(userId, userName)
        return user
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage {
        val message = ForumMessage(authorId, message)
        return message
    }
}

class ForumPerson(
    var userId: Int,
    var userName: String,
)

class ForumMessage(
    var authorId: Int,
    var message: String,
)

class Forum() {
    val forumPersonFactory = ForumPersonFactory()

    val ListOfForumUsers: MutableSet<ForumPerson> = mutableSetOf()
    val ListOfForumMessage: MutableList<ForumMessage> = mutableListOf()

    //todo Нужно реализовать функцию через айдишник, а не по ссылке


    fun addUserForum(user: ForumPerson) {
        ListOfForumUsers.add(user)
    }

    fun addMessageForum(message: ForumMessage) {
        ListOfForumMessage.add(message)
    }

    fun printThread() {
//        for (i in 0 until  ListOfUsers.size) {
//            val userName = ListOfUsers[i].userName
//            val userId = ListOfUsers[i].userId
//
//            for (i in 0 until ListOfMessage.size) {
//                val authorId = ListOfMessage[i].authorId
//                val message = ListOfMessage[i].message
//
//                if (userId == authorId) {
//                    println("автор: $userName")
//                    println("сообщение: $message")
//                }
//            }
//
//        }
        ListOfForumUsers.forEach() {
            println("автор: ${it.userName}")
        }
        ListOfForumMessage.forEach() {
            println("сообщение: ${it.message}")
        }
    }
}