package day1

// 상속 연습
open class Dog { // 코틀린에서 기본적으로 상속이 x(기본적으로 final class) -> 상속을 허용하기 위해서는 open 키워드를 붙여줌.
    open fun sayHello() {
        println("멍멍!")
    }

    fun canNotOverride() {
        println("상속 안됨")
    }
}

class Chiwawa : Dog() { // Chiwawa는 Dog를 상속한다.
    override fun sayHello() {
        println("치와와!")
    }

//    override fun canNotOverride() { // canNotOverride()는 open 키워드가 없기 때문에, 상속 불가능
//
//    }
}

fun main() {
    var dog = Dog()
    dog.sayHello()
    dog = Chiwawa() // 다운캐스팅
    dog.sayHello()
}
