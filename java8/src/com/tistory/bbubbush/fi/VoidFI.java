package com.tistory.bbubbush.fi;

@FunctionalInterface
public interface VoidFI {
    // 단 하나의 추상 메서드
    void greeting();

    // toString과 equals는 Obejct의 메서드 시그니처를 그대로 사용하기 때문에 오버라이드로 판단되어 추상메서드로 간주하지 않는다.
    String toString();
    boolean equals(Object object);

}
