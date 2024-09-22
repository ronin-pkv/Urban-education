package Kotlin.Functions

fun printRow(matrix: Array<IntArray>, k: Int) {
    if (k < 1 || k > matrix.size) {
        println("Неверное значение k")
        return
    }

    val row = matrix[k - 1]
    println("Элементы $k-й строки: ${row.joinToString(", ")}")
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    val k = 2
    printRow(matrix, k)
}