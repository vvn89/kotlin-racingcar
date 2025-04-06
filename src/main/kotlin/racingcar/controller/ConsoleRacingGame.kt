package racingcar.controller

import racingcar.domain.RacingGame
import racingcar.domain.Winner
import racingcar.view.InputView
import racingcar.view.OutputView

class ConsoleRacingGame(
    private val inputView: InputView,
    private val outputView: OutputView,
) {
    fun run() {
        val inputNames = inputView.inputNames()
        val racingGame = RacingGame(inputNames)
        val round = inputView.inputRound()
        val cars = racingGame.cars
        repeat(round) {
            racingGame.play()
            outputView.printRaceProgress(cars)
        }
        val winners = Winner(cars).findWinners()
        outputView.printWinners(winners)
    }
}
