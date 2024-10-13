package Kotlin.Generics

fun <T> wrap(value: T, wrapper: Char): String {
    return when(wrapper) {
        '{' -> "{$value}"
        '[' -> "[$value]"
        '(' -> "($value)"
        else -> value.toString()
    }
}

fun main() {
    val a: Int = 11
    val b: String = "Привет"
    val c: List<Int> = listOf(12, 8,5,7,1)
    val d: Char = 'Д'


    println(wrap(a, '{'))
    println(wrap(b, '['))
    println(wrap(c, '['))
    println(wrap(d, '('))

}