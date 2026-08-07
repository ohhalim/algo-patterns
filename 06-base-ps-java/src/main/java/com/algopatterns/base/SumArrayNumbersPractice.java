package com.algopatterns.base;

public class SumArrayNumbersPractice {

    /*
     * 목표: int 배열에 들어 있는 모든 숫자의 합계를 반환하는 메서드 작성
     * 입력: [3, 8, 2, 5]
     * 결과: 18
     *
     * 새로 배울 것:
     * - List<Integer> 대신 int[] 배열 사용
     * - 배열을 만드는 문법: int[] numbers = {3, 8, 2, 5};
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - int[] numbers 매개변수
     * - 향상된 for문
     * - total += number
     */
    public int sumArrayNumbers(int[] numbers) {
        // 1. 합계를 저장할 total의 시작값을 정한다.
        // 2. numbers 배열에서 숫자를 하나씩 꺼낸다.
        // 3. 현재 숫자를 total에 더한다.
        // 4. 반복이 끝난 뒤 total을 반환한다.
        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        return total; // 네가 직접 작성할 부분
    }

    public static void main(String[] args) {
        // int 값 네 개가 들어 있는 배열을 만든다.
        int[] numbers = {3, 8, 2, 5};

        SumArrayNumbersPractice practice = new SumArrayNumbersPractice();
        System.out.println(practice.sumArrayNumbers(numbers));
    }
}
