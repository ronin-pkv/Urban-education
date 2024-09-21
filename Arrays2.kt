package Kotlin.Arrays

fun Arrays2 (array:IntArray) {
    var count = 0
    println("Четные числа массива: ")

    for (num in array) {
        if (num % 2 == 0) {
            print("$num ")
            count++
        }
    }
    println()
    println("Количество чётных чисел: $count")
}

fun main() {
    val array = intArrayOf(4, 5, 6, 7, 8, 9, 13, 15, 22)
    Arrays2(array)
}