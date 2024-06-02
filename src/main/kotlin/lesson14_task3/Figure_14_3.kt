package lesson14_task3

abstract class Figure_14_3(
    val color: String
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}