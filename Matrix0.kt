package Kotlin.Arrays

fun Matrix0(matrix: Array<IntArray>): Int {
    var min = matrix[0][0]

    for (row in matrix) {
        for (element in row) {
            if (element < min) {
                min = element
            }
        }
    }
    return min
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(4, 12, 5),
        intArrayOf(6, 2, 19),
        intArrayOf(24, 7, 11),
    )
    val minElement = Matrix0(matrix)
    print("Минимальный элемент массива: $minElement")
}