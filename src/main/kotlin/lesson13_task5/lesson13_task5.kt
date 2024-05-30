package lesson13_task5

fun main() {
    var userAnswer: String = ""
    val listOfContact: List<TelephoneList> = listOf()

    while (userAnswer != ANSWER_NO) {
        println("Введите номер телефона:")
        val name = readln().toString().capitalize()
        val number = readln().toString()
        number.toLong()


        val company = readln()?.toString() ?: null
        val user: TelephoneList
        println("Продолжить заполнение базы? Да / Нет")
        userAnswer = readln().toString().toLowerCase()
    }

    listOfContact.forEach {
        println(it)
    }
}

val ANSWER_NO = "нет"