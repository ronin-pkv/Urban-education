package Kotlin.VerificationWork

fun sumSquares(a:Int, b:Int): Int {
    var sum = 0
    for (i in a..b) {
        sum += i * i
    }
    return sum
}

fun main() {
    println("Сумма квадратов чисел от a до b: ${sumSquares(3, 8)}")
}