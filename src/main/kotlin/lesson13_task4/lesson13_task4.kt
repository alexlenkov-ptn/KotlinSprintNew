package lesson13_task4

const val ANSWER_NO = "нет"

fun main() {
    var userAnswer: String = ""
    val listOfContact: List<TelephoneList_13_4> = listOf()

    while (userAnswer != ANSWER_NO) {
        println("Введите номер телефона:")
        val name = readln().toString().capitalize()
        val number = readln().toLongOrNull() ?: println("Вы не ввели номер телефона")
        val company = readln()?.toString() ?: null
        val user: TelephoneList_13_4
        println("Продолжить заполнение базы? Да / Нет")
        userAnswer = readln().toString().toLowerCase()
    }

    listOfContact.forEach {
        println(it)
    }
}

class TelephoneList_13_4(
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