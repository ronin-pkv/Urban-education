package Kotlin.Extentions

import kotlin.math.sqrt

fun Int.sqrt(): Double {
    return sqrt(this.toDouble())
}

fun main() {
    val num1 = 16
    println("Квадратный корень из $num1: ${num1.sqrt()}")
}