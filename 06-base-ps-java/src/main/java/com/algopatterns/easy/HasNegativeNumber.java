package com.algopatterns.easy;

public class HasNegativeNumber {

    public static boolean hasNegativeNumber(int[] nums) {
        // nums에서 숫자를 하나씩 꺼내 number에 저장하며 반복하세요.

        // number가 0보다 작으면 true를 즉시 반환하세요.

        // 끝까지 음수를 찾지 못하면 false를 반환하세요.
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasNegativeNumber(new int[]{1, 2, -3, 4})); // 예상 결과: true
        System.out.println(hasNegativeNumber(new int[]{1, 2, 3, 4}));  // 예상 결과: false
        System.out.println(hasNegativeNumber(new int[]{}));             // 예상 결과: false
        System.out.println(hasNegativeNumber(new int[]{-1}));           // 예상 결과: true
    }
}
