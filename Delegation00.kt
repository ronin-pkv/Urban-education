package Kotlin.Delegation

interface BinaryConverter {
    fun toBinary(decimal: Int): String
}

class BinaryConversion : BinaryConverter {
    override fun toBinary(decimal: Int): String {
        var num = decimal
        val binary = StringBuilder()

        while (num > 0) {
            binary.insert(0, num % 2)
            num /= 2
        }

        return if (binary.isNotEmpty()) binary.toString() else "0"
    }
}

class DecimaltoBinary(binaryConverter: BinaryConverter): BinaryConverter by binaryConverter

fun main() {
    val decimal = 34
    val converter = DecimaltoBinary(BinaryConversion())
    val binary = converter.toBinary(decimal)
    println("Десятичное число $decimal в двоичной системе: $binary")
}
