package racingcar.view

class InputView {
    fun inputNames(): String {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        val inputNames = readln()
        return inputNames
    }

    fun inputRound(): Int {
        println("시도할 횟수는 몇 회인가요?")
        val inputRound = readln()
        return inputRound.toIntOrNull()
            ?: throw IllegalArgumentException("유효하지 않은 입력입니다. 다시 입력해주세요.")
    }
}
