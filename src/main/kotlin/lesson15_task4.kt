fun main() {
    val instrumentDrumSet = Instruments("Барабанная установка", 1)
    val accessoriesForDrumSetSticks = AccessoriesForInstruments("Барабанные палочки", 10)
    val accessoriesForDrumSetSnare = AccessoriesForInstruments("Малый барабан", 3)
    val accessoriesForDrumSetHiHat = AccessoriesForInstruments("Хай-хэт", 9)
    val accessoriesForDrumSetCrash = AccessoriesForInstruments("Крэш", 2)

    instrumentDrumSet.mutableListOfAccessoriesForInstruments.add(accessoriesForDrumSetSticks)
    instrumentDrumSet.mutableListOfAccessoriesForInstruments.add(accessoriesForDrumSetSnare)
    instrumentDrumSet.mutableListOfAccessoriesForInstruments.add(accessoriesForDrumSetHiHat)
    instrumentDrumSet.mutableListOfAccessoriesForInstruments.add(accessoriesForDrumSetCrash)

    instrumentDrumSet.searchAccessories("Крэш")

}

interface Search {
    fun searching() {
        println("Выполняется поиск...")
    }
}

abstract class Goods(_name: String,
                     _count: Int,) {
    val name = _name
    val count = _count
}

class Instruments(name: String,
                  count: Int) : Goods(name, count), Search {
    val mutableListOfAccessoriesForInstruments: MutableList<AccessoriesForInstruments> = mutableListOf()

    fun searchAccessories(nameAccessor: String) {
        val accessor = mutableListOfAccessoriesForInstruments.map { it.name ==  nameAccessor}
        searching()

        println("Комплектующие для инструмента: ${name}:\n" +
                "${mutableListOfAccessoriesForInstruments.map { it.name ==  nameAccessor}}: " +
                "${mutableListOfAccessoriesForInstruments.map { it.count }}")
    }
}

class AccessoriesForInstruments(name: String,
                                count: Int) : Goods(name, count) {
}



/*
Задача 4 к Уроку 15

На сайте музыкального магазина есть товары двух категорий:
инструменты и комплектующие к ним.

Все товары имеют название и количество единиц на складе.
Для инструментов есть возможность поиска соответствующих комплектующих.

Опиши классы для категорий товаров. Имитируй процесс поиска текстовым сообщением «Выполняется поиск».
Для выноса логики поиска используй интерфейс.
 */

/*
Будет 2 класса - инструменты, комплектующие к инструментам
Получается нам нужна:
Коллекция для инструментов
Map для комплектующих

Инструменты и комплектующие имеют: название и количество единиц на складе

Логика поиска - это интерфейс
 */


