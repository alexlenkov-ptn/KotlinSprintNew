fun main() {
    val arrayIngredients = arrayOf(POTATO, TOMATO, CARROT, BEEF, SALT, CPICES)

    do {
        for (i in arrayIngredients) {
            println("Ингредиент ${arrayIngredients.indexOf(i) + 1}: $i")
        }

        println("Какой ингредиент вы хотите заменить?")
        val changeIngredient = readln().toString().toLowerCase()

        if (arrayIngredients.indexOf(changeIngredient) >= 0) {
            println(
                "Ингредиент $changeIngredient есть в списке. Напишите, пожалуйста, ингредиент на который вы хотите " +
                        "заменить:"
            )
            val userIngredient: String = readln().toString().toLowerCase()
            arrayIngredients.set(arrayIngredients.indexOf(changeIngredient), userIngredient)
            break
        } else {
            println("Такого ингредиента нет в списке") // нужно вернуться на прошлый шаг ввода ингредиента while
            continue
        }
    } while (true)

    for (i in arrayIngredients) {
        println("Ингредиент ${arrayIngredients.indexOf(i) + 1}: $i")
    }
}

const val POTATO = "картошка"
const val TOMATO = "помидор"
const val CARROT = "морковь"
const val BEEF = "говядина"
const val SALT = "соль"
const val CPICES = "специи"