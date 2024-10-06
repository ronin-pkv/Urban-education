package Kotlin.AnonymFunc

fun main() {
    val combineStrings = {str1: String, str2: String -> "$str1 $str2"}
    val combined = combineStrings("Здравствуйте,", "я ваша тётя.")
    println(combined)
}

