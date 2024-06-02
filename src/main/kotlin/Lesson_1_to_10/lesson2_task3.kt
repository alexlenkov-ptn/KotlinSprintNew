package Lesson_1_to_10

const val COUNT = 60

fun main() {
    var departureHour: Int = 9
    var departureMinute = 39
    var minuteOfTravelSum = 457

    var hoursOfTravel: Int = minuteOfTravelSum / COUNT
    var minuteOfTravel = minuteOfTravelSum - hoursOfTravel * COUNT

    var arrivalHour = departureHour + hoursOfTravel
    var arrivalMinute = departureMinute + minuteOfTravel

    if (arrivalMinute / COUNT == 1) {
        arrivalHour++
        arrivalMinute = arrivalMinute % COUNT
    }

    print("Поезд прибывает в $arrivalHour:$arrivalMinute")



    /*
        Задача 3 к Уроку 2

        Сайт с расписанием поездов получает данные с сервера.
        Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
        Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

         – Создай целочисленные переменные и проинициализируй их этими данными;
         – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
         – Выведи результат в консоль.
     */
}