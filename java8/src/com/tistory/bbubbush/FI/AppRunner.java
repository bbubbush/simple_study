package com.tistory.bbubbush.FI;

public class AppRunner {
    public static void main(String[] args) {
        // 익명 클래스로 사용
        VoidFI voidFI = new VoidFI() {
            @Override
            public void greeting() {
                System.out.println("Hello java!");
            }
        };

        voidFI.greeting();
        System.out.println(voidFI.toString());
        System.out.println(voidFI.equals(voidFI));

        // 람다 표현식 사용
        System.out.println("\n=== 람다 표현식 ===");
        VoidFI voidFI1 = () -> System.out.println("Hello FI!!");
        voidFI1.greeting();
        voidFI1 = () -> {
            System.out.println("Hello Lambda");
        };
        voidFI1.greeting();

        ReturnStringFI returnStringFI = (s) -> "Hello " + s;
        System.out.println(returnStringFI.greeting("bbubbush"));
        System.out.println(returnStringFI.greeting("Functional interface"));

        // 함수 밖의 값을 변경하지 않는다.
        System.out.println("\n=== 함수 밖 변수 변경 시도 ===");
        String greeting = "hello ";
        VoidFI voidFI2 = () -> {
//            greeting = "Hello";     // Variable used in lambda expression should be final or effectively final 메세지와 함께 컴파일 오류
            System.out.println(greeting + "bbubbush!"); // 사용은 가능하다. effective final로 보기 때문
        };
        voidFI2.greeting();

        // Pure function (순수 함수)
        System.out.println("\n=== 순수 함수 ===");
        String userId = "bbubbush";
        VoidFI voidFI3 = () -> {
            System.out.println("Hello " + userId); // 문법상 오류는 아니지만 함수 외부의 상태를 참조하므로 순수 함수라고 할 수 없다.
        };

        voidFI3 = new VoidFI() {
            String defaultUserId = "java";
            @Override
            public void greeting() {
                System.out.println("Hello " + defaultUserId); // 이 경우도 함수 밖의 값을 참조하므로 순수 함수가 아니다.
            }
        };

        voidFI3 = () -> {
            String defaultUserId = "java";
            System.out.println("Hello " + defaultUserId); // 함수 외부의 상태를 참조하지 않으므로 순수 함수이다.
        };
        voidFI3.greeting();
    }
}
