fun main() {
    val textGreeting: (String) -> Unit = fun (username: String) = println("С наступающим Новым Годом, $username!")
    textGreeting("John")
}