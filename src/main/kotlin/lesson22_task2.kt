fun main() {
    val regularBook1 = RegularBook("Пушкин", "Евгений Онегин")
    val dataBook1 = DataBook("Пушкин", "Евгений Онегин")

    println(regularBook1)

    // Тут получим в консоли ссылку на объект, поскольку это стандартный класс и функция toString не
    // переопределена. Поэтому возвращается имя класса и хэшкод объекта

    println(dataBook1)

    // Тут получим значение класса, потому что класс имеет вид data
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)