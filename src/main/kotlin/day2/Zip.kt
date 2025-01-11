package day2

// zip 연습

// zip은 두개의 컬렉션을 전달받아, 하나의 컬렉션으로 '압축'
// 어떻게 압축할지도 선택 가능
// 디폴트는 List<Pair>로 반환

val A = listOf("a", "b", "c")
val B = listOf(1, 2, 3, 4)

val resultPairs = A zip B // 중위함수
val resultReduce = A.zip(B) { a, b -> "$a$b"}

fun main() {
    println(resultPairs)
    println(resultReduce)
}

