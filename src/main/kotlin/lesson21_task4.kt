import java.io.File

fun main() {
    val file = File("1.txt")
    file.writeTextInLowerCase("ТеКСТ")
    println(file.readText())
}

fun File.writeTextInLowerCase(text: String) {
    this.writeText(text.lowercase())
}