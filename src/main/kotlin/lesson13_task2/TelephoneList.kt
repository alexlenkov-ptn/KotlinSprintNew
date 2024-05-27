package lesson13_task2

class TelephoneList(
    _name: String,
    _number: Long,
    _company: String? = null,
    ) {
    val name = _name
    val number = _number
    val company = _company?:"не указано"

    fun printInfo() {
        println("- Имя: $name \n" +
                "- Номер: $number \n" +
                "- Компания: $company")
    }
}