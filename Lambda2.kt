package Kotlin.Lambda

fun main() {
    val numbersArray = arrayOf(-12, -9, -1, 0, 5, 16, 22, 42, -65, -2)
    val positiveNumbers = numbersArray.filter { it > 0 }
    println("Положительные числа массива: ${positiveNumbers.joinToString(", ")}")
}