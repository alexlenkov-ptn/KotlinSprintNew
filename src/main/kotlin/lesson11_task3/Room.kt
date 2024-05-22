package lesson11_task3


class Room(
    val cover: String,
    val name: String,
    var listOfUsers: MutableList<User> = mutableListOf(),
    ) {

    fun addUser(user: User) {
        listOfUsers.add(user)
    }


}