import kotlin.random.Random

fun main() {
    val cube = Cube()
    cube.getResult()
}

class Cube() {
    private val randomCount = Random.nextInt(1, 6)

    fun getResult() {
        println(randomCount)
    }
}





