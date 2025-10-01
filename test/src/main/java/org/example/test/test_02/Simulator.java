package org.example.test.test_02;
/*
### 문제 2: 간단한 음료 자판기 시뮬레이터

**설명:**
간단한 음료 자판기 프로그램을 `switch` 문을 사용하여 구현합니다. 사용자가 번호를 선택하면 해당 음료의 이름과 가격을 출력하고, 잘못된 번호를 입력하면 오류 메시지를 출력합니다.

**요구사항 명세서:**
1.  `VendingMachine` 클래스에 `selectDrink` 메서드를 구현합니다. 이 메서드는 `int` 타입의 `choice`를 인자로 받습니다.
2.  `selectDrink` 메서드 내에서 `switch` 문을 사용하여 `choice` 값에 따라 다른 음료 정보를 출력합니다.
      * 1번: "콜라 - 1,000원"
      * 2번: "사이다 - 1,200원"
      * 3번: "물 - 800원"
3.  `case`에 해당하지 않는 번호가 입력되면 `default` 문을 사용하여 "잘못된 번호입니다."를 출력합니다.
4.  `main` 메서드에서 `Scanner`를 사용하여 사용자로부터 음료 번호를 입력받고, `selectDrink` 메서드를 호출하여 결과를 출력합니다. 프로그램은 한 번의 선택 후 종료됩니다.



**실행 예 1 (올바른 입력):**
--- 자판기 ---
1. 콜라 | 2. 사이다 | 3. 물
음료 번호를 선택하세요: 2
사이다 - 1,200원

**실행 예 2 (잘못된 입력):**
--- 자판기 ---
1. 콜라 | 2. 사이다 | 3. 물
음료 번호를 선택하세요: 5
잘못된 번호입니다.
 */
import java.util.Scanner;

class VendingMachine {
    public void selectDrink(int choice) {
        switch (choice) {
            case 1:
                System.out.println("콜라 - 1,000원");
                break;
            case 2:
                System.out.println("사이다 - 1,200원");
                break;
            case 3:
                System.out.println("물 - 800원");
                break;
            default:
                System.out.println("잘못된 번호입니다.");
        }
    }
}

public class Simulator {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- 자판기 ---");
        System.out.println("1. 콜라 | 2. 사이다 | 3. 물");
        System.out.print("음료 번호를 선택하세요: ");

        int choice = scanner.nextInt();
        machine.selectDrink(choice);

        scanner.close();
    }
}