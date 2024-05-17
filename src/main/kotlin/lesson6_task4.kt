fun main() {
    val countRandom = (LOWER_RANGE..UPPER_RANGE).random()
    var countResult: Int
    var tries = 5

    do {
        println("Количество попыток: $tries")
        Thread.sleep(HALF_SECOND)
        println("Введите загадываемое число")
        countResult = readln().toInt()

        tries--
        if (countRandom == countResult) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно!")
        }
    } while (tries != 0 && countRandom != countResult)

}

const val LOWER_RANGE = 1
const val UPPER_RANGE = 9
const val HALF_SECOND: Long = 500


/*
Задача 4 к Уроку 6

Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9.
Игроку дается 5 попыток, чтобы угадать это число.

 – если игрок угадывает число, выводится сообщение “Это была великолепная игра!” и программа завершает работу;
 – если не угадывает, то отображается "Неверно" или что-то на твое усмотрение и оставшееся количество попыток;
 – после истечения попыток выводится сообщение “Было загадано число N”.
 */