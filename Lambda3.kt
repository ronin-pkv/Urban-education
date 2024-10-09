package Kotlin.Lambda


fun main() {
    val modifyArray: (Array<Int>) -> Array<Int> = { array ->
        array.map {
            if (it % 2 == 0) it / 2 else it * 3
        }.toTypedArray()
    }

    val arrayOfNumbers = arrayOf(-3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8)
    val modifiedArray = modifyArray(arrayOfNumbers)
    println("Изменённый массив: ${modifiedArray.joinToString(", ")}")
}
