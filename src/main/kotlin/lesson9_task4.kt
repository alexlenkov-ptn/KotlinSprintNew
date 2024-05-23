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