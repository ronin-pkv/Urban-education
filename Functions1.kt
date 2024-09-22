package Kotlin.Functions

fun productOfRange(a: Int, b: Int): Int {
    var product = 1
    for (i in a..b) {
        product *= i
    }
    return product
}

fun main() {
    val result = productOfRange(2, 5)
    println("Произведение всех чисел от 2 до 5 равно: $result")
}