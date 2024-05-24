package lesson11_task5

import kotlin.random.Random

class ForumPerson(
    var userId: Int,
    var userName: String,
) {
    fun createNewUser(userName: String) {
        userId = Random.nextInt()
        this.userName = userName

    }

}