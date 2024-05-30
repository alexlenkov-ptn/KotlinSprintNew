fun main() {
    val login = readln().toString()
    val password = readln().toString()
    val userCard = listOf("Чеснок", "Огурцы", "Тесто", "Йогурт", "Хлеб")
    val token = logIn(login, password)

    if (token != null) {
        println(returnCard(token))
    } else {
        println("Данные для входа не совпадают")
    }
}

fun returnCard(token: String?): List<String> {
    val userCard = listOf("Чеснок", "Огурцы", "Тесто", "Йогурт", "Хлеб")
    return userCard
}

fun logIn(login: String?, password: String?): String? {
    if (login == USER_LOGIN && password == USER_PASSWORD) return getToken()
    else return null
}

fun getToken(): String {
    val rangeTokenNumbers = 1..9
    val rangeTokenLetters = ('a'..'z')
    val randomRange = rangeTokenLetters + rangeTokenLetters
    var userToken: String = ""

    for (i in 0..TOKEN_SYMBOLS) userToken += randomRange.random()
    return userToken
}

const val USER_LOGIN = "admin"
const val USER_PASSWORD = "0000"
const val TOKEN_SYMBOLS = 32