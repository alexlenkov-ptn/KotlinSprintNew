package lesson13_task1

fun main() {
    val vitaly = TelephoneList_13_1("vitaly", "test", null)
}

class TelephoneList_13_1(
    _name: String,
    _company: String,
    _number: Long?,
) {
    val name = _name
    val number = _number
    val company = _company
}