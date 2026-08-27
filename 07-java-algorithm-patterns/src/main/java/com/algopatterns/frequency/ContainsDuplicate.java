package com.algopatterns.frequency;

/**
 * Contains Duplicate (LeetCode 217)
 *
 * 정수 배열 nums에 중복된 값이 하나라도 있으면 true,
 * 모든 값이 서로 다르면 false를 반환하세요.
 *
 * 제약:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        // 여기에 구현하세요.
        
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));                       // 기대 true
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));                       // 기대 false
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));     // 기대 true
    }
}
