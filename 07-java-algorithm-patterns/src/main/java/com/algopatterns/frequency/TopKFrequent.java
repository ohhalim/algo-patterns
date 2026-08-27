package com.algopatterns.frequency;

import java.util.Arrays;

/**
 * Top K Frequent Elements (LeetCode 347)
 *
 * 정수 배열 nums와 정수 k가 주어집니다.
 * 가장 자주 등장하는 k개의 원소를 배열로 반환하세요. (순서 무관)
 * 정답은 항상 유일하게 존재합니다.
 *
 * 제약:
 * - 1 <= nums.length <= 10^5
 * - k는 서로 다른 원소의 개수 범위 내
 * - 정답은 유일
 */
public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {
        // 여기에 구현하세요.
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2))); // 기대 [1, 2]
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));                // 기대 [1]
    }
}
