package day2

// apply 연습

// apply 블록은 어떠한 객체에 어떠한 동작을 취하고, 그 객체를 다시 리턴해줌.
// 블록 내에서 오브젝트를 this로 접근 (생략 가능)

data class Person2(var name: String, var city: String, var phone: String)

val jake = Person2("jake", "seoul", "010-1234-1234")
val jakeToString = jake.apply {
    name = "jake2"
    city = "jeju"
}.toString()

fun main() {
    println(jakeToString)
}
