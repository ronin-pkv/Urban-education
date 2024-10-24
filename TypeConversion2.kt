package Kotlin.TypeConversion

fun <T> valInput(input: T) {
    when (input) {
        is Int -> println("Сумма числа и единицы: ${input + 1}")
        is String -> println("Длина строки и единицы: ${input.length + 1}")
        is Array<*> -> {
            if (input.all { it is Int }) {
                val sum = (input as Array<Int>).sum()
                println("Сумма элементов массива: $sum")
            } else {
                println("Массив содержит не только целые числа")
            }
        }

        else -> println("Неизвестный тип")
    }
}

fun main() {
    valInput(134)
    valInput("Здавствуйте")
    valInput(arrayOf(1, 2, 3, 4, 45))
}