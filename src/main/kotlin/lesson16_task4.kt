fun main() {
    val order = Order(12312312, "Готов к отправке")
    sendRequestToManager("Отправлен", order)
}

class Order(
    private val numberOfOrder: Long,
    private var statusOfOrder: String,
) {
    fun setStatusOfOrder(status: String) {
        statusOfOrder = status
    }

    fun getStatusOrder() = statusOfOrder
    fun getNumberOfOrder() = numberOfOrder
}

fun sendRequestToManager(status: String, order: Order) {
    order.setStatusOfOrder(status)
}