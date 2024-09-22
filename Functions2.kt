package Kotlin.Functions

fun gcd(a: Int, b: Int): Int {
    var a = a
    var b = b
    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }
    return a
}

fun main() {
    val result = gcd(68, 164)
    println("НОД чисел 68 и 164: $result")
}