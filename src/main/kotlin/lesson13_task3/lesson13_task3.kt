package lesson13_task3

fun main() {
    val person1 = TelephoneList_13_3("Vitaly", 89991599999)
    val person2 = TelephoneList_13_3("Pavel", 89991599992)
    val person3 = TelephoneList_13_3("Pavel", 89991599993, "null")
    val person4 = TelephoneList_13_3("Pavel", 89991599994, "Amazon")
    val person5 = TelephoneList_13_3("Pavel", 89991599995, "Google")

    val listOfContact: List<TelephoneList_13_3> = listOf(person1, person2, person3, person4, person5)

    val companies = listOfContact.mapNotNull() {
        it.company
    }

    companies.forEach() {
        println(it)
    }
}

class TelephoneList_13_3(
    _name: String,
    _number: Long,
    _company: String? = null,
) {
    val name = _name
    val number = _number
    val company = _company

    fun printInfo() {
        println("- Имя: $name \n" +
                "- Номер: $number \n" +
                "- Компания: ${company ?: "не указано"}")
    }
}