fun main() {
    val truck = Truck("Грузовик")
    val car = PassengerCar("Легковой автомобиль")
    truck.boardPassenger(1)
    truck.loadTheCargo(2)
    truck.moveToEnd()
    truck.dropOffPassenger(1)
    truck.unloadCargo(2)
    truck.moveToStart()

    car.boardPassenger(3)
    car.moveToEnd()
    car.dropOffPassenger(3)

    truck.boardPassenger(1)
    truck.moveToEnd()
    truck.dropOffPassenger(1)


}

interface CarMove {
    fun moveToEnd()
    fun moveToStart()
}

interface ActionWithPassenger {
    fun boardPassenger(count: Int)
    fun dropOffPassenger(count: Int)
}

interface ActionWithCargo {
    fun loadTheCargo(count: Int)
    fun unloadCargo(count: Int)
}

abstract class Car(val name: String) : CarMove, ActionWithPassenger, ActionWithCargo {
    override fun moveToEnd() {
        println("$name едет к конечной точке")
    }

    override fun moveToStart() {
        println("$name возвращается к начальной точке")
    }
}

class Truck(name: String) : Car(name) {
    val maxPassenger = 1
    val maxCargo = 2
    var countPassenger = 0
    var countCargo = 0

    override fun boardPassenger(count: Int) {
        println("Рассаживаем пассажиров...")
        countPassenger += count
        conditionPassenger(countPassenger, maxPassenger)
    }

    override fun dropOffPassenger(count: Int) {
        println("Выпускаем пассажиров...")
        countPassenger -= count
        conditionPassenger(countPassenger, maxPassenger)
    }

    override fun loadTheCargo(count: Int) {
        println("Загружаем груз")
        countCargo += count
        conditionPassenger(countCargo, maxCargo)
    }

    override fun unloadCargo(count: Int) {
        println("Выгружаем груз")
        countCargo -= count
        conditionCargo(countCargo, maxCargo)
    }
}

class PassengerCar(name: String) : Car(name) {
    val maxPassenger = 3
    val maxCargo = 0
    var countPassenger = 0
    var countCargo = 0

    override fun boardPassenger(count: Int) {
        println("Рассаживаем пассажиров...")
        countPassenger += count
        conditionPassenger(countPassenger, maxPassenger)
    }

    override fun dropOffPassenger(count: Int) {
        println("Выпускаем пассажиров...")
        countPassenger -= count
        conditionPassenger(countPassenger, maxPassenger)
    }

    override fun loadTheCargo(count: Int) {
        println("Загрузить груз в легковую машину невозможно")
    }

    override fun unloadCargo(count: Int) {
        println("Нельзя выгрузить несуществующий груз")
    }
}

fun conditionPassenger(countToBoard: Int, countMax: Int) {
    if (countToBoard <= countMax) {
        print("Количество пассажиров: ${countToBoard}, из возможных: ${countMax}. ")
        println("Можем ехать")
    } else {
        print("Количество пассажиров: ${countToBoard}, из возможных: ${countMax}. ")
        println("Ехать запрещено")
    }
}

fun conditionCargo(countToBoard: Int, countMax: Int) {
    if (countToBoard <= countMax) {
        print("Количество тонн груза: ${countToBoard}, из возможных: ${countMax}. ")
        println("Можем ехать")
    } else {
        print("Количество тонн груза: ${countToBoard}, из возможных: ${countMax}. ")
        println("Ехать запрещено")
    }
}