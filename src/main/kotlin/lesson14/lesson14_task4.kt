package lesson14

fun main() {
    val fobos = PlanetSatellite("Fobos", false, true)
    val deymos = PlanetSatellite("Deymos", false, true)
    val mars: Planet = Planet("Mars", true, true, listOf(fobos, deymos))

    println("Планета:")
    mars.printName()
    println("Спутники:")
    mars.printNameOfPlanetSattelits()
}

abstract class CelestialBody(
    val name: String,
    val isAtmosphere: Boolean,
    val areSuitableForPlanting: Boolean,
) {
    fun printName() {
        println(name)
    }
}

class Planet(
    name: String,
    isAtmosphere: Boolean,
    areSuitableForPlanting: Boolean,
    val listOfSatellits: List<PlanetSatellite>,
) : CelestialBody(name, isAtmosphere, areSuitableForPlanting) {
    fun printNameOfPlanetSattelits() {
        listOfSatellits.forEach() {
            println(it.name)
        }
    }
}

class PlanetSatellite(
    name: String,
    isAtmosphere: Boolean,
    areSuitableForPlanting: Boolean,
) : CelestialBody(name, isAtmosphere, areSuitableForPlanting)