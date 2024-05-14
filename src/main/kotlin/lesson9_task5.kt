fun main() {
    val countIngredients = 1..5
    var userIngredient: String = ""
    val mutableListOfIngredients: MutableList<String> = mutableListOf()

    for (i in countIngredients) {
        if (mutableListOfIngredients.isEmpty()) {
            println("Укажите ингредиент №$i")
            userIngredient = readln().toString().toLowerCase()
            mutableListOfIngredients.add(userIngredient)
        }else{
            while (true) {
                println("Укажите ингредиент №$i")
                userIngredient = readln().toString().toLowerCase()
                if (mutableListOfIngredients.contains(userIngredient)) {
                    println("Ингредиент $userIngredient уже был. Введите, пожалуйста, другой")
                    continue
                }else {
                    mutableListOfIngredients.add(userIngredient)
                    break
                }
            }
        }
    }
    mutableListOfIngredients.sorted()
    mutableListOfIngredients[NULL_POSITION].capitalize() // ВОТ тут нужно разобраться непонятно почему не тянется

    println(mutableListOfIngredients)

}

const val NULL_POSITION = 0

/*
Задача 5* к Уроку 9

Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

- результат должен исключать повторы;
- список должен выводиться в алфавитном порядке;

- все элементы списка выведены в одну строку, разделяя слова запятыми;
- первый элемент должен быть распечатан с заглавной буквы.
 */