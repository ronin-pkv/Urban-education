package Kotlin.Delegation

interface DecimalConverter {
    fun toDecimal(binary: String): Int
}

class DecimalConversion : DecimalConverter {
    override fun toDecimal(binary: String): Int {
        var result = 0
        var power = 1

        for (i in binary.length - 1 downTo 0) {
            if (binary[i] == '1') {
                result += power
            }
            power *= 2
        }
        return result
    }
}

class BinaryToDecimal(decimalConverter: DecimalConverter) : DecimalConverter by decimalConverter

fun main() {
    val binary = "100010"
    val converter = BinaryToDecimal(DecimalConversion())
    val decimal = converter.toDecimal(binary)
    println("Двоичное число $binary в дестичной системе: $decimal")
}