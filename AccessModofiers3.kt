package Kotlin.AccessModifiers

fun printPositiveElements(array: IntArray) {
    fun isPositive(number: Int): Boolean {
        return number > 0
    }

    for (number in array) {
        if (isPositive(number)) {
            println("Положительный элемент: $number")
        }
    }
}

fun main() {
    val array = intArrayOf(-5, 3, -1, 7, 0, -2, 4)
    printPositiveElements(array)
}