package study.step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.step3.domain.Car;
import racingcar.step3.domain.strategy.CarMoveAlwaysFalseStrategy;
import racingcar.step3.domain.strategy.CarMoveAlwaysTrueStrategy;

import static org.assertj.core.api.Assertions.assertThat;
import static racingcar.step3.domain.Car.DEFAULT_START_POSITION;

public class CarMoveTest {

  @Test
  @DisplayName("isMovable()이 true인 경우, 자동차 전진 테스트")
  void carMoveTest() {
    Car car = new Car("car1", new CarMoveAlwaysTrueStrategy());
    car.move();
    assertThat(car.getPosition()).isEqualTo(DEFAULT_START_POSITION + 1);
  }

  @Test
  @DisplayName("isMovable()이 false 경우, 자동차가 전진하지 않는 경우 테스트")
  void carStopTest() {
    Car car = new Car("car1", new CarMoveAlwaysFalseStrategy());
    car.move();
    assertThat(car.getPosition()).isEqualTo(DEFAULT_START_POSITION);
  }
}
