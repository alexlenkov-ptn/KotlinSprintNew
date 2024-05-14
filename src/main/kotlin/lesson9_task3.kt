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

/*
Напиши программу, которая будет рассчитывать сколько потребуется ингредиентов для разного количества порций блюда.
Для примера возьмем рецепт омлета. Для одной порции нужно: яиц – 2шт., молока – 50 мл, сливочного масла – 15 гр.

 – создай список с количеством ингредиентов для 1 блюда
 (где под индексами располагается количество для яиц/молока/масла соответственно);

 – запроси у пользователя количество порций;

 – модернизировать список таким образом, чтобы вывести в консоль сообщение с количеством нужных ингредиентов такого
 типа: “На [количество_порций] порций вам понадобится: Яиц – n, молока – n1, сливочного масла – n2]”.
 */