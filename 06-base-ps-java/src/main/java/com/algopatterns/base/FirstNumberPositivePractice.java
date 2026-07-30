package com.algopatterns.base;

import java.util.List;

public class FirstNumberPositivePractice {

    /*
     * 목표: 정수 목록의 첫 번째 숫자가 양수인지 확인한다.
     * 입력: [-3, 8, 2, 5]
     * 결과: false
     *
     * 사용할 것:
     * - List<Integer> 매개변수
     * - numbers.get(0)
     * - if문
     * - boolean 반환값
     */
    public boolean isFirstNumberPositive(List<Integer> numbers) {
        // 1. numbers의 첫 번째 값을 firstNumber 변수에 저장한다.
        // 2. firstNumber가 0보다 크면 true를 반환한다.
        // 3. 그렇지 않으면 false를 반환한다.
        
        return numbers.get(0) > 0;

//        if (numbers.get(0) > 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    }
    
    public static void main(String[] args) {
        // List.of(...)를 사용해 -3, 8, 2, 5가 들어 있는 목록을 만든다.

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        // FirstNumberPositivePractice 객체를 만든다.
        FirstNumberPositivePractice practice = new FirstNumberPositivePractice();
        // isFirstNumberPositive 메서드를 호출하고 결과를 출력한다.
        System.out.println(practice.isFirstNumberPositive(numbers));
    }
}
