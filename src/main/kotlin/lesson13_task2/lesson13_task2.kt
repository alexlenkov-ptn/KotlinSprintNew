package lesson13_task2

fun main() {
    val person1 = TelephoneList_13_2("Vitaly", 89991599999, )
    person1.printInfo()
}

class TelephoneList_13_2(
    _name: String,
    _number: Long,
    _company: String? = null,
) {
    val name = _name
    val number = _number
    val company = _company?:null

    fun printInfo() {
        println("- Имя: $name \n" +
                "- Номер: $number \n" +
                "- Компания: ${if (company == null) 
                    "не указано"
                    else
                    company
                }")
    }
}