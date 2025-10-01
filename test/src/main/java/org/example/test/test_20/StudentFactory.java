package org.example.test.test_20;
/*
### 문제 20: 학생 정보 객체 생성 (생성자 오버로딩)

**설명:**
다양한 방법으로 학생(`Student`) 객체를 생성할 수 있도록 **생성자 오버로딩**을 구현하세요.

**요구사항 명세서:**
1.  `Student` 클래스는 `studentId` (학번, `int`)와 `name` (이름, `String`) 필드를 가집니다.
2.  세 가지 종류의 생성자를 정의합니다.
      * 기본 생성자: `studentId`는 -1, `name`은 "미정"으로 초기화합니다.
      * 학번만 받는 생성자: `name`은 "미정"으로 초기화합니다.
      * 학번과 이름을 모두 받는 생성자
3.  `main` 메서드에서 세 가지 생성자를 각각 사용하여 객체를 생성하고, 각 객체의 정보를 "실행 예"와 같이 출력하세요.

**실행 예:**
학번: -1, 이름: 미정
학번: 2025001, 이름: 미정
학번: 2025002, 이름: 홍길동
 */

class Student {
    int studentId;
    String name;

    // TODO: 기본 생성자를 작성하시오. (studentId: -1, name: "미정")
    public Student() {
        studentId = -1;
        name = "미정";
    }

    // TODO: 학번(studentId)만 받는 생성자를 작성하시오. (name: "미정")

    public Student(int studentId) {
        this.studentId = studentId;
        this.name = "미정";
    }

    // TODO: 학번(studentId)과 이름(name)을 모두 받는 생성자를 작성하시오.
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("학번: " + studentId + ", 이름: " + name);
    }
}

public class StudentFactory {
    public static void main(String[] args) {
        // TODO: 세 가지 생성자를 각각 사용하여 Student 객체를 생성하고 printInfo()를 호출하시오.
        Student student1 = new Student();
        Student student2 = new Student(2025001);
        Student student3 = new Student(2025002, "홍길동");
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }
}
