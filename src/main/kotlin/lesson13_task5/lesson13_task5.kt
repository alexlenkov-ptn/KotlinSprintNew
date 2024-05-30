package lesson13_task5

fun main() {
    var userAnswer: String = ""
    val listOfContact: List<TelephoneList> = listOf()

    println("Введите номер телефона:")
    val number = readln().toString()
    try {
        number.toLong()
    } catch (e: Exception) {
        println(e)
    }

    println("Введите имя:")
    val name = readln().toString().capitalize()
    number.toLong()

    println("Введите название компании:")
    val company = readln()?.toString() ?: null
}