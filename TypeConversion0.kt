package Kotlin.TypeConversion

fun main() {
    val input = "12.3"

    val floatValue = input.toDouble()
    println("Число с плавающей точкой: $floatValue")

    val intValue = floatValue.toInt()
    println("Целое число: $intValue")

    val binValue = Integer.toBinaryString(intValue)
    println("Число в двоичной системе: $binValue")
}