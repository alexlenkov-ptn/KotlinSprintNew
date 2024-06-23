import kotlin.math.pow

fun main() {
    val packageCube = PackageCube(3)
    val packageRectangle = PackageRectangle(3, 5, 6)
    val listOfPackage: List<Package> = listOf(packageCube, packageRectangle)
    listOfPackage.map {
        it.calculateArea()
    }
}

open class Package() {
    open fun calculateArea() {}
}

class PackageCube(
    val length: Int,
) : Package() {
    private val lengthToDouble = length.toDouble()
    override fun calculateArea() {
        println((lengthToDouble.pow(3)).toInt())
    }
}

class PackageRectangle(
    val length: Int,
    val width: Int,
    val height: Int
) : Package() {
    override fun calculateArea() {
        println(length * width * height)
    }
}