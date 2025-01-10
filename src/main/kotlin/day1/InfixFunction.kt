package day1// 중위함수 연습

class InfixFunctionPrac {

    infix fun Int.times(str: String) = str.repeat(this) // this : 여기서는 Int를 가리킴.

    infix fun String.onto(other: String) = Pair(this, other)

}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}

fun main() {

    val pair = "자바" to "오라클" // 내장 infix 함수
    println(pair)

    val koo = Person("손석구")
    val yeon = Person("장도연")
    koo likes yeon

    println(koo.likedPeople.get(0).name)

}
