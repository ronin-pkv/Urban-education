package Kotlin.VerificationWork

fun isPrime(n:Int): Boolean {
    if (n < 2) return false
    for (i in 2..n / 2) {
        if (n % 2 == 0) return false
        else if (n % 3 == 0) return false
    }
    return true
}

fun main() {
    val number = 9
    if (isPrime(number)) {
        println("$number является простым числом")
    } else {
        println("$number не является простым числом")
    }
}