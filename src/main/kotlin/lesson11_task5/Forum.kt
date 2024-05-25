package lesson11_task5

class Forum(
) {
    val forumPersonFactory = ForumPersonFactory()

    val user1 = forumPersonFactory.createNewUser(1, "Dmitry")
    val user2 = forumPersonFactory.createNewUser(2, "Pavel")

    val message1 = forumPersonFactory.createNewMessage(2, "I am Pavel")
    val message2 = forumPersonFactory.createNewMessage(1, "I am Dmitry")

    val mutableListUsers = forumPersonFactory.mutableListUsers
    val mutableListMessage = forumPersonFactory.mutableListMessage

    fun printThread() {
        for (i in 0 until  mutableListUsers.size) {
            val userName = mutableListUsers[i].userName
            val userId = mutableListUsers[i].userId

            for (i in 0 until mutableListMessage.size) {
                val authorId = mutableListMessage[i].authorId
                val message = mutableListMessage[i].message

                if (userId == authorId) {
                    println("автор: $userName")
                    println("сообщение: $message")
                }
            }

        }
    }
}
