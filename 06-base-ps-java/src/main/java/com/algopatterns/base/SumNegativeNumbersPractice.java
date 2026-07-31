package com.algopatterns.base;

import java.util.List;

public class SumNegativeNumbersPractice {

    /*
     * 목표: 정수 목록에서 음수만 골라 합계를 반환하는 메서드 작성
     * 입력: [-2, 5, 0, -7, 4]
     * 결과: -9
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - List<Integer> 매개변수
     * - 향상된 for문
     * - if문
     * - total += number
     */
    public int sumNegativeNumbers(List<Integer> numbers) {
        // 1. 합계를 저장할 total의 시작값을 정한다.
        // 2. numbers에서 숫자를 하나씩 꺼낸다.
        // 3. 현재 숫자가 0보다 작으면 total에 더한다.
        // 4. 반복이 끝난 뒤 total을 반환한다.
        int total = 0;

        for (Integer number : numbers) {
            if (number < 0) {
                total += number;
            }
        }
        return total; // 네가 수정할 임시 반환값
    }

    public static void main(String[] args) {
        // List.of(-2, 5, 0, -7, 4)로 목록을 만든다.
        // 객체를 만들고 메서드를 호출한 뒤 결과를 출력한다.
        SumNegativeNumbersPractice practice = new SumNegativeNumbersPractice();
        System.out.println(practice.sumNegativeNumbers(List.of(-2, 5, 0, -7, 4)));
    }
}
