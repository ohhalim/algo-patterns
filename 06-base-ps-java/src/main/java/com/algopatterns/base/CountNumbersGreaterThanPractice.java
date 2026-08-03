package com.algopatterns.base;

import java.util.List;

public class CountNumbersGreaterThanPractice {

    /*
     * 목표: 정수 목록에서 기준 숫자보다 큰 값의 개수를 반환하는 메서드 작성
     * 숫자 목록: [3, 8, 2, 10, 5]
     * 기준 숫자: 5
     * 결과: 2
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - List<Integer> numbers 매개변수
     * - int 기준값 매개변수
     * - 향상된 for문
     * - if문
     * - count++
     *
     * 힌트:
     * - 현재 숫자가 기준값보다 큰지 확인한다.
     */
    public int countNumbersGreaterThan(List<Integer> numbers, int threshold) {
        // 1. 개수를 저장할 count의 시작값을 정한다.
        // 2. numbers에서 숫자를 하나씩 꺼낸다.
        // 3. 현재 숫자가 threshold보다 크면 count를 1 증가시킨다.
        // 4. 반복이 끝난 뒤 count를 반환한다.
        int count = 0;
        for (Integer number : numbers) {
            if (number > threshold) {
                count++;
            }
        }
        return count; // 네가 직접 작성할 부분
    }

    public static void main(String[] args) {
    CountNumbersGreaterThanPractice practice = new CountNumbersGreaterThanPractice();
        System.out.println(practice.countNumbersGreaterThan(List.of(1, 2, 3, 4, 5), 3));
    }
}
