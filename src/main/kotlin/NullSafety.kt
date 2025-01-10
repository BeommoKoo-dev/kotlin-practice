// Null-safety 연습
fun main() {
    var neverNull: String = "이 변수는 null이 될 수 없습니다."
    println(neverNull)
//    neverNull = null // neverNull은 String뒤에 ?가 안 붙어 있으므로, null이 될 수 없음.
    var nullable: String? = "이 변수는 null이 될 수 있습니다."
    nullable = null
    var inferedNonNull = "컴파일러 타입추론은 null-불가로 봅니다."
//    infereedNonNull = null // 타입추론 또한 null이 될 수 없음

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
    if (nullable != null) {

    }
    println(strLength(neverNull))
//    strLength(nullable) // strLength는 String?을 파라미터로 받을 수 없음
}
