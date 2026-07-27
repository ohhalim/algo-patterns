package com.algopatterns.base;

import java.util.List;

public class MethodPractice {

    // 매개변수 없이 호출하면 int 값 31을 돌려주는 메서드
    public int getAge() {
        return 17;
    }

    // name을 입력받아 새로운 문자열을 돌려주는 메서드
    public String greet(String name) {
        return "안녕하세요 " + name;
    }

    // number를 입력받아 2를 곱한 결과를 돌려주는 메서드
    public int doubleNumber(int number) {
        return number * 2;
    }

    // age가 19 이상인지 판단한 결과를 boolean으로 돌려주는 메서드
    public boolean isAdult(int age) {
        return age >= 19;
    }

    // main()이 아니어도 메서드 안에는 실행문을 작성할 수 있다.
    public void printName(String name) {
        System.out.println(name);
    }

    // 여러 문자열이 들어 있는 List를 돌려주는 메서드
    public List<String> getNames() {
        return List.of("하림", "민수", "지수");
    }

    // 프로그램을 실행하면 JVM이 가장 먼저 호출하는 시작 메서드
    public static void main(String[] args) {
        // MethodPractice 객체를 생성하고 practice 변수에 저장한다.
        MethodPractice practice = new MethodPractice();

        // 객체의 메서드를 호출하고 반환값을 각 지역 변수에 저장한다.
        int age = practice.getAge();
        int doubled = practice.doubleNumber(5);
        String message = practice.greet("하림");
        boolean adult = practice.isAdult(17);

        // adult가 true일 때만 중괄호 안의 실행문을 실행한다.
        if (adult) {
            System.out.println("성인입니다");
        } else {
                System.out.println("미성년자입니다");
        }


        // void 메서드는 반환값을 저장하지 않고 바로 호출한다.
        practice.printName("하림");
        List<String> names = practice.getNames();

        // names에서 문자열을 하나씩 꺼내 name에 저장하고 출력한다.
        for (String name : names) {
            System.out.println(name);
        }

        // 위에서 지역 변수에 저장한 값을 출력해 확인한다.
        System.out.println(message);
        System.out.println(doubled);
        System.out.println(age);
        System.out.println(adult);
        System.out.println(names);
    }
}
