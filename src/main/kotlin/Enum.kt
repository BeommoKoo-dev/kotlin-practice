// Enum 연습

enum class State {
    IDLE, RUNNING, FINISHED
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = this.rgb and 0xFF0000 != 0
}

fun main() {
    val state = State.RUNNING
    val message = when (state) {
        // exhaustive(All-covered) cases
        State.IDLE -> "대기 중"
        State.RUNNING -> "실행 중"
        State.FINISHED -> "완료"
    }
    println(message)

    println(Color.RED.containsRed()) // true
    println(Color.GREEN.containsRed()) // false
}
