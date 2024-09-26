package Kotlin.Constructors

fun describeNumber(a: Int): String {
    return when {
        a == 0 -> "нулевое число"
        a > 0 && a % 2 == 0 -> "положительное четное число"
        a > 0 && a % 2 != 0 -> "положительное нечетное число"
        a < 0 && a % 2 == 0 -> "отрицательное четное число"
        else -> "отрицательное нечетное число"
    }
}

fun main() {
    val number = -34
    println(describeNumber(number))
}