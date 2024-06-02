package Lesson_1_to_10

const val RECOMMEND_DAMAGE = false
const val RECOMMEND_COUNT_CREW_MIN = 55
const val RECOMMEND_COUNT_CREW_MAX = 70
const val RECOMMEND_BOXES = 50
const val RECOMMEND_WEATHER_IS_GOOD = false

const val ALTERNATIVE_DAMAGE = true
const val ALTERNATIVE_COUNT_CREW = 70
const val ALTERNATIVE_BOXES = 50
const val ALTERNATIVE_WEATHER_IS_GOOD = true

fun main() {
    val realDamage = true
    val realCountCrew = 70
    val realBoxes = 50
    val realWeatherIsGood = true

    println(
        "Корабль может отправиться в плавание: " +
                "${
                    (RECOMMEND_DAMAGE == realDamage // корабль не имеет повреждений
                            && (RECOMMEND_COUNT_CREW_MIN <= realCountCrew || RECOMMEND_COUNT_CREW_MAX >= realCountCrew) &&
                            //число экипажа составляет от 55 до 70 человек (включительно)
                            RECOMMEND_BOXES < realBoxes &&
                            // на борту есть более 50 ящиков провизии
                            (RECOMMEND_WEATHER_IS_GOOD == realWeatherIsGood || 
                                    RECOMMEND_WEATHER_IS_GOOD != realWeatherIsGood)) ||
                            // погода благоприятная или неблагоприятная

                            (ALTERNATIVE_DAMAGE == realDamage &&  // наличие незначительных повреждений
                            ALTERNATIVE_COUNT_CREW == realCountCrew &&  // на борту рекомендованный состав экипажа - 70 человек;
                            ALTERNATIVE_WEATHER_IS_GOOD == realWeatherIsGood &&  // погода благоприятна
                            ALTERNATIVE_BOXES <= realBoxes) //  на борту есть 50 и более ящиков провизии
                }"
    )
}

/*
Задача 5* к Уроку 4

Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих условий:
- корабль не имеет повреждений;
- число экипажа составляет от 55 до 70 человек (включительно);
- на борту есть более 50 ящиков провизии;
- погода благоприятная или неблагоприятная.

Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:
- на борту рекомендованный состав экипажа - 70 человек;
- погода благоприятна;
- на борту есть 50 и более ящиков провизии.

В качестве входных данных используй информацию, введенную через консоль:
- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Напиши программу, которая будет определять, может ли корабль отправиться в плавание.
Программа должна анализировать эти данные и выводить результат в консоль.
Для анализа должно использоваться единое составное условие, состоящее только из логических операторов.
 */