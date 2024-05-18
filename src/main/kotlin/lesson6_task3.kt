const val ONE_SECOND: Long = 1000

fun main() {
    println("Введите количество секунд для таймера")
    val timerSeconds: Int = readln().toInt()
    var i = 0

    while (i <= timerSeconds) {
        Thread.sleep(ONE_SECOND)
        println("Осталось секунд: ${timerSeconds - i}")
        i++
    }
    println("Время вышло")
}