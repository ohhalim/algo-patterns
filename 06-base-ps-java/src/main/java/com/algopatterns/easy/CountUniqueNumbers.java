package com.algopatterns.easy;

import java.util.HashSet;
import java.util.Set;

public class CountUniqueNumbers {

    public static int countUniqueNumbers(int[] nums) {
        // 정수를 중복 없이 저장할 빈 HashSet을 만드세요.

        // nums에서 숫자를 하나씩 꺼내 number에 저장하며 반복하세요.

        // Set의 add 기능을 실행해 number를 추가하세요.

        // Set의 size 기능을 실행해 저장된 값의 개수를 반환하세요.
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(countUniqueNumbers(new int[]{1, 2, 2, 3, 3})); // 예상 결과: 3
        System.out.println(countUniqueNumbers(new int[]{5, 5, 5}));       // 예상 결과: 1
        System.out.println(countUniqueNumbers(new int[]{}));              // 예상 결과: 0
        System.out.println(countUniqueNumbers(new int[]{1, 2, 3, 4}));    // 예상 결과: 4
    }
}
