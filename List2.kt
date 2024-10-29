package Kotlin.Collections

fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    var sumManual = 0
    for (num in numbers) {
        sumManual += num
    }
    println("Сумма элементов (ручной расчет): $sumManual")

    val sumStandard = numbers.sum()
    println("Сумма элементов (sum): $sumStandard")
}