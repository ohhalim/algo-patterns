package com.algopatterns.easy;

public class CountNumber {

    public static int countNumber(int[] nums, int target) {
        // 1. target의 개수를 저장할 변수를 0으로 초기화하세요.
        int count = 0;
        // 2. nums의 숫자를 하나씩 확인하세요.
        for (int num : nums) {
        // 3. 현재 숫자가 target과 같으면 개수를 1 증가시키세요.
            if (num == target) {
                count++;
            }
        }

        // 4. 최종 개수를 반환하세요.
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumber(new int[]{1, 2, 2, 3, 2}, 2)); // 예상 결과: 3
        System.out.println(countNumber(new int[]{1, 2, 3}, 4));       // 예상 결과: 0
        System.out.println(countNumber(new int[]{}, 1));              // 예상 결과: 0
        System.out.println(countNumber(new int[]{5, 5, 5}, 5));       // 예상 결과: 3
    }
}
