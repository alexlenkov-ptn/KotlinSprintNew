package lesson13_task4

const val ANSWER_NO = "нет"

fun main() {
    var userAnswer: String = ""
    val listOfContact: MutableList<TelephoneList_13_4> = mutableListOf()

    while (userAnswer != ANSWER_NO) {
        println("Введите имя:")
        val name = readln().toString().replaceFirstChar { it.uppercase() }
        var number: Long
        do {
            println("Введите номер телефона:")
            val userNumberInput = readln()
            number = userNumberInput?.toLongOrNull() ?: 0
        } while (number == null)
        println("Введите компанию:")
        val company = readln()?.toString() ?: null
        val user: TelephoneList_13_4 = TelephoneList_13_4(name, number, company)


        listOfContact.add(user(name, number, ))
        println("Продолжить заполнение базы? Да / Нет")
        userAnswer = readln().toString().lowercase()
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

class TelephoneList(
    _name: String,
    _number: Long,
    _company: String? = null,
) {
    val name = _name
    val number = _number
    val company = _company

    fun printInfo() {
        println(
            "- Имя: $name \n" +
                    "- Номер: $number \n" +
                    "- Компания: ${company ?: "не указано"}"
        )
    }
}