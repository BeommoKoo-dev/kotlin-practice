package day2

// any, all, none 연습

// any 함수는 컬렉션에 참인 요소가 하나라도 있으면 true 반환
private val numbers = listOf(1, -2, 3, -4, 5, -6)
val anyNegative = numbers.any { it < 0 }
val anyGT6 = numbers.any { it > 5 }

// all 함수는 모든 요소가 참일때 true 반환
val allEven = numbers.all { it % 2 == 0 }
val allLess6 = numbers.all { it < 6 }

// none 함수는 모든 요소가 거짓일때 true 반환
val allLessThan6 = numbers.none { x -> x < 6 }
val allGreaterThan5 = numbers.none { x -> x > 5 }
val allOdd = numbers.none { it % 2 == 1 }

fun main() {
    println(anyNegative)
    println(anyGT6)

    println(allEven)
    println(allLess6)

    println(allLessThan6)
    println(allGreaterThan5)
    println(allOdd)
}
