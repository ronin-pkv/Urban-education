package Kotlin.Extentions

fun String.concat(other: String): String {
    return this + other
}

fun main() {
    val str1 = "Привет"
    val str2 = " мир!"
    println(str1.concat(str2))
}