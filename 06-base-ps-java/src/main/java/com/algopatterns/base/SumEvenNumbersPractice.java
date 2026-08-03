package com.algopatterns.base;

import java.util.List;

public class SumEvenNumbersPractice {

    /*
     * 목표: 정수 목록에서 짝수만 골라 합계를 반환하는 메서드 작성
     * 입력: [-2, 5, 0, 3, 4]
     * 결과: 2
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - List<Integer> 매개변수
     * - 향상된 for문
     * - if문
     * - total += number
     *
     * 힌트:
     * - 어떤 수를 2로 나눈 나머지가 0이면 짝수다.
     * - 짝수인지 확인하는 조건은 number % 2 == 0
     */
    public int sumEvenNumbers(List<Integer> numbers) {
        // 1. 합계를 저장할 total의 시작값을 정한다.
        // 2. numbers에서 숫자를 하나씩 꺼낸다.
        // 3. 현재 숫자가 짝수이면 total에 더한다.
        // 4. 반복이 끝난 뒤 total을 반환한다.

        int totalSum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                totalSum += number;
            }
        }
        return totalSum; // 네가 직접 작성할 부분
    }

    public static void main(String[] args) {
        // List.of(-2, 5, 0, 3, 4)로 목록을 만든다.
        // 객체를 만들고 메서드를 호출한 뒤 결과를 출력한다.

        SumEvenNumbersPractice practice = new SumEvenNumbersPractice();
        System.out.println(practice.sumEvenNumbers(List.of(-2, 5, 0, -7, 4)));
    }
}
