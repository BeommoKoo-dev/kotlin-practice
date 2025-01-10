package day1// 람다 함수 연습

val upperCase1: (String) -> String = { str: String -> str.uppercase() }
val upperCase2: (String) -> String = {str -> str.uppercase()} // str의 자료형을 선언하지 않아도 됨.(타입추론)
val upperCase3 = {str: String -> str.uppercase()} // 람다의 input : String, 반환 : String 이므로 람다의 함수의 input/output 자료형 선언하지 않아도 됨(타입출노)
//val upperCase4 = {str -> str.uppercase()} // 타입추론 불가능한 케이스. 람다 어디에도 자료형이 적혀있지 않음
val upperCase5: (String) -> String = {it.uppercase()} // it이 String이라는 것을 타입추론 가능
val upperCase6: (String) -> String = String::uppercase

fun main() {
    println(upperCase1("hellO"))
    println(upperCase2("hEllo"))
    println(upperCase3("heLlo"))
    println(upperCase5("Hello"))
    println(upperCase6("helLo"))
}

