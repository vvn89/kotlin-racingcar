package racingcar.view

import racingcar.domain.Car

class OutputView {
    fun printRaceStart() {
        println("\n실행 결과")
    }

    fun printRaceProgress(players: List<Car>) {
        players.forEach { println("${it.name} : ${symbol(it.location)}") }
        println()
    }

    private fun symbol(location: Int): String {
        return "-".repeat(location)
    }

    fun printWinners(winners: List<Car>) {
        val winnersString = winners.map { it.name }.joinToString()
        println("최종 우승자 : $winnersString")
    }
}
