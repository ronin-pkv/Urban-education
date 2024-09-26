package Kotlin.Inheritance

open class IPhone(model: String) : Smartphone("Apple", model) {
    fun useFaceID() {
        println("Разблокировка Face ID на $model.")
    }
}
