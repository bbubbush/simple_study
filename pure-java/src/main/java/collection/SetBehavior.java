package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class SetBehavior {
    private final static Set<Integer> hashSet = new HashSet<>();
    private final static Set<Integer> linkedHashSet = new LinkedHashSet<>();
    private final static Set<Integer> treeSet = new TreeSet<>();
    
    public static void addInHashSet(final int size) {
        IntStream.range(0, size)
                .forEach(hashSet::add);
    }
    public static void addInLinkedHashSet(final int size) {
        IntStream.range(0, size)
                .forEach(linkedHashSet::add);
    }
    public static void addInTreeSet(final int size) {
        IntStream.range(0, size)
                .forEach(treeSet::add);
    }

    public static void getAllInHashSet() {
        hashSet.forEach(hashSet::contains);
    }
    public static void getAllInLinkedHashSet() {
        linkedHashSet.forEach(linkedHashSet::contains);
    }
    public static void getAllInTreeSet() {
        treeSet.forEach(treeSet::contains);
    }

    public static void removeAllInHashSet() {
        hashSet.removeIf(value -> value > 0);
    }
    public static void removeAllInLinkedHashSet() {
        linkedHashSet.removeIf(value -> value > 0);
    }
    public static void removeAllInTreeSet() {
        treeSet.removeIf(value -> value > 0);
    }
}
