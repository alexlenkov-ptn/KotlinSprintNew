fun main() {
    val alphaCentauri = GalacticGuide(
        "Альфа Центавра",
        "Тройная звёздная система, расположенная в созвездии Центавр",
        "11.05.2078",
        4.36
    )
    val (name, description, date, distance) = alphaCentauri
    println(
        "Название места или события: $name\n" +
                "Описание места или события: $description\n" +
                "Дата и время события: $date\n" +
                "Расстояние места или события от Земли в световых годах: $distance"
    )
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: String,
    val distance: Double,
)
