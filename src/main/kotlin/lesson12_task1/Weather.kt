package lesson12_task1

class Weather() {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var isRain: Boolean = false

    fun printWeather() {
        println("дневная температура: $dayTemperature \n" +
                "ночная температура: $nightTemperature \n" +
                "наличие осадков в течение суток: $isRain")
    }
}