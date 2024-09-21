package Kotlin.Arrays

fun findSecondMax(arr: IntArray): Int? {
    if (arr.size < 2) return null
    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE

    for (num in arr) {
        if (num > max) {
            secondMax = max
            max = num
        } else if (num > secondMax && num != max) {
            secondMax = num
        }
    }
    return if (secondMax != Int.MIN_VALUE) secondMax else null
}

fun main() {
    val numbers = intArrayOf(13, 43, 88, 97, 54, 76, 35)
    val secondMax = findSecondMax(numbers)
    println("Второе максимальное число: $secondMax")
}