import javax.lang.model.element.Modifier
import kotlin.random.Random

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { str: String -> str.reversed() }
    robot.say()
}

class Robot() {

    private var phrase1 = "Я робот"
    private var phrase2 = "Я готов выполнять команды"
    private var phrase3 = "Я умный"
    private var phrase4 = "Я думаю наперёд"
    private var phrase5 = "Меня программирует человек"
    private val list: List<String> = listOf(phrase1, phrase2, phrase3, phrase4, phrase5)

    private var modifier: (String) -> String = { it }

    fun say(
    ) {
        println(modifier(list.random()))
    }

    fun setModifier(
        modifier: (String) -> String
    ) {
        this.modifier = modifier
    }
}
