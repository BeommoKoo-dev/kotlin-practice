package day1// 고차함수 연습

// 고차함수란, 다른 함수를 파라미터로 받거나, 반환값으로 함수를 돌려주는 함수를 말함

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int) : Int { // operation이란 함수를 파라미터로 받으므로 calculate함수는 고차함수
    return operation(x, y)
}

fun sum(x: Int, y: Int): Int = x + y

fun square(x: Int) : Int {
    return x * x
}

fun operation(): (Int) -> Int {
    return ::square
}

fun main() {
    val sumResult = calculate(1, 2, ::sum)
    val lambdaResult = calculate(3, 5, {a, b -> a * b})

    println(sumResult)
    println(lambdaResult)

    val func: (Int) -> Int = operation() // Int를 받아서 Int를 return하는 func라는 함수를 선언
    println(func(2))
}
