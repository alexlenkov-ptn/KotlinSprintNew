import java.text.DecimalFormat

fun main() {
    val circle = Circle()
    circle.setRadius(5.0)
    circle.getAreaOfCircle()
    circle.getLengthOfCircle()
}

class Circle() {
    private val pi = 3.14
    private var radius: Double = 0.0
    private val df = DecimalFormat("#.##")

    fun setRadius(radius: Double) {
        this.radius = radius
    }

    fun getLengthOfCircle() {
        val lengthOfCircle = 2 * pi * radius
        println(df.format(lengthOfCircle))
    }

    fun getAreaOfCircle() {
        val areaOfCircle = pi * Math.pow(radius, 2.0)
        println(df.format(areaOfCircle))
    }

}