package racingcar.domain

class Car(val name: String) {
    var location: Int = 0
        private set

    init {
        require(name.length in 1..5) { "자동차 이름은 5글자를 초과할 수 없습니다." }
    }

    fun move(number: Int) {
        if (number >= MOVABLE_CONDITION) {
            location++
        }
    }

    companion object {
        private const val MOVABLE_CONDITION = 5
    }
}
