package lesson14_task3

class Rectangle_14_3(
    color: String,
    val width: Double,
    val height: Double,
) : Figure_14_3(color = color) {

    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}