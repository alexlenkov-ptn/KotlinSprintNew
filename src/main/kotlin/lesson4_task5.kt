

fun main() {
    val recommendDamage = false
    val recommendCountCrewMin = 55
    val recommendCountCrewMax = 70
    val recommendBoxes = 50
    val recommendWeatherIsGood = false

    val alternativeDamage = true
    val alternativeCountCrew = 70
    val alternativeBoxes = 50
    val alternativeWeatherIsGood = true

    val realDamage = true
    val realCountCrew = 70
    val realBoxes = 50
    val realWeatherIsGood = true

    println("Корабль может отправиться в плавание: " +
            "${ (recommendDamage == realDamage // корабль не имеет повреждений
                    && (recommendCountCrewMin <= realCountCrew || recommendCountCrewMax >= realCountCrew)
                    //число экипажа составляет от 55 до 70 человек (включительно)
                    && recommendBoxes < realBoxes
                    // на борту есть более 50 ящиков провизии
                    && (recommendWeatherIsGood == realWeatherIsGood || recommendWeatherIsGood != realWeatherIsGood))
                    // погода благоприятная или неблагоприятная
                    
                    || (alternativeDamage == realDamage // наличие незначительных повреждений
                    && alternativeCountCrew == realCountCrew // на борту рекомендованный состав экипажа - 70 человек;
                    && alternativeWeatherIsGood == realWeatherIsGood // погода благоприятна
                    && alternativeBoxes <= realBoxes) //  на борту есть 50 и более ящиков провизии
            }")

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