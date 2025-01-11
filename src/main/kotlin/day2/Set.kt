package day2

// Set 연습

// Set 역시 MutableSet이 있고, 읽기전용으로 만드려면 Set으로 캐스팅

val openIssues: MutableSet<String> = mutableSetOf("mutableSet", "uniqueVal1", "uniqueVal2")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "잘 남겼습니다." else "중복 이슈입니다."
}

fun main() {
    val newIssue: String = "uniqueVal3"
    val anIssueAlreadyIn: String = "uniqueVal2"

    val aNewIssueStat = getStatusLog(addIssue(newIssue))
    val anIssueAlreadyInStat = getStatusLog(addIssue(anIssueAlreadyIn))
    println("이슈 $newIssue $aNewIssueStat") // 잘 남겼습니다.
    println("이슈 $anIssueAlreadyIn $anIssueAlreadyInStat") // 중복 이슝비니다.
}
