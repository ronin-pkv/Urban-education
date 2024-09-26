package Kotlin.Inheritance

class Dog(name: String, weight: Double) : Animal(name, weight) {

    fun bark() {
        println("$name лает.")
    }

    override fun eat() {
        println("$name ест кость.")
    }
}