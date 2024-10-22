package Kotlin.Nullable

fun divideIfWhole(dividend: Int, divisor: Int): Int? {
    return if (dividend % divisor == 0) {
        dividend / divisor
    } else {
        null
    }
}

fun main() {
    val result = divideIfWhole(12, 3) ?: 0
    println("Результат деления: $result")

    val noResult = divideIfWhole(13, 5) ?: 0
    println("Результат деления: $noResult")
}