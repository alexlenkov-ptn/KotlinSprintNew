fun main() {
    val login = readln().toString()
    val password = readln().toString()
    val userCard = listOf("Чеснок", "Огурцы", "Тесто", "Йогурт", "Хлеб")
    val token = getToken()

    if (token != null) {
        println(returnCard(token))
    }else {
        println("Данные для входа не совпадают")
    }
}

fun returnCard(token: String?): List<String> {
    val userCard = listOf("Чеснок", "Огурцы", "Тесто", "Йогурт", "Хлеб")
    return userCard
}

fun logIn(login: String?, password: String?): String? {
    if (login ==  USER_LOGIN && password == USER_PASSWORD) return getToken()
    else return null
}

fun getToken(): String {
    val rangeTokenNumbers = 1..9
    val rangeTokenLetters = ('a'..'z')
    val randomRangeCounts = 0..2
    var randomCounts = 0
    var userToken: String = ""

    for (i in 0..TOKEN_SYMBOLS) {
        randomCounts = randomRangeCounts.random()
        if (randomCounts == 0) {
            userToken += rangeTokenNumbers.random()
        } else if (randomCounts == 1) {
            userToken += rangeTokenLetters.random().toLowerCase()
        }else {
            userToken += rangeTokenLetters.random().toUpperCase()
        }
    }
    return userToken
}

const val USER_LOGIN = "admin"
const val USER_PASSWORD = "0000"
const val TOKEN_SYMBOLS = 32