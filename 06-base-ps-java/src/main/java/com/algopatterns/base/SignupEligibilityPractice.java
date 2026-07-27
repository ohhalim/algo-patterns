package com.algopatterns.base;

public class SignupEligibilityPractice {

    /*
     * 목표: 나이를 입력받아 회원 가입 가능 여부를 반환하는 메서드 작성
     * 19세 이상: "가입 가능"
     * 19세 미만: "가입 불가"
     */

    // public: 다른 클래스에서도 호출할 수 있다.
    // String: 이 메서드는 실행 결과로 문자열을 돌려준다.
    // getSignupMessage: 메서드 이름이다.
    // int age: 호출할 때 정수 하나를 받고, 그 값을 age라는 이름으로 사용한다.
    public String getSignupMessage(int age) {
        // age가 18보다 크거나 같은지 확인한다.
        // 조건의 결과는 true 또는 false다.
        if (age >= 18) {
            // 조건이 true이면 "가입가능"을 호출한 곳으로 돌려주고 메서드를 끝낸다.
            return "가입가능";
        } else {
            // 조건이 false이면 "가입불가"를 호출한 곳으로 돌려주고 메서드를 끝낸다.
            return "가입불가";
        }
    }

    // static: 객체를 만들기 전에도 JVM이 이 메서드를 호출할 수 있다.
    // void: main 메서드는 실행 결과를 반환하지 않는다.
    // String[] args: 프로그램을 실행할 때 전달받는 문자열들을 저장한다.
    public static void main(String[] args) {
        // new SignupEligibilityPractice(): 새로운 객체를 만든다.
        // SignupEligibilityPractice practice: 만든 객체를 practice 변수에 저장한다.
        SignupEligibilityPractice practice = new SignupEligibilityPractice();

        // practice.getSignupMessage(12): 위에서 만든 객체의 메서드에 12를 전달해 호출한다.
        // String message: 메서드가 돌려준 문자열을 message 변수에 저장한다.
        String message = practice.getSignupMessage(12);

        // message에 저장된 문자열을 화면에 출력한다.
        System.out.println(message);
    }
}
