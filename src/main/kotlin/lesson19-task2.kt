fun main() {
    val product = Product("Брюки", 1, Category.CLOTHES)
    product.showProductInfo()
}

enum class Category() {
    CLOTHES,
    CHANCELLERY,
    DIFFERENT,
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun showProductInfo() {
        println(
            "Товар: $name\n" +
                    "Идентификатор товара: $id\n" +
                    "Категория товар: ${getCategoryName(category)}"
        )
    }
}

fun getCategoryName(category: Category): String {
    val name: String
    when (category) {
        Category.CLOTHES -> name = "Одежда"
        Category.CHANCELLERY -> name = "Канцелярские товары"
        Category.DIFFERENT -> name = "Разное"
    }
    return name
}