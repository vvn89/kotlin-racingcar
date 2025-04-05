package racingcar.domain

class Winner(private val cars: List<Car>) {
    fun findWinners(): List<Car> {
        val maxLocation = cars.maxOf { it.location }
        return cars.filter { it.location == maxLocation }
    }
}
