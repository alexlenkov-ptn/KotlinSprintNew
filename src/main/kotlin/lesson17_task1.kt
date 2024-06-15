fun main() {

}

class Quiz(question: String,
           answer: String) {
    val question: String
        get() = ""

    var answer: String = ""
        get() = ""
        set(value: String) {
            field = value
        }
}