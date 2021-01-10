package collection;

import java.util.*;
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
        hashSet.forEach(s -> {});
    }
    public static void getAllInLinkedHashSet() {
        linkedHashSet.forEach(s -> {});
    }
    public static void getAllInTreeSet() {
        treeSet.forEach(s -> {});
    }

    public static void containsInHashSet(String value) { hashSet.contains(value); }
    public static void containsInLinkedHashSet(String value) { linkedHashSet.contains(value); }
    public static void containsInTreeSet(String value) { treeSet.contains(value); }
}
