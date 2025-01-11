package day2

// 위임패턴 연습

interface SoundBehavior {
    fun makeSound()
}

class ScreamBehavior(val n: String): SoundBehavior {
    override fun makeSound() {
        println("hihi $n")
    }
}

class RockAndRollBehavior(val n: String): SoundBehavior {
    override fun makeSound() {
        println("I'm the king of Rock n Roll : $n")
    }
}

class TomAraya(n: String): SoundBehavior by ScreamBehavior(n) // by 중위함수를 이용하여 위임 패턴 구현

class ElvisPresley(n: String): SoundBehavior by RockAndRollBehavior(n)

fun main() {
    val tomAraya = TomAraya("Thresh Metal")
    tomAraya.makeSound()
    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()
}
