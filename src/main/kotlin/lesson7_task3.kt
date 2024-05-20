fun main() {
    println("Введите число:")
    val rangeMax = readln().toInt()

    for (i in 0..rangeMax step 2) {
        println(i)
    }

}