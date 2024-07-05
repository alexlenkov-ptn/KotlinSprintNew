fun main() {
    val numbers = listOf(1, 5, 4, 3, 2, 10)
    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() : Int {
        var count = 0
        this.map { if (it % 2 == 0) count += it}
        return count
}