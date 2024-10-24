package Kotlin.Extentions

fun Int.square(): Int {
    return this * this
}

fun main() {
    val number = 5
    println("Квадрат числа $number: ${number.square()}")
}