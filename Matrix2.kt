package Kotlin.Arrays

fun fillMatrix(): Array<IntArray> {
    val matrix = Array(5) {IntArray(5)}

    for (i in 0 until 5) {
        for (j in 0 until 5) {
            if (i + j >= 4 && i >= j) {
                matrix[i][j] = 1
            }
        }
    }
    return matrix
}

fun printMatrix(matrix:Array<IntArray>) {
    for (row in matrix) {
        println(row.joinToString(" "))
    }
}

fun main() {
    val matrix = fillMatrix()
    printMatrix(matrix)
}