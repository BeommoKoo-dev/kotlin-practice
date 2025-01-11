package day2

// 리스트 연습

// 코틀린에는 변경가능한 리스트(MutableList)와 읽기전용 리스트(List)가 있음.
// ImutableList를 변경하지 못하게 하려면, List로 캐스팅하면 됨.

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers // deep copy + List로 캐스팅

fun addSystemuser(newUser: Int) {
    systemUsers.add(newUser) // mutable하므로 add 가능
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemuser(4)
    getSysSudoers().forEach {
        i -> println("이용자 ${i}에 대한 정보")
    }
//    getSysSudoers().add(5) // sudoers List는 immutable하므로, add 불가능.
}
