package org.example.test.test_14;

/*
### 문제 14: 계산기 (메서드 오버로딩)

**설명:**
다양한 숫자 타입(정수, 실수)의 덧셈을 수행할 수 있도록 **메서드 오버로딩**을 이용하여 `add` 메서드를 구현하세요.

**요구사항 명세서:**
1.  `Calculator` 클래스 안에 이름이 `add`인 메서드를 두 개 정의합니다.
2.  첫 번째 `add` 메서드는 두 개의 `int`를 인자로 받아 합을 반환합니다.
3.  두 번째 `add` 메서드는 두 개의 `double`을 인자로 받아 합을 반환합니다.
4.  `main` 메서드에서 두 `add` 메서드를 각각 호출하여 결과를 "실행 예"와 같이 출력하세요.

**실행 예:**
정수 덧셈 결과: 15
실수 덧셈 결과: 6.0
 */

class Calculator {
    // TODO: 두 개의 int를 더하는 add 메서드를 작성하시오.
    int add (int num1, int num2){
        return num1 + num2;
    }
    // TODO: 두 개의 double을 더하는 add 메서드를 작성하시오.
    double add (double num1, double num2){
        return num1 + num2;
    }
}

public class OverloadingCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // TODO: 5와 10을 더한 결과를 "정수 덧셈 결과: [결과]" 형식으로 출력하시오.
        int intSum = calc.add(5, 10);
        System.out.println("정수 덧셈 결과: " + intSum);
        // TODO: 3.5와 2.5를 더한 결과를 "실수 덧셈 결과: [결과]" 형식으로 출력하시오.
        double doubleSum = calc.add(3.5, 2.5);
        System.out.println("실수 덧셈 결과: " + doubleSum);
    }
}