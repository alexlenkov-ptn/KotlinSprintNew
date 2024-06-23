fun main() {
    val point = Point()
    val square = Square()
    val circle = Circle()

    val screen = Screen()
    screen.draw(1,5, point)
    screen.draw(1.05f, 5, square)
    screen.draw(4.01f, 10.54f, circle)
}

abstract class Figure() {
    abstract fun showName() : String
}

class Point() : Figure() {
    val name = "Точка"
    override fun showName() : String {
        return name
    }
}

class Square() : Figure() {
    val name = "Квадрат"
    override fun showName() : String {
        return name
    }
}
class Circle() : Figure() {
    val name = "Круг"
    override fun showName() : String {
        return name
    }
}

class Screen() {
    fun draw(x: Int, y: Int, figure: Figure) {
        println("${figure.showName()} с координатами x=$x и y=$y")
    }
    fun draw(x: Float, y: Float, figure: Figure) {
        println("${figure.showName()} с координатами x=$x и y=$y")
    }
    fun draw(x: Int, y: Float, figure: Figure) {
        println("${figure.showName()} с координатами x=$x и y=$y")
    }
    fun draw(x: Float, y: Int, figure: Figure) {
        println("${figure.showName()} с координатами x=$x и y=$y")
    }
}