package Kotlin.Collections

fun main() {
    val numbers = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val result = numbers.map { it * 2 }.filter { it % 5 == 0 }.toSet()

    println("Элементы, кратные пяти после умножения на два: $result")
}