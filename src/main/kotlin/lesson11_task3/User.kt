package lesson11_task3

class User(
    val name: String,
    var status: String,
) {
    fun setStatus(name: String, newStatus: String) {
        status = newStatus
    }
}