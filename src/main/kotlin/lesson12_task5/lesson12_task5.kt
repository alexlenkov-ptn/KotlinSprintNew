package lesson12_task5

import kotlin.random.Random


fun main() {
    val listWeatherDays: MutableList<Weather_12_5> = mutableListOf()
    createListOfDays(listWeatherDays) // коллекция из 30 дней с данными о погоде
    val listDayOfTemperature: List<Int> = listWeatherDays.map { it.dayTemperature }
    val listNightOfTemperature: List<Int> = listWeatherDays.map { it.nightTemperature }
    val listDayOfRain: List<Boolean> = listWeatherDays.map { it.isRain }
    val listRainDays: List<Boolean> = listDayOfRain.filter { it == true }

    println("Средняя дневная температура: ${listDayOfTemperature.average()} \n" +
            "Средняя ночная температура: ${listNightOfTemperature.average()} \n" +
            "Дней с осадками: ${listRainDays.size} \n")
}


fun createListOfDays(listWeatherDays: MutableList<Weather_12_5>) {
    val rangeDaysOfMonth = 1..30
    for (i in rangeDaysOfMonth) {
        listWeatherDays.add(createDaysOfTemperature())
    }
}

fun createDaysOfTemperature(): Weather_12_5 {
    val dayTemperature: Int = Random.nextInt(10, 41) // 10 to 50
    val nightTemperature = Random.nextInt(-20, 21) // -20 to 21
    val isRain = Random.nextBoolean()
    val dayWeather = Weather_12_5(dayTemperature, nightTemperature, isRain)
    return dayWeather
}

