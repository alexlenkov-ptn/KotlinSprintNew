package lesson12_task2

    class Weather(
        var dayTemperature: Int,
        var nightTemperature: Int,
        var isRain: Boolean,
        ) {

        fun printWeather() {
            println("дневная температура: $dayTemperature \n" +
                    "ночная температура: $nightTemperature \n" +
                    "наличие осадков в течение суток: $isRain")
        }
    }