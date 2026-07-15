package com.algopatterns.easy;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // 여기에 코드를 작성하세요.
        
        return new int[0];
    }

    public static void main(String[] args) {
        // 첫 번째 테스트 케이스를 위한 배열들을 생성합니다.
        int[] case1Nums1 = {1, 2, 2, 1};
        int[] case1Nums2 = {2, 2};
        // 교집합 결과를 배열 형태로 반환받아 출력합니다.
        System.out.println(Arrays.toString(intersection(case1Nums1, case1Nums2))); // 예상 결과: [2]

        // 두 번째 테스트 케이스를 위한 배열들을 생성합니다.
        int[] case2Nums1 = {4, 9, 5};
        int[] case2Nums2 = {9, 4, 9, 8, 4};
        // 교집합 결과를 배열 형태로 반환받아 출력합니다.
        System.out.println(Arrays.toString(intersection(case2Nums1, case2Nums2))); // 예상 결과: [4, 9] (순서 무관)
    }
}
