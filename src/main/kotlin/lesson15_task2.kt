fun main() {
    val todayTemperature = Temperature(35)
    val todayPrecipitationAmount = PrecipitationAmount(1)
    val weatherServer = WeatherServer()
    weatherServer.addStat(todayTemperature)
    weatherServer.addStat(todayPrecipitationAmount)

    println(weatherServer.mutableMapStat)
}

abstract class WeatherStationStats()

class Temperature(_count: Int) : WeatherStationStats() {
    val count = _count
}

class PrecipitationAmount(_count: Int) : WeatherStationStats() {
    val count = _count
}

class WeatherServer() {
    val mutableMapStat: MutableMap<String, Int> = mutableMapOf()
    val temperatureName = "Температура"
    val precipitationAmountName = "Количество осадков"
    fun addStat(stats: WeatherStationStats) {
        if (stats is Temperature) {
            mutableMapStat[temperatureName] = stats.count
        } else if (stats is PrecipitationAmount) {
            mutableMapStat[precipitationAmountName] = stats.count
        } else {
            println("Мы не знаем что это такое")
        }
    }
}


