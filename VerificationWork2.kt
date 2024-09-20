package Kotlin.VerificationWork

fun printSequence(a:Int, b:Int) {
    for (i in a..b) {
        for (j in 1..(i - a + 1)) {
            print("$i ")
        }
    }
    println()
}

fun main() {
    print("Числа от A до B c повторениями:")
    printSequence(4, 7)
}