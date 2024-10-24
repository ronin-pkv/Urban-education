package Kotlin.Infix

infix fun Int.add(other: Int): Int = this + other
infix fun Int.sub(other: Int): Int = this - other
infix fun Int.mul(other: Int): Int = this * other
infix fun Int.div(other: Int): Int = this / other

fun main() {
    val a = 10
    val b = 5

    println(a add b)
    println(a sub b)
    println(a mul b)
    println(a div b)
}