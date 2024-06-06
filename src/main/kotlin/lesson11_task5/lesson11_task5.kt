package lesson11_task5

fun main() {
    val forum = Forum()
    val factory: ForumPersonFactory = ForumPersonFactory()
    val user1 = factory.createNewUser(1, "Dmitry")
    val user2 = factory.createNewUser(2, "Pavel")
    val message1 = factory.createNewMessage(1, "I am Dmitry")
    val message2 = factory.createNewMessage(2, "I am Pavel")

    forum.addUserForum(user1)
    forum.addUserForum(user2)

    forum.addMessageForum(message1)
    forum.addMessageForum(message2)

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

    fun addUserForum(user: ForumPerson) {
        ListOfForumUsers.add(user)
    }
    fun addMessageForum(message: ForumMessage) {
        ListOfForumMessage.add(message)
    }
    fun printThread() {
        ListOfForumUsers.forEach() {
            val userId = it.userId
            print("Автор ${it.userName}: ")
            ListOfForumMessage.map() {
                if (it.authorId == userId) println(it.message)
            }
        }
    }
}