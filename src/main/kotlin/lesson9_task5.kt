fun main() {
    val countIngredients = 1..5
    var userIngredient: String = ""
    var mutableSetOfIngredients: MutableSet<String> = mutableSetOf()
    var listOfIngredients: List<String>
    var firstElement: String = ""

        for (i in countIngredients) {
        if (mutableSetOfIngredients.isEmpty()) {
            println("Укажите ингредиент №$i")
            userIngredient = readln().toString().toLowerCase()
            mutableSetOfIngredients.add(userIngredient)
        } else {
            while (i in countIngredients) {
                println("Укажите ингредиент №$i")
                userIngredient = readln().toString().toLowerCase()
                if (mutableSetOfIngredients.contains(userIngredient)) {
                    println("Ингредиент $userIngredient уже был. Введите, пожалуйста, другой")
                    continue
                } else {
                    mutableSetOfIngredients.add(userIngredient)
                    break
                }
            }
        }
    }
    mutableSetOfIngredients = mutableSetOfIngredients.sorted().toMutableSet()
    // mutableSetOfIngredients.set(NULL_POSITION, mutableSetOfIngredients[NULL_POSITION].capitalize())
    println(mutableSetOfIngredients)
}

const val NULL_POSITION = 0

