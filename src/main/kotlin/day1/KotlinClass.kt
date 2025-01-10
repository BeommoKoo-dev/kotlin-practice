package day1

// 코틀린 클래스 연습
class Customer // 본문이 없는 클래스의 경우, 중괄호 생략

class Contact(val id: Int, var email: String) // 주 생성자가 있는 클래스

fun main() {
    val customer = Customer() // 코틀린은 new 연산자가 없음.

    val contact = Contact(1, "mary@gmail.com")

    println(contact.id)
    contact.email = "jane@gmail.com" // day1.Contact 클래스의 email필드는 var이므로, mutable
    println(contact.email)
}
