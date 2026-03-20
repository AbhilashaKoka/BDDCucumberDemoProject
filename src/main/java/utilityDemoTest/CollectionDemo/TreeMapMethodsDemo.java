package utilityDemoTest.CollectionDemo;

import java.util.*;

public class TreeMapMethodsDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        // 1. put() - add key-value pairs
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);
        System.out.println("After put: " + map);

        // 2. putIfAbsent() - add only if key not present
        map.putIfAbsent("Rust", 4);
        map.putIfAbsent("Java", 10); // ignored since Java already exists
        System.out.println("After putIfAbsent: " + map);

        // 3. get() / getOrDefault()
        System.out.println("Get Python: " + map.get("Python"));
        System.out.println("GetOrDefault Go: " + map.getOrDefault("Go", -1));

        // 4. containsKey() / containsValue()
        System.out.println("ContainsKey Java? " + map.containsKey("Java"));
        System.out.println("ContainsValue 3? " + map.containsValue(3));

        // 5. firstKey() / lastKey()
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // 6. higherKey() / lowerKey()
        System.out.println("Higher than 'Java': " + map.higherKey("Java"));
        System.out.println("Lower than 'Java': " + map.lowerKey("Java"));

        // 7. ceilingKey() / floorKey()
        System.out.println("Ceiling of 'J': " + map.ceilingKey("J"));
        System.out.println("Floor of 'J': " + map.floorKey("J"));

        // 8. headMap(), tailMap(), subMap()
        System.out.println("HeadMap(<Python): " + map.headMap("Python"));
        System.out.println("TailMap(>=Python): " + map.tailMap("Python"));
        System.out.println("SubMap(Java to Rust): " + map.subMap("Java", "Rust"));

        // 9. remove() / replace()
        map.remove("C++");
        map.replace("Python", 20);
        System.out.println("After remove & replace: " + map);

        // 10. keySet(), values(), entrySet()
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        // 11. forEach() - iterate with lambda
        System.out.print("Iterating with forEach: ");
        map.forEach((k, v) -> System.out.print(k + "=" + v + " "));
        System.out.println();

        // 12. size() / isEmpty()
        System.out.println("Size: " + map.size());
        System.out.println("Is empty? " + map.isEmpty());

        // 13. clear()
        map.clear();
        System.out.println("After clear: " + map);
    }
}
