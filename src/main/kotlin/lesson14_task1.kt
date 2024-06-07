package lesson14_task1

fun main() {
    val liner: Liner_14_1 = Liner_14_1()
    val cargoShip: CargoShip_14_1 = CargoShip_14_1()
    val icebreaker: Icebraker_14_1 = Icebraker_14_1()

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

open class Liner_14_1(
    var name: String = "Liner",
    var speed: Int = 10,
    var loadCapacity: Int = 20,
    var passengerCapacity: Int = 50,
    var areBreakIce: Boolean = false,
)

class CargoShip_14_1(
    name: String = "Cargo Ship",
    speed: Int = 5,
    loadCapacity: Int = 40,
) : Liner_14_1(
    name = name,
    speed = speed,
    loadCapacity = loadCapacity,
)

class Icebraker_14_1(
    name: String = "Icebreaker",
    speed: Int = 3,
    passengerCapacity: Int = 10,
    areBreakIce: Boolean = true,
) : Liner_14_1(
    name = name,
    speed = speed,
    passengerCapacity = passengerCapacity,
    areBreakIce = areBreakIce,
)