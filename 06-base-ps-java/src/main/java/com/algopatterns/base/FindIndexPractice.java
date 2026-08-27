package com.algopatterns.base;

public class FindIndexPractice {

    /*
     * 목표: int 배열에서 target 값이 처음 등장하는 위치(인덱스)를 반환하는 메서드 작성
     *       target이 배열에 없다면 -1을 반환한다.
     * 입력: numbers = [3, 8, 2, 5], target = 2
     * 결과: 2
     * 입력: numbers = [3, 8, 2, 5], target = 9
     * 결과: -1
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - int[] numbers, int target 매개변수
     * - 인덱스 기반 for문 (for int i = 0; i < numbers.length; i++)
     * - if문
     * - return 키워드 (찾으면 즉시 반환)
     *
     * 새 문법:
     * - numbers.length 는 배열의 길이(칸 수)
     * - numbers[i] 는 i번째 위치에 있는 값
     * - i는 0부터 시작하고 length보다 작을 때까지 반복
     * - 배열에 없으면 -1을 반환하는 것이 관례(규약)
     */
    public int findIndex(int[] numbers, int target) {
        // 1. i를 0부터 numbers.length보다 작을 때까지 1씩 증가시키며 반복한다.
        // 2. numbers[i]가 target과 같으면 i를 즉시 반환한다.
        // 3. 반복이 끝날 때까지 못 찾았다면 -1을 반환한다.
        for (int i = 0; i < numbers.length; i++) {
            
        }

        return 0; // 네가 직접 작성할 부분 (이 줄을 지우고 코드를 작성하세요)
    }

    public static void main(String[] args) {
        int[] numbers = {3, 8, 2, 5};

        FindIndexPractice practice = new FindIndexPractice();
        System.out.println("2의 위치: " + practice.findIndex(numbers, 2)); // 기대값 2
        System.out.println("9의 위치: " + practice.findIndex(numbers, 9)); // 기대값 -1
    }
}
