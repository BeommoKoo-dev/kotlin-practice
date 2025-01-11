package day2

import java.lang.Math.abs

// 컬렉션 정렬 연습

val shuffled = listOf(5, 4, 2, 1, 3, -10)
val natural = shuffled.sorted()
val inverted = shuffled.sortedBy { -it }
val descending = shuffled.sortedDescending()
val descendingBy = shuffled.sortedByDescending { abs(it) }

fun main() {
    println(natural)
    println(inverted)
    println(descending)
    println(descendingBy)
}
