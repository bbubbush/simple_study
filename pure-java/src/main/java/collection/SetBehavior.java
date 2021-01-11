package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class SetBehavior {
    private final static Set<String> hashSet = new HashSet<>();
    private final static Set<String> linkedHashSet = new LinkedHashSet<>();
    private final static Set<String> treeSet = new TreeSet<>();
    
    public static void addInHashSet(final int size) {
        IntStream.range(0, size)
                .forEach(value -> hashSet.add(String.valueOf(value)));
    }
    public static void addInLinkedHashSet(final int size) {
        IntStream.range(0, size)
                .forEach(value -> linkedHashSet.add(String.valueOf(value)));
    }
    public static void addInTreeSet(final int size) {
        IntStream.range(0, size)
                .forEach(value -> treeSet.add(String.valueOf(value)));
    }

    public static void getAllInHashSet() {
        hashSet.forEach(value -> hashSet.contains(value));
    }
    public static void getAllInLinkedHashSet() {
        linkedHashSet.forEach(value -> linkedHashSet.contains(value));
    }
    public static void getAllInTreeSet() {
        treeSet.forEach(value -> treeSet.contains(value));
    }

    public static void removeAllInHashSet() {
        hashSet.removeIf(value -> !value.isEmpty());
    }
    public static void removeAllInLinkedHashSet() {
        linkedHashSet.removeIf(value -> !value.isEmpty());
    }
    public static void removeAllInTreeSet() {
        treeSet.removeIf(value -> !value.isEmpty());
    }
}
