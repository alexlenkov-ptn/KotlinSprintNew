fun main() {
    val list: List<String> = listOf(
        "первая строка", "вторая строка", "третья строка", "четвертая строка",
        "пятая строка")

    val listOfLambda: List<String> = list.map {
        val lambda: (String) -> String = {"Нажат элемент <$it>"}
        lambda(it)
    }

    val printEvenNumbers: () -> Unit = {
        for (i in listOfLambda.indices) if (((i + 1) % 2) == 0) println(listOfLambda[i])
    }
    printEvenNumbers()
}

