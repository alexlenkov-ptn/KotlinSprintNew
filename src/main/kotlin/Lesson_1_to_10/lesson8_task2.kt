package Lesson_1_to_10

fun main() {
    val arrayIngredients = arrayOf(POTATO, TOMATO, CARROT, BEEF, SALT, CPICES)

    println("Напишите какой ингредиент вы хотите найти:")
    val userIngredient = readln().toString().toLowerCase()

    for (i in arrayIngredients) {
        if (i == userIngredient) {
            return println("Ингредиент $i в рецепте есть")
        }
    }
    println("Такого ингредиента в таблице нет.")
}

const val POTATO = "картошка"
const val TOMATO = "помидор"
const val CARROT = "морковь"
const val BEEF = "говядина"
const val SALT = "соль"
const val CPICES = "специи"
const val MIN_ARRAY_RANGE = 0