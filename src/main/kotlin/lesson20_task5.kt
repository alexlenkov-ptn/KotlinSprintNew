fun main() {
    val robot = Robot()
    var string = "I'm a robot"
    robot.say(string)
    string = setModifier(string)
    robot.say(string)
}

class Robot() {
    fun say(string: String) {
        println(string)
    }
}

fun setModifier(
    string: String,
    invertor: (String) -> String = { it.reversed() }
): String {
    val invertorString = invertor(string)
    return invertorString
}
