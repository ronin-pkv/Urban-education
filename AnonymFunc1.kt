package Kotlin.AnonymFunc

fun main() {
    val isEven = { number: Int -> number % 2 == 0 }

    fun checkArrayElement(array:Array<Int>, checkEven: (Int) -> Boolean) {
        for (element in array) {
            if (checkEven(element)) {
                println("$element - Чётное")
            } else {
                println("$element - Не чётное")
            }
        }
    }

    val numbers = arrayOf(1,2,3,4,5,6)

    checkArrayElement(numbers, isEven)
}
