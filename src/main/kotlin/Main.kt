

fun main() {
    val countOfEmployee = 50
    val salaryOfEmployee = 30_000
    val countOfIntern = 30
    val salaryOfIntern = 20_000

    val salaryOfEmployeeSum = countOfEmployee * salaryOfEmployee
    val salarySum = salaryOfEmployeeSum + (countOfIntern * salaryOfIntern)
    val salaryAverage = salarySum / (countOfIntern + countOfEmployee)

    println("Расходы на выплату зарплаты постоянных сотрудников: " + salaryOfEmployeeSum)
    println("Общие расходы по ЗП после прихода стажеров: " + salarySum)
    println("Среднюю ЗП одного сотрудника после устройства стажеров: " + salaryAverage)
}

/*
Задача 2 к Уроку 2

В компании работало 50 человек с зарплатой по 30_000 рублей.
Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20_000 рублей каждому.
Пишем часть гипотетического софта для бухгалтерии, который будет считать:
– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
Все значения необходимо вывести в виде целых чисел.
 */