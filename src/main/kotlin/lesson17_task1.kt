fun main() {

}

class Quiz(question: String,
           answer: String) {
    val question = question
        get() = field

    var answer = answer
        get() = field
        set(value: String) {
            field = value
        }
}