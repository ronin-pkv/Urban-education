package Kotlin.Inheritance

class Cat(name: String, weight: Double) : Animal(name, weight) {

    fun meow() {
        println("$name мяукает.")
    }

    override fun eat() {
        println("$name ест рыбу.")
    }
}
