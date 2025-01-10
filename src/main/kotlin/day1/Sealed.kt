package day1// Sealed class 연습

// 클래스 상속을 특정 범위로 제한 가능
// 같은 패키지 안에서만 상속 가능

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human ->
            return "안녕하세요, 사람입니다. 직업은 ${mammal.job}" // smart casting
        is Cat ->
            return "안녕하세요, 고양입니다."
    }
}

fun main() {
    val cat = Cat("나비")
    val human = Human("범모", "개발자")

    println(greetMammal(cat))
    println(greetMammal(human))
}
