package Kotlin.Constructors

fun findMinAndMax(numbers: List<Int>): Pair<Int, Int> {
    val min = numbers.minOrNull() ?: 0
    val max = numbers.maxOrNull() ?: 0
    return Pair(min, max)
}

fun main() {
    val numbers = listOf(45, 2, 89, 32, 56, 78, 12)
    val (min, max) = findMinAndMax(numbers)
    println("Минимум: $min, Максимум: $max")
}