package Kotlin.Collections

fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    var sum = 0
    for (num in numbers) {
        sum += num
    }
    val averageManual = sum.toDouble() / numbers.size
    println("Среднее арифметическое (ручной расчет): $averageManual")

    val averageStandard = numbers.average()
    println("Среднее арифметическое (average): $averageStandard")
}