package com.algopatterns.base;

import java.util.List;

public class CountPositiveNumbersPractice {

    /*
     * 목표: 정수 목록에서 양수의 개수를 반환하는 메서드 작성
     * 입력: [-2, 5, 0, 3, -1]
     * 결과: 2
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - List<Integer> 매개변수
     * - 향상된 for문
     * - if문
     * - count++
     *
     * 힌트:
     * - 양수인지 확인하는 조건은 number > 0
     */
    public int countPositiveNumbers(List<Integer> numbers) {
        // 1. 양수의 개수를 저장할 count의 시작값을 정한다.
        // 2. numbers에서 숫자를 하나씩 꺼낸다.
        // 3. 현재 숫자가 0보다 크면 count를 1 증가시킨다.
        // 4. 반복이 끝난 뒤 count를 반환한다.
        int  count = 0;
        for (Integer number : numbers) {
            if (number > 0) {
                count++;
            }
        }

        return count; // 네가 직접 작성할 부분
    }

    public static void main(String[] args) {
        // List.of(-2, 5, 0, 3, -1)로 목록을 만든다.
        // 객체를 만들고 메서드를 호출한 뒤 결과를 출력한다.
        CountPositiveNumbersPractice practice = new CountPositiveNumbersPractice();
        System.out.println(practice.countPositiveNumbers(List.of(-2)));
    }
}
