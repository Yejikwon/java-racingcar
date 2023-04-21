package racingCar;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import racingCar.domain.game.RacingCarGame;
import racingCar.domain.game.RacingCarGameResult;
import racingCar.domain.game.move.RandomMoveAckGenerator;
import racingCar.domain.game.move.MoveAckGenerator;
import racingCar.view.RacingCarGameInputView;
import racingCar.view.RacingCarGameResultView;

public class RacingCarGameApplication {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    final List<String> carNames = RacingCarGameInputView.getCarNames(reader);
    final int moveTryCnt = RacingCarGameInputView.getMoveTryCnt(reader);
    final RacingCarGameResultView resultView = new RacingCarGameResultView();
    final MoveAckGenerator randomMoveAckGenerator = new RandomMoveAckGenerator();

    RacingCarGame racingCarGame = new RacingCarGame(carNames, randomMoveAckGenerator);
    RacingCarGameResult gameResult = racingCarGame.play(moveTryCnt);

    resultView.printGameResult(gameResult);
    reader.close();
  }
}