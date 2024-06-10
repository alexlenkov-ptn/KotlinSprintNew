package lesson13

const val ANSWER_NO = "нет"

fun main() {
    var userAnswer: String = ""
    val listOfContact: MutableList<TelephoneList_13_4> = mutableListOf()


    while (userAnswer != ANSWER_NO) {
        println("Введите имя:")
        val name = readln().toString().replaceFirstChar { it.uppercase() }
        var number: Long? = null
        var userNumberInput: String
        do {
            println("Введите номер телефона:")
            userNumberInput = readln()
            number = userNumberInput.toLongOrNull()
            if (number == null) {
                println("Введите номер телефона еще раз:")
            }
        } while (number == null)
        println("Введите компанию:")
        var company: String? = readln()
        if (company == "") company = null
        val user: TelephoneList_13_4 = TelephoneList_13_4(name, number, company)
        listOfContact.add(user)
        println("Продолжить заполнение базы? Да / Нет")
        userAnswer = readln().toString().lowercase()
    }

    listOfContact.forEach {
        it.printInfo()
        println()
    }

}

class TelephoneList_13_4(
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
                    "- Компания: ${company ?: null}"
        )
    }
}