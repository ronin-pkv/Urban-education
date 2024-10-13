package Kotlin.Generics

fun <T> printValue(value:T) {
    println(value)
}

fun main() {
    printValue(11)
    printValue("Привет")
    printValue(3.14)
    printValue(true)
}