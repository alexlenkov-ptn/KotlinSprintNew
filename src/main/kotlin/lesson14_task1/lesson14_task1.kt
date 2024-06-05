package lesson14_task1

fun main() {
    val liner: Liner = Liner()
    val cargoShip: CargoShip = CargoShip()
    val icebreaker: Icebraker = Icebraker()

    println(
        """
            Данные корабля: ${liner.name}
            Скорость: ${liner.speed}
            Вместимость: ${liner.loadCapacity}
            Грузоподъёмность: ${liner.loadCapacity}
            Вместимость пассажиров: ${liner.passengerCapacity}
            Возможность ломать лёд: ${liner.areBreakIce}
                    
            Данные корабля: ${cargoShip.name}
            Скорость: ${cargoShip.speed}
            Вместимость: ${cargoShip.loadCapacity}
            Грузоподъёмность: ${cargoShip.loadCapacity}
            Вместимость пассажиров: ${cargoShip.passengerCapacity}
            Возможность ломать лёд: ${cargoShip.areBreakIce}
                            
            Данные корабля: ${icebreaker.name}
            Скорость: ${icebreaker.speed}
            Вместимость: ${icebreaker.loadCapacity}
            Грузоподъёмность: ${icebreaker.loadCapacity}
            Вместимость пассажиров: ${icebreaker.passengerCapacity}
            Возможность ломать лёд: ${icebreaker.areBreakIce}
    """.trimIndent()
    )
}

open class Liner(
    var name: String = "Liner",
    var speed: Int = 10,
    var loadCapacity: Int = 20,
    var passengerCapacity: Int = 50,
    var areBreakIce: Boolean = false,
)

class CargoShip(
    name: String = "Cargo Ship",
    speed: Int = 5,
    loadCapacity: Int = 40,
) : Liner(
    name = name,
    speed = speed,
    loadCapacity = loadCapacity,
)

class Icebraker(
    name: String = "Icebreaker",
    speed: Int = 3,
    passengerCapacity: Int = 10,
    areBreakIce: Boolean = true,
) : Liner(
    name = name,
    speed = speed,
    passengerCapacity = passengerCapacity,
    areBreakIce = areBreakIce,
)