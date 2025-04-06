package racingcar.domain

class RacingGame(inputNames: String) {
    val cars = inputNames.split(",").map { Car(it) }

    fun play(): List<Car> {
        cars.forEach {
            val randomNumber = (1..9).random()
            it.move(randomNumber)
        }
        return cars
    }
}
