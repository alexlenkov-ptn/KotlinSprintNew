fun main() {
    val listIngredients = mutableListOf(POTATO, TOMATO, CARROT, BEEF, SALT, CPICES)
    var userAnswer = ""
    var userIngredient: String
    println("В рецепте есть базовые ингредиенты:")

    for (i in listIngredients) println(i)

    println("Желаете добавить что-то ещё? - Да / Нет")
    userAnswer = readln().toString().toLowerCase()

    while (userAnswer.equals(ANSWER_YES, ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        userIngredient = readln().toString().toLowerCase()
        listIngredients.add(userIngredient)
        println("Желаете добавить что-то ещё? - Да / Нет")
        userAnswer = readln().toString().toLowerCase()
    }

    for (i in listIngredients) println(i)

}

const val POTATO = "картошка"
const val TOMATO = "помидор"
const val CARROT = "морковь"
const val BEEF = "говядина"
const val SALT = "соль"
const val CPICES = "специи"
const val ANSWER_YES = "да"