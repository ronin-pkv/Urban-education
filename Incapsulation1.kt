package Kotlin.Incapsulation

fun modifyVariable() {
    var a = 10
    a += 7
    a -= 4
    a *= 2
    a %= 3

    println("Результат: $a")
}

fun main() {
    modifyVariable()
}