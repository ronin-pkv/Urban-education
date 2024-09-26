package Kotlin.Inheritance

open class Animal (val name: String, val weight: Double) {
    open fun eat() {
        println("$name ест.")
    }
}