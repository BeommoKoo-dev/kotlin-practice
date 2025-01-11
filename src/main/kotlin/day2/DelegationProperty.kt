package day2

import kotlin.reflect.KProperty

// 위임패턴 - 속성 연습

// 코틀린의 위임속성 기능은, 위임하려는 객체의 setValue(), getValue()를 이용 가능하다.
// 이때, 위임받는 클래스의 필드가 변경가능한 필드라면, 위임하려는 객체에 setValue()까지 무조건 구현되어 있어야 한다.

class Example {
    var p: String by Delegate() // p라는 필드는 mutable하므로, Delegate 클래스에 setValue까지 구현되어 있어야 함
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, '${prop.name}' 속성을 위임했습니다!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$thisRef 인스턴스에 있는 ${prop.name} 속성으로 지정된 값은 ${value}입니다.")
    }
}

class LazySample {
    init {
        println("created!")
    }

    val lazyStr: String by lazy { // lazy라는 기본 위임 속성을 이용하여, 지연 초기화
        println("첫 호출에만 프린트됨!") // lazyStr이라는 프로퍼티에 처음 접근시에만 리턴값 이전의 블록이 수행되고
        "지연 값" // 이후 lazyStr 프로퍼티에 접근시 마지막 line에 있는 값만 리턴해줌.
    }
}

fun main() {
    val e = Example()
    println(e.p) // 단순히 Example 클래스의 p라는 필드에 접근하는 것이 아닌, Delgate 클래스의 getter가 호출됨.
    e.p = "NEW" // Delegate 클래스의 setter 호출

    val sample = LazySample()
    println("lazyStr = ${sample.lazyStr}") // 첫 호출에만 프린트됨! + 지연값
    println("lazyStr = ${sample.lazyStr}") // 지연값

}
