fun main() {
    val listIngredients = mutableListOf(POTATO, TOMATO, CARROT, BEEF, SALT, CPICES)
    var userAnswer = ""
    var userIngredient: String
    println("В рецепте есть базовые ингредиенты:")

    for (i in listIngredients) println(i)

    println("Желаете добавить что-то ещё? - Да / Нет")

    while (userAnswer != ANSWER_YES) {
        userAnswer = readln().toString().toLowerCase()
        if (userAnswer == ANSWER_YES) {
            println("Какой ингредиент вы хотите добавить?")
            userIngredient = readln().toString().toLowerCase()
            listIngredients.add(userIngredient)
        } else if (userAnswer == ANSWER_NOT) {
            break
        } else {
            println("Введите, пожалуйста, ответ: \"Да\" или \"Нет\"")
            continue
        }
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
const val ANSWER_NOT = "нет"

/*
Задача 2 к Уроку 9

Создай новый список ингредиентов, состоящий из 3 шт.
Нужно расширить функционал программы – пусть у пользователя будет возможность добавить к базовым ингредиентам
из списка еще один свой.

- после создания базового списка, выведи его в консоль:
"В рецепте есть базовые ингредиенты: [базовый_список_ингредиентов]";

- затем сообщи о возможности добавить свой: "Желаете добавить еще?” и активировать ввод с консоли;

- если пользователь ввел “нет” или что-то иное – заверши программу, если пользователь ввел “да” –
запроси: "Какой ингредиент вы хотите добавить?";

- добавь считанное значение в базовый список;

- в конце выведи сообщение со списком всех элементов такого типа:

"Теперь в рецепте есть следующие ингредиенты: [список_ингредиентов]".
 */