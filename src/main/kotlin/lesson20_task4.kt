fun main() {
    val list: List<String> = listOf(
        "первая строка", "вторая строка", "третья строка", "четвертая строка",
        "пятая строка")
    val lambda: (String) -> String = {"Нажат элемент <$it>"}
    val listOfLambda: List<String> = list.map {
        lambda(it)
    }

    listOfLambda.forEach() {

    }

}

