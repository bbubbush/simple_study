package collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.Timer;

@DisplayName(value = "Set 인터페이스 속도 테스트")
public class SetBehaviorTest {
    private final int SIZE = 1_000_000;

    @Test
    @DisplayName("HashSet의 속도 테스트 (삽입/전체조회/단일조회)")
    public void checkTimeToHashSet() {
        long addDataTime = Timer.checkMilliTime(() -> SetBehavior.addInHashSet(SIZE));
        System.out.println("add data in HashSet : " + addDataTime);

        long getDataTime = Timer.checkMilliTime(SetBehavior::getAllInHashSet);
        System.out.println("get all date in HashSet : " + getDataTime);

        long containsTime = Timer.checkMilliTime(() -> SetBehavior.containsInHashSet(String.valueOf(SIZE)));
        System.out.println("HashSet contains : " + containsTime);
    }

    @Test
    @DisplayName(value = "LinkedHashSet의 속도 테스트 (삽입/전체조회/단일조회)")
    public void checkTimeToLinkedHashSet() {
        long addDataTime = Timer.checkMilliTime(() -> SetBehavior.addInLinkedHashSet(SIZE));
        System.out.println("add data in LinkedHashSet : " + addDataTime);

        long getDataTime = Timer.checkMilliTime(SetBehavior::getAllInLinkedHashSet);
        System.out.println("get all date in LinkedHashSet : " + getDataTime);

        long containsTime = Timer.checkMilliTime(() -> SetBehavior.containsInLinkedHashSet(String.valueOf(SIZE)));
        System.out.println("LinkedHashSet contains : " + containsTime);
    }

    @Test
    @DisplayName(value = "TreeSet의 속도 테스트 (삽입/전체조회/단일조회)")
    public void checkTimeToTreeSet() {
        long addDataTime = Timer.checkMilliTime(() -> SetBehavior.addInTreeSet(SIZE));
        System.out.println("add data in TreeSet : " + addDataTime);

        long getDataTime = Timer.checkMilliTime(SetBehavior::getAllInTreeSet);
        System.out.println("get all date in TreeSet : " + getDataTime);

        long containsTime = Timer.checkMilliTime(() -> SetBehavior.containsInTreeSet(String.valueOf(SIZE)));
        System.out.println("TreeSet contains : " + containsTime);
    }

    @Test
    public void test() {
        // given
        System.out.println(1 << 30);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(1 << 31 - 1);
        System.out.println(1 << 1);
        System.out.println(1 << 2);
        // when

        // then

    }
}