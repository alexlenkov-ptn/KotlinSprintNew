fun main() {
    val pack = Package(1, "Moscow")
    pack.location = "Saint Petersburg"
    println(
        "${pack.location}\n" +
                "${pack.counterChangeLocation}"
    )
}

class Package(
    number: Int,
    location: String,
) {
    val number = number
    var location = location
        set(value: String) {
            field = value
            counterChangeLocation++
        }
    var counterChangeLocation = 0

}