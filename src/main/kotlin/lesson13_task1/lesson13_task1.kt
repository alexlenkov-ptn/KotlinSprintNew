package lesson13_task1

fun main() {
    val vitaly = TelephoneList("vitaly", "test", null)
}

class TelephoneList(
    _name: String,
    _company: String,
    _number: Long?,
) {
    val name = _name
    val number = _number
    val company = _company
}