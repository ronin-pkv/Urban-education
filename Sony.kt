package Kotlin.Inheritance

class Sony(model: String) : Smartphone("Sony", model) {
    fun playMusic() {
        println("Воспроизведение музыки на $model.")
    }
}