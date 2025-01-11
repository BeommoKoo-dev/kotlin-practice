package day2

// Collection Filter 연습

private val numbers = listOf(1, -2, 3, -4, 5, -6)
val positives = numbers.filter { x -> x > 0 }
val negatives = numbers.filter { it < 0 } // it 이용


fun main() {
    println(numbers)
    println(positives)
    println(negatives)
}
