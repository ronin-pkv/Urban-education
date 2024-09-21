package Kotlin.Arrays

fun Matrix1(matrix: Array<IntArray>): Int {
    val allElements = mutableListOf<Int>()
    for (row in matrix) {
        for (element in row) {
            allElements.add(element)
        }
    }

    allElements.sort()

    val medianIndex = allElements.size / 2
    return allElements[medianIndex]
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(4, 12, 5, 6, 65),
        intArrayOf(6, 2, 19, 99, 43),
        intArrayOf(24, 7, 11, 37, 22),
    )

    val median = Matrix1(matrix)
    println("Медиана: $median")
}