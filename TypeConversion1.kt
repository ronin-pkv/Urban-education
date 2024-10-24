package Kotlin.TypeConversion

fun checkInputType(input: Any) {
    when (input) {
        is String -> println("Это строка: $input")
        is Int -> println("Это целое число: $input")
        is Double -> println("Это число с плавающей точкой: $input")
        is Char -> println("Это символ: $input")
        else -> println("Неизвестный тип")
    }
}

fun main() {
    checkInputType("Привет")
    checkInputType(12)
    checkInputType(34.53)
    checkInputType('Ж')
    checkInputType(true)
}