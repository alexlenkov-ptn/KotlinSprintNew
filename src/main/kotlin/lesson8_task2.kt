fun main() {
    val arrayIngredients = arrayOf(POTATO, TOMATO, CARROT, BEEF, SALT, CPICES)

    println("Напишите какой ингредиент вы хотите найти:")
    val userIngredient = readln().toString().toLowerCase()

    for (i in MIN_ARRAY_RANGE..(arrayIngredients.size - 1)) {
        if (arrayIngredients[i] == userIngredient) {
            println("Ингредиент ${arrayIngredients[i]} в рецепте есть")
            break
        } else if ((arrayIngredients[i] != userIngredient) && (i == (arrayIngredients.size - 1))) {
            println("Такого ингредиента в таблице нет.")
        }
    }
}

const val POTATO = "картошка"
const val TOMATO = "помидор"
const val CARROT = "морковь"
const val BEEF = "говядина"
const val SALT = "соль"
const val CPICES = "специи"
const val MIN_ARRAY_RANGE = 0