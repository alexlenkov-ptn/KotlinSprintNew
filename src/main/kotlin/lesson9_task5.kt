fun main() {
    val countIngredients = 1..5
    var userIngredient: String = ""
    var mutableListOfIngredients: MutableList<String> = mutableListOf()

    for (i in countIngredients) {
        if (mutableListOfIngredients.isEmpty()) {
            println("Укажите ингредиент №$i")
            userIngredient = readln().toString().toLowerCase()
            mutableListOfIngredients.add(userIngredient)
        } else {
            while (true) {
                println("Укажите ингредиент №$i")
                userIngredient = readln().toString().toLowerCase()
                if (mutableListOfIngredients.contains(userIngredient)) {
                    println("Ингредиент $userIngredient уже был. Введите, пожалуйста, другой")
                    continue
                } else {
                    mutableListOfIngredients.add(userIngredient)
                    break
                }
            }
        }
    }


    mutableListOfIngredients = mutableListOfIngredients.sorted().toMutableList()

    mutableListOfIngredients.set(NULL_POSITION, mutableListOfIngredients[NULL_POSITION].capitalize())

    println(mutableListOfIngredients)

}

const val NULL_POSITION = 0

