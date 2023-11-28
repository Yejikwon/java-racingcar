## 요구사항
1. 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 구분자를 기준으로 분리한 각 숫자의 합을 반환
   (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
2. 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정 가능 
3. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
   (예:  “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6 반환)
4. 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.

## TO-DO
1. 빈문자열 또는 null 값 인 경우 0을 반환 ("" => 0, null => 0) [O]
2. 숫자 하나를 문자열로 입력할 경우 해당 숫자로 반환 ("1" => 1) [O]
3. 숫자 2개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환 ("1,2" => 3) [O]
4. 구분자로 콜론(:) 사용 (1,2:3 => 6) [O]
5. "//"와 "\n" 문자 사이에 커스텀 구분자를 지정 ("//;\n1;2;3" => 6) [O]
6. 음수를 전달할 경우 RuntimeException 예외 ("-1,2,3" => RuntimeException) [O]