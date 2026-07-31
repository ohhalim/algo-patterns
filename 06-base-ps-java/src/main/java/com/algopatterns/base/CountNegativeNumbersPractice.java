package com.algopatterns.base;

import java.util.ArrayList;
import java.util.List;

public class CountNegativeNumbersPractice {

    /*
     * 목표: 정수 목록에서 음수의 개수를 반환하는 메서드 작성
     * 입력: [-2, 5, 0, -7, 4]
     * 결과: 2
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - List<Integer> 매개변수
     * - 향상된 for문
     * - if문
     * - count++
     */
    public int countNegativeNumbers(List<Integer> numbers) {
        // 1. 음수의 개수를 저장할 count의 시작값을 정한다.
        // 2. numbers에서 숫자를 하나씩 꺼낸다.
        // 3. 현재 숫자가 0보다 작으면 count를 1 증가시킨다.
        // 4. 반복이 끝난 뒤 count를 반환한다.

        int count = 0;
        for (Integer number : numbers) {
            if (number < 0) {
                count++;
            }
        }   
        return count; // 네가 수정할 임시 반환값
    }

    public static void main(String[] args) {
        CountNegativeNumbersPractice pratice = new CountNegativeNumbersPractice();
        System.out.println(pratice.countNegativeNumbers(List.of(-2, 5, 0, -7, 4)));
        // List.of(-2, 5, 0, -7, 4)로 목록을 만든다.
        // 객체를 만들고 메서드를 호출한 뒤 결과를 출력한다.
    }
}
