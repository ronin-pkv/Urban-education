package Kotlin.AnonymousClasses

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )

    var sum = 0
    for (i in matrix.indices) {
        sum += matrix[i][matrix.size - 1 - i]
    }

    println("Сумма элементов побочной диагонали: $sum")
}