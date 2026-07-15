package com.algopatterns.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] case1 = {1, 2, 3, 1};
        int[] case2 = {1, 2, 3, 4};
        int[] case3 = {};

        System.out.println(containsDuplicate(case1)); // true
        System.out.println(containsDuplicate(case2)); // false
        System.out.println(containsDuplicate(case3)); // false
    }
}

    