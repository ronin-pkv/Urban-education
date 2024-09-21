package Kotlin.Arrays

fun Arrays0() {
    val array = doubleArrayOf(1.4, 2.1, 3.3, 4.9, 5.2, 6.7, 7.4, 8.8, 9.2)
    var product = 1.0

    for (num in array) {
        product *= num
    }

    println("Произведение элементов массива: $product")
}

fun main() {
    Arrays0()
}