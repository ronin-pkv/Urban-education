package Kotlin.Lambda

fun main() {
    val average:(List<Double>) -> Double = { numbers -> numbers.sum() / numbers.size}
    val numbersList = listOf(10.0,12.0,15.4,23.4,65.2)
    println("Среднее арифметическое массива чисел: ${average(numbersList)}")
}