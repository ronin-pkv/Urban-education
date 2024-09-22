package Kotlin.Functions

fun adjustNegative(arr: IntArray): IntArray {
    for (i in arr.indices) {
        if (arr[i] < 0) {
            arr[i] += 1
        }
    }
    return arr
}

fun main() {
    val array = intArrayOf(-3, -1, 24, 2, 5, 7, -11)
    println("Изначальный массив: ${array.joinToString (", ") }")
    val result = adjustNegative(array)
    println("Изменённый масcив: ${result.joinToString ( ", " )}")
}