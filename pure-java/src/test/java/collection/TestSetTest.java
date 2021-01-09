package collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.Timer;

@DisplayName(value = "Set 인터페이스 속도 테스트")
public class TestSetTest {
    private final int SIZE = 1_000_000;

    @Test
    @DisplayName("HashSet의 속도 테스트 (삽입/조회/정렬)")
    public void checkTimeToHashSet() {
        long addDataTime = Timer.checkMilliTime(() -> SetBehavior.addInHashSet(SIZE));
        System.out.println("add data in HashSet : " + addDataTime);

        long getDataTime = Timer.checkMilliTime(SetBehavior::getAllInHashSet);
        System.out.println("get all date in HashSet : " + getDataTime);

        long sortedTime = Timer.checkMilliTime(SetBehavior::hashSetSorted);
        System.out.println("HashSet sort : " + sortedTime);
    }

    @Test
    @DisplayName(value = "LinkedHashSet의 속도 테스트 (삽입/조회/정렬)")
    public void checkTimeToLinkedHashSet() {
        long addDataTime = Timer.checkMilliTime(() -> SetBehavior.addInLinkedHashSet(SIZE));
        System.out.println("add data in LinkedHashSet : " + addDataTime);

        long getDataTime = Timer.checkMilliTime(SetBehavior::getAllInLinkedHashSet);
        System.out.println("get all date in LinkedHashSet : " + getDataTime);

        long sortedTime = Timer.checkMilliTime(SetBehavior::linkedHashSetSorted);
        System.out.println("LinkedHashSet sort : " + sortedTime);
    }

    @Test
    @DisplayName(value = "TreeSet의 속도 테스트 (삽입/조회/정렬)")
    public void checkTimeToTreeSet() {
        long addDataTime = Timer.checkMilliTime(() -> SetBehavior.addInTreeSet(SIZE));
        System.out.println("add data in TreeSet : " + addDataTime);

        long getDataTime = Timer.checkMilliTime(SetBehavior::getAllInTreeSet);
        System.out.println("get all date in TreeSet : " + getDataTime);

        long sortedTime = Timer.checkMilliTime(SetBehavior::treeSetSorted);
        System.out.println("TreeSet sort : " + sortedTime);
    }


}