package Kotlin.Interfaces

fun findSecondMax(numbers: List<Int>): Int? {
    if (numbers.size < 2) return null

    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE

    for (num in numbers) {
        if (num > max) {
            secondMax = max
            max = num
        } else if (num > secondMax && num != max) {
            secondMax = num
        }
    }
    return if (secondMax == Int.MIN_VALUE) null else secondMax
}

fun main() {
    val numbers = listOf(3, 67, 1, 55, 65, 89, 23)
    val secondMax = findSecondMax(numbers)
    if (secondMax != null) {
        println("Второе максимальное число: $secondMax")
    } else {
        println("Второго максимального числа нет.")
    }
}