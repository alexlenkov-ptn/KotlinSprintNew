package Lesson_1_to_10

const val ONE_SECOND: Long = 1000

fun main() {
    println("Введите количество секунд для таймера")
    val timerSeconds: Long = readln().toLong()
    val seconds: Long = timerSeconds * ONE_SECOND
    Thread.sleep(seconds)
    println("Прошло $timerSeconds сек.")
}