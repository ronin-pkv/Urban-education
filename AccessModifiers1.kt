package Kotlin.AccessModifiers

fun findEvenNumbers(matrix: Array<IntArray>): List<Int> {
    val evenNumbers = mutableListOf<Int>()
    for (row in matrix) {
        for (number in row) {
            if (number % 2 == 0) {
                evenNumbers.add(number)
            }
        }
    }
    return evenNumbers
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )

    val evenNumbers = findEvenNumbers(matrix)
    println("Четные числа: $evenNumbers")
}