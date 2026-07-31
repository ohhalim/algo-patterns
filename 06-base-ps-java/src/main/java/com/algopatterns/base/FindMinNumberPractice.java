package com.algopatterns.base;

import java.util.ArrayList;
import java.util.List;

public class FindMinNumberPractice {

    /*
     * 목표: 정수 목록에서 가장 작은 숫자를 반환하는 메서드 작성
     * 입력: [3, -8, 2, 5]
     * 결과: -8
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - List<Integer> 매개변수
     * - numbers.get(0)
     * - 향상된 for문
     * - if문
     */
    public int findMinNumber(List<Integer> numbers) {
        // 1. numbers.get(0)을 min의 시작값으로 저장한다.
        // 2. 숫자를 하나씩 꺼낸다.
        // 3. 현재 숫자가 min보다 작으면 min을 현재 숫자로 바꾼다.
        // 4. 반복이 끝나면 min을 반환한다.
        int min = numbers.get(0);

        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min; // 네가 수정할 임시 반환값
    }

    public static void main(String[] args) {
        // List.of(3, -8, 2, 5)로 목록을 만든다.
        // 객체를 만들고 메서드를 호출한 뒤 결과를 출력한다.
            List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        FindMinNumberPractice practice = new FindMinNumberPractice();
        System.out.println(practice.findMinNumber(numbers));
    }
}
