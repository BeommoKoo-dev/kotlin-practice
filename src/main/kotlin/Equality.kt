// 동등성과 동일성 연습

// a == b는 동등성
// a === b는 동일성

fun main() {
    val authors = setOf("셰익스피어", "헤밍웨이", "트웨인")
    val writers = setOf("헤밍웨이", "트웨인", "셰익스피어")

    println(authors == writers) // true
    println(authors === writers) // false
}
