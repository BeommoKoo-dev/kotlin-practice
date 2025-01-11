package day2

// also 연습

// apply 블록과 비슷하지만, 블록 안에서 오브젝트를 it으로 접근

val jake2 = Person2("jake", "seoul", "1234,123")
val jake2ToString = jake2.also {
    it.name = "jake2"
}

fun main() {
    println(jake2ToString)
}
