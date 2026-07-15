package com.algopatterns.easy;

public class ContainsNumber {

    public static boolean containsNumber(int[] nums, int target) {
        // 1. nums의 숫자를 하나씩 확인하세요.
        for (int i : nums) {
            // 2. 현재 숫자가 target과 같으면 true를 즉시 반환하세요.
            if (i == target) {
                return true;
            }
        }
        // 3. 반복문이 끝날 때까지 찾지 못하면 false를 반환하세요.
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNumber(new int[]{3, 1, 7, 2}, 7)); // 예상 결과: true
        System.out.println(containsNumber(new int[]{3, 1, 7, 2}, 5)); // 예상 결과: false
        System.out.println(containsNumber(new int[]{}, 1));            // 예상 결과: false
    }
}
