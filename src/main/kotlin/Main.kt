fun main() {
    var position = "D2-D4;0"

    var positionLetterFrom = position.substring(0,1)
    var positionNumberFrom = position.substring(1,2).toInt()

    var positionLetterWhere = position.substring(3,4)
    var positionNumberWhere = position.substring(4,5).toInt()

    var moveNumber = position.substring(6).toString()

    print("""
        $positionLetterFrom$positionNumberFrom
        $positionLetterWhere$positionNumberWhere
        $moveNumber
    """.trimIndent())


    /*
    Задача 5* к Уроку 3

Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку,
отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда,
куда и номер хода, присвоить соответствующим переменным и распечатать по отдельности.
     */
}