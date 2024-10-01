package Kotlin.Enum

fun countDuplicateChars(input: String) {
    var charCount = mutableMapOf<Char, Int>()

    for (char in input) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }

    println("Повторяющиеся символы:")
    for ((char, count) in charCount) {
        if (count > 1) {
            println("Символ '$char' повторяется $count раз(а)")
        }
    }
}

fun main() {
    val inputString = "Шумоизоляция"
    countDuplicateChars(inputString)
}
