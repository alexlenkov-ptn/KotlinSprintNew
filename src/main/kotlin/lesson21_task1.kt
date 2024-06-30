fun main() {
    val string = "hello world"
    println(string.returnVowels())
}

fun String.returnVowels(): Int {
    val listOfVowels: List<Char> = listOf('a', 'e', 'i', 'o', 'u', 'y')
    var count = 0
    for (char in this.lowercase()) {
        if (listOfVowels.contains(char)) count++
    }
    return count
}