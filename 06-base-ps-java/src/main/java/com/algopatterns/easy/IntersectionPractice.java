package com.algopatterns.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionPractice {

    public static int[] intersection(int[] nums1, int[] nums2) {
        // 1. nums1의 숫자를 저장할 Set을 만드세요.
        Set<Integer> firstNumbers = new HashSet<>();

        for (int number : nums1) {
            firstNumbers.add(number);
        }
        // 2. 공통 숫자를 중복 없이 저장할 결과 Set을 만드세요.
        // 공통 숫자를 저장할 빈 hashSet을 만들어 commonNumbers에 저장한다
        Set<Integer> commonNumbers = new HashSet<>();
        // 3. nums2의 숫자를 하나씩 확인하세요.
        for (int number : nums2) {

        // 4. 현재 숫자가 nums1의 Set에 있으면 결과 Set에 추가하세요.
            if (firstNumbers.contains(number)) {
                commonNumbers.add(number);
            }
        }

        // 5. 결과 Set 크기의 int[]을 만드세요.
        int[] result = new int[commonNumbers.size()]; // size() 값의 개수

        // 6. 결과 Set의 숫자를 int[]로 옮기세요.
        int index = 0;
        for (int number : commonNumbers) {
            result[index] = number;
            index++;
        }

        // 7. 완성된 int[]을 반환하세요.
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})
        )); // 예상 결과: [2]

        System.out.println(Arrays.toString(
                intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})
        )); // 예상 결과: [4, 9], 순서 무관

        System.out.println(Arrays.toString(
                intersection(new int[]{}, new int[]{1, 2})
        )); // 예상 결과: []

        System.out.println(Arrays.toString(
                intersection(new int[]{1, 2}, new int[]{3, 4})
        )); // 예상 결과: []
    }
}
