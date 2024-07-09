import java.io.File

fun main() {
    val file = File("1.txt")
    file.writeTextInLowerCase(" ТеКСТ1 ")
    println(file.readText())
}

fun File.writeTextInLowerCase(text: String) {
    this.writeText(text.lowercase() + this.readText())
}