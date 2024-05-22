package lesson11_task3

fun main() {
    val user1: User = User (
        name = "Pavel",
        status = "разговаривает",
    )
    val user2: User = User (
        name = "Viktor",
        status = "микрофон выключен",
    )
    val user3: User = User (
        name = "Viktor",
        status = "пользователь заглушен",
    )
    val room1: Room = Room(
        cover = "green",
        name = "room1",
        listOfUsers = mutableListOf(user1, user2),
    )
}