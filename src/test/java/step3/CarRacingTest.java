package step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CarRacingTest {

    @DisplayName("입력받은 숫자만큼의 자동차를 생성한다.")
    @Test
    public void makeRacingCar_ShouldReturnCreatedCarsCount() {
        String[] inputCarsName = {"test1", "test2", "test3", "test4", "test5"};
        int expectedCarsCount = 5;

        CarRacing carRacing = new CarRacing(inputCarsName);

        assertThat(carRacing.getCarList().size()).isEqualTo(expectedCarsCount);
    }

    @DisplayName("생성된 자동차는 전진하거나 그자리에 머무른다.")
    @Test
    public void moveForward_ShouldReturnGoOrStop() {
        String[] inputCarsName = {"test1", "test2", "test3", "test4", "test5"};
        int go = 1;
        int stop = 0;

        CarRacing carRacing = new CarRacing(inputCarsName);
        carRacing.moveForward();

        assertThat(carRacing.getCarList()).allSatisfy(car -> {
            assertThat(car.getCurrentPosition()).isGreaterThanOrEqualTo(stop);
            assertThat(car.getCurrentPosition()).isLessThanOrEqualTo(go);
        });
    }
}