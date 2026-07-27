package com.algopatterns.easy;

public class CountEvenNumbers {

    public static int countEvenNumbers(int[] nums) {
        // 짝수 개수를 저장할 count를 0으로 초기화하세요.

        // nums에서 숫자를 하나씩 꺼내 number에 저장하며 반복하세요.

        // number를 2로 나눈 나머지가 0이면 count를 1 증가시키세요.

        // 최종 count를 반환하세요.
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(countEvenNumbers(new int[]{1, 2, 3, 4, 6})); // 예상 결과: 3
        System.out.println(countEvenNumbers(new int[]{1, 3, 5}));       // 예상 결과: 0
        System.out.println(countEvenNumbers(new int[]{}));              // 예상 결과: 0
        System.out.println(countEvenNumbers(new int[]{2, 2, 2}));       // 예상 결과: 3
    }
}
