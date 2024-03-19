package study.step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.step3.domain.Car;
import racingcar.step3.domain.CarFactory;
import racingcar.step3.domain.RacingCarGame;
import racingcar.step3.domain.RacingCarGameFactory;
import racingcar.step3.dto.RacingCarGameResultDto;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarGameTest {

  @ParameterizedTest
  @CsvSource(value = {"1:1", "5:5", "10:10"}, delimiter = ':')
  @DisplayName("자동차 경주 게임 시도 횟수만큼 게임 결과가 쌓이는지 테스트")
  void racingCarGameTest(int input, int expected) {
    List<Car> cars = CarFactory.of(input);
    List<RacingCarGame> racingCarGames = RacingCarGameFactory.of(input, cars);
    List<RacingCarGameResultDto> results = racingCarGames.stream().map(RacingCarGame::start).collect(Collectors.toList());
    assertThat(results).hasSize(expected);
  }
}