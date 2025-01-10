package day1

// 연산자 함수 연습
fun main() {
    fun printAll(vararg messages: String) {
        for(m in messages) println(m)
    }
    printAll("Hello", "printAll", "func", "prac")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for(m in messages) println(prefix + m)
    }
    printAllWithPrefix("Hello", "printAllWithPrefix", prefix = "Greeting: ") // 이름지정 파라미터를 '반드시' 지정

    fun log(vararg entries: String) {
        printAll(*entries) // vararg파라미터 그대로 다시 전달하기 위해, entries라는 변수 앞에 '*'를 붙여줌.
    }
    log("Hello", "logFunc")
}
