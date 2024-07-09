fun main() {
    val regularBook1 = RegularBook("Пушкин", "Евгений Онегин")
    val regularBook2 = RegularBook("Пушкин", "Евгений Онегин")

    val dataBook1 = DataBook("Пушкин", "Евгений Онегин")
    val dataBook2 = DataBook("Пушкин", "Евгений Онегин")

    println(regularBook1 == regularBook2)
    // Получаем false, потому что сравниваются ссылки, которые разные
    println(dataBook1 == dataBook2)
    // Получаем true, т.к. сравниваются проинициализированные данные, т.е. сравнение по значению

    println(regularBook1)
    println(regularBook2)

    // Тут увидим, что консоль выведет разные ссылки

    println(dataBook1)
    println(dataBook2)

    // Тут увидим, что консоль выведет одинаковые значения с учётом того, что объекты разные
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)