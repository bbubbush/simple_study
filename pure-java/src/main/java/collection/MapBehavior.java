package collection;

import java.util.*;
import java.util.stream.IntStream;

public class MapBehavior {
    private final static Map<Integer, String> hashMap = new HashMap<>();
    private final static Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
    private final static Map<Integer, String> treeMap = new TreeMap<>();

    public static void addInHashMap(final int size) {
        IntStream.range(0, size)
                .forEach(value -> hashMap.put(value, String.valueOf(value)));
    }
    public static void addInLinkedHashMap(final int size) {
        IntStream.range(0, size)
                .forEach(value -> linkedHashMap.put(value, String.valueOf(value)));
    }
    public static void addInTreeMap(final int size) {
        IntStream.range(0, size)
                .forEach(value -> treeMap.put(value, String.valueOf(value)));
    }

    public static void getAllInHashMap() {
        hashMap.forEach((k, v) -> {});
    }
    public static void getAllInLinkedHashMap() {
        linkedHashMap.forEach((k, v) -> {});
    }
    public static void getAllInTreeMap() {
        treeMap.forEach((k, v) -> {});
    }

    public static void containsInHashMap(String value) { hashMap.containsKey(value); }
    public static void containsInLinkedHashMap(String value) { linkedHashMap.containsKey(value); }
    public static void containsInTreeMap(String value) { treeMap.containsKey(value); }
}
