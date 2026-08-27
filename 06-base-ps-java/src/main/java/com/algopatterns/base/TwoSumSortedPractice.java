package com.algopatterns.base;

import java.util.Arrays;

public class TwoSumSortedPractice {

    /*
     * 목표: 정렬된(오름차순) int 배열에서 두 수의 합이 target이 되는 인덱스를 {i, j} 배열로 반환
     *       없으면 {-1, -1}을 반환한다.
     * 입력: numbers = [2, 7, 11, 15], target = 9
     * 결과: {0, 1}  (2 + 7 = 9)
     * 입력: numbers = [2, 7, 11, 15], target = 100
     * 결과: {-1, -1}
     *
     * 사용할 것:
     * - int[]를 반환하는 메서드
     * - int[] numbers, int target 매개변수
     * - while 또는 for 반복문
     * - if문
     * - 투 포인터 변수 (left, right)
     *
     * 새 문법:
     * - 투 포인터(Two Pointers): 배열 양쪽 끝에서 시작해 조건에 따라 한쪽씩 움직이는 기법
     * - 새 배열을 만들어 반환: return new int[]{left, right};
     * - numbers.length - 1 은 마지막 인덱스
     *
     * 힌트:
     * - left는 0, right는 numbers.length - 1 에서 시작
     * - 두 수의 합이 target보다 크면 합을 줄여야 하므로 right를 왼쪽으로 한 칸
     * - 합이 target보다 작으면 합을 늘려야 하므로 left를 오른쪽으로 한 칸
     * - 합이 target과 같으면 그때의 {left, right}를 즉시 반환
     * - left가 right를 넘어설 때까지 못 찾으면 {-1, -1} 반환
     */
    public int[] twoSum(int[] numbers, int target) {
        // 1. left는 0, right는 numbers.length - 1에서 시작한다.
        // 2. left <= right 동안 반복한다.
        // 3. numbers[left] + numbers[right] 가 target보다 크면 right를 줄인다.
        // 4. 합이 target보다 작으면 left를 늘린다.
        // 5. 합이 target과 같으면 {left, right}를 즉시 반환한다.
        // 6. 반복이 끝날 때까지 못 찾으면 {-1, -1}을 반환한다.

        return new int[]{}; // 네가 직접 작성할 부분 (이 줄을 지우고 코드를 작성하세요)
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};

        TwoSumSortedPractice practice = new TwoSumSortedPractice();

        // 아래 두 호출의 주석을 해제하고 실행해서 결과를 확인해보세요.
        // System.out.println(Arrays.toString(practice.twoSum(numbers, 9)));   // 기대값 [0, 1]
        // System.out.println(Arrays.toString(practice.twoSum(numbers, 100))); // 기대값 [-1, -1]
    }
}
