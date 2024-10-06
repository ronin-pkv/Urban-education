package Kotlin.HOfunctions

fun action (color1: String, color2: String, mixFunction: (String, String) -> String): String {
    return mixFunction(color1, color2)
}

fun mixColors(color1: String, color2: String): String {
    return "$color1 и $color2 смешались, получился новый цвет"
}

fun main() {
    val color1 = "Красный"
    val color2 = "Синий"

    val result = action(color1, color2, ::mixColors)
    println(result)
}