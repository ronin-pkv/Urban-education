package Kotlin.Lambda

fun main() {


    fun repeatAction(count: Int, action: () -> Unit) {
        repeat(count) {
            action()
        }
    }

    val printMsg = { println("Вывод сообщения через лямбду") }

    repeatAction(5, printMsg)
}
