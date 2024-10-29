package Kotlin.Collections

fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    var sumIndicesManual = 0
    for (i in numbers.indices) {
        sumIndicesManual += i
    }
    println("Сумма индексов элементов (ручной расчет): $sumIndicesManual")

    // Второй способ: использование функции indices()
    val sumIndicesStandard = numbers.indices.sum()
    println("Сумма индексов элементов (indices): $sumIndicesStandard")
}