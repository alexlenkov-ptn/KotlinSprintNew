package lesson14

const val PI = 3.14
const val BLACK = "black"
const val WHITE = "white"

fun main() {
    val blackCircle: Circle_14_3 = Circle_14_3(BLACK, 14.0)
    val whiteCircle: Circle_14_3 = Circle_14_3(WHITE, 28.0)

    val blackRectangle: Rectangle_14_3 = Rectangle_14_3(BLACK, 5.0, 10.0)
    val whiteRectangle: Rectangle_14_3 = Rectangle_14_3(WHITE, 16.0, 20.0)

    val list: List<Figure_14_3> = listOf(blackCircle, whiteCircle, blackRectangle, whiteRectangle)

    var sumOfPerimeterBlackFigures: Double = 0.0
    var sumOfAreaWhiteFigures: Double = 0.0

    list.forEach() {
        if (it.color == BLACK) {
            sumOfPerimeterBlackFigures += it.calculatePerimeter()
        }
        if (it.color == WHITE) {
            sumOfAreaWhiteFigures += it.calculateArea()
        }
    }

    println(sumOfPerimeterBlackFigures)
    println(sumOfAreaWhiteFigures)
}

abstract class Figure_14_3(
    val color: String
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

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