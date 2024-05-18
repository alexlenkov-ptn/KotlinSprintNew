fun main() {
    println("Введите число:")
    val rangeMax = readln().toInt()

    for (i in rangeMin..rangeMax step 2) {
        if (i % 2 == 0 && i != 0) {
            println(i)
        } else {
            continue
        }
    }

}

const val rangeMin = 0