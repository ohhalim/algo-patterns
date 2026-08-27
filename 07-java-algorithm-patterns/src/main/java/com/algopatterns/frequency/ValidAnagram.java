package com.algopatterns.frequency;

/**
 * Valid Anagram (LeetCode 242)
 *
 * 두 문자열 s, t가 서로의 애너그램(문자를 재배열해 만들 수 있는)인지 판별하세요.
 *
 * 제약:
 * - 1 <= s.length, t.length <= 5 * 10^4
 * - s, t는 영어 소문자로만 구성
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        // 여기에 구현하세요.
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // 기대 true
        System.out.println(isAnagram("rat", "car"));         // 기대 false
        System.out.println(isAnagram("listen", "silent"));   // 기대 true
    }
}
