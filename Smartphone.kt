package Kotlin.Inheritance

open class Smartphone(val brand: String, val model: String) {
    open fun call() {
        println("Звонок с $brand $model.")
    }
}