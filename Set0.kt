package Kotlin.Collections

fun main() {
    val numbers = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = numbers.filter { it % 2 == 0 }.toSet()
    val oddNumbers = numbers.filter { it % 2 != 0 }.toSet()

    println("Четные числа: $evenNumbers")
    println("Нечетные числа: $oddNumbers")
}