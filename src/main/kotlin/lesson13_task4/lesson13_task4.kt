package lesson13_task4

fun main() {
    var userAnswer: String = ""
    val listOfContact: List<TelephoneList> = listOf()

    while (userAnswer != ANSWER_NO) {
        println("Введите номер телефона:")
        val name = readln().toString().capitalize()
        val number = readln().toLongOrNull() ?: println("Вы не ввели номер телефона")
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