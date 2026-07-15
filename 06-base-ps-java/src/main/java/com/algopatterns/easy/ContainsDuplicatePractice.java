package com.algopatterns.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicatePractice {

    public static boolean containsDuplicate(int[] nums) {
        // 1. 이미 확인한 숫자를 저장할 빈 HashSet을 만드세요.
//        Set<Integer>    seen    =    new HashSet<>()    ;
//        변수 타입       이름         새 객체 생성       문장 끝
//        네가 작성한 코드는:
//        seen = HashSet<>
//                다음 부분들이 빠져 있어.
//                Set<Integer>  // seen의 타입
//        new           // 새로운 객체 생성
//        ()            // HashSet 생성 기능 실행
//        ;             // Java 문장 종료
        Set<Integer> seen = new HashSet<>();
        // 2. nums의 숫자를 하나씩 확인하세요.
            for (int num : nums) {
        // 3. 현재 숫자가 Set에 이미 있으면 true를 즉시 반환하세요.
                    // seen의 contains 기능을 실행해 num이 들어 있는지 확인한다.
                if (seen.contains(num)) {
                    return true;
                }
        // 4. 처음 확인한 숫자라면 Set에 추가하세요.
                seen.add(num);
            }

        // 5. 반복문이 끝날 때까지 중복이 없으면 false를 반환하세요.
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1})); // 예상 결과: true
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4})); // 예상 결과: false
        System.out.println(containsDuplicate(new int[]{}));            // 예상 결과: false
        System.out.println(containsDuplicate(new int[]{5, 5}));        // 예상 결과: true
    }
}
