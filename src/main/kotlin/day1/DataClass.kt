package day1// 데이터 클래스 연습

// 데이터 클래스는 평범한 값들은 보관하는 용도의 클래스를 쉽게 만드는데 사용. java의 record와 비슷
// copy(), toString(), eqauls & hascode 등을 자동으로 구현
// copy function은 deep copy가 아닌, shallow copy!

data class User(val name: String, val id: Int) {
    override fun equals(other: Any?) =
        other is User && other.id == this.id
}

fun main() {
    val user = User("석구", 1)
    println(user) // default toString()이 실행

    val secondUser = User("석구", 1)
    val thirdUser = User("석구", 2)

    println("user == secondUser: ${user == secondUser}") // true
    println("user == thirdUser: ${user == thirdUser}") // false

    // hashCode() function
    println(user.hashCode())
    println(secondUser.hashCode()) // user와 secondUser의 hashCode는 같다.
    println(thirdUser.hashCode())

    // copy() function
    val copyUser = user.copy()
    println(user === copyUser) // false
    println(user.hashCode() == copyUser.hashCode()) // true

    println("name = ${user.component1()}")
}
