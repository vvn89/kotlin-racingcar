package racingcar

import racingcar.controller.ConsoleRacingGame
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    val inputView = InputView()
    val outputView = OutputView()
    val consoleRacingGame = ConsoleRacingGame(inputView, outputView)
    consoleRacingGame.run()
}
