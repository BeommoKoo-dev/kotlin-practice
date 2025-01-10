package day1// 반복문 연습(for, do-while)

fun main() {
    val cakes = listOf("당근", "치즈", "초콜릿")

    for (cake in cakes) {
        println("맛있는 ${cake}케이크!")
    }

    var count = 5;
    while (count > 0) {
        println("안녕!")
        count--;
    }

    do {
        println("안녕! 이건 한번만 실행될거야!")
    } while (count > 0)
}

