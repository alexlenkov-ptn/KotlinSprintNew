package Lesson_1_to_10

fun main() {
    println("Пожалуйста, укажите 5 ингредиентов: ")
    val userFiveIngredients = readln().toString().toLowerCase()
    val list = userFiveIngredients.split(delim)
    println(list.sorted())
}

const val delim = ", "