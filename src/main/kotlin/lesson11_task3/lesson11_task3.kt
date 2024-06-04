package lesson11_task3

fun main() {
    val user1: User = User (
        name = "Pavel",
    )
    val user2: User = User (
        name = "Viktor",
    )
    val user3: User = User (
        name = "Viktor",
    )

    val room1: Room = Room(
        cover = "green",
        name = "room1",
        listOfUsers = mutableListOf(),
    )

    room1.addUser(user1)
    room1.addUser(user2)
    room1.addUser(user3)

    room1.updateUserStatus(user1, "микрофон заглушен")
}

class User(
    val name: String,
    var status: String = "",
) {
}

class Room(
    val cover: String,
    val name: String,
    var listOfUsers: MutableList<User> = mutableListOf(),
) {

    fun addUser(user: User) {
        if (listOfUsers.contains(user)) println("Пользователь уже есть в списке")
        else listOfUsers.add(user)
    }

    fun updateUserStatus(user: User, status: String) {
        val statusLowerCase = status.toLowerCase()
        if (statusLowerCase == statusMuted ||
            statusLowerCase == statusTalking ||
            statusLowerCase == statusMicrophoneOff)
            user.status = status
        else
            println("Такого статуса не существует")
    }
}

const val statusMuted = "заглушен"
const val statusTalking = "разговаривает"
const val statusMicrophoneOff = "микрофон заглушен"

