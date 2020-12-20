package com.tistory.bbubbush.defaultfi;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AppRunner {
    public static void main(String[] args) {
        // 자바에서 제공하는 함수형 인터페이스
        System.out.println("\n=== Function ===");   // 하나의 파라미터와 리턴 타입을 제네릭으로 정의하여 사용한다.
        Function<String, String> function = (param) -> param.toUpperCase();
        System.out.println(function.apply("hello java"));

        Function<String, Integer> function1 = (s) -> s.compareToIgnoreCase("B");
        System.out.println(function1.apply("A"));
        System.out.println(function1.apply("B"));
        System.out.println(function1.apply("C"));

        Function<Integer, Integer> function2 = (i) -> i * 2;
        System.out.println(function2.andThen(function2).apply(100));        // andThen을 통해 체이닝도 가능하다.

        System.out.println("\n=== BiFunction ===");   // 두 개의 파라미터와 리턴 타입을 제네릭으로 정의하여 사용한다.
        BiFunction<Integer, Integer, Integer> biFunction = (param1, param2) -> Integer.sum(param1, param2);
        System.out.println(biFunction.apply(10, 20));

        BiFunction<Integer, Integer, Integer> biFunction2 = (param1, param2) -> Integer.max(param1, param2);
        System.out.println(biFunction2.apply(10, 20));
        System.out.println(biFunction.andThen(function2).apply(10, 20));  // andThen을 통해 체이닝도 가능하다.
    }
}
