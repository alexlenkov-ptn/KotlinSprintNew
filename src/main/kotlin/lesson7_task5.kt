fun main() {
    val rangeUpperCaseLetter = 'A'..'Z'
    val rangeLowerCaseLetter = 'a'..'z'
    val rangeCounts = 0..9
    val rangeOptionsPassword = 0..2


    do {
        println("Задайте длину пароля: ")
        val lengthPassword = readln().toInt()
            if(lengthPassword < MIN_LENGTH_PASSWORD) {
                println("Ошибка. Укажите длину пароля 6 и более символов")
            }else {
                for (i in RANGE_MIN..lengthPassword) {
                    val optionsPassword = rangeOptionsPassword.random()
                    if (optionsPassword == 0) {
                        print(rangeUpperCaseLetter.random())
                    }else if (optionsPassword == 1) {
                        print(rangeLowerCaseLetter.random())
                    }else {
                        print(rangeCounts.random())
                    }
                }
                break
            }
    }while (lengthPassword <= MIN_LENGTH_PASSWORD)
}

const val MIN_LENGTH_PASSWORD = 6
const val RANGE_MIN = 0