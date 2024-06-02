package Lesson_1_to_10

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME_MAX = 100

fun main() {
    val goodsWeightFirst = 20
    val goodsVolumeFirst = 80
    val goodsWeightSecond = 50
    val goodsVolumeSecond = 100

    println(
        "Груз с весом $goodsWeightFirst кг и объемом $goodsVolumeFirst л соответствует категории 'Average': " +
                "${
                    (goodsWeightFirst >= Lesson_1_to_10.AVERAGE_WEIGHT_MIN &&
                            goodsWeightFirst <= Lesson_1_to_10.AVERAGE_WEIGHT_MAX) &&
                            goodsVolumeFirst < Lesson_1_to_10.AVERAGE_VOLUME_MAX
                }\n" +
                "Груз с весом $goodsWeightSecond кг и объемом $goodsVolumeSecond л соответствует категории 'Average': "
                +
                "${
                    (goodsWeightSecond >= Lesson_1_to_10.AVERAGE_WEIGHT_MIN &&
                            goodsWeightSecond <= Lesson_1_to_10.AVERAGE_WEIGHT_MAX) &&
                            Lesson_1_to_10.AVERAGE_VOLUME_MAX < goodsVolumeSecond
                }"
    )
}

/*
Задача 2 к Уроку 4

При работе на таможенном терминале важно точно определить категорию каждого груза. Напиши программу,
которая проверяет, соответствует ли груз категории "Average".
Эта категория имеет следующие параметры: вес от 35 кг до 100 кг (включительно), и объем меньше 100 литров.

Создай программу, которая отображает соответствие данных груза категории "Average".
Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".

- укажи предварительно заданные параметры категории;
- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
- сделай сравнение непосредственно внутри println() и без использования диапазонов.
 */