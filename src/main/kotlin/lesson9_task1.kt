fun main() {
    val listIngredients = listOf(POTATO, TOMATO, CARROT, BEEF, SALT, CPICES)

    println("В рецепте есть следующие ингредиенты:")

    listIngredients.forEach() {
        println(it)
    }
}

const val POTATO = "картошка"
const val TOMATO = "помидор"
const val CARROT = "морковь"
const val BEEF = "говядина"
const val SALT = "соль"
const val CPICES = "специи"