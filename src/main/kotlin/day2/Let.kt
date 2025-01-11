package day2

// let 블록 연습
// 범위 제한 혹은 null check 용으로 사용
// let으로 감싼 코드블록 실행후, 결과값을 expression의 리턴값으로 돌려받음.

val empty = "test".let {
    println(it) // it에는 자기 자신 (test) 가 담김
    it.isEmpty() // let 블록의 리턴값 ( false )
}

fun printNonNull(str: String?) {
    str?.let { // null이 아닐 때 let 블록을 탐
        println(it)
    }
}

fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    strOne?.let { firstString -> // it이 아닌 다른 이름으로 변수 지정
        strTwo?.let { secondString ->
            println("first : $firstString, second : $secondString")
        }
    }
}

fun main() {
    println(empty) // false
    printNonNull(null)
    printNonNull("null")
    printIfBothNonNull(null, "NotNull")
    printIfBothNonNull("NotNull", "NotNull")
}
