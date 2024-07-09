fun main() {
    val dataBook1 = DataBook("Пушкин", "Евгений Онегин", 1831)

    val (name, author, yearOfRelease) = dataBook1

    println("$name\n" +
            "$author\n" +
            "$yearOfRelease")
}

data class DataBook(
    val name: String,
    val author: String,
    val yearOfRelease: Int,
)