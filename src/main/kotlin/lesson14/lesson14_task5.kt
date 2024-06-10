package lesson14

fun main() {
    val chat = Chat()
    chat.addMessage("Привет, я Valery", "Valery")

    chat.addThreadMessage(
        chat.mutableListOfMessages[0].messageId,
        "Это комментарий",
        "Valery"
    )

    chat.addThreadMessage(
        chat.mutableListOfMessages[0].messageId,
        "Это комментарий 2",
        "Valery 2"
    )

    chat.addMessage("Привет, я Alex", "Alex")

    chat.addThreadMessage(
        chat.mutableListOfMessages[1].messageId,
        "Hello, Alex",
        "Pavel"
    )

    chat.addThreadMessage(
        10,
        "Это комментарий 3",
        "Valery 3"
    )

    chat.printChat(chat)

}

class Chat() {
    val mutableListOfMessages: MutableList<Message> = mutableListOf()
    val mutableListOfThreadMessage: MutableList<ChildMessage> = mutableListOf()
    var idCounter = 0

    fun addMessage(text: String, authorName: String) {
        val message = Message(messageId = idCounter, message = text, authorName = authorName)
        idCounter++
        mutableListOfMessages.add(message)
    }

    fun addThreadMessage(messageId: Int, childMessage: String, authorName: String) {
        val message = ChildMessage(
            messageId = messageId,
            message = childMessage,
            authorName = authorName,
            childMessageId = idCounter
        )
        idCounter++
        mutableListOfThreadMessage.add(message)
    }

    fun printChat(chat: Chat) {
        chat.mutableListOfMessages.forEach() {
            println("${it.message}")
            val messageId = it.messageId
            val groupedByMessageId: Map<Int, List<ChildMessage>> = mutableListOfThreadMessage.groupBy { it.messageId }
            val childMessage: List<ChildMessage>? = groupedByMessageId[messageId]
            childMessage?.forEach() { println("     ${it.message}") }
        }
    }
}

open class Message(
    val messageId: Int,
    val message: String,
    val authorName: String,
)

class ChildMessage(
    messageId: Int,
    message: String,
    authorName: String,
    val childMessageId: Int,
) : Message(messageId, message, authorName)

