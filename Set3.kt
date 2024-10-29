package Kotlin.Collections

fun main() {
    val numbers = arrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)

    val result = numbers.filter { it != 0 } + numbers.filter { it == 0 }

    println("Массив с нулями в конце: ${result.joinToString(", ")}")
}