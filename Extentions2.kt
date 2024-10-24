package Kotlin.Extentions

fun String.lastIndex(): Int {
    return this.length - 1
}

fun main() {
    val str = "Здравствуйте, я ваша тётя!"
    println("Последний индекс строки \"$str\": ${str.lastIndex()}")
}