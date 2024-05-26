package lesson12_task3

class Weather (val dayTemperatureKelvin: Int,
               val nightTemperatureKelvin: Int,
               val isRain: Boolean,) {

    val dayTemperatureCelsium: Int = dayTemperatureKelvin - KELVIN_TO_CELSIUM.toInt()
    val nightTemperatureCelsium: Int = nightTemperatureKelvin - KELVIN_TO_CELSIUM.toInt()


    init {
        println("дневная температура в цельсиях: $dayTemperatureCelsium \n" +
                "ночная температура в цельсиях: $nightTemperatureCelsium \n" +
                "наличие осадков в течение суток: $isRain")
    }

    fun printWeather() {
        println("дневная температура в цельсиях: $dayTemperatureCelsium \n" +
                "ночная температура в цельсиях: $nightTemperatureCelsium \n" +
                "наличие осадков в течение суток: $isRain")
    }
}

const val KELVIN_TO_CELSIUM = 273.15
