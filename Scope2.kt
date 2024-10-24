package Kotlin.Scope

fun main() {
    val numbers = arrayOf(1,2,3,4,56)

    with(numbers) {
        println("Массив: ${this.joinToString()}")
        println("Количество элементов в массиве: ${this.size}")
        val sum = this.sum()
        println("Сумма элементов: $sum")
    }
}