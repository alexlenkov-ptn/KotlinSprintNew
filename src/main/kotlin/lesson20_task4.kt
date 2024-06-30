fun main() {
    val list: List<String> = listOf(
        "первая строка", "вторая строка", "третья строка", "четвертая строка",
        "пятая строка"
    )
    val lambda: (String) -> String = { "Нажат элемент <$it>" }
    list.map {
        val index = list.indexOf(it) + 1
        if (index % 2 == 0) println(lambda(it))
    }
}

