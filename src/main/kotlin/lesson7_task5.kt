fun main() {
    val rangeUpperCaseLetter = 'A'..'Z'
    val rangeLowerCaseLetter = 'a'..'z'
    val rangeCounts = 0..9
    val rangeAll = (rangeCounts.toList() + rangeUpperCaseLetter + rangeLowerCaseLetter).toList()
    val password: MutableList<String> = mutableListOf()

    do {
        println("Задайте длину пароля 6 и более символов: ")
        val lengthPassword = readln().toInt()
        if (lengthPassword < MIN_LENGTH_PASSWORD) {
            println("Ошибка. Укажите длину пароля 6 и более символов")
            continue
        }

        password.add(0, rangeUpperCaseLetter.random().toString())
        password.add(1, rangeLowerCaseLetter.random().toString())
        password.add(2, rangeCounts.random().toString())

        for (i in 3..lengthPassword - 1) {
            password.add(rangeAll.random().toString())
        }
    } while (lengthPassword <= MIN_LENGTH_PASSWORD)

    password.shuffle()

    val userPassword = password.map {
        print(it)
    }
}

const val MIN_LENGTH_PASSWORD = 6