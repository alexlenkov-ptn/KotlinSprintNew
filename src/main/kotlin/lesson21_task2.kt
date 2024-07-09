fun main() {
    val numbers = listOf(1, 5, 4, 3, 2, 10)
    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() : Int {
        val sum = this.filter { it % 2 == 0 }.sum()
        return sum
}