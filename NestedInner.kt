package Kotlin.NestedInner

fun countElementsBetweenZeros(arr: IntArray): Int {
    val firstZeroIndex = arr.indexOf(0)
    val lastZeroIndex = arr.lastIndexOf(0)

    if (firstZeroIndex != -1 && lastZeroIndex != -1 && firstZeroIndex != lastZeroIndex) {
        return lastZeroIndex - firstZeroIndex - 1
    } else {
        return 0
    }
}

fun main() {
    val numbers = intArrayOf(3, 5, 0, 7, 9, 1, 0, 8, 6)
    val count = countElementsBetweenZeros(numbers)
    println("Количество элементов между двумя нулями: $count")
}