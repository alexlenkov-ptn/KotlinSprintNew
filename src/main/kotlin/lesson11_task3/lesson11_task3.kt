package lesson11_task3

fun main() {
    val user1: User = User(
        name = "Pavel",
    )
    val user2: User = User(
        name = "Viktor",
    )
    val user3: User = User(
        name = "Grigory",
    )

    val room1: Room = Room(
        cover = "green",
        name = "room1",
        listOfUsers = mutableSetOf(),
    )

    room1.addUser(user1)
    room1.addUser(user2)
    room1.addUser(user3)

    room1.updateUserStatus("Pavel", STATUS_TALKING)
}

class User(
    val name: String,
    var status: String = "",
) {
}

class Room(
    val cover: String,
    val name: String,
    var listOfUsers: MutableSet<User> = mutableSetOf(),
) {

    fun addUser(user: User) {
        if (listOfUsers.contains(user)) println("Пользователь уже есть в списке")
        else listOfUsers.add(user)
    }

    fun updateUserStatus(userName: String, status: String) {
        // Проверить что пользователь есть в списке - готово
        // Создать поиск по имени, а не ссылке

        val listOfUserName: Map<String, User> = listOfUsers.associateBy { it.name }

        if (listOfUserName.contains(userName)) {

            val statusLowerCase = status.toLowerCase()

            if (statusLowerCase == STATUS_MUTED ||
                statusLowerCase == STATUS_TALKING ||
                statusLowerCase == STATUS_MICROPHONE_OFF
            ) {

                val user: User? = listOfUserName[userName]
                user?.status = statusLowerCase
            } else {
                println("Такого статуса не существует")
            }
        } else {
            println("Пользователя с таким именем не существует")
        }


    }
}

const val STATUS_MUTED = "пользователь заглушен"
const val STATUS_TALKING = "разговаривает"
const val STATUS_MICROPHONE_OFF = "микрофон выключен"

