package Kotlin.Scope

fun main() {
    val myString = "Привет, мир!"

    myString.let {
        println("Строка: \"$it\", длина: ${it.length}")
    }
}