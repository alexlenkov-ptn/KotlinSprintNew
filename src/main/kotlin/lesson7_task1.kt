fun main() {
    val rangeInt = 0..9
    val rangeChar = 'a'..'z'

    for (i in RANGE_PASSWORD_MIN..RANGE_PASSWORD_MAX) {
        val randomCountFor = (0..1).random()
        if (randomCountFor == 0) {
            print(rangeInt.random())
        } else {
            print(rangeChar.random())
        }
    }
}

const val RANGE_PASSWORD_MIN = 0
const val RANGE_PASSWORD_MAX = 5
