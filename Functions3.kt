package Kotlin.Functions

fun localMin(arr: IntArray): Int {
    if (arr.size < 3) return 0
    var minCount = 0
    for (i in 1 until arr.size - 1) {
        if (arr[i] < arr.size - 1 && arr[i] < arr[i + 1]) {
            minCount++
        }
    }
    return minCount
}

fun main() {
    val array = intArrayOf(3, 5, 12, 7, 24, 5, 6, 10, 12, 14, 1)
    val result = localMin(array)
    println("Количество локальных минимумов в массиве: $result")
}