package org.example.test.test_07;
/*
### 문제 7: 도형 넓이 계산기 (추상 클래스)

**설명:**
다양한 도형의 넓이를 계산하는 프로그램을 **추상 클래스**를 이용하여 구현합니다.
공통 기능을 부모 추상 클래스에 정의하고, 각 도형 클래스에서 이를 상속받아 구체적인 넓이 계산 로직을 구현합니다.

**요구사항 명세서:**

1.  `Shape` 추상 클래스를 만듭니다. 이 클래스는 `calculateArea()`라는 `abstract` 메서드를 가집니다.
2.  `Shape`를 상속받는 `Circle` 클래스와 `Rectangle` 클래스를 구현합니다.
3.  `Circle`은 반지름(`radius`) 필드를, `Rectangle`은 가로(`width`)와 세로(`height`) 필드를 가집니다.
4.  각 클래스에서 `calculateArea()` 메서드를 오버라이딩하여 원과 사각형의 넓이를 계산하는 로직을 구현합니다. (원주율은 3.14로 계산)
5.  `main` 메서드에서 `Circle`과 `Rectangle` 객체를 생성하고, 각 도형의 넓이를 "실행 예"와 같이 출력하세요.

**실행 예:**
원의 넓이: 314.0
사각형의 넓이: 40.0

 */
// TODO: calculateArea() 추상 메서드를 가진 Shape 추상 클래스를 작성하시오.
abstract class Shape {
    public abstract void calculateArea();
}
// TODO: Shape을 상속받고, 반지름(radius)을 필드로 가지는 Circle 클래스를 작성하시오.
// calculateArea() 메서드를 오버라이딩하여 원의 넓이를 계산하시오. (원주율 = 3.14)
class Circle extends Shape {
    int radius;

    @Override
    public void calculateArea(int radius) {
        System.out.println("원의 넓이 : " + (radius * radius * 3.14));
    }
}
// TODO: Shape을 상속받고, 가로(width)와 세로(height)를 필드로 가지는 Rectangle 클래스를 작성하시오.
// calculateArea() 메서드를 오버라이딩하여 사각형의 넓이를 계산하시오.
class Rectangle extends Shape {
    int width,height;

    @Override
    public void calculateArea() {
        System.out.println("사각형의 넓이 : " + (width * height));
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        // TODO: 반지름이 10인 원(Circle) 객체를 생성하고 넓이를 출력하시오.
        // TODO: 가로가 5, 세로가 8인 사각형(Rectangle) 객체를 생성하고 넓이를 출력하시오.
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.calculateArea();
        rectangle.calculateArea();
    }
}
