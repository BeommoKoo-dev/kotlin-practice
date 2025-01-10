package day1// 범위 연습

fun main() {
    for (i in 0..3) {
        print(i.toString() + ' ')
    }
    println()

    for (i in 0 until 3) {
        print(i)
    }
    println()

    for (i in 2..8 step 2) {
        print(i)
    }
    println()

    for (i in 3 downTo 0) {
        print(i)
    }
    println()

    val x = 2
    if (x in 1..5) {
        println("x는 : " + x)
    }

    if (x !in 6..10) {
        println("x는 6이상 10이하가 아님")
    }
}
