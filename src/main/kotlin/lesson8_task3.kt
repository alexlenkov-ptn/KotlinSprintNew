fun main() {
    val arrayIngredients = arrayOf(POTATO, TOMATO, CARROT, BEEF, SALT, CPICES)

    println("Напишите какой ингредиент вы хотите найти:")
    val userIngredient = readln().toString().toLowerCase()

    if(userIngredient in arrayIngredients) {
        println("Ингредиент $userIngredient есть в таблице")
    } else {
        println("Такого ингредиента нет в таблице")
    }
}

const val POTATO = "картошка"
const val TOMATO = "помидор"
const val CARROT = "морковь"
const val BEEF = "говядина"
const val SALT = "соль"
const val CPICES = "специи"