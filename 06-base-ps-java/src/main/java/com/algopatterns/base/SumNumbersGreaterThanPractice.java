package com.algopatterns.base;

import java.util.List;

public class SumNumbersGreaterThanPractice {

    /*
     * 목표: 정수 목록에서 기준값보다 큰 숫자의 합계를 반환하는 메서드 작성
     * 숫자 목록: [3, 8, 2, 10, 5]
     * 기준값: 5
     * 결과: 18
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - List<Integer> numbers 매개변수
     * - int threshold 매개변수
     * - 향상된 for문
     * - if문
     * - total += number
     *
     * 힌트:
     * - 5보다 큰 숫자는 8과 10이다.
     */
    public int sumNumbersGreaterThan(List<Integer> numbers, int threshold) {
        // 1. 합계를 저장할 total의 시작값을 정한다.
        // 2. numbers에서 숫자를 하나씩 꺼낸다.
        // 3. 현재 숫자가 threshold보다 크면 total에 더한다.
        // 4. 반복이 끝난 뒤 total을 반환한다.

        int total = 0;
        for (Integer number : numbers) {
            if (number > threshold) {
                total += number;
            }
        }
        return total; // 네가 직접 작성할 부분
    }

    public static void main(String[] args) {
        SumNumbersGreaterThanPractice practice = new SumNumbersGreaterThanPractice();

        // 숫자 목록과 기준값 5를 전달하고 결과를 출력한다.
        System.out.println(practice.sumNumbersGreaterThan(List.of(3, 8, 2, 10, 5), 5));
    }
}
