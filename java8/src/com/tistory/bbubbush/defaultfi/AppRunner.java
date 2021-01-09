package com.tistory.bbubbush.defaultfi;

import java.util.function.*;

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



        System.out.println("\n=== Consumer ===");   // 하나의 파라미터를 정의하고 리턴타입이 없다.
        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());
        consumer.accept("bbubbush");



        System.out.println("\n=== Supplier ===");   // 파라미터 없이 리턴타입만 정의한다.
        Supplier<Integer> supplier = () -> Integer.MAX_VALUE;
        System.out.println(supplier.get());



        System.out.println("\n=== Predicate ===");   // 하나의 파라티머 타입을 정의하여 boolean 값을 리턴한다.
        Predicate<String> predicate = (s -> s.contains("b"));
        System.out.println(predicate.test("bbubbush"));
        System.out.println(predicate.negate().test("bbubbush"));
        System.out.println(predicate.or((str) -> str.contains("a")).test("ccuccush"));



        System.out.println("\n=== UnaryOperator ===");   // Function의 확장된 함수로 하나의 파라미터와 리턴타입이 같은 경우 사용한다.
        UnaryOperator<Integer> unaryOperator = (i) -> Integer.sum(i, 10);
        System.out.println(unaryOperator.apply(100));



        System.out.println("\n=== UnaryOperator ===");   // BiFunction의 확장된 함수로 두 개의 파라미터와 리턴타입이 같은 경우 사용한다.
        BinaryOperator<Integer> binaryOperator = Integer::sum;
        System.out.println(binaryOperator.apply(100, 200));
    }
}
