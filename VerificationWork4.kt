package Kotlin.VerificationWork

fun riddle() {
    val corAnswer = "троллейбус"
    var attempts = 3

    println("Что это такое: синий, большой, с усами и полностью набит зайцами?")

    while (attempts > 0) {
        print("Введите ваш ответ: ")
        val answer = readLine()?.lowercase()

        when (answer) {
            corAnswer -> {
                println("Верно!")
                break
            }
            "сдаюсь" -> {
                println("Правильный ответ: троллейбус.")
                break
            }
            else -> {
                attempts--
                if (attempts > 0) {
                    println("Подумай еще. Осталось попыток: $attempts.")
                } else {
                    println("Попытки закончились. Правильный ответ: троллейбус.")
                }
            }
        }
    }
}

fun main() {
    riddle()
}
