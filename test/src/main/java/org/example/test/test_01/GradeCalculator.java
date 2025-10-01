package org.example.test.test_01;

import java.util.*;

/*
### 문제 1: 학생 성적 평균 계산기

**설명:**
여러 학생의 과목별 성적을 `Map`에 저장하고, 각 학생의 평균 점수를 계산하여 출력하는 프로그램을 작성하세요. `List`를 사용하여 여러 학생의 정보를 관리합니다.

**요구사항 명세서:**

1.  학생의 정보는 `Map<String, Object>` 형태로 관리하며, 이름(`name`)과 성적(`scores`)을 키로 가집니다.
2.  성적(`scores`)은 다시 `Map<String, Integer>` 형태로, 과목명을 키로, 점수를 값으로 가집니다.
3.  `calculateAverage` 메서드는 학생의 성적 `Map`을 인자로 받아, 모든 과목의 평균 점수를 계산하여 반환합니다.
4.  `main` 메서드에서는 여러 학생의 정보를 `List`에 담고, 반복문을 사용하여 각 학생의 이름과 평균 점수를 "실행 예"와 같이 출력해야 합니다.

**실행 예:**

학생: 홍길동, 평균 점수: 90.0
학생: 김철수, 평균 점수: 81.0

 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeCalculator {

    public static double calculateAverage(Map<String, Integer> scores) {
        double sum = 0;
        // 단, 과목이 없을 경우 0점을 반환해야 합니다.
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }
        // TODO: scores 맵의 모든 점수를 합산하여 합계를 구하는 코드를 작성하시오.
        for (int score : scores.values()) {
            sum += score;
        }
        // TODO: 합산된 점수를 과목 수로 나누어 평균을 계산하고 반환하는 코드를 작성하시오.
        return sum / scores.size();
    }

    public static void main(String[] args) {
        List<Map<String, Object>> students = new ArrayList<>();

        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "홍길동");
        Map<String, Integer> scores1 = new HashMap<>();
        scores1.put("국어", 85);
        scores1.put("영어", 90);
        scores1.put("수학", 95);
        student1.put("scores", scores1);
        students.add(student1);

        Map<String, Object> student2 = new HashMap<>();
        student2.put("name", "김철수");
        Map<String, Integer> scores2 = new HashMap<>();
        scores2.put("국어", 75);
        scores2.put("영어", 80);
        scores2.put("과학", 88);
        student2.put("scores", scores2);
        students.add(student2);

        // TODO: students 리스트를 순회하며 각 학생의 이름과 평균 점수를 출력하시오.
        // calculateAverage 메서드를 반드시 사용해야 합니다.
        for (Map<String, Object> student : students) {
            String name = (String) student.get("name");
            Map<String, Integer> scores = (Map<String, Integer>) student.get("scores");
            double avg = calculateAverage(scores);
            System.out.println("학생: " + name + ", 평균 점수: " + avg);
        }
    }
}