package com.algopatterns.frequency;

import java.util.List;

/**
 * Group Anagrams (LeetCode 49)
 *
 * 문자열 배열 strs가 주어집니다. 서로 애너그램인 문자열끼리 묶어
 * List<List<String>> 형태로 반환하세요. (반환 순서는 무관)
 *
 * 제약:
 * - 1 <= strs.length <= 10^4
 * - 0 <= strs[i].length <= 100
 * - strs[i]는 영어 소문자로만 구성
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        // 여기에 구현하세요.
        return null;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        // 기대: 애너그램끼리 묶임, 예) [[eat, tea, ate], [tan, nat], [bat]] (순서 무관)

        System.out.println(groupAnagrams(new String[]{""}));   // 기대 [[]]
        System.out.println(groupAnagrams(new String[]{"a"}));  // 기대 [[a]]
    }
}
