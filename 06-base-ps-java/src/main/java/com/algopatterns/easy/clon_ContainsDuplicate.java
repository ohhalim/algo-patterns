package com.algopatterns.easy;

import java.util.HashSet;
import java.util.Set;

public class clon_ContainsDuplicate {
    // 정수 배열을 입력받아 중복여부를 참/거짓으로 반환하는 메서드
    public static boolean containsDuplicate(int[] nums) {
    // 중복을 검사할 hashset을 생성 () 참조형 intager객체 타입만 혀용합니다
        Set<Integer> seen = new HashSet<>();
        // 배열의 모든 요소를 순회하는 향상된 for 루프 입니다
        for (int num : nums){
            // 현재 숫자가 이미 Set에 존재하는지 확인합니다
            if (seen.contains(num)){
                // 이미 존재한다면 중복된 값이므로 ture를 반환합니다
                return true;
            }
            // 존재하지 않는다면 현재 숫자를Set에 추가합니다
            seen.add(num);
        }
        // 반복문을 다 돌았는데도 중복이 없다면 false를 반환합니다
        return false;
    }
    
}

                                                                                
                                                                            