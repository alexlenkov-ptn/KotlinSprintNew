package lesson13_task5

fun main() {
    var userAnswer: String = ""
    val listOfContact: List<TelephoneList_13_5> = listOf()

    println("Введите номер телефона:")
    val number = readln().toString()
    try {
        number.toLong()
    } catch (e: Exception) {
        println(e)
    }

    println("Введите имя:")
    val name = readln().toString().replaceFirstChar { it.uppercase() }
    number.toLong()

    println("Введите название компании:")
    val company = readln()?.toString() ?: null
}

class TelephoneList_13_5(
    _name: String,
    _number: Long,
    _company: String? = null,
) {
    val name = _name
    val number = _number
    val company = _company ?: "не указано"

    fun printInfo() {
        println(
            "- Имя: $name \n" +
                    "- Номер: $number \n" +
                    "- Компания: $company"
        )
    }
}