package Lesson_1_to_10

const val ONE_HUNDRED_PERCENT = 100

fun main() {
    val twentyPercent = 20
    val crystals = 7.0
    val iron = 11.0

    val crystalsBonus = crystals / ONE_HUNDRED_PERCENT * twentyPercent
    val ironBonus = iron / ONE_HUNDRED_PERCENT * twentyPercent

    println(crystalsBonus.toInt())
    println(ironBonus.toInt())




    /*
    Задача 4 к Уроку 2

В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса),
который дает +20% к добытым материалам.
Было добыто 7 кристаллической и 11 железной руды без баффа – заранее известные данные, объявить и проинициализировать.

Напиши программу, которая будет учитывать действие баффа и выводить в консоль количество “бонусных”
(то есть тех материалов, которые даются “сверху” баффом).
По одной строке на материал с его названием.

Если получается нецелое число, то дробная часть должна отбрасываться.
     */
}
