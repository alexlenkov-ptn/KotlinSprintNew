fun main() {
    println("Введите первое число")
    val firstCount = readln().toInt()
    println("Введите второе число")
    val secondCount = readln().toInt()
    println("Введите сумму чисел $firstCount и $secondCount")
    val result = readln().toInt()

    if (result == (firstCount + secondCount)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }


}


/*
Задача 1 к Уроку 5

Нужно написать часть модуля для авторизации пользователя. Для входа в приложение пользователь должен доказать,
что он не бот.
Для этого программа предлагает решить простой математический пример – сложить два числа (сообщить об этом пользователю).

Имитируй эти действия в консоли, путем считывания данных с клавиатуры.
При успешном решении вход в программу символизируется сообщением “Добро пожаловать!".
В противном случае вывести сообщение "Доступ запрещен."
 */