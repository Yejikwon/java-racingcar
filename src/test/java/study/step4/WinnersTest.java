package study.step4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.step4.domain.Car;
import racingcar.step4.domain.Winners;
import racingcar.step4.domain.strategy.RandomCarMoveStrategy;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {

  private static List<Car> CARS = new ArrayList<>();

  @BeforeEach
  void beforeEach() {
    CARS = List.of(
        new Car("car1", new RandomCarMoveStrategy()),
        new Car("car2", new RandomCarMoveStrategy()),
        new Car("car3", new RandomCarMoveStrategy())
    );
  }

  @Test
  @DisplayName("가장 멀리 이동한 자동차가 우승자로 뽑히는지 테스트")
  void winnerTest() {
    CARS.get(0).move(bound -> 1);
    CARS.get(1).move(bound -> 2);
    CARS.get(2).move(bound -> 10);

    Winners winners = Winners.pickWinners(CARS);

    assertThat(winners.getWinnerNames()).hasSize(1);
    assertThat(winners.getWinnerNames().get(0)).isEqualTo("car3");
  }

  @Test
  @DisplayName("가장 멀리 이동한 자동차가 2대인 경우 우승자로 n명이 뽑히는지 테스트")
  void winnerTest2() {
    CARS.get(0).move(bound -> 1);
    CARS.get(1).move(bound -> 2);
    CARS.get(2).move(bound -> 10);

    CARS.get(0).move(bound -> 1);
    CARS.get(1).move(bound -> 10);
    CARS.get(2).move(bound -> 2);


    Winners winners = Winners.pickWinners(CARS);

    assertThat(winners.getWinnerNames()).hasSize(2);
    assertThat(winners.getWinnerNames().get(0)).isEqualTo("car2");
    assertThat(winners.getWinnerNames().get(1)).isEqualTo("car3");
  }
}
