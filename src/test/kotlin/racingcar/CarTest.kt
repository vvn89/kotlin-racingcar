package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import racingcar.domain.Car

class CarTest {
    @Test
    fun `자동차는 이름을 가진다`() {
        // given
        val name = "tobae"

        // when
        val car = Car(name)

        // then
        assertThat(car.name).isEqualTo(name)
    }

    @Test
    fun `자동차는 위치를 가지며 기본 위치는 0이다`() {
        // given
        val name = "tobae"

        // when
        val car = Car(name)

        // then
        assertThat(car.location).isEqualTo(0)
    }

    @ValueSource(strings = ["", "여섯글자이름", "아주아주아주아주아주아주아주길고긴길어도너무너무너무너무긴이름"])
    @ParameterizedTest
    fun `자동차 이름이 없거나 6글자 이상이면 예외를 던진다`(name: String) {
        assertThrows<IllegalArgumentException> { Car(name) }
    }

    @ValueSource(ints = [1, 2, 3, 4])
    @ParameterizedTest
    fun `자동차는 0에서 4 사이이면 전진하지 않는다`(number: Int) {
        // given
        val name = "tobae"

        // when
        val car = Car(name)
        car.move(number)

        // then
        assertThat(car.location).isEqualTo(0)
    }

    @ValueSource(ints = [5, 6, 7, 8, 9])
    @ParameterizedTest
    fun `자동차는 5에서 9 사이이면 전진한다`(number: Int) {
        // given
        val name = "tobae"

        // when
        val car = Car(name)
        car.move(number)

        // then
        assertThat(car.location).isEqualTo(1)
    }

    @Test
    fun `자동차는 현재의 위치를 반환한다`() {
        // given
        val car = Car("tobae")

        // when
        car.move(5)
        car.move(4)
        car.move(7)
        car.move(8)
        car.move(1)

        // then
        assertThat(car.location).isEqualTo(3)
    }
}
