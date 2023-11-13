package study.step3;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @ParameterizedTest(name = "자동차 전진 조건 테스트: {arguments}")
    @ValueSource(ints = {4, 7, 9})
    void 자동차_전진_조건_테스트(int randomValue) {
        Car car = new Car();
        int previousPosition = car.getPosition();
        car.move(randomValue);
        assertThat(car.getPosition()).isEqualTo(previousPosition + 1);
    }

    @ParameterizedTest(name = "자동차 정지 조건 테스트: {arguments}")
    @ValueSource(ints = {0, 1, 3})
    void 자동차_정지_조건_테스트(int randomValue) {

        Car car = new Car();
        int previousPosition = car.getPosition();
        car.move(randomValue);
        assertThat(car.getPosition()).isEqualTo(previousPosition);
    }
}