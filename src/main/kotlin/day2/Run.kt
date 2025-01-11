package day2

// run 연습

// run은 let과 거의 유사하지만, 블록 내에서 대상 오브젝트를 it이 아닌, this로 접근함

fun getNullableLength(ns: String?) {
    ns?.run {
        println(this.length)
    }
}

fun main() {
    getNullableLength(null)
    getNullableLength("hih")
}
