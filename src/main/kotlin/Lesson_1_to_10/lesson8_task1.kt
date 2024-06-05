package Lesson_1_to_10

fun main() {
    val impressionsDay1 = 120
    val impressionsDay2 = 387
    val impressionsDay3 = 50
    val impressionsDay4 = 201
    val impressionsDay5 = 1567
    val impressionsDay6 = 896
    val impressionsDay7 = 756
    val arrayOfImpressions = arrayOf(
        impressionsDay1, impressionsDay2, impressionsDay3, impressionsDay4, impressionsDay5,
        impressionsDay6, impressionsDay7
    )
    var result = 0

    for (i in MIN_RANGE..(arrayOfImpressions.size - 1)) {
        result += arrayOfImpressions[i]
    }
    println(result)
}

const val MIN_RANGE = 0