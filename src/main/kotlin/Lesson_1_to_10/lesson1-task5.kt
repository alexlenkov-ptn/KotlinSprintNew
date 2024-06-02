package Lesson_1_to_10

fun main() {

    val second = 6480
    val count = 60

    // 6480 / 60 = 108 min
    // 6480 % 60 = 0
    // 108 / 60 = 1 h
    // 108 % 60 = 48 min

    var minutesSpend = second / count
    var secondsSpend = second % count
    var hoursSpend = minutesSpend / count
    minutesSpend = minutesSpend % count

    var hoursSpendString: String = hoursSpend.toString()
    var minuteSpendString: String = minutesSpend.toString()
    var secondsSpendString: String = secondsSpend.toString()

    if (hoursSpendString.length < 2) {
        hoursSpendString = "0" + hoursSpendString
    }

    if (minuteSpendString.length < 2) {
        minuteSpendString = "0" + minuteSpendString
    }

    if (secondsSpendString.length < 2) {
        secondsSpendString = "0" + secondsSpendString
    }

    println("%s:%s:%s".format(hoursSpendString, minuteSpendString, secondsSpendString))

}

/*
Задача 5* к Уроку 1

Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */