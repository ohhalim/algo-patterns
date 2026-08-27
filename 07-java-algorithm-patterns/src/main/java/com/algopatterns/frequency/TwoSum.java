package com.algopatterns.frequency;

import java.util.Arrays;

/**
 * Two Sum (LeetCode 1)
 *
 * 정수 배열 nums와 정수 target이 주어집니다.
 * 두 숫자의 합이 target이 되는 인덱스 두 개를 배열로 반환하세요.
 * 각 입력에는 정확히 하나의 해답만 존재하며, 같은 원소를 두 번 사용할 수 없습니다.
 *
 * 제약:
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - 정답은 정확히 하나 존재
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // 여기에 구현하세요.
        return null;
    }

    public static void main(String[] args) {
        int[] case1 = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(case1)); // 기대 [0, 1]

        int[] case2 = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(case2)); // 기대 [1, 2]

        int[] case3 = twoSum(new int[]{3, 3}, 6);
        System.out.println(Arrays.toString(case3)); // 기대 [0, 1]
    }
}
