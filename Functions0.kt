package Kotlin.Functions


import kotlin.math.pow

fun powerOf(a:Double, b: Int): Double {
    return a.pow(b)
}

fun main() {
    val result = powerOf(4.0, 4)
    println("4.0 в степени 4 равно: $result")
}