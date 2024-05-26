import java.util.SortedSet

fun main() {
    val countIngredients = 1..5
    var userIngredient: String = ""
    val sortedSetOfIngredients: SortedSet<String> = sortedSetOf()
    var result: String
        for (i in countIngredients) {
        if (sortedSetOfIngredients.isEmpty()) {
            println("Укажите ингредиент №$i")
            userIngredient = readln().toString().toLowerCase()
            sortedSetOfIngredients.add(userIngredient)
        } else {
            while (i in countIngredients) {
                println("Укажите ингредиент №$i")
                userIngredient = readln().toString().toLowerCase()
                if (sortedSetOfIngredients.contains(userIngredient)) {
                    println("Ингредиент $userIngredient уже был. Введите, пожалуйста, другой")
                    continue
                } else {
                    sortedSetOfIngredients.add(userIngredient)
                    break
                }
            }
        }
    }
    result = sortedSetOfIngredients.joinToString(", ", "","").capitalize()
    println(result)
}

