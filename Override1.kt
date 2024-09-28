package Kotlin.Override

fun findLongestWord(words: Array<String>): String {
    var longestWord = ""
    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }
    return longestWord
}

fun main() {
    val words = arrayOf("яблоко", "банан", "арбуз", "вишня", "черешня", "ананас")
    val longestWord = findLongestWord(words)
    println("Самое длинное слово: $longestWord, количество букв: ${longestWord.length}")
}