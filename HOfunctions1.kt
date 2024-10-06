package Kotlin.HOfunctions

fun increaseByOne(num: Int): Int {
    return num + 1
}

fun multiplyByTwo(num: Int): Int {
    return num * 2
}

fun modifyArray(array: Array<Int>, operation: (Int) -> Int): Array<Int> {
    return array.map { operation(it) }.toTypedArray()
}

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println("Исходный массив: ${numbers.joinToString (", ") }")

    val increasedArray = modifyArray(numbers, ::increaseByOne)
    println("Массив после увеличения на 1: ${increasedArray.joinToString (", ")  }")

    val multipliedArray = modifyArray(numbers, ::multiplyByTwo)
    println("Массив после умножения на 2: ${multipliedArray.joinToString (", ") }")
}