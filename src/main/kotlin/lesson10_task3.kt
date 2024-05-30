fun main() {
    println("Введите длину пароля: ")
    val passwordSize = readln().toInt()

    println(generatePassword(passwordSize))

}

fun generatePassword(passwordSize: Int): String { // Явно указали, что функция возвращает String

    val rangeOfSpecialCymbol = charArrayOf('!', '\'', '#', '\\', '\$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/')
    val rangePassword = 0..9

    var password: String = ""

    for (i in COUNT_ONE..passwordSize) {
        if (i % 2 == 0) {
            password += rangePassword.random().toString()
        } else {
            password += rangeOfSpecialCymbol.random()
        }
    }

    return password
}

const val COUNT_ONE = 1
const val COUNT_NULL = 0