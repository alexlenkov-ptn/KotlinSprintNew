fun main() {
    val order1 = Order()
    order1.orderProduct(1, listOf("Помидор", "Огурцы"))
    val order2 = Order()
    order2.orderProduct(2, "Сахар")
}

class Order() {

    fun orderProduct(
        number: Int,
        nameProduct: String,
    ) {
        println("Заказан товар: <$nameProduct>")
    }

    fun orderProduct(
        number: Int,
        nameProduct: List<String>,
    ) {
        println("Заказаны следующие товары: ${nameProduct}")
    }
}