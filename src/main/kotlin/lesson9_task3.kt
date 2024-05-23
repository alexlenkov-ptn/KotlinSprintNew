fun main() {
    val listOfIgredientsDefault = mutableListOf(COUNTS_OF_EGGS, COUNTS_OF_MILK, COUNTS_OF_BUTTER)
    var numberOfServing: Int

    println("Укажите количество порций для омлета:")
    numberOfServing = readln().toInt()
    val listOfIgredientsNew = listOfIgredientsDefault.map {
        it * numberOfServing
    }

    println(
        "На $numberOfServing кол-во порций вам понадобится: " +
                "Яиц - ${listOfIgredientsNew[0]} шт., молока - ${listOfIgredientsNew[1]} мл., " +
                "сливочного масла - ${listOfIgredientsNew[2]} гр."
    )
}

const val COUNTS_OF_EGGS = 2
const val COUNTS_OF_MILK = 50
const val COUNTS_OF_BUTTER = 15