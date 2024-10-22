package Kotlin.genericConstraints

class States<T : Number>(private val numbers: Array<T>) {
    fun getAverage(): Double {
        var sum = 0.0
        for (number in numbers) {
            sum += number.toDouble()
        }
        return if (numbers.isNotEmpty()) sum/numbers.size else 0.0
    }
    fun <T> isItIncluded(array: Array<T>, element:T): Boolean {
        return array.contains(element)
    }
}

fun main() {
    val intStates = States(arrayOf(1,2,3,4,5,6,7))
    val average = intStates.getAverage()
    println("Среднее значение массива: $average")

    val elementToFind = 3
    val isItIncluded = intStates.isItIncluded(arrayOf(1,2,3,4,5,6,7), elementToFind)
    println("Содержится ли элемент $elementToFind в массиве: $isItIncluded")
}