fun main() {
    val listOfPerson: MutableList<Person> = mutableListOf()


    for (i in 0..4) {
        var gender: Gender
        println("Введите имя в формате строки")
        val name = readln().toString()
        println(
            "Введите пол человека, где ${Gender.MAN} - это ${Gender.MAN.description?.lowercase()}, " +
                    "а ${Gender.WOMAN} - это ${Gender.WOMAN.description?.lowercase()}"
        )
        do {
            val genderInput = readln().toString()
            gender = returnGender(genderInput)
            if (gender == Gender.ERROR) println("Вы неправильно ввели пол. Попробуйте ещё раз")
        } while (gender == Gender.ERROR)

        val person = Person(name, gender)
        listOfPerson.add(person)
    }

    listOfPerson.forEach() {
        println("${it.gender.name}, ${it.name}")
    }

}

enum class Gender(val description: String?) {
    MAN("Мужчина"),
    WOMAN("Женщина"),
    ERROR(null),
}

class Person(
    val name: String,
    val gender: Gender,
)

fun returnGender(genderName: String) : Gender {
    if (genderName == Gender.MAN.name) {
        return Gender.MAN
    } else if (genderName == Gender.WOMAN.name) {
        return Gender.WOMAN
    } else {
        return Gender.ERROR
    }
}

