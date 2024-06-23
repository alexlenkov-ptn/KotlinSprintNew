fun main() {
    val product = Product("Брюки", 1, Category.CLOTHES)
    product.showProductInfo()
}

enum class Category() {
    CLOTHES {
        override fun getName(): String {
            return "Одежда"
        }
    },
    CHANCELLERY {
        override fun getName(): String {
            return "Канцелярские товары"
        }
    },
    DIFFERENT {
        override fun getName(): String {
            return "Разное"
        }
    };

    abstract fun getName(): String
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
                    "Категория товара: ${category.getName()}"
        )
    }
}