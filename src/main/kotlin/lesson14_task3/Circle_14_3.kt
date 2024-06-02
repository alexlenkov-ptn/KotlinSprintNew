package lesson14_task3

class Circle_14_3(
    color: String,
    val radius: Double,
) : Figure_14_3(color = color) {

    override fun calculateArea(): Double {
        return PI * Math.pow(radius, 2.0)
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

const val PI = 3.14