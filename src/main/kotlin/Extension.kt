// 확장함수 && 확장속성 연습

// 누가 "이미 만들어 둔" 클래스에 기능을 추가하여 사용할 때, 유용하다!

// 이미 있는 특정 클래스에 새로운 멤버를 나중에 추가할 수 있음
// 어떤 타입에서 확장할지 명시해야 함.

data class Item(val name: String, val price: Int)
data class Order(val items: Collection<Item>)

// Order라는 "특정한 타입"에서 확장한다고 명시해줌.
fun Order.maxPricedItemValue(): Int = this.items.maxByOrNull { it.price }?.price ?: 0 // 확장함수
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCT" // 확장함수

val Order.commaDelimitedItemNames: String
    get() = items.map { it. name }.joinToString()

fun main() {
    val order = Order(listOf(Item("빵", 5000), Item("피자", 20000), Item("치킨세트", 25000)))

    println("가장 비싼 식료품: ${order.maxPricedItemName()}")
    println("가장 비싼 가격: ${order.maxPricedItemValue()}")
    println("식료품 : ${order.commaDelimitedItemNames}")
}
