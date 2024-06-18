import kotlin.math.pow

fun main() {
    val packageCube = PackageCube(3)
    val packageRectangle = PackageRectangle(3, 5, 6)
    val listOfPackage: List<Package> = listOf(packageCube, packageRectangle)
    listOfPackage.map {
        it.calculateArea()
    }
}

abstract class Package(
    length: Int,
    width: Int = 0,
    height: Int = 0,
) {
    open fun calculateArea() {}
}

class PackageCube(
    length: Int,
) : Package(length) {
    private val length = length.toDouble()
    override fun calculateArea() {
        println((length.pow(3)).toInt())
    }
}

class PackageRectangle(
    length: Int,
    width: Int,
    height: Int
) : Package(length, width, height) {
    private val length = length
    private val width = width
    private val height = height

    override fun calculateArea() {
        println(length * width * height)
    }
}