import kotlin.random.Random

fun main() {
    val diceFourSides = DiceFourSides()
    val diceSixSides = DiceSixSides()
    val diceEightSides = DiceEightSides()
    val arrayListOfDice: List<Dice> = listOf(diceFourSides, diceSixSides, diceEightSides)
    arrayListOfDice.map {
        it.dropDice()
        it.printResult()
    }
}

abstract class Dice() {
    open fun dropDice() {}
    open fun printResult() {}
}

class DiceFourSides() : Dice() {
    var result = 0
    override fun dropDice() {
        result = Random.nextInt(1,4)
    }

    override fun printResult() {
        println(result)
    }
}

class DiceSixSides() : Dice() {
    var result = 0
    override fun dropDice() {
        result = Random.nextInt(1,6)
    }

    override fun printResult() {
        println(result)
    }
}

class DiceEightSides() : Dice() {
    var result = 0
    override fun dropDice() {
        result = Random.nextInt(1,8)
    }

    override fun printResult() {
        println(result)
    }
}

