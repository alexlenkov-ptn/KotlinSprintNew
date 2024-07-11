fun main() {
    val alphaCentauri = GalacticGuide(
        "Альфа Центавра",
        "Тройная звёздная система, расположенная в созвездии Центавр",
        "11.05.2078",
        4.36
    )
    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val date = alphaCentauri.component3()
    val distance = alphaCentauri.component4()
    println(
        "Название места или события: $name\n" +
                "Описание мета или события: $description\n" +
                "Дата и время события: $date\n" +
                "Расстояние места или события от Земли в световых годах: $distance "
    )
}
data class GalacticGuide(
    val name: String,
    val description: String,
    val date: String,
    val distance: Double,
)
