package day2

// flatMap 연습

// 컬렉션에 있는 아이템을 iterable한 형태로 바꾸고, 결과를 리스트로 return

val fruitsBag = listOf("사과", "오렌지", "바나나")
val clothesBag = listOf("티셔츠", "양말", "청바지")
val cart = listOf(fruitsBag, clothesBag)
val mapBag = cart.map { it } // cart 자신이 됨. [ [사과 오렌지 바나나] [티셔츠 양말 청바지] ]
val flatMapBag = cart.flatMap { it } // 두개의 리스트를 합친 하나의 리스트로 변환 [사과 오렌지 바나나 티셔츠 양말 청바지]

fun main() {
    println(mapBag)
    println(flatMapBag)
}
