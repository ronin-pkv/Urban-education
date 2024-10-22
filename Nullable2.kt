package Kotlin.Nullable

fun main() {
    val array1 = arrayOf("Привет","как", null, "дела")
    val array2 = array1.filterNotNull()
    println("Фильтрованный массив: $array2")
}