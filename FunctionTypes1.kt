package Kotlin.FunctionTypes

fun powerOfTen(n: Int): Int {
    if (n == 0) {
        return 1
    }
    return 10 * powerOfTen(n - 1)
}

fun main() {
    val exponent = 3
    println("Число 10 в $exponent степени: ${powerOfTen(exponent)}")
}