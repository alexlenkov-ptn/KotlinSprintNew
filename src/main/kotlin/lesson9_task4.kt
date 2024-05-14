fun main() {
    println("Пожалуйста, укажите 5 ингредиентов: ")
    val userFiveIngredients = readln().toString().toLowerCase()
    val mutableListOfFiveIngredients: MutableList<String> = mutableListOf()
    val list = userFiveIngredients.split(delim)

    for(i in list) {
        mutableListOfFiveIngredients.add(i)
    }

    println(mutableListOfFiveIngredients.sorted())

}

const val delim = ", "

/*
Задача 4 к Уроку 9

Напиши программу, которая один раз запрашивает у пользователя пять названий ингредиентов блюда в одной строке,
разделяя их запятыми (с пробелом).

- запроси у пользователя 5 ингредиентов, перечисленных через “, ” (запятая с пробелом) и
сохрани их в список, где каждый ингредиент — отдельный элемент;
- отсортируй полученный список по алфавиту и выведи его в консоль;
- используй тот метод сортировки, который возвращает новую отсортированную коллекцию.
 */