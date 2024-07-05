fun main() {
    val string = "hello world"
    println(string.vowelCount())
}

fun String.vowelCount(): Int {
    val listOfVowels: List<Char> = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return this.count{it in listOfVowels}
}