package Lesson_1_to_10

fun main() {
    val positionNumber = 2
    val positionLetter = "D"
    val moveNumber = 5.toString()

    println(
        "Фигура двинулась вперед с позиции $positionLetter${positionNumber.toString()} на позицию " +
                "$positionLetter${(positionNumber + 1).toString()} " +
                "Номер хода: $moveNumber"
    )

    /*
    Задача 4 к Уроку 3.

В приложении шахматы, ходы отправляются на сервер в виде строки формата [откуда-куда;номер хода].
Игрок начал партию ходом из E2 в E4. Все данные (откуда, куда, номер хода) инициализировать и хранить в отдельных переменных.

 – Напиши код, который сформирует строку для отправки, а затем выведет ее в консоль.
 Нужно "собрать" единую строку из объявленных переменных и сохранить в новую переменную (или сразу распечатывать).

 – Далее этим переменным нужно присвоить новые данные и вывести в консоль следующий ход белых.
 Определить, какое значение будет в переменной "куда" для фигуры, стоящей на D2 и продвинувшейся на одну клетку вперед.
     */
}