package Kotlin.Inheritance

class Nokia(model: String) : Smartphone("Nokia", model) {
    fun snakeGame() {
        println("Игра в Snake на $model.")
    }
}