package lesson11_task5

class ForumPersonFactory {
    val mutableListUsers: MutableList<ForumPerson> = mutableListOf()
    val mutableListMessage: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(userId: Int, userName: String):ForumPerson {
        val user = ForumPerson(userId, userName)
        mutableListUsers.add(user)
        return user
    }
    fun createNewMessage(authorId: Int, message: String): ForumMessage {
        val message = ForumMessage(authorId, message)
        mutableListMessage.add(message)
        return message
    }
}