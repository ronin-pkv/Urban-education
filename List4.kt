package Kotlin.Collections

fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    val sumLastTwoManual = numbers[numbers.size - 2] + numbers[numbers.size - 1]
    println("Сумма двух последних элементов (ручной расчет): $sumLastTwoManual")

    val sumLastTwoStandard = numbers.takeLast(2).sum()
    println("Сумма двух последних элементов (takeLast): $sumLastTwoStandard")
}