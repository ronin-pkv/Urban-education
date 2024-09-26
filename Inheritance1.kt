package Kotlin.Inheritance

fun main() {
    val nokia = Nokia("3310")
    val sony = Sony("Xperia")
    val iphone = IPhone("iPhone 12")

    nokia.call()
    nokia.snakeGame()

    sony.call()
    sony.playMusic()

    iphone.call()
    iphone.useFaceID()
}