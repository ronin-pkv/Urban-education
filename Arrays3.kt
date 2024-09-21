package Kotlin.Arrays

import kotlin.math.pow

fun Arrays3(N:Int): IntArray {
    val array = IntArray(N)

    for (i in 0 until N) {
        array[i] = 2.0.pow(i + 1).toInt()
    }
    return array
}

fun main() {
    val N = 8
    val result = Arrays3(N)
    println("Степени двойки: ${result.joinToString(", ")}")
}