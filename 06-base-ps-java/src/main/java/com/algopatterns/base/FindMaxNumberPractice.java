package com.algopatterns.base;

import java.util.List;

public class FindMaxNumberPractice {

    /*
     * 목표: 정수 목록에서 가장 큰 숫자를 반환하는 메서드 작성
     * 입력: [3, 8, 2, 5]
     * 결과: 8
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - List<Integer> 매개변수
     * - 향상된 for문
     * - if문
     * - 가장 큰 값을 저장하는 지역 변수
     *
     * 힌트:
     * - 목록의 첫 번째 값은 numbers.get(0)으로 꺼낼 수 있다.
     */
    public int findMaxNumber(List<Integer> numbers) {
        // 1. 가장 큰 값을 저장할 max 변수를 만든다.
        // 2. numbers에서 숫자를 하나씩 꺼낸다.
        // 3. 현재 숫자가 max보다 크면 max를 현재 숫자로 바꾼다.
        // 4. 반복이 끝나면 max를 반환한다.

        int max = 0;

        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 8, 2, 5);
        FindMaxNumberPractice practice = new FindMaxNumberPractice();
        System.out.println((practice.findMaxNumber(numbers)));

        // 5. FindMaxNumberPractice 객체를 만든다.
        // 6. findMaxNumber(numbers)를 호출하고 결과를 출력한다.
    }
}
