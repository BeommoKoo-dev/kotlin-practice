// 변수 연습
fun main() {
    var a: String = "처음값" // var는 mutable.
    val b: Int = 1 // val은 immutable.
    val c = 3 // 코틀린은 타입추론(type interface)을 하므로, 자료형 지정 안해주어도 됨
//    b = 2 // b는 val이므로, 재할당 안됨
    var e: Int
//    println(e) // e에 접근하려면, e는 초기화가 된 상태여야만 함.
}
