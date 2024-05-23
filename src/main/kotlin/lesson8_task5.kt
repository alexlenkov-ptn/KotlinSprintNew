fun main() {
    println("Введите количество ингредиентов: ")
    val userCountIngredients = readln().toInt()
    val arrayIngredients = arrayOfNulls<String>(userCountIngredients)
    var numberOfIngredient = 0

    for (i in MIN_RANGE until userCountIngredients) {
        println("Введите ингредиент №${i + 1}:")
        val userIngredient = readln().toString().toLowerCase()
        arrayIngredients.set(i, userIngredient)
    }

    println("Вы ввели такие ингредиенты:")
    for (i in arrayIngredients) {
        println("Ингредиент №${numberOfIngredient + 1}: $i")
        numberOfIngredient++
    }

}

const val MIN_RANGE = 0

/*
Задача 5* к Уроку 8

Напиши программу, которая должна создавать массив из определенного количества ингредиентов,
которые будет вводить пользователь.

- элементы вводятся по одному;
- перед вводом элементов сначала запрашивается количество планируемых ингредиентов;
- запрещено использовать список или динамический массив.
 */