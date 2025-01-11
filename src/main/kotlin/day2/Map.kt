package day2

// Map 연습

// Map을 만드려면 {mapOf(), mutableMapOf()} + 중위함수 to를 사용하면 됨
// Map역시 mutable Map과, 읽기전용인 Map이 있음

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, Pair(2, 100), 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("업데이트 accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("에러 : 계정이 없습니다 (id: $accountId)")
    }
}

fun accountReport() {
    println("EZ-Pass 현황:")
    EZPassReport.forEach {
        k, v -> println("ID $k: 포인트 $v")
    }
}

fun main() {
    accountReport()
    updatePointsCredit(1)
    updatePointsCredit(2)
    updatePointsCredit(15012)
    accountReport()
}
