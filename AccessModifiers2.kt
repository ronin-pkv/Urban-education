package Kotlin.AccessModifiers

fun fillMatrix(): Array<IntArray> {
    val matrix = Array(4) { IntArray(4) }
    var counter = 1
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            matrix[i][j] = counter++
        }
    }
    return matrix
}

fun main() {
    val matrix = fillMatrix()
    for (row in matrix) {
        println(row.joinToString(" "))
    }
}