package com.tistory.bbubbush.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppRunner {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api", false));

        System.out.println("spring으로 시작하는 수업");
        springClasses.stream()
                .filter(onlineClass -> onlineClass.getName().startsWith("spring"))
                .forEach(onlineClass -> System.out.println(onlineClass.getName()));

        System.out.println("\nclose 되지 않은 수업");
        springClasses.stream()
                .filter(onlineClass -> onlineClass.isClosed())
                .forEach(onlineClass -> System.out.println(onlineClass.getName()));

        System.out.println("\n수업이름만 모아서 스트림 만들기");
        springClasses.stream()
                .map(onlineClass -> onlineClass.getName())
                .forEach(System.out::println);

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6, "The Java, Test", true));
        javaClasses.add(new OnlineClass(7, "The Java, Code manipulation", true));
        javaClasses.add(new OnlineClass(8, "The Java, 8 to 11", false));

        List<List<OnlineClass>> bbubbush = new ArrayList<>();
        bbubbush.add(springClasses);
        bbubbush.add(javaClasses);

        System.out.println("\n두 수업에 있는 모든 수업 ID 출력");
        bbubbush.stream()
                .flatMap(onlineClasses -> onlineClasses.stream()
                        .map(onlineClass -> onlineClass.getId()))
                .forEach(System.out::println);

        bbubbush.stream()
                .flatMap(Collection::stream)
                .map(onlineClass -> onlineClass.getId())
                .forEach(System.out::println);

        System.out.println("\n10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
        Stream.iterate(10, i -> i + 1)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("\n자바 수업중에 Test가 들어간 수업이 있는지 확인");
        boolean hasTestKeyword = javaClasses.stream().anyMatch(onlineClass -> onlineClass.getName().contains("Test"));
        System.out.println("hasTestKeyword :: " + hasTestKeyword);

        System.out.println("\nspring 수업 중 제목에 spring이 들어가는 것 만 모아서 List로 반환");
        List<String> hasSpringClass = springClasses.stream()
                .filter(oc -> oc.getName().contains("spring"))
                .map(oc -> oc.getName())
                .collect(Collectors.toList());
        hasSpringClass.forEach(System.out::println);
    }
}


class OnlineClass {
    private Integer id;
    private String name;
    private boolean isClosed;

    public OnlineClass(Integer id, String name, boolean isClosed) {
        this.id = id;
        this.name = name;
        this.isClosed = isClosed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
}