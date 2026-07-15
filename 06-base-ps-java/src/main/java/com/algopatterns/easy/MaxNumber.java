package com.algopatterns.easy;

public class MaxNumber {

    public static int maxNumber(int[] nums) {
        // nums에는 정수가 하나 이상 들어온다고 가정합니다.

        // 1. 첫 번째 숫자를 현재 최댓값으로 저장하세요.
        int max = nums[0];
        // 2. nums의 숫자를 하나씩 확인하세요.

        // 3. 현재 숫자가 저장된 최댓값보다 크면 최댓값을 변경하세요.
       for (int i : nums) {
           if (i > max) {
               max = i;
           }
       }
        // 4. 최종 최댓값을 반환하세요.
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(new int[]{3, 1, 7, 2})); // 예상 결과: 7
        System.out.println(maxNumber(new int[]{-5, -2, -9})); // 예상 결과: -2
        System.out.println(maxNumber(new int[]{4}));           // 예상 결과: 4
    }
}
