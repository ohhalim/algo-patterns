package com.algopatterns.base;

public class FindMinArrayPractice {

    /*
     * 목표: int 배열에서 가장 작은 값을 반환하는 메서드 작성
     * 입력: [3, 8, 2, 5]
     * 결과: 2
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - int[] numbers 매개변수
     * - numbers[0]으로 min 초기화
     * - 향상된 for문
     * - if문
     *
     * 힌트:
     * - 첫 번째 값을 min의 초기값으로 사용한다.
     * - 현재 숫자가 min보다 작으면 min을 현재 숫자로 바꾼다.
     */
    public int findMin(int[] numbers) {
        // 1. 배열의 첫 번째 값을 min에 저장한다.
        // 2. 배열에서 숫자를 하나씩 꺼낸다.
        // 3. 현재 숫자가 min보다 작으면 min을 현재 숫자로 변경한다.
        // 4. 반복이 끝난 뒤 min을 반환한다.
        int min = numbers[0];
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min; // 네가 직접 작성할 부분
    }

    public static void main(String[] args) {
        int[] numbers = {3, 8, 2, 5};

        FindMinArrayPractice practice = new FindMinArrayPractice();
        System.out.println(practice.findMin(numbers));
    }
}