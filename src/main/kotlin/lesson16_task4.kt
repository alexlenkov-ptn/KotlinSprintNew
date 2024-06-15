fun main() {
    val order = Order(12312312, "Готов к отправке")
    order.sendRequestToManager("Отправлен", order)
    println(order.getStatusOrder())
}

class Order(
    private val numberOfOrder: Long,
    private var statusOfOrder: String,
) {
    private fun setStatusOfOrder(status: String) {
        statusOfOrder = status
    }

    fun sendRequestToManager(status: String, order: Order) {
        order.setStatusOfOrder(status)
    }

    fun getStatusOrder() = statusOfOrder
    fun getNumberOfOrder() = numberOfOrder
}

