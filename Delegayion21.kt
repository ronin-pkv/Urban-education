package Kotlin.Delegation

fun isPalindrome(word: String): Boolean {
    val cleanedWord = word.replace("\\s".toRegex(), "").lowercase()
    return cleanedWord == cleanedWord.reversed()
}

fun main() {
    val word = "Аргентина манит негра"
    if (isPalindrome(word)) {
        println("Слово(фраза) \"$word\" является палиндромом")
    } else {
        println("Слово(фраза) \"$word\" не является палиндромом")
    }
}