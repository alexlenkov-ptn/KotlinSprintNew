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

/*
Задача 1 к Уроку 9

Продолжи разработку приложения с рецептами, но с реализацией через список.
Создай список ингредиентов блюда в виде списка, инициализируй любыми значениями.

 – выведи в консоль сообщение: "В рецепте есть следующие ингредиенты: [список_ингредиентов]";
 – выведи все ингредиенты, каждый с новой строки.
 */