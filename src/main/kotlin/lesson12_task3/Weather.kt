package lesson12_task3

class Weather (dayTemperatureKelvin: Int,
               nightTemperatureKelvin: Int,
               isRain: Boolean,) {

    val dayTemperatureCelsium: Int = dayTemperatureKelvin - KELVIN_TO_CELSIUM.toInt()
    val nightTemperatureCelsium: Int = nightTemperatureKelvin - KELVIN_TO_CELSIUM.toInt()
    val isRain: Boolean = isRain

    fun printWeather() {
        println("дневная температура в цельсиях: $dayTemperatureCelsium \n" +
                "ночная температура в цельсиях: $nightTemperatureCelsium \n" +
                "наличие осадков в течение суток: $isRain")
    }
}

const val KELVIN_TO_CELSIUM = 273.15
