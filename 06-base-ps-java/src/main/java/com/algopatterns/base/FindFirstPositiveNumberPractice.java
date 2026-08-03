package com.algopatterns.base;

import java.util.List;

public class FindFirstPositiveNumberPractice {

    /*
     * 목표: 정수 목록에서 가장 먼저 나오는 양수를 반환하는 메서드 작성
     * 입력: [-3, 0, -2, 7, 4]
     * 결과: 7
     *
     * 양수가 하나도 없으면 0을 반환한다.
     * 입력: [-3, 0, -2]
     * 결과: 0
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - List<Integer> 매개변수
     * - 향상된 for문
     * - if문
     * - return number
     *
     * 힌트:
     * - 현재 숫자가 0보다 크면 그 숫자를 바로 반환한다.
     * - 반복이 끝날 때까지 양수를 찾지 못하면 0을 반환한다.
     */
    public int findFirstPositiveNumber(List<Integer> numbers) {
        // 1. numbers에서 숫자를 앞에서부터 하나씩 꺼낸다.
        // 2. 현재 숫자가 양수인지 확인한다.
        // 3. 양수이면 현재 숫자를 반환한다.
        // 4. 반복이 끝나면 0을 반환한다.

        for (Integer number : numbers) {
            if (number > 0) {
                return number;
            }
        }
        return 0; // 네가 직접 작성할 부분
    }

    public static void main(String[] args) {
        // List.of(-3, 0, -2, 7, 4)로 목록을 만든다.
        // 객체를 만들고 메서드를 호출한 뒤 결과를 출력한다.
       FindFirstPositiveNumberPractice practice = new FindFirstPositiveNumberPractice();
        System.out.println(practice.findFirstPositiveNumber(List.of(-2, 5, 0, -7, 4)));
    }
}
