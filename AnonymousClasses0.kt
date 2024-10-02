package Kotlin.AnonymousClasses


fun main() {
    val words = arrayOf("Трактор", "Экскаватор", "Самосвал", "Бульдозер", "Бобкэт")

    val longestWord = words.maxByOrNull { it.length } ?: ""
    val wordLength = longestWord.length

    println("Самое длинное слово: $longestWord, количество букв в нём: $wordLength")
}