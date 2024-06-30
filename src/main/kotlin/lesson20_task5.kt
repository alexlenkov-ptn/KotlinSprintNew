import kotlin.random.Random

fun main() {
    val robot = Robot()
    println(robot.say())
    println(robot.setModifier())
    println(robot.say())
}

class Robot() {
    fun say(): String {
        return randomStringList()
    }

    private var phrase1 = "Я робот"
    private var phrase2 = "Я готов выполнять команды"
    private var phrase3 = "Я умный"
    private var phrase4 = "Я думаю наперёд"
    private var phrase5 = "Меня программирует человек"
    private val list: List<String> = listOf(phrase1, phrase2, phrase3, phrase4, phrase5)

    private val randomStringList: () -> String = { list[Random.nextInt(0, list.size - 1)] }

    fun setModifier(
        invertor: (String) -> String = { it.reversed() }
    ) {
        val invertorString = invertor(randomStringList.toString())
    }
}
