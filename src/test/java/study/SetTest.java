package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {

  private Set<Integer> numbers;

  @BeforeEach
  void setUp() {
    numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
  }

  @Test
  @DisplayName("[요구사항1] Set의 size() 메소드를 활용해 numbers의 크기를 확인하는 테스트")
  void setSizeTest() {
    // size를 꺼내서 비교하는것말고 assertj 의 api 를 사용할수도 있다.
    assertThat(numbers).hasSize(3);
//    assertThat(numbers.size()).isEqualTo(3);
  }

  @Test
  @DisplayName("[요구사항2] contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 테스트")
  void containsTest() {
    assertThat(numbers.contains(1)).isTrue();
    assertThat(numbers.contains(2)).isTrue();
    assertThat(numbers.contains(3)).isTrue();
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3})
  @DisplayName("[요구사항2] contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 테스트")
  void parameterizedTest(int input) {
    assertThat(numbers.contains(input)).isTrue();
  }

  @ParameterizedTest
  @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
  @DisplayName("[요구사항3] 입력 값에 따라 결과 값이 다른 경우에 대한 테스트")
  void parameterizedTestV2(int input, boolean expected) {
    assertThat(numbers.contains(input)).isEqualTo(expected);
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3})
  @DisplayName("[리뷰 사항] assertj 에서 제공하는 contains 사용 테스트")
  void assertThatContainsTest(int input) {
    assertThat(numbers).contains(input);
  }
}
