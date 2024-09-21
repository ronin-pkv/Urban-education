package Kotlin.Arrays

fun Arrays1() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val average = array.average()
    println("Среднее арифметическое элементов массива: $average")
}

fun main() {
    Arrays1()
}