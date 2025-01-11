package day2

// find 연습

// find함수는 컬렉션의 앞부터 차례로 찾아봄
// findLast함수는 컬렉션의 뒤부터 찾음
// 조건에 해당하는 요소가 없으면, null return

val words = listOf("컬렉션에", "있는", "어떤", "아이템", "아이들", "찾기")

val first = words.find { it.startsWith("아이") } // 아이템
val last = words.findLast { it.startsWith("아이") } // 아이들

val nothing = words.find { it.startsWith("없는") } // null

fun main() {
    println(first)
    println(last)
    println(nothing)
}
