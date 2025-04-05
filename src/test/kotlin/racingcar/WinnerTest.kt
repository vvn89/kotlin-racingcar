package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car
import racingcar.domain.Winner

class WinnerTest {
    @Test
    fun `가장 큰 위치를 가진 자동차를 반환한다`() {
        // given
        val a = Car("a")
        val b = Car("b")
        val c = Car("c")
        val players: List<Car> = listOf(a, b, c)

        // when
        a.move(5)
        b.move(3)
        c.move(1)
        val winner: List<Car> = Winner(players).findWinners()

        // then
        assertThat(winner).isEqualTo(listOf(a))
    }

    @Test
    fun `가장 큰 위치를 가진 자동차가 2대이면 2대 모두 반환한다`() {
        // given
        val a = Car("a")
        val b = Car("b")
        val c = Car("c")
        val players: List<Car> = listOf(a, b, c)

        // when
        a.move(5)
        b.move(3)
        c.move(7)
        val winner: List<Car> = Winner(players).findWinners()

        // then
        assertThat(winner).isEqualTo(listOf(a, c))
    }
}
