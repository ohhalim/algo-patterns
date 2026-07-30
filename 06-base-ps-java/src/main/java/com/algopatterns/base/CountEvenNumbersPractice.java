package com.algopatterns.base;

import java.util.List;

public class CountEvenNumbersPractice {

    /*
     * 목표: 정수 목록에서 짝수의 개수를 반환하는 메서드 작성
     * 입력: [-2, 5, 0, 3, 4]
     * 결과: 3
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - List<Integer> 매개변수
     * - 향상된 for문
     * - if문
     * - 개수를 저장하는 지역 변수
     *
     * 새 문법:
     * - % 는 나눈 뒤 남는 나머지
     * - 어떤 수를 2로 나눈 나머지가 0이면 짝수
     */
    public int countEventNumbers(List<Integer> numbers) {
        int count = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-2, 5, 0, 3, 4);
        CountEvenNumbersPractice practice = new CountEvenNumbersPractice();
        System.out.println(practice.countEventNumbers(numbers));
        // 작성한 메서드를 호출하고 결과를 출력할 위치                                             
    }
}
