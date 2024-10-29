package Kotlin.Collections

fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    var countManual = 0
    for (num in numbers) {
        countManual++
    }
    println("Количество элементов (ручной расчет): $countManual")

    val countStandard = numbers.count()
    println("Количество элементов (count): $countStandard")
}