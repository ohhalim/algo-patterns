package com.algopatterns.base;

import java.util.List;

public class SumPositiveNumbersPractice {

    /*
     * 목표: 정수 목록에서 양수만 골라 합계를 반환하는 메서드 작성
     * 입력: [-2, 5, 0, 3]
     * 결과: 8
     *
     * 사용할 것:
     * - int를 반환하는 메서드
     * - List<Integer> 매개변수
     * - 향상된 for문
     * - if문
     * - 합계를 저장하는 지역 변수
     */

    public int sumPositiveNumbers(List<Integer> numbers) {
        // 이건 아마도 초기화 시키는 거 변수로 설정한거일거고 맞지?
        // 답변: 맞아. int 타입의 지역 변수 total을 만들고 시작값을 0으로 초기화한 거야.
        // total은 반복하면서 양수의 합계를 계속 저장할 변수야.
        int total = 0;

        // 질문 1: 이 반복문은 numbers에서 값을 하나씩 꺼낼 때, 현재 값을 어떤 변수에 저장할까?
        // if문어로 넣었어 받는지 봐봐
        // 답변: if문을 for문 안에 넣는 방향이 맞아. 현재 꺼낸 값은 number 변수에 저장돼.
        for (Integer number : numbers) {
            // 질문 2: 지금은 음수, 0, 양수를 전부 total에 더한다. 현재 코드의 최종 total은 얼마일까?
            // 질문 3: 양수만 더하려면 이 줄을 실행하기 전에 number에 어떤 조건을 확인해야 할까?
            // 이렇게 했어  어때??
            // 답변: 정확해. number > 0이 true일 때만 total += number가 실행되므로 양수만 더해져.
            if (number > 0) {
                total += number;
            }
        }

        // 질문 4: 반복문이 모두 끝난 뒤 total을 호출한 곳으로 돌려주는 키워드는 무엇일까?
        return total;   
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-2, 5, 0, 3);

        // 이거로 하면되나? 근데                  sumPositiveNumbers 이거로 하는게 맞을까?
        // 답변: 객체를 만드는 방식은 맞지만 sumPositiveNumbers는 메서드 이름처럼 보여서 변수 이름으로는 헷갈릴 수 있어.
        // 그럼 어떤 메서드이름으로 바꾸는게 나을까?
        // 답변: 메서드 이름을 바꾸는 것이 아니야. 메서드 이름 sumPositiveNumbers는 그대로 두고, 객체 변수 이름만 practice로 바꾸자는 뜻이야.
        // 답변: 이 객체는 연습 클래스의 기능을 호출할 때 사용하므로 practice 같은 이름이 더 알아보기 쉬워.
        // 무슨 소린지 모르겟어
        // 답변: 아래 줄에서 첫 번째 SumPositiveNumbersPractice는 클래스 이름이고, 가운데 sumPositiveNumbers는 네가 정한 변수 이름이야.
        // 답변: 따라서 가운데 변수 이름만 practice로 바꿀 수 있어.
        // 답변: 아래 println은 new로 객체를 만들자마자 메서드까지 호출하므로, 이 객체 변수를 따로 만들지 않아도 실행할 수 있어.
        // 어떻게? 너가 스크립트로 어떻게 해야하는지 말해줘
        // 답변: 아래 두 실행문을 네가 직접 다음 모양으로 바꾸면 돼.
        // SumPositiveNumbersPractice practice = new SumPositiveNumbersPractice();
        // System.out.println(practice.sumPositiveNumbers(numbers));
        SumPositiveNumbersPractice practice = new SumPositiveNumbersPractice();
        // 작성한 메서드를 호출하고 결과를 출력할 위치
        System.out.println(practice.sumPositiveNumbers(numbers));
    }
}
