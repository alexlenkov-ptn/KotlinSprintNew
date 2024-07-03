fun main() {
    val list: List<String> = listOf(
        "первая строка", "вторая строка", "третья строка", "четвертая строка",
        "пятая строка", "шестая строка")

    val listOfLambda = list.map {
        str: String -> {println("Нажат элемент <$str>")}
    }
    val printEvenNumbers: () -> Unit = {
        for (i in listOfLambda.indices) if (((i + 1) % 2) == 0) listOfLambda[i]()
    }
    printEvenNumbers()
}

