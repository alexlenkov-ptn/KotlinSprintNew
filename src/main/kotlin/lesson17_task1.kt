fun main() {

}

class Quiz(question: String,
           answer: String) {
    val question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value: String) {
            field = value
        }
}