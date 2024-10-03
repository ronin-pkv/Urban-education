package Kotlin.FunctionTypes

fun increaseArr(array: Array<Int>, index: Int = 0): Array<Int> {
    if (index >= array.size) {
        return array
    }

    if (index % 2 == 0) {
        array[index] += 1
    }

    return increaseArr(array, index + 1)
}

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println("Исходный массив: ${array.joinToString(", ")}")

    val newArray = increaseArr(array)
    println("Изменённый массив: ${newArray.joinToString(", ")}")
}
