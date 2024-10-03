package Kotlin.Delegation

fun binaryToDecimal(binary: String): Int {
    return binary.toInt(2)
}

fun main() {
    val number = "101010"
    val decimal = binaryToDecimal(number)
    println("Двоичное число $number в десятичной системе: $decimal")
}