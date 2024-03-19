## [Step 3] 자동차 경주
### 구현 목록
<hr />
<br />

- [X] UI를 담당하는 로직을 구현한다.
  - [X] InputView Class 생성 (input data 입력)
    - 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
  - [X] ResultView Class 생성 (결과 출력)
    - 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
- [X] 랜덤 값을 구하는 유틸을 구현한다.
- [X] 핵심 로직을 구현한다.
  - [X] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
  - [X] 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
- [X] 모든 로직에 단위 테스트를 구현한다.
- [X] 구현한 내용을 확인할 수 있는 main 메서드를 생성한다.

<hr />

### 새롭게 알게된 내용
- [X] @Nested
- [X] 자동차를 N개 생성하는 로직은 어디로 가면 좋을까?
- [X] 전략 패턴
  - 참고: https://www.youtube.com/watch?v=vNsZXC3VgUA
- [X] 테스트 단위
  - public 으로 열어둔 메서드는 모두 작성해야한다~!
- [X] Test Fixture
  - 참고: https://tjdtls690.github.io/studycontents/java/2022-10-10-test_fixture/