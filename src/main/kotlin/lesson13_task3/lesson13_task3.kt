package lesson13_task3

fun main() {
    val person1 = TelephoneList("Vitaly", 89991599999,)
    val person2 = TelephoneList("Pavel", 89991599992,)
    val person3 = TelephoneList("Pavel", 89991599993, "null")
    val person4 = TelephoneList("Pavel", 89991599994, "Amazon")
    val person5 = TelephoneList("Pavel", 89991599995, "Google")

    val listOfContact: List<TelephoneList> = listOf(person1, person2, person3, person4, person5)

    listOfContact.forEach {
        println(it.company)
    }
}