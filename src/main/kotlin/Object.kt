import kotlin.random.Random

// 오브젝트 연습

// 코틀린에는 object 키워드는, 싱글톤 패턴으로 인스턴스가 생성됨
// object 키워드를 선언하면 lazy 인스턴스가 준비되는데, lazy 인스턴스란 오브젝트가 처음 접근될 때만 생성되고, 접근되지 않으면 생성은 안됨

class LuckDispatcher {
    fun getNumber(): Int {
        val randNum = Random.nextInt(90)
        return randNum
    }
}

fun rentPrice(standartDays: Int, festivityDays: Int, specialDays: Int): Unit {

    val dayRates = object {
        var standard: Int = 30 * standartDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    } // 이때까지는 dayRates가 lazy 인스턴스이므로, 생성되지 않음

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price : $$total")

}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    println(d1.getNumber())
    println(d2.getNumber())

    rentPrice(10, 2, 1)
}
