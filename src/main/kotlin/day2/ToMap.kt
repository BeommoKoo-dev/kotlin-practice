package day2

// map으로 변환 연습

// associateBy , groupBy함수를 통하여 컬렉션 -> Map 면환 가능
// 이때, keySelector 파라미터를 필수로 전달하여 무엇을 키값으로 정할지 정하고, 선택적으로 valueSelector 함수를 전달하여 value값을 변환하는 용도로 사용 가능
// associateBy : 같은 키값이 있으면 이전 값 무시하고 가장 마지막 값만 보관
// groupBy : 같은 키값이 있으면 모두 저장

data class Person(val name: String, val city: String, val phone: String)

val people = listOf(
    Person("석구", "서울", "02-1234-5678"),
    Person("성태", "부산", "051-23124-12312"),
    Person("효리", "제주", "06-4015124-213"),
    Person("상순", "제주", "06-4015124-981")
)

val phoneBook = people.associateBy { it.phone }
val cityBook = people.associateBy(Person::phone, Person::city)
val peopleCities = people.groupBy(Person::city, Person::name)
val lastPersonCity = people.associateBy(Person::city, Person::name)

fun main() {
    println(phoneBook)
    println(cityBook)
    println(peopleCities)
    println(lastPersonCity)
}
