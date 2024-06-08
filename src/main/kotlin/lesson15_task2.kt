fun main() {
    val weatherServer: WeatherServer = WeatherServer()

}

abstract class WeatherStationStats() {
    val listT: MutableList<Temperature> = mutableListOf()
    val listP: MutableList<PrecipitationAmount> = mutableListOf()
}

class Temperature(val count: Int) : WeatherStationStats() {

}

class PrecipitationAmount(val count: Int) : WeatherStationStats() {

}

class WeatherServer(stat: WeatherStationStats) {
    // сюда должны прилетать данные
    val list: MutableList<WeatherStationStats> = mutableListOf()
}

/*
Задача 2 к Уроку 15

Необходимо разработать простую систему мониторинга погодных условий,
которая будет собирать данные о температуре и количестве осадков.

Создай абстрактный класс WeatherStationStats. Он будет служить родителем для классов-объектов погодных данных:
Temperature и PrecipitationAmount.

Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer.
Метод отправки сообщения должен определять тип переданного сообщения и в зависимости от результата передавать
соответствующие данные.

Создай по одному объекту для разных типов погодных данных и протестируй работу программы.
 */


