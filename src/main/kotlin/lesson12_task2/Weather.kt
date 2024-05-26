package lesson12_task2

    class Weather(
        _dayTemperature: Int,
        _nightTemperature: Int,
        _isRain: Boolean,
        ) {
        var dayTemperature: Int = _dayTemperature
        var nightTemperature: Int = _nightTemperature
        var isRain: Boolean = _isRain

        fun printWeather() {
            println("дневная температура: $dayTemperature \n" +
                    "ночная температура: $nightTemperature \n" +
                    "наличие осадков в течение суток: $isRain")
        }
    }