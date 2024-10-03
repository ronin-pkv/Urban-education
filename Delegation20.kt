package Kotlin.Delegation

interface PalindromeChecker {
    fun isPalindrome(word: String): Boolean
}

class PalindromeCheck : PalindromeChecker {
    override fun isPalindrome(word: String): Boolean {
        val cleanedWord = word.replace("\\s".toRegex(), "").lowercase()
        val length = cleanedWord.length

        for (i in 0 until length / 2) {
            if (cleanedWord[i] != cleanedWord[length - 1 - i]) {
                return false
            }
        }
        return true
    }
}

class PalindromeVerifier(palindromeChecker: PalindromeChecker) : PalindromeChecker by palindromeChecker

fun main() {
    val word = "Уверен и не реву"
    val verifier = PalindromeVerifier(PalindromeCheck())

    if (verifier.isPalindrome(word)) {
        println("Слово(фраза) \"$word\" является палиндромом")
    } else {
        println("Слово(фраза) \"$word\" не является палиндромом")
    }
}