package Lesson_1_to_10

fun main() {

    var studentsMark1 = 3
    var studentsMark2 = 4
    var studentsMark3 = 3
    var studentsMark4 = 5
    var countStudents = 4
    print(String.format("%.2f", ((studentsMark1 + studentsMark2 + studentsMark3 + studentsMark4).toFloat() / countStudents)))

}


/*
Задача 1 к Уроку 2

Задача на среднее арифметическое. В классе с углубленным изучением английского языка учится 4 человека.
У них следующие баллы по профильному предмету 3, 4, 3, 5.
Пишем часть школьного софта, который посчитает средний балл по английскому для этого класса.

 – Написать выражение, которое высчитывает средний балл;
 – Распечатать результат в консоль;
 – В консоли должно быть выведено дробное число с 2 знаками после запятой.
 */