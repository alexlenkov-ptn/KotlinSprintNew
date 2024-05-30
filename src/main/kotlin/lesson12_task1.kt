fun main() {
    var fridayWeather = Weather()
    fridayWeather.dayTemperature = 35
    fridayWeather.nightTemperature = 20
    fridayWeather.isRain = false
    fridayWeather.printWeather()

    println()

    var sundayWeather = Weather()
    sundayWeather.dayTemperature = 25
    sundayWeather.nightTemperature = 15
    sundayWeather.isRain = true
    sundayWeather.printWeather()
}