fun main() {
    val arrayIngredients = arrayOf(POTATO, TOMATO, CARROT, BEEF, SALT, CPICES)

    do {
        for (i in arrayIngredients) {
            println("Ингредиент ${arrayIngredients.indexOf(i) + 1}: $i")
        }

        println("Какой ингредиент вы хотите заменить?")
        val changeIngredient = readln().toString().toLowerCase()
        val indexOfchangeIngredient = arrayIngredients.indexOf(changeIngredient)

        if (indexOfchangeIngredient >= 0) {
            println(
                "Ингредиент $changeIngredient есть в списке. Напишите, пожалуйста, ингредиент на который вы хотите " +
                        "заменить:"
            )
            val userIngredient: String = readln().toString().toLowerCase()
            arrayIngredients.set(indexOfchangeIngredient, userIngredient)
        } else {
            println("Такого ингредиента нет в списке") // нужно вернуться на прошлый шаг ввода ингредиента while
        }
        println("Хотите продолжить? Да / Нет")
        var userAnswer = readln().toString().toLowerCase()
    } while (userAnswer == positiveUserAnswer)

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
const val positiveUserAnswer = "да"