package day1// when 연습
// when은 반환값이 남지 않는 명령문(statement) 방식이나, 반환값을 반환하는 표현식(expression) 형태로 사용 가능

// statement는 when절 내에 else가 없어도 된다.
fun casesWithStatement(obj: Any) { // Any : java의 Object와 같음
    when (obj) {
        1 -> println("하나") // 코틀린은 when(switch문)에 break가 ㅇ벗음
        "안녕" -> println("인사")
        is Long -> println("Long") // is 중위함수 사용
        !is String -> println("문자열 아님")
        else -> println("그 외")
    }
}
// expression은 when절 내에 else가 있어야 한다. (exhaustive)
fun casesWithReturn(obj: Any): Any {
    return when(obj) {
        1 -> "하나"
        "안녕" -> 1
        is Long -> false
        else -> 42
    }
}

fun main() {
    casesWithStatement(1)
    casesWithStatement("안녕")
    casesWithStatement(2L)
    casesWithStatement(0.2)
    casesWithStatement("문자열인데 그 외")

    println()

    println(casesWithReturn(1))
    println(casesWithReturn("안녕"))
    println(casesWithReturn(1L))
    println(casesWithReturn(41))
    println(casesWithReturn(42))
}
