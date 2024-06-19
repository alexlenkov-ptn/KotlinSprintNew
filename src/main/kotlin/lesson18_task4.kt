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
    length: Int,
) : Package() {
    private val length = length.toDouble()
    override fun calculateArea() {
        println((length.pow(3)).toInt())
    }
}

class PackageRectangle(
    length: Int,
    width: Int,
    height: Int
) : Package() {
    private val length = length
    private val width = width
    private val height = height

    override fun calculateArea() {
        println(length * width * height)
    }
}