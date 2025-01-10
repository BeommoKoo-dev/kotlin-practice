// 함수 연습

class FunctionPrac {

    fun printMessage(message: String): Unit { // : 뒤에는 return type이 붙음
        println(message)
    }

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] : $message")
    }

    fun multiply(x: Int, y: Int) = x * y

}

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix(prefix = "thisisPre", message = "thisisMessage")
    println(multiply(1, 2))
    println(multiply(y = 2000, x = 1000))
}
