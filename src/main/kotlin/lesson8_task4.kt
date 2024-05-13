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

/*
Задача 4 к Уроку 8

Представим, что мы получили массив ингредиентов.
Программа должна распечатать весь список ингредиентов, затем заменить нужный ингредиент на новый по желанию пользователя.
После этого программа должна показать обновленный список.

 – создай массив со списком ингредиентов и напечатай его в консоль;
 – запроси у пользователя информацию об ингредиенте, который он хочет заменить;
 – если пользователь ввел ингредиент, которого нет в списке, вывести соответствующее сообщение;
 – если есть, запроси ингредиент, который пользователь хотел бы добавить;
 – выведи обновленный список с сообщением: “Готово! Вы сохранили следующий список: [список_ингредиентов]”.
 */