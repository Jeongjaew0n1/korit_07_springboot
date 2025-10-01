package org.example.test.test_12;
/*
### 문제 12: 회의 참석자 명단 관리 (`HashSet`)

**설명:**
`HashSet`을 사용하여 회의에 참석한 사람의 명단을 관리하는 프로그램을 작성하세요. `HashSet`은 중복된 이름을 자동으로 걸러줍니다.

**요구사항 명세서:**

1.  `String` 타입의 이름을 저장하는 `HashSet`인 `attendees`를 생성합니다.
2.  "김철수", "이영희", "박지성", "김철수" 순서로 `attendees`에 이름을 추가합니다. ("김철수"는 두 번 추가)
3.  "박지성"이 참석자 명단에 있는지 확인하고 결과를 `boolean` 값으로 출력합니다.
4.  최종 참석자 수를 `size()` 메서드를 이용해 "실행 예"와 같이 출력합니다.

**실행 예:**
박지성 참석 여부: true
최종 참석자 수: 3
전체 명단: [박지성, 김철수, 이영희]
 */
import java.util.HashSet;
import java.util.Set;

public class MeetingAttendees {
    public static void main(String[] args) {
        Set<String> attendees = new HashSet<>();

        // TODO: "김철수", "이영희", "박지성", "김철수"를 attendees에 추가하시오.
        attendees.add("김철수");
        attendees.add("이영희");
        attendees.add("박지성");
        attendees.add("김철수");
        // TODO: "박지성"이 명단에 있는지 확인하고, "박지성 참석 여부: [true/false]" 형식으로 출력하시오.
        boolean attendPark = attendees.contains("박지성");
        System.out.println("박지성 참석 여부: " + attendPark);
        // TODO: 최종 참석자 수를 "최종 참석자 수: [숫자]" 형식으로 출력하시오.
        System.out.println("최종 참석자 수: " + attendees.size());
        System.out.println("전체 명단: " + attendees);
    }
}