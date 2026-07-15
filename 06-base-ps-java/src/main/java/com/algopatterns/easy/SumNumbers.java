package com.algopatterns.easy;

public class SumNumbers {

    public static int sumNumbers(int[] nums) {
        // 1. 합계를 저장할 변수 total을 0으로 초기화하세요.
        int total = 0;
        // 2. nums의 숫자를 하나씩 꺼내 total에 더하세요.
        for (int i : nums) {
            total += i;
        }
        // 3. 최종 합계를 반환하세요.
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(new int[]{1, 2, 3, 4})); // 예상 결과: 10
        System.out.println(sumNumbers(new int[]{}));            // 예상 결과: 0
        System.out.println(sumNumbers(new int[]{-2, 5, 1}));    // 예상 결과: 4
    }
}
