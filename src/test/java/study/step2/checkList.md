## 기능 요구사항
#### - 문자열 덧셈 계산기를 통한 TDD 실습
<hr />
<br />

#### 기본 구분자: 쉼표(,) 또는 콜론(:)
- [X] 해당 구분자를 가지는 문자열 테스트
- [X] 정의하지 않은 구분자가 포함된 문자열 테스트

<br />

#### 구분자를 기준으로 문자열 분리
- [X] 정상적으로 분리되는지 테스트

<br />

#### 분리한 각 숫자의 합을 반환
- [X] null 또는 empty 값인 경우, default value 리턴하는지 테스트
- [X] 숫자가 아닌 경우, 아래의 '예외 처리'를 따르는지 테스트
- [X] 음수가 들어온 경우, 아래의 '예외 처리'를 따르는지 테스트

<br />

#### 커스텀 구분자 적용 가능
- [X] 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 <br/> 커스텀 구분자로 사용하는지 테스트
  - ex) “//;\n1;2;3”과 같이 값을 입력할 경우 <br/> 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6 반환

<br />

<hr />

### 예외 처리
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 <br/> RuntimeException 예외를 throw한다.

<br />

<hr />

### 새롭게 알게된 내용
- [X] @NullAndEmptySource
- [X] @MethodSource
- [X] static 메소드만 이뤄진 클래스라면 <br/> private으로 기본생성자를 제한하는게 좋은데요!
  왜그럴까요? 🤔
  -  static 메소드로만 이루어진 StringAddCalculator 클래스의 경우, <br/> 
     연산 방법이 정해져있기 때문에, 새롭게 오버라이딩이 될 필요가 없습니다. 
  - 그래서, 기본생성자를 private 로 제한해서 <br/> 
    생성자를 호출해 인스턴스화가 일어날 수 있는 경우를 막는 것이 좋습니다. 
  - 또한, <br/> static 멤버는 생성되는 모든 인스턴스에 대해서 값을 공유하므로 <br/>
    다형성에 문제가 생기기 때문에 <br/> 
    인스턴스로 만들어 쓰기 위해 설계한 게 아닌 것을 <br/> 
    private 생성자를 만들어서 의도를 알려주는 것이 좋은 방법 같습니다!

- [X] AssertionError
    - 자바 프로그램이 예상하는 결과가 나타나지 않을 때 발생