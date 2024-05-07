

fun main() {
    val conditionSunWeather: Boolean = true
    val conditionOutdoorOwning: Boolean = true
    val conditionHumidity: Int = 20
    val conditionSeason: String = "не зима"

    val todaySunWeather: Boolean = true
    val todayOutdoorOwning: Boolean = true
    val todayHumidity: Int = 20
    val todaySeason: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${conditionSunWeather == todaySunWeather
            && conditionOutdoorOwning == todayOutdoorOwning && conditionHumidity == todayHumidity
            && conditionSeason == todaySeason}")
}


/*
Задача 3 к Уроку 4

На территории агрокомплекса функционирует система автоматического мониторинга условий для роста растений.
Напиши программу, которая будет определять, подходят ли текущие условия для успешного роста бобовых культур.

Критерии благоприятных условий включают:

- наличие солнечной погоды;
- открытый тент;
- влажность воздуха составляет 20%;
- текущее время года - не зима.

Программа должна выводить результат анализа условий в формате:
“Благоприятные ли условия сейчас для роста бобовых? true/false”

Для проверки работы программы, инициализируй переменные следующими значениями:

- погода сегодня - солнечная;
- тент на данный момент - открыт;
- влажность воздуха - 20%;
- текущее время года - зима.

И типами данных - boolean, boolean, int, String.
 */