package lesson11_task5

class ForumMessage(
    var authorId: Int,
    var message: String,
) {
    fun createNewMessage(userId: ForumPerson) {
        authorId = userId

    }
}